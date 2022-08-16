package s6;

import android.util.Log;
import c5.a;
import c5.i;
import e7.c;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import o7.a;
import o7.b;
import x6.g;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements a, a.AbstractC0098a {

    /* renamed from: s */
    public final /* synthetic */ Object f18263s;

    public /* synthetic */ h0(Object obj) {
        this.f18263s = obj;
    }

    @Override // o7.a.AbstractC0098a
    public final void b(b bVar) {
        ((c) this.f18263s).f4433a.set((m6.a) bVar.get());
    }

    @Override // c5.a
    public final Object d(i iVar) {
        j0 j0Var = (j0) this.f18263s;
        Objects.requireNonNull(j0Var);
        boolean z10 = false;
        if (iVar.n()) {
            x xVar = (x) iVar.j();
            StringBuilder c10 = androidx.activity.result.a.c("Crashlytics report successfully enqueued to DataTransport: ");
            c10.append(xVar.b());
            String sb = c10.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb, null);
            }
            g gVar = j0Var.f18269b;
            final String b10 = xVar.b();
            Objects.requireNonNull(gVar);
            FilenameFilter filenameFilter = new FilenameFilter() { // from class: x6.b
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return str.startsWith(b10);
                }
            };
            Iterator it = ((ArrayList) g.a(g.d(gVar.f20063c, filenameFilter), g.d(gVar.f20065e, filenameFilter), g.d(gVar.f20064d, filenameFilter))).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            z10 = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", iVar.i());
        }
        return Boolean.valueOf(z10);
    }
}
