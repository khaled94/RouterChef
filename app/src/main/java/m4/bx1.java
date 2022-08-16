package m4;

import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* loaded from: classes.dex */
public final class bx1 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final Handler f6642a;

    /* renamed from: b */
    public final /* synthetic */ az1 f6643b;

    public bx1(az1 az1Var, Handler handler) {
        this.f6643b = az1Var;
        this.f6642a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.f6642a.post(new Runnable() { // from class: m4.mw1
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                bx1 bx1Var = bx1.this;
                int i12 = i10;
                az1 az1Var = bx1Var.f6643b;
                if (i12 == -3 || i12 == -2) {
                    if (i12 != -2) {
                        i11 = 3;
                    } else {
                        az1Var.c(0);
                        i11 = 2;
                    }
                    az1Var.d(i11);
                } else if (i12 == -1) {
                    az1Var.c(-1);
                    az1Var.b();
                } else if (i12 == 1) {
                    az1Var.d(1);
                    az1Var.c(1);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown focus change type: ");
                    sb.append(i12);
                    Log.w("AudioFocusManager", sb.toString());
                }
            }
        });
    }
}
