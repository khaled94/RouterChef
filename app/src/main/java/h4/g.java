package h4;

import android.os.Process;
import android.os.StrictMode;
import d4.m;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class g {
    @Nullable

    /* renamed from: a */
    public static String f5078a;

    /* renamed from: b */
    public static int f5079b;

    public static String a() {
        BufferedReader bufferedReader;
        Throwable th;
        if (f5078a == null) {
            int i10 = f5079b;
            if (i10 == 0) {
                i10 = Process.myPid();
                f5079b = i10;
            }
            String str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            str = null;
            if (i10 > 0) {
                try {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("/proc/");
                    sb.append(i10);
                    sb.append("/cmdline");
                    String sb2 = sb.toString();
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(sb2));
                        try {
                            String readLine = bufferedReader.readLine();
                            m.h(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            e.a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                e.a(bufferedReader);
            }
            f5078a = str;
        }
        return f5078a;
    }
}
