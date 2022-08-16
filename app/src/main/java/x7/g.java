package x7;

import e8.a;
import e8.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class g extends w<AtomicLongArray> {

    /* renamed from: a */
    public final /* synthetic */ w f20075a;

    public g(w wVar) {
        this.f20075a = wVar;
    }

    @Override // x7.w
    public final AtomicLongArray a(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.d0()) {
            arrayList.add(Long.valueOf(((Number) this.f20075a.a(aVar)).longValue()));
        }
        aVar.H();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
        }
        return atomicLongArray;
    }

    @Override // x7.w
    public final void b(c cVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        cVar.c();
        int length = atomicLongArray2.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.f20075a.b(cVar, Long.valueOf(atomicLongArray2.get(i10)));
        }
        cVar.H();
    }
}
