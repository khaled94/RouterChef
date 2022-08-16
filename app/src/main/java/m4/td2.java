package m4;

import a6.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class td2<T> implements nd2<Set<T>> {

    /* renamed from: c */
    public static final /* synthetic */ int f14031c = 0;

    /* renamed from: a */
    public final List<vd2<T>> f14032a;

    /* renamed from: b */
    public final List<vd2<Collection<T>>> f14033b;

    static {
        od2.b(Collections.emptySet());
    }

    public /* synthetic */ td2(List list, List list2) {
        this.f14032a = list;
        this.f14033b = list2;
    }

    /* renamed from: b */
    public final Set<T> a() {
        int size = this.f14032a.size();
        ArrayList arrayList = new ArrayList(this.f14033b.size());
        int size2 = this.f14033b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection<T> a10 = this.f14033b.get(i10).a();
            size += a10.size();
            arrayList.add(a10);
        }
        HashSet hashSet = new HashSet(d.l(size));
        int size3 = this.f14032a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            T a11 = this.f14032a.get(i11).a();
            Objects.requireNonNull(a11);
            hashSet.add(a11);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                Objects.requireNonNull(obj);
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
