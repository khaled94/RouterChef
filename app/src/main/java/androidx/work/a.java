package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import t1.g;
import t1.q;
import t1.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final ExecutorService f2296a = (ExecutorService) a(false);

    /* renamed from: b */
    public final ExecutorService f2297b = (ExecutorService) a(true);

    /* renamed from: c */
    public final q f2298c = new q();

    /* renamed from: d */
    public final g f2299d = new g();

    /* renamed from: e */
    public final u1.a f2300e = new u1.a();

    /* renamed from: f */
    public final int f2301f = 4;

    /* renamed from: g */
    public final int f2302g = Integer.MAX_VALUE;

    /* renamed from: h */
    public final int f2303h = 20;

    /* renamed from: androidx.work.a$a */
    /* loaded from: classes.dex */
    public static final class C0027a {
    }

    /* loaded from: classes.dex */
    public interface b {
        a a();
    }

    public a(C0027a c0027a) {
        String str = r.f18493a;
    }

    public final Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new t1.a(z10));
    }
}
