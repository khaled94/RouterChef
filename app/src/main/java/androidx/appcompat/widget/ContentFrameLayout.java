package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import e.h;
import e.j;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: s */
    public TypedValue f653s;

    /* renamed from: t */
    public TypedValue f654t;

    /* renamed from: u */
    public TypedValue f655u;

    /* renamed from: v */
    public TypedValue f656v;

    /* renamed from: w */
    public TypedValue f657w;

    /* renamed from: x */
    public TypedValue f658x;
    public final Rect y = new Rect();

    /* renamed from: z */
    public a f659z;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f657w == null) {
            this.f657w = new TypedValue();
        }
        return this.f657w;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f658x == null) {
            this.f658x = new TypedValue();
        }
        return this.f658x;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f655u == null) {
            this.f655u = new TypedValue();
        }
        return this.f655u;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f656v == null) {
            this.f656v = new TypedValue();
        }
        return this.f656v;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f653s == null) {
            this.f653s = new TypedValue();
        }
        return this.f653s;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f654t == null) {
            this.f654t = new TypedValue();
        }
        return this.f654t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f659z;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f659z;
        if (aVar != null) {
            h hVar = ((j) aVar).f4239a;
            k0 k0Var = hVar.C;
            if (k0Var != null) {
                k0Var.l();
            }
            if (hVar.H != null) {
                hVar.f4206w.getDecorView().removeCallbacks(hVar.I);
                if (hVar.H.isShowing()) {
                    try {
                        hVar.H.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                hVar.H = null;
            }
            hVar.G();
            e eVar = hVar.L(0).f4229h;
            if (eVar == null) {
                return;
            }
            eVar.d(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f659z = aVar;
    }
}
