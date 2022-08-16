package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class je1 implements dh1 {

    /* renamed from: a */
    public final /* synthetic */ int f9935a;

    /* renamed from: b */
    public final Object f9936b;

    public /* synthetic */ je1(Object obj, int i10) {
        this.f9935a = i10;
        this.f9936b = obj;
    }

    @Override // m4.dh1
    public final void h(Object obj) {
        switch (this.f9935a) {
            case 0:
                ((Bundle) obj).putString("key_schema", ((ke1) this.f9936b).f10398a.f10890a);
                return;
            default:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = (Bundle) this.f9936b;
                if (bundle2 == null) {
                    return;
                }
                bundle.putAll(bundle2);
                return;
        }
    }
}
