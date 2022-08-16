package da;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import r9.u;
import r9.v;
import r9.x;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    public final Method f4142a;

    /* renamed from: b */
    public final v f4143b;

    /* renamed from: c */
    public final String f4144c;
    @Nullable

    /* renamed from: d */
    public final String f4145d;
    @Nullable

    /* renamed from: e */
    public final u f4146e;
    @Nullable

    /* renamed from: f */
    public final x f4147f;

    /* renamed from: g */
    public final boolean f4148g;

    /* renamed from: h */
    public final boolean f4149h;

    /* renamed from: i */
    public final boolean f4150i;

    /* renamed from: j */
    public final w<?>[] f4151j;

    /* renamed from: k */
    public final boolean f4152k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: x */
        public static final Pattern f4153x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final b0 f4154a;

        /* renamed from: b */
        public final Method f4155b;

        /* renamed from: c */
        public final Annotation[] f4156c;

        /* renamed from: d */
        public final Annotation[][] f4157d;

        /* renamed from: e */
        public final Type[] f4158e;

        /* renamed from: f */
        public boolean f4159f;

        /* renamed from: g */
        public boolean f4160g;

        /* renamed from: h */
        public boolean f4161h;

        /* renamed from: i */
        public boolean f4162i;

        /* renamed from: j */
        public boolean f4163j;

        /* renamed from: k */
        public boolean f4164k;

        /* renamed from: l */
        public boolean f4165l;

        /* renamed from: m */
        public boolean f4166m;
        @Nullable

        /* renamed from: n */
        public String f4167n;

        /* renamed from: o */
        public boolean f4168o;
        public boolean p;

        /* renamed from: q */
        public boolean f4169q;
        @Nullable

        /* renamed from: r */
        public String f4170r;
        @Nullable

        /* renamed from: s */
        public u f4171s;
        @Nullable

        /* renamed from: t */
        public x f4172t;
        @Nullable

        /* renamed from: u */
        public Set<String> f4173u;
        @Nullable

        /* renamed from: v */
        public w<?>[] f4174v;

        /* renamed from: w */
        public boolean f4175w;

        public a(b0 b0Var, Method method) {
            this.f4154a = b0Var;
            this.f4155b = method;
            this.f4156c = method.getAnnotations();
            this.f4158e = method.getGenericParameterTypes();
            this.f4157d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f4167n;
            if (str3 == null) {
                this.f4167n = str;
                this.f4168o = z10;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (f4153x.matcher(substring).find()) {
                        throw f0.j(this.f4155b, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f4170r = str2;
                Matcher matcher = f4153x.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.f4173u = linkedHashSet;
                return;
            }
            throw f0.j(this.f4155b, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i10, Type type) {
            if (!f0.h(type)) {
                return;
            }
            throw f0.k(this.f4155b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public z(a aVar) {
        this.f4142a = aVar.f4155b;
        this.f4143b = aVar.f4154a.f4008c;
        this.f4144c = aVar.f4167n;
        this.f4145d = aVar.f4170r;
        this.f4146e = aVar.f4171s;
        this.f4147f = aVar.f4172t;
        this.f4148g = aVar.f4168o;
        this.f4149h = aVar.p;
        this.f4150i = aVar.f4169q;
        this.f4151j = aVar.f4174v;
        this.f4152k = aVar.f4175w;
    }
}
