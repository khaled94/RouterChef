package s6;

import android.content.Context;
import b7.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import m4.ho0;
import u6.a0;
import u6.b0;
import u6.n;
import u6.o;
import u6.p;
import u6.q;
import u6.r;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: e */
    public static final Map<String, Integer> f18330e;

    /* renamed from: f */
    public static final String f18331f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.3");

    /* renamed from: a */
    public final Context f18332a;

    /* renamed from: b */
    public final d0 f18333b;

    /* renamed from: c */
    public final a f18334c;

    /* renamed from: d */
    public final d f18335d;

    static {
        HashMap hashMap = new HashMap();
        f18330e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public w(Context context, d0 d0Var, a aVar, d dVar) {
        this.f18332a = context;
        this.f18333b = d0Var;
        this.f18334c = aVar;
        this.f18335d = dVar;
    }

    public final b0<a0.e.d.a.b.AbstractC0130a> a() {
        n.a aVar = new n.a();
        aVar.f19387a = 0L;
        aVar.f19388b = 0L;
        String str = this.f18334c.f18224d;
        Objects.requireNonNull(str, "Null name");
        aVar.f19389c = str;
        aVar.f19390d = this.f18334c.f18222b;
        return new b0<>(Arrays.asList(aVar.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u6.a0.e.d.c b(int r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.w.b(int):u6.a0$e$d$c");
    }

    public final a0.e.d.a.b.AbstractC0132b c(ho0 ho0Var, int i10) {
        String str = (String) ho0Var.f9393b;
        String str2 = (String) ho0Var.f9392a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) ho0Var.f9394c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ho0 ho0Var2 = (ho0) ho0Var.f9395d;
        if (i10 >= 8) {
            ho0 ho0Var3 = ho0Var2;
            while (ho0Var3 != null) {
                ho0Var3 = (ho0) ho0Var3.f9395d;
                i11++;
            }
        }
        o.b bVar = new o.b();
        Objects.requireNonNull(str, "Null type");
        bVar.f19396a = str;
        bVar.f19397b = str2;
        bVar.f19398c = new b0<>(d(stackTraceElementArr, 4));
        bVar.f19400e = Integer.valueOf(i11);
        if (ho0Var2 != null && i11 == 0) {
            bVar.f19399d = c(ho0Var2, i10 + 1);
        }
        return bVar.a();
    }

    public final b0<a0.e.d.a.b.AbstractC0135d.AbstractC0137b> d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            r.a aVar = new r.a();
            aVar.f19422e = Integer.valueOf(i10);
            long j3 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j3 = stackTraceElement.getLineNumber();
            }
            aVar.f19418a = Long.valueOf(max);
            Objects.requireNonNull(str, "Null symbol");
            aVar.f19419b = str;
            aVar.f19420c = fileName;
            aVar.f19421d = Long.valueOf(j3);
            arrayList.add(aVar.a());
        }
        return new b0<>(arrayList);
    }

    public final a0.e.d.a.b.c e() {
        p.a aVar = new p.a();
        aVar.f19404a = "0";
        aVar.f19405b = "0";
        aVar.f19406c = 0L;
        return aVar.a();
    }

    public final a0.e.d.a.b.AbstractC0135d f(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        q.b bVar = new q.b();
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        bVar.f19410a = name;
        bVar.f19411b = Integer.valueOf(i10);
        bVar.f19412c = new b0<>(d(stackTraceElementArr, i10));
        return bVar.a();
    }
}
