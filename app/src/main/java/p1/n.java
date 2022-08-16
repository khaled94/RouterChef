package p1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.d;
import java.util.ArrayList;
import java.util.Iterator;
import p1.i;

/* loaded from: classes.dex */
public class n extends i {
    public int R;
    public ArrayList<i> P = new ArrayList<>();
    public boolean Q = true;
    public boolean S = false;
    public int T = 0;

    /* loaded from: classes.dex */
    public class a extends l {

        /* renamed from: a */
        public final /* synthetic */ i f16927a;

        public a(i iVar) {
            this.f16927a = iVar;
        }

        @Override // p1.i.d
        public final void a(i iVar) {
            this.f16927a.z();
            iVar.w(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l {

        /* renamed from: a */
        public n f16928a;

        public b(n nVar) {
            this.f16928a = nVar;
        }

        @Override // p1.i.d
        public final void a(i iVar) {
            n nVar = this.f16928a;
            int i10 = nVar.R - 1;
            nVar.R = i10;
            if (i10 == 0) {
                nVar.S = false;
                nVar.n();
            }
            iVar.w(this);
        }

        @Override // p1.l, p1.i.d
        public final void e(i iVar) {
            n nVar = this.f16928a;
            if (!nVar.S) {
                nVar.J();
                this.f16928a.S = true;
            }
        }
    }

    @Override // p1.i
    public final i A(long j3) {
        ArrayList<i> arrayList;
        this.f16907u = j3;
        if (j3 >= 0 && (arrayList = this.P) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.P.get(i10).A(j3);
            }
        }
        return this;
    }

    @Override // p1.i
    public final void B(i.c cVar) {
        this.K = cVar;
        this.T |= 8;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).B(cVar);
        }
    }

    @Override // p1.i
    public final i C(TimeInterpolator timeInterpolator) {
        this.T |= 1;
        ArrayList<i> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.P.get(i10).C(timeInterpolator);
            }
        }
        this.f16908v = timeInterpolator;
        return this;
    }

    @Override // p1.i
    public final void D(d dVar) {
        super.D(dVar);
        this.T |= 4;
        if (this.P != null) {
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                this.P.get(i10).D(dVar);
            }
        }
    }

    @Override // p1.i
    public final void E() {
        this.T |= 2;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).E();
        }
    }

    @Override // p1.i
    public final i F(long j3) {
        this.f16906t = j3;
        return this;
    }

    @Override // p1.i
    public final String K(String str) {
        String K = super.K(str);
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            StringBuilder c10 = androidx.fragment.app.a.c(K, "\n");
            c10.append(this.P.get(i10).K(str + "  "));
            K = c10.toString();
        }
        return K;
    }

    public final n L(i iVar) {
        this.P.add(iVar);
        iVar.A = this;
        long j3 = this.f16907u;
        if (j3 >= 0) {
            iVar.A(j3);
        }
        if ((this.T & 1) != 0) {
            iVar.C(this.f16908v);
        }
        if ((this.T & 2) != 0) {
            iVar.E();
        }
        if ((this.T & 4) != 0) {
            iVar.D(this.L);
        }
        if ((this.T & 8) != 0) {
            iVar.B(this.K);
        }
        return this;
    }

    public final i M(int i10) {
        if (i10 < 0 || i10 >= this.P.size()) {
            return null;
        }
        return this.P.get(i10);
    }

    @Override // p1.i
    public final i a(i.d dVar) {
        super.a(dVar);
        return this;
    }

    @Override // p1.i
    public final i b(View view) {
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            this.P.get(i10).b(view);
        }
        this.f16910x.add(view);
        return this;
    }

    @Override // p1.i
    public final void cancel() {
        super.cancel();
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).cancel();
        }
    }

    @Override // p1.i
    public final void d(p pVar) {
        if (t(pVar.f16933b)) {
            Iterator<i> it = this.P.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.t(pVar.f16933b)) {
                    next.d(pVar);
                    pVar.f16934c.add(next);
                }
            }
        }
    }

    @Override // p1.i
    public final void f(p pVar) {
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).f(pVar);
        }
    }

    @Override // p1.i
    public final void g(p pVar) {
        if (t(pVar.f16933b)) {
            Iterator<i> it = this.P.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.t(pVar.f16933b)) {
                    next.g(pVar);
                    pVar.f16934c.add(next);
                }
            }
        }
    }

    @Override // p1.i
    /* renamed from: k */
    public final i clone() {
        n nVar = (n) super.clone();
        nVar.P = new ArrayList<>();
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            i clone = this.P.get(i10).clone();
            nVar.P.add(clone);
            clone.A = nVar;
        }
        return nVar;
    }

    @Override // p1.i
    public final void m(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        long j3 = this.f16906t;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.P.get(i10);
            if (j3 > 0 && (this.Q || i10 == 0)) {
                long j10 = iVar.f16906t;
                if (j10 > 0) {
                    iVar.F(j10 + j3);
                } else {
                    iVar.F(j3);
                }
            }
            iVar.m(viewGroup, qVar, qVar2, arrayList, arrayList2);
        }
    }

    @Override // p1.i
    public final void v(View view) {
        super.v(view);
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).v(view);
        }
    }

    @Override // p1.i
    public final i w(i.d dVar) {
        super.w(dVar);
        return this;
    }

    @Override // p1.i
    public final i x(View view) {
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            this.P.get(i10).x(view);
        }
        this.f16910x.remove(view);
        return this;
    }

    @Override // p1.i
    public final void y(View view) {
        super.y(view);
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).y(view);
        }
    }

    @Override // p1.i
    public final void z() {
        if (this.P.isEmpty()) {
            J();
            n();
            return;
        }
        b bVar = new b(this);
        Iterator<i> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.R = this.P.size();
        if (this.Q) {
            Iterator<i> it2 = this.P.iterator();
            while (it2.hasNext()) {
                it2.next().z();
            }
            return;
        }
        for (int i10 = 1; i10 < this.P.size(); i10++) {
            this.P.get(i10 - 1).a(new a(this.P.get(i10)));
        }
        i iVar = this.P.get(0);
        if (iVar == null) {
            return;
        }
        iVar.z();
    }
}
