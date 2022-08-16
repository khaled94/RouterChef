package t8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.util.Objects;
import t8.t;

/* loaded from: classes.dex */
public abstract class y {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final t.d f18857a;

        /* renamed from: b */
        public final Bitmap f18858b;

        /* renamed from: c */
        public final ca.y f18859c;

        /* renamed from: d */
        public final int f18860d;

        public a(Bitmap bitmap, ca.y yVar, t.d dVar, int i10) {
            if ((bitmap != null) != (yVar == null ? false : true)) {
                this.f18858b = bitmap;
                this.f18859c = yVar;
                StringBuilder sb = e0.f18755a;
                this.f18857a = dVar;
                this.f18860d = i10;
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(ca.y yVar, t.d dVar) {
            this(null, yVar, dVar, 0);
            StringBuilder sb = e0.f18755a;
            Objects.requireNonNull(yVar, "source == null");
        }
    }

    public static void a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, w wVar) {
        int i14;
        double d5;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                d5 = i12 / i10;
            } else if (i10 == 0) {
                d5 = i13 / i11;
            } else {
                int floor = (int) Math.floor(i13 / i11);
                int floor2 = (int) Math.floor(i12 / i10);
                i14 = wVar.f18840j ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i14 = (int) Math.floor(d5);
        } else {
            i14 = 1;
        }
        options.inSampleSize = i14;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i10, int i11, BitmapFactory.Options options, w wVar) {
        a(i10, i11, options.outWidth, options.outHeight, options, wVar);
    }

    public static BitmapFactory.Options d(w wVar) {
        boolean a10 = wVar.a();
        boolean z10 = wVar.f18846q != null;
        BitmapFactory.Options options = null;
        if (a10 || z10 || wVar.p) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = a10;
            boolean z11 = wVar.p;
            options.inInputShareable = z11;
            options.inPurgeable = z11;
            if (z10) {
                options.inPreferredConfig = wVar.f18846q;
            }
        }
        return options;
    }

    public abstract boolean c(w wVar);

    public int e() {
        return 0;
    }

    public abstract a f(w wVar, int i10);

    public boolean g(NetworkInfo networkInfo) {
        return false;
    }
}
