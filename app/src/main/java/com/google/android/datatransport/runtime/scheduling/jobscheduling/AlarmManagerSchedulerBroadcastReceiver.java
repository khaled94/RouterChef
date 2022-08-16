package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a3.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import e3.a;
import t2.j;
import t2.r;
import t2.w;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f2902a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        w.b(context);
        r.a a10 = r.a();
        a10.a(queryParameter);
        j.a aVar = (j.a) a10;
        aVar.f18532c = a.b(intValue);
        if (queryParameter2 != null) {
            aVar.f18531b = Base64.decode(queryParameter2, 0);
        }
        a3.r rVar = w.a().f18560d;
        rVar.f84e.execute(new h(rVar, aVar.b(), i10, a3.a.f36s));
    }
}
