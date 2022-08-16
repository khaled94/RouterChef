package m4;

import n9.d;

/* loaded from: classes.dex */
public final class jf extends db {

    /* renamed from: d */
    public static final Object f9949d = new Object();

    /* renamed from: b */
    public final long f9950b;

    /* renamed from: c */
    public final long f9951c;

    public jf(long j3) {
        this.f9950b = j3;
        this.f9951c = j3;
    }

    @Override // m4.db
    public final int a(Object obj) {
        return f9949d.equals(obj) ? 0 : -1;
    }

    @Override // m4.db
    public final int b() {
        return 1;
    }

    @Override // m4.db
    public final int c() {
        return 1;
    }

    @Override // m4.db
    public final bb d(int i10, bb bbVar, boolean z10) {
        d.e(i10, 1);
        Object obj = z10 ? f9949d : null;
        long j3 = this.f9950b;
        bbVar.f6434a = obj;
        bbVar.f6435b = obj;
        bbVar.f6436c = j3;
        return bbVar;
    }

    @Override // m4.db
    public final cb e(int i10, cb cbVar) {
        d.e(i10, 1);
        cbVar.f6762a = this.f9951c;
        return cbVar;
    }
}
