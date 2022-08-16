package com.google.firebase.installations;

import androidx.annotation.Keep;
import d4.f1;
import h6.d;
import java.util.Arrays;
import java.util.List;
import m4.g7;
import m7.h;
import m7.i;
import n6.a;
import n6.b;
import n6.c;
import n6.f;
import n6.n;
import p7.e;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements f {
    public static /* synthetic */ p7.f lambda$getComponents$0(c cVar) {
        return new e((d) cVar.a(d.class), cVar.c(i.class));
    }

    @Override // n6.f
    public List<b<?>> getComponents() {
        b.C0097b a10 = b.a(p7.f.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(i.class, 0, 1));
        a10.f16626e = f1.f3872s;
        g7 g7Var = new g7();
        b.C0097b a11 = b.a(h.class);
        a11.f16625d = 1;
        a11.f16626e = new a(g7Var);
        return Arrays.asList(a10.b(), a11.b(), w7.f.a("fire-installations", "17.0.1"));
    }
}
