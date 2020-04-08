package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;
import org.apache.commons.net.nntp.NNTP;
import org.apache.http.HttpStatus;

public class MLSxEntryParser extends FTPFileEntryParserImpl {
    private static final MLSxEntryParser PARSER = new MLSxEntryParser();
    private static final HashMap<String, Integer> TYPE_TO_INT;
    private static int[] UNIX_GROUPS = {0, 1, 2};
    private static int[][] UNIX_PERMS = {new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TYPE_TO_INT = hashMap;
        hashMap.put("file", Integer.valueOf(0));
        TYPE_TO_INT.put("cdir", Integer.valueOf(1));
        TYPE_TO_INT.put("pdir", Integer.valueOf(1));
        TYPE_TO_INT.put("dir", Integer.valueOf(1));
    }

    public FTPFile parseFTPEntry(String str) {
        SimpleDateFormat simpleDateFormat;
        String[] split = str.split(" ", 2);
        if (split.length != 2) {
            return null;
        }
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        fTPFile.setName(split[1]);
        String[] split2 = split[0].split(";");
        boolean contains = split[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
        for (String split3 : split2) {
            String[] split4 = split3.split("=");
            if (split4.length == 2) {
                String lowerCase = split4[0].toLowerCase(Locale.ENGLISH);
                String str2 = split4[1];
                String lowerCase2 = str2.toLowerCase(Locale.ENGLISH);
                if ("size".equals(lowerCase)) {
                    fTPFile.setSize(Long.parseLong(str2));
                } else if ("sizd".equals(lowerCase)) {
                    fTPFile.setSize(Long.parseLong(str2));
                } else if ("modify".equals(lowerCase)) {
                    if (str2.contains(".")) {
                        simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
                    } else {
                        simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                    }
                    TimeZone timeZone = TimeZone.getTimeZone("GMT");
                    simpleDateFormat.setTimeZone(timeZone);
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                    try {
                        gregorianCalendar.setTime(simpleDateFormat.parse(str2));
                    } catch (ParseException unused) {
                    }
                    fTPFile.setTimestamp(gregorianCalendar);
                } else if ("type".equals(lowerCase)) {
                    Integer num = (Integer) TYPE_TO_INT.get(lowerCase2);
                    if (num == null) {
                        fTPFile.setType(3);
                    } else {
                        fTPFile.setType(num.intValue());
                    }
                } else if (lowerCase.startsWith("unix.")) {
                    String lowerCase3 = lowerCase.substring(5).toLowerCase(Locale.ENGLISH);
                    if ("group".equals(lowerCase3)) {
                        fTPFile.setGroup(str2);
                    } else if ("owner".equals(lowerCase3)) {
                        fTPFile.setUser(str2);
                    } else if ("mode".equals(lowerCase3)) {
                        int length = str2.length() - 3;
                        for (int i = 0; i < 3; i++) {
                            int charAt = str2.charAt(length + i) - '0';
                            if (charAt >= 0 && charAt <= 7) {
                                for (int permission : UNIX_PERMS[charAt]) {
                                    fTPFile.setPermission(UNIX_GROUPS[i], permission, true);
                                }
                            }
                        }
                    }
                } else if (!contains && "perm".equals(lowerCase)) {
                    doUnixPerms(fTPFile, lowerCase2);
                }
            }
        }
        return fTPFile;
    }

    private void doUnixPerms(FTPFile fTPFile, String str) {
        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case 'c':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case 'd':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                    fTPFile.setPermission(0, 0, true);
                    break;
                case 'l':
                    fTPFile.setPermission(0, 2, true);
                    break;
                case 'm':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case 'p':
                    fTPFile.setPermission(0, 1, true);
                    break;
                case 'r':
                    fTPFile.setPermission(0, 0, true);
                    break;
                case NNTP.DEFAULT_PORT /*119*/:
                    fTPFile.setPermission(0, 1, true);
                    break;
            }
        }
    }

    public static FTPFile parseEntry(String str) {
        return PARSER.parseFTPEntry(str);
    }

    public static MLSxEntryParser getInstance() {
        return PARSER;
    }
}
