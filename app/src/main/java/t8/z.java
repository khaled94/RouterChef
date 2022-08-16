package t8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.activity.result.a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import t8.t;
import t8.y;

/* loaded from: classes.dex */
public final class z extends y {

    /* renamed from: a */
    public final Context f18861a;

    public z(Context context) {
        this.f18861a = context;
    }

    @Override // t8.y
    public final boolean c(w wVar) {
        if (wVar.f18834d != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f18833c.getScheme());
    }

    @Override // t8.y
    public final y.a f(w wVar, int i10) {
        Resources resources;
        Uri uri;
        Uri uri2;
        Context context = this.f18861a;
        StringBuilder sb = e0.f18755a;
        if (wVar.f18834d != 0 || (uri2 = wVar.f18833c) == null) {
            resources = context.getResources();
        } else {
            String authority = uri2.getAuthority();
            if (authority != null) {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    StringBuilder c10 = a.c("Unable to obtain resources for package: ");
                    c10.append(wVar.f18833c);
                    throw new FileNotFoundException(c10.toString());
                }
            } else {
                StringBuilder c11 = a.c("No package provided: ");
                c11.append(wVar.f18833c);
                throw new FileNotFoundException(c11.toString());
            }
        }
        int i11 = wVar.f18834d;
        boolean z10 = true;
        if (i11 == 0 && (uri = wVar.f18833c) != null) {
            String authority2 = uri.getAuthority();
            if (authority2 == null) {
                StringBuilder c12 = a.c("No package provided: ");
                c12.append(wVar.f18833c);
                throw new FileNotFoundException(c12.toString());
            }
            List<String> pathSegments = wVar.f18833c.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder c13 = a.c("No path segments: ");
                c13.append(wVar.f18833c);
                throw new FileNotFoundException(c13.toString());
            } else if (pathSegments.size() == 1) {
                try {
                    i11 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused2) {
                    StringBuilder c14 = a.c("Last path segment is not a resource ID: ");
                    c14.append(wVar.f18833c);
                    throw new FileNotFoundException(c14.toString());
                }
            } else if (pathSegments.size() != 2) {
                StringBuilder c15 = a.c("More than two path segments: ");
                c15.append(wVar.f18833c);
                throw new FileNotFoundException(c15.toString());
            } else {
                i11 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            }
        }
        BitmapFactory.Options d5 = y.d(wVar);
        if (d5 == null || !d5.inJustDecodeBounds) {
            z10 = false;
        }
        if (z10) {
            BitmapFactory.decodeResource(resources, i11, d5);
            y.b(wVar.f18836f, wVar.f18837g, d5, wVar);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i11, d5);
        t.d dVar = t.d.DISK;
        Objects.requireNonNull(decodeResource, "bitmap == null");
        return new y.a(decodeResource, null, dVar, 0);
    }
}
