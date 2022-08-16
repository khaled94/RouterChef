package g1;

import android.annotation.SuppressLint;
import android.content.Context;
import g1.z;
import h1.a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import k1.c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final c.AbstractC0083c f4802a;

    /* renamed from: b */
    public final Context f4803b;

    /* renamed from: c */
    public final String f4804c;

    /* renamed from: d */
    public final z.c f4805d;

    /* renamed from: e */
    public final List<z.b> f4806e;

    /* renamed from: h */
    public final boolean f4809h;

    /* renamed from: i */
    public final int f4810i;

    /* renamed from: j */
    public final Executor f4811j;

    /* renamed from: k */
    public final Executor f4812k;

    /* renamed from: m */
    public final boolean f4814m;

    /* renamed from: n */
    public final boolean f4815n;

    /* renamed from: l */
    public final boolean f4813l = false;

    /* renamed from: f */
    public final List<Object> f4807f = Collections.emptyList();

    /* renamed from: g */
    public final List<a> f4808g = Collections.emptyList();

    @SuppressLint({"LambdaLast"})
    public f(Context context, String str, c.AbstractC0083c abstractC0083c, z.c cVar, List list, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12) {
        this.f4802a = abstractC0083c;
        this.f4803b = context;
        this.f4804c = str;
        this.f4805d = cVar;
        this.f4806e = list;
        this.f4809h = z10;
        this.f4810i = i10;
        this.f4811j = executor;
        this.f4812k = executor2;
        this.f4814m = z11;
        this.f4815n = z12;
    }

    public final boolean a(int i10, int i11) {
        return (!(i10 > i11) || !this.f4815n) && this.f4814m;
    }
}
