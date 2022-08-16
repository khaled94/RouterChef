package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.e0;
import androidx.fragment.app.g0;
import androidx.fragment.app.o;
import androidx.fragment.app.o0;
import androidx.lifecycle.l;
import androidx.lifecycle.s;
import com.raouf.routerchef.R;
import e1.h;

/* loaded from: classes.dex */
public class n extends o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0;

    /* renamed from: m0 */
    public Handler f1481m0;

    /* renamed from: v0 */
    public boolean f1490v0;
    public Dialog x0;

    /* renamed from: y0 */
    public boolean f1492y0;

    /* renamed from: z0 */
    public boolean f1493z0;

    /* renamed from: n0 */
    public a f1482n0 = new a();

    /* renamed from: o0 */
    public b f1483o0 = new b();

    /* renamed from: p0 */
    public c f1484p0 = new c();

    /* renamed from: q0 */
    public int f1485q0 = 0;

    /* renamed from: r0 */
    public int f1486r0 = 0;

    /* renamed from: s0 */
    public boolean f1487s0 = true;

    /* renamed from: t0 */
    public boolean f1488t0 = true;

    /* renamed from: u0 */
    public int f1489u0 = -1;

    /* renamed from: w0 */
    public s<l> f1491w0 = new d();
    public boolean B0 = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            n.this = r1;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            n nVar = n.this;
            nVar.f1484p0.onDismiss(nVar.x0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
            n.this = r1;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            n nVar = n.this;
            Dialog dialog = nVar.x0;
            if (dialog != null) {
                nVar.onCancel(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
            n.this = r1;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            n nVar = n.this;
            Dialog dialog = nVar.x0;
            if (dialog != null) {
                nVar.onDismiss(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements s<l> {
        public d() {
            n.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class e extends v {

        /* renamed from: a */
        public final /* synthetic */ v f1498a;

        public e(v vVar) {
            n.this = r1;
            this.f1498a = vVar;
        }

        @Override // androidx.fragment.app.v
        public final View i(int i10) {
            if (this.f1498a.j()) {
                return this.f1498a.i(i10);
            }
            Dialog dialog = n.this.x0;
            if (dialog == null) {
                return null;
            }
            return dialog.findViewById(i10);
        }

        @Override // androidx.fragment.app.v
        public final boolean j() {
            return this.f1498a.j() || n.this.B0;
        }
    }

    @Override // androidx.fragment.app.o
    @Deprecated
    public final void C() {
        this.U = true;
    }

    @Override // androidx.fragment.app.o
    public final void E() {
        this.U = true;
        y<?> yVar = this.K;
        if ((yVar == null ? null : yVar.f1603s) != null) {
            this.U = true;
        }
        this.f1512h0.d(this.f1491w0);
        if (!this.A0) {
            this.f1493z0 = false;
        }
    }

    @Override // androidx.fragment.app.o
    public void F(Bundle bundle) {
        super.F(bundle);
        this.f1481m0 = new Handler();
        this.f1488t0 = this.O == 0;
        if (bundle != null) {
            this.f1485q0 = bundle.getInt("android:style", 0);
            this.f1486r0 = bundle.getInt("android:theme", 0);
            this.f1487s0 = bundle.getBoolean("android:cancelable", true);
            this.f1488t0 = bundle.getBoolean("android:showsDialog", this.f1488t0);
            this.f1489u0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.o
    public final void I() {
        this.U = true;
        Dialog dialog = this.x0;
        if (dialog != null) {
            this.f1492y0 = true;
            dialog.setOnDismissListener(null);
            this.x0.dismiss();
            if (!this.f1493z0) {
                onDismiss(this.x0);
            }
            this.x0 = null;
            this.B0 = false;
        }
    }

    @Override // androidx.fragment.app.o
    public final void J() {
        this.U = true;
        if (!this.A0 && !this.f1493z0) {
            this.f1493z0 = true;
        }
        this.f1512h0.g(this.f1491w0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x0030, B:20:0x0036, B:21:0x003b, B:22:0x003e, B:24:0x0046, B:25:0x004d, B:26:0x0065), top: B:46:0x001a }] */
    @Override // androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater K(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.K(r8)
            boolean r0 = r7.f1488t0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L9b
            boolean r3 = r7.f1490v0
            if (r3 == 0) goto L11
            goto L9b
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.B0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f1490v0 = r3     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f0()     // Catch: java.lang.Throwable -> L6b
            r7.x0 = r4     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f1488t0     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L65
            int r5 = r7.f1485q0     // Catch: java.lang.Throwable -> L6b
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L6b
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L6b
        L3e:
            android.content.Context r4 = r7.l()     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L4d
            android.app.Dialog r5 = r7.x0     // Catch: java.lang.Throwable -> L6b
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L6b
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L6b
        L4d:
            android.app.Dialog r4 = r7.x0     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f1487s0     // Catch: java.lang.Throwable -> L6b
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.x0     // Catch: java.lang.Throwable -> L6b
            androidx.fragment.app.n$b r5 = r7.f1483o0     // Catch: java.lang.Throwable -> L6b
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.x0     // Catch: java.lang.Throwable -> L6b
            androidx.fragment.app.n$c r5 = r7.f1484p0     // Catch: java.lang.Throwable -> L6b
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L6b
            r7.B0 = r3     // Catch: java.lang.Throwable -> L6b
            goto L68
        L65:
            r3 = 0
            r7.x0 = r3     // Catch: java.lang.Throwable -> L6b
        L68:
            r7.f1490v0 = r0
            goto L6f
        L6b:
            r8 = move-exception
            r7.f1490v0 = r0
            throw r8
        L6f:
            boolean r0 = androidx.fragment.app.g0.K(r2)
            if (r0 == 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8e:
            android.app.Dialog r0 = r7.x0
            if (r0 == 0) goto L9a
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L9a:
            return r8
        L9b:
            boolean r0 = androidx.fragment.app.g0.K(r2)
            if (r0 == 0) goto Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f1488t0
            if (r2 != 0) goto Lbe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mShowsDialog = false: "
            goto Lc5
        Lbe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mCreatingDialog = true: "
        Lc5:
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.K(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.o
    public void N(Bundle bundle) {
        Dialog dialog = this.x0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f1485q0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f1486r0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f1487s0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f1488t0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f1489u0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.o
    public void O() {
        this.U = true;
        Dialog dialog = this.x0;
        if (dialog != null) {
            this.f1492y0 = false;
            dialog.show();
            View decorView = this.x0.getWindow().getDecorView();
            m3.a.a(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            h.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.o
    public void P() {
        this.U = true;
        Dialog dialog = this.x0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.o
    public final void R(Bundle bundle) {
        Bundle bundle2;
        this.U = true;
        if (this.x0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.x0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.o
    public final void S(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.S(layoutInflater, viewGroup, bundle);
        if (this.W != null || this.x0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.x0.onRestoreInstanceState(bundle2);
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f1493z0) {
            return;
        }
        this.f1493z0 = true;
        this.A0 = false;
        Dialog dialog = this.x0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.x0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f1481m0.getLooper()) {
                    onDismiss(this.x0);
                } else {
                    this.f1481m0.post(this.f1482n0);
                }
            }
        }
        this.f1492y0 = true;
        if (this.f1489u0 >= 0) {
            g0 q10 = q();
            int i10 = this.f1489u0;
            if (i10 >= 0) {
                q10.y(new g0.m(i10), z10);
                this.f1489u0 = -1;
                return;
            }
            throw new IllegalArgumentException(e0.a("Bad id: ", i10));
        }
        androidx.fragment.app.b bVar = new androidx.fragment.app.b(q());
        bVar.p = true;
        g0 g0Var = this.J;
        if (g0Var != null && g0Var != bVar.f1364q) {
            StringBuilder c10 = androidx.activity.result.a.c("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            c10.append(toString());
            c10.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(c10.toString());
        }
        bVar.b(new o0.a(3, this));
        if (z10) {
            bVar.g(true);
        } else {
            bVar.c();
        }
    }

    public Dialog f0() {
        if (g0.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.h(W(), this.f1486r0);
    }

    @Override // androidx.fragment.app.o
    public final v g() {
        return new e(new o.b());
    }

    public final Dialog g0() {
        Dialog dialog = this.x0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1492y0) {
            if (g0.K(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            e0(true, true);
        }
    }
}
