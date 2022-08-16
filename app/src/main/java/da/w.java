package da;

import da.a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import r9.f0;
import r9.u;
import r9.y;

/* loaded from: classes.dex */
public abstract class w<T> {

    /* loaded from: classes.dex */
    public static final class a<T> extends w<T> {

        /* renamed from: a */
        public final Method f4084a;

        /* renamed from: b */
        public final int f4085b;

        /* renamed from: c */
        public final da.f<T, f0> f4086c;

        public a(Method method, int i10, da.f<T, f0> fVar) {
            this.f4084a = method;
            this.f4085b = i10;
            this.f4086c = fVar;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable T t10) {
            if (t10 != null) {
                try {
                    yVar.f4139k = this.f4086c.b(t10);
                    return;
                } catch (IOException e10) {
                    Method method = this.f4084a;
                    int i10 = this.f4085b;
                    throw f0.l(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            }
            throw f0.k(this.f4084a, this.f4085b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends w<T> {

        /* renamed from: a */
        public final String f4087a;

        /* renamed from: b */
        public final da.f<T, String> f4088b;

        /* renamed from: c */
        public final boolean f4089c;

        public b(String str, boolean z10) {
            a.d dVar = a.d.f4001s;
            Objects.requireNonNull(str, "name == null");
            this.f4087a = str;
            this.f4088b = dVar;
            this.f4089c = z10;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable T t10) {
            String b10;
            if (t10 == null || (b10 = this.f4088b.b(t10)) == null) {
                return;
            }
            yVar.a(this.f4087a, b10, this.f4089c);
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> extends w<Map<String, T>> {

        /* renamed from: a */
        public final Method f4090a;

        /* renamed from: b */
        public final int f4091b;

        /* renamed from: c */
        public final boolean f4092c;

        public c(Method method, int i10, boolean z10) {
            this.f4090a = method;
            this.f4091b = i10;
            this.f4092c = z10;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw f0.k(this.f4090a, this.f4091b, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value != null) {
                        String obj2 = value.toString();
                        if (obj2 == null) {
                            Method method = this.f4090a;
                            int i10 = this.f4091b;
                            throw f0.k(method, i10, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                        }
                        yVar.a(str, obj2, this.f4092c);
                    } else {
                        throw f0.k(this.f4090a, this.f4091b, e0.d.a("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                }
                return;
            }
            throw f0.k(this.f4090a, this.f4091b, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> extends w<T> {

        /* renamed from: a */
        public final String f4093a;

        /* renamed from: b */
        public final da.f<T, String> f4094b;

        public d(String str) {
            a.d dVar = a.d.f4001s;
            Objects.requireNonNull(str, "name == null");
            this.f4093a = str;
            this.f4094b = dVar;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable T t10) {
            String b10;
            if (t10 == null || (b10 = this.f4094b.b(t10)) == null) {
                return;
            }
            yVar.b(this.f4093a, b10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<T> extends w<Map<String, T>> {

        /* renamed from: a */
        public final Method f4095a;

        /* renamed from: b */
        public final int f4096b;

        public e(Method method, int i10) {
            this.f4095a = method;
            this.f4096b = i10;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw f0.k(this.f4095a, this.f4096b, "Header map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value != null) {
                        yVar.b(str, value.toString());
                    } else {
                        throw f0.k(this.f4095a, this.f4096b, e0.d.a("Header map contained null value for key '", str, "'."), new Object[0]);
                    }
                }
                return;
            }
            throw f0.k(this.f4095a, this.f4096b, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends w<u> {

        /* renamed from: a */
        public final Method f4097a;

        /* renamed from: b */
        public final int f4098b;

        public f(Method method, int i10) {
            this.f4097a = method;
            this.f4098b = i10;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable u uVar) {
            u uVar2 = uVar;
            if (uVar2 != null) {
                u.a aVar = yVar.f4134f;
                Objects.requireNonNull(aVar);
                int length = uVar2.f17472a.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    aVar.c(uVar2.d(i10), uVar2.g(i10));
                }
                return;
            }
            throw f0.k(this.f4097a, this.f4098b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<T> extends w<T> {

        /* renamed from: a */
        public final Method f4099a;

        /* renamed from: b */
        public final int f4100b;

        /* renamed from: c */
        public final u f4101c;

        /* renamed from: d */
        public final da.f<T, f0> f4102d;

        public g(Method method, int i10, u uVar, da.f<T, f0> fVar) {
            this.f4099a = method;
            this.f4100b = i10;
            this.f4101c = uVar;
            this.f4102d = fVar;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable T t10) {
            if (t10 == null) {
                return;
            }
            try {
                yVar.c(this.f4101c, this.f4102d.b(t10));
            } catch (IOException e10) {
                Method method = this.f4099a;
                int i10 = this.f4100b;
                throw f0.k(method, i10, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h<T> extends w<Map<String, T>> {

        /* renamed from: a */
        public final Method f4103a;

        /* renamed from: b */
        public final int f4104b;

        /* renamed from: c */
        public final da.f<T, f0> f4105c;

        /* renamed from: d */
        public final String f4106d;

        public h(Method method, int i10, da.f<T, f0> fVar, String str) {
            this.f4103a = method;
            this.f4104b = i10;
            this.f4105c = fVar;
            this.f4106d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // da.w
        public final void a(y yVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw f0.k(this.f4103a, this.f4104b, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw f0.k(this.f4103a, this.f4104b, e0.d.a("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    yVar.c(u.f("Content-Disposition", e0.d.a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f4106d), (f0) this.f4105c.b(value));
                }
                return;
            }
            throw f0.k(this.f4103a, this.f4104b, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class i<T> extends w<T> {

        /* renamed from: a */
        public final Method f4107a;

        /* renamed from: b */
        public final int f4108b;

        /* renamed from: c */
        public final String f4109c;

        /* renamed from: d */
        public final da.f<T, String> f4110d;

        /* renamed from: e */
        public final boolean f4111e;

        public i(Method method, int i10, String str, boolean z10) {
            a.d dVar = a.d.f4001s;
            this.f4107a = method;
            this.f4108b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f4109c = str;
            this.f4110d = dVar;
            this.f4111e = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
        @Override // da.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(da.y r18, @javax.annotation.Nullable T r19) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: da.w.i.a(da.y, java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class j<T> extends w<T> {

        /* renamed from: a */
        public final String f4112a;

        /* renamed from: b */
        public final da.f<T, String> f4113b;

        /* renamed from: c */
        public final boolean f4114c;

        public j(String str, boolean z10) {
            a.d dVar = a.d.f4001s;
            Objects.requireNonNull(str, "name == null");
            this.f4112a = str;
            this.f4113b = dVar;
            this.f4114c = z10;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable T t10) {
            String b10;
            if (t10 == null || (b10 = this.f4113b.b(t10)) == null) {
                return;
            }
            yVar.d(this.f4112a, b10, this.f4114c);
        }
    }

    /* loaded from: classes.dex */
    public static final class k<T> extends w<Map<String, T>> {

        /* renamed from: a */
        public final Method f4115a;

        /* renamed from: b */
        public final int f4116b;

        /* renamed from: c */
        public final boolean f4117c;

        public k(Method method, int i10, boolean z10) {
            this.f4115a = method;
            this.f4116b = i10;
            this.f4117c = z10;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw f0.k(this.f4115a, this.f4116b, "Query map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value != null) {
                        String obj2 = value.toString();
                        if (obj2 == null) {
                            Method method = this.f4115a;
                            int i10 = this.f4116b;
                            throw f0.k(method, i10, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                        }
                        yVar.d(str, obj2, this.f4117c);
                    } else {
                        throw f0.k(this.f4115a, this.f4116b, e0.d.a("Query map contained null value for key '", str, "'."), new Object[0]);
                    }
                }
                return;
            }
            throw f0.k(this.f4115a, this.f4116b, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class l<T> extends w<T> {

        /* renamed from: a */
        public final boolean f4118a;

        public l(boolean z10) {
            this.f4118a = z10;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable T t10) {
            if (t10 == null) {
                return;
            }
            yVar.d(t10.toString(), null, this.f4118a);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends w<y.b> {

        /* renamed from: a */
        public static final m f4119a = new m();

        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<r9.y$b>, java.util.ArrayList] */
        @Override // da.w
        public final void a(y yVar, @Nullable y.b bVar) {
            y.b bVar2 = bVar;
            if (bVar2 != null) {
                y.a aVar = yVar.f4137i;
                Objects.requireNonNull(aVar);
                aVar.f17508c.add(bVar2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends w<Object> {

        /* renamed from: a */
        public final Method f4120a;

        /* renamed from: b */
        public final int f4121b;

        public n(Method method, int i10) {
            this.f4120a = method;
            this.f4121b = i10;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable Object obj) {
            if (obj != null) {
                yVar.f4131c = obj.toString();
                return;
            }
            throw f0.k(this.f4120a, this.f4121b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class o<T> extends w<T> {

        /* renamed from: a */
        public final Class<T> f4122a;

        public o(Class<T> cls) {
            this.f4122a = cls;
        }

        @Override // da.w
        public final void a(y yVar, @Nullable T t10) {
            yVar.f4133e.f(this.f4122a, t10);
        }
    }

    public abstract void a(y yVar, @Nullable T t10);
}
