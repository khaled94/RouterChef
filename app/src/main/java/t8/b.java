package t8;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import ca.o;
import t8.t;
import t8.y;

/* loaded from: classes.dex */
public final class b extends y {

    /* renamed from: a */
    public final Context f18726a;

    /* renamed from: b */
    public final Object f18727b = new Object();

    /* renamed from: c */
    public AssetManager f18728c;

    public b(Context context) {
        this.f18726a = context;
    }

    @Override // t8.y
    public final boolean c(w wVar) {
        Uri uri = wVar.f18833c;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // t8.y
    public final y.a f(w wVar, int i10) {
        if (this.f18728c == null) {
            synchronized (this.f18727b) {
                if (this.f18728c == null) {
                    this.f18728c = this.f18726a.getAssets();
                }
            }
        }
        return new y.a(o.f(this.f18728c.open(wVar.f18833c.toString().substring(22))), t.d.DISK);
    }
}
