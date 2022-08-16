package t8;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import r9.d;
import r9.z;

/* loaded from: classes.dex */
public final class s implements j {

    /* renamed from: a */
    public final z f18796a;

    public s(Context context) {
        long j3;
        StringBuilder sb = e0.f18755a;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j3 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j3 = 5242880;
        }
        long max = Math.max(Math.min(j3, 52428800L), 5242880L);
        z.b bVar = new z.b();
        bVar.f17526i = new d(file, max);
        this.f18796a = new z(bVar);
    }
}
