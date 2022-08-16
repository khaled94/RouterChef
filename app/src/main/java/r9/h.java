package r9;

import androidx.activity.result.d;
import ca.i;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c */
    public static final h f17393c = new h(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: a */
    public final Set<a> f17394a;
    @Nullable

    /* renamed from: b */
    public final d f17395b;

    /* loaded from: classes.dex */
    public static final class a {
        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            Objects.requireNonNull((a) obj);
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public h(Set<a> set, @Nullable d dVar) {
        this.f17394a = set;
        this.f17395b = dVar;
    }

    public static String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder c10 = androidx.activity.result.a.c("sha256/");
            c10.append(i.k(((X509Certificate) certificate).getPublicKey().getEncoded()).g("SHA-256").b());
            return c10.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.f17394a.iterator();
        if (!it.hasNext()) {
            if (emptyList.isEmpty()) {
                return;
            }
            d dVar = this.f17395b;
            if (dVar != 0) {
                list = dVar.f(list, str);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i10);
                if (emptyList.size() > 0) {
                    Objects.requireNonNull((a) emptyList.get(0));
                    throw null;
                }
            }
            StringBuilder c10 = androidx.fragment.app.a.c("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i11);
                c10.append("\n    ");
                c10.append(b(x509Certificate2));
                c10.append(": ");
                c10.append(x509Certificate2.getSubjectDN().getName());
            }
            c10.append("\n  Pinned certificates for ");
            c10.append(str);
            c10.append(":");
            int size3 = emptyList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                c10.append("\n    ");
                c10.append((a) emptyList.get(i12));
            }
            throw new SSLPeerUnverifiedException(c10.toString());
        }
        Objects.requireNonNull(it.next());
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Objects.equals(this.f17395b, hVar.f17395b) && this.f17394a.equals(hVar.f17394a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17394a.hashCode() + (Objects.hashCode(this.f17395b) * 31);
    }
}
