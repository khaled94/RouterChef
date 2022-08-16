package s4;

/* loaded from: classes.dex */
public final class q7 extends r7 {
    @Override // s4.r7
    public final void a(Object obj, long j3) {
        ((h7) i9.j(obj, j3)).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // s4.r7
    public final <E> void b(Object obj, Object obj2, long j3) {
        h7<E> h7Var = (h7) i9.j(obj, j3);
        h7<E> h7Var2 = (h7) i9.j(obj2, j3);
        int size = h7Var.size();
        int size2 = h7Var2.size();
        h7<E> h7Var3 = h7Var;
        h7Var3 = h7Var;
        if (size > 0 && size2 > 0) {
            boolean c10 = h7Var.c();
            h7<E> h7Var4 = h7Var;
            if (!c10) {
                h7Var4 = h7Var.j(size2 + size);
            }
            h7Var4.addAll(h7Var2);
            h7Var3 = h7Var4;
        }
        if (size > 0) {
            h7Var2 = h7Var3;
        }
        i9.r(obj, j3, h7Var2);
    }
}
