package m4;

import a6.f;
import android.os.Build;
import android.util.Pair;
import d.b;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m2.a;

/* loaded from: classes.dex */
public final class mz1 implements ar0 {

    /* renamed from: s */
    public static final /* synthetic */ mz1 f11366s = new mz1();

    /* renamed from: t */
    public static final byte[] f11367t = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: u */
    public static final byte[] f11368u = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    public static boolean b(String str) {
        return "audio".equals(d(str));
    }

    public static boolean c(String str) {
        return "video".equals(d(str));
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Invalid mime type: ".concat(str) : new String("Invalid mime type: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lz1 e(Iterable iterable) {
        pu1 pu1Var = gw1.f9058t;
        Objects.requireNonNull(iterable);
        return new lz1(true, gw1.q(iterable));
    }

    @SafeVarargs
    public static lz1 f(tz1... tz1VarArr) {
        pu1 pu1Var = gw1.f9058t;
        Object[] objArr = (Object[]) tz1VarArr.clone();
        int length = objArr.length;
        q40.f(objArr, length);
        return new lz1(true, gw1.p(objArr, length));
    }

    public static Pair g(RandomAccessFile randomAccessFile, int i10) {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        k(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i12 = capacity2 - 22;
            int min = Math.min(i12, 65535);
            for (int i13 = 0; i13 < min; i13++) {
                i11 = i12 - i13;
                if (allocate.getInt(i11) == 101010256 && ((char) allocate.getShort(i11 + 20)) == i13) {
                    break;
                }
            }
        }
        i11 = -1;
        if (i11 == -1) {
            return null;
        }
        allocate.position(i11);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i11));
    }

    public static tz1 i(tz1 tz1Var, Class cls, cu1 cu1Var, Executor executor) {
        yx1 yx1Var = new yx1(tz1Var, cls, cu1Var);
        tz1Var.b(yx1Var, a.w(executor, yx1Var));
        return yx1Var;
    }

    public static tz1 j(tz1 tz1Var, Class cls, xy1 xy1Var, Executor executor) {
        xx1 xx1Var = new xx1(tz1Var, cls, xy1Var);
        tz1Var.b(xx1Var, a.w(executor, xx1Var));
        return xx1Var;
    }

    public static void k(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    public static tz1 l(Throwable th) {
        Objects.requireNonNull(th);
        return new nz1(th);
    }

    public static tz1 m(Object obj) {
        return obj == null ? oz1.f12316t : new oz1(obj);
    }

    public static tz1 n(wy1 wy1Var, Executor executor) {
        g02 g02Var = new g02(wy1Var);
        executor.execute(g02Var);
        return g02Var;
    }

    public static tz1 o(tz1 tz1Var, cu1 cu1Var, Executor executor) {
        int i10 = qy1.B;
        Objects.requireNonNull(cu1Var);
        py1 py1Var = new py1(tz1Var, cu1Var);
        tz1Var.b(py1Var, a.w(executor, py1Var));
        return py1Var;
    }

    public static tz1 p(tz1 tz1Var, xy1 xy1Var, Executor executor) {
        int i10 = qy1.B;
        Objects.requireNonNull(executor);
        oy1 oy1Var = new oy1(tz1Var, xy1Var);
        tz1Var.b(oy1Var, a.w(executor, oy1Var));
        return oy1Var;
    }

    public static tz1 q(tz1 tz1Var, long j3, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (tz1Var.isDone()) {
            return tz1Var;
        }
        d02 d02Var = new d02(tz1Var);
        b02 b02Var = new b02(d02Var);
        d02Var.A = scheduledExecutorService.schedule(b02Var, j3, timeUnit);
        tz1Var.b(b02Var, dz1.f7671s);
        return d02Var;
    }

    public static Object r(Future future) {
        if (future.isDone()) {
            return b.d(future);
        }
        throw new IllegalStateException(q40.d("Future was expected to be done: %s", future));
    }

    public static Object s(Future future) {
        try {
            return b.d(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof Error)) {
                throw new h02(cause);
            }
            throw new ez1((Error) cause);
        }
    }

    public static void t(tz1 tz1Var, kz1 kz1Var, Executor executor) {
        Objects.requireNonNull(kz1Var);
        tz1Var.b(new mz(tz1Var, kz1Var, 3), executor);
    }

    public boolean a(File file) {
        Throwable e10;
        try {
            X509Certificate[][] b10 = q40.b(file.getAbsolutePath());
            if (b10.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(b10[0][0].getEncoded());
            if (Arrays.equals(f11367t, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(f11368u, digest);
        } catch (IOException e11) {
            e10 = e11;
            throw new GeneralSecurityException("Failed to verify signatures", e10);
        } catch (RuntimeException e12) {
            e10 = e12;
            throw new GeneralSecurityException("Failed to verify signatures", e10);
        } catch (m3 e13) {
            throw new GeneralSecurityException("Package is not signed", e13);
        }
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((bp0) obj).d0(f.n(11, null, null));
    }
}
