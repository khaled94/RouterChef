package m4;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class h22 {

    /* renamed from: b */
    public static final h22 f9088b = new h22();

    /* renamed from: a */
    public AudioAttributes f9089a;

    public final AudioAttributes a() {
        if (this.f9089a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (ls1.f10971a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f9089a = usage.build();
        }
        return this.f9089a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h22.class != obj.getClass()) {
            return false;
        }
        h22 h22Var = (h22) obj;
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
