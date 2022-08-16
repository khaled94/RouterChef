package m4;

import android.view.View;
import android.view.ViewParent;
import d.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import t3.w;

/* loaded from: classes.dex */
public final class jr1 implements Runnable {
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List<m4.mr1>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List<m4.mr1>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<m4.uq1>, java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        nr1 nr1Var = nr1.f11899f;
        Objects.requireNonNull(nr1Var);
        nr1Var.f11908e = System.nanoTime();
        hr1 hr1Var = nr1Var.f11906c;
        Objects.requireNonNull(hr1Var);
        rq1 rq1Var = rq1.f13418c;
        if (rq1Var != null) {
            for (jq1 jq1Var : rq1Var.a()) {
                View e10 = jq1Var.e();
                if (jq1Var.f10164e && !jq1Var.f10165f) {
                    String str2 = jq1Var.f10166g;
                    if (e10 != null) {
                        if (!e10.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = e10;
                            while (true) {
                                if (view == null) {
                                    hr1Var.f9429d.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                                String a10 = fr1.a(view);
                                if (a10 != null) {
                                    str = a10;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            hr1Var.f9430e.add(str2);
                            hr1Var.f9426a.put(e10, str2);
                            Iterator it = jq1Var.f10161b.iterator();
                            while (it.hasNext()) {
                                uq1 uq1Var = (uq1) it.next();
                                View view2 = uq1Var.f14475a.get();
                                if (view2 != null) {
                                    gr1 gr1Var = hr1Var.f9427b.get(view2);
                                    if (gr1Var != null) {
                                        gr1Var.f9009b.add(jq1Var.f10166g);
                                    } else {
                                        hr1Var.f9427b.put(view2, new gr1(uq1Var, jq1Var.f10166g));
                                    }
                                }
                            }
                        } else {
                            hr1Var.f9431f.add(str2);
                            hr1Var.f9428c.put(str2, e10);
                            hr1Var.f9432g.put(str2, str);
                        }
                    } else {
                        hr1Var.f9431f.add(str2);
                        hr1Var.f9432g.put(str2, "noAdView");
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        i7 i7Var = (i7) nr1Var.f11905b.f13493t;
        if (nr1Var.f11906c.f9431f.size() > 0) {
            Iterator<String> it2 = nr1Var.f11906c.f9431f.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                JSONObject a11 = er1.a(0, 0, 0, 0);
                View view3 = nr1Var.f11906c.f9428c.get(next);
                ar1 ar1Var = (ar1) nr1Var.f11905b.f13492s;
                String str3 = nr1Var.f11906c.f9432g.get(next);
                if (str3 != null) {
                    JSONObject d5 = ar1Var.d(view3);
                    try {
                        d5.put("adSessionId", next);
                    } catch (JSONException e11) {
                        c.g("Error with setting ad session id", e11);
                    }
                    try {
                        d5.put("notVisibleReason", str3);
                    } catch (JSONException e12) {
                        c.g("Error with setting not visible reason", e12);
                    }
                    er1.b(a11, d5);
                }
                er1.d(a11);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(next);
                w wVar = nr1Var.f11907d;
                ((qr1) wVar.f18621t).a(new sr1(wVar, hashSet2, a11, nanoTime));
            }
        }
        if (nr1Var.f11906c.f9430e.size() > 0) {
            JSONObject a12 = er1.a(0, 0, 0, 0);
            i7Var.c(null, a12, nr1Var, true);
            er1.d(a12);
            w wVar2 = nr1Var.f11907d;
            ((qr1) wVar2.f18621t).a(new tr1(wVar2, nr1Var.f11906c.f9430e, a12, nanoTime));
        } else {
            w wVar3 = nr1Var.f11907d;
            ((qr1) wVar3.f18621t).a(new rr1(wVar3));
        }
        hr1 hr1Var2 = nr1Var.f11906c;
        hr1Var2.f9426a.clear();
        hr1Var2.f9427b.clear();
        hr1Var2.f9428c.clear();
        hr1Var2.f9429d.clear();
        hr1Var2.f9430e.clear();
        hr1Var2.f9431f.clear();
        hr1Var2.f9432g.clear();
        hr1Var2.f9433h = false;
        long nanoTime2 = System.nanoTime() - nr1Var.f11908e;
        if (nr1Var.f11904a.size() > 0) {
            Iterator it3 = nr1Var.f11904a.iterator();
            while (it3.hasNext()) {
                mr1 mr1Var = (mr1) it3.next();
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                mr1Var.a();
                if (mr1Var instanceof lr1) {
                    ((lr1) mr1Var).zza();
                }
            }
        }
    }
}
