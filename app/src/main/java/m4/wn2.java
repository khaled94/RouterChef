package m4;

import android.hardware.display.DisplayManager;
import n3.m0;

/* loaded from: classes.dex */
public final class wn2 implements DisplayManager.DisplayListener, vn2 {

    /* renamed from: s */
    public final DisplayManager f15070s;

    /* renamed from: t */
    public m0 f15071t;

    public wn2(DisplayManager displayManager) {
        this.f15070s = displayManager;
    }

    @Override // m4.vn2
    public final void a(m0 m0Var) {
        this.f15071t = m0Var;
        this.f15070s.registerDisplayListener(this, ls1.x());
        yn2.a((yn2) m0Var.f16526s, this.f15070s.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        m0 m0Var = this.f15071t;
        if (m0Var == null || i10 != 0) {
            return;
        }
        yn2.a((yn2) m0Var.f16526s, this.f15070s.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @Override // m4.vn2
    public final void zza() {
        this.f15070s.unregisterDisplayListener(this);
        this.f15071t = null;
    }
}
