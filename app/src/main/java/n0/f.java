package n0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n0.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d */
    public static int f16400d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f16401a;

    /* renamed from: b */
    public int f16402b = -1;

    /* renamed from: c */
    public int f16403c = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e */
        public static final a f16404e = new a(16);

        /* renamed from: f */
        public static final a f16405f = new a(4096);

        /* renamed from: g */
        public static final a f16406g = new a(8192);

        /* renamed from: h */
        public static final a f16407h = new a(262144);

        /* renamed from: i */
        public static final a f16408i = new a(524288);

        /* renamed from: j */
        public static final a f16409j = new a(1048576);

        /* renamed from: k */
        public static final a f16410k = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);

        /* renamed from: l */
        public static final a f16411l = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);

        /* renamed from: a */
        public final Object f16412a;

        /* renamed from: b */
        public final int f16413b;

        /* renamed from: c */
        public final Class<? extends j.a> f16414c;

        /* renamed from: d */
        public final j f16415d;

        static {
            new a(1);
            new a(2);
            new a(4);
            new a(8);
            new a(32);
            new a(64);
            new a(128);
            new a(256, j.b.class);
            new a(512, j.b.class);
            new a(1024, j.c.class);
            new a(2048, j.c.class);
            new a(16384);
            new a(32768);
            new a(65536);
            new a(131072, j.g.class);
            new a(2097152, j.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, j.e.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, j.f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, j.d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            if (i10 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new a(accessibilityAction, 16908372, null, null, null);
        }

        public a(int i10) {
            this(null, i10, null, null, null);
        }

        public a(int i10, Class cls) {
            this(null, i10, null, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, j jVar, Class<? extends j.a> cls) {
            this.f16413b = i10;
            this.f16415d = jVar;
            this.f16412a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f16414c = cls;
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f16412a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f16412a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.f16412a;
                Object obj3 = ((a) obj).f16412a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f16412a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Object f16416a;

        public b(Object obj) {
            this.f16416a = obj;
        }

        public static b a(int i10, int i11, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final Object f16417a;

        public c(Object obj) {
            this.f16417a = obj;
        }

        public static c a(int i10, int i11, int i12, int i13, boolean z10) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z10));
        }
    }

    public f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f16401a = accessibilityNodeInfo;
    }

    public static String d(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return "ACTION_CLEAR_FOCUS";
            }
            switch (i10) {
                case 4:
                    return "ACTION_SELECT";
                case 8:
                    return "ACTION_CLEAR_SELECTION";
                case 16:
                    return "ACTION_CLICK";
                case 32:
                    return "ACTION_LONG_CLICK";
                case 64:
                    return "ACTION_ACCESSIBILITY_FOCUS";
                case 128:
                    return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                case 256:
                    return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                case 512:
                    return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                case 1024:
                    return "ACTION_NEXT_HTML_ELEMENT";
                case 2048:
                    return "ACTION_PREVIOUS_HTML_ELEMENT";
                case 4096:
                    return "ACTION_SCROLL_FORWARD";
                case 8192:
                    return "ACTION_SCROLL_BACKWARD";
                case 16384:
                    return "ACTION_COPY";
                case 32768:
                    return "ACTION_PASTE";
                case 65536:
                    return "ACTION_CUT";
                case 131072:
                    return "ACTION_SET_SELECTION";
                case 262144:
                    return "ACTION_EXPAND";
                case 524288:
                    return "ACTION_COLLAPSE";
                case 2097152:
                    return "ACTION_SET_TEXT";
                case 16908354:
                    return "ACTION_MOVE_WINDOW";
                case 16908372:
                    return "ACTION_IME_ENTER";
                default:
                    switch (i10) {
                        case 16908342:
                            return "ACTION_SHOW_ON_SCREEN";
                        case 16908343:
                            return "ACTION_SCROLL_TO_POSITION";
                        case 16908344:
                            return "ACTION_SCROLL_UP";
                        case 16908345:
                            return "ACTION_SCROLL_LEFT";
                        case 16908346:
                            return "ACTION_SCROLL_DOWN";
                        case 16908347:
                            return "ACTION_SCROLL_RIGHT";
                        case 16908348:
                            return "ACTION_CONTEXT_CLICK";
                        case 16908349:
                            return "ACTION_SET_PROGRESS";
                        default:
                            switch (i10) {
                                case 16908356:
                                    return "ACTION_SHOW_TOOLTIP";
                                case 16908357:
                                    return "ACTION_HIDE_TOOLTIP";
                                case 16908358:
                                    return "ACTION_PAGE_UP";
                                case 16908359:
                                    return "ACTION_PAGE_DOWN";
                                case 16908360:
                                    return "ACTION_PAGE_LEFT";
                                case 16908361:
                                    return "ACTION_PAGE_RIGHT";
                                case 16908362:
                                    return "ACTION_PRESS_AND_HOLD";
                                default:
                                    return "ACTION_UNKNOWN";
                            }
                    }
            }
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] f(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public final void a(int i10) {
        this.f16401a.addAction(i10);
    }

    public final void b(a aVar) {
        this.f16401a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f16412a);
    }

    public final List<Integer> c(String str) {
        ArrayList<Integer> integerArrayList = this.f16401a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f16401a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    @Deprecated
    public final void e(Rect rect) {
        this.f16401a.getBoundsInParent(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f16401a;
        if (accessibilityNodeInfo == null) {
            if (fVar.f16401a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(fVar.f16401a)) {
            return false;
        }
        return this.f16403c == fVar.f16403c && this.f16402b == fVar.f16402b;
    }

    public final CharSequence g() {
        return this.f16401a.getContentDescription();
    }

    public final Bundle h() {
        return this.f16401a.getExtras();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f16401a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final CharSequence i() {
        if (!c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f16401a.getText(), 0, this.f16401a.getText().length()));
            for (int i10 = 0; i10 < c10.size(); i10++) {
                spannableString.setSpan(new n0.a(c13.get(i10).intValue(), this, h().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), c10.get(i10).intValue(), c11.get(i10).intValue(), c12.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f16401a.getText();
    }

    public final boolean j() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f16401a.isShowingHintText();
        }
        Bundle h10 = h();
        return h10 != null && (h10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
    }

    public final void k(int i10, boolean z10) {
        Bundle h10 = h();
        if (h10 != null) {
            int i11 = h10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            h10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    @Deprecated
    public final void l(Rect rect) {
        this.f16401a.setBoundsInParent(rect);
    }

    public final void m(boolean z10) {
        this.f16401a.setCheckable(z10);
    }

    public final void n(CharSequence charSequence) {
        this.f16401a.setClassName(charSequence);
    }

    public final void o(Object obj) {
        this.f16401a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f16416a);
    }

    public final void p(Object obj) {
        this.f16401a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f16417a);
    }

    public final void q(CharSequence charSequence) {
        this.f16401a.setContentDescription(charSequence);
    }

    public final void r(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16401a.setHeading(z10);
        } else {
            k(2, z10);
        }
    }

    public final void s(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f16401a.setHintText(charSequence);
        } else {
            this.f16401a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final void t(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16401a.setPaneTitle(charSequence);
        } else {
            this.f16401a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final String toString() {
        ?? r32;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        e(rect);
        sb.append("; boundsInParent: " + rect);
        this.f16401a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f16401a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f16401a.getClassName());
        sb.append("; text: ");
        sb.append(i());
        sb.append("; contentDescription: ");
        sb.append(g());
        sb.append("; viewId: ");
        sb.append(this.f16401a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f16401a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f16401a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f16401a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f16401a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f16401a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f16401a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f16401a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f16401a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f16401a.isPassword());
        sb.append("; scrollable: " + this.f16401a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f16401a.getActionList();
        if (actionList != null) {
            r32 = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                r32.add(new a(actionList.get(i10), 0, null, null, null));
            }
        } else {
            r32 = Collections.emptyList();
        }
        for (int i11 = 0; i11 < r32.size(); i11++) {
            a aVar = (a) r32.get(i11);
            String d5 = d(aVar.a());
            if (d5.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                d5 = aVar.b().toString();
            }
            sb.append(d5);
            if (i11 != r32.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16401a.setScreenReaderFocusable(z10);
        } else {
            k(1, z10);
        }
    }

    public final void v(boolean z10) {
        this.f16401a.setScrollable(z10);
    }

    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f16401a.setShowingHintText(z10);
        } else {
            k(4, z10);
        }
    }

    public final void x(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16401a.setStateDescription(charSequence);
        } else {
            this.f16401a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void y(CharSequence charSequence) {
        this.f16401a.setText(charSequence);
    }

    public final void z(View view) {
        this.f16401a.setTraversalAfter(view);
    }
}
