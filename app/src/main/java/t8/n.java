package t8;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: a */
    public final LruCache<String, a> f18782a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Bitmap f18783a;

        /* renamed from: b */
        public final int f18784b;

        public a(Bitmap bitmap, int i10) {
            this.f18783a = bitmap;
            this.f18784b = i10;
        }
    }

    public n(Context context) {
        StringBuilder sb = e0.f18755a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f18782a = new m((int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7));
    }
}
