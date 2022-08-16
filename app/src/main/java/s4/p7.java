package s4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p7 extends r7 {

    /* renamed from: c */
    public static final Class<?> f18059c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // s4.r7
    public final void a(Object obj, long j3) {
        Object obj2;
        List list = (List) i9.j(obj, j3);
        if (list instanceof o7) {
            obj2 = ((o7) list).b();
        } else if (f18059c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof k8) && (list instanceof h7)) {
                h7 h7Var = (h7) list;
                if (!h7Var.c()) {
                    return;
                }
                h7Var.a();
                return;
            }
            obj2 = Collections.unmodifiableList(list);
        }
        i9.r(obj, j3, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.r7
    public final <E> void b(Object obj, Object obj2, long j3) {
        List j10;
        n7 n7Var;
        List list = (List) i9.j(obj2, j3);
        int size = list.size();
        List list2 = (List) i9.j(obj, j3);
        if (list2.isEmpty()) {
            if (list2 instanceof o7) {
                list2 = new n7(size);
            } else if (!(list2 instanceof k8) || !(list2 instanceof h7)) {
                list2 = new ArrayList(size);
            } else {
                j10 = ((h7) list2).j(size);
                list2 = j10;
            }
            i9.r(obj, j3, list2);
        } else {
            if (f18059c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                n7Var = arrayList;
            } else if (list2 instanceof e9) {
                n7 n7Var2 = new n7(list2.size() + size);
                n7Var2.addAll(n7Var2.size(), (e9) list2);
                n7Var = n7Var2;
            } else if ((list2 instanceof k8) && (list2 instanceof h7)) {
                h7 h7Var = (h7) list2;
                if (!h7Var.c()) {
                    j10 = h7Var.j(list2.size() + size);
                    list2 = j10;
                    i9.r(obj, j3, list2);
                }
            }
            list2 = n7Var;
            i9.r(obj, j3, list2);
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        i9.r(obj, j3, list);
    }
}
