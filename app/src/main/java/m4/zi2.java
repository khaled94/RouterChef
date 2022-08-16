package m4;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class zi2 implements xi2 {

    /* renamed from: a */
    public final int f16242a;

    /* renamed from: b */
    public MediaCodecInfo[] f16243b;

    public zi2(boolean z10, boolean z11) {
        int i10 = 1;
        if (!z10 && !z11) {
            i10 = 0;
        }
        this.f16242a = i10;
    }

    @Override // m4.xi2
    public final MediaCodecInfo I(int i10) {
        if (this.f16243b == null) {
            this.f16243b = new MediaCodecList(this.f16242a).getCodecInfos();
        }
        return this.f16243b[i10];
    }

    @Override // m4.xi2
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // m4.xi2
    public final boolean b() {
        return true;
    }

    @Override // m4.xi2
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // m4.xi2
    public final int zza() {
        if (this.f16243b == null) {
            this.f16243b = new MediaCodecList(this.f16242a).getCodecInfos();
        }
        return this.f16243b.length;
    }
}
