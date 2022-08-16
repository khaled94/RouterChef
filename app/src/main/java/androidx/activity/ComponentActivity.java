package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.f;
import androidx.lifecycle.e;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.z;
import b0.j;
import b0.k;
import b0.v;
import b0.w;
import b0.y;
import com.raouf.routerchef.R;
import j1.b;
import j1.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m0.h;
import m0.i;

/* loaded from: classes.dex */
public class ComponentActivity extends j implements j0, e, d, j, f, c0.b, c0.c, v, w, h {

    /* renamed from: v */
    public final m f387v;

    /* renamed from: w */
    public final j1.c f388w;

    /* renamed from: x */
    public i0 f389x;

    /* renamed from: t */
    public final b.a f385t = new b.a();

    /* renamed from: u */
    public final i f386u = new i(new d(this, 0));
    public final OnBackPressedDispatcher y = new OnBackPressedDispatcher(new a());

    /* renamed from: z */
    public final b f390z = new b();
    public final CopyOnWriteArrayList<l0.a<Configuration>> A = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<l0.a<Integer>> B = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<l0.a<Intent>> C = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<l0.a<k>> D = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<l0.a<y>> E = new CopyOnWriteArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.e {
        public b() {
            ComponentActivity.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public i0 f396a;
    }

    public ComponentActivity() {
        m mVar = new m(this);
        this.f387v = mVar;
        j1.c a10 = j1.c.a(this);
        this.f388w = a10;
        new AtomicInteger();
        int i10 = Build.VERSION.SDK_INT;
        mVar.a(new androidx.lifecycle.j() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.j
            public final void a(l lVar, g.b bVar) {
                if (bVar == g.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView == null) {
                        return;
                    }
                    peekDecorView.cancelPendingInputEvents();
                }
            }
        });
        mVar.a(new androidx.lifecycle.j() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.j
            public final void a(l lVar, g.b bVar) {
                if (bVar == g.b.ON_DESTROY) {
                    ComponentActivity.this.f385t.f2394b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.w().a();
                }
            }
        });
        mVar.a(new androidx.lifecycle.j() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.j
            public final void a(l lVar, g.b bVar) {
                ComponentActivity.this.H();
                ComponentActivity.this.f387v.c(this);
            }
        });
        a10.b();
        z.a(this);
        if (i10 <= 23) {
            mVar.a(new ImmLeaksCleaner(this));
        }
        a10.f5437b.b("android:support:activity-result", new b.AbstractC0077b() { // from class: androidx.activity.c
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
            @Override // j1.b.AbstractC0077b
            public final Bundle a() {
                ComponentActivity componentActivity = ComponentActivity.this;
                Objects.requireNonNull(componentActivity);
                Bundle bundle = new Bundle();
                ComponentActivity.b bVar = componentActivity.f390z;
                Objects.requireNonNull(bVar);
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(bVar.f431c.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(bVar.f431c.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(bVar.f433e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar.f436h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar.f429a);
                return bundle;
            }
        });
        G(new b.b() { // from class: androidx.activity.b
            /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
            /* JADX WARN: Type inference failed for: r5v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
            @Override // b.b
            public final void a() {
                ComponentActivity componentActivity = ComponentActivity.this;
                Bundle a11 = componentActivity.f388w.f5437b.a("android:support:activity-result");
                if (a11 != null) {
                    ComponentActivity.b bVar = componentActivity.f390z;
                    Objects.requireNonNull(bVar);
                    ArrayList<Integer> integerArrayList = a11.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a11.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    bVar.f433e = a11.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    bVar.f429a = (Random) a11.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    bVar.f436h.putAll(a11.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                    for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                        String str = stringArrayList.get(i11);
                        if (bVar.f431c.containsKey(str)) {
                            Integer num = (Integer) bVar.f431c.remove(str);
                            if (!bVar.f436h.containsKey(str)) {
                                bVar.f430b.remove(num);
                            }
                        }
                        bVar.a(integerArrayList.get(i11).intValue(), stringArrayList.get(i11));
                    }
                }
            }
        });
    }

    @Override // m0.h
    public final void B(m0.k kVar) {
        this.f386u.c(kVar);
    }

    @Override // c0.c
    public final void D(l0.a<Integer> aVar) {
        this.B.remove(aVar);
    }

    @Override // b0.w
    public final void E(l0.a<y> aVar) {
        this.E.remove(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set<b.b>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void G(b.b bVar) {
        b.a aVar = this.f385t;
        if (aVar.f2394b != null) {
            bVar.a();
        }
        aVar.f2393a.add(bVar);
    }

    public final void H() {
        if (this.f389x == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f389x = cVar.f396a;
            }
            if (this.f389x != null) {
                return;
            }
            this.f389x = new i0();
        }
    }

    public final void I() {
        m3.a.a(getWindow().getDecorView(), this);
        l4.b.j(getWindow().getDecorView(), this);
        e1.h.b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        e9.f.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // b0.j, androidx.lifecycle.l
    public final g a() {
        return this.f387v;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        I();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.j
    public final OnBackPressedDispatcher b() {
        return this.y;
    }

    @Override // j1.d
    public final j1.b c() {
        return this.f388w.f5437b;
    }

    @Override // m0.h
    public final void e(m0.k kVar) {
        i iVar = this.f386u;
        iVar.f5878b.add(kVar);
        iVar.f5877a.run();
    }

    @Override // b0.v
    public final void m(l0.a<k> aVar) {
        this.D.remove(aVar);
    }

    @Override // androidx.lifecycle.e
    public final c1.a n() {
        c1.d dVar = new c1.d();
        if (getApplication() != null) {
            dVar.f2604a.put(f0.f1676s, getApplication());
        }
        dVar.f2604a.put(z.f1734a, this);
        dVar.f2604a.put(z.f1735b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.f2604a.put(z.f1736c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // c0.b
    public final void o(l0.a<Configuration> aVar) {
        this.A.remove(aVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f390z.b(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.y.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<l0.a<Configuration>> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().a(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set<b.b>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // b0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f388w.c(bundle);
        b.a aVar = this.f385t;
        aVar.f2394b = this;
        Iterator it = aVar.f2393a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a();
        }
        super.onCreate(bundle);
        androidx.lifecycle.w.c(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f386u.a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        Iterator<l0.a<k>> it = this.D.iterator();
        while (it.hasNext()) {
            it.next().a(new k(z10));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        Iterator<l0.a<k>> it = this.D.iterator();
        while (it.hasNext()) {
            it.next().a(new k(z10, configuration));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<l0.a<Intent>> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.f386u.b(menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator<m0.k> it = this.f386u.f5878b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        Iterator<l0.a<y>> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().a(new y(z10));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        Iterator<l0.a<y>> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().a(new y(z10, configuration));
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Iterator<m0.k> it = this.f386u.f5878b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f390z.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        i0 i0Var = this.f389x;
        if (i0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            i0Var = cVar.f396a;
        }
        if (i0Var == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f396a = i0Var;
        return cVar2;
    }

    @Override // b0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        m mVar = this.f387v;
        if (mVar instanceof m) {
            mVar.k();
        }
        super.onSaveInstanceState(bundle);
        this.f388w.d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<l0.a<Integer>> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i10));
        }
    }

    @Override // c0.b
    public final void p(l0.a<Configuration> aVar) {
        this.A.add(aVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (o1.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.activity.result.f
    public final androidx.activity.result.e s() {
        return this.f390z;
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        I();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        I();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        I();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // b0.v
    public final void t(l0.a<k> aVar) {
        this.D.add(aVar);
    }

    @Override // c0.c
    public final void v(l0.a<Integer> aVar) {
        this.B.add(aVar);
    }

    @Override // androidx.lifecycle.j0
    public final i0 w() {
        if (getApplication() != null) {
            H();
            return this.f389x;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // b0.w
    public final void x(l0.a<y> aVar) {
        this.E.add(aVar);
    }
}
