package n0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    public final Object f16418a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final g f16419a;

        public a(g gVar) {
            this.f16419a = gVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            f a10 = this.f16419a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f16401a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            Objects.requireNonNull(this.f16419a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f16419a.c(i10, i11, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(g gVar) {
            super(gVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i10) {
            f b10 = this.f16419a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.f16401a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(g gVar) {
            super(gVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f16419a);
        }
    }

    public g() {
        this.f16418a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public g(Object obj) {
        this.f16418a = obj;
    }

    public f a(int i10) {
        return null;
    }

    public f b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }
}
