package s;

import java.util.ArrayList;
import s.e;

/* loaded from: classes.dex */
public class c implements e.a {

    /* renamed from: d */
    public a f17553d;

    /* renamed from: a */
    public i f17550a = null;

    /* renamed from: b */
    public float f17551b = 0.0f;

    /* renamed from: c */
    public ArrayList<i> f17552c = new ArrayList<>();

    /* renamed from: e */
    public boolean f17554e = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i10);

        void b(i iVar, float f10);

        int c();

        void clear();

        float d(c cVar, boolean z10);

        float e(i iVar, boolean z10);

        i f(int i10);

        float g(i iVar);

        boolean h(i iVar);

        void i(float f10);

        void j(i iVar, float f10, boolean z10);

        void k();
    }

    public c() {
    }

    public c(d dVar) {
        this.f17553d = new s.a(this, dVar);
    }

    @Override // s.e.a
    public i a(boolean[] zArr) {
        return h(zArr, null);
    }

    public final c b(e eVar, int i10) {
        this.f17553d.b(eVar.k(i10, "ep"), 1.0f);
        this.f17553d.b(eVar.k(i10, "em"), -1.0f);
        return this;
    }

    public final c c(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f17553d.b(iVar, -1.0f);
        this.f17553d.b(iVar2, 1.0f);
        this.f17553d.b(iVar3, f10);
        this.f17553d.b(iVar4, -f10);
        return this;
    }

    public final c d(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f17551b = i10;
        }
        if (!z10) {
            this.f17553d.b(iVar, -1.0f);
            this.f17553d.b(iVar2, 1.0f);
            this.f17553d.b(iVar3, 1.0f);
        } else {
            this.f17553d.b(iVar, 1.0f);
            this.f17553d.b(iVar2, -1.0f);
            this.f17553d.b(iVar3, -1.0f);
        }
        return this;
    }

    public final c e(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f17551b = i10;
        }
        if (!z10) {
            this.f17553d.b(iVar, -1.0f);
            this.f17553d.b(iVar2, 1.0f);
            this.f17553d.b(iVar3, -1.0f);
        } else {
            this.f17553d.b(iVar, 1.0f);
            this.f17553d.b(iVar2, -1.0f);
            this.f17553d.b(iVar3, 1.0f);
        }
        return this;
    }

    public final c f(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f17553d.b(iVar3, 0.5f);
        this.f17553d.b(iVar4, 0.5f);
        this.f17553d.b(iVar, -0.5f);
        this.f17553d.b(iVar2, -0.5f);
        this.f17551b = -f10;
        return this;
    }

    public boolean g() {
        return this.f17550a == null && this.f17551b == 0.0f && this.f17553d.c() == 0;
    }

    public final i h(boolean[] zArr, i iVar) {
        int i10;
        int c10 = this.f17553d.c();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < c10; i11++) {
            float a10 = this.f17553d.a(i11);
            if (a10 < 0.0f) {
                i f11 = this.f17553d.f(i11);
                if ((zArr == null || !zArr[f11.f17585t]) && f11 != iVar && (((i10 = f11.A) == 3 || i10 == 4) && a10 < f10)) {
                    f10 = a10;
                    iVar2 = f11;
                }
            }
        }
        return iVar2;
    }

    public final void i(i iVar) {
        i iVar2 = this.f17550a;
        if (iVar2 != null) {
            this.f17553d.b(iVar2, -1.0f);
            this.f17550a.f17586u = -1;
            this.f17550a = null;
        }
        float e10 = this.f17553d.e(iVar, true) * (-1.0f);
        this.f17550a = iVar;
        if (e10 == 1.0f) {
            return;
        }
        this.f17551b /= e10;
        this.f17553d.i(e10);
    }

    public final void j(e eVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f17589x) {
            return;
        }
        float g10 = this.f17553d.g(iVar);
        this.f17551b = (iVar.f17588w * g10) + this.f17551b;
        this.f17553d.e(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        if (this.f17553d.c() != 0) {
            return;
        }
        this.f17554e = true;
        eVar.f17560a = true;
    }

    public void k(e eVar, c cVar, boolean z10) {
        float d5 = this.f17553d.d(cVar, z10);
        this.f17551b = (cVar.f17551b * d5) + this.f17551b;
        if (z10) {
            cVar.f17550a.d(this);
        }
        if (this.f17550a == null || this.f17553d.c() != 0) {
            return;
        }
        this.f17554e = true;
        eVar.f17560a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            s.i r0 = r10.f17550a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.activity.result.a.c(r0)
            s.i r1 = r10.f17550a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = d7.a.c(r0, r1)
            float r1 = r10.f17551b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = androidx.activity.result.a.c(r0)
            float r1 = r10.f17551b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L35
        L34:
            r1 = r3
        L35:
            s.c$a r5 = r10.f17553d
            int r5 = r5.c()
        L3b:
            if (r3 >= r5) goto L9f
            s.c$a r6 = r10.f17553d
            s.i r6 = r6.f(r3)
            if (r6 != 0) goto L46
            goto L9c
        L46:
            s.c$a r7 = r10.f17553d
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L51
            goto L9c
        L51:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L64
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.StringBuilder r0 = androidx.activity.result.a.c(r0)
            java.lang.String r1 = "- "
            goto L76
        L64:
            java.lang.StringBuilder r0 = androidx.activity.result.a.c(r0)
            if (r8 <= 0) goto L74
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7e
        L74:
            java.lang.String r1 = " - "
        L76:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L7e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L97
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L97:
            java.lang.String r0 = s.b.b(r1, r0, r6)
            r1 = r4
        L9c:
            int r3 = r3 + 1
            goto L3b
        L9f:
            if (r1 != 0) goto La7
            java.lang.String r1 = "0.0"
            java.lang.String r0 = d7.a.c(r0, r1)
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c.toString():java.lang.String");
    }
}
