package t1;

import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import t1.j;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a */
    public UUID f18487a;

    /* renamed from: b */
    public c2.p f18488b;

    /* renamed from: c */
    public Set<String> f18489c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends p> {

        /* renamed from: b */
        public c2.p f18491b;

        /* renamed from: c */
        public Set<String> f18492c = new HashSet();

        /* renamed from: a */
        public UUID f18490a = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f18491b = new c2.p(this.f18490a.toString(), cls.getName());
            a(cls.getName());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
        public final B a(String str) {
            this.f18492c.add(str);
            return (j.a) this;
        }

        public final W b() {
            j jVar = new j((j.a) this);
            b bVar = this.f18491b.f2644j;
            boolean z10 = (Build.VERSION.SDK_INT >= 24 && bVar.a()) || bVar.f18455d || bVar.f18453b || bVar.f18454c;
            c2.p pVar = this.f18491b;
            if (pVar.f2650q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (pVar.f2641g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f18490a = UUID.randomUUID();
            c2.p pVar2 = new c2.p(this.f18491b);
            this.f18491b = pVar2;
            pVar2.f2635a = this.f18490a.toString();
            return jVar;
        }
    }

    public p(UUID uuid, c2.p pVar, Set<String> set) {
        this.f18487a = uuid;
        this.f18488b = pVar;
        this.f18489c = set;
    }

    public final String a() {
        return this.f18487a.toString();
    }
}
