package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f1581s;

    /* renamed from: t */
    public final /* synthetic */ ArrayList f1582t;

    /* renamed from: u */
    public final /* synthetic */ ArrayList f1583u;

    /* renamed from: v */
    public final /* synthetic */ ArrayList f1584v;

    /* renamed from: w */
    public final /* synthetic */ ArrayList f1585w;

    public t0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1581s = i10;
        this.f1582t = arrayList;
        this.f1583u = arrayList2;
        this.f1584v = arrayList3;
        this.f1585w = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f1581s; i10++) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.i.v((View) this.f1582t.get(i10), (String) this.f1583u.get(i10));
            z.i.v((View) this.f1584v.get(i10), (String) this.f1585w.get(i10));
        }
    }
}
