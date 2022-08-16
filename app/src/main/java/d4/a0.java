package d4;

import a4.e;
import a4.f;
import android.content.Context;
import android.util.SparseIntArray;
import b4.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public final SparseIntArray f3801a = new SparseIntArray();

    /* renamed from: b */
    public f f3802b;

    public a0() {
        e eVar = e.f130d;
        this.f3802b = eVar;
    }

    public final int a(Context context, a.e eVar) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(eVar, "null reference");
        int i10 = 0;
        if (!eVar.e()) {
            return 0;
        }
        int f10 = eVar.f();
        int i11 = this.f3801a.get(f10, -1);
        if (i11 == -1) {
            int i12 = 0;
            while (true) {
                if (i12 >= this.f3801a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f3801a.keyAt(i12);
                if (keyAt > f10 && this.f3801a.get(keyAt) == 0) {
                    break;
                }
                i12++;
            }
            i11 = i10 == -1 ? this.f3802b.c(context, f10) : i10;
            this.f3801a.put(f10, i11);
        }
        return i11;
    }
}
