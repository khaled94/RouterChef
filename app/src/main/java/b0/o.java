package b0;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class o extends r {

    /* renamed from: b */
    public Bitmap f2431b;

    /* renamed from: c */
    public IconCompat f2432c;

    /* renamed from: d */
    public boolean f2433d;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    @Override // b0.r
    public final void b(m mVar) {
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((s) mVar).f2456b).setBigContentTitle(null).bigPicture(this.f2431b);
        if (this.f2433d) {
            IconCompat iconCompat = this.f2432c;
            if (iconCompat == null) {
                a.a(bigPicture, null);
            } else {
                b.a(bigPicture, IconCompat.a.f(iconCompat, ((s) mVar).f2455a));
            }
        }
        if (i10 >= 31) {
            c.b(bigPicture, false);
            c.a(bigPicture, null);
        }
    }

    @Override // b0.r
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final o d() {
        this.f2432c = null;
        this.f2433d = true;
        return this;
    }
}
