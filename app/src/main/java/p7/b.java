package p7;

import g8.i;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16968s;

    /* renamed from: t */
    public final /* synthetic */ Object f16969t;

    public /* synthetic */ b(Object obj, int i10) {
        this.f16968s = i10;
        this.f16969t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16968s) {
            case 0:
                ((e) this.f16969t).b(false);
                return;
            default:
                i iVar = (i) this.f16969t;
                iVar.b(iVar.f4937u.getSharedPreferences(iVar.f4935s, 0).getString(iVar.f4936t.getSelectedItem().toString(), null));
                return;
        }
    }
}
