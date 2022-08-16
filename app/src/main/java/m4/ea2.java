package m4;

import java.util.List;

/* loaded from: classes.dex */
public final class ea2 extends fa2 {
    @Override // m4.fa2
    public final <L> List<L> a(Object obj, long j3) {
        u92 u92Var = (u92) zb2.l(obj, j3);
        if (!u92Var.c()) {
            int size = u92Var.size();
            u92 j10 = u92Var.j(size == 0 ? 10 : size + size);
            zb2.u(obj, j3, j10);
            return j10;
        }
        return u92Var;
    }

    @Override // m4.fa2
    public final void b(Object obj, long j3) {
        ((u92) zb2.l(obj, j3)).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // m4.fa2
    public final <E> void c(Object obj, Object obj2, long j3) {
        u92<E> u92Var = (u92) zb2.l(obj, j3);
        u92<E> u92Var2 = (u92) zb2.l(obj2, j3);
        int size = u92Var.size();
        int size2 = u92Var2.size();
        u92<E> u92Var3 = u92Var;
        u92Var3 = u92Var;
        if (size > 0 && size2 > 0) {
            boolean c10 = u92Var.c();
            u92<E> u92Var4 = u92Var;
            if (!c10) {
                u92Var4 = u92Var.j(size2 + size);
            }
            u92Var4.addAll(u92Var2);
            u92Var3 = u92Var4;
        }
        if (size > 0) {
            u92Var2 = u92Var3;
        }
        zb2.u(obj, j3, u92Var2);
    }
}
