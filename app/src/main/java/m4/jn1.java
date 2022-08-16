package m4;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;

/* loaded from: classes.dex */
public final class jn1 implements in1 {
    @GuardedBy("this")

    /* renamed from: a */
    public final ConcurrentHashMap<qn1, hn1> f10138a;

    /* renamed from: b */
    public final nn1 f10139b;

    /* renamed from: c */
    public final ln1 f10140c = new ln1();

    public jn1(nn1 nn1Var) {
        this.f10138a = new ConcurrentHashMap<>(nn1Var.f11870w);
        this.f10139b = nn1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (r5 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(m4.qn1 r11, m4.pn1<?, ?> r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.jn1.a(m4.qn1, m4.pn1):boolean");
    }

    public final void b() {
        ln1 ln1Var;
        zn1 zn1Var;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8115i4)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10139b.f11868u);
            sb.append(" PoolCollection");
            Objects.requireNonNull(this.f10140c);
            sb.append("\n\tPool does not exist: " + ln1Var.f10947d + "\n\tNew pools created: " + ln1Var.f10945b + "\n\tPools removed: " + ln1Var.f10946c + "\n\tEntries added: " + ln1Var.f10949f + "\n\tNo entries retrieved: " + ln1Var.f10948e + "\n");
            int i10 = 0;
            for (Map.Entry<qn1, hn1> entry : this.f10138a.entrySet()) {
                i10++;
                sb.append(i10);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i11 = 0; i11 < entry.getValue().a(); i11++) {
                    sb.append("[O]");
                }
                for (int a10 = entry.getValue().a(); a10 < this.f10139b.f11870w; a10++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                Objects.requireNonNull(entry.getValue().f9387d);
                sb.append("Created: " + zn1Var.f16289a + " Last accessed: " + zn1Var.f16291c + " Accesses: " + zn1Var.f16292d + "\nEntries retrieved: Valid: " + zn1Var.f16293e + " Stale: " + zn1Var.f16294f);
                sb.append("\n");
            }
            while (i10 < this.f10139b.f11869v) {
                i10++;
                sb.append(i10);
                sb.append(".\n");
            }
            g1.e(sb.toString());
        }
    }
}
