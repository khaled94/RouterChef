package v;

import java.util.HashSet;
import java.util.Iterator;
import u.c;
import u.d;
import u.e;
import u.f;
import v.b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static b.a f19723a = new b.a();

    public static boolean a(d dVar) {
        int[] iArr = dVar.U;
        int i10 = iArr[0];
        int i11 = iArr[1];
        d dVar2 = dVar.V;
        e eVar = dVar2 != null ? (e) dVar2 : null;
        if (eVar != null) {
            int i12 = eVar.U[0];
        }
        if (eVar != null) {
            int i13 = eVar.U[1];
        }
        boolean z10 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f18965r == 0 && dVar.Y == 0.0f && dVar.u(0)) || (i10 == 3 && dVar.f18965r == 1 && dVar.v(0, dVar.r()));
        boolean z11 = i11 == 1 || dVar.C() || i11 == 2 || (i11 == 3 && dVar.f18966s == 0 && dVar.Y == 0.0f && dVar.u(1)) || (i11 == 3 && dVar.f18966s == 1 && dVar.v(1, dVar.k()));
        if (dVar.Y <= 0.0f || (!z10 && !z11)) {
            return z10 && z11;
        }
        return true;
    }

    public static void b(int i10, d dVar, b.AbstractC0141b abstractC0141b, boolean z10) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (dVar.f18956m) {
            return;
        }
        if (!(dVar instanceof e) && dVar.A() && a(dVar)) {
            e.c0(dVar, abstractC0141b, new b.a());
        }
        c h10 = dVar.h(c.a.LEFT);
        c h11 = dVar.h(c.a.RIGHT);
        int c10 = h10.c();
        int c11 = h11.c();
        HashSet<c> hashSet = h10.f18916a;
        if (hashSet != null && h10.f18918c) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                c next = it.next();
                d dVar2 = next.f18919d;
                int i11 = i10 + 1;
                boolean a10 = a(dVar2);
                if (dVar2.A() && a10) {
                    e.c0(dVar2, abstractC0141b, new b.a());
                }
                c cVar5 = dVar2.J;
                boolean z11 = (next == cVar5 && (cVar4 = dVar2.L.f18921f) != null && cVar4.f18918c) || (next == dVar2.L && (cVar3 = cVar5.f18921f) != null && cVar3.f18918c);
                int[] iArr = dVar2.U;
                if (iArr[0] != 3 || a10) {
                    if (!dVar2.A()) {
                        c cVar6 = dVar2.J;
                        if (next == cVar6 && dVar2.L.f18921f == null) {
                            int d5 = cVar6.d() + c10;
                            dVar2.J(d5, dVar2.r() + d5);
                        } else {
                            c cVar7 = dVar2.L;
                            if (next == cVar7 && cVar6.f18921f == null) {
                                int d10 = c10 - cVar7.d();
                                dVar2.J(d10 - dVar2.r(), d10);
                            } else if (z11 && !dVar2.y()) {
                                c(i11, abstractC0141b, dVar2, z10);
                            }
                        }
                        b(i11, dVar2, abstractC0141b, z10);
                    }
                } else if (iArr[0] == 3 && dVar2.f18969v >= 0 && dVar2.f18968u >= 0 && (dVar2.f18949i0 == 8 || (dVar2.f18965r == 0 && dVar2.Y == 0.0f))) {
                    if (!dVar2.y() && !dVar2.G && z11 && !dVar2.y()) {
                        d(i11, dVar, abstractC0141b, dVar2, z10);
                    }
                }
            }
        }
        if (dVar instanceof f) {
            return;
        }
        HashSet<c> hashSet2 = h11.f18916a;
        if (hashSet2 != null && h11.f18918c) {
            Iterator<c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                c next2 = it2.next();
                d dVar3 = next2.f18919d;
                int i12 = i10 + 1;
                boolean a11 = a(dVar3);
                if (dVar3.A() && a11) {
                    e.c0(dVar3, abstractC0141b, new b.a());
                }
                c cVar8 = dVar3.J;
                boolean z12 = (next2 == cVar8 && (cVar2 = dVar3.L.f18921f) != null && cVar2.f18918c) || (next2 == dVar3.L && (cVar = cVar8.f18921f) != null && cVar.f18918c);
                int[] iArr2 = dVar3.U;
                if (iArr2[0] != 3 || a11) {
                    if (!dVar3.A()) {
                        c cVar9 = dVar3.J;
                        if (next2 == cVar9 && dVar3.L.f18921f == null) {
                            int d11 = cVar9.d() + c11;
                            dVar3.J(d11, dVar3.r() + d11);
                        } else {
                            c cVar10 = dVar3.L;
                            if (next2 == cVar10 && cVar9.f18921f == null) {
                                int d12 = c11 - cVar10.d();
                                dVar3.J(d12 - dVar3.r(), d12);
                            } else if (z12 && !dVar3.y()) {
                                c(i12, abstractC0141b, dVar3, z10);
                            }
                        }
                        b(i12, dVar3, abstractC0141b, z10);
                    }
                } else if (iArr2[0] == 3 && dVar3.f18969v >= 0 && dVar3.f18968u >= 0) {
                    if (dVar3.f18949i0 != 8) {
                        if (dVar3.f18965r == 0) {
                            if (dVar3.Y == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.y() && !dVar3.G && z12 && !dVar3.y()) {
                        d(i12, dVar, abstractC0141b, dVar3, z10);
                    }
                }
            }
        }
        dVar.f18956m = true;
    }

    public static void c(int i10, b.AbstractC0141b abstractC0141b, d dVar, boolean z10) {
        float f10 = dVar.f18943f0;
        int c10 = dVar.J.f18921f.c();
        int c11 = dVar.L.f18921f.c();
        int d5 = dVar.J.d() + c10;
        int d10 = c11 - dVar.L.d();
        if (c10 == c11) {
            f10 = 0.5f;
        } else {
            c10 = d5;
            c11 = d10;
        }
        int r10 = dVar.r();
        int i11 = (c11 - c10) - r10;
        if (c10 > c11) {
            i11 = (c10 - c11) - r10;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + c10;
        int i13 = i12 + r10;
        if (c10 > c11) {
            i13 = i12 - r10;
        }
        dVar.J(i12, i13);
        b(i10 + 1, dVar, abstractC0141b, z10);
    }

    public static void d(int i10, d dVar, b.AbstractC0141b abstractC0141b, d dVar2, boolean z10) {
        float f10 = dVar2.f18943f0;
        int d5 = dVar2.J.d() + dVar2.J.f18921f.c();
        int c10 = dVar2.L.f18921f.c() - dVar2.L.d();
        if (c10 >= d5) {
            int r10 = dVar2.r();
            if (dVar2.f18949i0 != 8) {
                int i11 = dVar2.f18965r;
                if (i11 == 2) {
                    if (!(dVar instanceof e)) {
                        dVar = dVar.V;
                    }
                    r10 = (int) (dVar2.f18943f0 * 0.5f * dVar.r());
                } else if (i11 == 0) {
                    r10 = c10 - d5;
                }
                r10 = Math.max(dVar2.f18968u, r10);
                int i12 = dVar2.f18969v;
                if (i12 > 0) {
                    r10 = Math.min(i12, r10);
                }
            }
            int i13 = d5 + ((int) ((f10 * ((c10 - d5) - r10)) + 0.5f));
            dVar2.J(i13, r10 + i13);
            b(i10 + 1, dVar2, abstractC0141b, z10);
        }
    }

    public static void e(int i10, b.AbstractC0141b abstractC0141b, d dVar) {
        float f10 = dVar.f18945g0;
        int c10 = dVar.K.f18921f.c();
        int c11 = dVar.M.f18921f.c();
        int d5 = dVar.K.d() + c10;
        int d10 = c11 - dVar.M.d();
        if (c10 == c11) {
            f10 = 0.5f;
        } else {
            c10 = d5;
            c11 = d10;
        }
        int k10 = dVar.k();
        int i11 = (c11 - c10) - k10;
        if (c10 > c11) {
            i11 = (c10 - c11) - k10;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = c10 + i12;
        int i14 = i13 + k10;
        if (c10 > c11) {
            i13 = c10 - i12;
            i14 = i13 - k10;
        }
        dVar.K(i13, i14);
        g(i10 + 1, dVar, abstractC0141b);
    }

    public static void f(int i10, d dVar, b.AbstractC0141b abstractC0141b, d dVar2) {
        float f10 = dVar2.f18945g0;
        int d5 = dVar2.K.d() + dVar2.K.f18921f.c();
        int c10 = dVar2.M.f18921f.c() - dVar2.M.d();
        if (c10 >= d5) {
            int k10 = dVar2.k();
            if (dVar2.f18949i0 != 8) {
                int i11 = dVar2.f18966s;
                if (i11 == 2) {
                    if (!(dVar instanceof e)) {
                        dVar = dVar.V;
                    }
                    k10 = (int) (f10 * 0.5f * dVar.k());
                } else if (i11 == 0) {
                    k10 = c10 - d5;
                }
                k10 = Math.max(dVar2.f18971x, k10);
                int i12 = dVar2.y;
                if (i12 > 0) {
                    k10 = Math.min(i12, k10);
                }
            }
            int i13 = d5 + ((int) ((f10 * ((c10 - d5) - k10)) + 0.5f));
            dVar2.K(i13, k10 + i13);
            g(i10 + 1, dVar2, abstractC0141b);
        }
    }

    public static void g(int i10, d dVar, b.AbstractC0141b abstractC0141b) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (dVar.f18958n) {
            return;
        }
        if (!(dVar instanceof e) && dVar.A() && a(dVar)) {
            e.c0(dVar, abstractC0141b, new b.a());
        }
        c h10 = dVar.h(c.a.TOP);
        c h11 = dVar.h(c.a.BOTTOM);
        int c10 = h10.c();
        int c11 = h11.c();
        HashSet<c> hashSet = h10.f18916a;
        if (hashSet != null && h10.f18918c) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                c next = it.next();
                d dVar2 = next.f18919d;
                int i11 = i10 + 1;
                boolean a10 = a(dVar2);
                if (dVar2.A() && a10) {
                    e.c0(dVar2, abstractC0141b, new b.a());
                }
                c cVar5 = dVar2.K;
                boolean z10 = (next == cVar5 && (cVar4 = dVar2.M.f18921f) != null && cVar4.f18918c) || (next == dVar2.M && (cVar3 = cVar5.f18921f) != null && cVar3.f18918c);
                int[] iArr = dVar2.U;
                if (iArr[1] != 3 || a10) {
                    if (!dVar2.A()) {
                        c cVar6 = dVar2.K;
                        if (next == cVar6 && dVar2.M.f18921f == null) {
                            int d5 = cVar6.d() + c10;
                            dVar2.K(d5, dVar2.k() + d5);
                        } else {
                            c cVar7 = dVar2.M;
                            if (next == cVar7 && cVar6.f18921f == null) {
                                int d10 = c10 - cVar7.d();
                                dVar2.K(d10 - dVar2.k(), d10);
                            } else if (z10 && !dVar2.z()) {
                                e(i11, abstractC0141b, dVar2);
                            }
                        }
                        g(i11, dVar2, abstractC0141b);
                    }
                } else if (iArr[1] == 3 && dVar2.y >= 0 && dVar2.f18971x >= 0 && (dVar2.f18949i0 == 8 || (dVar2.f18966s == 0 && dVar2.Y == 0.0f))) {
                    if (!dVar2.z() && !dVar2.G && z10 && !dVar2.z()) {
                        f(i11, dVar, abstractC0141b, dVar2);
                    }
                }
            }
        }
        if (dVar instanceof f) {
            return;
        }
        HashSet<c> hashSet2 = h11.f18916a;
        if (hashSet2 != null && h11.f18918c) {
            Iterator<c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                c next2 = it2.next();
                d dVar3 = next2.f18919d;
                int i12 = i10 + 1;
                boolean a11 = a(dVar3);
                if (dVar3.A() && a11) {
                    e.c0(dVar3, abstractC0141b, new b.a());
                }
                c cVar8 = dVar3.K;
                boolean z11 = (next2 == cVar8 && (cVar2 = dVar3.M.f18921f) != null && cVar2.f18918c) || (next2 == dVar3.M && (cVar = cVar8.f18921f) != null && cVar.f18918c);
                int[] iArr2 = dVar3.U;
                if (iArr2[1] != 3 || a11) {
                    if (!dVar3.A()) {
                        c cVar9 = dVar3.K;
                        if (next2 == cVar9 && dVar3.M.f18921f == null) {
                            int d11 = cVar9.d() + c11;
                            dVar3.K(d11, dVar3.k() + d11);
                        } else {
                            c cVar10 = dVar3.M;
                            if (next2 == cVar10 && cVar9.f18921f == null) {
                                int d12 = c11 - cVar10.d();
                                dVar3.K(d12 - dVar3.k(), d12);
                            } else if (z11 && !dVar3.z()) {
                                e(i12, abstractC0141b, dVar3);
                            }
                        }
                        g(i12, dVar3, abstractC0141b);
                    }
                } else if (iArr2[1] == 3 && dVar3.y >= 0 && dVar3.f18971x >= 0) {
                    if (dVar3.f18949i0 != 8) {
                        if (dVar3.f18966s == 0) {
                            if (dVar3.Y == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.z() && !dVar3.G && z11 && !dVar3.z()) {
                        f(i12, dVar, abstractC0141b, dVar3);
                    }
                }
            }
        }
        c h12 = dVar.h(c.a.BASELINE);
        if (h12.f18916a != null && h12.f18918c) {
            int c12 = h12.c();
            Iterator<c> it3 = h12.f18916a.iterator();
            while (it3.hasNext()) {
                c next3 = it3.next();
                d dVar4 = next3.f18919d;
                int i13 = i10 + 1;
                boolean a12 = a(dVar4);
                if (dVar4.A() && a12) {
                    e.c0(dVar4, abstractC0141b, new b.a());
                }
                if (dVar4.U[1] != 3 || a12) {
                    if (!dVar4.A() && next3 == dVar4.N) {
                        int d13 = next3.d() + c12;
                        if (dVar4.E) {
                            int i14 = d13 - dVar4.f18937c0;
                            int i15 = dVar4.X + i14;
                            dVar4.f18935b0 = i14;
                            dVar4.K.j(i14);
                            dVar4.M.j(i15);
                            dVar4.N.j(d13);
                            dVar4.f18954l = true;
                        }
                        g(i13, dVar4, abstractC0141b);
                    }
                }
            }
        }
        dVar.f18958n = true;
    }
}
