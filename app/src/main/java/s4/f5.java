package s4;

import android.net.Uri;
import r.a;

/* loaded from: classes.dex */
public final class f5 {

    /* renamed from: a */
    public static final a<String, Uri> f17862a = new a<>();

    public static synchronized Uri a() {
        Uri orDefault;
        synchronized (f5.class) {
            a<String, Uri> aVar = f17862a;
            orDefault = aVar.getOrDefault("com.google.android.gms.measurement", null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                orDefault = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aVar.put("com.google.android.gms.measurement", orDefault);
            }
        }
        return orDefault;
    }
}
