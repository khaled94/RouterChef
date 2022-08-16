package ca;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public static final Charset f2829a = Charset.forName("UTF-8");

    public static void a(long j3, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j3 || j3 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j3), Long.valueOf(j10), Long.valueOf(j11)));
        }
    }
}
