package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements i, AdapterView.OnItemClickListener {

    /* renamed from: s */
    public Context f537s;

    /* renamed from: t */
    public LayoutInflater f538t;

    /* renamed from: u */
    public e f539u;

    /* renamed from: v */
    public ExpandedMenuView f540v;

    /* renamed from: w */
    public i.a f541w;

    /* renamed from: x */
    public a f542x;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: s */
        public int f543s = -1;

        public a() {
            c.this = r1;
            b();
        }

        public final void b() {
            e eVar = c.this.f539u;
            g gVar = eVar.f571v;
            if (gVar != null) {
                eVar.j();
                ArrayList<g> arrayList = eVar.f560j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == gVar) {
                        this.f543s = i10;
                        return;
                    }
                }
            }
            this.f543s = -1;
        }

        /* renamed from: c */
        public final g getItem(int i10) {
            e eVar = c.this.f539u;
            eVar.j();
            ArrayList<g> arrayList = eVar.f560j;
            Objects.requireNonNull(c.this);
            int i11 = i10 + 0;
            int i12 = this.f543s;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            e eVar = c.this.f539u;
            eVar.j();
            int size = eVar.f560j.size();
            Objects.requireNonNull(c.this);
            int i10 = size + 0;
            return this.f543s < 0 ? i10 : i10 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = c.this.f538t.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((j.a) view).e(getItem(i10));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context) {
        this.f537s = context;
        this.f538t = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.i
    public final void a(e eVar, boolean z10) {
        i.a aVar = this.f541w;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    public final ListAdapter b() {
        if (this.f542x == null) {
            this.f542x = new a();
        }
        return this.f542x;
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean c(g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public final void e(Context context, e eVar) {
        if (this.f537s != null) {
            this.f537s = context;
            if (this.f538t == null) {
                this.f538t = LayoutInflater.from(context);
            }
        }
        this.f539u = eVar;
        a aVar = this.f542x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public final void f() {
        a aVar = this.f542x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean h(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        f fVar = new f(lVar);
        d.a aVar = new d.a(lVar.f551a);
        c cVar = new c(aVar.f502a.f473a);
        fVar.f576u = cVar;
        cVar.f541w = fVar;
        fVar.f574s.b(cVar);
        ListAdapter b10 = fVar.f576u.b();
        AlertController.b bVar = aVar.f502a;
        bVar.f486n = b10;
        bVar.f487o = fVar;
        View view = lVar.f565o;
        if (view != null) {
            bVar.f477e = view;
        } else {
            bVar.f475c = lVar.f564n;
            bVar.f476d = lVar.f563m;
        }
        bVar.f484l = fVar;
        d a10 = aVar.a();
        fVar.f575t = a10;
        a10.setOnDismissListener(fVar);
        WindowManager.LayoutParams attributes = fVar.f575t.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        fVar.f575t.show();
        i.a aVar2 = this.f541w;
        if (aVar2 == null) {
            return true;
        }
        aVar2.b(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public final void j(i.a aVar) {
        this.f541w = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean k(g gVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j3) {
        this.f539u.t(this.f542x.getItem(i10), this, 0);
    }
}
