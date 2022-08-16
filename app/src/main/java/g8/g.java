package g8;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.raouf.routerchef.PingTest;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.Objects;
import s8.d;

/* loaded from: classes.dex */
public abstract class g extends RecyclerView.e<a> {

    /* renamed from: c */
    public ArrayList<d> f4923c;

    /* renamed from: d */
    public final LayoutInflater f4924d;

    /* renamed from: e */
    public int f4925e = R.layout.ping_test_row;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {

        /* renamed from: t */
        public TextView f4926t;

        /* renamed from: u */
        public TextView f4927u;

        /* renamed from: v */
        public TextView f4928v;

        /* renamed from: w */
        public TextView f4929w;

        /* renamed from: x */
        public ConstraintLayout f4930x;
        public ImageView y;

        public a(View view) {
            super(view);
            this.f4926t = (TextView) view.findViewById(R.id.server);
            this.f4927u = (TextView) view.findViewById(R.id.ping);
            this.f4928v = (TextView) view.findViewById(R.id.average);
            this.f4929w = (TextView) view.findViewById(R.id.timeouts);
            this.f4930x = (ConstraintLayout) view.findViewById(R.id.parentLayout);
            this.y = (ImageView) view.findViewById(R.id.serverIcon);
        }
    }

    public g(Context context, ArrayList arrayList) {
        this.f4923c = arrayList;
        this.f4924d = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f4923c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long b(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void e(a aVar, int i10) {
        int i11;
        ImageView imageView;
        a aVar2 = aVar;
        String str = this.f4923c.get(i10).f18386a;
        if (str.toLowerCase().contains("pubg")) {
            imageView = aVar2.y;
            i11 = R.drawable.ic_pubg;
        } else if (str.toLowerCase().contains("google")) {
            imageView = aVar2.y;
            i11 = R.drawable.ic_google;
        } else {
            imageView = aVar2.y;
            i11 = R.drawable.ic_server;
        }
        imageView.setImageResource(i11);
        aVar2.f4926t.setText(str);
        String str2 = "--";
        aVar2.f4927u.setText(this.f4923c.get(i10).f18387b == -1 ? str2 : String.valueOf(this.f4923c.get(i10).f18387b));
        TextView textView = aVar2.f4928v;
        if (this.f4923c.get(i10).f18388c != -1) {
            str2 = String.valueOf(this.f4923c.get(i10).f18388c);
        }
        textView.setText(str2);
        aVar2.f4929w.setText(String.valueOf(this.f4923c.get(i10).f18389d));
        aVar2.f4930x.setOnClickListener(new View.OnClickListener() { // from class: g8.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g gVar = g.this;
                Objects.requireNonNull(gVar);
                final String charSequence = ((TextView) view.findViewById(R.id.server)).getText().toString();
                final PingTest pingTest = PingTest.this;
                pingTest.Q.setContentView(R.layout.remove_server_dialog);
                pingTest.Q.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                ((TextView) pingTest.Q.findViewById(R.id.removingPingServerNote)).setText(pingTest.getString(R.string.confirmRemoveServerNote, charSequence));
                pingTest.Q.findViewById(R.id.closeImgView).setOnClickListener(new View.OnClickListener() { // from class: f8.u1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PingTest.this.Q.dismiss();
                    }
                });
                pingTest.Q.findViewById(R.id.removeServerBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.x1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PingTest pingTest2 = PingTest.this;
                        int indexOf = pingTest2.U.indexOf(charSequence);
                        pingTest2.U.remove(indexOf);
                        pingTest2.Q(pingTest2.U);
                        pingTest2.N.f1943a.e(indexOf, 1);
                        pingTest2.R();
                        pingTest2.Q.dismiss();
                    }
                });
                pingTest.Q.findViewById(R.id.cancelRemovalBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.v1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PingTest.this.Q.dismiss();
                    }
                });
                pingTest.Q.show();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final a f(ViewGroup viewGroup, int i10) {
        return new a(this.f4924d.inflate(this.f4925e, viewGroup, false));
    }
}
