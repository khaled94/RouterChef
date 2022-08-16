package b0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final Bundle f2419a;

    /* renamed from: b */
    public IconCompat f2420b;

    /* renamed from: c */
    public final z[] f2421c;

    /* renamed from: d */
    public final z[] f2422d;

    /* renamed from: e */
    public boolean f2423e;

    /* renamed from: f */
    public boolean f2424f;

    /* renamed from: g */
    public final int f2425g;

    /* renamed from: h */
    public final boolean f2426h;
    @Deprecated

    /* renamed from: i */
    public int f2427i;

    /* renamed from: j */
    public CharSequence f2428j;

    /* renamed from: k */
    public PendingIntent f2429k;

    /* renamed from: l */
    public boolean f2430l;

    public n(CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat b10 = IconCompat.b("", 2131230828);
        Bundle bundle = new Bundle();
        this.f2424f = true;
        this.f2420b = b10;
        int i10 = b10.f1267a;
        if ((i10 == -1 ? IconCompat.a.c(b10.f1268b) : i10) == 2) {
            this.f2427i = b10.c();
        }
        this.f2428j = q.b(charSequence);
        this.f2429k = pendingIntent;
        this.f2419a = bundle;
        this.f2421c = null;
        this.f2422d = null;
        this.f2423e = true;
        this.f2425g = 0;
        this.f2424f = true;
        this.f2426h = false;
        this.f2430l = false;
    }

    public final IconCompat a() {
        int i10;
        if (this.f2420b == null && (i10 = this.f2427i) != 0) {
            this.f2420b = IconCompat.b("", i10);
        }
        return this.f2420b;
    }
}
