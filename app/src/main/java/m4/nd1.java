package m4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class nd1 implements eh1<dh1<Bundle>> {

    /* renamed from: a */
    public final Set<String> f11633a;

    public nd1(Set<String> set) {
        this.f11633a = set;
    }

    @Override // m4.eh1
    public final tz1<dh1<Bundle>> a() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.f11633a) {
            arrayList.add(str);
        }
        return mz1.m(new dh1() { // from class: m4.md1
            @Override // m4.dh1
            public final void h(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
