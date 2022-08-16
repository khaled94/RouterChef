package com.google.firebase.messaging;

import androidx.annotation.Keep;
import h6.d;
import java.util.Arrays;
import java.util.List;
import m7.j;
import n6.b;
import n6.c;
import n6.f;
import n6.n;
import n7.a;
import t1.l;
import w7.g;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements f {
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(c cVar) {
        return new FirebaseMessaging((d) cVar.a(d.class), (a) cVar.a(a.class), cVar.c(g.class), cVar.c(j.class), (p7.f) cVar.a(p7.f.class), (q2.g) cVar.a(q2.g.class), (l7.d) cVar.a(l7.d.class));
    }

    @Override // n6.f
    @Keep
    public List<b<?>> getComponents() {
        b[] bVarArr = new b[2];
        b.C0097b a10 = b.a(FirebaseMessaging.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(a.class, 0, 0));
        a10.a(new n(g.class, 0, 1));
        a10.a(new n(j.class, 0, 1));
        a10.a(new n(q2.g.class, 0, 0));
        a10.a(new n(p7.f.class, 1, 0));
        a10.a(new n(l7.d.class, 1, 0));
        a10.f16626e = l.f18480s;
        if (a10.f16624c == 0) {
            a10.f16624c = 1;
            bVarArr[0] = a10.b();
            bVarArr[1] = w7.f.a("fire-fcm", "23.0.6");
            return Arrays.asList(bVarArr);
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
