package androidx.lifecycle;

import a7.a;
import a7.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import e9.f;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import m4.ar0;
import m4.jo1;
import m4.r31;
import m4.vj0;
import m4.wo0;
import m4.yf0;
import org.json.JSONObject;
import s4.aa;
import x8.e;
import y4.d1;
import y4.e1;
import y4.f1;
import z6.d;
import z7.m;
import z8.c;

/* loaded from: classes.dex */
public class h0 implements ar0, d, d1, m {

    /* renamed from: s */
    public static final h0 f1693s = new h0();

    /* renamed from: t */
    public static final yf0 f1694t = new yf0(0);

    /* renamed from: u */
    public static final vj0 f1695u = new vj0(0);

    /* renamed from: v */
    public static final /* synthetic */ h0 f1696v = new h0();

    /* renamed from: w */
    public static final r31 f1697w = new r31();

    /* renamed from: x */
    public static final jo1 f1698x = new jo1();
    public static final /* synthetic */ h0 y = new h0();

    public static final x8.d b(x8.d dVar) {
        f.e(dVar, "<this>");
        c cVar = dVar instanceof c ? (c) dVar : null;
        if (cVar != null && (dVar = cVar.f21060u) == null) {
            x8.f fVar = cVar.f21059t;
            f.c(fVar);
            int i10 = e.f20101r;
            e eVar = (e) fVar.get(e.a.f20102s);
            if (eVar == null || (dVar = eVar.d0(cVar)) == null) {
                dVar = cVar;
            }
            cVar.f21060u = dVar;
        }
        return dVar;
    }

    public static void d(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) list.get(i10);
            j3 = Math.max(j3, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j3);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static int e(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    @Override // z6.d
    public a7.e a(j0.d dVar, JSONObject jSONObject) {
        long j3;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("fabric");
        JSONObject jSONObject3 = jSONObject.getJSONObject("app");
        boolean equals = "new".equals(jSONObject3.getString("status"));
        String string = jSONObject2.getString("bundle_id");
        jSONObject2.getString("org_id");
        if (!equals) {
            String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string);
        }
        Locale locale = Locale.US;
        String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string);
        String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string);
        jSONObject3.optBoolean("update_required", false);
        jSONObject3.optInt("report_upload_variant", 0);
        jSONObject3.optInt("native_report_upload_variant", 0);
        a aVar = new a();
        a7.c cVar = new a7.c(8);
        JSONObject jSONObject4 = jSONObject.getJSONObject("features");
        b bVar = new b(jSONObject4.optBoolean("collect_reports", true), jSONObject4.optBoolean("collect_anrs", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            j3 = jSONObject.optLong("expires_at");
        } else {
            Objects.requireNonNull(dVar);
            j3 = (j10 * 1000) + System.currentTimeMillis();
        }
        return new a7.e(j3, aVar, cVar, bVar);
    }

    @Override // z7.m
    public Object c() {
        return new ConcurrentHashMap();
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((wo0) obj).a();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().o());
    }
}
