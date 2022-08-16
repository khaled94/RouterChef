package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.q;
import com.raouf.routerchef.R;
import m0.z;
import u5.c;

/* loaded from: classes.dex */
public class CheckableImageButton extends q implements Checkable {
    public static final int[] y = {16842912};

    /* renamed from: v */
    public boolean f3302v;

    /* renamed from: w */
    public boolean f3303w = true;

    /* renamed from: x */
    public boolean f3304x = true;

    /* loaded from: classes.dex */
    public static class a extends s0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0046a();

        /* renamed from: u */
        public boolean f3305u;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        /* loaded from: classes.dex */
        public class C0046a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3305u = parcel.readInt() != 1 ? false : true;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            parcel.writeInt(this.f3305u ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        z.p(this, new c(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3302v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f3302v) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), y);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f17592s);
        setChecked(aVar.f3305u);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3305u = this.f3302v;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f3303w != z10) {
            this.f3303w = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f3303w || this.f3302v == z10) {
            return;
        }
        this.f3302v = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f3304x = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f3304x) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3302v);
    }
}
