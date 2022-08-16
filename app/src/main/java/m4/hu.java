package m4;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import k4.b;
import l3.s;
import n3.g1;
import n3.x1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class hu extends RelativeLayout {

    /* renamed from: t */
    public static final float[] f9449t = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: s */
    public AnimationDrawable f9450s;

    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List<m4.ju>, java.util.List, java.util.ArrayList] */
    public hu(Context context, gu guVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Objects.requireNonNull(guVar, "null reference");
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f9449t, null, null));
        shapeDrawable.getPaint().setColor(guVar.f9042v);
        setLayoutParams(layoutParams);
        x1 x1Var = s.B.f5791e;
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(guVar.f9039s)) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(guVar.f9039s);
            textView.setTextColor(guVar.f9043w);
            textView.setTextSize(guVar.f9044x);
            g90 g90Var = io.f9708f.f9709a;
            textView.setPadding(g90.j(context, 4), 0, g90.j(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        ?? r62 = guVar.f9040t;
        if (r62 != 0 && r62.size() > 1) {
            this.f9450s = new AnimationDrawable();
            Iterator it = r62.iterator();
            while (it.hasNext()) {
                try {
                    this.f9450s.addFrame((Drawable) b.e0(((ju) it.next()).d()), guVar.y);
                } catch (Exception e10) {
                    g1.h("Error while getting drawable.", e10);
                }
            }
            x1 x1Var2 = s.B.f5791e;
            imageView.setBackground(this.f9450s);
        } else if (r62.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) b.e0(((ju) r62.get(0)).d()));
            } catch (Exception e11) {
                g1.h("Error while getting drawable.", e11);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f9450s;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
