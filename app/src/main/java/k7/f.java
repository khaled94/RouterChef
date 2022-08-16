package k7;

import h7.b;
import h7.c;
import h7.d;
import h7.e;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import n9.l;
import t2.a;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: f */
    public static final Charset f5614f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final c f5615g = new c("key", l.b(a.b(d.class, new a(1))), null);

    /* renamed from: h */
    public static final c f5616h = new c("value", l.b(a.b(d.class, new a(2))), null);

    /* renamed from: i */
    public static final d<Map.Entry<Object, Object>> f5617i = e.f5613a;

    /* renamed from: a */
    public OutputStream f5618a;

    /* renamed from: b */
    public final Map<Class<?>, d<?>> f5619b;

    /* renamed from: c */
    public final Map<Class<?>, h7.f<?>> f5620c;

    /* renamed from: d */
    public final d<Object> f5621d;

    /* renamed from: e */
    public final i f5622e = new i(this);

    public f(OutputStream outputStream, Map<Class<?>, d<?>> map, Map<Class<?>, h7.f<?>> map2, d<Object> dVar) {
        this.f5618a = outputStream;
        this.f5619b = map;
        this.f5620c = map2;
        this.f5621d = dVar;
    }

    public static ByteBuffer h(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d j(c cVar) {
        d dVar = (d) ((Annotation) cVar.f5136b.get(d.class));
        if (dVar != null) {
            return dVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    public static int k(c cVar) {
        d dVar = (d) ((Annotation) cVar.f5136b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f5609a;
        }
        throw new b("Field has no @Protobuf config");
    }

    @Override // h7.e
    public final e a(c cVar, long j3) {
        g(cVar, j3, true);
        return this;
    }

    @Override // h7.e
    public final e b(c cVar, int i10) {
        d(cVar, i10, true);
        return this;
    }

    public final e c(c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f5614f);
            l(bytes.length);
            this.f5618a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                c(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i(f5617i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                l((k(cVar) << 3) | 1);
                this.f5618a.write(h(8).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                l((k(cVar) << 3) | 5);
                this.f5618a.write(h(4).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            g(cVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            l(bArr.length);
            this.f5618a.write(bArr);
            return this;
        } else {
            d<?> dVar = this.f5619b.get(obj.getClass());
            if (dVar != null) {
                i(dVar, cVar, obj, z10);
                return this;
            }
            h7.f<?> fVar = this.f5620c.get(obj.getClass());
            if (fVar != null) {
                i iVar = this.f5622e;
                iVar.f5630a = false;
                iVar.f5632c = cVar;
                iVar.f5631b = z10;
                fVar.a(obj, iVar);
                return this;
            } else if (obj instanceof c) {
                d(cVar, ((c) obj).b(), true);
                return this;
            } else if (obj instanceof Enum) {
                d(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                i(this.f5621d, cVar, obj, z10);
                return this;
            }
        }
    }

    public final f d(c cVar, int i10, boolean z10) {
        if (!z10 || i10 != 0) {
            l(((a) j(cVar)).f5609a << 3);
            l(i10);
            return this;
        }
        return this;
    }

    @Override // h7.e
    public final e e(c cVar, Object obj) {
        return c(cVar, obj, true);
    }

    @Override // h7.e
    public final e f(c cVar, boolean z10) {
        d(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final f g(c cVar, long j3, boolean z10) {
        if (!z10 || j3 != 0) {
            l(((a) j(cVar)).f5609a << 3);
            m(j3);
            return this;
        }
        return this;
    }

    public final <T> f i(d<T> dVar, c cVar, T t10, boolean z10) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f5618a;
            this.f5618a = bVar;
            dVar.a(t10, this);
            this.f5618a = outputStream;
            long j3 = bVar.f5610s;
            bVar.close();
            if (z10 && j3 == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            m(j3);
            dVar.a(t10, this);
            return this;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f5618a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f5618a.write(i10 & 127);
    }

    public final void m(long j3) {
        while (((-128) & j3) != 0) {
            this.f5618a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f5618a.write(((int) j3) & 127);
    }
}
