package m4;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes.dex */
public final class ae implements yd {

    /* renamed from: a */
    public final int f6125a;

    /* renamed from: b */
    public MediaCodecInfo[] f6126b;

    public ae(boolean z10) {
        this.f6125a = z10 ? 1 : 0;
    }

    @Override // m4.yd
    public final MediaCodecInfo I(int i10) {
        if (this.f6126b == null) {
            this.f6126b = new MediaCodecList(this.f6125a).getCodecInfos();
        }
        return this.f6126b[i10];
    }

    @Override // m4.yd
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // m4.yd
    public final boolean g() {
        return true;
    }

    @Override // m4.yd
    public final int zza() {
        if (this.f6126b == null) {
            this.f6126b = new MediaCodecList(this.f6125a).getCodecInfos();
        }
        return this.f6126b.length;
    }
}
