package g8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.SkuDetails;
import com.raouf.routerchef.R;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class k extends RecyclerView.e<a> {

    /* renamed from: c */
    public List<SkuDetails> f4942c;

    /* renamed from: d */
    public final LayoutInflater f4943d;

    /* renamed from: e */
    public int f4944e = R.layout.sub_plan_row;

    /* renamed from: f */
    public Context f4945f;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {

        /* renamed from: t */
        public TextView f4946t;

        /* renamed from: u */
        public TextView f4947u;

        /* renamed from: v */
        public ConstraintLayout f4948v;

        public a(View view) {
            super(view);
            this.f4946t = (TextView) view.findViewById(R.id.subPlanTitle);
            this.f4947u = (TextView) view.findViewById(R.id.planPrice);
            this.f4948v = (ConstraintLayout) view.findViewById(R.id.parentLayout);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        }
    }

    public k(Context context, List list) {
        this.f4942c = list;
        this.f4945f = context;
        this.f4943d = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f4942c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long b(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void e(a aVar, final int i10) {
        int i11;
        Context context;
        TextView textView;
        a aVar2 = aVar;
        String a10 = this.f4942c.get(i10).a();
        Objects.requireNonNull(a10);
        char c10 = 65535;
        switch (a10.hashCode()) {
            case -1609397361:
                if (a10.equals("per_3month")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1523509908:
                if (a10.equals("per_6month")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1016252376:
                if (a10.equals("sub_one_month")) {
                    c10 = 2;
                    break;
                }
                break;
            case 424983071:
                if (a10.equals("per_year")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                textView = aVar2.f4946t;
                context = this.f4945f;
                i11 = R.string.per3Month;
                break;
            case 1:
                textView = aVar2.f4946t;
                context = this.f4945f;
                i11 = R.string.per6Month;
                break;
            case 2:
                textView = aVar2.f4946t;
                context = this.f4945f;
                i11 = R.string.perMonth;
                break;
            case 3:
                textView = aVar2.f4946t;
                context = this.f4945f;
                i11 = R.string.perYear;
                break;
            default:
                aVar2.f4947u.setText(this.f4942c.get(i10).f2899b.optString("price"));
                aVar2.f4948v.setOnClickListener(new View.OnClickListener() { // from class: g8.j
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onClick(android.view.View r33) {
                        /*
                            Method dump skipped, instructions count: 1352
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: g8.j.onClick(android.view.View):void");
                    }
                });
        }
        textView.setText(context.getString(i11));
        aVar2.f4947u.setText(this.f4942c.get(i10).f2899b.optString("price"));
        aVar2.f4948v.setOnClickListener(new View.OnClickListener() { // from class: g8.j
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r33) {
                /*
                    Method dump skipped, instructions count: 1352
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: g8.j.onClick(android.view.View):void");
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final a f(ViewGroup viewGroup, int i10) {
        return new a(this.f4943d.inflate(this.f4944e, viewGroup, false));
    }
}
