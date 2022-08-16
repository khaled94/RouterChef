package e;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.n1;
import androidx.appcompat.widget.v0;
import c0.a;
import com.raouf.routerchef.R;
import j.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.h0;
import m0.l0;
import m0.z;

/* loaded from: classes.dex */
public final class h extends e.g implements e.a, LayoutInflater.Factory2 {

    /* renamed from: r0 */
    public static final r.g<String, Integer> f4183r0 = new r.g<>();

    /* renamed from: s0 */
    public static final int[] f4184s0 = {16842836};

    /* renamed from: t0 */
    public static final boolean f4185t0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: u0 */
    public static final boolean f4186u0 = true;
    public j.f A;
    public CharSequence B;
    public k0 C;
    public b D;
    public l E;
    public j.a F;
    public ActionBarContextView G;
    public PopupWindow H;
    public e.k I;
    public boolean L;
    public ViewGroup M;
    public TextView N;
    public View O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public k[] X;
    public k Y;
    public boolean Z;

    /* renamed from: a0 */
    public boolean f4187a0;

    /* renamed from: b0 */
    public boolean f4188b0;

    /* renamed from: c0 */
    public boolean f4189c0;

    /* renamed from: d0 */
    public Configuration f4190d0;

    /* renamed from: e0 */
    public int f4191e0;

    /* renamed from: f0 */
    public int f4192f0;

    /* renamed from: g0 */
    public boolean f4193g0;

    /* renamed from: h0 */
    public boolean f4194h0;

    /* renamed from: i0 */
    public i f4195i0;

    /* renamed from: j0 */
    public g f4196j0;

    /* renamed from: k0 */
    public boolean f4197k0;

    /* renamed from: l0 */
    public int f4198l0;

    /* renamed from: n0 */
    public boolean f4200n0;

    /* renamed from: o0 */
    public Rect f4201o0;

    /* renamed from: p0 */
    public Rect f4202p0;

    /* renamed from: q0 */
    public n f4203q0;

    /* renamed from: u */
    public final Object f4204u;

    /* renamed from: v */
    public final Context f4205v;

    /* renamed from: w */
    public Window f4206w;

    /* renamed from: x */
    public f f4207x;
    public final e.f y;

    /* renamed from: z */
    public s f4208z;
    public f0 J = null;
    public boolean K = true;

    /* renamed from: m0 */
    public final a f4199m0 = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            if ((hVar.f4198l0 & 1) != 0) {
                hVar.F(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f4198l0 & 4096) != 0) {
                hVar2.F(108);
            }
            h hVar3 = h.this;
            hVar3.f4197k0 = false;
            hVar3.f4198l0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements i.a {
        public b() {
            h.this = r1;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public final void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            h.this.B(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback M = h.this.M();
            if (M != null) {
                M.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.AbstractC0076a {

        /* renamed from: a */
        public a.AbstractC0076a f4211a;

        /* loaded from: classes.dex */
        public class a extends h0 {
            public a() {
                c.this = r1;
            }

            @Override // m0.g0
            public final void a() {
                h.this.G.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.G.getParent() instanceof View) {
                    WeakHashMap<View, f0> weakHashMap = z.f5921a;
                    z.h.c((View) h.this.G.getParent());
                }
                h.this.G.h();
                h.this.J.d(null);
                h hVar2 = h.this;
                hVar2.J = null;
                ViewGroup viewGroup = hVar2.M;
                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                z.h.c(viewGroup);
            }
        }

        public c(a.AbstractC0076a abstractC0076a) {
            h.this = r1;
            this.f4211a = abstractC0076a;
        }

        @Override // j.a.AbstractC0076a
        public final boolean a(j.a aVar, MenuItem menuItem) {
            return this.f4211a.a(aVar, menuItem);
        }

        @Override // j.a.AbstractC0076a
        public final boolean b(j.a aVar, Menu menu) {
            return this.f4211a.b(aVar, menu);
        }

        @Override // j.a.AbstractC0076a
        public final void c(j.a aVar) {
            this.f4211a.c(aVar);
            h hVar = h.this;
            if (hVar.H != null) {
                hVar.f4206w.getDecorView().removeCallbacks(h.this.I);
            }
            h hVar2 = h.this;
            if (hVar2.G != null) {
                hVar2.G();
                h hVar3 = h.this;
                f0 b10 = z.b(hVar3.G);
                b10.a(0.0f);
                hVar3.J = b10;
                h.this.J.d(new a());
            }
            e.f fVar = h.this.y;
            if (fVar != null) {
                fVar.h();
            }
            h hVar4 = h.this;
            hVar4.F = null;
            ViewGroup viewGroup = hVar4.M;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.h.c(viewGroup);
        }

        @Override // j.a.AbstractC0076a
        public final boolean d(j.a aVar, Menu menu) {
            ViewGroup viewGroup = h.this.M;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.h.c(viewGroup);
            return this.f4211a.d(aVar, menu);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode & 3;
            if (i10 != i11) {
                configuration3.colorMode |= i11;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode & 12;
            if (i12 != i13) {
                configuration3.colorMode |= i13;
            }
        }
    }

    /* loaded from: classes.dex */
    public class f extends j.h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Window.Callback callback) {
            super(callback);
            h.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x0182, code lost:
            if (m0.z.g.c(r1) != false) goto L63;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                Method dump skipped, instructions count: 494
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.f.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.E(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
            if (r3 != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
            if (r7 != false) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // j.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r7)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L6c
                e.h r0 = e.h.this
                int r3 = r7.getKeyCode()
                r0.N()
                e.s r4 = r0.f4208z
                if (r4 == 0) goto L3b
                e.s$d r4 = r4.f4286i
                if (r4 != 0) goto L1a
                goto L37
            L1a:
                androidx.appcompat.view.menu.e r4 = r4.f4306v
                if (r4 == 0) goto L37
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r2) goto L2e
                r5 = r2
                goto L2f
            L2e:
                r5 = r1
            L2f:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r1)
                goto L38
            L37:
                r3 = r1
            L38:
                if (r3 == 0) goto L3b
                goto L67
            L3b:
                e.h$k r3 = r0.Y
                if (r3 == 0) goto L50
                int r4 = r7.getKeyCode()
                boolean r3 = r0.R(r3, r4, r7)
                if (r3 == 0) goto L50
                e.h$k r7 = r0.Y
                if (r7 == 0) goto L67
                r7.f4233l = r2
                goto L67
            L50:
                e.h$k r3 = r0.Y
                if (r3 != 0) goto L69
                e.h$k r3 = r0.L(r1)
                r0.S(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.R(r3, r4, r7)
                r3.f4232k = r1
                if (r7 == 0) goto L69
            L67:
                r7 = r2
                goto L6a
            L69:
                r7 = r1
            L6a:
                if (r7 == 0) goto L6d
            L6c:
                r1 = r2
            L6d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.f.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // j.h, android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h hVar = h.this;
            Objects.requireNonNull(hVar);
            if (i10 == 108) {
                hVar.N();
                s sVar = hVar.f4208z;
                if (sVar != null) {
                    sVar.d(true);
                }
            }
            return true;
        }

        @Override // j.h, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            h hVar = h.this;
            Objects.requireNonNull(hVar);
            if (i10 == 108) {
                hVar.N();
                s sVar = hVar.f4208z;
                if (sVar == null) {
                    return;
                }
                sVar.d(false);
            } else if (i10 != 0) {
            } else {
                k L = hVar.L(i10);
                if (!L.f4234m) {
                    return;
                }
                hVar.C(L, false);
            }
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f573x = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.f573x = false;
            }
            return onPreparePanel;
        }

        @Override // j.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar = h.this.L(0).f4229h;
            if (eVar != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // j.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (!h.this.K || i10 != 0) ? super.onWindowStartingActionMode(callback, i10) : a(callback);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AbstractC0062h {

        /* renamed from: c */
        public final PowerManager f4215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super();
            h.this = r1;
            this.f4215c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // e.h.AbstractC0062h
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // e.h.AbstractC0062h
        public final int c() {
            return this.f4215c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // e.h.AbstractC0062h
        public final void d() {
            h.this.x();
        }
    }

    /* renamed from: e.h$h */
    /* loaded from: classes.dex */
    public abstract class AbstractC0062h {

        /* renamed from: a */
        public a f4217a;

        /* renamed from: e.h$h$a */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
                AbstractC0062h.this = r1;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                AbstractC0062h.this.d();
            }
        }

        public AbstractC0062h() {
            h.this = r1;
        }

        public final void a() {
            a aVar = this.f4217a;
            if (aVar != null) {
                try {
                    h.this.f4205v.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f4217a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f4217a == null) {
                this.f4217a = new a();
            }
            h.this.f4205v.registerReceiver(this.f4217a, b10);
        }
    }

    /* loaded from: classes.dex */
    public class i extends AbstractC0062h {

        /* renamed from: c */
        public final r f4220c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super();
            h.this = r1;
            this.f4220c = rVar;
        }

        @Override // e.h.AbstractC0062h
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        @Override // e.h.AbstractC0062h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c() {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.i.c():int");
        }

        @Override // e.h.AbstractC0062h
        public final void d() {
            h.this.x();
        }
    }

    /* loaded from: classes.dex */
    public class j extends ContentFrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context) {
            super(context, null);
            h.this = r1;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.E(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x10 < -5 || y < -5 || x10 > getWidth() + 5 || y > getHeight() + 5) {
                    h hVar = h.this;
                    hVar.C(hVar.L(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(f.a.b(getContext(), i10));
        }
    }

    /* loaded from: classes.dex */
    public static final class k {

        /* renamed from: a */
        public int f4222a;

        /* renamed from: b */
        public int f4223b;

        /* renamed from: c */
        public int f4224c;

        /* renamed from: d */
        public int f4225d;

        /* renamed from: e */
        public j f4226e;

        /* renamed from: f */
        public View f4227f;

        /* renamed from: g */
        public View f4228g;

        /* renamed from: h */
        public androidx.appcompat.view.menu.e f4229h;

        /* renamed from: i */
        public androidx.appcompat.view.menu.c f4230i;

        /* renamed from: j */
        public j.c f4231j;

        /* renamed from: k */
        public boolean f4232k;

        /* renamed from: l */
        public boolean f4233l;

        /* renamed from: m */
        public boolean f4234m;

        /* renamed from: n */
        public boolean f4235n = false;

        /* renamed from: o */
        public boolean f4236o;
        public Bundle p;

        public k(int i10) {
            this.f4222a = i10;
        }

        public final void a(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f4229h;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.v(this.f4230i);
            }
            this.f4229h = eVar;
            if (eVar == null || (cVar = this.f4230i) == null) {
                return;
            }
            eVar.b(cVar);
        }
    }

    /* loaded from: classes.dex */
    public final class l implements i.a {
        public l() {
            h.this = r1;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public final void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e l10 = eVar.l();
            boolean z11 = l10 != eVar;
            h hVar = h.this;
            if (z11) {
                eVar = l10;
            }
            k J = hVar.J(eVar);
            if (J != null) {
                if (!z11) {
                    h.this.C(J, z10);
                    return;
                }
                h.this.A(J.f4222a, J, l10);
                h.this.C(J, true);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback M;
            if (eVar == eVar.l()) {
                h hVar = h.this;
                if (!hVar.R || (M = hVar.M()) == null || h.this.f4189c0) {
                    return true;
                }
                M.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    public h(Context context, Window window, e.f fVar, Object obj) {
        r.g<String, Integer> gVar;
        Integer orDefault;
        e.e eVar;
        this.f4191e0 = -100;
        this.f4205v = context;
        this.y = fVar;
        this.f4204u = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof e.e)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    eVar = (e.e) context;
                    break;
                }
            }
            eVar = null;
            if (eVar != null) {
                this.f4191e0 = eVar.L().f();
            }
        }
        if (this.f4191e0 == -100 && (orDefault = (gVar = f4183r0).getOrDefault(this.f4204u.getClass().getName(), null)) != null) {
            this.f4191e0 = orDefault.intValue();
            gVar.remove(this.f4204u.getClass().getName());
        }
        if (window != null) {
            z(window);
        }
        androidx.appcompat.widget.l.e();
    }

    public final void A(int i10, k kVar, Menu menu) {
        if (menu == null) {
            if (kVar == null && i10 >= 0) {
                k[] kVarArr = this.X;
                if (i10 < kVarArr.length) {
                    kVar = kVarArr[i10];
                }
            }
            if (kVar != null) {
                menu = kVar.f4229h;
            }
        }
        if ((kVar == null || kVar.f4234m) && !this.f4189c0) {
            this.f4207x.f5377s.onPanelClosed(i10, menu);
        }
    }

    public final void B(androidx.appcompat.view.menu.e eVar) {
        if (this.W) {
            return;
        }
        this.W = true;
        this.C.l();
        Window.Callback M = M();
        if (M != null && !this.f4189c0) {
            M.onPanelClosed(108, eVar);
        }
        this.W = false;
    }

    public final void C(k kVar, boolean z10) {
        j jVar;
        k0 k0Var;
        if (z10 && kVar.f4222a == 0 && (k0Var = this.C) != null && k0Var.b()) {
            B(kVar.f4229h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f4205v.getSystemService("window");
        if (windowManager != null && kVar.f4234m && (jVar = kVar.f4226e) != null) {
            windowManager.removeView(jVar);
            if (z10) {
                A(kVar.f4222a, kVar, null);
            }
        }
        kVar.f4232k = false;
        kVar.f4233l = false;
        kVar.f4234m = false;
        kVar.f4227f = null;
        kVar.f4235n = true;
        if (this.Y != kVar) {
            return;
        }
        this.Y = null;
    }

    public final Configuration D(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0122, code lost:
        if (r7 != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.E(android.view.KeyEvent):boolean");
    }

    public final void F(int i10) {
        k L = L(i10);
        if (L.f4229h != null) {
            Bundle bundle = new Bundle();
            L.f4229h.x(bundle);
            if (bundle.size() > 0) {
                L.p = bundle;
            }
            L.f4229h.B();
            L.f4229h.clear();
        }
        L.f4236o = true;
        L.f4235n = true;
        if ((i10 == 108 || i10 == 0) && this.C != null) {
            k L2 = L(0);
            L2.f4232k = false;
            S(L2, null);
        }
    }

    public final void G() {
        f0 f0Var = this.J;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    public final void H() {
        ViewGroup viewGroup;
        Throwable e10;
        if (!this.L) {
            TypedArray obtainStyledAttributes = this.f4205v.obtainStyledAttributes(a6.f.B);
            if (!obtainStyledAttributes.hasValue(117)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(126, false)) {
                r(1);
            } else if (obtainStyledAttributes.getBoolean(117, false)) {
                r(108);
            }
            if (obtainStyledAttributes.getBoolean(118, false)) {
                r(109);
            }
            if (obtainStyledAttributes.getBoolean(119, false)) {
                r(10);
            }
            this.U = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            I();
            this.f4206w.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f4205v);
            if (this.V) {
                viewGroup = (ViewGroup) from.inflate(this.T ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
            } else if (this.U) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.S = false;
                this.R = false;
            } else if (this.R) {
                TypedValue typedValue = new TypedValue();
                this.f4205v.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.c(this.f4205v, typedValue.resourceId) : this.f4205v).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                k0 k0Var = (k0) viewGroup.findViewById(R.id.decor_content_parent);
                this.C = k0Var;
                k0Var.setWindowCallback(M());
                if (this.S) {
                    this.C.k(109);
                }
                if (this.P) {
                    this.C.k(2);
                }
                if (this.Q) {
                    this.C.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                e.i iVar = new e.i(this);
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.i.u(viewGroup, iVar);
                if (this.C == null) {
                    this.N = (TextView) viewGroup.findViewById(R.id.title);
                }
                Method method = n1.f972a;
                try {
                    Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                    if (!method2.isAccessible()) {
                        method2.setAccessible(true);
                    }
                    method2.invoke(viewGroup, new Object[0]);
                } catch (IllegalAccessException e11) {
                    e10 = e11;
                    Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                } catch (NoSuchMethodException unused) {
                    Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                } catch (InvocationTargetException e12) {
                    e10 = e12;
                    Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                }
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f4206w.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f4206w.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e.j(this));
                this.M = viewGroup;
                Object obj = this.f4204u;
                CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.B;
                if (!TextUtils.isEmpty(title)) {
                    k0 k0Var2 = this.C;
                    if (k0Var2 != null) {
                        k0Var2.setWindowTitle(title);
                    } else {
                        s sVar = this.f4208z;
                        if (sVar != null) {
                            sVar.i(title);
                        } else {
                            TextView textView = this.N;
                            if (textView != null) {
                                textView.setText(title);
                            }
                        }
                    }
                }
                ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.M.findViewById(16908290);
                View decorView = this.f4206w.getDecorView();
                contentFrameLayout2.y.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                if (z.g.c(contentFrameLayout2)) {
                    contentFrameLayout2.requestLayout();
                }
                TypedArray obtainStyledAttributes2 = this.f4205v.obtainStyledAttributes(a6.f.B);
                obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                if (obtainStyledAttributes2.hasValue(122)) {
                    obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                }
                if (obtainStyledAttributes2.hasValue(123)) {
                    obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                }
                if (obtainStyledAttributes2.hasValue(120)) {
                    obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                }
                if (obtainStyledAttributes2.hasValue(121)) {
                    obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout2.requestLayout();
                this.L = true;
                k L = L(0);
                if (this.f4189c0 || L.f4229h != null) {
                    return;
                }
                O(108);
                return;
            }
            StringBuilder c10 = androidx.activity.result.a.c("AppCompat does not support the current theme features: { windowActionBar: ");
            c10.append(this.R);
            c10.append(", windowActionBarOverlay: ");
            c10.append(this.S);
            c10.append(", android:windowIsFloating: ");
            c10.append(this.U);
            c10.append(", windowActionModeOverlay: ");
            c10.append(this.T);
            c10.append(", windowNoTitle: ");
            c10.append(this.V);
            c10.append(" }");
            throw new IllegalArgumentException(c10.toString());
        }
    }

    public final void I() {
        if (this.f4206w == null) {
            Object obj = this.f4204u;
            if (obj instanceof Activity) {
                z(((Activity) obj).getWindow());
            }
        }
        if (this.f4206w != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final k J(Menu menu) {
        k[] kVarArr = this.X;
        int length = kVarArr != null ? kVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            k kVar = kVarArr[i10];
            if (kVar != null && kVar.f4229h == menu) {
                return kVar;
            }
        }
        return null;
    }

    public final AbstractC0062h K(Context context) {
        if (this.f4195i0 == null) {
            if (r.f4272d == null) {
                Context applicationContext = context.getApplicationContext();
                r.f4272d = new r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4195i0 = new i(r.f4272d);
        }
        return this.f4195i0;
    }

    public final k L(int i10) {
        k[] kVarArr = this.X;
        if (kVarArr == null || kVarArr.length <= i10) {
            k[] kVarArr2 = new k[i10 + 1];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.X = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i10];
        if (kVar == null) {
            k kVar2 = new k(i10);
            kVarArr[i10] = kVar2;
            return kVar2;
        }
        return kVar;
    }

    public final Window.Callback M() {
        return this.f4206w.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            r3 = this;
            r3.H()
            boolean r0 = r3.R
            if (r0 == 0) goto L36
            e.s r0 = r3.f4208z
            if (r0 == 0) goto Lc
            goto L36
        Lc:
            java.lang.Object r0 = r3.f4204u
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            e.s r0 = new e.s
            java.lang.Object r1 = r3.f4204u
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.S
            r0.<init>(r1, r2)
            goto L2b
        L1e:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2d
            e.s r0 = new e.s
            java.lang.Object r1 = r3.f4204u
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
        L2b:
            r3.f4208z = r0
        L2d:
            e.s r0 = r3.f4208z
            if (r0 == 0) goto L36
            boolean r1 = r3.f4200n0
            r0.g(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.N():void");
    }

    public final void O(int i10) {
        this.f4198l0 = (1 << i10) | this.f4198l0;
        if (!this.f4197k0) {
            View decorView = this.f4206w.getDecorView();
            a aVar = this.f4199m0;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.m(decorView, aVar);
            this.f4197k0 = true;
        }
    }

    public final int P(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 == 0) {
                    if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return K(context).c();
                    }
                    return -1;
                } else if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.f4196j0 == null) {
                            this.f4196j0 = new g(context);
                        }
                        return this.f4196j0.f4215c.isPowerSaveMode() ? 2 : 1;
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
        if (r15 != null) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(e.h.k r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.Q(e.h$k, android.view.KeyEvent):void");
    }

    public final boolean R(k kVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.e eVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!kVar.f4232k && !S(kVar, keyEvent)) || (eVar = kVar.f4229h) == null) {
            return false;
        }
        return eVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean S(k kVar, KeyEvent keyEvent) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        Resources.Theme theme;
        k0 k0Var4;
        if (this.f4189c0) {
            return false;
        }
        if (kVar.f4232k) {
            return true;
        }
        k kVar2 = this.Y;
        if (kVar2 != null && kVar2 != kVar) {
            C(kVar2, false);
        }
        Window.Callback M = M();
        if (M != null) {
            kVar.f4228g = M.onCreatePanelView(kVar.f4222a);
        }
        int i10 = kVar.f4222a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (k0Var4 = this.C) != null) {
            k0Var4.c();
        }
        if (kVar.f4228g == null) {
            androidx.appcompat.view.menu.e eVar = kVar.f4229h;
            if (eVar == null || kVar.f4236o) {
                if (eVar == null) {
                    Context context = this.f4205v;
                    int i11 = kVar.f4222a;
                    if ((i11 == 0 || i11 == 108) && this.C != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            j.c cVar = new j.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.e eVar2 = new androidx.appcompat.view.menu.e(context);
                    eVar2.f555e = this;
                    kVar.a(eVar2);
                    if (kVar.f4229h == null) {
                        return false;
                    }
                }
                if (z10 && (k0Var3 = this.C) != null) {
                    if (this.D == null) {
                        this.D = new b();
                    }
                    k0Var3.a(kVar.f4229h, this.D);
                }
                kVar.f4229h.B();
                if (!M.onCreatePanelMenu(kVar.f4222a, kVar.f4229h)) {
                    kVar.a(null);
                    if (z10 && (k0Var2 = this.C) != null) {
                        k0Var2.a(null, this.D);
                    }
                    return false;
                }
                kVar.f4236o = false;
            }
            kVar.f4229h.B();
            Bundle bundle = kVar.p;
            if (bundle != null) {
                kVar.f4229h.w(bundle);
                kVar.p = null;
            }
            if (!M.onPreparePanel(0, kVar.f4228g, kVar.f4229h)) {
                if (z10 && (k0Var = this.C) != null) {
                    k0Var.a(null, this.D);
                }
                kVar.f4229h.A();
                return false;
            }
            kVar.f4229h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            kVar.f4229h.A();
        }
        kVar.f4232k = true;
        kVar.f4233l = false;
        this.Y = kVar;
        return true;
    }

    public final void T() {
        if (!this.L) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final int U(l0 l0Var) {
        boolean z10;
        boolean z11;
        int i10;
        Context context;
        int f10 = l0Var.f();
        ActionBarContextView actionBarContextView = this.G;
        int i11 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
            boolean z12 = true;
            if (this.G.isShown()) {
                if (this.f4201o0 == null) {
                    this.f4201o0 = new Rect();
                    this.f4202p0 = new Rect();
                }
                Rect rect = this.f4201o0;
                Rect rect2 = this.f4202p0;
                rect.set(l0Var.d(), l0Var.f(), l0Var.e(), l0Var.c());
                n1.a(this.M, rect, rect2);
                int i12 = rect.top;
                int i13 = rect.left;
                int i14 = rect.right;
                ViewGroup viewGroup = this.M;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                l0 a10 = z.j.a(viewGroup);
                int d5 = a10 == null ? 0 : a10.d();
                int e10 = a10 == null ? 0 : a10.e();
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i12;
                    marginLayoutParams.leftMargin = i13;
                    marginLayoutParams.rightMargin = i14;
                    z11 = true;
                }
                if (i12 <= 0 || this.O != null) {
                    View view = this.O;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != d5 || marginLayoutParams2.rightMargin != e10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = d5;
                            marginLayoutParams2.rightMargin = e10;
                            this.O.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f4205v);
                    this.O = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = d5;
                    layoutParams.rightMargin = e10;
                    this.M.addView(this.O, -1, layoutParams);
                }
                View view3 = this.O;
                z10 = view3 != null;
                if (z10 && view3.getVisibility() != 0) {
                    View view4 = this.O;
                    if ((z.d.g(view4) & 8192) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        context = this.f4205v;
                        i10 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f4205v;
                        i10 = R.color.abc_decor_view_status_guard;
                    }
                    Object obj = c0.a.f2602a;
                    view4.setBackgroundColor(a.c.a(context, i10));
                }
                if (!this.T && z10) {
                    f10 = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z12 = false;
                z10 = false;
            }
            if (z12) {
                this.G.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.O;
        if (view5 != null) {
            if (z10) {
                i11 = 0;
            }
            view5.setVisibility(i11);
        }
        return f10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public final boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        k J;
        Window.Callback M = M();
        if (M == null || this.f4189c0 || (J = J(eVar.l())) == null) {
            return false;
        }
        return M.onMenuItemSelected(J.f4222a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public final void b(androidx.appcompat.view.menu.e eVar) {
        k0 k0Var = this.C;
        if (k0Var == null || !k0Var.g() || (ViewConfiguration.get(this.f4205v).hasPermanentMenuKey() && !this.C.d())) {
            k L = L(0);
            L.f4235n = true;
            C(L, false);
            Q(L, null);
            return;
        }
        Window.Callback M = M();
        if (this.C.b()) {
            this.C.e();
            if (this.f4189c0) {
                return;
            }
            M.onPanelClosed(108, L(0).f4229h);
        } else if (M == null || this.f4189c0) {
        } else {
            if (this.f4197k0 && (1 & this.f4198l0) != 0) {
                this.f4206w.getDecorView().removeCallbacks(this.f4199m0);
                this.f4199m0.run();
            }
            k L2 = L(0);
            androidx.appcompat.view.menu.e eVar2 = L2.f4229h;
            if (eVar2 == null || L2.f4236o || !M.onPreparePanel(0, L2.f4228g, eVar2)) {
                return;
            }
            M.onMenuOpened(108, L2.f4229h);
            this.C.f();
        }
    }

    @Override // e.g
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        ((ViewGroup) this.M.findViewById(16908290)).addView(view, layoutParams);
        this.f4207x.f5377s.onContentChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x016f  */
    @Override // e.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Context d(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.d(android.content.Context):android.content.Context");
    }

    @Override // e.g
    public final <T extends View> T e(int i10) {
        H();
        return (T) this.f4206w.findViewById(i10);
    }

    @Override // e.g
    public final int f() {
        return this.f4191e0;
    }

    @Override // e.g
    public final MenuInflater g() {
        if (this.A == null) {
            N();
            s sVar = this.f4208z;
            this.A = new j.f(sVar != null ? sVar.e() : this.f4205v);
        }
        return this.A;
    }

    @Override // e.g
    public final e.a h() {
        N();
        return this.f4208z;
    }

    @Override // e.g
    public final void i() {
        LayoutInflater from = LayoutInflater.from(this.f4205v);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (from.getFactory2() instanceof h) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // e.g
    public final void j() {
        if (this.f4208z != null) {
            N();
            Objects.requireNonNull(this.f4208z);
            O(0);
        }
    }

    @Override // e.g
    public final void k() {
        if (this.R && this.L) {
            N();
            s sVar = this.f4208z;
            if (sVar != null) {
                sVar.h(sVar.f4278a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.l a10 = androidx.appcompat.widget.l.a();
        Context context = this.f4205v;
        synchronized (a10) {
            v0 v0Var = a10.f932a;
            synchronized (v0Var) {
                r.d<WeakReference<Drawable.ConstantState>> dVar = v0Var.f1027d.get(context);
                if (dVar != null) {
                    dVar.b();
                }
            }
        }
        this.f4190d0 = new Configuration(this.f4205v.getResources().getConfiguration());
        y(false);
    }

    @Override // e.g
    public final void l() {
        this.f4187a0 = true;
        y(false);
        I();
        Object obj = this.f4204u;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = b0.l.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                s sVar = this.f4208z;
                if (sVar == null) {
                    this.f4200n0 = true;
                } else {
                    sVar.g(true);
                }
            }
            synchronized (e.g.f4182t) {
                e.g.q(this);
                e.g.f4181s.add(new WeakReference<>(this));
            }
        }
        this.f4190d0 = new Configuration(this.f4205v.getResources().getConfiguration());
        this.f4188b0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // e.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4204u
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = e.g.f4182t
            monitor-enter(r0)
            e.g.q(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f4197k0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f4206w
            android.view.View r0 = r0.getDecorView()
            e.h$a r1 = r3.f4199m0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f4189c0 = r0
            int r0 = r3.f4191e0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f4204u
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            r.g<java.lang.String, java.lang.Integer> r0 = e.h.f4183r0
            java.lang.Object r1 = r3.f4204u
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f4191e0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            r.g<java.lang.String, java.lang.Integer> r0 = e.h.f4183r0
            java.lang.Object r1 = r3.f4204u
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            e.h$i r0 = r3.f4195i0
            if (r0 == 0) goto L63
            r0.a()
        L63:
            e.h$g r0 = r3.f4196j0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.m():void");
    }

    @Override // e.g
    public final void n() {
        N();
        s sVar = this.f4208z;
        if (sVar != null) {
            sVar.f4298v = true;
        }
    }

    @Override // e.g
    public final void o() {
        x();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
        if (r10.equals("ImageButton") == false) goto L65;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // e.g
    public final void p() {
        N();
        s sVar = this.f4208z;
        if (sVar != null) {
            sVar.f4298v = false;
            j.g gVar = sVar.f4297u;
            if (gVar == null) {
                return;
            }
            gVar.a();
        }
    }

    @Override // e.g
    public final boolean r(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (!this.V || i10 != 108) {
            if (this.R && i10 == 1) {
                this.R = false;
            }
            if (i10 == 1) {
                T();
                this.V = true;
                return true;
            } else if (i10 == 2) {
                T();
                this.P = true;
                return true;
            } else if (i10 == 5) {
                T();
                this.Q = true;
                return true;
            } else if (i10 == 10) {
                T();
                this.T = true;
                return true;
            } else if (i10 == 108) {
                T();
                this.R = true;
                return true;
            } else if (i10 != 109) {
                return this.f4206w.requestFeature(i10);
            } else {
                T();
                this.S = true;
                return true;
            }
        }
        return false;
    }

    @Override // e.g
    public final void s(int i10) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4205v).inflate(i10, viewGroup);
        this.f4207x.f5377s.onContentChanged();
    }

    @Override // e.g
    public final void t(View view) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4207x.f5377s.onContentChanged();
    }

    @Override // e.g
    public final void u(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4207x.f5377s.onContentChanged();
    }

    @Override // e.g
    public final void v(int i10) {
        this.f4192f0 = i10;
    }

    @Override // e.g
    public final void w(CharSequence charSequence) {
        this.B = charSequence;
        k0 k0Var = this.C;
        if (k0Var != null) {
            k0Var.setWindowTitle(charSequence);
            return;
        }
        s sVar = this.f4208z;
        if (sVar != null) {
            sVar.i(charSequence);
            return;
        }
        TextView textView = this.N;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public final boolean x() {
        return y(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(boolean r12) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.y(boolean):boolean");
    }

    public final void z(Window window) {
        if (this.f4206w == null) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof f) {
                throw new IllegalStateException("AppCompat has already installed itself into the Window");
            }
            f fVar = new f(callback);
            this.f4207x = fVar;
            window.setCallback(fVar);
            f1 p = f1.p(this.f4205v, null, f4184s0);
            Drawable h10 = p.h(0);
            if (h10 != null) {
                window.setBackgroundDrawable(h10);
            }
            p.r();
            this.f4206w = window;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
}
