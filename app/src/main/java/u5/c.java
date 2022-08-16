package u5;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import m0.a;
import n0.f;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d */
    public final /* synthetic */ CheckableImageButton f19082d;

    public c(CheckableImageButton checkableImageButton) {
        this.f19082d = checkableImageButton;
    }

    @Override // m0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f19082d.isChecked());
    }

    @Override // m0.a
    public final void d(View view, f fVar) {
        this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
        fVar.m(this.f19082d.f3303w);
        fVar.f16401a.setChecked(this.f19082d.isChecked());
    }
}
