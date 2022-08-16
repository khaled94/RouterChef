package u5;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class t extends ImageButton {

    /* renamed from: s */
    public int f19149s;

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f19149s = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f19149s;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
