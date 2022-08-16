package com.google.firebase.messaging;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;
import u7.h0;
import u7.k;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends k {

    /* renamed from: x */
    public static final Queue<String> f3483x = new ArrayDeque(10);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Queue<android.content.Intent>, java.util.ArrayDeque] */
    @Override // u7.k
    public final Intent b(Intent intent) {
        return (Intent) h0.a().f19506d.poll();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:78|(1:80)|81|(1:83)(2:84|(2:172|86))|88|(2:188|91)|90|92|(1:94)(1:95)|96|(1:98)|(1:100)(1:101)|102|(1:106)|(1:108)(1:109)|110|(1:112)(1:113)|114|(1:116)(1:117)|118|(1:120)(1:121)|122|(7:176|124|142|(1:144)(1:145)|146|174|147)|127|(7:186|129|142|(0)(0)|146|174|147)|132|(8:134|(1:136)|141|142|(0)(0)|146|174|147)|184|138|142|(0)(0)|146|174|147) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0293, code lost:
        if (r0.isEmpty() != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x029b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x029c, code lost:
        android.util.Log.w("FirebaseMessaging", "error parsing app ID", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.ArrayDeque, java.util.Queue<java.lang.String>] */
    @Override // u7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }
}
