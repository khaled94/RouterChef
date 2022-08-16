package m4;

import androidx.fragment.app.b1;
import e1.i;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k1.a;
import s.b;

/* loaded from: classes.dex */
public final class i12 {

    /* renamed from: a */
    public static final Logger f9506a = Logger.getLogger(i12.class.getName());

    /* renamed from: b */
    public static final ConcurrentMap<String, g12> f9507b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentMap<String, l7> f9508c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap<String, Boolean> f9509d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap<String, k02<?>> f9510e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentMap<Class<?>, a12<?, ?>> f9511f = new ConcurrentHashMap();

    /* renamed from: g */
    public static final ConcurrentMap<String, p02> f9512g = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.ConcurrentMap<java.lang.String, m4.k02<?>>, java.util.concurrent.ConcurrentHashMap] */
    @Deprecated
    public static k02<?> a(String str) {
        String str2;
        String str3;
        if (str != null) {
            ?? r02 = f9510e;
            Locale locale = Locale.US;
            k02<?> k02Var = (k02) r02.get(str.toLowerCase(locale));
            if (k02Var != null) {
                return k02Var;
            }
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.register().";
            } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.register().";
            } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.register().";
            } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.register().";
            } else if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                if (str.toLowerCase(locale).startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(format);
            } else {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.register().";
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public static synchronized qa2 b(e62 e62Var) {
        qa2 d5;
        synchronized (i12.class) {
            a a10 = i(e62Var.z()).a();
            if (!((Boolean) f9509d.get(e62Var.z())).booleanValue()) {
                String valueOf = String.valueOf(e62Var.z());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
            d5 = a10.d(e62Var.y());
        }
        return d5;
    }

    public static <P> P c(String str, qa2 qa2Var, Class<P> cls) {
        a h10 = h(str, cls);
        String name = ((s02) h10.f5566s).f13478a.getName();
        String concat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (((s02) h10.f5566s).f13478a.isInstance(qa2Var)) {
            return (P) h10.e(qa2Var);
        }
        throw new GeneralSecurityException(concat);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.concurrent.ConcurrentMap<java.lang.String, m4.g12>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, m4.l7>] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public static synchronized void d(c12 c12Var, s02 s02Var) {
        Class<?> g10;
        synchronized (i12.class) {
            k("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", c12Var.getClass(), new a32().d(), true);
            k("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", s02Var.getClass(), Collections.emptyMap(), false);
            if (!i.d(1)) {
                String valueOf = String.valueOf(c12Var.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            } else if (!i.d(1)) {
                String valueOf2 = String.valueOf(s02Var.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 61);
                sb2.append("failed to register key manager ");
                sb2.append(valueOf2);
                sb2.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb2.toString());
            } else {
                ?? r32 = f9507b;
                if (r32.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (g10 = ((g12) r32.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).g()) != null && !g10.getName().equals(s02Var.getClass().getName())) {
                    f9506a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", c12Var.getClass().getName(), g10.getName(), s02Var.getClass().getName()));
                }
                if (!r32.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((g12) r32.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).g() == null) {
                    r32.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new f12(c12Var, s02Var));
                    f9508c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new l7(c12Var, 5));
                    l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new a32().d());
                }
                ?? r92 = f9509d;
                r92.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
                if (!r32.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    r32.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new e12(s02Var));
                }
                r92.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.ConcurrentMap<java.lang.String, m4.g12>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public static synchronized <P> void e(a aVar, boolean z10) {
        synchronized (i12.class) {
            if (aVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String d5 = ((s02) aVar.f5566s).d();
            k(d5, aVar.getClass(), Collections.emptyMap(), z10);
            f9507b.putIfAbsent(d5, new d12(aVar));
            f9509d.put(d5, Boolean.valueOf(z10));
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.concurrent.ConcurrentMap<java.lang.String, m4.g12>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, m4.l7>] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public static synchronized void f(s02 s02Var) {
        synchronized (i12.class) {
            String d5 = s02Var.d();
            k(d5, s02Var.getClass(), s02Var.a().d(), true);
            if (!i.d(s02Var.g())) {
                String valueOf = String.valueOf(s02Var.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
            ?? r22 = f9507b;
            if (!r22.containsKey(d5)) {
                r22.put(d5, new e12(s02Var));
                f9508c.put(d5, new l7(s02Var, 5));
                l(d5, s02Var.a().d());
            }
            f9509d.put(d5, Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, m4.a12<?, ?>>] */
    public static synchronized <B, P> void g(a12<B, P> a12Var) {
        synchronized (i12.class) {
            if (a12Var == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> a10 = a12Var.a();
            ?? r22 = f9511f;
            if (r22.containsKey(a10)) {
                a12 a12Var2 = (a12) r22.get(a10);
                if (!a12Var.getClass().getName().equals(a12Var2.getClass().getName())) {
                    f9506a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(a10.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", a10.getName(), a12Var2.getClass().getName(), a12Var.getClass().getName()));
                }
            }
            r22.put(a10, a12Var);
        }
    }

    public static <P> a h(String str, Class<P> cls) {
        g12 i10 = i(str);
        if (i10.b().contains(cls)) {
            return i10.d(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(i10.c());
        Set<Class<?>> b10 = i10.b();
        StringBuilder sb = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls2 : b10) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z10 = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(sb2.length() + name.length() + 77 + valueOf.length());
        b1.b(sb3, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(b.b(sb3, ", supported primitives: ", sb2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, m4.g12>, java.util.concurrent.ConcurrentHashMap] */
    public static synchronized g12 i(String str) {
        g12 g12Var;
        synchronized (i12.class) {
            ?? r12 = f9507b;
            if (!r12.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            g12Var = (g12) r12.get(str);
        }
        return g12Var;
    }

    public static <P> P j(String str, n82 n82Var, Class<P> cls) {
        a h10 = h(str, cls);
        Objects.requireNonNull(h10);
        try {
            return (P) h10.e(((s02) h10.f5566s).b(n82Var));
        } catch (x92 e10) {
            String name = ((s02) h10.f5566s).f13478a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, m4.g12>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, m4.p02>] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, m4.p02>] */
    public static synchronized <KeyProtoT extends qa2, KeyFormatProtoT extends qa2> void k(String str, Class cls, Map<String, q02<KeyFormatProtoT>> map, boolean z10) {
        synchronized (i12.class) {
            ?? r12 = f9507b;
            g12 g12Var = (g12) r12.get(str);
            if (g12Var != null && !g12Var.c().equals(cls)) {
                f9506a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, g12Var.c().getName(), cls.getName()));
            } else if (z10) {
                ?? r62 = f9509d;
                if (r62.containsKey(str) && !((Boolean) r62.get(str)).booleanValue()) {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                } else if (r12.containsKey(str)) {
                    for (Map.Entry<String, q02<KeyFormatProtoT>> entry : map.entrySet()) {
                        if (!f9512g.containsKey(entry.getKey())) {
                            String key = entry.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 79 + str.length());
                            sb.append("Attempted to register a new key template ");
                            sb.append(key);
                            sb.append(" from an existing key manager of type ");
                            sb.append(str);
                            throw new GeneralSecurityException(sb.toString());
                        }
                    }
                } else {
                    for (Map.Entry<String, q02<KeyFormatProtoT>> entry2 : map.entrySet()) {
                        if (f9512g.containsKey(entry2.getKey())) {
                            String valueOf = String.valueOf(entry2.getKey());
                            throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, m4.p02>] */
    public static <KeyFormatProtoT extends qa2> void l(String str, Map<String, q02<KeyFormatProtoT>> map) {
        for (Map.Entry<String, q02<KeyFormatProtoT>> entry : map.entrySet()) {
            ?? r12 = f9512g;
            String key = entry.getKey();
            byte[] b10 = entry.getValue().f12666a.b();
            int i10 = entry.getValue().f12667b;
            d62 v10 = e62.v();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            e62.A((e62) v10.f9883t, str);
            n82 D = n82.D(b10, 0, b10.length);
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            ((e62) v10.f9883t).zzf = D;
            int i11 = i10 - 1;
            int i12 = i11 != 0 ? i11 != 1 ? 5 : 4 : 3;
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            e62.D((e62) v10.f9883t, i12);
            r12.put(key, new p02(v10.k()));
        }
    }
}
