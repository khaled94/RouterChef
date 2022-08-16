package m4;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.a;
import l3.l;
import l3.s;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ge0 {
    /* JADX WARN: Type inference failed for: r0v2, types: [m4.vd0, java.lang.Object] */
    public static final vd0 a(final Context context, final cf0 cf0Var, final String str, final boolean z10, final boolean z11, final w7 w7Var, final ys ysVar, final o90 o90Var, final l lVar, final a aVar, final wj wjVar, final cm1 cm1Var, final em1 em1Var) {
        es.c(context);
        try {
            nu1 nu1Var = new nu1() { // from class: m4.de0
                @Override // m4.nu1
                /* renamed from: zza */
                public final Object mo19zza() {
                    Context context2 = context;
                    cf0 cf0Var2 = cf0Var;
                    String str2 = str;
                    boolean z12 = z10;
                    boolean z13 = z11;
                    w7 w7Var2 = w7Var;
                    ys ysVar2 = ysVar;
                    o90 o90Var2 = o90Var;
                    l lVar2 = lVar;
                    a aVar2 = aVar;
                    wj wjVar2 = wjVar;
                    cm1 cm1Var2 = cm1Var;
                    em1 em1Var2 = em1Var;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = ke0.f10372s0;
                        he0 he0Var = new he0(new ke0(new bf0(context2), cf0Var2, str2, z12, w7Var2, ysVar2, o90Var2, lVar2, aVar2, wjVar2, cm1Var2, em1Var2));
                        Objects.requireNonNull(s.B.f5791e);
                        he0Var.setWebViewClient(new re0(he0Var, wjVar2, z13));
                        he0Var.setWebChromeClient(new ud0(he0Var));
                        return he0Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? mo19zza = nu1Var.mo19zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return mo19zza;
        } catch (Throwable th) {
            throw new fe0(th);
        }
    }
}
