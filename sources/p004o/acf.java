package p004o;

import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: o.acf */
public abstract class acf<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    /* renamed from: 鷭 */
    static String m100(BufferedInputStream bufferedInputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream), 1024);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                try {
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
