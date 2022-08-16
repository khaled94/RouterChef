package m4;

import android.util.Base64;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class dt1 {

    /* renamed from: a */
    public final Object f7635a;

    /* renamed from: b */
    public final et1 f7636b;

    /* renamed from: c */
    public final h8 f7637c;

    /* renamed from: d */
    public final zr1 f7638d;

    public dt1(Object obj, et1 et1Var, h8 h8Var, zr1 zr1Var) {
        this.f7635a = obj;
        this.f7636b = et1Var;
        this.f7637c = h8Var;
        this.f7638d = zr1Var;
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        w6 v10 = x6.v();
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        x6.z((x6) v10.f9883t, 5);
        v10.n(n82.D(bArr, 0, bArr.length));
        return Base64.encodeToString(v10.k().b(), 11);
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f7635a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f7635a, hashMap);
            this.f7638d.d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new lt1(2005, e10);
        }
    }

    public final synchronized int b() {
        try {
        } catch (Exception e10) {
            throw new lt1(2006, e10);
        }
        return ((Integer) this.f7635a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f7635a, new Object[0])).intValue();
    }

    public final synchronized void c() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f7635a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f7635a, new Object[0]);
            this.f7638d.d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new lt1(2003, e10);
        }
    }

    public final synchronized boolean d() {
        try {
        } catch (Exception e10) {
            throw new lt1(2001, e10);
        }
        return ((Boolean) this.f7635a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f7635a, new Object[0])).booleanValue();
    }

    public final synchronized byte[] f(Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            this.f7638d.c(2007, System.currentTimeMillis() - currentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.f7635a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f7635a, null, map);
    }
}
