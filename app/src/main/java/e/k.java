package e;

import m0.h0;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ h f4240s;

    /* loaded from: classes.dex */
    public class a extends h0 {
        public a() {
            k.this = r1;
        }

        @Override // m0.g0
        public final void a() {
            k.this.f4240s.G.setAlpha(1.0f);
            k.this.f4240s.J.d(null);
            k.this.f4240s.J = null;
        }

        @Override // m0.h0, m0.g0
        public final void d() {
            k.this.f4240s.G.setVisibility(0);
        }
    }

    public k(h hVar) {
        this.f4240s = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            e.h r0 = r4.f4240s
            android.widget.PopupWindow r1 = r0.H
            androidx.appcompat.widget.ActionBarContextView r0 = r0.G
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            e.h r0 = r4.f4240s
            r0.G()
            e.h r0 = r4.f4240s
            boolean r1 = r0.L
            if (r1 == 0) goto L25
            android.view.ViewGroup r0 = r0.M
            if (r0 == 0) goto L25
            java.util.WeakHashMap<android.view.View, m0.f0> r1 = m0.z.f5921a
            boolean r0 = m0.z.g.c(r0)
            if (r0 == 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = r3
        L26:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L4c
            e.h r0 = r4.f4240s
            androidx.appcompat.widget.ActionBarContextView r0 = r0.G
            r2 = 0
            r0.setAlpha(r2)
            e.h r0 = r4.f4240s
            androidx.appcompat.widget.ActionBarContextView r2 = r0.G
            m0.f0 r2 = m0.z.b(r2)
            r2.a(r1)
            r0.J = r2
            e.h r0 = r4.f4240s
            m0.f0 r0 = r0.J
            e.k$a r1 = new e.k$a
            r1.<init>()
            r0.d(r1)
            goto L5a
        L4c:
            e.h r0 = r4.f4240s
            androidx.appcompat.widget.ActionBarContextView r0 = r0.G
            r0.setAlpha(r1)
            e.h r0 = r4.f4240s
            androidx.appcompat.widget.ActionBarContextView r0 = r0.G
            r0.setVisibility(r3)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k.run():void");
    }
}
