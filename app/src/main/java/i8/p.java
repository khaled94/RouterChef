package i8;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.raouf.routerchef.App;
import com.raouf.routerchef.R;
import com.raouf.routerchef.StorePurchase;
import f3.d;
import g1.r;
import h8.b;
import h8.h;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public final FrameLayout f5300a;

    /* renamed from: b */
    public final TextView f5301b;

    /* renamed from: c */
    public final Activity f5302c;

    /* renamed from: d */
    public final LinearLayout f5303d;

    /* renamed from: e */
    public final ConstraintLayout f5304e;

    /* renamed from: f */
    public final CardView f5305f;

    public p(Activity activity) {
        this.f5302c = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.progress, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.progressBarHolder);
        this.f5300a = frameLayout;
        this.f5301b = (TextView) inflate.findViewById(R.id.progressLabel);
        this.f5303d = (LinearLayout) inflate.findViewById(R.id.adContainer);
        this.f5304e = (ConstraintLayout) inflate.findViewById(R.id.parentAdContainer);
        CardView cardView = (CardView) inflate.findViewById(R.id.subCardView);
        this.f5305f = cardView;
        cardView.setOnClickListener(new View.OnClickListener() { // from class: i8.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p pVar = p.this;
                pVar.f5302c.startActivity(new Intent(pVar.f5302c, StorePurchase.class));
            }
        });
        frameLayout.setVisibility(8);
        frameLayout.setOnClickListener(o.f5299s);
        a();
        ((ViewGroup) activity.getWindow().getDecorView().getRootView()).addView(inflate);
    }

    public final void a() {
        App app = (App) this.f5302c.getApplication();
        if (!app.f3512u) {
            this.f5305f.setVisibility(0);
            this.f5304e.setVisibility(0);
            h hVar = app.f3510s;
            LinearLayout linearLayout = this.f5303d;
            if (hVar.f5158a.getParent() != null) {
                ((LinearLayout) hVar.f5158a.getParent()).removeView(hVar.f5158a);
            }
            linearLayout.addView(hVar.f5158a);
            if (hVar.f5161d) {
                return;
            }
            b bVar = new b(linearLayout.getContext(), hVar.f5158a);
            hVar.f5160c = bVar;
            bVar.b(linearLayout.getContext());
            hVar.f5158a.a(new d(new d.a()));
            return;
        }
        this.f5304e.setVisibility(8);
        this.f5305f.setVisibility(8);
    }

    public final void b() {
        c(this.f5301b.getContext().getString(R.string.loading));
        this.f5300a.setVisibility(8);
    }

    public final void c(String str) {
        ((g) this.f5300a.getContext()).O.post(new r(this, str, 2));
    }

    public final void d() {
        a();
        if (this.f5300a.getVisibility() == 8) {
            c(this.f5301b.getContext().getString(R.string.loading));
            this.f5300a.setVisibility(0);
            this.f5300a.bringToFront();
        }
    }
}
