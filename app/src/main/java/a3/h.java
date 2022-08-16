package a3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b3.d;
import c3.a;
import c3.b;
import java.util.Objects;
import t2.r;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ r f56s;

    /* renamed from: t */
    public final /* synthetic */ r f57t;

    /* renamed from: u */
    public final /* synthetic */ int f58u;

    /* renamed from: v */
    public final /* synthetic */ Runnable f59v;

    public /* synthetic */ h(r rVar, r rVar2, int i10, Runnable runnable) {
        this.f56s = rVar;
        this.f57t = rVar2;
        this.f58u = i10;
        this.f59v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final r rVar = this.f56s;
        final r rVar2 = this.f57t;
        final int i10 = this.f58u;
        Runnable runnable = this.f59v;
        Objects.requireNonNull(rVar);
        try {
            try {
                b bVar = rVar.f85f;
                d dVar = rVar.f82c;
                Objects.requireNonNull(dVar);
                bVar.b(new q(dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) rVar.f80a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected())) {
                    rVar.f85f.b(new b.a() { // from class: a3.n
                        @Override // c3.b.a
                        public final Object a() {
                            r rVar3 = r.this;
                            rVar3.f83d.a(rVar2, i10 + 1);
                            return null;
                        }
                    });
                } else {
                    rVar.a(rVar2, i10);
                }
            } catch (a unused) {
                rVar.f83d.a(rVar2, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
