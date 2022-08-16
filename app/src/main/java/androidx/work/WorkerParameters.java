package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import t1.e;
import t1.m;
import t1.r;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    public UUID f2283a;

    /* renamed from: b */
    public b f2284b;

    /* renamed from: c */
    public Set<String> f2285c;

    /* renamed from: d */
    public a f2286d;

    /* renamed from: e */
    public int f2287e;

    /* renamed from: f */
    public Executor f2288f;

    /* renamed from: g */
    public f2.a f2289g;

    /* renamed from: h */
    public r f2290h;

    /* renamed from: i */
    public m f2291i;

    /* renamed from: j */
    public e f2292j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public List<String> f2293a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f2294b = Collections.emptyList();

        /* renamed from: c */
        public Network f2295c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, Executor executor, f2.a aVar2, r rVar, m mVar, e eVar) {
        this.f2283a = uuid;
        this.f2284b = bVar;
        this.f2285c = new HashSet(collection);
        this.f2286d = aVar;
        this.f2287e = i10;
        this.f2288f = executor;
        this.f2289g = aVar2;
        this.f2290h = rVar;
        this.f2291i = mVar;
        this.f2292j = eVar;
    }
}
