package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class a0 extends RecyclerView.o {

    /* renamed from: a */
    public RecyclerView f2077a;

    /* renamed from: b */
    public final a f2078b = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.q {

        /* renamed from: a */
        public boolean f2079a = false;

        public a() {
            a0.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(RecyclerView recyclerView, int i10) {
            if (i10 != 0 || !this.f2079a) {
                return;
            }
            this.f2079a = false;
            a0.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f2079a = true;
        }
    }

    public abstract int[] a(RecyclerView.m mVar, View view);

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.f2077a
            if (r0 != 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            r1 = r5
            androidx.recyclerview.widget.u r1 = (androidx.recyclerview.widget.u) r1
            boolean r2 = r0.f()
            if (r2 == 0) goto L1a
            androidx.recyclerview.widget.s r2 = r1.f(r0)
            goto L24
        L1a:
            boolean r2 = r0.e()
            if (r2 == 0) goto L29
            androidx.recyclerview.widget.s r2 = r1.e(r0)
        L24:
            android.view.View r1 = r1.d(r0, r2)
            goto L2a
        L29:
            r1 = 0
        L2a:
            if (r1 != 0) goto L2d
            return
        L2d:
            int[] r0 = r5.a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L3b
            r2 = r0[r3]
            if (r2 == 0) goto L44
        L3b:
            androidx.recyclerview.widget.RecyclerView r2 = r5.f2077a
            r4 = r0[r1]
            r0 = r0[r3]
            r2.h0(r4, r0, r1)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a0.b():void");
    }
}
