package androidx.recyclerview.widget;

import androidx.recyclerview.widget.p;
import java.util.ArrayList;
import java.util.List;
import l0.e;

/* loaded from: classes.dex */
public final class a implements p.a {

    /* renamed from: d */
    public final AbstractC0024a f2070d;

    /* renamed from: a */
    public e f2067a = new e(30, 0);

    /* renamed from: b */
    public final ArrayList<b> f2068b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<b> f2069c = new ArrayList<>();

    /* renamed from: f */
    public int f2072f = 0;

    /* renamed from: e */
    public final p f2071e = new p(this);

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0024a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f2073a;

        /* renamed from: b */
        public int f2074b;

        /* renamed from: c */
        public Object f2075c;

        /* renamed from: d */
        public int f2076d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f2073a = i10;
            this.f2074b = i11;
            this.f2076d = i12;
            this.f2075c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f2073a;
            if (i10 != bVar.f2073a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f2076d - this.f2074b) == 1 && this.f2076d == bVar.f2074b && this.f2074b == bVar.f2076d) {
                return true;
            }
            if (this.f2076d != bVar.f2076d || this.f2074b != bVar.f2074b) {
                return false;
            }
            Object obj2 = this.f2075c;
            Object obj3 = bVar.f2075c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f2073a * 31) + this.f2074b) * 31) + this.f2076d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i10 = this.f2073a;
            sb.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f2074b);
            sb.append("c:");
            sb.append(this.f2076d);
            sb.append(",p:");
            sb.append(this.f2075c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(AbstractC0024a abstractC0024a) {
        this.f2070d = abstractC0024a;
    }

    public final boolean a(int i10) {
        int size = this.f2069c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f2069c.get(i11);
            int i12 = bVar.f2073a;
            if (i12 == 8) {
                if (f(bVar.f2076d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f2074b;
                int i14 = bVar.f2076d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        int size = this.f2069c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((w) this.f2070d).a(this.f2069c.get(i10));
        }
        l(this.f2069c);
        this.f2072f = 0;
    }

    public final void c() {
        b();
        int size = this.f2068b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f2068b.get(i10);
            int i11 = bVar.f2073a;
            if (i11 == 1) {
                ((w) this.f2070d).a(bVar);
                ((w) this.f2070d).d(bVar.f2074b, bVar.f2076d);
            } else if (i11 == 2) {
                ((w) this.f2070d).a(bVar);
                AbstractC0024a abstractC0024a = this.f2070d;
                int i12 = bVar.f2074b;
                int i13 = bVar.f2076d;
                w wVar = (w) abstractC0024a;
                wVar.f2217a.S(i12, i13, true);
                RecyclerView recyclerView = wVar.f2217a;
                recyclerView.A0 = true;
                recyclerView.x0.f2013c += i13;
            } else if (i11 == 4) {
                ((w) this.f2070d).a(bVar);
                ((w) this.f2070d).c(bVar.f2074b, bVar.f2076d, bVar.f2075c);
            } else if (i11 == 8) {
                ((w) this.f2070d).a(bVar);
                ((w) this.f2070d).e(bVar.f2074b, bVar.f2076d);
            }
        }
        l(this.f2068b);
        this.f2072f = 0;
    }

    public final void d(b bVar) {
        int i10;
        int i11 = bVar.f2073a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m10 = m(bVar.f2074b, i11);
        int i12 = bVar.f2074b;
        int i13 = bVar.f2073a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f2076d; i15++) {
            int m11 = m((i10 * i15) + bVar.f2074b, bVar.f2073a);
            int i16 = bVar.f2073a;
            if (i16 == 2 ? m11 == m10 : i16 == 4 && m11 == m10 + 1) {
                i14++;
            } else {
                b h10 = h(i16, m10, i14, bVar.f2075c);
                e(h10, i12);
                k(h10);
                if (bVar.f2073a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                m10 = m11;
            }
        }
        Object obj = bVar.f2075c;
        k(bVar);
        if (i14 <= 0) {
            return;
        }
        b h11 = h(bVar.f2073a, m10, i14, obj);
        e(h11, i12);
        k(h11);
    }

    public final void e(b bVar, int i10) {
        ((w) this.f2070d).a(bVar);
        int i11 = bVar.f2073a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((w) this.f2070d).c(i10, bVar.f2076d, bVar.f2075c);
            return;
        }
        AbstractC0024a abstractC0024a = this.f2070d;
        int i12 = bVar.f2076d;
        w wVar = (w) abstractC0024a;
        wVar.f2217a.S(i10, i12, true);
        RecyclerView recyclerView = wVar.f2217a;
        recyclerView.A0 = true;
        recyclerView.x0.f2013c += i12;
    }

    public final int f(int i10, int i11) {
        int size = this.f2069c.size();
        while (i11 < size) {
            b bVar = this.f2069c.get(i11);
            int i12 = bVar.f2073a;
            if (i12 == 8) {
                int i13 = bVar.f2074b;
                if (i13 == i10) {
                    i10 = bVar.f2076d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f2076d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f2074b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f2076d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f2076d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f2068b.size() > 0;
    }

    public final b h(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f2067a.a();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f2073a = i10;
        bVar.f2074b = i11;
        bVar.f2076d = i12;
        bVar.f2075c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f2069c.add(bVar);
        int i10 = bVar.f2073a;
        if (i10 == 1) {
            ((w) this.f2070d).d(bVar.f2074b, bVar.f2076d);
        } else if (i10 == 2) {
            AbstractC0024a abstractC0024a = this.f2070d;
            w wVar = (w) abstractC0024a;
            wVar.f2217a.S(bVar.f2074b, bVar.f2076d, false);
            wVar.f2217a.A0 = true;
        } else if (i10 == 4) {
            ((w) this.f2070d).c(bVar.f2074b, bVar.f2076d, bVar.f2075c);
        } else if (i10 == 8) {
            ((w) this.f2070d).e(bVar.f2074b, bVar.f2076d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
        if (r4 > r12.f2074b) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0175, code lost:
        if (r4 >= r12.f2074b) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0177, code lost:
        r11.f2076d = r4 - r12.f2076d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017c, code lost:
        r2.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0183, code lost:
        if (r11.f2074b == r11.f2076d) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
        r2.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0189, code lost:
        r2.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018c, code lost:
        if (r6 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018e, code lost:
        r2.add(r3, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f2075c = null;
        this.f2067a.b(bVar);
    }

    public final void l(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k(list.get(i10));
        }
        list.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f2069c.size() - 1; size >= 0; size--) {
            b bVar = this.f2069c.get(size);
            int i18 = bVar.f2073a;
            if (i18 == 8) {
                int i19 = bVar.f2074b;
                int i20 = bVar.f2076d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f2074b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f2074b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f2076d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f2076d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f2074b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f2074b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f2074b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f2076d;
                } else if (i18 == 2) {
                    i10 += bVar.f2076d;
                }
            }
        }
        for (int size2 = this.f2069c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2069c.get(size2);
            if (bVar2.f2073a == 8) {
                int i22 = bVar2.f2076d;
                if (i22 != bVar2.f2074b && i22 >= 0) {
                }
                this.f2069c.remove(size2);
                k(bVar2);
            } else {
                if (bVar2.f2076d > 0) {
                }
                this.f2069c.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
