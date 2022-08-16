package g8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.raouf.routerchef.R;
import j8.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e extends RecyclerView.e<a> {

    /* renamed from: c */
    public ArrayList<c> f4913c;

    /* renamed from: d */
    public final LayoutInflater f4914d;

    /* renamed from: e */
    public int f4915e = R.layout.network_device_row;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {
        public ConstraintLayout A;
        public ConstraintLayout B;
        public ConstraintLayout C;
        public ConstraintLayout D;
        public ConstraintLayout E;
        public ConstraintLayout F;
        public ConstraintLayout G;
        public ConstraintLayout H;

        /* renamed from: t */
        public TextView f4916t;

        /* renamed from: u */
        public TextView f4917u;

        /* renamed from: v */
        public TextView f4918v;

        /* renamed from: w */
        public TextView f4919w;

        /* renamed from: x */
        public TextView f4920x;
        public ImageView y;

        /* renamed from: z */
        public ImageView f4921z;

        public a(View view) {
            super(view);
            this.A = (ConstraintLayout) view.findViewById(R.id.yourDeviceLabel);
            this.f4916t = (TextView) view.findViewById(R.id.customName);
            this.f4917u = (TextView) view.findViewById(R.id.hostname);
            this.f4920x = (TextView) view.findViewById(R.id.vendor);
            this.f4919w = (TextView) view.findViewById(R.id.mac);
            this.f4918v = (TextView) view.findViewById(R.id.ip);
            this.y = (ImageView) view.findViewById(R.id.deviceIcon);
            this.f4921z = (ImageView) view.findViewById(R.id.actionIcon);
            this.B = (ConstraintLayout) view.findViewById(R.id.customNameLayout);
            this.C = (ConstraintLayout) view.findViewById(R.id.hostnameLayout);
            this.D = (ConstraintLayout) view.findViewById(R.id.vendorLayout);
            this.E = (ConstraintLayout) view.findViewById(R.id.macLayout);
            this.F = (ConstraintLayout) view.findViewById(R.id.ipLayout);
            this.G = (ConstraintLayout) view.findViewById(R.id.actionIconLayout);
            this.H = (ConstraintLayout) view.findViewById(R.id.deviceTouchLayout);
        }
    }

    public e(Context context, ArrayList arrayList) {
        this.f4913c = arrayList;
        this.f4914d = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f4913c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long b(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void e(a aVar, final int i10) {
        a aVar2 = aVar;
        String str = this.f4913c.get(i10).f5504e;
        String str2 = this.f4913c.get(i10).f5503d;
        String str3 = this.f4913c.get(i10).f5502c;
        String str4 = this.f4913c.get(i10).f5500a;
        String str5 = this.f4913c.get(i10).f5501b;
        boolean z10 = this.f4913c.get(i10).f5507h;
        int i11 = this.f4913c.get(i10).f5505f;
        int i12 = this.f4913c.get(i10).f5506g;
        aVar2.f4916t.setText(str);
        aVar2.f4917u.setText(str2);
        aVar2.f4920x.setText(str3);
        aVar2.f4919w.setText(str5);
        aVar2.f4918v.setText(str4);
        int i13 = 0;
        aVar2.A.setVisibility(z10 ? 0 : 8);
        aVar2.y.setImageResource(i11);
        aVar2.f4921z.setImageResource(i12);
        aVar2.B.setVisibility(str != null ? 0 : 8);
        aVar2.F.setVisibility(str4 != null ? 0 : 8);
        aVar2.C.setVisibility(str2 != null ? 0 : 8);
        aVar2.E.setVisibility(this.f4913c.get(i10).f5508i ? 0 : 8);
        aVar2.D.setVisibility(this.f4913c.get(i10).f5508i ? 0 : 8);
        ConstraintLayout constraintLayout = aVar2.G;
        if (!this.f4913c.get(i10).f5508i) {
            i13 = 8;
        }
        constraintLayout.setVisibility(i13);
        aVar2.H.setBackground(this.f4913c.get(i10).f5508i ? aVar2.H.getBackground() : null);
        if (this.f4913c.get(i10).f5508i) {
            aVar2.H.setOnClickListener(new View.OnClickListener() { // from class: g8.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e eVar = e.this;
                    int i14 = i10;
                    eVar.h(eVar.f4913c.get(i14), i14);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final a f(ViewGroup viewGroup, int i10) {
        return new a(this.f4914d.inflate(this.f4915e, viewGroup, false));
    }

    public abstract void h(c cVar, int i10);

    @SuppressLint({"NotifyDataSetChanged"})
    public final void i(ArrayList<c> arrayList) {
        this.f4913c = arrayList;
        d();
    }

    public final void j(c cVar, int i10) {
        this.f4913c.set(i10, cVar);
        this.f1943a.c(i10, 1, null);
    }
}
