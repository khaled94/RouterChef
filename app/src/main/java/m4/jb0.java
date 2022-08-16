package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* loaded from: classes.dex */
public final class jb0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final AudioManager f9891a;

    /* renamed from: b */
    public final ib0 f9892b;

    /* renamed from: c */
    public boolean f9893c;

    /* renamed from: d */
    public boolean f9894d;

    /* renamed from: e */
    public boolean f9895e;

    /* renamed from: f */
    public float f9896f = 1.0f;

    public jb0(Context context, ib0 ib0Var) {
        this.f9891a = (AudioManager) context.getSystemService("audio");
        this.f9892b = ib0Var;
    }

    public final void a() {
        this.f9894d = false;
        b();
    }

    public final void b() {
        boolean z10 = false;
        if (!this.f9894d || this.f9895e || this.f9896f <= 0.0f) {
            if (!this.f9893c) {
                return;
            }
            AudioManager audioManager = this.f9891a;
            if (audioManager != null) {
                if (audioManager.abandonAudioFocus(this) == 0) {
                    z10 = true;
                }
                this.f9893c = z10;
            }
            this.f9892b.j();
        } else if (this.f9893c) {
        } else {
            AudioManager audioManager2 = this.f9891a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z10 = true;
                }
                this.f9893c = z10;
            }
            this.f9892b.j();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f9893c = i10 > 0;
        this.f9892b.j();
    }
}
