package w7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import r9.j0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b */
    public static volatile c f19935b;

    /* renamed from: a */
    public final HashSet f19936a;

    public c(int i10) {
        if (i10 != 1) {
            this.f19936a = new HashSet();
        } else {
            this.f19936a = new LinkedHashSet();
        }
    }

    public final synchronized void a(j0 j0Var) {
        this.f19936a.remove(j0Var);
    }
}
