package m4;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class ci0 {

    /* renamed from: a */
    public final MediaCodec.CryptoInfo f6990a;

    /* renamed from: b */
    public final MediaCodec.CryptoInfo.Pattern f6991b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void a(ci0 ci0Var, int i10, int i11) {
        ci0Var.f6991b.set(i10, i11);
        ci0Var.f6990a.setPattern(ci0Var.f6991b);
    }
}
