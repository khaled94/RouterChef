package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    public final b f2086a;

    /* renamed from: b */
    public a f2087b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f2088a = 0;

        /* renamed from: b */
        public int f2089b;

        /* renamed from: c */
        public int f2090c;

        /* renamed from: d */
        public int f2091d;

        /* renamed from: e */
        public int f2092e;

        public final void a(int i10) {
            this.f2088a = i10 | this.f2088a;
        }

        public final boolean b() {
            int i10 = this.f2088a;
            if ((i10 & 7) == 0 || (i10 & (c(this.f2091d, this.f2089b) << 0)) != 0) {
                int i11 = this.f2088a;
                if ((i11 & 112) != 0 && (i11 & (c(this.f2091d, this.f2090c) << 4)) == 0) {
                    return false;
                }
                int i12 = this.f2088a;
                if ((i12 & 1792) != 0 && (i12 & (c(this.f2092e, this.f2089b) << 8)) == 0) {
                    return false;
                }
                int i13 = this.f2088a;
                return (i13 & 28672) == 0 || (i13 & (c(this.f2092e, this.f2090c) << 12)) != 0;
            }
            return false;
        }

        public final int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b(View view);

        View c(int i10);

        int d();

        int e(View view);
    }

    public b0(b bVar) {
        this.f2086a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int d5 = this.f2086a.d();
        int a10 = this.f2086a.a();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View c10 = this.f2086a.c(i10);
            int b10 = this.f2086a.b(c10);
            int e10 = this.f2086a.e(c10);
            a aVar = this.f2087b;
            aVar.f2089b = d5;
            aVar.f2090c = a10;
            aVar.f2091d = b10;
            aVar.f2092e = e10;
            if (i12 != 0) {
                aVar.f2088a = 0;
                aVar.a(i12);
                if (this.f2087b.b()) {
                    return c10;
                }
            }
            if (i13 != 0) {
                a aVar2 = this.f2087b;
                aVar2.f2088a = 0;
                aVar2.a(i13);
                if (this.f2087b.b()) {
                    view = c10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        a aVar = this.f2087b;
        int d5 = this.f2086a.d();
        int a10 = this.f2086a.a();
        int b10 = this.f2086a.b(view);
        int e10 = this.f2086a.e(view);
        aVar.f2089b = d5;
        aVar.f2090c = a10;
        aVar.f2091d = b10;
        aVar.f2092e = e10;
        a aVar2 = this.f2087b;
        aVar2.f2088a = 0;
        aVar2.a(24579);
        return this.f2087b.b();
    }
}
