package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import n6.b;
import n6.c;
import n6.f;
import n6.n;
import q2.g;
import r2.a;
import t2.w;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements f {
    public static /* synthetic */ g lambda$getComponents$0(c cVar) {
        w.b((Context) cVar.a(Context.class));
        return w.a().c(a.f17229e);
    }

    @Override // n6.f
    public List<b<?>> getComponents() {
        b.C0097b a10 = b.a(g.class);
        a10.a(new n(Context.class, 1, 0));
        a10.f16626e = f7.a.f4551s;
        return Arrays.asList(a10.b(), w7.f.a("fire-transport", "18.1.5"));
    }
}
