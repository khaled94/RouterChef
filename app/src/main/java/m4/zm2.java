package m4;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class zm2 {

    /* renamed from: a */
    public final SparseBooleanArray f16283a = new SparseBooleanArray();

    /* renamed from: b */
    public boolean f16284b;

    public final zm2 a(int i10) {
        r01.h(!this.f16284b);
        this.f16283a.append(i10, true);
        return this;
    }

    public final io2 b() {
        r01.h(!this.f16284b);
        this.f16284b = true;
        return new io2(this.f16283a);
    }
}
