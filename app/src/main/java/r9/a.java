package r9;

import androidx.appcompat.widget.e0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import r9.v;
import s9.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final v f17283a;

    /* renamed from: b */
    public final p f17284b;

    /* renamed from: c */
    public final SocketFactory f17285c;

    /* renamed from: d */
    public final c f17286d;

    /* renamed from: e */
    public final List<a0> f17287e;

    /* renamed from: f */
    public final List<k> f17288f;

    /* renamed from: g */
    public final ProxySelector f17289g;
    @Nullable

    /* renamed from: h */
    public final Proxy f17290h;
    @Nullable

    /* renamed from: i */
    public final SSLSocketFactory f17291i;
    @Nullable

    /* renamed from: j */
    public final HostnameVerifier f17292j;
    @Nullable

    /* renamed from: k */
    public final h f17293k;

    public a(String str, int i10, p pVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable h hVar, c cVar, List list, List list2, ProxySelector proxySelector) {
        v.a aVar = new v.a();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? str2 : "http";
        if (str3.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (!str3.equalsIgnoreCase(str2)) {
            throw new IllegalArgumentException(d7.a.c("unexpected scheme: ", str3));
        }
        aVar.f17484a = str2;
        Objects.requireNonNull(str, "host == null");
        String a10 = e.a(v.m(str, 0, str.length(), false));
        if (a10 != null) {
            aVar.f17487d = a10;
            if (i10 > 0 && i10 <= 65535) {
                aVar.f17488e = i10;
                this.f17283a = aVar.a();
                Objects.requireNonNull(pVar, "dns == null");
                this.f17284b = pVar;
                Objects.requireNonNull(socketFactory, "socketFactory == null");
                this.f17285c = socketFactory;
                Objects.requireNonNull(cVar, "proxyAuthenticator == null");
                this.f17286d = cVar;
                Objects.requireNonNull(list, "protocols == null");
                this.f17287e = e.l(list);
                Objects.requireNonNull(list2, "connectionSpecs == null");
                this.f17288f = e.l(list2);
                Objects.requireNonNull(proxySelector, "proxySelector == null");
                this.f17289g = proxySelector;
                this.f17290h = null;
                this.f17291i = sSLSocketFactory;
                this.f17292j = hostnameVerifier;
                this.f17293k = hVar;
                return;
            }
            throw new IllegalArgumentException(e0.a("unexpected port: ", i10));
        }
        throw new IllegalArgumentException(d7.a.c("unexpected host: ", str));
    }

    public final boolean a(a aVar) {
        return this.f17284b.equals(aVar.f17284b) && this.f17286d.equals(aVar.f17286d) && this.f17287e.equals(aVar.f17287e) && this.f17288f.equals(aVar.f17288f) && this.f17289g.equals(aVar.f17289g) && Objects.equals(this.f17290h, aVar.f17290h) && Objects.equals(this.f17291i, aVar.f17291i) && Objects.equals(this.f17292j, aVar.f17292j) && Objects.equals(this.f17293k, aVar.f17293k) && this.f17283a.f17479e == aVar.f17283a.f17479e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f17283a.equals(aVar.f17283a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17284b.hashCode();
        int hashCode2 = this.f17286d.hashCode();
        int hashCode3 = this.f17287e.hashCode();
        int hashCode4 = this.f17288f.hashCode();
        int hashCode5 = this.f17289g.hashCode();
        int hashCode6 = Objects.hashCode(this.f17290h);
        int hashCode7 = Objects.hashCode(this.f17291i);
        int hashCode8 = Objects.hashCode(this.f17292j);
        return Objects.hashCode(this.f17293k) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f17283a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object obj;
        StringBuilder c10 = androidx.activity.result.a.c("Address{");
        c10.append(this.f17283a.f17478d);
        c10.append(":");
        c10.append(this.f17283a.f17479e);
        if (this.f17290h != null) {
            c10.append(", proxy=");
            obj = this.f17290h;
        } else {
            c10.append(", proxySelector=");
            obj = this.f17289g;
        }
        c10.append(obj);
        c10.append("}");
        return c10.toString();
    }
}
