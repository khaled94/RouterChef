package m4;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class zb {

    /* renamed from: a */
    public byte[] f16075a;

    /* renamed from: b */
    public int[] f16076b;

    /* renamed from: c */
    public int[] f16077c;

    /* renamed from: d */
    public final MediaCodec.CryptoInfo f16078d;

    /* renamed from: e */
    public final yb f16079e;

    public zb() {
        int i10 = wg.f14958a;
        yb ybVar = null;
        MediaCodec.CryptoInfo cryptoInfo = i10 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f16078d = cryptoInfo;
        this.f16079e = i10 >= 24 ? new yb(cryptoInfo) : ybVar;
    }
}
