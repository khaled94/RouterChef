package u0;

import java.nio.ByteBuffer;
import m4.g7;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    public int f18989a;

    /* renamed from: b */
    public ByteBuffer f18990b;

    /* renamed from: c */
    public int f18991c;

    /* renamed from: d */
    public int f18992d;

    public c() {
        if (g7.f8758u == null) {
            g7.f8758u = new g7();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f18992d) {
            return this.f18990b.getShort(this.f18991c + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f18990b = byteBuffer;
        if (byteBuffer != null) {
            this.f18989a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f18991c = i11;
            s10 = this.f18990b.getShort(i11);
        } else {
            s10 = 0;
            this.f18989a = 0;
            this.f18991c = 0;
        }
        this.f18992d = s10;
    }
}
