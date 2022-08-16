package t3;

import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import m4.m00;
import m4.nd2;
import m4.r00;
import m4.vd2;

/* loaded from: classes.dex */
public final class d implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f18581a;

    /* renamed from: b */
    public final Object f18582b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f18581a = i10;
        this.f18582b = obj;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f18581a) {
            case 0:
                b0 b0Var = (b0) this.f18582b;
                Objects.requireNonNull(b0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(b0Var.f18579a.toLowerCase(Locale.ROOT));
                return hashSet;
            default:
                return new r00(((m00) ((vd2) this.f18582b).a()).f11062a);
        }
    }
}
