package j0;

import android.content.Context;
import j0.l;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h implements Callable<l.a> {

    /* renamed from: a */
    public final /* synthetic */ String f5398a;

    /* renamed from: b */
    public final /* synthetic */ Context f5399b;

    /* renamed from: c */
    public final /* synthetic */ g f5400c;

    /* renamed from: d */
    public final /* synthetic */ int f5401d;

    public h(String str, Context context, g gVar, int i10) {
        this.f5398a = str;
        this.f5399b = context;
        this.f5400c = gVar;
        this.f5401d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final l.a call() {
        return l.b(this.f5398a, this.f5399b, this.f5400c, this.f5401d);
    }
}
