package androidx.emoji2.text;

import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class f extends d.h {

    /* renamed from: a */
    public final /* synthetic */ d.h f1312a;

    /* renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f1313b;

    public f(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1312a = hVar;
        this.f1313b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.d.h
    public final void a(Throwable th) {
        try {
            this.f1312a.a(th);
        } finally {
            this.f1313b.shutdown();
        }
    }

    @Override // androidx.emoji2.text.d.h
    public final void b(n nVar) {
        try {
            this.f1312a.b(nVar);
        } finally {
            this.f1313b.shutdown();
        }
    }
}
