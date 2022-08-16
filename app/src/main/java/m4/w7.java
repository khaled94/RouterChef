package m4;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w7 {

    /* renamed from: c */
    public static final String[] f14873c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    public final String[] f14874a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: b */
    public final s7 f14875b;

    @Deprecated
    public w7(s7 s7Var) {
        this.f14875b = s7Var;
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return d(uri, this.f14875b.g(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new x7("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final void b(MotionEvent motionEvent) {
        this.f14875b.a(motionEvent);
    }

    public final boolean c(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f14874a;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final Uri d(Uri uri, String str) {
        String encodedPath;
        String str2;
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals("ad.doubleclick.net")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new x7("Parameter already exists: dc_ms");
                    }
                    String uri2 = uri.toString();
                    int indexOf = uri2.indexOf(";adurl");
                    if (indexOf != -1) {
                        int i10 = indexOf + 1;
                        str2 = uri2.substring(0, i10) + "dc_ms=" + str + ";" + uri2.substring(i10);
                    } else {
                        int indexOf2 = uri2.indexOf(uri.getEncodedPath());
                        str2 = uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length());
                    }
                    return Uri.parse(str2);
                }
            } catch (UnsupportedOperationException unused) {
                throw new x7("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i11 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i11) + "ms=" + str + "&" + uri3.substring(i11));
        }
        throw new x7("Query parameter already exists: ms");
    }
}
