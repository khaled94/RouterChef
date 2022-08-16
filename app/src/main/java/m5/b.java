package m5;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;

/* loaded from: classes.dex */
public final class b extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f16374a;

    public b(Chip chip) {
        this.f16374a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        a aVar = this.f16374a.f3103w;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
