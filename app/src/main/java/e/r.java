package e;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d */
    public static r f4272d;

    /* renamed from: a */
    public final Context f4273a;

    /* renamed from: b */
    public final LocationManager f4274b;

    /* renamed from: c */
    public final a f4275c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public boolean f4276a;

        /* renamed from: b */
        public long f4277b;
    }

    public r(Context context, LocationManager locationManager) {
        this.f4273a = context;
        this.f4274b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (!this.f4274b.isProviderEnabled(str)) {
                return null;
            }
            return this.f4274b.getLastKnownLocation(str);
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }
}
