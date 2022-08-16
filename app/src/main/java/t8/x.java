package t8;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import t2.a;
import t8.t;
import t8.w;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c */
    public static final AtomicInteger f18854c = new AtomicInteger();

    /* renamed from: a */
    public final t f18855a;

    /* renamed from: b */
    public final w.a f18856b;

    public x(t tVar, Uri uri) {
        this.f18855a = tVar;
        this.f18856b = new w.a(uri, tVar.f18809k);
    }

    public final void a(ImageView imageView, e eVar) {
        Bitmap e10;
        long nanoTime = System.nanoTime();
        e0.a();
        if (imageView != null) {
            w.a aVar = this.f18856b;
            if (!((aVar.f18848a == null && aVar.f18849b == 0) ? false : true)) {
                t tVar = this.f18855a;
                Objects.requireNonNull(tVar);
                tVar.a(imageView);
                u.c(imageView);
                return;
            }
            int andIncrement = f18854c.getAndIncrement();
            w.a aVar2 = this.f18856b;
            if (aVar2.f18853f == 0) {
                aVar2.f18853f = 2;
            }
            w wVar = new w(aVar2.f18848a, aVar2.f18849b, aVar2.f18850c, aVar2.f18851d, aVar2.f18852e, aVar2.f18853f);
            wVar.f18831a = andIncrement;
            wVar.f18832b = nanoTime;
            if (this.f18855a.f18811m) {
                e0.g("Main", "created", wVar.d(), wVar.toString());
            }
            Objects.requireNonNull((t.e.a) this.f18855a.f18800b);
            String b10 = e0.b(wVar);
            if (!a.a(0) || (e10 = this.f18855a.e(b10)) == null) {
                u.c(imageView);
                this.f18855a.c(new l(this.f18855a, imageView, wVar, b10, eVar));
                return;
            }
            t tVar2 = this.f18855a;
            Objects.requireNonNull(tVar2);
            tVar2.a(imageView);
            t tVar3 = this.f18855a;
            Context context = tVar3.f18802d;
            t.d dVar = t.d.MEMORY;
            u.b(imageView, context, e10, dVar, false, tVar3.f18810l);
            if (this.f18855a.f18811m) {
                String d5 = wVar.d();
                e0.g("Main", "completed", d5, "from " + dVar);
            }
            if (eVar == null) {
                return;
            }
            eVar.b();
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }
}
