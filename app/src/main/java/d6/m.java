package d6;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.s0;

/* loaded from: classes.dex */
public final class m implements AdapterView.OnItemClickListener {

    /* renamed from: s */
    public final /* synthetic */ n f3981s;

    public m(n nVar) {
        this.f3981s = nVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j3) {
        Object obj;
        n nVar = this.f3981s;
        if (i10 < 0) {
            s0 s0Var = nVar.f3982w;
            obj = !s0Var.b() ? null : s0Var.f1004u.getSelectedItem();
        } else {
            obj = nVar.getAdapter().getItem(i10);
        }
        n.a(this.f3981s, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f3981s.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                s0 s0Var2 = this.f3981s.f3982w;
                view = !s0Var2.b() ? null : s0Var2.f1004u.getSelectedView();
                s0 s0Var3 = this.f3981s.f3982w;
                i10 = !s0Var3.b() ? -1 : s0Var3.f1004u.getSelectedItemPosition();
                s0 s0Var4 = this.f3981s.f3982w;
                j3 = !s0Var4.b() ? Long.MIN_VALUE : s0Var4.f1004u.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f3981s.f3982w.f1004u, view, i10, j3);
        }
        this.f3981s.f3982w.dismiss();
    }
}
