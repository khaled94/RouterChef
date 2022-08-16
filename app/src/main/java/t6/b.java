package t6;

import android.content.Context;
import android.util.Log;
import e0.d;
import java.io.File;
import java.util.Objects;
import s6.e;
import s6.u;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d */
    public static final C0117b f18672d = new C0117b();

    /* renamed from: a */
    public final Context f18673a;

    /* renamed from: b */
    public final a f18674b;

    /* renamed from: c */
    public t6.a f18675c = f18672d;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: t6.b$b */
    /* loaded from: classes.dex */
    public static final class C0117b implements t6.a {
        @Override // t6.a
        public final void a() {
        }

        @Override // t6.a
        public final String b() {
            return null;
        }

        @Override // t6.a
        public final void c(long j3, String str) {
        }
    }

    public b(Context context, a aVar, String str) {
        this.f18673a = context;
        this.f18674b = aVar;
        a(str);
    }

    public final void a(String str) {
        this.f18675c.a();
        this.f18675c = f18672d;
        if (str == null) {
            return;
        }
        if (!e.d(this.f18673a, "com.crashlytics.CollectCustomLogs")) {
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                return;
            }
            Log.d("FirebaseCrashlytics", "Preferences requested no custom logs. Aborting log file creation.", null);
            return;
        }
        String a10 = d.a("crashlytics-userlog-", str, ".temp");
        u.b bVar = (u.b) this.f18674b;
        Objects.requireNonNull(bVar);
        File file = new File(bVar.f18328a.a(), "log-files");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f18675c = new e(new File(file, a10));
    }
}
