package u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.i;
import v.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b */
    public int f18917b;

    /* renamed from: c */
    public boolean f18918c;

    /* renamed from: d */
    public final d f18919d;

    /* renamed from: e */
    public final a f18920e;

    /* renamed from: f */
    public c f18921f;

    /* renamed from: i */
    public i f18924i;

    /* renamed from: a */
    public HashSet<c> f18916a = null;

    /* renamed from: g */
    public int f18922g = 0;

    /* renamed from: h */
    public int f18923h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f18919d = dVar;
        this.f18920e = aVar;
    }

    public final boolean a(c cVar, int i10, int i11) {
        if (cVar == null) {
            h();
            return true;
        }
        this.f18921f = cVar;
        if (cVar.f18916a == null) {
            cVar.f18916a = new HashSet<>();
        }
        HashSet<c> hashSet = this.f18921f.f18916a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f18922g = i10;
        this.f18923h = i11;
        return true;
    }

    public final void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<c> hashSet = this.f18916a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                v.i.a(it.next().f18919d, i10, arrayList, oVar);
            }
        }
    }

    public final int c() {
        if (!this.f18918c) {
            return 0;
        }
        return this.f18917b;
    }

    public final int d() {
        c cVar;
        if (this.f18919d.f18949i0 == 8) {
            return 0;
        }
        int i10 = this.f18923h;
        return (i10 == Integer.MIN_VALUE || (cVar = this.f18921f) == null || cVar.f18919d.f18949i0 != 8) ? this.f18922g : i10;
    }

    public final boolean e() {
        c cVar;
        HashSet<c> hashSet = this.f18916a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            c next = it.next();
            switch (next.f18920e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    cVar = null;
                    break;
                case 1:
                    cVar = next.f18919d.L;
                    break;
                case 2:
                    cVar = next.f18919d.M;
                    break;
                case 3:
                    cVar = next.f18919d.J;
                    break;
                case 4:
                    cVar = next.f18919d.K;
                    break;
                default:
                    throw new AssertionError(next.f18920e.name());
            }
            if (cVar.g()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        HashSet<c> hashSet = this.f18916a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean g() {
        return this.f18921f != null;
    }

    public final void h() {
        HashSet<c> hashSet;
        c cVar = this.f18921f;
        if (cVar != null && (hashSet = cVar.f18916a) != null) {
            hashSet.remove(this);
            if (this.f18921f.f18916a.size() == 0) {
                this.f18921f.f18916a = null;
            }
        }
        this.f18916a = null;
        this.f18921f = null;
        this.f18922g = 0;
        this.f18923h = Integer.MIN_VALUE;
        this.f18918c = false;
        this.f18917b = 0;
    }

    public final void i() {
        i iVar = this.f18924i;
        if (iVar == null) {
            this.f18924i = new i(1);
        } else {
            iVar.e();
        }
    }

    public final void j(int i10) {
        this.f18917b = i10;
        this.f18918c = true;
    }

    public final String toString() {
        return this.f18919d.f18951j0 + ":" + this.f18920e.toString();
    }
}
