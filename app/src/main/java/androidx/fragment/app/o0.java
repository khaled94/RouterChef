package androidx.fragment.app;

import androidx.lifecycle.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: b */
    public int f1539b;

    /* renamed from: c */
    public int f1540c;

    /* renamed from: d */
    public int f1541d;

    /* renamed from: e */
    public int f1542e;

    /* renamed from: f */
    public int f1543f;

    /* renamed from: g */
    public boolean f1544g;

    /* renamed from: i */
    public String f1546i;

    /* renamed from: j */
    public int f1547j;

    /* renamed from: k */
    public CharSequence f1548k;

    /* renamed from: l */
    public int f1549l;

    /* renamed from: m */
    public CharSequence f1550m;

    /* renamed from: n */
    public ArrayList<String> f1551n;

    /* renamed from: o */
    public ArrayList<String> f1552o;

    /* renamed from: a */
    public ArrayList<a> f1538a = new ArrayList<>();

    /* renamed from: h */
    public boolean f1545h = true;
    public boolean p = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public int f1553a;

        /* renamed from: b */
        public o f1554b;

        /* renamed from: c */
        public boolean f1555c;

        /* renamed from: d */
        public int f1556d;

        /* renamed from: e */
        public int f1557e;

        /* renamed from: f */
        public int f1558f;

        /* renamed from: g */
        public int f1559g;

        /* renamed from: h */
        public g.c f1560h;

        /* renamed from: i */
        public g.c f1561i;

        public a() {
        }

        public a(int i10, o oVar) {
            this.f1553a = i10;
            this.f1554b = oVar;
            this.f1555c = false;
            g.c cVar = g.c.RESUMED;
            this.f1560h = cVar;
            this.f1561i = cVar;
        }

        public a(int i10, o oVar, boolean z10) {
            this.f1553a = i10;
            this.f1554b = oVar;
            this.f1555c = true;
            g.c cVar = g.c.RESUMED;
            this.f1560h = cVar;
            this.f1561i = cVar;
        }
    }

    public final void b(a aVar) {
        this.f1538a.add(aVar);
        aVar.f1556d = this.f1539b;
        aVar.f1557e = this.f1540c;
        aVar.f1558f = this.f1541d;
        aVar.f1559g = this.f1542e;
    }

    public abstract int c();

    public abstract void d(int i10, o oVar, String str, int i11);

    public final o0 e(int i10, o oVar) {
        if (i10 != 0) {
            d(i10, oVar, null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
