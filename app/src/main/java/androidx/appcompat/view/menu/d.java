package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends BaseAdapter {

    /* renamed from: s */
    public e f545s;

    /* renamed from: t */
    public int f546t = -1;

    /* renamed from: u */
    public boolean f547u;

    /* renamed from: v */
    public final boolean f548v;

    /* renamed from: w */
    public final LayoutInflater f549w;

    /* renamed from: x */
    public final int f550x;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f548v = z10;
        this.f549w = layoutInflater;
        this.f545s = eVar;
        this.f550x = i10;
        b();
    }

    public final void b() {
        e eVar = this.f545s;
        g gVar = eVar.f571v;
        if (gVar != null) {
            eVar.j();
            ArrayList<g> arrayList = eVar.f560j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == gVar) {
                    this.f546t = i10;
                    return;
                }
            }
        }
        this.f546t = -1;
    }

    /* renamed from: c */
    public final g getItem(int i10) {
        ArrayList<g> arrayList;
        if (this.f548v) {
            e eVar = this.f545s;
            eVar.j();
            arrayList = eVar.f560j;
        } else {
            arrayList = this.f545s.m();
        }
        int i11 = this.f546t;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<g> arrayList;
        if (this.f548v) {
            e eVar = this.f545s;
            eVar.j();
            arrayList = eVar.f560j;
        } else {
            arrayList = this.f545s.m();
        }
        int i10 = this.f546t;
        int size = arrayList.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f549w.inflate(this.f550x, viewGroup, false);
        }
        int i11 = getItem(i10).f578b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f578b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f545s.n() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        j.a aVar = (j.a) view;
        if (this.f547u) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
