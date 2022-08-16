package com.google.firebase;

import android.content.Context;
import android.os.Build;
import b3.r;
import d7.a;
import java.util.ArrayList;
import java.util.List;
import m7.e;
import m7.h;
import m7.i;
import m7.j;
import n6.b;
import n6.f;
import n6.n;
import w7.d;
import w7.g;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements f {
    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // n6.f
    public final List<b<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        b.C0097b a10 = b.a(g.class);
        a10.a(new n(d.class, 2, 0));
        a10.f16626e = s.b.f17549s;
        arrayList.add(a10.b());
        int i10 = m7.g.f16383f;
        String str = null;
        b.C0097b c0097b = new b.C0097b(m7.g.class, new Class[]{i.class, j.class}, null);
        c0097b.a(new n(Context.class, 1, 0));
        c0097b.a(new n(h6.d.class, 1, 0));
        c0097b.a(new n(h.class, 2, 0));
        c0097b.a(new n(g.class, 1, 1));
        c0097b.f16626e = e.f16380s;
        arrayList.add(c0097b.b());
        arrayList.add(w7.f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(w7.f.a("fire-core", "20.1.1"));
        arrayList.add(w7.f.a("device-name", b(Build.PRODUCT)));
        arrayList.add(w7.f.a("device-model", b(Build.DEVICE)));
        arrayList.add(w7.f.a("device-brand", b(Build.BRAND)));
        arrayList.add(w7.f.b("android-target-sdk", a.f3993t));
        arrayList.add(w7.f.b("android-min-sdk", h6.e.f5125s));
        arrayList.add(w7.f.b("android-platform", r.f2538t));
        arrayList.add(w7.f.b("android-installer", h6.f.f5126s));
        try {
            str = v8.b.f19824w.toString();
        } catch (NoClassDefFoundError unused) {
        }
        if (str != null) {
            arrayList.add(w7.f.a("kotlin", str));
        }
        return arrayList;
    }
}
