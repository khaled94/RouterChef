package g8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import s8.b;

/* loaded from: classes.dex */
public abstract class c extends RecyclerView.e<a> {

    /* renamed from: c */
    public ArrayList<b> f4900c;

    /* renamed from: d */
    public final LayoutInflater f4901d;

    /* renamed from: e */
    public int f4902e;

    /* renamed from: f */
    public Context f4903f;

    /* renamed from: g */
    public boolean f4904g;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {

        /* renamed from: t */
        public TextView f4905t;

        /* renamed from: u */
        public TextView f4906u;

        /* renamed from: v */
        public TextView f4907v;

        /* renamed from: w */
        public RatingBar f4908w;

        /* renamed from: x */
        public ImageView f4909x;
        public ConstraintLayout y;

        /* renamed from: z */
        public ConstraintLayout f4910z;

        public a(View view) {
            super(view);
            this.f4905t = (TextView) view.findViewById(R.id.infoTitle);
            this.f4906u = (TextView) view.findViewById(R.id.infoValue);
            this.f4907v = (TextView) view.findViewById(R.id.time);
            this.f4909x = (ImageView) view.findViewById(R.id.infoIcon);
            this.f4908w = (RatingBar) view.findViewById(R.id.ratingBar);
            this.y = (ConstraintLayout) view.findViewById(R.id.parentLayout);
            this.f4910z = (ConstraintLayout) view.findViewById(R.id.lineItemActionLayout);
        }
    }

    public c(Context context, ArrayList arrayList) {
        this.f4900c = arrayList;
        this.f4902e = R.layout.line_info_row;
        this.f4903f = context;
        this.f4904g = true;
        this.f4901d = LayoutInflater.from(context);
    }

    public c(Context context, ArrayList<b> arrayList, int i10) {
        this.f4904g = false;
        this.f4900c = arrayList;
        this.f4902e = R.layout.line_info_row;
        this.f4903f = context;
        this.f4901d = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f4900c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long b(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void e(a aVar, final int i10) {
        a aVar2 = aVar;
        String str = this.f4900c.get(i10).f18372t;
        String str2 = this.f4900c.get(i10).f18373u;
        String str3 = this.f4900c.get(i10).f18375w;
        float f10 = this.f4900c.get(i10).f18376x;
        int i11 = this.f4900c.get(i10).y;
        ConstraintLayout constraintLayout = (ConstraintLayout) aVar2.f4910z.getParent();
        constraintLayout.setBackground(this.f4904g ? null : constraintLayout.getBackground());
        aVar2.f4905t.setText(str);
        aVar2.f4906u.setText(str2);
        aVar2.f4907v.setText(str3);
        aVar2.f4908w.setRating(f10);
        aVar2.f4909x.setImageResource(i11);
        aVar2.f4910z.setVisibility(this.f4904g ? 8 : 0);
        aVar2.y.setOnClickListener(new View.OnClickListener() { // from class: g8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c cVar = c.this;
                cVar.h(cVar.f4903f, cVar.f4900c.get(i10));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final a f(ViewGroup viewGroup, int i10) {
        return new a(this.f4901d.inflate(this.f4902e, viewGroup, false));
    }

    public abstract void h(Context context, b bVar);
}
