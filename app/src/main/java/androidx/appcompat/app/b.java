package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* renamed from: s */
    public final /* synthetic */ AlertController f496s;

    /* renamed from: t */
    public final /* synthetic */ AlertController.b f497t;

    public b(AlertController.b bVar, AlertController alertController) {
        this.f497t = bVar;
        this.f496s = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j3) {
        this.f497t.f487o.onClick(this.f496s.f447b, i10);
        if (!this.f497t.f490s) {
            this.f496s.f447b.dismiss();
        }
    }
}
