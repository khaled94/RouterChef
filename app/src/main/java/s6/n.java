package s6;

import android.util.Log;
import c5.i;
import c5.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import s6.o;

/* loaded from: classes.dex */
public final class n implements Callable<i<Void>> {

    /* renamed from: a */
    public final /* synthetic */ Boolean f18286a;

    /* renamed from: b */
    public final /* synthetic */ o.a f18287b;

    public n(o.a aVar, Boolean bool) {
        this.f18287b = aVar;
        this.f18286a = bool;
    }

    @Override // java.util.concurrent.Callable
    public final i<Void> call() {
        if (!this.f18286a.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            File[] listFiles = o.this.g().listFiles(h.f18262a);
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File file : listFiles) {
                file.delete();
            }
            Iterator it = ((ArrayList) o.this.f18300m.f18269b.b()).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            o.this.f18303q.d(null);
            return l.e(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue = this.f18286a.booleanValue();
        z zVar = o.this.f18289b;
        Objects.requireNonNull(zVar);
        if (booleanValue) {
            zVar.f18346f.d(null);
            o.a aVar = this.f18287b;
            Executor executor = o.this.f18291d.f18252a;
            return aVar.f18304s.p(executor, new m(this, executor));
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
