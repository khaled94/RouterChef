package m4;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import androidx.fragment.app.b1;
import java.util.Objects;

@TargetApi(16)
/* loaded from: classes.dex */
public final class sd {

    /* renamed from: a */
    public final String f13594a;

    /* renamed from: b */
    public final boolean f13595b;

    /* renamed from: c */
    public final boolean f13596c;

    /* renamed from: d */
    public final boolean f13597d;

    /* renamed from: e */
    public final String f13598e;

    /* renamed from: f */
    public final MediaCodecInfo.CodecCapabilities f13599f;

    public sd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        Objects.requireNonNull(str);
        this.f13594a = str;
        this.f13598e = str2;
        this.f13599f = codecCapabilities;
        boolean z12 = true;
        this.f13595b = !z10 && codecCapabilities != null && wg.f14958a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f13596c = codecCapabilities != null && wg.f14958a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z11 && (codecCapabilities == null || wg.f14958a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z12 = false;
        }
        this.f13597d = z12;
    }

    @TargetApi(21)
    public static boolean b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d5) {
        return (d5 == -1.0d || d5 <= 0.0d) ? videoCapabilities.isSizeSupported(i10, i11) : videoCapabilities.areSizeAndRateSupported(i10, i11, d5);
    }

    public final void a(String str) {
        String str2 = this.f13594a;
        String str3 = this.f13598e;
        String str4 = wg.f14962e;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + length2 + String.valueOf(str4).length());
        b1.b(sb, "NoSupport [", str, "] [", str2);
        b1.b(sb, ", ", str3, "] [", str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }
}
