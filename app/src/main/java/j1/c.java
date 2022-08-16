package j1;

import android.os.Bundle;
import androidx.activity.result.a;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.savedstate.Recreator;
import e9.f;
import j1.b;
import java.util.Map;
import java.util.Objects;
import m.b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final d f5436a;

    /* renamed from: b */
    public final b f5437b = new b();

    /* renamed from: c */
    public boolean f5438c;

    public c(d dVar) {
        this.f5436a = dVar;
    }

    public static final c a(d dVar) {
        f.e(dVar, "owner");
        return new c(dVar);
    }

    public final void b() {
        g a10 = this.f5436a.a();
        f.d(a10, "owner.lifecycle");
        if (a10.b() == g.c.INITIALIZED) {
            a10.a(new Recreator(this.f5436a));
            final b bVar = this.f5437b;
            Objects.requireNonNull(bVar);
            if (!bVar.f5431b) {
                a10.a(new j() { // from class: j1.a
                    @Override // androidx.lifecycle.j
                    public final void a(l lVar, g.b bVar2) {
                        boolean z10;
                        b bVar3 = b.this;
                        f.e(bVar3, "this$0");
                        if (bVar2 == g.b.ON_START) {
                            z10 = true;
                        } else if (bVar2 != g.b.ON_STOP) {
                            return;
                        } else {
                            z10 = false;
                        }
                        bVar3.f5435f = z10;
                    }
                });
                bVar.f5431b = true;
                this.f5438c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void c(Bundle bundle) {
        if (!this.f5438c) {
            b();
        }
        g a10 = this.f5436a.a();
        f.d(a10, "owner.lifecycle");
        if (!a10.b().b(g.c.STARTED)) {
            b bVar = this.f5437b;
            if (!bVar.f5431b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            }
            if (!(!bVar.f5433d)) {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            bVar.f5432c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            bVar.f5433d = true;
            return;
        }
        StringBuilder c10 = a.c("performRestore cannot be called when owner is ");
        c10.append(a10.b());
        throw new IllegalStateException(c10.toString().toString());
    }

    public final void d(Bundle bundle) {
        f.e(bundle, "outBundle");
        b bVar = this.f5437b;
        Objects.requireNonNull(bVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bVar.f5432c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b<String, b.AbstractC0077b>.d e10 = bVar.f5430a.e();
        while (e10.hasNext()) {
            Map.Entry entry = (Map.Entry) e10.next();
            bundle2.putBundle((String) entry.getKey(), ((b.AbstractC0077b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
