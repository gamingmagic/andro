package p004o;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

/* renamed from: o.ou */
public abstract class C0623ou {
    /* renamed from: 鷭 */
    public static String m752(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.startsWith(str)) {
            return file.getAbsolutePath().substring(str.length() + 1);
        }
        throw new IllegalArgumentException("get_relative_path: " + absolutePath + " is not in " + str + " directory");
    }

    /* renamed from: 鷭 */
    public static byte[] m755(String str) {
        try {
            return C0622ot.m720(str);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: 鷭 */
    public static void m753(File file) {
        if (file.isDirectory()) {
            for (File r0 : file.listFiles()) {
                m753(r0);
            }
        }
        file.delete();
    }

    /* renamed from: 鷭 */
    public static void m754(File file, LinkedList<File> linkedList) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                linkedList.add(file);
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                File[] fileArr = listFiles;
                int length = listFiles.length;
                for (int i = 0; i < length; i++) {
                    m754(fileArr[i], linkedList);
                }
            }
        }
    }
}
