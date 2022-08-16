package m4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class gc0 {

    /* renamed from: a */
    public long f8821a;

    public final long a(ByteBuffer byteBuffer) {
        l5 l5Var;
        k5 k5Var;
        long j3 = this.f8821a;
        if (j3 > 0) {
            return j3;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<i5> it = new h5(new fc0(duplicate), ic0.f9583c).G().iterator();
            while (true) {
                l5Var = null;
                if (!it.hasNext()) {
                    k5Var = null;
                    break;
                }
                i5 next = it.next();
                if (next instanceof k5) {
                    k5Var = (k5) next;
                    break;
                }
            }
            Iterator<i5> it2 = k5Var.G().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                i5 next2 = it2.next();
                if (next2 instanceof l5) {
                    l5Var = (l5) next2;
                    break;
                }
            }
            long j10 = (l5Var.E * 1000) / l5Var.D;
            this.f8821a = j10;
            return j10;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
