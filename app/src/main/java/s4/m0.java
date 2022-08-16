package s4;

import android.annotation.TargetApi;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    public static final Method f17985a;

    /* renamed from: b */
    public static final Method f17986b;

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 6
            r3 = 0
            r4 = 24
            java.lang.String r5 = "JobSchedulerCompat"
            r6 = 0
            if (r1 < r4) goto L33
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobInfo> r7 = android.app.job.JobInfo.class
            r1[r3] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 1
            r1[r7] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 2
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r1[r7] = r8     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 3
            r1[r7] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r7, r1)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L34
        L28:
            boolean r0 = android.util.Log.isLoggable(r5, r2)
            if (r0 == 0) goto L33
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r5, r0)
        L33:
            r0 = r6
        L34:
            s4.m0.f17985a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L50
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L45
            java.lang.reflect.Method r6 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L45
            goto L50
        L45:
            boolean r0 = android.util.Log.isLoggable(r5, r2)
            if (r0 == 0) goto L50
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r5, r0)
        L50:
            s4.m0.f17986b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.m0.<clinit>():void");
    }
}
