package s4;

import c1.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends u {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public w() {
        this.f18127a.add(e0.APPLY);
        this.f18127a.add(e0.BLOCK);
        this.f18127a.add(e0.BREAK);
        this.f18127a.add(e0.CASE);
        this.f18127a.add(e0.DEFAULT);
        this.f18127a.add(e0.CONTINUE);
        this.f18127a.add(e0.DEFINE_FUNCTION);
        this.f18127a.add(e0.FN);
        this.f18127a.add(e0.IF);
        this.f18127a.add(e0.QUOTE);
        this.f18127a.add(e0.RETURN);
        this.f18127a.add(e0.SWITCH);
        this.f18127a.add(e0.TERNARY);
    }

    public static n c(a4 a4Var, List<n> list) {
        e0 e0Var = e0.FN;
        f.n("FN", 2, list);
        n b10 = a4Var.b(list.get(0));
        n b11 = a4Var.b(list.get(1));
        if (b11 instanceof d) {
            List<n> s10 = ((d) b11).s();
            List<n> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new m(b10.h(), s10, arrayList, a4Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b11.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
        if (r10.equals("continue") == false) goto L63;
     */
    @Override // s4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s4.n a(java.lang.String r10, s4.a4 r11, java.util.List<s4.n> r12) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.w.a(java.lang.String, s4.a4, java.util.List):s4.n");
    }
}
