package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import d4.m;
import h6.d;
import j6.a;
import j6.b;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import n6.b;
import n6.c;
import n6.f;
import n6.n;
import s4.k2;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements f {
    public static a lambda$getComponents$0(c cVar) {
        d dVar = (d) cVar.a(d.class);
        Context context = (Context) cVar.a(Context.class);
        l7.d dVar2 = (l7.d) cVar.a(l7.d.class);
        Objects.requireNonNull(dVar, "null reference");
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(dVar2, "null reference");
        m.h(context.getApplicationContext());
        if (b.f5471c == null) {
            synchronized (b.class) {
                if (b.f5471c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar.h()) {
                        dVar2.b(j6.d.f5475s, j6.c.f5474a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.g());
                    }
                    b.f5471c = new b(k2.f(context, null, null, null, bundle).f17951b);
                }
            }
        }
        return b.f5471c;
    }

    @Override // n6.f
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<n6.b<?>> getComponents() {
        b.C0097b a10 = n6.b.a(a.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(Context.class, 1, 0));
        a10.a(new n(l7.d.class, 1, 0));
        a10.f16626e = b7.c.f2595s;
        a10.c();
        return Arrays.asList(a10.b(), w7.f.a("fire-analytics", "19.0.2"));
    }
}
