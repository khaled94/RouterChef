package m4;

import a6.f;
import android.database.sqlite.SQLiteDatabase;
import n3.g1;
import o2.c;
import o2.d;

/* loaded from: classes.dex */
public final class b00 implements z90, c, d, ar0, ko1 {

    /* renamed from: s */
    public final /* synthetic */ int f6310s;

    /* renamed from: t */
    public final Object f6311t;

    public b00() {
        this.f6310s = 4;
        this.f6311t = new dd(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.ln0 a(m4.uo2 r17, m4.br2 r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b00.a(m4.uo2, m4.br2):m4.ln0");
    }

    @Override // m4.z90, m4.ar0, m4.ko1
    /* renamed from: h */
    public final Object mo30h(Object obj) {
        v61.H((SQLiteDatabase) obj, (n90) this.f6311t);
        return null;
    }

    public /* synthetic */ b00(Object obj, int i10) {
        this.f6310s = i10;
        this.f6311t = obj;
    }

    @Override // m4.z90, m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f6310s) {
            case 0:
                g1.a("Getting a new session for JS Engine.");
                ((w90) ((a00) this.f6311t).f6087s).a(((lz) obj).i());
                return;
            default:
                ((bp0) obj).d0(f.n(12, ((pt0) this.f6311t).getMessage(), null));
                return;
        }
    }

    public b00(a00 a00Var) {
        this.f6310s = 0;
        this.f6311t = a00Var;
    }
}
