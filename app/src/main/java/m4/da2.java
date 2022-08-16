package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class da2 extends fa2 {

    /* renamed from: c */
    public static final Class<?> f7277c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static <L> List<L> d(Object obj, long j3, int i10) {
        ba2 ba2Var;
        List<L> list = (List) zb2.l(obj, j3);
        if (list.isEmpty()) {
            List<L> ba2Var2 = list instanceof ca2 ? new ba2(i10) : (!(list instanceof xa2) || !(list instanceof u92)) ? new ArrayList<>(i10) : ((u92) list).j(i10);
            zb2.u(obj, j3, ba2Var2);
            return ba2Var2;
        }
        if (f7277c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            ba2Var = arrayList;
        } else if (!(list instanceof ub2)) {
            if (!(list instanceof xa2) || !(list instanceof u92)) {
                return list;
            }
            u92 u92Var = (u92) list;
            if (u92Var.c()) {
                return list;
            }
            u92 j10 = u92Var.j(list.size() + i10);
            zb2.u(obj, j3, j10);
            return j10;
        } else {
            ba2 ba2Var3 = new ba2(list.size() + i10);
            ba2Var3.addAll(ba2Var3.size(), (ub2) list);
            ba2Var = ba2Var3;
        }
        zb2.u(obj, j3, ba2Var);
        return ba2Var;
    }

    @Override // m4.fa2
    public final <L> List<L> a(Object obj, long j3) {
        return d(obj, j3, 10);
    }

    @Override // m4.fa2
    public final void b(Object obj, long j3) {
        Object obj2;
        List list = (List) zb2.l(obj, j3);
        if (list instanceof ca2) {
            obj2 = ((ca2) list).b();
        } else if (f7277c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof xa2) && (list instanceof u92)) {
                u92 u92Var = (u92) list;
                if (!u92Var.c()) {
                    return;
                }
                u92Var.a();
                return;
            }
            obj2 = Collections.unmodifiableList(list);
        }
        zb2.u(obj, j3, obj2);
    }

    @Override // m4.fa2
    public final <E> void c(Object obj, Object obj2, long j3) {
        List list = (List) zb2.l(obj2, j3);
        List d5 = d(obj, j3, list.size());
        int size = d5.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d5.addAll(list);
        }
        if (size > 0) {
            list = d5;
        }
        zb2.u(obj, j3, list);
    }
}
