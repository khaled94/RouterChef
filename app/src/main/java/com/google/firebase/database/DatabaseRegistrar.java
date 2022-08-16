package com.google.firebase.database;

import androidx.annotation.Keep;
import d7.b;
import h6.d;
import java.util.Arrays;
import java.util.List;
import m6.a;
import n6.b;
import n6.c;
import n6.f;
import n6.n;

@Keep
/* loaded from: classes.dex */
public class DatabaseRegistrar implements f {
    public static /* synthetic */ b lambda$getComponents$0(c cVar) {
        d dVar = (d) cVar.a(d.class);
        return new b(cVar.e(a.class), cVar.e(l6.a.class));
    }

    @Override // n6.f
    public List<n6.b<?>> getComponents() {
        b.C0097b a10 = n6.b.a(d7.b.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(a.class, 0, 2));
        a10.a(new n(l6.a.class, 0, 2));
        a10.f16626e = d7.a.f3992s;
        return Arrays.asList(a10.b(), w7.f.a("fire-rtdb", "20.0.5"));
    }
}
