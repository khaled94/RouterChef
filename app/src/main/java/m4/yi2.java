package m4;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class yi2 implements xi2 {
    @Override // m4.xi2
    public final MediaCodecInfo I(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // m4.xi2
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // m4.xi2
    public final boolean b() {
        return false;
    }

    @Override // m4.xi2
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // m4.xi2
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
