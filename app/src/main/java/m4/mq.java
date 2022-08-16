package m4;

import java.io.IOException;

/* loaded from: classes.dex */
public class mq extends IOException {

    /* renamed from: s */
    public final boolean f11272s;

    /* renamed from: t */
    public final int f11273t;

    public mq(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f11272s = z10;
        this.f11273t = i10;
    }

    public static mq a(String str, Throwable th) {
        return new mq(str, th, true, 1);
    }

    public static mq b(String str) {
        return new mq(str, null, false, 1);
    }
}
