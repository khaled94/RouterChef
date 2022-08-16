package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final m f1668a;

    /* renamed from: b */
    public final Handler f1669b = new Handler();

    /* renamed from: c */
    public a f1670c;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: s */
        public final m f1671s;

        /* renamed from: t */
        public final g.b f1672t;

        /* renamed from: u */
        public boolean f1673u = false;

        public a(m mVar, g.b bVar) {
            this.f1671s = mVar;
            this.f1672t = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f1673u) {
                this.f1671s.f(this.f1672t);
                this.f1673u = true;
            }
        }
    }

    public d0(l lVar) {
        this.f1668a = new m(lVar);
    }

    public final void a(g.b bVar) {
        a aVar = this.f1670c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f1668a, bVar);
        this.f1670c = aVar2;
        this.f1669b.postAtFrontOfQueue(aVar2);
    }
}
