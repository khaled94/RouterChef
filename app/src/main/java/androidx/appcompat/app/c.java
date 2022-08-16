package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {

    /* renamed from: s */
    public final /* synthetic */ AlertController.RecycleListView f498s;

    /* renamed from: t */
    public final /* synthetic */ AlertController f499t;

    /* renamed from: u */
    public final /* synthetic */ AlertController.b f500u;

    public c(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f500u = bVar;
        this.f498s = recycleListView;
        this.f499t = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j3) {
        boolean[] zArr = this.f500u.f488q;
        if (zArr != null) {
            zArr[i10] = this.f498s.isItemChecked(i10);
        }
        this.f500u.f492u.onClick(this.f499t.f447b, i10, this.f498s.isItemChecked(i10));
    }
}
