package m4;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class az1 {

    /* renamed from: a */
    public final AudioManager f6301a;

    /* renamed from: b */
    public final bx1 f6302b;

    /* renamed from: c */
    public wx1 f6303c;

    /* renamed from: e */
    public float f6305e = 1.0f;

    /* renamed from: d */
    public int f6304d = 0;

    public az1(Context context, Handler handler, wx1 wx1Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f6301a = audioManager;
        this.f6303c = wx1Var;
        this.f6302b = new bx1(this, handler);
    }

    public final int a(boolean z10) {
        b();
        return z10 ? 1 : -1;
    }

    public final void b() {
        if (this.f6304d == 0) {
            return;
        }
        if (ls1.f10971a < 26) {
            this.f6301a.abandonAudioFocus(this.f6302b);
        }
        d(0);
    }

    public final void c(int i10) {
        wx1 wx1Var = this.f6303c;
        if (wx1Var != null) {
            jf2 jf2Var = (jf2) wx1Var;
            boolean o10 = jf2Var.f9956s.o();
            jf2Var.f9956s.t(o10, i10, lf2.p(o10, i10));
        }
    }

    public final void d(int i10) {
        if (this.f6304d == i10) {
            return;
        }
        this.f6304d = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f6305e == f10) {
            return;
        }
        this.f6305e = f10;
        wx1 wx1Var = this.f6303c;
        if (wx1Var == null) {
            return;
        }
        lf2 lf2Var = ((jf2) wx1Var).f9956s;
        lf2Var.r(1, 2, Float.valueOf(lf2Var.f10767s * lf2Var.f10758i.f6305e));
    }
}
