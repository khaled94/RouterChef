package s6;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import c5.b0;
import c5.h;
import c5.i;
import c5.j;
import c5.l;
import d4.p;
import e9.d;
import h6.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import s6.e;
import t6.b;
import u6.a0;
import u6.b;
import u6.g;
import u6.j;
import u6.u;
import u6.w;
import u6.x;
import u6.y;
import u6.z;
import z6.c;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public final Context f18288a;

    /* renamed from: b */
    public final z f18289b;

    /* renamed from: c */
    public final p f18290c;

    /* renamed from: d */
    public final f f18291d;

    /* renamed from: e */
    public final d0 f18292e;

    /* renamed from: f */
    public final e.o f18293f;

    /* renamed from: g */
    public final s6.a f18294g;

    /* renamed from: h */
    public final b.a f18295h;

    /* renamed from: i */
    public final b f18296i;

    /* renamed from: j */
    public final p6.a f18297j;

    /* renamed from: k */
    public final String f18298k;

    /* renamed from: l */
    public final q6.a f18299l;

    /* renamed from: m */
    public final j0 f18300m;

    /* renamed from: n */
    public y f18301n;

    /* renamed from: o */
    public final j<Boolean> f18302o = new j<>();
    public final j<Boolean> p = new j<>();

    /* renamed from: q */
    public final j<Void> f18303q = new j<>();

    /* loaded from: classes.dex */
    public class a implements h<Boolean, Void> {

        /* renamed from: s */
        public final /* synthetic */ i f18304s;

        public a(i iVar) {
            o.this = r1;
            this.f18304s = iVar;
        }

        @Override // c5.h
        public final i<Void> a(Boolean bool) {
            return o.this.f18291d.c(new n(this, bool));
        }
    }

    public o(Context context, f fVar, d0 d0Var, z zVar, e.o oVar, p pVar, s6.a aVar, b bVar, b.a aVar2, j0 j0Var, p6.a aVar3, q6.a aVar4) {
        new AtomicBoolean(false);
        this.f18288a = context;
        this.f18291d = fVar;
        this.f18292e = d0Var;
        this.f18289b = zVar;
        this.f18293f = oVar;
        this.f18290c = pVar;
        this.f18294g = aVar;
        this.f18296i = bVar;
        this.f18295h = aVar2;
        this.f18297j = aVar3;
        this.f18298k = ((c7.a) aVar.f18227g).a();
        this.f18299l = aVar4;
        this.f18300m = j0Var;
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.Map<java.lang.String, s6.e$a>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public static void a(o oVar) {
        String str;
        String str2;
        Integer num;
        Objects.requireNonNull(oVar);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        new d(oVar.f18292e);
        String str3 = d.f18238b;
        String c10 = d7.a.c("Opening a new session with ID ", str3);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", c10, null);
        }
        Locale locale = Locale.US;
        String format = String.format(locale, "Crashlytics Android SDK/%s", "18.2.3");
        d0 d0Var = oVar.f18292e;
        s6.a aVar = oVar.f18294g;
        x xVar = new x(d0Var.f18243c, aVar.f18225e, aVar.f18226f, d0Var.c(), e.a(aVar.f18223c != null ? 4 : 1), oVar.f18298k);
        Context context = oVar.f18288a;
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        z zVar = new z(e.l(context));
        Context context2 = oVar.f18288a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        e.a aVar2 = e.a.UNKNOWN;
        String str6 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str6)) {
            e.a aVar3 = (e.a) e.a.f18250t.get(str6.toLowerCase(locale));
            if (aVar3 != null) {
                aVar2 = aVar3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = aVar2.ordinal();
        String str7 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long i10 = e.i();
        boolean k10 = e.k(context2);
        int e10 = e.e(context2);
        String str8 = Build.MANUFACTURER;
        String str9 = Build.PRODUCT;
        oVar.f18297j.d(str3, format, currentTimeMillis, new w(xVar, zVar, new y(ordinal, availableProcessors, i10, blockCount, k10, e10)));
        oVar.f18296i.a(str3);
        j0 j0Var = oVar.f18300m;
        w wVar = j0Var.f18268a;
        Objects.requireNonNull(wVar);
        Charset charset = a0.f19269a;
        b.a aVar4 = new b.a();
        aVar4.f19278a = "18.2.3";
        String str10 = wVar.f18334c.f18221a;
        Objects.requireNonNull(str10, "Null gmpAppId");
        aVar4.f19279b = str10;
        String c11 = wVar.f18333b.c();
        Objects.requireNonNull(c11, "Null installationUuid");
        aVar4.f19281d = c11;
        String str11 = wVar.f18334c.f18225e;
        Objects.requireNonNull(str11, "Null buildVersion");
        aVar4.f19282e = str11;
        String str12 = wVar.f18334c.f18226f;
        Objects.requireNonNull(str12, "Null displayVersion");
        aVar4.f19283f = str12;
        aVar4.f19280c = 4;
        g.b bVar = new g.b();
        bVar.b(false);
        bVar.f19324c = Long.valueOf(currentTimeMillis);
        Objects.requireNonNull(str3, "Null identifier");
        bVar.f19323b = str3;
        String str13 = w.f18331f;
        Objects.requireNonNull(str13, "Null generator");
        bVar.f19322a = str13;
        String str14 = wVar.f18333b.f18243c;
        Objects.requireNonNull(str14, "Null identifier");
        String str15 = wVar.f18334c.f18225e;
        Objects.requireNonNull(str15, "Null version");
        String str16 = wVar.f18334c.f18226f;
        String c12 = wVar.f18333b.c();
        String a10 = ((c7.a) wVar.f18334c.f18227g).a();
        if (a10 != null) {
            str = a10;
            str2 = "Unity";
        } else {
            str2 = null;
            str = null;
        }
        bVar.f19327f = new u6.h(str14, str15, str16, c12, str2, str);
        u.a aVar5 = new u.a();
        aVar5.f19440a = 3;
        aVar5.f19441b = str4;
        aVar5.f19442c = str5;
        aVar5.f19443d = Boolean.valueOf(e.l(wVar.f18332a));
        bVar.f19329h = aVar5.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i11 = 7;
        if (!TextUtils.isEmpty(str6) && (num = (Integer) w.f18330e.get(str6.toLowerCase(locale))) != null) {
            i11 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long i12 = e.i();
        boolean k11 = e.k(wVar.f18332a);
        int e11 = e.e(wVar.f18332a);
        j.a aVar6 = new j.a();
        aVar6.f19349a = Integer.valueOf(i11);
        aVar6.f19350b = str7;
        aVar6.f19351c = Integer.valueOf(availableProcessors2);
        aVar6.f19352d = Long.valueOf(i12);
        aVar6.f19353e = Long.valueOf(statFs2.getBlockCount() * statFs2.getBlockSize());
        aVar6.f19354f = Boolean.valueOf(k11);
        aVar6.f19355g = Integer.valueOf(e11);
        aVar6.f19356h = str8;
        aVar6.f19357i = str9;
        bVar.f19330i = aVar6.a();
        bVar.f19332k = 3;
        aVar4.f19284g = bVar.a();
        a0 a11 = aVar4.a();
        x6.g gVar = j0Var.f18269b;
        Objects.requireNonNull(gVar);
        a0.e eVar = ((u6.b) a11).f19276h;
        if (eVar == null) {
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                return;
            }
            Log.d("FirebaseCrashlytics", "Could not get session for report", null);
            return;
        }
        String g10 = eVar.g();
        try {
            File e12 = gVar.e(g10);
            x6.g.g(e12);
            x6.g.j(new File(e12, "report"), x6.g.f20058i.h(a11));
            File file = new File(e12, "start-time");
            long i13 = eVar.i();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), x6.g.f20056g);
            outputStreamWriter.write("");
            file.setLastModified(i13 * 1000);
            outputStreamWriter.close();
        } catch (IOException e13) {
            String c13 = d7.a.c("Could not persist report for session ", g10);
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                return;
            }
            Log.d("FirebaseCrashlytics", c13, e13);
        }
    }

    public static i b(o oVar) {
        boolean z10;
        i iVar;
        Objects.requireNonNull(oVar);
        ArrayList arrayList = new ArrayList();
        File[] listFiles = oVar.g().listFiles(h.f18262a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        for (File file : listFiles) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    iVar = l.e(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    iVar = l.c(new ScheduledThreadPoolExecutor(1), new i(oVar, parseLong));
                }
                arrayList.add(iVar);
            } catch (NumberFormatException unused2) {
                StringBuilder c10 = androidx.activity.result.a.c("Could not parse app exception timestamp from file ");
                c10.append(file.getName());
                Log.w("FirebaseCrashlytics", c10.toString(), null);
            }
            file.delete();
        }
        return l.f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r21, z6.c r22) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.o.c(boolean, z6.c):void");
    }

    public final void d(long j3) {
        try {
            File g10 = g();
            new File(g10, ".ae" + j3).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
    }

    public final boolean e(c cVar) {
        this.f18291d.a();
        y yVar = this.f18301n;
        if (yVar != null && yVar.f18340e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, cVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String f() {
        ArrayList arrayList = (ArrayList) this.f18300m.e();
        if (!arrayList.isEmpty()) {
            return (String) arrayList.get(0);
        }
        return null;
    }

    public final File g() {
        return this.f18293f.a();
    }

    public final i<Void> h(i<a7.a> iVar) {
        i iVar2;
        b0<Void> b0Var;
        if (!(!((ArrayList) this.f18300m.f18269b.b()).isEmpty())) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            this.f18302o.d(Boolean.FALSE);
            return l.e(null);
        }
        d dVar = d.f4460v;
        dVar.m("Crash reports are available to be sent.");
        if (this.f18289b.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            this.f18302o.d(Boolean.FALSE);
            iVar2 = l.e(Boolean.TRUE);
        } else {
            dVar.d("Automatic data collection is disabled.");
            dVar.m("Notifying that unsent reports are available.");
            this.f18302o.d(Boolean.TRUE);
            z zVar = this.f18289b;
            synchronized (zVar.f18342b) {
                b0Var = zVar.f18343c.f2776a;
            }
            i<TContinuationResult> o10 = b0Var.o(new ca.d());
            dVar.d("Waiting for send/deleteUnsentReports to be called.");
            b0<Boolean> b0Var2 = this.p.f2776a;
            ExecutorService executorService = l0.f18283a;
            c5.j jVar = new c5.j();
            g1.y yVar = new g1.y(jVar);
            o10.e(yVar);
            b0Var2.e(yVar);
            iVar2 = jVar.f2776a;
        }
        return iVar2.o(new a(iVar));
    }
}
