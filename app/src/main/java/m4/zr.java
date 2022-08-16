package m4;

import android.text.TextUtils;
import j0.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zr {

    /* renamed from: a */
    public final Collection<yr<?>> f16313a = new ArrayList();

    /* renamed from: b */
    public final Collection<yr<String>> f16314b = new ArrayList();

    /* renamed from: c */
    public final Collection<yr<String>> f16315c = new ArrayList();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection<m4.yr<java.lang.String>>, java.util.ArrayList] */
    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f16314b.iterator();
        while (it.hasNext()) {
            String str = (String) jo.f10145d.f10148c.a((yr) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        d.m(arrayList2, at.c("gad:dynamite_module:experiment_id", ""));
        d.m(arrayList2, kt.f10560a);
        d.m(arrayList2, kt.f10561b);
        d.m(arrayList2, kt.f10562c);
        d.m(arrayList2, kt.f10563d);
        d.m(arrayList2, kt.f10564e);
        d.m(arrayList2, kt.f10570k);
        d.m(arrayList2, kt.f10565f);
        d.m(arrayList2, kt.f10566g);
        d.m(arrayList2, kt.f10567h);
        d.m(arrayList2, kt.f10568i);
        d.m(arrayList2, kt.f10569j);
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
