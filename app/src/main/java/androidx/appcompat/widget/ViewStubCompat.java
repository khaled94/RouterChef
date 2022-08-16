package androidx.appcompat.widget;

import a6.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: s */
    public int f758s;

    /* renamed from: t */
    public int f759t;

    /* renamed from: u */
    public WeakReference<View> f760u;

    /* renamed from: v */
    public LayoutInflater f761v;

    /* renamed from: w */
    public a f762w;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f758s = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.T, 0, 0);
        this.f759t = obtainStyledAttributes.getResourceId(2, -1);
        this.f758s = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f758s == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f761v;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f758s, viewGroup, false);
            int i10 = this.f759t;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f760u = new WeakReference<>(inflate);
            a aVar = this.f762w;
            if (aVar != null) {
                aVar.a();
            }
            return inflate;
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f759t;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f761v;
    }

    public int getLayoutResource() {
        return this.f758s;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f759t = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f761v = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f758s = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f762w = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f760u;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 != 0 && i10 != 4) {
            return;
        }
        a();
    }
}
