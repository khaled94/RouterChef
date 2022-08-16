package r9;

import d7.a;
import java.io.IOException;

/* loaded from: classes.dex */
public enum a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: s */
    public final String f17300s;

    a0(String str) {
        this.f17300s = str;
    }

    public static a0 b(String str) {
        a0 a0Var = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return a0Var;
        }
        a0 a0Var2 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return a0Var2;
        }
        a0 a0Var3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals("h2_prior_knowledge")) {
            return a0Var3;
        }
        a0 a0Var4 = HTTP_2;
        if (str.equals("h2")) {
            return a0Var4;
        }
        a0 a0Var5 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return a0Var5;
        }
        a0 a0Var6 = QUIC;
        if (!str.equals("quic")) {
            throw new IOException(a.c("Unexpected protocol: ", str));
        }
        return a0Var6;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17300s;
    }
}
