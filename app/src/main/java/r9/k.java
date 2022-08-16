package r9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import s9.e;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e */
    public static final k f17425e;

    /* renamed from: f */
    public static final k f17426f = new k(new a(false));

    /* renamed from: a */
    public final boolean f17427a;

    /* renamed from: b */
    public final boolean f17428b;
    @Nullable

    /* renamed from: c */
    public final String[] f17429c;
    @Nullable

    /* renamed from: d */
    public final String[] f17430d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f17431a;
        @Nullable

        /* renamed from: b */
        public String[] f17432b;
        @Nullable

        /* renamed from: c */
        public String[] f17433c;

        /* renamed from: d */
        public boolean f17434d;

        public a(k kVar) {
            this.f17431a = kVar.f17427a;
            this.f17432b = kVar.f17429c;
            this.f17433c = kVar.f17430d;
            this.f17434d = kVar.f17428b;
        }

        public a(boolean z10) {
            this.f17431a = z10;
        }

        public final k a() {
            return new k(this);
        }

        public final a b(String... strArr) {
            if (this.f17431a) {
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("At least one cipher suite is required");
                }
                this.f17432b = (String[]) strArr.clone();
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final a c(j... jVarArr) {
            if (this.f17431a) {
                String[] strArr = new String[jVarArr.length];
                for (int i10 = 0; i10 < jVarArr.length; i10++) {
                    strArr[i10] = jVarArr[i10].f17421a;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final a d() {
            if (this.f17431a) {
                this.f17434d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public final a e(String... strArr) {
            if (this.f17431a) {
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("At least one TLS version is required");
                }
                this.f17433c = (String[]) strArr.clone();
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final a f(k0... k0VarArr) {
            if (this.f17431a) {
                String[] strArr = new String[k0VarArr.length];
                for (int i10 = 0; i10 < k0VarArr.length; i10++) {
                    strArr[i10] = k0VarArr[i10].f17440s;
                }
                e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        j jVar = j.p;
        j jVar2 = j.f17419q;
        j jVar3 = j.f17420r;
        j jVar4 = j.f17413j;
        j jVar5 = j.f17415l;
        j jVar6 = j.f17414k;
        j jVar7 = j.f17416m;
        j jVar8 = j.f17418o;
        j jVar9 = j.f17417n;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9};
        j[] jVarArr2 = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, j.f17411h, j.f17412i, j.f17409f, j.f17410g, j.f17407d, j.f17408e, j.f17406c};
        a aVar = new a(true);
        aVar.c(jVarArr);
        k0 k0Var = k0.TLS_1_3;
        k0 k0Var2 = k0.TLS_1_2;
        aVar.f(k0Var, k0Var2);
        aVar.d();
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c(jVarArr2);
        aVar2.f(k0Var, k0Var2);
        aVar2.d();
        f17425e = new k(aVar2);
        a aVar3 = new a(true);
        aVar3.c(jVarArr2);
        aVar3.f(k0Var, k0Var2, k0.TLS_1_1, k0.TLS_1_0);
        aVar3.d();
        aVar3.a();
    }

    public k(a aVar) {
        this.f17427a = aVar.f17431a;
        this.f17429c = aVar.f17432b;
        this.f17430d = aVar.f17433c;
        this.f17428b = aVar.f17434d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f17427a) {
            return false;
        }
        String[] strArr = this.f17430d;
        if (strArr != null && !e.q(e.f18404i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f17429c;
        if (strArr2 == null) {
            return true;
        }
        Map<String, j> map = j.f17405b;
        return e.q(i.f17399s, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        boolean z10 = this.f17427a;
        if (z10 != kVar.f17427a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f17429c, kVar.f17429c) && Arrays.equals(this.f17430d, kVar.f17430d) && this.f17428b == kVar.f17428b);
    }

    public final int hashCode() {
        if (this.f17427a) {
            return ((((527 + Arrays.hashCode(this.f17429c)) * 31) + Arrays.hashCode(this.f17430d)) * 31) + (!this.f17428b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        if (!this.f17427a) {
            return "ConnectionSpec()";
        }
        StringBuilder c10 = androidx.activity.result.a.c("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f17429c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(j.a(str));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        c10.append(Objects.toString(list, "[all enabled]"));
        c10.append(", tlsVersions=");
        String[] strArr2 = this.f17430d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(k0.b(str2));
            }
            list2 = Collections.unmodifiableList(arrayList2);
        }
        c10.append(Objects.toString(list2, "[all enabled]"));
        c10.append(", supportsTlsExtensions=");
        c10.append(this.f17428b);
        c10.append(")");
        return c10.toString();
    }
}
