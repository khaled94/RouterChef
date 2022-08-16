package v9;

import d7.a;
import java.net.ProtocolException;
import r9.a0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final a0 f19856a;

    /* renamed from: b */
    public final int f19857b;

    /* renamed from: c */
    public final String f19858c;

    public j(a0 a0Var, int i10, String str) {
        this.f19856a = a0Var;
        this.f19857b = i10;
        this.f19858c = str;
    }

    public static j a(String str) {
        String str2;
        a0 a0Var = a0.HTTP_1_0;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.c("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(a.c("Unexpected status line: ", str));
                }
                a0Var = a0.HTTP_1_1;
            }
        } else if (!str.startsWith("ICY ")) {
            throw new ProtocolException(a.c("Unexpected status line: ", str));
        } else {
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() <= i11) {
                    str2 = "";
                } else if (str.charAt(i11) != ' ') {
                    throw new ProtocolException(a.c("Unexpected status line: ", str));
                } else {
                    str2 = str.substring(i10 + 4);
                }
                return new j(a0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.c("Unexpected status line: ", str));
            }
        }
        throw new ProtocolException(a.c("Unexpected status line: ", str));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19856a == a0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f19857b);
        if (this.f19858c != null) {
            sb.append(' ');
            sb.append(this.f19858c);
        }
        return sb.toString();
    }
}
