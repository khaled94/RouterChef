package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.preference.DialogPreference;
import androidx.preference.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.raouf.routerchef.R;
import e1.g;
import e1.j;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b extends o implements e.c, e.a, e.b, DialogPreference.a {

    /* renamed from: n0 */
    public androidx.preference.e f1817n0;

    /* renamed from: o0 */
    public RecyclerView f1818o0;

    /* renamed from: p0 */
    public boolean f1819p0;

    /* renamed from: q0 */
    public boolean f1820q0;

    /* renamed from: m0 */
    public final c f1816m0 = new c();

    /* renamed from: r0 */
    public int f1821r0 = R.layout.preference_list_fragment;

    /* renamed from: s0 */
    public final a f1822s0 = new a(Looper.getMainLooper());

    /* renamed from: t0 */
    public final RunnableC0022b f1823t0 = new RunnableC0022b();

    /* loaded from: classes.dex */
    public class a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper) {
            super(looper);
            b.this = r1;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            b bVar = b.this;
            PreferenceScreen preferenceScreen = bVar.f1817n0.f1848g;
            if (preferenceScreen == null) {
                return;
            }
            bVar.f1818o0.setAdapter(new androidx.preference.c(preferenceScreen));
            preferenceScreen.q();
        }
    }

    /* renamed from: androidx.preference.b$b */
    /* loaded from: classes.dex */
    public class RunnableC0022b implements Runnable {
        public RunnableC0022b() {
            b.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = b.this.f1818o0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public class c extends RecyclerView.l {

        /* renamed from: a */
        public Drawable f1826a;

        /* renamed from: b */
        public int f1827b;

        /* renamed from: c */
        public boolean f1828c = true;

        public c() {
            b.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void d(Rect rect, View view, RecyclerView recyclerView) {
            if (g(view, recyclerView)) {
                rect.bottom = this.f1827b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void f(Canvas canvas, RecyclerView recyclerView) {
            if (this.f1826a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (g(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f1826a.setBounds(0, height, width, this.f1827b + height);
                    this.f1826a.draw(canvas);
                }
            }
        }

        public final boolean g(View view, RecyclerView recyclerView) {
            RecyclerView.a0 J = recyclerView.J(view);
            boolean z10 = false;
            if (!((J instanceof g) && ((g) J).f4356x)) {
                return false;
            }
            boolean z11 = this.f1828c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z11;
            }
            RecyclerView.a0 J2 = recyclerView.J(recyclerView.getChildAt(indexOfChild + 1));
            if ((J2 instanceof g) && ((g) J2).f4355w) {
                z10 = true;
            }
            return z10;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a();
    }

    @Override // androidx.fragment.app.o
    public final void F(Bundle bundle) {
        super.F(bundle);
        TypedValue typedValue = new TypedValue();
        W().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = R.style.PreferenceThemeOverlay;
        }
        W().getTheme().applyStyle(i10, false);
        androidx.preference.e eVar = new androidx.preference.e(W());
        this.f1817n0 = eVar;
        eVar.f1851j = this;
        Bundle bundle2 = this.f1521x;
        e0(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.o
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        int i10 = 0;
        TypedArray obtainStyledAttributes = W().obtainStyledAttributes(null, j.f4377z, R.attr.preferenceFragmentCompatStyle, 0);
        this.f1821r0 = obtainStyledAttributes.getResourceId(0, this.f1821r0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z10 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(W());
        View inflate = cloneInContext.inflate(this.f1821r0, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!W().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
                recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
                W();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAccessibilityDelegateCompat(new e1.f(recyclerView));
            }
            this.f1818o0 = recyclerView;
            recyclerView.g(this.f1816m0);
            c cVar = this.f1816m0;
            Objects.requireNonNull(cVar);
            if (drawable != null) {
                i10 = drawable.getIntrinsicHeight();
            }
            cVar.f1827b = i10;
            cVar.f1826a = drawable;
            b.this.f1818o0.O();
            if (dimensionPixelSize != -1) {
                c cVar2 = this.f1816m0;
                cVar2.f1827b = dimensionPixelSize;
                b.this.f1818o0.O();
            }
            this.f1816m0.f1828c = z10;
            if (this.f1818o0.getParent() == null) {
                viewGroup2.addView(this.f1818o0);
            }
            this.f1822s0.post(this.f1823t0);
            return inflate;
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.o
    public final void I() {
        this.f1822s0.removeCallbacks(this.f1823t0);
        this.f1822s0.removeMessages(1);
        if (this.f1819p0) {
            this.f1818o0.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f1817n0.f1848g;
            if (preferenceScreen != null) {
                preferenceScreen.u();
            }
        }
        this.f1818o0 = null;
        this.U = true;
    }

    @Override // androidx.fragment.app.o
    public final void N(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.f1817n0.f1848g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.e(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.o
    public final void O() {
        this.U = true;
        androidx.preference.e eVar = this.f1817n0;
        eVar.f1849h = this;
        eVar.f1850i = this;
    }

    @Override // androidx.fragment.app.o
    public final void P() {
        this.U = true;
        androidx.preference.e eVar = this.f1817n0;
        eVar.f1849h = null;
        eVar.f1850i = null;
    }

    @Override // androidx.fragment.app.o
    public final void Q(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f1817n0.f1848g) != null) {
            preferenceScreen2.d(bundle2);
        }
        if (this.f1819p0 && (preferenceScreen = this.f1817n0.f1848g) != null) {
            this.f1818o0.setAdapter(new androidx.preference.c(preferenceScreen));
            preferenceScreen.q();
        }
        this.f1820q0 = true;
    }

    @Override // androidx.preference.DialogPreference.a
    public final <T extends Preference> T e(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        androidx.preference.e eVar = this.f1817n0;
        if (eVar == null || (preferenceScreen = eVar.f1848g) == null) {
            return null;
        }
        return (T) preferenceScreen.G(charSequence);
    }

    public abstract void e0(String str);
}
