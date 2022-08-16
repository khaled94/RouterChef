package t1;

import android.app.Notification;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final int f18465a;

    /* renamed from: b */
    public final int f18466b;

    /* renamed from: c */
    public final Notification f18467c;

    public d(int i10, Notification notification, int i11) {
        this.f18465a = i10;
        this.f18467c = notification;
        this.f18466b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f18465a != dVar.f18465a || this.f18466b != dVar.f18466b) {
            return false;
        }
        return this.f18467c.equals(dVar.f18467c);
    }

    public final int hashCode() {
        return this.f18467c.hashCode() + (((this.f18465a * 31) + this.f18466b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f18465a + ", mForegroundServiceType=" + this.f18466b + ", mNotification=" + this.f18467c + '}';
    }
}
