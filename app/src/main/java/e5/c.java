package e5;

import android.util.Property;
import android.view.ViewGroup;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public final class c extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f4414a = new c();

    public c() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f10) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f10.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup2.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
