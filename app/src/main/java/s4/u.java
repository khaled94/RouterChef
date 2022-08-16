package s4;

import c1.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a */
    public final List<e0> f18127a = new ArrayList();

    public abstract n a(String str, a4 a4Var, List<n> list);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public final n b(String str) {
        if (this.f18127a.contains(f.j(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
