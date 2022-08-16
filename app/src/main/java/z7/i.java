package z7;

import e8.c;
import java.util.Collections;
import java.util.List;
import x7.h;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class i implements x, Cloneable {

    /* renamed from: u */
    public static final i f21021u = new i();

    /* renamed from: s */
    public List<x7.a> f21022s = Collections.emptyList();

    /* renamed from: t */
    public List<x7.a> f21023t = Collections.emptyList();

    /* loaded from: classes.dex */
    public class a extends w<T> {

        /* renamed from: a */
        public w<T> f21024a;

        /* renamed from: b */
        public final /* synthetic */ boolean f21025b;

        /* renamed from: c */
        public final /* synthetic */ boolean f21026c;

        /* renamed from: d */
        public final /* synthetic */ h f21027d;

        /* renamed from: e */
        public final /* synthetic */ d8.a f21028e;

        public a(boolean z10, boolean z11, h hVar, d8.a aVar) {
            i.this = r1;
            this.f21025b = z10;
            this.f21026c = z11;
            this.f21027d = hVar;
            this.f21028e = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
        @Override // x7.w
        public final T a(e8.a aVar) {
            if (this.f21025b) {
                aVar.C0();
                return null;
            }
            w wVar = this.f21024a;
            if (wVar == null) {
                wVar = this.f21027d.d(i.this, this.f21028e);
                this.f21024a = wVar;
            }
            return wVar.a(aVar);
        }

        @Override // x7.w
        public final void b(c cVar, T t10) {
            if (this.f21026c) {
                cVar.Z();
                return;
            }
            w wVar = this.f21024a;
            if (wVar == null) {
                wVar = this.f21027d.d(i.this, this.f21028e);
                this.f21024a = wVar;
            }
            wVar.b(cVar, t10);
        }
    }

    @Override // x7.x
    public final <T> w<T> a(h hVar, d8.a<T> aVar) {
        Class<? super T> cls = aVar.f3994a;
        boolean c10 = c(cls);
        boolean z10 = c10 || b(cls, true);
        boolean z11 = c10 || b(cls, false);
        if (z10 || z11) {
            return new a(z11, z10, hVar, aVar);
        }
        return null;
    }

    public final boolean b(Class<?> cls, boolean z10) {
        for (x7.a aVar : z10 ? this.f21022s : this.f21023t) {
            if (aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls)) {
            if (!((cls.getModifiers() & 8) != 0) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
