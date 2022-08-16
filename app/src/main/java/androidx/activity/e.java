package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.c;
import androidx.activity.result.e;
import c.a;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f414s;

    /* renamed from: t */
    public final /* synthetic */ a.C0036a f415t;

    /* renamed from: u */
    public final /* synthetic */ ComponentActivity.b f416u;

    public e(ComponentActivity.b bVar, int i10, a.C0036a c0036a) {
        this.f416u = bVar;
        this.f414s = i10;
        this.f415t = c0036a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, androidx.activity.result.e$b<?>>, java.util.HashMap] */
    @Override // java.lang.Runnable
    public final void run() {
        c<O> cVar;
        ComponentActivity.b bVar = this.f416u;
        int i10 = this.f414s;
        T t10 = this.f415t.f2601a;
        String str = (String) bVar.f430b.get(Integer.valueOf(i10));
        if (str == null) {
            return;
        }
        e.b bVar2 = (e.b) bVar.f434f.get(str);
        if (bVar2 == null || (cVar = bVar2.f440a) == 0) {
            bVar.f436h.remove(str);
            bVar.f435g.put(str, t10);
        } else if (!bVar.f433e.remove(str)) {
        } else {
            cVar.a(t10);
        }
    }
}
