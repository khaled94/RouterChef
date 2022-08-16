package m0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.raouf.routerchef.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import m0.a;
import m0.c;
import m0.l0;
import m0.z;
import n0.f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b */
    public static Field f5922b;

    /* renamed from: a */
    public static WeakHashMap<View, f0> f5921a = null;

    /* renamed from: c */
    public static boolean f5923c = false;

    /* renamed from: d */
    public static final int[] f5924d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final u f5925e = u.f5920s;

    /* renamed from: f */
    public static final a f5926f = new a();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: s */
        public final WeakHashMap<View, Boolean> f5927s = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f5927s.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
                    if (booleanValue != z10) {
                        z.j(key, z10 ? 16 : 32);
                        this.f5927s.put(key, Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: a */
        public final int f5928a;

        /* renamed from: b */
        public final Class<T> f5929b;

        /* renamed from: c */
        public final int f5930c;

        /* renamed from: d */
        public final int f5931d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f5928a = i10;
            this.f5929b = cls;
            this.f5931d = i11;
            this.f5930c = i12;
        }

        public final boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public final T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f5930c) {
                return b(view);
            }
            T t10 = (T) view.getTag(this.f5928a);
            if (!this.f5929b.isInstance(t10)) {
                return null;
            }
            return t10;
        }

        public final void e(View view, T t10) {
            if (Build.VERSION.SDK_INT >= this.f5930c) {
                c(view, t10);
            } else if (!f(d(view), t10)) {
            } else {
                m0.a e10 = z.e(view);
                if (e10 == null) {
                    e10 = new m0.a();
                }
                z.p(view, e10);
                view.setTag(this.f5928a, t10);
                z.j(view, this.f5931d);
            }
        }

        public abstract boolean f(T t10, T t11);
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j3) {
            view.postOnAnimationDelayed(runnable, j3);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public l0 f5932a = null;

            /* renamed from: b */
            public final /* synthetic */ View f5933b;

            /* renamed from: c */
            public final /* synthetic */ m0.q f5934c;

            public a(View view, m0.q qVar) {
                this.f5933b = view;
                this.f5934c = qVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                l0 l10 = l0.l(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    i.a(windowInsets, this.f5933b);
                    if (l10.equals(this.f5932a)) {
                        return this.f5934c.a(view, l10).k();
                    }
                }
                this.f5932a = l10;
                l0 a10 = this.f5934c.a(view, l10);
                if (i10 >= 30) {
                    return a10.k();
                }
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                h.c(view);
                return a10.k();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static l0 b(View view, l0 l0Var, Rect rect) {
            WindowInsets k10 = l0Var.k();
            if (k10 != null) {
                return l0.l(view.computeSystemWindowInsets(k10, rect), view);
            }
            rect.setEmpty();
            return l0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static l0 j(View view) {
            if (!l0.a.f5885d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = l0.a.f5882a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) l0.a.f5883b.get(obj);
                Rect rect2 = (Rect) l0.a.f5884c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i10 = Build.VERSION.SDK_INT;
                l0.e dVar = i10 >= 30 ? new l0.d() : i10 >= 29 ? new l0.c() : new l0.b();
                dVar.c(e0.b.c(rect));
                dVar.d(e0.b.c(rect2));
                l0 b10 = dVar.b();
                b10.j(b10);
                b10.a(view.getRootView());
                return b10;
            } catch (IllegalAccessException e10) {
                StringBuilder c10 = androidx.activity.result.a.c("Failed to get insets from AttachInfo. ");
                c10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", c10.toString(), e10);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, m0.q qVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, qVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static l0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            l0 l10 = l0.l(rootWindowInsets, null);
            l10.j(l10);
            l10.a(view.getRootView());
            return l10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, final q qVar) {
            r.g gVar = (r.g) view.getTag(R.id.tag_unhandled_key_listeners);
            if (gVar == null) {
                gVar = new r.g();
                view.setTag(R.id.tag_unhandled_key_listeners, gVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: m0.a0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return z.q.this.a();
                }
            };
            gVar.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            r.g gVar = (r.g) view.getTag(R.id.tag_unhandled_key_listeners);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.getOrDefault(qVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static m0.c b(View view, m0.c cVar) {
            ContentInfo c10 = cVar.f5853a.c();
            Objects.requireNonNull(c10);
            ContentInfo performReceiveContent = view.performReceiveContent(c10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == c10 ? cVar : new m0.c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, m0.r rVar) {
            if (rVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(rVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class p implements OnReceiveContentListener {

        /* renamed from: a */
        public final m0.r f5935a;

        public p(m0.r rVar) {
            this.f5935a = rVar;
        }

        @Override // android.view.OnReceiveContentListener
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            m0.c cVar = new m0.c(new c.d(contentInfo));
            m0.c a10 = this.f5935a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo c10 = a10.f5853a.c();
            Objects.requireNonNull(c10);
            return c10;
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        boolean a();
    }

    /* loaded from: classes.dex */
    public static class r {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f5936d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f5937a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f5938b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f5939c = null;

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f5937a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a10 == null);
                return a10;
            }
            if (!b(view, keyEvent)) {
                return null;
            }
            return view;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((q) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static void a(View view, f.a aVar) {
        m0.a e10 = e(view);
        if (e10 == null) {
            e10 = new m0.a();
        }
        p(view, e10);
        m(aVar.a(), view);
        h(view).add(aVar);
        j(view, 0);
    }

    public static f0 b(View view) {
        if (f5921a == null) {
            f5921a = new WeakHashMap<>();
        }
        f0 f0Var = f5921a.get(view);
        if (f0Var == null) {
            f0 f0Var2 = new f0(view);
            f5921a.put(view, f0Var2);
            return f0Var2;
        }
        return f0Var;
    }

    public static l0 c(View view, l0 l0Var) {
        WindowInsets k10 = l0Var.k();
        if (k10 != null) {
            WindowInsets a10 = h.a(view, k10);
            if (!a10.equals(k10)) {
                return l0.l(a10, view);
            }
        }
        return l0Var;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = r.f5936d;
        r rVar = (r) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (rVar == null) {
            rVar = new r();
            view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = rVar.f5937a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = r.f5936d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (rVar.f5937a == null) {
                        rVar.f5937a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = r.f5936d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            rVar.f5937a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                rVar.f5937a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = rVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (rVar.f5938b == null) {
                    rVar.f5938b = new SparseArray<>();
                }
                rVar.f5938b.put(keyCode, new WeakReference<>(a10));
            }
        }
        return a10 != null;
    }

    public static m0.a e(View view) {
        View.AccessibilityDelegate f10 = f(view);
        if (f10 == null) {
            return null;
        }
        return f10 instanceof a.C0093a ? ((a.C0093a) f10).f5849a : new m0.a(f10);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(view);
        }
        if (f5923c) {
            return null;
        }
        if (f5922b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5922b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5923c = true;
                return null;
            }
        }
        Object obj = f5922b.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    public static CharSequence g(View view) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = l.b(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static List<f.a> h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] i(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void j(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        boolean z10 = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
        int i11 = 32;
        if (g.a(view) != 0 || z10) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            if (!z10) {
                i11 = 2048;
            }
            obtain.setEventType(i11);
            g.g(obtain, i10);
            if (z10) {
                obtain.getText().add(g(view));
                if (d.c(view) == 0) {
                    d.s(view, 1);
                }
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof View)) {
                        break;
                    } else if (d.c((View) parent) == 4) {
                        d.s(view, 2);
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            view.sendAccessibilityEventUnchecked(obtain);
        } else if (i10 == 32) {
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            g.g(obtain2, i10);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        } else if (view.getParent() == null) {
        } else {
            try {
                g.e(view.getParent(), view, view, i10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
            }
        }
    }

    public static l0 k(View view, l0 l0Var) {
        WindowInsets k10 = l0Var.k();
        if (k10 != null) {
            WindowInsets b10 = h.b(view, k10);
            if (!b10.equals(k10)) {
                return l0.l(b10, view);
            }
        }
        return l0Var;
    }

    public static m0.c l(View view, m0.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, cVar);
        }
        m0.r rVar = (m0.r) view.getTag(R.id.tag_on_receive_content_listener);
        if (rVar == null) {
            return (view instanceof s ? (s) view : f5925e).a(cVar);
        }
        m0.c a10 = rVar.a(view, cVar);
        if (a10 == null) {
            return null;
        }
        return (view instanceof s ? (s) view : f5925e).a(a10);
    }

    public static void m(int i10, View view) {
        List<f.a> h10 = h(view);
        for (int i11 = 0; i11 < h10.size(); i11++) {
            if (h10.get(i11).a() == i10) {
                h10.remove(i11);
                return;
            }
        }
    }

    public static void n(View view, f.a aVar, n0.j jVar) {
        a(view, new f.a(null, aVar.f16413b, null, jVar, aVar.f16414c));
    }

    public static void o(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void p(View view, m0.a aVar) {
        if (aVar == null && (f(view) instanceof a.C0093a)) {
            aVar = new m0.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f5848b);
    }

    public static void q(View view, CharSequence charSequence) {
        new w(CharSequence.class).e(view, charSequence);
        if (charSequence != null) {
            a aVar = f5926f;
            aVar.f5927s.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (!g.b(view)) {
                return;
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            return;
        }
        a aVar2 = f5926f;
        aVar2.f5927s.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        d.o(view.getViewTreeObserver(), aVar2);
    }
}
