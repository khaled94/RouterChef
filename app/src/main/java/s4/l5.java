package s4;

import android.net.Uri;

/* loaded from: classes.dex */
public final class l5 {

    /* renamed from: a */
    public final Uri f17964a;

    /* renamed from: b */
    public final boolean f17965b;

    public l5(Uri uri, boolean z10) {
        this.f17964a = uri;
        this.f17965b = z10;
    }

    public final n5<Long> a(String str, long j3) {
        return new h5(this, str, Long.valueOf(j3));
    }

    public final n5<String> b(String str, String str2) {
        return new k5(this, str, str2);
    }

    public final n5<Boolean> c(String str, boolean z10) {
        return new i5(this, str, Boolean.valueOf(z10));
    }
}
