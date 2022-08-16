package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class a extends ArrayAdapter<CharSequence> {

    /* renamed from: s */
    public final /* synthetic */ AlertController.RecycleListView f494s;

    /* renamed from: t */
    public final /* synthetic */ AlertController.b f495t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AlertController.b bVar, Context context, int i10, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i10, 16908308, charSequenceArr);
        this.f495t = bVar;
        this.f494s = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        boolean[] zArr = this.f495t.f488q;
        if (zArr != null && zArr[i10]) {
            this.f494s.setItemChecked(i10, true);
        }
        return view2;
    }
}
