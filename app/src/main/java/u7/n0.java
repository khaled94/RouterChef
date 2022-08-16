package u7;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import c5.i;
import c5.j;
import c5.l;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r.a;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: i */
    public static final long f19544i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    public static final /* synthetic */ int f19545j = 0;

    /* renamed from: a */
    public final Context f19546a;

    /* renamed from: b */
    public final z f19547b;

    /* renamed from: c */
    public final v f19548c;

    /* renamed from: d */
    public final FirebaseMessaging f19549d;

    /* renamed from: f */
    public final ScheduledExecutorService f19551f;

    /* renamed from: h */
    public final l0 f19553h;

    /* renamed from: e */
    public final Map<String, ArrayDeque<j<Void>>> f19550e = new a();

    /* renamed from: g */
    public boolean f19552g = false;

    public n0(FirebaseMessaging firebaseMessaging, z zVar, l0 l0Var, v vVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f19549d = firebaseMessaging;
        this.f19547b = zVar;
        this.f19553h = l0Var;
        this.f19548c = vVar;
        this.f19546a = context;
        this.f19551f = scheduledExecutorService;
    }

    public static <T> void a(i<T> iVar) {
        Throwable e10;
        try {
            l.b(iVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            e10 = e11;
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e12);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e13) {
            e10 = e13;
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final void b(String str) {
        v vVar = this.f19548c;
        String a10 = this.f19549d.a();
        Objects.requireNonNull(vVar);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(vVar.a(vVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        v vVar = this.f19548c;
        String a10 = this.f19549d.a();
        Objects.requireNonNull(vVar);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(vVar.a(vVar.c(a10, "/topics/" + str, bundle)));
    }

    public final synchronized void e(boolean z10) {
        this.f19552g = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (d() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<c5.j<java.lang.Void>>>, r.g] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<c5.j<java.lang.Void>>>, r.g] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<c5.j<java.lang.Void>>>, r.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.n0.f():boolean");
    }

    public final void g(long j3) {
        this.f19551f.schedule(new o0(this, this.f19546a, this.f19547b, Math.min(Math.max(30L, 2 * j3), f19544i)), j3, TimeUnit.SECONDS);
        e(true);
    }
}
