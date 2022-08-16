package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.g0;
import androidx.fragment.app.o;
import androidx.preference.b;
import androidx.preference.e;
import com.raouf.routerchef.R;
import d0.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public CharSequence A;
    public int B;
    public Drawable C;
    public String D;
    public Intent E;
    public String F;
    public Bundle G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public Object L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public c Y;
    public List<Preference> Z;

    /* renamed from: a0 */
    public PreferenceGroup f1763a0;

    /* renamed from: b0 */
    public boolean f1764b0;

    /* renamed from: c0 */
    public f f1765c0;

    /* renamed from: d0 */
    public g f1766d0;

    /* renamed from: e0 */
    public final a f1767e0;

    /* renamed from: s */
    public final Context f1768s;

    /* renamed from: t */
    public androidx.preference.e f1769t;

    /* renamed from: u */
    public long f1770u;

    /* renamed from: v */
    public boolean f1771v;

    /* renamed from: w */
    public d f1772w;

    /* renamed from: x */
    public e f1773x;
    public int y;

    /* renamed from: z */
    public CharSequence f1774z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            Preference.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Preference.this.z(view);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Preference preference, Object obj);
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public static class f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: s */
        public final Preference f1776s;

        public f(Preference preference) {
            this.f1776s = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence k10 = this.f1776s.k();
            if (!this.f1776s.U || TextUtils.isEmpty(k10)) {
                return;
            }
            contextMenu.setHeaderTitle(k10);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence k10 = this.f1776s.k();
            ((ClipboardManager) this.f1776s.f1768s.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", k10));
            Context context = this.f1776s.f1768s;
            Toast.makeText(context, context.getString(R.string.preference_copied, k10), 0).show();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface g<T extends Preference> {
        CharSequence a(T t10);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, R.attr.preferenceStyle, 16842894));
    }

    public final boolean A(String str) {
        if (!E()) {
            return false;
        }
        if (TextUtils.equals(str, i(null))) {
            return true;
        }
        SharedPreferences.Editor c10 = this.f1769t.c();
        c10.putString(this.D, str);
        F(c10);
        return true;
    }

    public final void B(View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    return;
                }
                B(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    public void C(CharSequence charSequence) {
        if (this.f1766d0 == null) {
            if (TextUtils.equals(this.A, charSequence)) {
                return;
            }
            this.A = charSequence;
            n();
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public boolean D() {
        return !m();
    }

    public final boolean E() {
        return this.f1769t != null && this.J && l();
    }

    public final void F(SharedPreferences.Editor editor) {
        if (!this.f1769t.f1846e) {
            editor.apply();
        }
    }

    public final boolean b(Object obj) {
        d dVar = this.f1772w;
        if (dVar != null) {
            dVar.a(this, obj);
            return true;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i10 = this.y;
        int i11 = preference2.y;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f1774z;
        CharSequence charSequence2 = preference2.f1774z;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 != null) {
            return charSequence.toString().compareToIgnoreCase(preference2.f1774z.toString());
        }
        return -1;
    }

    public void d(Bundle bundle) {
        Parcelable parcelable;
        if (!l() || (parcelable = bundle.getParcelable(this.D)) == null) {
            return;
        }
        this.f1764b0 = false;
        w(parcelable);
        if (!this.f1764b0) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void e(Bundle bundle) {
        if (l()) {
            this.f1764b0 = false;
            Parcelable x10 = x();
            if (!this.f1764b0) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (x10 == null) {
                return;
            }
            bundle.putParcelable(this.D, x10);
        }
    }

    public long f() {
        return this.f1770u;
    }

    public final boolean g(boolean z10) {
        return !E() ? z10 : this.f1769t.d().getBoolean(this.D, z10);
    }

    public final int h(int i10) {
        return !E() ? i10 : this.f1769t.d().getInt(this.D, i10);
    }

    public final String i(String str) {
        return !E() ? str : this.f1769t.d().getString(this.D, str);
    }

    public final Set<String> j(Set<String> set) {
        return !E() ? set : this.f1769t.d().getStringSet(this.D, set);
    }

    public CharSequence k() {
        g gVar = this.f1766d0;
        return gVar != null ? gVar.a(this) : this.A;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(this.D);
    }

    public boolean m() {
        return this.H && this.M && this.N;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public void n() {
        c cVar = this.Y;
        if (cVar != null) {
            androidx.preference.c cVar2 = (androidx.preference.c) cVar;
            int indexOf = cVar2.f1832e.indexOf(this);
            if (indexOf == -1) {
                return;
            }
            cVar2.f1943a.c(indexOf, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public void o(boolean z10) {
        ?? r02 = this.Z;
        if (r02 == 0) {
            return;
        }
        int size = r02.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preference = (Preference) r02.get(i10);
            if (preference.M == z10) {
                preference.M = !z10;
                preference.o(preference.D());
                preference.n();
            }
        }
    }

    public final void p() {
        c cVar = this.Y;
        if (cVar != null) {
            androidx.preference.c cVar2 = (androidx.preference.c) cVar;
            cVar2.f1834g.removeCallbacks(cVar2.f1835h);
            cVar2.f1834g.post(cVar2.f1835h);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public void q() {
        PreferenceScreen preferenceScreen;
        if (TextUtils.isEmpty(this.K)) {
            return;
        }
        String str = this.K;
        androidx.preference.e eVar = this.f1769t;
        Preference preference = null;
        if (eVar != null && (preferenceScreen = eVar.f1848g) != null) {
            preference = preferenceScreen.G(str);
        }
        if (preference != null) {
            if (preference.Z == null) {
                preference.Z = new ArrayList();
            }
            preference.Z.add(this);
            boolean D = preference.D();
            if (this.M != D) {
                return;
            }
            this.M = !D;
            o(D());
            n();
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("Dependency \"");
        c10.append(this.K);
        c10.append("\" not found for preference \"");
        c10.append(this.D);
        c10.append("\" (title: \"");
        c10.append((Object) this.f1774z);
        c10.append("\"");
        throw new IllegalStateException(c10.toString());
    }

    public final void r(androidx.preference.e eVar) {
        long j3;
        this.f1769t = eVar;
        if (!this.f1771v) {
            synchronized (eVar) {
                j3 = eVar.f1843b;
                eVar.f1843b = 1 + j3;
            }
            this.f1770u = j3;
        }
        if (E()) {
            androidx.preference.e eVar2 = this.f1769t;
            if ((eVar2 != null ? eVar2.d() : null).contains(this.D)) {
                y(null);
                return;
            }
        }
        Object obj = this.L;
        if (obj != null) {
            y(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(e1.g r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.s(e1.g):void");
    }

    public void t() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f1774z;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence k10 = k();
        if (!TextUtils.isEmpty(k10)) {
            sb.append(k10);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public void u() {
        ?? r02;
        PreferenceScreen preferenceScreen;
        String str = this.K;
        if (str != null) {
            androidx.preference.e eVar = this.f1769t;
            Preference preference = null;
            if (eVar != null && (preferenceScreen = eVar.f1848g) != null) {
                preference = preferenceScreen.G(str);
            }
            if (preference == null || (r02 = preference.Z) == 0) {
                return;
            }
            r02.remove(this);
        }
    }

    public Object v(TypedArray typedArray, int i10) {
        return null;
    }

    public void w(Parcelable parcelable) {
        this.f1764b0 = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
    }

    public Parcelable x() {
        this.f1764b0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void y(Object obj) {
    }

    public void z(View view) {
        e.c cVar;
        if (!m() || !this.I) {
            return;
        }
        t();
        e eVar = this.f1773x;
        if (eVar != null) {
            androidx.preference.d dVar = (androidx.preference.d) eVar;
            dVar.f1840a.J(Integer.MAX_VALUE);
            androidx.preference.c cVar2 = dVar.f1841b;
            cVar2.f1834g.removeCallbacks(cVar2.f1835h);
            cVar2.f1834g.post(cVar2.f1835h);
            Objects.requireNonNull(dVar.f1840a);
            return;
        }
        androidx.preference.e eVar2 = this.f1769t;
        if (eVar2 != null && (cVar = eVar2.f1849h) != null) {
            o oVar = (androidx.preference.b) cVar;
            boolean z10 = false;
            if (this.F != null) {
                for (o oVar2 = oVar; !z10 && oVar2 != null; oVar2 = oVar2.M) {
                    if (oVar2 instanceof b.e) {
                        z10 = ((b.e) oVar2).a();
                    }
                }
                if (!z10 && (oVar.l() instanceof b.e)) {
                    z10 = ((b.e) oVar.l()).a();
                }
                if (!z10 && (oVar.j() instanceof b.e)) {
                    z10 = ((b.e) oVar.j()).a();
                }
                if (!z10) {
                    Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                    g0 q10 = oVar.q();
                    if (this.G == null) {
                        this.G = new Bundle();
                    }
                    Bundle bundle = this.G;
                    o a10 = q10.H().a(oVar.U().getClassLoader(), this.F);
                    a10.a0(bundle);
                    a10.d0(oVar);
                    androidx.fragment.app.b bVar = new androidx.fragment.app.b(q10);
                    bVar.e(((View) oVar.X().getParent()).getId(), a10);
                    if (bVar.f1545h) {
                        bVar.f1544g = true;
                        bVar.f1546i = null;
                        bVar.c();
                    } else {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                }
                z10 = true;
            }
            if (z10) {
                return;
            }
        }
        Intent intent = this.E;
        if (intent == null) {
            return;
        }
        this.f1768s.startActivity(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ed, code lost:
        if (r6.hasValue(11) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Preference(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
