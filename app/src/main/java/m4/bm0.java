package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class bm0<AdT> implements cm0<AdT> {

    /* renamed from: a */
    public final Map<String, e71<AdT>> f6568a;

    public bm0(Map<String, e71<AdT>> map) {
        this.f6568a = map;
    }

    @Override // m4.cm0
    public final e71<AdT> a(int i10, String str) {
        return this.f6568a.get(str);
    }
}
