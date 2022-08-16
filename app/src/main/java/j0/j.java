package j0;

import android.content.Context;
import j0.l;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class j implements Callable<l.a> {

    /* renamed from: a */
    public final /* synthetic */ String f5403a;

    /* renamed from: b */
    public final /* synthetic */ Context f5404b;

    /* renamed from: c */
    public final /* synthetic */ g f5405c;

    /* renamed from: d */
    public final /* synthetic */ int f5406d;

    public j(String str, Context context, g gVar, int i10) {
        this.f5403a = str;
        this.f5404b = context;
        this.f5405c = gVar;
        this.f5406d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final l.a call() {
        try {
            return l.b(this.f5403a, this.f5404b, this.f5405c, this.f5406d);
        } catch (Throwable unused) {
            return new l.a(-3);
        }
    }
}
