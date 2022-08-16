package h8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import c0.a;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.R;
import f3.e;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public AdView f5139a;

    /* renamed from: b */
    public a f5140b;

    /* renamed from: c */
    public float f5141c;

    /* renamed from: d */
    public int f5142d;

    /* renamed from: e */
    public int f5143e;

    /* renamed from: f */
    public String[] f5144f;

    /* renamed from: g */
    public int[] f5145g;

    /* renamed from: h */
    public int f5146h;

    /* JADX WARN: Type inference failed for: r10v5, types: [h8.a] */
    public b(final Context context, AdView adView) {
        String[] strArr = {"https://www.facebook.com/groups/routerchef/", "http://www.facebook.com/M.AbdulRaoufff", "https://www.youtube.com/channel/UCqKr3T8ogEYLjMxc16sNbqA"};
        int[] iArr = {R.drawable.small_group_ad, R.drawable.small_page_ad, R.drawable.small_youtube_ad};
        String[] strArr2 = {"https://www.facebook.com/groups/routerchef/", "http://www.facebook.com/M.AbdulRaoufff", "https://www.youtube.com/channel/UCqKr3T8ogEYLjMxc16sNbqA"};
        int[] iArr2 = {R.drawable.medium_group_ad, R.drawable.medium_page_ad, R.drawable.medium_youtube_ad};
        String[] strArr3 = {"https://www.facebook.com/groups/routerchef/", "http://www.facebook.com/M.AbdulRaoufff", "https://www.youtube.com/channel/UCqKr3T8ogEYLjMxc16sNbqA"};
        int[] iArr3 = {R.drawable.large_group_ad, R.drawable.large_page_ad, R.drawable.large_youtube_ad};
        this.f5139a = adView;
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f5141c = f10;
        e adSize = adView.getAdSize();
        Objects.requireNonNull(adSize);
        this.f5142d = (int) (adSize.f4501a * f10);
        float f11 = this.f5141c;
        e adSize2 = adView.getAdSize();
        Objects.requireNonNull(adSize2);
        this.f5143e = (int) (adSize2.f4502b * f11);
        e adSize3 = adView.getAdSize();
        Objects.requireNonNull(adSize3);
        int i10 = adSize3.f4502b;
        if (i10 == 50) {
            this.f5145g = iArr;
            this.f5144f = strArr;
        } else if (i10 == 100) {
            this.f5145g = iArr2;
            this.f5144f = strArr2;
        } else if (i10 == 250) {
            this.f5145g = iArr3;
            this.f5144f = strArr3;
        }
        this.f5146h = new Random().nextInt(this.f5145g.length);
        this.f5140b = new View.OnClickListener() { // from class: h8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                Context context2 = context;
                Objects.requireNonNull(bVar);
                context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bVar.f5144f[bVar.f5146h])));
            }
        };
    }

    public final void a() {
        this.f5139a.setBackground(null);
        this.f5139a.getLayoutParams().width = -2;
        this.f5139a.getLayoutParams().height = -2;
    }

    public final void b(Context context) {
        AdView adView = this.f5139a;
        int i10 = this.f5145g[this.f5146h];
        Object obj = a.f2602a;
        adView.setBackground(a.b.b(context, i10));
        this.f5139a.getLayoutParams().width = this.f5142d;
        this.f5139a.getLayoutParams().height = this.f5143e;
        this.f5139a.setOnClickListener(this.f5140b);
    }
}
