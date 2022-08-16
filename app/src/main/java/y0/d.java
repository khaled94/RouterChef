package y0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.g0;
import androidx.fragment.app.o;
import e9.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import w8.i;
import y0.d;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f20245a = null;

    /* renamed from: b */
    public static c f20246b = c.f20253d;

    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        /* JADX INFO: Fake field, exist only in values array */
        DETECT_RETAIN_INSTANCE_USAGE,
        /* JADX INFO: Fake field, exist only in values array */
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: d */
        public static final c f20253d = new c();

        /* renamed from: a */
        public final Set<a> f20254a = i.f19942s;

        /* renamed from: b */
        public final b f20255b = null;

        /* renamed from: c */
        public final Map<String, Set<Class<? extends i>>> f20256c = new LinkedHashMap();
    }

    public static final c a(o oVar) {
        while (oVar != null) {
            if (oVar.z()) {
                oVar.q();
            }
            oVar = oVar.M;
        }
        return f20246b;
    }

    public static final void b(final c cVar, final i iVar) {
        o oVar = iVar.f20258s;
        final String name = oVar.getClass().getName();
        if (cVar.f20254a.contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, iVar);
        }
        if (cVar.f20255b != null) {
            e(oVar, new Runnable() { // from class: y0.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.c cVar2 = d.c.this;
                    i iVar2 = iVar;
                    f.e(cVar2, "$policy");
                    f.e(iVar2, "$violation");
                    cVar2.f20255b.a();
                }
            });
        }
        if (cVar.f20254a.contains(a.PENALTY_DEATH)) {
            e(oVar, new Runnable() { // from class: y0.b
                @Override // java.lang.Runnable
                public final void run() {
                    String str = name;
                    i iVar2 = iVar;
                    f.e(iVar2, "$violation");
                    Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, iVar2);
                    throw iVar2;
                }
            });
        }
    }

    public static final void c(i iVar) {
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("StrictMode violation in ");
            c10.append(iVar.f20258s.getClass().getName());
            Log.d("FragmentManager", c10.toString(), iVar);
        }
    }

    public static final void d(o oVar, String str) {
        f.e(oVar, "fragment");
        f.e(str, "previousFragmentId");
        y0.a aVar = new y0.a(oVar, str);
        c(aVar);
        c a10 = a(oVar);
        if (!a10.f20254a.contains(a.DETECT_FRAGMENT_REUSE) || !f(a10, oVar.getClass(), aVar.getClass())) {
            return;
        }
        b(a10, aVar);
    }

    public static final void e(o oVar, Runnable runnable) {
        if (oVar.z()) {
            Handler handler = oVar.q().f1417t.f1605u;
            f.d(handler, "fragment.parentFragmentManager.host.handler");
            if (!f.a(handler.getLooper(), Looper.myLooper())) {
                handler.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends y0.i>>>] */
    public static final boolean f(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f20256c.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!f.a(cls2.getSuperclass(), i.class) && set.contains(cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
