package t8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import t8.t;

/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a */
    public final t f18698a;

    /* renamed from: b */
    public final w f18699b;

    /* renamed from: c */
    public final WeakReference<T> f18700c;

    /* renamed from: d */
    public final boolean f18701d;

    /* renamed from: e */
    public final int f18702e;

    /* renamed from: f */
    public final int f18703f;

    /* renamed from: g */
    public final int f18704g;

    /* renamed from: h */
    public final Drawable f18705h;

    /* renamed from: i */
    public final String f18706i;

    /* renamed from: j */
    public final Object f18707j;

    /* renamed from: k */
    public boolean f18708k;

    /* renamed from: l */
    public boolean f18709l;

    /* renamed from: t8.a$a */
    /* loaded from: classes.dex */
    public static class C0119a<M> extends WeakReference<M> {

        /* renamed from: a */
        public final a f18710a;

        public C0119a(a aVar, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.f18710a = aVar;
        }
    }

    public a(t tVar, Object obj, w wVar, String str) {
        this.f18698a = tVar;
        this.f18699b = wVar;
        this.f18700c = obj == null ? null : new C0119a(this, obj, tVar.f18808j);
        this.f18702e = 0;
        this.f18703f = 0;
        this.f18701d = false;
        this.f18704g = 0;
        this.f18705h = null;
        this.f18706i = str;
        this.f18707j = this;
    }

    public void a() {
        this.f18709l = true;
    }

    public abstract void b(Bitmap bitmap, t.d dVar);

    public abstract void c(Exception exc);

    public final T d() {
        WeakReference<T> weakReference = this.f18700c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
