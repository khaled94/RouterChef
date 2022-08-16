package a8;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import z7.l;

/* loaded from: classes.dex */
public final class q {
    public static final a8.r C;
    public static final x7.w<StringBuilder> D;
    public static final a8.r E;
    public static final x7.w<StringBuffer> F;
    public static final a8.r G;
    public static final x7.w<URL> H;
    public static final a8.r I;
    public static final x7.w<URI> J;
    public static final a8.r K;
    public static final x7.w<InetAddress> L;
    public static final a8.u M;
    public static final x7.w<UUID> N;
    public static final a8.r O;
    public static final x7.w<Currency> P;
    public static final a8.r Q;
    public static final x7.w<Calendar> R;
    public static final a8.t S;
    public static final x7.w<Locale> T;
    public static final a8.r U;
    public static final x7.w<x7.l> V;
    public static final a8.u W;

    /* renamed from: a */
    public static final x7.w<Class> f344a;

    /* renamed from: b */
    public static final a8.r f345b;

    /* renamed from: c */
    public static final x7.w<BitSet> f346c;

    /* renamed from: d */
    public static final a8.r f347d;

    /* renamed from: e */
    public static final x7.w<Boolean> f348e;

    /* renamed from: g */
    public static final a8.s f350g;

    /* renamed from: h */
    public static final x7.w<Number> f351h;

    /* renamed from: i */
    public static final a8.s f352i;

    /* renamed from: j */
    public static final x7.w<Number> f353j;

    /* renamed from: k */
    public static final a8.s f354k;

    /* renamed from: l */
    public static final x7.w<Number> f355l;

    /* renamed from: m */
    public static final a8.s f356m;

    /* renamed from: n */
    public static final x7.w<AtomicInteger> f357n;

    /* renamed from: o */
    public static final a8.r f358o;
    public static final x7.w<AtomicBoolean> p;

    /* renamed from: q */
    public static final a8.r f359q;

    /* renamed from: r */
    public static final x7.w<AtomicIntegerArray> f360r;

    /* renamed from: s */
    public static final a8.r f361s;

    /* renamed from: w */
    public static final x7.w<Character> f365w;

    /* renamed from: x */
    public static final a8.s f366x;
    public static final x7.w<String> y;

    /* renamed from: f */
    public static final x7.w<Boolean> f349f = new x();

    /* renamed from: t */
    public static final x7.w<Number> f362t = new b();

    /* renamed from: u */
    public static final x7.w<Number> f363u = new c();

    /* renamed from: v */
    public static final x7.w<Number> f364v = new d();

    /* renamed from: z */
    public static final x7.w<BigDecimal> f367z = new g();
    public static final x7.w<BigInteger> A = new h();
    public static final x7.w<z7.k> B = new i();
    public static final u X = new u();

    /* loaded from: classes.dex */
    public class a extends x7.w<AtomicIntegerArray> {
        @Override // x7.w
        public final AtomicIntegerArray a(e8.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.d0()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.p0()));
                } catch (NumberFormatException e10) {
                    throw new x7.s(e10);
                }
            }
            aVar.H();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // x7.w
        public final void b(e8.c cVar, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            cVar.c();
            int length = atomicIntegerArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.o0(atomicIntegerArray2.get(i10));
            }
            cVar.H();
        }
    }

    /* loaded from: classes.dex */
    public class a0 extends x7.w<Number> {
        @Override // x7.w
        public final Number a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.p0());
            } catch (NumberFormatException e10) {
                throw new x7.s(e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, Number number) {
            cVar.q0(number);
        }
    }

    /* loaded from: classes.dex */
    public class b extends x7.w<Number> {
        @Override // x7.w
        public final Number a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            try {
                return Long.valueOf(aVar.q0());
            } catch (NumberFormatException e10) {
                throw new x7.s(e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, Number number) {
            cVar.q0(number);
        }
    }

    /* loaded from: classes.dex */
    public class b0 extends x7.w<AtomicInteger> {
        @Override // x7.w
        public final AtomicInteger a(e8.a aVar) {
            try {
                return new AtomicInteger(aVar.p0());
            } catch (NumberFormatException e10) {
                throw new x7.s(e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, AtomicInteger atomicInteger) {
            cVar.o0(atomicInteger.get());
        }
    }

    /* loaded from: classes.dex */
    public class c extends x7.w<Number> {
        @Override // x7.w
        public final Number a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            return Float.valueOf((float) aVar.o0());
        }

        @Override // x7.w
        public final void b(e8.c cVar, Number number) {
            cVar.q0(number);
        }
    }

    /* loaded from: classes.dex */
    public class c0 extends x7.w<AtomicBoolean> {
        @Override // x7.w
        public final AtomicBoolean a(e8.a aVar) {
            return new AtomicBoolean(aVar.n0());
        }

        @Override // x7.w
        public final void b(e8.c cVar, AtomicBoolean atomicBoolean) {
            cVar.s0(atomicBoolean.get());
        }
    }

    /* loaded from: classes.dex */
    public class d extends x7.w<Number> {
        @Override // x7.w
        public final Number a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            return Double.valueOf(aVar.o0());
        }

        @Override // x7.w
        public final void b(e8.c cVar, Number number) {
            cVar.q0(number);
        }
    }

    /* loaded from: classes.dex */
    public static final class d0<T extends Enum<T>> extends x7.w<T> {

        /* renamed from: a */
        public final Map<String, T> f368a = new HashMap();

        /* renamed from: b */
        public final Map<T, String> f369b = new HashMap();

        /* loaded from: classes.dex */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a */
            public final /* synthetic */ Class f370a;

            public a(Class cls) {
                this.f370a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f370a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map<java.lang.String, T extends java.lang.Enum<T>>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap, java.util.Map<T extends java.lang.Enum<T>, java.lang.String>] */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map<java.lang.String, T extends java.lang.Enum<T>>, java.util.HashMap] */
        public d0(Class<T> cls) {
            Field[] fieldArr;
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    y7.b bVar = (y7.b) field.getAnnotation(y7.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f368a.put(str, r42);
                        }
                    }
                    this.f368a.put(name, r42);
                    this.f369b.put(r42, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, T extends java.lang.Enum<T>>, java.util.HashMap] */
        @Override // x7.w
        public final Object a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            return (Enum) this.f368a.get(aVar.v0());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<T extends java.lang.Enum<T>, java.lang.String>] */
        @Override // x7.w
        public final void b(e8.c cVar, Object obj) {
            Enum r32 = (Enum) obj;
            cVar.r0(r32 == null ? null : (String) this.f369b.get(r32));
        }
    }

    /* loaded from: classes.dex */
    public class e extends x7.w<Character> {
        @Override // x7.w
        public final Character a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            String v02 = aVar.v0();
            if (v02.length() == 1) {
                return Character.valueOf(v02.charAt(0));
            }
            throw new x7.s("Expecting character, got: " + v02 + "; at " + aVar.Z());
        }

        @Override // x7.w
        public final void b(e8.c cVar, Character ch) {
            Character ch2 = ch;
            cVar.r0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* loaded from: classes.dex */
    public class f extends x7.w<String> {
        @Override // x7.w
        public final String a(e8.a aVar) {
            int x0 = aVar.x0();
            if (x0 != 9) {
                return x0 == 8 ? Boolean.toString(aVar.n0()) : aVar.v0();
            }
            aVar.t0();
            return null;
        }

        @Override // x7.w
        public final void b(e8.c cVar, String str) {
            cVar.r0(str);
        }
    }

    /* loaded from: classes.dex */
    public class g extends x7.w<BigDecimal> {
        @Override // x7.w
        public final BigDecimal a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            String v02 = aVar.v0();
            try {
                return new BigDecimal(v02);
            } catch (NumberFormatException e10) {
                throw new x7.s("Failed parsing '" + v02 + "' as BigDecimal; at path " + aVar.Z(), e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, BigDecimal bigDecimal) {
            cVar.q0(bigDecimal);
        }
    }

    /* loaded from: classes.dex */
    public class h extends x7.w<BigInteger> {
        @Override // x7.w
        public final BigInteger a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            String v02 = aVar.v0();
            try {
                return new BigInteger(v02);
            } catch (NumberFormatException e10) {
                throw new x7.s("Failed parsing '" + v02 + "' as BigInteger; at path " + aVar.Z(), e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, BigInteger bigInteger) {
            cVar.q0(bigInteger);
        }
    }

    /* loaded from: classes.dex */
    public class i extends x7.w<z7.k> {
        @Override // x7.w
        public final z7.k a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            return new z7.k(aVar.v0());
        }

        @Override // x7.w
        public final void b(e8.c cVar, z7.k kVar) {
            cVar.q0(kVar);
        }
    }

    /* loaded from: classes.dex */
    public class j extends x7.w<StringBuilder> {
        @Override // x7.w
        public final StringBuilder a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            return new StringBuilder(aVar.v0());
        }

        @Override // x7.w
        public final void b(e8.c cVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            cVar.r0(sb2 == null ? null : sb2.toString());
        }
    }

    /* loaded from: classes.dex */
    public class k extends x7.w<Class> {
        @Override // x7.w
        public final Class a(e8.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // x7.w
        public final void b(e8.c cVar, Class cls) {
            StringBuilder c10 = androidx.activity.result.a.c("Attempted to serialize java.lang.Class: ");
            c10.append(cls.getName());
            c10.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(c10.toString());
        }
    }

    /* loaded from: classes.dex */
    public class l extends x7.w<StringBuffer> {
        @Override // x7.w
        public final StringBuffer a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            return new StringBuffer(aVar.v0());
        }

        @Override // x7.w
        public final void b(e8.c cVar, StringBuffer stringBuffer) {
            StringBuffer stringBuffer2 = stringBuffer;
            cVar.r0(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    /* loaded from: classes.dex */
    public class m extends x7.w<URL> {
        @Override // x7.w
        public final URL a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
            } else {
                String v02 = aVar.v0();
                if (!"null".equals(v02)) {
                    return new URL(v02);
                }
            }
            return null;
        }

        @Override // x7.w
        public final void b(e8.c cVar, URL url) {
            URL url2 = url;
            cVar.r0(url2 == null ? null : url2.toExternalForm());
        }
    }

    /* loaded from: classes.dex */
    public class n extends x7.w<URI> {
        @Override // x7.w
        public final URI a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
            } else {
                try {
                    String v02 = aVar.v0();
                    if (!"null".equals(v02)) {
                        return new URI(v02);
                    }
                } catch (URISyntaxException e10) {
                    throw new x7.m(e10);
                }
            }
            return null;
        }

        @Override // x7.w
        public final void b(e8.c cVar, URI uri) {
            URI uri2 = uri;
            cVar.r0(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* loaded from: classes.dex */
    public class o extends x7.w<InetAddress> {
        @Override // x7.w
        public final InetAddress a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            return InetAddress.getByName(aVar.v0());
        }

        @Override // x7.w
        public final void b(e8.c cVar, InetAddress inetAddress) {
            InetAddress inetAddress2 = inetAddress;
            cVar.r0(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    /* loaded from: classes.dex */
    public class p extends x7.w<UUID> {
        @Override // x7.w
        public final UUID a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            String v02 = aVar.v0();
            try {
                return UUID.fromString(v02);
            } catch (IllegalArgumentException e10) {
                throw new x7.s("Failed parsing '" + v02 + "' as UUID; at path " + aVar.Z(), e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, UUID uuid) {
            UUID uuid2 = uuid;
            cVar.r0(uuid2 == null ? null : uuid2.toString());
        }
    }

    /* renamed from: a8.q$q */
    /* loaded from: classes.dex */
    public class C0004q extends x7.w<Currency> {
        @Override // x7.w
        public final Currency a(e8.a aVar) {
            String v02 = aVar.v0();
            try {
                return Currency.getInstance(v02);
            } catch (IllegalArgumentException e10) {
                throw new x7.s("Failed parsing '" + v02 + "' as Currency; at path " + aVar.Z(), e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, Currency currency) {
            cVar.r0(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes.dex */
    public class r extends x7.w<Calendar> {
        @Override // x7.w
        public final Calendar a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            aVar.c();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.x0() != 4) {
                String r02 = aVar.r0();
                int p02 = aVar.p0();
                if ("year".equals(r02)) {
                    i10 = p02;
                } else if ("month".equals(r02)) {
                    i11 = p02;
                } else if ("dayOfMonth".equals(r02)) {
                    i12 = p02;
                } else if ("hourOfDay".equals(r02)) {
                    i13 = p02;
                } else if ("minute".equals(r02)) {
                    i14 = p02;
                } else if ("second".equals(r02)) {
                    i15 = p02;
                }
            }
            aVar.I();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // x7.w
        public final void b(e8.c cVar, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                cVar.Z();
                return;
            }
            cVar.j();
            cVar.L("year");
            cVar.o0(calendar2.get(1));
            cVar.L("month");
            cVar.o0(calendar2.get(2));
            cVar.L("dayOfMonth");
            cVar.o0(calendar2.get(5));
            cVar.L("hourOfDay");
            cVar.o0(calendar2.get(11));
            cVar.L("minute");
            cVar.o0(calendar2.get(12));
            cVar.L("second");
            cVar.o0(calendar2.get(13));
            cVar.I();
        }
    }

    /* loaded from: classes.dex */
    public class s extends x7.w<Locale> {
        @Override // x7.w
        public final Locale a(e8.a aVar) {
            String str = null;
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.v0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            return str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        @Override // x7.w
        public final void b(e8.c cVar, Locale locale) {
            Locale locale2 = locale;
            cVar.r0(locale2 == null ? null : locale2.toString());
        }
    }

    /* loaded from: classes.dex */
    public class t extends x7.w<x7.l> {
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<x7.l>, java.util.ArrayList] */
        /* renamed from: c */
        public final x7.l a(e8.a aVar) {
            if (aVar instanceof a8.f) {
                a8.f fVar = (a8.f) aVar;
                int x0 = fVar.x0();
                if (x0 != 5 && x0 != 2 && x0 != 4 && x0 != 10) {
                    x7.l lVar = (x7.l) fVar.F0();
                    fVar.C0();
                    return lVar;
                }
                StringBuilder c10 = androidx.activity.result.a.c("Unexpected ");
                c10.append(e8.b.a(x0));
                c10.append(" when reading a JsonElement.");
                throw new IllegalStateException(c10.toString());
            }
            int b10 = s.h.b(aVar.x0());
            if (b10 == 0) {
                x7.j jVar = new x7.j();
                aVar.b();
                while (aVar.d0()) {
                    x7.l a10 = a(aVar);
                    if (a10 == null) {
                        a10 = x7.n.f20087a;
                    }
                    jVar.f20086s.add(a10);
                }
                aVar.H();
                return jVar;
            } else if (b10 != 2) {
                if (b10 == 5) {
                    return new x7.q(aVar.v0());
                }
                if (b10 == 6) {
                    return new x7.q(new z7.k(aVar.v0()));
                }
                if (b10 == 7) {
                    return new x7.q(Boolean.valueOf(aVar.n0()));
                }
                if (b10 != 8) {
                    throw new IllegalArgumentException();
                }
                aVar.t0();
                return x7.n.f20087a;
            } else {
                x7.o oVar = new x7.o();
                aVar.c();
                while (aVar.d0()) {
                    String r02 = aVar.r0();
                    x7.l a11 = a(aVar);
                    z7.l<String, x7.l> lVar2 = oVar.f20088a;
                    if (a11 == null) {
                        a11 = x7.n.f20087a;
                    }
                    lVar2.put(r02, a11);
                }
                aVar.I();
                return oVar;
            }
        }

        /* renamed from: d */
        public final void b(e8.c cVar, x7.l lVar) {
            if (lVar == null || (lVar instanceof x7.n)) {
                cVar.Z();
            } else if (lVar instanceof x7.q) {
                x7.q d5 = lVar.d();
                Serializable serializable = d5.f20089a;
                if (serializable instanceof Number) {
                    cVar.q0(d5.g());
                } else if (serializable instanceof Boolean) {
                    cVar.s0(d5.e());
                } else {
                    cVar.r0(d5.h());
                }
            } else {
                boolean z10 = lVar instanceof x7.j;
                if (z10) {
                    cVar.c();
                    if (z10) {
                        Iterator<x7.l> it = ((x7.j) lVar).iterator();
                        while (it.hasNext()) {
                            b(cVar, it.next());
                        }
                        cVar.H();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + lVar);
                }
                boolean z11 = lVar instanceof x7.o;
                if (z11) {
                    cVar.j();
                    if (z11) {
                        z7.l lVar2 = z7.l.this;
                        l.e eVar = lVar2.f21037w.f21048v;
                        int i10 = lVar2.f21036v;
                        while (true) {
                            l.e eVar2 = lVar2.f21037w;
                            if (!(eVar != eVar2)) {
                                cVar.I();
                                return;
                            } else if (eVar == eVar2) {
                                throw new NoSuchElementException();
                            } else {
                                if (lVar2.f21036v == i10) {
                                    l.e eVar3 = eVar.f21048v;
                                    cVar.L((String) eVar.f21050x);
                                    b(cVar, (x7.l) eVar.y);
                                    eVar = eVar3;
                                } else {
                                    throw new ConcurrentModificationException();
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Object: " + lVar);
                    }
                } else {
                    StringBuilder c10 = androidx.activity.result.a.c("Couldn't write ");
                    c10.append(lVar.getClass());
                    throw new IllegalArgumentException(c10.toString());
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class u implements x7.x {
        @Override // x7.x
        public final <T> x7.w<T> a(x7.h hVar, d8.a<T> aVar) {
            Class<? super T> cls = aVar.f3994a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new d0(cls);
        }
    }

    /* loaded from: classes.dex */
    public class v extends x7.w<BitSet> {
        @Override // x7.w
        public final BitSet a(e8.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.b();
            int x0 = aVar.x0();
            int i10 = 0;
            while (x0 != 2) {
                int b10 = s.h.b(x0);
                boolean z10 = true;
                if (b10 == 5 || b10 == 6) {
                    int p02 = aVar.p0();
                    if (p02 == 0) {
                        z10 = false;
                    } else if (p02 != 1) {
                        throw new x7.s("Invalid bitset value " + p02 + ", expected 0 or 1; at path " + aVar.Z());
                    }
                } else if (b10 != 7) {
                    StringBuilder c10 = androidx.activity.result.a.c("Invalid bitset value type: ");
                    c10.append(e8.b.a(x0));
                    c10.append("; at path ");
                    c10.append(aVar.A());
                    throw new x7.s(c10.toString());
                } else {
                    z10 = aVar.n0();
                }
                if (z10) {
                    bitSet.set(i10);
                }
                i10++;
                x0 = aVar.x0();
            }
            aVar.H();
            return bitSet;
        }

        @Override // x7.w
        public final void b(e8.c cVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            cVar.c();
            int length = bitSet2.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.o0(bitSet2.get(i10) ? 1L : 0L);
            }
            cVar.H();
        }
    }

    /* loaded from: classes.dex */
    public class w extends x7.w<Boolean> {
        @Override // x7.w
        public final Boolean a(e8.a aVar) {
            int x0 = aVar.x0();
            if (x0 != 9) {
                return Boolean.valueOf(x0 == 6 ? Boolean.parseBoolean(aVar.v0()) : aVar.n0());
            }
            aVar.t0();
            return null;
        }

        @Override // x7.w
        public final void b(e8.c cVar, Boolean bool) {
            cVar.p0(bool);
        }
    }

    /* loaded from: classes.dex */
    public class x extends x7.w<Boolean> {
        @Override // x7.w
        public final Boolean a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            return Boolean.valueOf(aVar.v0());
        }

        @Override // x7.w
        public final void b(e8.c cVar, Boolean bool) {
            Boolean bool2 = bool;
            cVar.r0(bool2 == null ? "null" : bool2.toString());
        }
    }

    /* loaded from: classes.dex */
    public class y extends x7.w<Number> {
        @Override // x7.w
        public final Number a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            try {
                int p02 = aVar.p0();
                if (p02 <= 255 && p02 >= -128) {
                    return Byte.valueOf((byte) p02);
                }
                throw new x7.s("Lossy conversion from " + p02 + " to byte; at path " + aVar.Z());
            } catch (NumberFormatException e10) {
                throw new x7.s(e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, Number number) {
            cVar.q0(number);
        }
    }

    /* loaded from: classes.dex */
    public class z extends x7.w<Number> {
        @Override // x7.w
        public final Number a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            try {
                int p02 = aVar.p0();
                if (p02 <= 65535 && p02 >= -32768) {
                    return Short.valueOf((short) p02);
                }
                throw new x7.s("Lossy conversion from " + p02 + " to short; at path " + aVar.Z());
            } catch (NumberFormatException e10) {
                throw new x7.s(e10);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, Number number) {
            cVar.q0(number);
        }
    }

    static {
        x7.v vVar = new x7.v(new k());
        f344a = vVar;
        f345b = new a8.r(Class.class, vVar);
        x7.v vVar2 = new x7.v(new v());
        f346c = vVar2;
        f347d = new a8.r(BitSet.class, vVar2);
        w wVar = new w();
        f348e = wVar;
        f350g = new a8.s(Boolean.TYPE, Boolean.class, wVar);
        y yVar = new y();
        f351h = yVar;
        f352i = new a8.s(Byte.TYPE, Byte.class, yVar);
        z zVar = new z();
        f353j = zVar;
        f354k = new a8.s(Short.TYPE, Short.class, zVar);
        a0 a0Var = new a0();
        f355l = a0Var;
        f356m = new a8.s(Integer.TYPE, Integer.class, a0Var);
        x7.v vVar3 = new x7.v(new b0());
        f357n = vVar3;
        f358o = new a8.r(AtomicInteger.class, vVar3);
        x7.v vVar4 = new x7.v(new c0());
        p = vVar4;
        f359q = new a8.r(AtomicBoolean.class, vVar4);
        x7.v vVar5 = new x7.v(new a());
        f360r = vVar5;
        f361s = new a8.r(AtomicIntegerArray.class, vVar5);
        e eVar = new e();
        f365w = eVar;
        f366x = new a8.s(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        y = fVar;
        C = new a8.r(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = new a8.r(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = new a8.r(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = new a8.r(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = new a8.r(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = new a8.u(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = new a8.r(UUID.class, pVar);
        x7.v vVar6 = new x7.v(new C0004q());
        P = vVar6;
        Q = new a8.r(Currency.class, vVar6);
        r rVar = new r();
        R = rVar;
        S = new a8.t(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = new a8.r(Locale.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new a8.u(x7.l.class, tVar);
    }
}
