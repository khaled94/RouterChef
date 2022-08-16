package m4;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import m3.a;
import m4.o72;

/* loaded from: classes.dex */
public final class n72<T_WRAPPER extends o72<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    public static final Logger f11541b = Logger.getLogger(n72.class.getName());

    /* renamed from: c */
    public static final List<Provider> f11542c;

    /* renamed from: d */
    public static final boolean f11543d;

    /* renamed from: e */
    public static final n72<is, Cipher> f11544e;

    /* renamed from: f */
    public static final n72<js, Mac> f11545f;

    /* renamed from: g */
    public static final n72<hu1, KeyAgreement> f11546g;

    /* renamed from: h */
    public static final n72<eb, KeyPairGenerator> f11547h;

    /* renamed from: i */
    public static final n72<a, KeyFactory> f11548i;

    /* renamed from: a */
    public final T_WRAPPER f11549a;

    static {
        if (s22.a()) {
            f11542c = (ArrayList) b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f11543d = false;
        } else {
            f11542c = (ArrayList) (r01.e() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList());
            f11543d = true;
        }
        f11544e = new n72<>(new is());
        f11545f = new n72<>(new js());
        f11546g = new n72<>(new hu1());
        f11547h = new n72<>(new eb());
        f11548i = new n72<>(new a());
    }

    public n72(T_WRAPPER t_wrapper) {
        this.f11549a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f11541b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.security.Provider>, java.util.ArrayList] */
    public final T_ENGINE a(String str) {
        Iterator it = f11542c.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.f11549a.e(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (f11543d) {
            return (T_ENGINE) this.f11549a.e(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
