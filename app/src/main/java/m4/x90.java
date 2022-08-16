package m4;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import m3.p;
import n3.g1;
import org.checkerframework.dataflow.qual.Pure;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class x90 implements jc, ar0 {

    /* renamed from: s */
    public static final /* synthetic */ x90 f15251s = new x90();

    public static double a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static final Future c(Context context, kj kjVar) {
        tj tjVar = new tj(context);
        nj njVar = new nj(tjVar);
        rj rjVar = new rj(tjVar, kjVar, njVar);
        sj sjVar = new sj(tjVar, njVar);
        synchronized (tjVar.f14080c) {
            jj jjVar = new jj(context, s.B.f5802q.a(), rjVar, sjVar);
            tjVar.f14078a = jjVar;
            jjVar.n();
        }
        return njVar;
    }

    public static void d(Context context, boolean z10) {
        String sb;
        if (z10) {
            sb = "This request is sent from a test device.";
        } else {
            g90 g90Var = io.f9708f.f9709a;
            String k10 = g90.k(context);
            StringBuilder sb2 = new StringBuilder(String.valueOf(k10).length() + 102);
            sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
            sb2.append(k10);
            sb2.append("\")) to get test ads on this device.");
            sb = sb2.toString();
        }
        g1.i(sb);
    }

    @Pure
    public static void e(String str, String str2, Throwable th) {
        Log.e(str, l(str2, th));
    }

    public static double f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static String g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void i(int i10, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i10);
        g1.i(sb.toString());
        g1.b(str, th);
        if (i10 == 3) {
            return;
        }
        s.B.f5793g.f(th, str);
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    @Pure
    public static void k(String str, String str2, Throwable th) {
        Log.w(str, l(str2, th));
    }

    @Pure
    public static String l(String str, Throwable th) {
        String str2;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    str2 = "UnknownHostException (no network)";
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            String valueOf = String.valueOf(str);
            String replace = str2.replace("\n", "\n  ");
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace).length());
            sb.append(valueOf);
            sb.append("\n  ");
            sb.append(replace);
            sb.append('\n');
            return sb.toString();
        }
        return str;
    }

    public static boolean n(CharSequence charSequence) {
        char charAt;
        char charAt2;
        char c10;
        if (charSequence == "content-length") {
            return true;
        }
        if (14 != charSequence.length()) {
            return false;
        }
        for (int i10 = 0; i10 < 14; i10++) {
            if ("content-length".charAt(i10) != charSequence.charAt(i10) && ((c10 = (char) ((charAt | ' ') - 97)) >= 26 || c10 != ((char) ((charAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static long o(ByteBuffer byteBuffer) {
        long j3 = byteBuffer.getInt();
        return j3 < 0 ? j3 + 4294967296L : j3;
    }

    public static long p(ByteBuffer byteBuffer) {
        long o10 = o(byteBuffer) << 32;
        if (o10 >= 0) {
            return o(byteBuffer) + o10;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((p) obj).Z1();
    }

    public ExecutorService m(ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // m4.jc, y4.d1
    /* renamed from: zza */
    public ic[] mo14zza() {
        return new ic[]{new jd()};
    }
}
