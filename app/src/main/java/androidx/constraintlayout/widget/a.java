package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import l0.g;
import x.d;

/* loaded from: classes.dex */
public abstract class a extends View {

    /* renamed from: s */
    public int[] f1121s;

    /* renamed from: t */
    public int f1122t;

    /* renamed from: u */
    public Context f1123u;

    /* renamed from: v */
    public u.a f1124v;

    /* renamed from: w */
    public String f1125w;

    /* renamed from: x */
    public String f1126x;
    public View[] y;

    /* renamed from: z */
    public HashMap<Integer, String> f1127z;

    public a(Context context) {
        super(context);
        this.f1121s = new int[32];
        this.y = null;
        this.f1127z = new HashMap<>();
        this.f1123u = context;
        i(null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1121s = new int[32];
        this.y = null;
        this.f1127z = new HashMap<>();
        this.f1123u = context;
        i(attributeSet);
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f1123u == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout2 != null) {
            Object c10 = constraintLayout2.c(trim);
            if (c10 instanceof Integer) {
                i10 = ((Integer) c10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout2 != null) {
            i10 = h(constraintLayout2, trim);
        }
        if (i10 == 0) {
            try {
                i10 = d.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i10 == 0) {
            i10 = this.f1123u.getResources().getIdentifier(trim, "id", this.f1123u.getPackageName());
        }
        if (i10 != 0) {
            this.f1127z.put(Integer.valueOf(i10), trim);
            d(i10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void d(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f1122t + 1;
        int[] iArr = this.f1121s;
        if (i11 > iArr.length) {
            this.f1121s = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1121s;
        int i12 = this.f1122t;
        iArr2[i12] = i10;
        this.f1122t = i12 + 1;
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f1123u == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = null;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    StringBuilder c10 = androidx.activity.result.a.c("to use ConstraintTag view ");
                    c10.append(childAt.getClass().getSimpleName());
                    c10.append(" must have an ID");
                    Log.w("ConstraintHelper", c10.toString());
                } else {
                    d(childAt.getId());
                }
            }
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1122t; i10++) {
            View d5 = constraintLayout.d(this.f1121s[i10]);
            if (d5 != null) {
                d5.setVisibility(visibility);
                if (elevation > 0.0f) {
                    d5.setTranslationZ(d5.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1121s, this.f1122t);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1123u.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f5715t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1125w = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1126x = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(u.d dVar, boolean z10) {
    }

    public final void k() {
        if (this.f1124v == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.a)) {
            return;
        }
        ((ConstraintLayout.a) layoutParams).f1102q0 = this.f1124v;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1125w;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1126x;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1125w = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1122t = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1126x = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1122t = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                e(str.substring(i10));
                return;
            } else {
                e(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1125w = null;
        this.f1122t = 0;
        for (int i10 : iArr) {
            d(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1125w == null) {
            d(i10);
        }
    }
}
