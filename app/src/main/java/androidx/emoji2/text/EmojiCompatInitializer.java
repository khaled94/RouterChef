package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.emoji2.text.j;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import i0.j;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements n1.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            this.f1304b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a */
        public final Context f1287a;

        public b(Context context) {
            this.f1287a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.g
        public final void a(final d.h hVar) {
            final ThreadPoolExecutor a10 = androidx.emoji2.text.b.a("EmojiCompatInitializer");
            a10.execute(new Runnable() { // from class: androidx.emoji2.text.e
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b bVar = EmojiCompatInitializer.b.this;
                    d.h hVar2 = hVar;
                    ThreadPoolExecutor threadPoolExecutor = a10;
                    Objects.requireNonNull(bVar);
                    try {
                        j a11 = c.a(bVar.f1287a);
                        if (a11 != null) {
                            j.b bVar2 = (j.b) a11.f1303a;
                            synchronized (bVar2.f1336d) {
                                bVar2.f1338f = threadPoolExecutor;
                            }
                            a11.f1303a.a(new f(hVar2, threadPoolExecutor));
                            return;
                        }
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    } catch (Throwable th) {
                        hVar2.a(th);
                        threadPoolExecutor.shutdown();
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i10 = i0.j.f5171a;
                j.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.c()) {
                    d.a().e();
                }
                j.a.b();
            } catch (Throwable th) {
                int i11 = i0.j.f5171a;
                j.a.b();
                throw th;
            }
        }
    }

    @Override // n1.b
    public final List<Class<? extends n1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // n1.b
    public final /* bridge */ /* synthetic */ Boolean b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        a aVar = new a(context);
        if (d.f1290j == null) {
            synchronized (d.f1289i) {
                if (d.f1290j == null) {
                    d.f1290j = new d(aVar);
                }
            }
        }
        n1.a b10 = n1.a.b(context);
        Objects.requireNonNull(b10);
        final g a10 = ((l) b10.a(ProcessLifecycleInitializer.class, new HashSet())).a();
        a10.a(new androidx.lifecycle.c() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.c
            public final /* synthetic */ void b() {
            }

            @Override // androidx.lifecycle.c
            public final /* synthetic */ void c() {
            }

            @Override // androidx.lifecycle.c
            public final /* synthetic */ void d() {
            }

            @Override // androidx.lifecycle.c
            public final /* synthetic */ void onDestroy() {
            }

            @Override // androidx.lifecycle.c
            public final /* synthetic */ void onPause() {
            }

            @Override // androidx.lifecycle.c
            public final void onResume() {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                androidx.emoji2.text.b.b().postDelayed(new c(), 500L);
                a10.c(this);
            }
        });
    }
}
