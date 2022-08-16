package m4;

import h4.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i11 implements ap1 {

    /* renamed from: t */
    public final d11 f9503t;

    /* renamed from: u */
    public final a f9504u;

    /* renamed from: s */
    public final Map<wo1, Long> f9502s = new HashMap();

    /* renamed from: v */
    public final Map<wo1, h11> f9505v = new HashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<m4.wo1, m4.h11>, java.util.HashMap] */
    public i11(d11 d11Var, Set<h11> set, a aVar) {
        this.f9503t = d11Var;
        for (h11 h11Var : set) {
            this.f9505v.put(h11Var.f9075b, h11Var);
        }
        this.f9504u = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<m4.wo1, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<m4.wo1, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map<m4.wo1, m4.h11>, java.util.HashMap] */
    @Override // m4.ap1
    public final void a(wo1 wo1Var, String str) {
        if (this.f9502s.containsKey(wo1Var)) {
            long b10 = this.f9504u.b() - ((Long) this.f9502s.get(wo1Var)).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f9503t.f7170a;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b10));
            concurrentHashMap.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f9505v.containsKey(wo1Var)) {
            c(wo1Var, true);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<m4.wo1, java.lang.Long>, java.util.HashMap] */
    @Override // m4.ap1
    public final void b(wo1 wo1Var, String str) {
        this.f9502s.put(wo1Var, Long.valueOf(this.f9504u.b()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<m4.wo1, m4.h11>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<m4.wo1, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<m4.wo1, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map<m4.wo1, m4.h11>, java.util.HashMap] */
    public final void c(wo1 wo1Var, boolean z10) {
        wo1 wo1Var2 = ((h11) this.f9505v.get(wo1Var)).f9074a;
        String str = true != z10 ? "f." : "s.";
        if (this.f9502s.containsKey(wo1Var2)) {
            long b10 = this.f9504u.b() - ((Long) this.f9502s.get(wo1Var2)).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f9503t.f7170a;
            Objects.requireNonNull((h11) this.f9505v.get(wo1Var));
            String concat = "label.".concat("ttc");
            String valueOf = String.valueOf(Long.toString(b10));
            concurrentHashMap.put(concat, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    @Override // m4.ap1
    public final void f(String str) {
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map<m4.wo1, m4.h11>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map<m4.wo1, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map<m4.wo1, java.lang.Long>, java.util.HashMap] */
    @Override // m4.ap1
    public final void h(wo1 wo1Var, String str, Throwable th) {
        if (this.f9502s.containsKey(wo1Var)) {
            long b10 = this.f9504u.b() - ((Long) this.f9502s.get(wo1Var)).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f9503t.f7170a;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b10));
            concurrentHashMap.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f9505v.containsKey(wo1Var)) {
            c(wo1Var, false);
        }
    }
}
