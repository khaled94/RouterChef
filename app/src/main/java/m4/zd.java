package m4;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class zd implements yd {
    @Override // m4.yd
    public final MediaCodecInfo I(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // m4.yd
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // m4.yd
    public final boolean g() {
        return false;
    }

    @Override // m4.yd
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
