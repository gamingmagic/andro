package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import java.util.List;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

public class MVSFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    static final String DEFAULT_DATE_FORMAT = "yyyy/MM/dd HH:mm";
    static final String FILE_LIST_REGEX = "\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+[FV]\\S*\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*";
    static final int FILE_LIST_TYPE = 0;
    static final String JES_LEVEL_1_LIST_REGEX = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*";
    static final int JES_LEVEL_1_LIST_TYPE = 3;
    static final String JES_LEVEL_2_LIST_REGEX = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*";
    static final int JES_LEVEL_2_LIST_TYPE = 4;
    static final String MEMBER_LIST_REGEX = "(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*";
    static final int MEMBER_LIST_TYPE = 1;
    static final int UNIX_LIST_TYPE = 2;
    static final int UNKNOWN_LIST_TYPE = -1;
    private int isType = -1;
    private UnixFTPEntryParser unixFTPEntryParser;

    public MVSFTPEntryParser() {
        super("");
        super.configure(null);
    }

    public FTPFile parseFTPEntry(String str) {
        boolean z = false;
        FTPFile fTPFile = new FTPFile();
        if (this.isType == 0) {
            z = parseFileList(fTPFile, str);
        } else if (this.isType == 1) {
            z = parseMemberList(fTPFile, str);
            if (!z) {
                z = parseSimpleEntry(fTPFile, str);
            }
        } else if (this.isType == 2) {
            z = parseUnixList(fTPFile, str);
        } else if (this.isType == 3) {
            z = parseJeslevel1List(fTPFile, str);
        } else if (this.isType == 4) {
            z = parseJeslevel2List(fTPFile, str);
        }
        if (!z) {
            return null;
        }
        return fTPFile;
    }

    private boolean parseFileList(FTPFile fTPFile, String str) {
        if (!matches(str)) {
            return false;
        }
        fTPFile.setRawListing(str);
        String group = group(2);
        String group2 = group(1);
        fTPFile.setName(group);
        if ("PS".equals(group2)) {
            fTPFile.setType(0);
        } else if (!"PO".equals(group2) && !"PO-E".equals(group2)) {
            return false;
        } else {
            fTPFile.setType(1);
        }
        return true;
    }

    private boolean parseMemberList(FTPFile fTPFile, String str) {
        if (!matches(str)) {
            return false;
        }
        fTPFile.setRawListing(str);
        String group = group(1);
        String str2 = group(2) + " " + group(3);
        fTPFile.setName(group);
        fTPFile.setType(0);
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str2));
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean parseSimpleEntry(FTPFile fTPFile, String str) {
        if (str == null || str.trim().length() <= 0) {
            return false;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(str.split(" ")[0]);
        fTPFile.setType(0);
        return true;
    }

    private boolean parseUnixList(FTPFile fTPFile, String str) {
        if (this.unixFTPEntryParser.parseFTPEntry(str) == null) {
            return false;
        }
        return true;
    }

    private boolean parseJeslevel1List(FTPFile fTPFile, String str) {
        if (!matches(str) || !group(3).equalsIgnoreCase("OUTPUT")) {
            return false;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(group(2));
        fTPFile.setType(0);
        return true;
    }

    private boolean parseJeslevel2List(FTPFile fTPFile, String str) {
        if (!matches(str) || !group(4).equalsIgnoreCase("OUTPUT")) {
            return false;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(group(2));
        fTPFile.setType(0);
        return true;
    }

    public List<String> preParse(List<String> list) {
        if (list != null && list.size() > 0) {
            String str = (String) list.get(0);
            if (str.indexOf("Volume") >= 0 && str.indexOf("Dsname") >= 0) {
                setType(0);
                super.setRegex(FILE_LIST_REGEX);
            } else if (str.indexOf("Name") >= 0 && str.indexOf("Id") >= 0) {
                setType(1);
                super.setRegex(MEMBER_LIST_REGEX);
            } else if (str.indexOf("total") == 0) {
                setType(2);
                this.unixFTPEntryParser = new UnixFTPEntryParser();
            } else if (str.indexOf("Spool Files") >= 30) {
                setType(3);
                super.setRegex(JES_LEVEL_1_LIST_REGEX);
            } else if (str.indexOf("JOBNAME") != 0 || str.indexOf("JOBID") <= 8) {
                setType(-1);
            } else {
                setType(4);
                super.setRegex(JES_LEVEL_2_LIST_REGEX);
            }
            if (this.isType != 3) {
                list.remove(0);
            }
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    public void setType(int i) {
        this.isType = i;
    }

    /* access modifiers changed from: protected */
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_MVS, DEFAULT_DATE_FORMAT, null, null, null, null);
    }
}
