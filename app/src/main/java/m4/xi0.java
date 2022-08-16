package m4;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class xi0 {

    /* renamed from: a */
    public byte[] f15361a;

    /* renamed from: b */
    public byte[] f15362b;

    /* renamed from: c */
    public int f15363c;

    /* renamed from: d */
    public int[] f15364d;

    /* renamed from: e */
    public int[] f15365e;

    /* renamed from: f */
    public int f15366f;

    /* renamed from: g */
    public int f15367g;

    /* renamed from: h */
    public int f15368h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f15369i;

    /* renamed from: j */
    public final ci0 f15370j;

    public xi0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f15369i = cryptoInfo;
        this.f15370j = ls1.f10971a >= 24 ? new ci0(cryptoInfo) : null;
    }
}
