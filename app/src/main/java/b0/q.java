package b0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    public Context f2435a;

    /* renamed from: e */
    public CharSequence f2439e;

    /* renamed from: f */
    public CharSequence f2440f;

    /* renamed from: g */
    public PendingIntent f2441g;

    /* renamed from: h */
    public Bitmap f2442h;

    /* renamed from: i */
    public int f2443i;

    /* renamed from: l */
    public r f2446l;

    /* renamed from: n */
    public Bundle f2448n;

    /* renamed from: q */
    public String f2450q;

    /* renamed from: s */
    public Notification f2452s;

    /* renamed from: b */
    public ArrayList<n> f2436b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<x> f2437c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<n> f2438d = new ArrayList<>();

    /* renamed from: k */
    public boolean f2445k = true;

    /* renamed from: m */
    public boolean f2447m = false;

    /* renamed from: o */
    public int f2449o = 0;
    public int p = 0;

    /* renamed from: j */
    public int f2444j = 0;
    @Deprecated

    /* renamed from: t */
    public ArrayList<String> f2453t = new ArrayList<>();

    /* renamed from: r */
    public boolean f2451r = true;

    public q(Context context, String str) {
        Notification notification = new Notification();
        this.f2452s = notification;
        this.f2435a = context;
        this.f2450q = str;
        notification.when = System.currentTimeMillis();
        this.f2452s.audioStreamType = -1;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        s sVar = new s(this);
        r rVar = sVar.f2457c.f2446l;
        if (rVar != null) {
            rVar.b(sVar);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && i10 < 24) {
            sVar.f2456b.setExtras(sVar.f2459e);
        }
        Notification build = sVar.f2456b.build();
        Objects.requireNonNull(sVar.f2457c);
        if (rVar != null) {
            Objects.requireNonNull(sVar.f2457c.f2446l);
        }
        if (rVar != null && (bundle = build.extras) != null) {
            rVar.a(bundle);
        }
        return build;
    }

    public final q c(boolean z10) {
        Notification notification;
        int i10;
        if (z10) {
            notification = this.f2452s;
            i10 = notification.flags | 16;
        } else {
            notification = this.f2452s;
            i10 = notification.flags & (-17);
        }
        notification.flags = i10;
        return this;
    }

    public final q d(CharSequence charSequence) {
        this.f2440f = b(charSequence);
        return this;
    }

    public final q e(CharSequence charSequence) {
        this.f2439e = b(charSequence);
        return this;
    }

    public final q f(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f2435a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        this.f2442h = bitmap;
        return this;
    }

    public final q g(r rVar) {
        if (this.f2446l != rVar) {
            this.f2446l = rVar;
            if (rVar.f2454a != this) {
                rVar.f2454a = this;
                g(rVar);
            }
        }
        return this;
    }
}
