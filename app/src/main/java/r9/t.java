package r9;

import androidx.activity.result.a;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import s9.e;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a */
    public final k0 f17468a;

    /* renamed from: b */
    public final j f17469b;

    /* renamed from: c */
    public final List<Certificate> f17470c;

    /* renamed from: d */
    public final List<Certificate> f17471d;

    public t(k0 k0Var, j jVar, List<Certificate> list, List<Certificate> list2) {
        this.f17468a = k0Var;
        this.f17469b = jVar;
        this.f17470c = list;
        this.f17471d = list2;
    }

    public static t a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            }
            j a10 = j.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            k0 b10 = k0.b(protocol);
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
                certificateArr = null;
            }
            List m10 = certificateArr != null ? e.m(certificateArr) : Collections.emptyList();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new t(b10, a10, m10, localCertificates != null ? e.m(localCertificates) : Collections.emptyList());
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public final List<String> b(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f17468a.equals(tVar.f17468a) && this.f17469b.equals(tVar.f17469b) && this.f17470c.equals(tVar.f17470c) && this.f17471d.equals(tVar.f17471d);
    }

    public final int hashCode() {
        int hashCode = this.f17469b.hashCode();
        int hashCode2 = this.f17470c.hashCode();
        return this.f17471d.hashCode() + ((hashCode2 + ((hashCode + ((this.f17468a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = a.c("Handshake{tlsVersion=");
        c10.append(this.f17468a);
        c10.append(" cipherSuite=");
        c10.append(this.f17469b);
        c10.append(" peerCertificates=");
        c10.append(b(this.f17470c));
        c10.append(" localCertificates=");
        c10.append(b(this.f17471d));
        c10.append('}');
        return c10.toString();
    }
}
