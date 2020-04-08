package p004o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeMap;

/* renamed from: o.pe */
public class C0653pe {

    /* renamed from: 櫯 */
    public static C0755st f4541;

    /* renamed from: o.pe$if */
    public enum C0654if {
        OVERWRITE,
        SKIP,
        RESUME,
        RETURN_NULL_IF_SAME_LASTMODIFIED
    }

    /* renamed from: o.pe$鷭 */
    public static class C0655 {

        /* renamed from: 櫯 */
        public C0614ol f4547;

        /* renamed from: 鷭 */
        long f4548;

        C0655() {
        }
    }

    /* renamed from: 鷭 */
    public static C0655 m798(String str, String str2, boolean z) {
        C0655 r3 = new C0655();
        String replace = str2.replace("\\", "/");
        File file = new File(str, replace);
        if (!file.exists() && replace.toLowerCase().startsWith("data/") && z) {
            file = new File(new StringBuilder(String.valueOf(str)).append("/ddata").toString(), replace);
        }
        if (!file.exists()) {
            return null;
        }
        r3.f4548 = file.length();
        try {
            r3.f4547 = new C0614ol(new FileInputStream(file));
            return r3;
        } catch (IOException e) {
            throw new C0822tr(e, "Caught" + e.toString() + " while reading " + replace + " from data folder to stream", false);
        }
    }

    /* renamed from: 櫯 */
    public static byte[] m793(String str, String str2, boolean z) {
        try {
            C0655 r6 = m798(str, str2, z);
            if (r6 == null) {
                return null;
            }
            int i = 0;
            int i2 = (int) r6.f4548;
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read = r6.f4547.f3001.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    break;
                }
                i += read;
            }
            C0614ol olVar = r6.f4547;
            olVar.f3001.close();
            olVar.f3001 = null;
            return bArr;
        } catch (IOException e) {
            throw new C0822tr(e, "Caught" + e.toString() + " while reading " + str2 + " from data folder", false);
        }
    }

    /* renamed from: 鷭 */
    private static byte[] m801(String str, String str2, boolean z, C0654if ifVar, C0813tl tlVar) {
        long j;
        File file = new File(str, str2);
        if (ifVar != C0654if.SKIP || !file.exists()) {
            C0624ov.m757();
            String replace = str2.replace("\\", "/");
            if (tlVar == null || tlVar.mo3956()) {
                if (ifVar == C0654if.RESUME) {
                    j = new File(str, new StringBuilder(String.valueOf(replace)).append(".tmp").toString()).length();
                } else {
                    j = 0;
                }
                if (tlVar != null) {
                    return tlVar.mo3958(replace, j, z);
                }
                throw new C0826tv("Trying to download resource while resource-server connection not provided");
            }
            long currentTimeMillis = System.currentTimeMillis() + 120000;
            while (System.currentTimeMillis() < currentTimeMillis && !tlVar.mo3956()) {
                try {
                    synchronized (Thread.currentThread()) {
                        Thread.currentThread().wait();
                    }
                } catch (InterruptedException unused) {
                }
            }
            throw new C0822tr("Failed to download resource: not connected to resource server", true);
        } else if (!z) {
            return null;
        } else {
            try {
                return C0622ot.m720(file.getAbsolutePath());
            } catch (FileNotFoundException e) {
                throw new C0827tw(e);
            } catch (IOException e2) {
                throw new C0827tw(e2);
            }
        }
    }

    /* renamed from: 鷭 */
    public static Object m796(String str, String str2, boolean z, C0813tl tlVar) {
        Object obj;
        if (!z) {
            obj = m793(str, str2, true);
            if (obj == null) {
                obj = m801(str, str2, true, C0654if.OVERWRITE, tlVar);
            }
        } else {
            C0655 r5 = m798(str, str2, true);
            obj = r5 == null ? null : r5.f4547;
            if (obj == null) {
                m801(str, str2, false, C0654if.OVERWRITE, tlVar);
                C0655 r52 = m798(str, str2, true);
                obj = r52 == null ? null : r52.f4547;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new C0825tu(null, str2, "Failed to load resource from file system");
    }

    /* renamed from: 鷭 */
    protected static C0614ol m797(C0785te teVar) {
        try {
            return C0835ua.m1531(teVar);
        } catch (IOException e) {
            throw new C0826tv((Exception) e);
        }
    }

    /* renamed from: 櫯 */
    protected static byte[] m794(C0785te teVar) {
        C0785te teVar2 = teVar;
        try {
            C0614ol r4 = teVar.mo4108();
            byte[] bArr = new byte[teVar2.f4795];
            r4.mo4038(bArr, bArr.length);
            r4.f3001.close();
            r4.f3001 = null;
            return bArr;
        } catch (IOException e) {
            throw new C0826tv("Error while reading resource: " + teVar.f4792 + " from GRF " + teVar.f4793.getName(), e);
        }
    }

    /* renamed from: 鷭 */
    public static void m799(String str, String str2, String str3, C0813tl tlVar) {
        String sb = new StringBuilder(String.valueOf(str)).append("/").append(str2).toString();
        File file = new File(sb);
        LinkedList linkedList = new LinkedList();
        C0623ou.m754(file, linkedList);
        LinkedList linkedList2 = linkedList;
        if (linkedList.size() != 0) {
            if (f4541.mo4084(new StringBuilder(String.valueOf(str)).append("/").append(str3).toString())) {
                C0624ov.m757();
                int size = linkedList2.size();
                int i = 0;
                while (true) {
                    File file2 = (File) linkedList2.poll();
                    if (file2 == null) {
                        break;
                    }
                    String absolutePath = file2.getAbsolutePath();
                    if (absolutePath == null) {
                        break;
                    } else if (!absolutePath.endsWith(".tmp")) {
                        byte[] r5 = m793(str, C0623ou.m752(file2, str), false);
                        if (r5 == null) {
                            throw new C0826tv();
                        }
                        String replace = absolutePath.substring(sb.length() + 1, absolutePath.length()).replace("/", "\\");
                        try {
                            if (f4541.mo4087(C0622ot.m750(replace, C0618op.KOREAN, true), r5) == 0) {
                                C0624ov.m759("Failed to append " + replace + " to GRF");
                                return;
                            } else {
                                i++;
                                tlVar.mo3957("Repacking resources (" + i + "/" + size + ")");
                            }
                        } catch (RuntimeException e) {
                            f4541.mo4088();
                            throw new C0822tr(e, "GRF Packer error: filename encoding problem: " + replace, false);
                        }
                    }
                }
                f4541.mo4088();
                C0624ov.m757();
                C0623ou.m753(new File(sb));
                C0624ov.m757();
            }
        }
    }

    /* renamed from: 鷭 */
    public static boolean m800(File file) {
        if (!file.exists() || !file.isDirectory() || !file.canRead()) {
            return false;
        }
        for (File name : file.listFiles()) {
            if (name.getName().toLowerCase().endsWith(".grf")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: 鷭 */
    public static String[] m802(File file, String str) {
        if (str == null) {
            str = "DATA.INI";
        }
        File file2 = new File(file.getAbsolutePath() + File.separator + str);
        File file3 = file2;
        if (file2.exists()) {
            return m795(file3);
        }
        String[] list = file.list(new C0656pf());
        Arrays.sort(list, new C0657pg());
        return list;
    }

    /* renamed from: 櫯 */
    private static String[] m795(File file) {
        try {
            TreeMap treeMap = new TreeMap();
            for (String split : new String(C0623ou.m755(file.getAbsolutePath())).split("\n")) {
                String trim = split.split(";")[0].trim();
                if (trim.length() > 0 && !trim.equalsIgnoreCase("[Data]")) {
                    String[] split2 = trim.split("=");
                    if (split2.length < 2) {
                        throw new C0822tr("Invalid DATA.INI format near: " + trim);
                    }
                    treeMap.put(Integer.valueOf(Integer.parseInt(split2[0])), split2[1].trim());
                }
            }
            String[] strArr = new String[0];
            String[] strArr2 = strArr;
            for (String str : treeMap.values()) {
                Object[] objArr = strArr2;
                Object[] objArr2 = objArr == 0 ? (Object[]) Array.newInstance(str.getClass(), 0) : objArr;
                Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
                copyOf[objArr2.length] = str;
                strArr2 = (String[]) copyOf;
            }
            return strArr2;
        } catch (IOException e) {
            throw new C0822tr(e, "Failed to read " + file.getAbsolutePath(), true);
        }
    }
}
