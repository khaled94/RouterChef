package h2;

import t4.a;
import t4.g;
import t4.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public int f4994a;

    /* renamed from: b */
    public String f4995b;

    public final String toString() {
        int i10 = this.f4994a;
        int i11 = i.f18651a;
        g gVar = a.f18633u;
        Integer valueOf = Integer.valueOf(i10);
        String obj = (!gVar.containsKey(valueOf) ? a.f18632t : (a) gVar.get(valueOf)).toString();
        String str = this.f4995b;
        return "Response Code: " + obj + ", Debug Message: " + str;
    }
}
