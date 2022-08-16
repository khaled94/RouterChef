package p6;

import a3.q;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import n6.y;
import o7.a;
import o7.b;
import u6.c0;

/* loaded from: classes.dex */
public final class d implements p6.a {

    /* renamed from: c */
    public static final a f16962c = new a();

    /* renamed from: a */
    public final o7.a<p6.a> f16963a;

    /* renamed from: b */
    public final AtomicReference<p6.a> f16964b = new AtomicReference<>(null);

    /* loaded from: classes.dex */
    public static final class a implements e {
    }

    public d(o7.a<p6.a> aVar) {
        this.f16963a = aVar;
        ((y) aVar).a(new a.AbstractC0098a() { // from class: p6.c
            @Override // o7.a.AbstractC0098a
            public final void b(b bVar) {
                d dVar = d.this;
                Objects.requireNonNull(dVar);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                dVar.f16964b.set((a) bVar.get());
            }
        });
    }

    @Override // p6.a
    public final void a(String str) {
        ((y) this.f16963a).a(new q(str));
    }

    @Override // p6.a
    public final e b(String str) {
        p6.a aVar = this.f16964b.get();
        return aVar == null ? f16962c : aVar.b(str);
    }

    @Override // p6.a
    public final boolean c() {
        p6.a aVar = this.f16964b.get();
        return aVar != null && aVar.c();
    }

    @Override // p6.a
    public final void d(final String str, final String str2, final long j3, final c0 c0Var) {
        String c10 = d7.a.c("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", c10, null);
        }
        ((y) this.f16963a).a(new a.AbstractC0098a() { // from class: p6.b
            @Override // o7.a.AbstractC0098a
            public final void b(o7.b bVar) {
                ((a) bVar.get()).d(str, str2, j3, c0Var);
            }
        });
    }

    @Override // p6.a
    public final boolean e(String str) {
        p6.a aVar = this.f16964b.get();
        return aVar != null && aVar.e(str);
    }
}
