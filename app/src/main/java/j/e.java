package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import g0.b;
import j.a;
import java.util.ArrayList;
import k.c;
import r.g;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a */
    public final Context f5329a;

    /* renamed from: b */
    public final j.a f5330b;

    /* loaded from: classes.dex */
    public static class a implements a.AbstractC0076a {

        /* renamed from: a */
        public final ActionMode.Callback f5331a;

        /* renamed from: b */
        public final Context f5332b;

        /* renamed from: c */
        public final ArrayList<e> f5333c = new ArrayList<>();

        /* renamed from: d */
        public final g<Menu, Menu> f5334d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f5332b = context;
            this.f5331a = callback;
        }

        @Override // j.a.AbstractC0076a
        public final boolean a(j.a aVar, MenuItem menuItem) {
            return this.f5331a.onActionItemClicked(e(aVar), new c(this.f5332b, (b) menuItem));
        }

        @Override // j.a.AbstractC0076a
        public final boolean b(j.a aVar, Menu menu) {
            return this.f5331a.onCreateActionMode(e(aVar), f(menu));
        }

        @Override // j.a.AbstractC0076a
        public final void c(j.a aVar) {
            this.f5331a.onDestroyActionMode(e(aVar));
        }

        @Override // j.a.AbstractC0076a
        public final boolean d(j.a aVar, Menu menu) {
            return this.f5331a.onPrepareActionMode(e(aVar), f(menu));
        }

        public final ActionMode e(j.a aVar) {
            int size = this.f5333c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f5333c.get(i10);
                if (eVar != null && eVar.f5330b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f5332b, aVar);
            this.f5333c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f5334d.getOrDefault(menu, null);
            if (orDefault == null) {
                k.e eVar = new k.e(this.f5332b, (g0.a) menu);
                this.f5334d.put(menu, eVar);
                return eVar;
            }
            return orDefault;
        }
    }

    public e(Context context, j.a aVar) {
        this.f5329a = context;
        this.f5330b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f5330b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f5330b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new k.e(this.f5329a, (g0.a) this.f5330b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f5330b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f5330b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f5330b.f5317s;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f5330b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f5330b.f5318t;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f5330b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f5330b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f5330b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f5330b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f5330b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f5330b.f5317s = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f5330b.n(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f5330b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f5330b.p(z10);
    }
}
