package r9;

import d.c;
import e0.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import r9.u;
import r9.v;
import s9.e;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    public final v f17311a;

    /* renamed from: b */
    public final String f17312b;

    /* renamed from: c */
    public final u f17313c;
    @Nullable

    /* renamed from: d */
    public final f0 f17314d;

    /* renamed from: e */
    public final Map<Class<?>, Object> f17315e;
    @Nullable

    /* renamed from: f */
    public volatile e f17316f;

    /* loaded from: classes.dex */
    public static class a {
        @Nullable

        /* renamed from: a */
        public v f17317a;

        /* renamed from: b */
        public String f17318b;

        /* renamed from: c */
        public u.a f17319c;
        @Nullable

        /* renamed from: d */
        public f0 f17320d;

        /* renamed from: e */
        public Map<Class<?>, Object> f17321e;

        public a() {
            this.f17321e = Collections.emptyMap();
            this.f17318b = "GET";
            this.f17319c = new u.a();
        }

        public a(c0 c0Var) {
            this.f17321e = Collections.emptyMap();
            this.f17317a = c0Var.f17311a;
            this.f17318b = c0Var.f17312b;
            this.f17320d = c0Var.f17314d;
            this.f17321e = c0Var.f17315e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(c0Var.f17315e);
            this.f17319c = c0Var.f17313c.e();
        }

        public final c0 a() {
            if (this.f17317a != null) {
                return new c0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final a b(String str, String str2) {
            u.a aVar = this.f17319c;
            Objects.requireNonNull(aVar);
            u.a(str);
            u.b(str2, str);
            aVar.e(str);
            aVar.c(str, str2);
            return this;
        }

        public final a c(u uVar) {
            this.f17319c = uVar.e();
            return this;
        }

        public final a d(String str, @Nullable f0 f0Var) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (f0Var != null && !c.d(str)) {
                    throw new IllegalArgumentException(d.a("method ", str, " must not have a request body."));
                }
                if (f0Var == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        throw new IllegalArgumentException(d.a("method ", str, " must have a request body."));
                    }
                }
                this.f17318b = str;
                this.f17320d = f0Var;
                return this;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }

        public final a e(String str) {
            this.f17319c.e(str);
            return this;
        }

        public final <T> a f(Class<? super T> cls, @Nullable T t10) {
            Objects.requireNonNull(cls, "type == null");
            if (t10 == null) {
                this.f17321e.remove(cls);
            } else {
                if (this.f17321e.isEmpty()) {
                    this.f17321e = new LinkedHashMap();
                }
                this.f17321e.put(cls, cls.cast(t10));
            }
            return this;
        }

        public final a g(String str) {
            int i10;
            StringBuilder sb;
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                sb = androidx.activity.result.a.c("http:");
                i10 = 3;
            } else {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    sb = androidx.activity.result.a.c("https:");
                    i10 = 4;
                }
                v.a aVar = new v.a();
                aVar.c(null, str);
                this.f17317a = aVar.a();
                return this;
            }
            sb.append(str.substring(i10));
            str = sb.toString();
            v.a aVar2 = new v.a();
            aVar2.c(null, str);
            this.f17317a = aVar2.a();
            return this;
        }

        public final a h(v vVar) {
            Objects.requireNonNull(vVar, "url == null");
            this.f17317a = vVar;
            return this;
        }
    }

    public c0(a aVar) {
        this.f17311a = aVar.f17317a;
        this.f17312b = aVar.f17318b;
        this.f17313c = new u(aVar.f17319c);
        this.f17314d = aVar.f17320d;
        Map<Class<?>, Object> map = aVar.f17321e;
        byte[] bArr = e.f18396a;
        this.f17315e = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final e a() {
        e eVar = this.f17316f;
        if (eVar != null) {
            return eVar;
        }
        e a10 = e.a(this.f17313c);
        this.f17316f = a10;
        return a10;
    }

    @Nullable
    public final String b(String str) {
        return this.f17313c.c(str);
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Request{method=");
        c10.append(this.f17312b);
        c10.append(", url=");
        c10.append(this.f17311a);
        c10.append(", tags=");
        c10.append(this.f17315e);
        c10.append('}');
        return c10.toString();
    }
}
