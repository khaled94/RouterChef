package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.f;
import androidx.fragment.app.g0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import b0.b;
import c.a;
import c0.a;
import e1.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import y0.d;

/* loaded from: classes.dex */
public class o implements ComponentCallbacks, View.OnCreateContextMenuListener, l, j0, androidx.lifecycle.e, j1.d {

    /* renamed from: l0 */
    public static final Object f1504l0 = new Object();
    public int A;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public g0 J;
    public y<?> K;
    public o M;
    public int N;
    public int O;
    public String P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean U;
    public ViewGroup V;
    public View W;
    public boolean X;
    public c Z;

    /* renamed from: a0 */
    public boolean f1505a0;

    /* renamed from: b0 */
    public LayoutInflater f1506b0;

    /* renamed from: c0 */
    public boolean f1507c0;

    /* renamed from: d0 */
    public String f1508d0;

    /* renamed from: f0 */
    public m f1510f0;

    /* renamed from: g0 */
    public v0 f1511g0;

    /* renamed from: i0 */
    public j1.c f1513i0;

    /* renamed from: t */
    public Bundle f1517t;

    /* renamed from: u */
    public SparseArray<Parcelable> f1518u;

    /* renamed from: v */
    public Bundle f1519v;

    /* renamed from: x */
    public Bundle f1521x;
    public o y;

    /* renamed from: s */
    public int f1516s = -1;

    /* renamed from: w */
    public String f1520w = UUID.randomUUID().toString();

    /* renamed from: z */
    public String f1522z = null;
    public Boolean B = null;
    public h0 L = new h0();
    public boolean T = true;
    public boolean Y = true;

    /* renamed from: e0 */
    public g.c f1509e0 = g.c.RESUMED;

    /* renamed from: h0 */
    public r<l> f1512h0 = new r<>();

    /* renamed from: j0 */
    public final ArrayList<e> f1514j0 = new ArrayList<>();

    /* renamed from: k0 */
    public final a f1515k0 = new a();

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            o.this = r1;
        }

        @Override // androidx.fragment.app.o.e
        public final void a() {
            o.this.f1513i0.b();
            z.a(o.this);
        }
    }

    /* loaded from: classes.dex */
    public class b extends v {
        public b() {
            o.this = r1;
        }

        @Override // androidx.fragment.app.v
        public final View i(int i10) {
            View view = o.this.W;
            if (view != null) {
                return view.findViewById(i10);
            }
            StringBuilder c10 = androidx.activity.result.a.c("Fragment ");
            c10.append(o.this);
            c10.append(" does not have a view");
            throw new IllegalStateException(c10.toString());
        }

        @Override // androidx.fragment.app.v
        public final boolean j() {
            return o.this.W != null;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f1525a;

        /* renamed from: b */
        public int f1526b;

        /* renamed from: c */
        public int f1527c;

        /* renamed from: d */
        public int f1528d;

        /* renamed from: e */
        public int f1529e;

        /* renamed from: f */
        public int f1530f;

        /* renamed from: g */
        public ArrayList<String> f1531g;

        /* renamed from: h */
        public ArrayList<String> f1532h;

        /* renamed from: i */
        public Object f1533i;

        /* renamed from: j */
        public Object f1534j;

        /* renamed from: k */
        public Object f1535k;

        /* renamed from: l */
        public float f1536l = 1.0f;

        /* renamed from: m */
        public View f1537m = null;

        public c() {
            Object obj = o.f1504l0;
            this.f1533i = obj;
            this.f1534j = obj;
            this.f1535k = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract void a();
    }

    public o() {
        new AtomicInteger();
        x();
    }

    public final boolean A() {
        if (!this.Q) {
            g0 g0Var = this.J;
            if (g0Var == null) {
                return false;
            }
            o oVar = this.M;
            Objects.requireNonNull(g0Var);
            if (!(oVar == null ? false : oVar.A())) {
                return false;
            }
        }
        return true;
    }

    public final boolean B() {
        return this.I > 0;
    }

    @Deprecated
    public void C() {
        this.U = true;
    }

    @Deprecated
    public void D(int i10, int i11, Intent intent) {
        if (g0.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void E() {
        this.U = true;
        y<?> yVar = this.K;
        if ((yVar == null ? null : yVar.f1603s) != null) {
            this.U = true;
        }
    }

    public void F(Bundle bundle) {
        boolean z10 = true;
        this.U = true;
        Y(bundle);
        h0 h0Var = this.L;
        if (h0Var.f1416s < 1) {
            z10 = false;
        }
        if (!z10) {
            h0Var.j();
        }
    }

    public View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void H() {
        this.U = true;
    }

    public void I() {
        this.U = true;
    }

    public void J() {
        this.U = true;
    }

    public LayoutInflater K(Bundle bundle) {
        y<?> yVar = this.K;
        if (yVar != null) {
            LayoutInflater l10 = yVar.l();
            l10.setFactory2(this.L.f1404f);
            return l10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final void L() {
        this.U = true;
        y<?> yVar = this.K;
        if ((yVar == null ? null : yVar.f1603s) != null) {
            this.U = true;
        }
    }

    public void M() {
        this.U = true;
    }

    public void N(Bundle bundle) {
    }

    public void O() {
        this.U = true;
    }

    public void P() {
        this.U = true;
    }

    public void Q(Bundle bundle) {
    }

    public void R(Bundle bundle) {
        this.U = true;
    }

    public void S(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.L.Q();
        boolean z10 = true;
        this.H = true;
        this.f1511g0 = new v0(this, w());
        View G = G(layoutInflater, viewGroup, bundle);
        this.W = G;
        if (G != null) {
            this.f1511g0.e();
            m3.a.a(this.W, this.f1511g0);
            l4.b.j(this.W, this.f1511g0);
            h.b(this.W, this.f1511g0);
            this.f1512h0.h(this.f1511g0);
            return;
        }
        if (this.f1511g0.f1595u == null) {
            z10 = false;
        }
        if (z10) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.f1511g0 = null;
    }

    public final LayoutInflater T(Bundle bundle) {
        LayoutInflater K = K(bundle);
        this.f1506b0 = K;
        return K;
    }

    public final t U() {
        t j3 = j();
        if (j3 != null) {
            return j3;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle V() {
        Bundle bundle = this.f1521x;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context W() {
        Context l10 = l();
        if (l10 != null) {
            return l10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View X() {
        View view = this.W;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void Y(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.L.W(parcelable);
        this.L.j();
    }

    public final void Z(int i10, int i11, int i12, int i13) {
        if (this.Z == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        i().f1526b = i10;
        i().f1527c = i11;
        i().f1528d = i12;
        i().f1529e = i13;
    }

    @Override // androidx.lifecycle.l
    public final g a() {
        return this.f1510f0;
    }

    public final void a0(Bundle bundle) {
        g0 g0Var = this.J;
        if (g0Var != null) {
            if (g0Var == null ? false : g0Var.O()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1521x = bundle;
    }

    public final void b0(View view) {
        i().f1537m = view;
    }

    @Override // j1.d
    public final j1.b c() {
        return this.f1513i0.f5437b;
    }

    public final void c0(boolean z10) {
        if (this.Z == null) {
            return;
        }
        i().f1525a = z10;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.activity.result.d, java.lang.Object, androidx.activity.result.e$a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Deprecated
    public final void d(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        if (this.K != null) {
            g0 q10 = q();
            Bundle bundle = null;
            if (q10.f1422z != null) {
                q10.C.addLast(new g0.k(this.f1520w, i10));
                ?? r02 = q10.f1422z;
                Objects.requireNonNull(r02);
                Integer num = (Integer) androidx.activity.result.e.this.f431c.get(r02.f437b);
                if (num != null) {
                    androidx.activity.result.e.this.f433e.add(r02.f437b);
                    androidx.activity.result.e eVar = androidx.activity.result.e.this;
                    int intValue = num.intValue();
                    c.a aVar = r02.f438c;
                    ComponentActivity.b bVar = (ComponentActivity.b) eVar;
                    ComponentActivity componentActivity = ComponentActivity.this;
                    a.C0036a b10 = aVar.b(componentActivity, intent);
                    if (b10 != null) {
                        new Handler(Looper.getMainLooper()).post(new androidx.activity.e(bVar, intValue, b10));
                        return;
                    }
                    Intent a10 = aVar.a(componentActivity, intent);
                    if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                        a10.setExtrasClassLoader(componentActivity.getClassLoader());
                    }
                    if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                        bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                        a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    }
                    Bundle bundle2 = bundle;
                    if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                        String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                        if (stringArrayExtra == null) {
                            stringArrayExtra = new String[0];
                        }
                        int i11 = b0.b.f2397c;
                        for (String str : stringArrayExtra) {
                            if (TextUtils.isEmpty(str)) {
                                throw new IllegalArgumentException(s.b.b(androidx.activity.result.a.c("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                            }
                        }
                        if (componentActivity instanceof b.c) {
                            ((b.c) componentActivity).j();
                        }
                        b.C0031b.b(componentActivity, stringArrayExtra, intValue);
                        return;
                    } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                        androidx.activity.result.g gVar = (androidx.activity.result.g) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                        try {
                            IntentSender intentSender = gVar.f442s;
                            Intent intent2 = gVar.f443t;
                            int i12 = gVar.f444u;
                            int i13 = gVar.f445v;
                            int i14 = b0.b.f2397c;
                            b.a.c(componentActivity, intentSender, intValue, intent2, i12, i13, 0, bundle2);
                            return;
                        } catch (IntentSender.SendIntentException e10) {
                            new Handler(Looper.getMainLooper()).post(new f(bVar, intValue, e10));
                            return;
                        }
                    } else {
                        int i15 = b0.b.f2397c;
                        b.a.b(componentActivity, a10, intValue, bundle2);
                        return;
                    }
                }
                StringBuilder c10 = androidx.activity.result.a.c("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                c10.append(r02.f438c);
                c10.append(" and input ");
                c10.append(intent);
                c10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(c10.toString());
            }
            y<?> yVar = q10.f1417t;
            Objects.requireNonNull(yVar);
            if (i10 == -1) {
                Context context = yVar.f1604t;
                Object obj = c0.a.f2602a;
                a.C0037a.b(context, intent, null);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public final void d0(o oVar) {
        y0.d dVar = y0.d.f20245a;
        y0.g gVar = new y0.g(this, oVar);
        y0.d dVar2 = y0.d.f20245a;
        y0.d.c(gVar);
        d.c a10 = y0.d.a(this);
        if (a10.f20254a.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && y0.d.f(a10, getClass(), y0.g.class)) {
            y0.d.b(a10, gVar);
        }
        g0 g0Var = this.J;
        g0 g0Var2 = oVar.J;
        if (g0Var != null && g0Var2 != null && g0Var != g0Var2) {
            throw new IllegalArgumentException("Fragment " + oVar + " must share the same FragmentManager to be set as a target fragment");
        }
        for (o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.v(false)) {
            if (oVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + oVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (this.J == null || oVar.J == null) {
            this.f1522z = null;
            this.y = oVar;
        } else {
            this.f1522z = oVar.f1520w;
            this.y = null;
        }
        this.A = 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public v g() {
        return new b();
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.N));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.O));
        printWriter.print(" mTag=");
        printWriter.println(this.P);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1516s);
        printWriter.print(" mWho=");
        printWriter.print(this.f1520w);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.C);
        printWriter.print(" mRemoving=");
        printWriter.print(this.D);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.E);
        printWriter.print(" mInLayout=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.Q);
        printWriter.print(" mDetached=");
        printWriter.print(this.R);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.T);
        printWriter.print(" mHasMenu=");
        boolean z10 = false;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.S);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Y);
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.K);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.M);
        }
        if (this.f1521x != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1521x);
        }
        if (this.f1517t != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1517t);
        }
        if (this.f1518u != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1518u);
        }
        if (this.f1519v != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1519v);
        }
        o v10 = v(false);
        if (v10 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(v10);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.A);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        c cVar = this.Z;
        if (cVar != null) {
            z10 = cVar.f1525a;
        }
        printWriter.println(z10);
        if (m() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m());
        }
        if (o() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(o());
        }
        if (r() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(r());
        }
        if (s() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(s());
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.V);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.W);
        }
        if (l() != null) {
            d1.a.b(this).a(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.L + ":");
        this.L.w(d7.a.c(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final c i() {
        if (this.Z == null) {
            this.Z = new c();
        }
        return this.Z;
    }

    public final t j() {
        y<?> yVar = this.K;
        if (yVar == null) {
            return null;
        }
        return (t) yVar.f1603s;
    }

    public final g0 k() {
        if (this.K != null) {
            return this.L;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context l() {
        y<?> yVar = this.K;
        if (yVar == null) {
            return null;
        }
        return yVar.f1604t;
    }

    public final int m() {
        c cVar = this.Z;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1526b;
    }

    @Override // androidx.lifecycle.e
    public final c1.a n() {
        Application application;
        Context applicationContext = W().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("Could not find Application instance from Context ");
            c10.append(W().getApplicationContext());
            c10.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            Log.d("FragmentManager", c10.toString());
        }
        c1.d dVar = new c1.d();
        if (application != null) {
            dVar.f2604a.put(f0.f1676s, application);
        }
        dVar.f2604a.put(z.f1734a, this);
        dVar.f2604a.put(z.f1735b, this);
        Bundle bundle = this.f1521x;
        if (bundle != null) {
            dVar.f2604a.put(z.f1736c, bundle);
        }
        return dVar;
    }

    public final int o() {
        c cVar = this.Z;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1527c;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        U().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.U = true;
    }

    public final int p() {
        g.c cVar = this.f1509e0;
        return (cVar == g.c.INITIALIZED || this.M == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.M.p());
    }

    public final g0 q() {
        g0 g0Var = this.J;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final int r() {
        c cVar = this.Z;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1528d;
    }

    public final int s() {
        c cVar = this.Z;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1529e;
    }

    public final Resources t() {
        return W().getResources();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1520w);
        if (this.N != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.N));
        }
        if (this.P != null) {
            sb.append(" tag=");
            sb.append(this.P);
        }
        sb.append(")");
        return sb.toString();
    }

    public final String u(int i10) {
        return t().getString(i10);
    }

    public final o v(boolean z10) {
        String str;
        if (z10) {
            y0.d dVar = y0.d.f20245a;
            y0.f fVar = new y0.f(this);
            y0.d dVar2 = y0.d.f20245a;
            y0.d.c(fVar);
            d.c a10 = y0.d.a(this);
            if (a10.f20254a.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && y0.d.f(a10, getClass(), y0.f.class)) {
                y0.d.b(a10, fVar);
            }
        }
        o oVar = this.y;
        if (oVar != null) {
            return oVar;
        }
        g0 g0Var = this.J;
        if (g0Var != null && (str = this.f1522z) != null) {
            return g0Var.D(str);
        }
        return null;
    }

    @Override // androidx.lifecycle.j0
    public final i0 w() {
        if (this.J != null) {
            if (p() != 1) {
                j0 j0Var = this.J.L;
                i0 i0Var = j0Var.f1458e.get(this.f1520w);
                if (i0Var != null) {
                    return i0Var;
                }
                i0 i0Var2 = new i0();
                j0Var.f1458e.put(this.f1520w, i0Var2);
                return i0Var2;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final void x() {
        this.f1510f0 = new m(this);
        this.f1513i0 = j1.c.a(this);
        if (!this.f1514j0.contains(this.f1515k0)) {
            a aVar = this.f1515k0;
            if (this.f1516s >= 0) {
                aVar.a();
            } else {
                this.f1514j0.add(aVar);
            }
        }
    }

    public final void y() {
        x();
        this.f1508d0 = this.f1520w;
        this.f1520w = UUID.randomUUID().toString();
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.I = 0;
        this.J = null;
        this.L = new h0();
        this.K = null;
        this.N = 0;
        this.O = 0;
        this.P = null;
        this.Q = false;
        this.R = false;
    }

    public final boolean z() {
        return this.K != null && this.C;
    }
}
