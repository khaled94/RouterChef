package f5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class d<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    public e f4543a;

    /* renamed from: b */
    public int f4544b = 0;

    public d() {
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        t(coordinatorLayout, v10, i10);
        if (this.f4543a == null) {
            this.f4543a = new e(v10);
        }
        e eVar = this.f4543a;
        eVar.f4546b = eVar.f4545a.getTop();
        eVar.f4547c = eVar.f4545a.getLeft();
        this.f4543a.a();
        int i11 = this.f4544b;
        if (i11 != 0) {
            e eVar2 = this.f4543a;
            if (eVar2.f4548d != i11) {
                eVar2.f4548d = i11;
                eVar2.a();
            }
            this.f4544b = 0;
            return true;
        }
        return true;
    }

    public final int s() {
        e eVar = this.f4543a;
        if (eVar != null) {
            return eVar.f4548d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.r(v10, i10);
    }

    public final boolean u(int i10) {
        e eVar = this.f4543a;
        if (eVar != null) {
            if (eVar.f4548d == i10) {
                return false;
            }
            eVar.f4548d = i10;
            eVar.a();
            return true;
        }
        this.f4544b = i10;
        return false;
    }
}
