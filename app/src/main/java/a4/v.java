package a4;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class v extends t {

    /* renamed from: v */
    public static final WeakReference<byte[]> f153v = new WeakReference<>(null);

    /* renamed from: u */
    public WeakReference<byte[]> f154u = f153v;

    public v(byte[] bArr) {
        super(bArr);
    }

    public abstract byte[] E1();

    @Override // a4.t
    public final byte[] e0() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f154u.get();
            if (bArr == null) {
                bArr = E1();
                this.f154u = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
