package i5;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import n0.j;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a */
    public final /* synthetic */ int f5273a;

    /* renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f5274b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f5274b = bottomSheetBehavior;
        this.f5273a = i10;
    }

    @Override // n0.j
    public final boolean a(View view) {
        this.f5274b.B(this.f5273a);
        return true;
    }
}
