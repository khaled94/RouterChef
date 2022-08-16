package ba;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f2599a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.LinkedHashMap, java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>>] */
    public b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = (Set) this.f2599a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f2599a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>>] */
    @Override // ba.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f2599a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b) && ((b) obj).f2599a.equals(this.f2599a);
    }

    public final int hashCode() {
        return this.f2599a.hashCode();
    }
}
