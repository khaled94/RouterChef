package j7;

import h7.d;
import h7.f;
import h7.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class e implements i7.a<e> {

    /* renamed from: e */
    public static final a f5480e = new a();

    /* renamed from: a */
    public final Map<Class<?>, d<?>> f5481a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, f<?>> f5482b = new HashMap();

    /* renamed from: c */
    public d<Object> f5483c = j7.a.f5476a;

    /* renamed from: d */
    public boolean f5484d = false;

    /* loaded from: classes.dex */
    public static final class a implements f<Date> {

        /* renamed from: a */
        public static final SimpleDateFormat f5485a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f5485a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // h7.a
        public final void a(Object obj, g gVar) {
            gVar.c(f5485a.format((Date) obj));
        }
    }

    public e() {
        b(String.class, b.f5477a);
        b(Boolean.class, c.f5478a);
        b(Date.class, f5480e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, h7.d<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, h7.f<?>>, java.util.HashMap] */
    @Override // i7.a
    public final e a(Class cls, d dVar) {
        this.f5481a.put(cls, dVar);
        this.f5482b.remove(cls);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, h7.f<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, h7.d<?>>, java.util.HashMap] */
    public final <T> e b(Class<T> cls, f<? super T> fVar) {
        this.f5482b.put(cls, fVar);
        this.f5481a.remove(cls);
        return this;
    }
}
