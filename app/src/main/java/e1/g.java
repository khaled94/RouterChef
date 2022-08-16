package e1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public final class g extends RecyclerView.a0 {

    /* renamed from: t */
    public final Drawable f4352t;

    /* renamed from: u */
    public ColorStateList f4353u;

    /* renamed from: v */
    public final SparseArray<View> f4354v;

    /* renamed from: w */
    public boolean f4355w;

    /* renamed from: x */
    public boolean f4356x;

    public g(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f4354v = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f4352t = view.getBackground();
        if (textView != null) {
            this.f4353u = textView.getTextColors();
        }
    }

    public final View x(int i10) {
        View view = this.f4354v.get(i10);
        if (view != null) {
            return view;
        }
        View findViewById = this.f1924a.findViewById(i10);
        if (findViewById != null) {
            this.f4354v.put(i10, findViewById);
        }
        return findViewById;
    }
}
