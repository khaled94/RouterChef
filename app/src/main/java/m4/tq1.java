package m4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tq1 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    public static final tq1 f14155f = new tq1();

    /* renamed from: a */
    public Context f14156a;

    /* renamed from: b */
    public sq1 f14157b;

    /* renamed from: c */
    public boolean f14158c;

    /* renamed from: d */
    public boolean f14159d;

    /* renamed from: e */
    public xq1 f14160e;

    public static void a(tq1 tq1Var, boolean z10) {
        if (tq1Var.f14159d != z10) {
            tq1Var.f14159d = z10;
            if (!tq1Var.f14158c) {
                return;
            }
            tq1Var.b();
            if (tq1Var.f14160e == null) {
                return;
            }
            if (!tq1Var.f14159d) {
                nr1.f11899f.b();
                return;
            }
            Objects.requireNonNull(nr1.f11899f);
            Handler handler = nr1.f11901h;
            if (handler == null) {
                return;
            }
            handler.removeCallbacks(nr1.f11903j);
            nr1.f11901h = null;
        }
    }

    public final void b() {
        boolean z10 = this.f14159d;
        for (jq1 jq1Var : rq1.f13418c.b()) {
            br1 br1Var = jq1Var.f10163d;
            if (((wr1) br1Var.f6606c).get() != null) {
                wq1.f15090a.a(br1Var.a(), "setState", true != z10 ? "foregrounded" : "backgrounded");
            }
        }
    }
}
