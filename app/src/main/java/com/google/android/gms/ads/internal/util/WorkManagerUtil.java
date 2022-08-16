package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.work.a;
import c2.p;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import java.util.HashMap;
import java.util.Objects;
import k4.a;
import k4.b;
import n3.g1;
import n3.q0;
import t1.b;
import t1.i;
import t1.j;
import u1.k;

/* loaded from: classes.dex */
public class WorkManagerUtil extends q0 {
    @Override // n3.r0
    public final void zze(@RecentlyNonNull a aVar) {
        Context context = (Context) b.e0(aVar);
        try {
            k.d(context.getApplicationContext(), new androidx.work.a(new a.C0027a()));
        } catch (IllegalStateException unused) {
        }
        try {
            k c10 = k.c(context);
            Objects.requireNonNull(c10);
            ((f2.b) c10.f19026d).a(new d2.b(c10));
            b.a aVar2 = new b.a();
            aVar2.f18460a = i.CONNECTED;
            t1.b bVar = new t1.b(aVar2);
            j.a aVar3 = new j.a(OfflinePingSender.class);
            aVar3.f18491b.f2644j = bVar;
            c10.b(aVar3.a("offline_ping_sender_work").b());
        } catch (IllegalStateException e10) {
            g1.k("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // n3.r0
    public final boolean zzf(@RecentlyNonNull k4.a aVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        Context context = (Context) k4.b.e0(aVar);
        try {
            k.d(context.getApplicationContext(), new androidx.work.a(new a.C0027a()));
        } catch (IllegalStateException unused) {
        }
        b.a aVar2 = new b.a();
        aVar2.f18460a = i.CONNECTED;
        t1.b bVar = new t1.b(aVar2);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        androidx.work.b bVar2 = new androidx.work.b(hashMap);
        androidx.work.b.c(bVar2);
        j.a aVar3 = new j.a(OfflineNotificationPoster.class);
        p pVar = aVar3.f18491b;
        pVar.f2644j = bVar;
        pVar.f2639e = bVar2;
        try {
            k.c(context).b(aVar3.a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e10) {
            g1.k("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
