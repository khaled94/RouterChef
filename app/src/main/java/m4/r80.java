package m4;

import a4.g;
import android.content.Context;
import i3.a;
import java.io.IOException;
import n3.g1;

/* loaded from: classes.dex */
public final class r80 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Context f13192s;

    /* renamed from: t */
    public final /* synthetic */ w90 f13193t;

    public r80(Context context, w90 w90Var) {
        this.f13192s = context;
        this.f13193t = w90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f13193t.a(a.b(this.f13192s));
        } catch (g | IOException | IllegalStateException e10) {
            this.f13193t.c(e10);
            g1.h("Exception while getting advertising Id info", e10);
        }
    }
}
