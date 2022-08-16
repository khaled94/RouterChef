package m4;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class qs {

    /* renamed from: b */
    public final Map<String, String> f12988b;

    /* renamed from: a */
    public final List<os> f12987a = new LinkedList();

    /* renamed from: c */
    public final Object f12989c = new Object();

    public qs(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f12988b = linkedHashMap;
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final os d() {
        Objects.requireNonNull(s.B.f5796j);
        return new os(SystemClock.elapsedRealtime(), null, null);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<m4.os>, java.util.LinkedList] */
    public final u8 a() {
        u8 u8Var;
        boolean booleanValue = ((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f12989c) {
            try {
                for (os osVar : this.f12987a) {
                    long j3 = osVar.f12283a;
                    String str = osVar.f12284b;
                    os osVar2 = osVar.f12285c;
                    if (osVar2 != null && j3 > 0) {
                        sb.append(str);
                        sb.append('.');
                        sb.append(j3 - osVar2.f12283a);
                        sb.append(',');
                        if (booleanValue) {
                            if (!hashMap.containsKey(Long.valueOf(osVar2.f12283a))) {
                                hashMap.put(Long.valueOf(osVar2.f12283a), new StringBuilder(str));
                            } else {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(osVar2.f12283a));
                                sb2.append('+');
                                sb2.append(str);
                            }
                        }
                    }
                }
                this.f12987a.clear();
                String str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long longValue = ((Long) entry.getKey()).longValue();
                        s sVar = s.B;
                        Objects.requireNonNull(sVar.f5796j);
                        long currentTimeMillis = System.currentTimeMillis();
                        Objects.requireNonNull(sVar.f5796j);
                        sb3.append((longValue - SystemClock.elapsedRealtime()) + currentTimeMillis);
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str2 = sb3.toString();
                }
                u8Var = new u8(sb.toString(), str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return u8Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, m4.ns>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    public final void b(String str, String str2) {
        hs b10;
        if (!TextUtils.isEmpty(str2) && (b10 = s.B.f5793g.b()) != null) {
            synchronized (this.f12989c) {
                ns nsVar = (ns) b10.f9436c.get(str);
                if (nsVar == null) {
                    nsVar = ns.f11909a;
                }
                ?? r22 = this.f12988b;
                r22.put(str, nsVar.a((String) r22.get(str), str2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<m4.os>, java.util.LinkedList] */
    public final void c(os osVar, long j3, String... strArr) {
        synchronized (this.f12989c) {
            for (int i10 = 0; i10 <= 0; i10++) {
                this.f12987a.add(new os(j3, strArr[i10], osVar));
            }
        }
    }
}
