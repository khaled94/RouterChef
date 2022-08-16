package m0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.raouf.routerchef.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.z;
import n0.f;
import n0.g;
import n0.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f5846c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f5847a;

    /* renamed from: b */
    public final C0093a f5848b;

    /* renamed from: m0.a$a */
    /* loaded from: classes.dex */
    public static final class C0093a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final a f5849a;

        public C0093a(a aVar) {
            this.f5849a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5849a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            g b10 = this.f5849a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f16418a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5849a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            Object obj2;
            int i10;
            f fVar = new f(accessibilityNodeInfo);
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            int i11 = Build.VERSION.SDK_INT;
            boolean z10 = true;
            Object obj3 = null;
            if (i11 >= 28) {
                obj = Boolean.valueOf(z.l.d(view));
            } else {
                obj = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(obj)) {
                    obj = null;
                }
            }
            Boolean bool = (Boolean) obj;
            fVar.u(bool != null && bool.booleanValue());
            if (i11 >= 28) {
                obj2 = Boolean.valueOf(z.l.c(view));
            } else {
                Object tag = view.getTag(R.id.tag_accessibility_heading);
                obj2 = Boolean.class.isInstance(tag) ? tag : null;
            }
            Boolean bool2 = (Boolean) obj2;
            fVar.r(bool2 != null && bool2.booleanValue());
            fVar.t(z.g(view));
            if (i11 < 30) {
                z10 = false;
            }
            if (z10) {
                obj3 = z.n.a(view);
            } else {
                Object tag2 = view.getTag(R.id.tag_state_description);
                if (CharSequence.class.isInstance(tag2)) {
                    obj3 = tag2;
                }
            }
            fVar.x((CharSequence) obj3);
            this.f5849a.d(view, fVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i11 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        if (((WeakReference) sparseArray.valueAt(i12)).get() == null) {
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        sparseArray.remove(((Integer) arrayList.get(i13)).intValue());
                    }
                }
                ClickableSpan[] f10 = f.f(text);
                if (f10 != null && f10.length > 0) {
                    fVar.h().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i14 = 0; i14 < f10.length; i14++) {
                        ClickableSpan clickableSpan = f10[i14];
                        int i15 = 0;
                        while (true) {
                            if (i15 >= sparseArray2.size()) {
                                i10 = f.f16400d;
                                f.f16400d = i10 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i15)).get())) {
                                i10 = sparseArray2.keyAt(i15);
                                break;
                            } else {
                                i15++;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(f10[i14]));
                        ClickableSpan clickableSpan2 = f10[i14];
                        Spanned spanned = (Spanned) text;
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i16 = 0; i16 < list.size(); i16++) {
                fVar.b((f.a) list.get(i16));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5849a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5849a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f5849a.g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i10) {
            this.f5849a.h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5849a.i(view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this.f5847a = f5846c;
        this.f5848b = new C0093a(this);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5847a = accessibilityDelegate;
        this.f5848b = new C0093a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5847a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public g b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f5847a, view);
        if (a10 != null) {
            return new g(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5847a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, f fVar) {
        this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f5847a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5847a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            f.a aVar = (f.a) list.get(i11);
            if (aVar.a() != i10) {
                i11++;
            } else if (aVar.f16415d != null) {
                Class<? extends j.a> cls = aVar.f16414c;
                if (cls != null) {
                    try {
                        Objects.requireNonNull(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Class<? extends j.a> cls2 = aVar.f16414c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                    }
                }
                z10 = aVar.f16415d.a(view);
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f5847a, view, i10, bundle);
        }
        if (z10 || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z10;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                ClickableSpan[] f10 = f.f(view.createAccessibilityNodeInfo().getText());
                for (int i13 = 0; f10 != null && i13 < f10.length; i13++) {
                    if (clickableSpan.equals(f10[i13])) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            if (z11) {
                clickableSpan.onClick(view);
                z12 = true;
            }
        }
        return z12;
    }

    public void h(View view, int i10) {
        this.f5847a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f5847a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
