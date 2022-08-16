package d1;

import androidx.appcompat.widget.p;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import c1.a;
import e9.f;
import java.io.PrintWriter;
import java.util.Objects;
import r.h;

/* loaded from: classes.dex */
public final class b extends d1.a {

    /* renamed from: a */
    public final l f3730a;

    /* renamed from: b */
    public final C0055b f3731b;

    /* loaded from: classes.dex */
    public static class a<D> extends r<D> {
        @Override // androidx.lifecycle.LiveData
        public final void e() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void g(s<? super D> sVar) {
            super.g(sVar);
        }

        @Override // androidx.lifecycle.r, androidx.lifecycle.LiveData
        public final void h(D d5) {
            super.h(d5);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            p.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: d1.b$b */
    /* loaded from: classes.dex */
    public static class C0055b extends e0 {

        /* renamed from: d */
        public static final a f3732d = new a();

        /* renamed from: c */
        public h<a> f3733c = new h<>();

        /* renamed from: d1.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements g0.a {
            @Override // androidx.lifecycle.g0.a
            public final <T extends e0> T a(Class<T> cls) {
                return new C0055b();
            }

            @Override // androidx.lifecycle.g0.a
            public final e0 b(Class cls, c1.a aVar) {
                return a(cls);
            }
        }

        @Override // androidx.lifecycle.e0
        public final void a() {
            h<a> hVar = this.f3733c;
            int i10 = hVar.f17205u;
            if (i10 <= 0) {
                Object[] objArr = hVar.f17204t;
                for (int i11 = 0; i11 < i10; i11++) {
                    objArr[i11] = null;
                }
                hVar.f17205u = 0;
                return;
            }
            Objects.requireNonNull((a) hVar.f17204t[0]);
            throw null;
        }
    }

    public b(l lVar, i0 i0Var) {
        this.f3730a = lVar;
        C0055b.a aVar = C0055b.f3732d;
        f.e(i0Var, "store");
        this.f3731b = (C0055b) new g0(i0Var, aVar, a.C0038a.f2605b).a(C0055b.class);
    }

    @Override // d1.a
    @Deprecated
    public final void a(String str, PrintWriter printWriter) {
        C0055b c0055b = this.f3731b;
        if (c0055b.f3733c.f17205u > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            h<a> hVar = c0055b.f3733c;
            if (hVar.f17205u <= 0) {
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0055b.f3733c.f17203s[0]);
            printWriter.print(": ");
            printWriter.println(((a) hVar.f17204t[0]).toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        p.a(this.f3730a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
