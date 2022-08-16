package m4;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* loaded from: classes.dex */
public final class yb {

    /* renamed from: a */
    public final MediaCodec.CryptoInfo f15640a;

    /* renamed from: b */
    public final MediaCodec.CryptoInfo.Pattern f15641b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void a(yb ybVar) {
        ybVar.f15641b.set(0, 0);
        ybVar.f15640a.setPattern(ybVar.f15641b);
    }
}
