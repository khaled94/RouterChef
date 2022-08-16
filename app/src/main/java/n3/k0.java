package n3;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;
import m4.b4;
import m4.e4;
import m4.i4;
import m4.j4;
import m4.k90;
import m4.x4;

/* loaded from: classes.dex */
public final class k0 extends e4 {
    public final Object E = new Object();
    public final l0 F;
    public final /* synthetic */ byte[] G;
    public final /* synthetic */ Map H;
    public final /* synthetic */ k90 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(int i10, String str, l0 l0Var, i4 i4Var, byte[] bArr, Map map, k90 k90Var) {
        super(i10, str, i4Var);
        this.G = bArr;
        this.H = map;
        this.I = k90Var;
        this.F = l0Var;
    }

    @Override // m4.e4
    public final j4 b(b4 b4Var) {
        String str;
        String str2;
        try {
            byte[] bArr = b4Var.f6356b;
            Map<String, String> map = b4Var.f6357c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(b4Var.f6356b);
        }
        return new j4(str, x4.b(b4Var));
    }

    @Override // m4.e4
    public final Map<String, String> e() {
        Map<String, String> map = this.H;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // m4.e4
    public final void g(Object obj) {
        l0 l0Var;
        String str = (String) obj;
        this.I.c(str);
        synchronized (this.E) {
            l0Var = this.F;
        }
        l0Var.a(str);
    }

    @Override // m4.e4
    public final byte[] o() {
        byte[] bArr = this.G;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
