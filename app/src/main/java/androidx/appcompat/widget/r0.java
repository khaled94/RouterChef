package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class r0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: s */
    public final /* synthetic */ s0 f998s;

    public r0(s0 s0Var) {
        this.f998s = s0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j3) {
        n0 n0Var;
        if (i10 == -1 || (n0Var = this.f998s.f1004u) == null) {
            return;
        }
        n0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
