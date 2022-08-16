package j7;

import android.util.Base64;
import android.util.JsonWriter;
import h7.b;
import h7.c;
import h7.d;
import h7.e;
import h7.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements e, g {

    /* renamed from: a */
    public boolean f5486a = true;

    /* renamed from: b */
    public final JsonWriter f5487b;

    /* renamed from: c */
    public final Map<Class<?>, d<?>> f5488c;

    /* renamed from: d */
    public final Map<Class<?>, h7.f<?>> f5489d;

    /* renamed from: e */
    public final d<Object> f5490e;

    /* renamed from: f */
    public final boolean f5491f;

    public f(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, h7.f<?>> map2, d<Object> dVar, boolean z10) {
        this.f5487b = new JsonWriter(writer);
        this.f5488c = map;
        this.f5489d = map2;
        this.f5490e = dVar;
        this.f5491f = z10;
    }

    @Override // h7.e
    public final e a(c cVar, long j3) {
        String str = cVar.f5135a;
        i();
        this.f5487b.name(str);
        i();
        this.f5487b.value(j3);
        return this;
    }

    @Override // h7.e
    public final e b(c cVar, int i10) {
        String str = cVar.f5135a;
        i();
        this.f5487b.name(str);
        i();
        this.f5487b.value(i10);
        return this;
    }

    @Override // h7.g
    public final g c(String str) {
        i();
        this.f5487b.value(str);
        return this;
    }

    @Override // h7.g
    public final g d(boolean z10) {
        i();
        this.f5487b.value(z10);
        return this;
    }

    @Override // h7.e
    public final e e(c cVar, Object obj) {
        return h(cVar.f5135a, obj);
    }

    @Override // h7.e
    public final e f(c cVar, boolean z10) {
        String str = cVar.f5135a;
        i();
        this.f5487b.name(str);
        i();
        this.f5487b.value(z10);
        return this;
    }

    public final f g(Object obj) {
        if (obj == null) {
            this.f5487b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f5487b.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
            if (!obj.getClass().isArray()) {
                if (obj instanceof Collection) {
                    this.f5487b.beginArray();
                    for (Object obj2 : (Collection) obj) {
                        g(obj2);
                    }
                    this.f5487b.endArray();
                    return this;
                } else if (obj instanceof Map) {
                    this.f5487b.beginObject();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        Object key = entry.getKey();
                        try {
                            h((String) key, entry.getValue());
                        } catch (ClassCastException e10) {
                            throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                        }
                    }
                    this.f5487b.endObject();
                    return this;
                } else {
                    d<?> dVar = this.f5488c.get(obj.getClass());
                    if (dVar != null) {
                        this.f5487b.beginObject();
                        dVar.a(obj, this);
                        this.f5487b.endObject();
                        return this;
                    }
                    h7.f<?> fVar = this.f5489d.get(obj.getClass());
                    if (fVar != null) {
                        fVar.a(obj, this);
                        return this;
                    } else if (obj instanceof Enum) {
                        String name = ((Enum) obj).name();
                        i();
                        this.f5487b.value(name);
                        return this;
                    } else {
                        d<Object> dVar2 = this.f5490e;
                        this.f5487b.beginObject();
                        dVar2.a(obj, this);
                        this.f5487b.endObject();
                        return this;
                    }
                }
            } else if (obj instanceof byte[]) {
                i();
                this.f5487b.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            } else {
                this.f5487b.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i10 < length) {
                        this.f5487b.value(iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        long j3 = jArr[i10];
                        i();
                        this.f5487b.value(j3);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        this.f5487b.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        this.f5487b.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i10 < length5) {
                        g(numberArr[i10]);
                        i10++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i10 < length6) {
                        g(objArr[i10]);
                        i10++;
                    }
                }
                this.f5487b.endArray();
                return this;
            }
        }
    }

    public final f h(String str, Object obj) {
        if (this.f5491f) {
            if (obj == null) {
                return this;
            }
            i();
            this.f5487b.name(str);
            return g(obj);
        }
        i();
        this.f5487b.name(str);
        if (obj != null) {
            return g(obj);
        }
        this.f5487b.nullValue();
        return this;
    }

    public final void i() {
        if (this.f5486a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
