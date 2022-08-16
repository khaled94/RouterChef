package m4;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jq1 extends fq1 {

    /* renamed from: h */
    public static final Pattern f10159h = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final hq1 f10160a;

    /* renamed from: d */
    public br1 f10163d;

    /* renamed from: b */
    public final List<uq1> f10161b = new ArrayList();

    /* renamed from: e */
    public boolean f10164e = false;

    /* renamed from: f */
    public boolean f10165f = false;

    /* renamed from: g */
    public final String f10166g = UUID.randomUUID().toString();

    /* renamed from: c */
    public ur1 f10162c = new ur1(null);

    public jq1(gq1 gq1Var, hq1 hq1Var) {
        br1 br1Var;
        Object obj;
        String str;
        this.f10160a = hq1Var;
        iq1 iq1Var = hq1Var.f9416g;
        if (iq1Var != iq1.HTML && iq1Var != iq1.JAVASCRIPT) {
            br1Var = new dr1(Collections.unmodifiableMap(hq1Var.f9413d));
        } else {
            br1Var = new cr1(hq1Var.f9411b);
        }
        this.f10163d = br1Var;
        br1Var.f();
        rq1.f13418c.f13419a.add(this);
        br1 br1Var2 = this.f10163d;
        wq1 wq1Var = wq1.f15090a;
        WebView a10 = br1Var2.a();
        JSONObject jSONObject = new JSONObject();
        er1.c(jSONObject, "impressionOwner", gq1Var.f9000a);
        if (gq1Var.f9003d != null) {
            er1.c(jSONObject, "mediaEventsOwner", gq1Var.f9001b);
            er1.c(jSONObject, "creativeType", gq1Var.f9002c);
            obj = gq1Var.f9003d;
            str = "impressionType";
        } else {
            obj = gq1Var.f9001b;
            str = "videoEventsOwner";
        }
        er1.c(jSONObject, str, obj);
        er1.c(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        wq1Var.a(a10, "init", jSONObject);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<m4.uq1>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<m4.uq1>, java.util.ArrayList] */
    @Override // m4.fq1
    public final void a(View view) {
        uq1 uq1Var;
        if (!this.f10165f) {
            if (!f10159h.matcher("Ad overlay").matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
            Iterator it = this.f10161b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uq1Var = null;
                    break;
                }
                uq1Var = (uq1) it.next();
                if (uq1Var.f14475a.get() == view) {
                    break;
                }
            }
            if (uq1Var != null) {
                return;
            }
            this.f10161b.add(new uq1(view));
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List<m4.uq1>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<m4.mr1>, java.util.ArrayList] */
    @Override // m4.fq1
    public final void b() {
        sq1 sq1Var;
        if (this.f10165f) {
            return;
        }
        this.f10162c.clear();
        if (!this.f10165f) {
            this.f10161b.clear();
        }
        this.f10165f = true;
        wq1.f15090a.a(this.f10163d.a(), "finishSession", new Object[0]);
        rq1 rq1Var = rq1.f13418c;
        boolean c10 = rq1Var.c();
        rq1Var.f13419a.remove(this);
        rq1Var.f13420b.remove(this);
        if (c10 && !rq1Var.c()) {
            xq1 a10 = xq1.a();
            Objects.requireNonNull(a10);
            nr1 nr1Var = nr1.f11899f;
            Objects.requireNonNull(nr1Var);
            Handler handler = nr1.f11901h;
            if (handler != null) {
                handler.removeCallbacks(nr1.f11903j);
                nr1.f11901h = null;
            }
            nr1Var.f11904a.clear();
            nr1.f11900g.post(new ir1(nr1Var, 0));
            tq1 tq1Var = tq1.f14155f;
            Context context = tq1Var.f14156a;
            if (context != null && (sq1Var = tq1Var.f14157b) != null) {
                context.unregisterReceiver(sq1Var);
                tq1Var.f14157b = null;
            }
            tq1Var.f14158c = false;
            tq1Var.f14159d = false;
            tq1Var.f14160e = null;
            qq1 qq1Var = a10.f15453b;
            qq1Var.f12973a.getContentResolver().unregisterContentObserver(qq1Var);
        }
        this.f10163d.b();
        this.f10163d = null;
    }

    @Override // m4.fq1
    public final void c(View view) {
        if (!this.f10165f && e() != view) {
            this.f10162c = new ur1(view);
            br1 br1Var = this.f10163d;
            Objects.requireNonNull(br1Var);
            br1Var.f6605b = System.nanoTime();
            br1Var.f6604a = 1;
            Collection<jq1> b10 = rq1.f13418c.b();
            if (b10 == null || b10.size() <= 0) {
                return;
            }
            for (jq1 jq1Var : b10) {
                if (jq1Var != this && jq1Var.e() == view) {
                    jq1Var.f10162c.clear();
                }
            }
        }
    }

    @Override // m4.fq1
    public final void d() {
        if (this.f10164e) {
            return;
        }
        this.f10164e = true;
        rq1 rq1Var = rq1.f13418c;
        boolean c10 = rq1Var.c();
        rq1Var.f13420b.add(this);
        if (!c10) {
            xq1 a10 = xq1.a();
            Objects.requireNonNull(a10);
            tq1 tq1Var = tq1.f14155f;
            tq1Var.f14160e = a10;
            tq1Var.f14157b = new sq1();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            tq1Var.f14156a.registerReceiver(tq1Var.f14157b, intentFilter);
            tq1Var.f14158c = true;
            tq1Var.b();
            if (!tq1Var.f14159d) {
                nr1.f11899f.b();
            }
            qq1 qq1Var = a10.f15453b;
            qq1Var.f12975c = qq1Var.a();
            qq1Var.b();
            qq1Var.f12973a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, qq1Var);
        }
        this.f10163d.e(xq1.a().f15452a);
        this.f10163d.c(this, this.f10160a);
    }

    public final View e() {
        return this.f10162c.get();
    }
}
