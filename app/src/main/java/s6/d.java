package s6;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final AtomicLong f18237a = new AtomicLong(0);

    /* renamed from: b */
    public static String f18238b;

    public d(d0 d0Var) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a10 = a(time % 1000);
        byte[] a11 = a(f18237a.incrementAndGet());
        byte[] a12 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a10[0], a10[1], a11[0], a11[1], a12[0], a12[1]};
        String m10 = e.m(d0Var.c());
        String j3 = e.j(bArr);
        Locale locale = Locale.US;
        f18238b = String.format(locale, "%s%s%s%s", j3.substring(0, 12), j3.substring(12, 16), j3.subSequence(16, 20), m10.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j3) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j3);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return f18238b;
    }
}
