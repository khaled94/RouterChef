package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class kb0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10316s;

    /* renamed from: t */
    public final /* synthetic */ Object f10317t;

    public /* synthetic */ kb0(Object obj, int i10) {
        this.f10316s = i10;
        this.f10317t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10316s) {
            case 0:
                oa0 oa0Var = ((sb0) this.f10317t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ta0 ta0Var = (ta0) oa0Var;
                ta0Var.c("ended", new String[0]);
                ta0Var.b();
                return;
            default:
                Map<String, String> map = pk2.f12543c0;
                ((pk2) this.f10317t).x();
                return;
        }
    }
}
