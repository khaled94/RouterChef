package h2;

import android.text.TextUtils;
import b3.n;
import java.util.LinkedHashMap;
import java.util.Map;
import l3.s;
import m4.an2;
import m4.hs;
import m4.lz;
import m4.pk2;
import m4.q72;
import m4.qs;
import m4.to2;
import m4.u8;
import m4.vi0;
import m4.yk2;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4996s;

    /* renamed from: t */
    public final Object f4997t;

    public /* synthetic */ i(Object obj, int i10) {
        this.f4996s = i10;
        this.f4997t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<m4.qs>] */
    @Override // java.lang.Runnable
    public final void run() {
        yk2[] yk2VarArr;
        Map<String, String> map;
        switch (this.f4996s) {
            case 0:
                ((n) this.f4997t).b(t.f5037l, null);
                return;
            case 1:
                hs hsVar = (hs) this.f4997t;
                while (true) {
                    try {
                        qs qsVar = (qs) hsVar.f9434a.take();
                        u8 a10 = qsVar.a();
                        if (!TextUtils.isEmpty((String) a10.f14267s)) {
                            LinkedHashMap<String, String> linkedHashMap = hsVar.f9435b;
                            synchronized (qsVar.f12989c) {
                                s.B.f5793g.b();
                                map = qsVar.f12988b;
                            }
                            hsVar.b(hsVar.a(linkedHashMap, map), a10);
                        }
                    } catch (InterruptedException e10) {
                        g1.k("CsiReporter:reporter interrupted", e10);
                        return;
                    }
                }
            case 2:
                ((lz) this.f4997t).c();
                return;
            case 3:
                ((vi0) this.f4997t).f14696s.f15791d.c();
                return;
            default:
                pk2 pk2Var = (pk2) ((an2) this.f4997t);
                for (yk2 yk2Var : pk2Var.H) {
                    yk2Var.l(true);
                    if (yk2Var.A != null) {
                        yk2Var.A = null;
                        yk2Var.f15812f = null;
                    }
                }
                q72 q72Var = pk2Var.A;
                if (((to2) q72Var.f12731t) != null) {
                    q72Var.f12731t = null;
                }
                q72Var.f12732u = null;
                return;
        }
    }
}
