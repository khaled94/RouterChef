package m4;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p1.r;
import z3.l;

/* loaded from: classes.dex */
public final class rm2 implements jm2, i01 {
    public static final iw1<String, Integer> E;
    public static final gw1<Long> F = (gx1) gw1.u(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
    public static final gw1<Long> G = (gx1) gw1.u(1700000L, 820000L, 450000L, 180000L, 130000L);
    public static final gw1<Long> H = (gx1) gw1.u(2300000L, 1300000L, 1000000L, 820000L, 570000L);
    public static final gw1<Long> I = (gx1) gw1.u(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
    public static final gw1<Long> J = (gx1) gw1.u(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);
    public static final gw1<Long> K = (gx1) gw1.u(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);
    public static rm2 L;
    public long A;
    public long B;
    public long C;
    public long D;

    /* renamed from: s */
    public final kw1<Integer, Long> f13395s;

    /* renamed from: t */
    public final hm2 f13396t = new hm2();

    /* renamed from: u */
    public final in2 f13397u = new in2();

    /* renamed from: v */
    public final boolean f13398v = true;

    /* renamed from: w */
    public int f13399w;

    /* renamed from: x */
    public long f13400x;
    public long y;

    /* renamed from: z */
    public int f13401z;

    static {
        hw1 hw1Var = new hw1();
        hw1Var.a("AD", 1, 2, 0, 0, 2, 2);
        hw1Var.a("AE", 1, 4, 4, 4, 3, 2);
        hw1Var.a("AF", 4, 4, 4, 4, 2, 2);
        hw1Var.a("AG", 2, 3, 1, 2, 2, 2);
        hw1Var.a("AI", 1, 2, 2, 2, 2, 2);
        hw1Var.a("AL", 1, 2, 0, 1, 2, 2);
        hw1Var.a("AM", 2, 3, 2, 4, 2, 2);
        hw1Var.a("AO", 3, 4, 3, 2, 2, 2);
        hw1Var.a("AQ", 4, 2, 2, 2, 2, 2);
        hw1Var.a("AR", 2, 4, 1, 1, 2, 2);
        hw1Var.a("AS", 2, 2, 2, 3, 2, 2);
        hw1Var.a("AT", 0, 0, 0, 0, 0, 2);
        hw1Var.a("AU", 0, 1, 0, 1, 2, 2);
        hw1Var.a("AW", 1, 2, 4, 4, 2, 2);
        hw1Var.a("AX", 0, 2, 2, 2, 2, 2);
        hw1Var.a("AZ", 3, 2, 4, 4, 2, 2);
        hw1Var.a("BA", 1, 2, 0, 1, 2, 2);
        hw1Var.a("BB", 0, 2, 0, 0, 2, 2);
        hw1Var.a("BD", 2, 1, 3, 3, 2, 2);
        hw1Var.a("BE", 0, 0, 3, 3, 2, 2);
        hw1Var.a("BF", 4, 3, 4, 3, 2, 2);
        hw1Var.a("BG", 0, 0, 0, 0, 1, 2);
        hw1Var.a("BH", 1, 2, 2, 4, 4, 2);
        hw1Var.a("BI", 4, 3, 4, 4, 2, 2);
        hw1Var.a("BJ", 4, 4, 3, 4, 2, 2);
        hw1Var.a("BL", 1, 2, 2, 2, 2, 2);
        hw1Var.a("BM", 1, 2, 0, 0, 2, 2);
        hw1Var.a("BN", 3, 2, 1, 1, 2, 2);
        hw1Var.a("BO", 1, 3, 3, 2, 2, 2);
        hw1Var.a("BQ", 1, 2, 2, 0, 2, 2);
        hw1Var.a("BR", 2, 3, 2, 2, 2, 2);
        hw1Var.a("BS", 4, 2, 2, 3, 2, 2);
        hw1Var.a("BT", 3, 1, 3, 2, 2, 2);
        hw1Var.a("BW", 3, 4, 1, 0, 2, 2);
        hw1Var.a("BY", 0, 1, 1, 3, 2, 2);
        hw1Var.a("BZ", 2, 4, 2, 2, 2, 2);
        hw1Var.a("CA", 0, 2, 1, 2, 4, 1);
        hw1Var.a("CD", 4, 2, 3, 1, 2, 2);
        hw1Var.a("CF", 4, 2, 3, 2, 2, 2);
        hw1Var.a("CG", 2, 4, 3, 4, 2, 2);
        hw1Var.a("CH", 0, 0, 0, 0, 0, 2);
        hw1Var.a("CI", 3, 3, 3, 4, 2, 2);
        hw1Var.a("CK", 2, 2, 2, 1, 2, 2);
        hw1Var.a("CL", 1, 1, 2, 2, 3, 2);
        hw1Var.a("CM", 3, 4, 3, 2, 2, 2);
        hw1Var.a("CN", 2, 0, 2, 2, 3, 1);
        hw1Var.a("CO", 2, 2, 4, 2, 2, 2);
        hw1Var.a("CR", 2, 2, 4, 4, 2, 2);
        hw1Var.a("CU", 4, 4, 3, 2, 2, 2);
        hw1Var.a("CV", 2, 3, 1, 0, 2, 2);
        hw1Var.a("CW", 2, 2, 0, 0, 2, 2);
        hw1Var.a("CX", 1, 2, 2, 2, 2, 2);
        hw1Var.a("CY", 1, 0, 0, 0, 1, 2);
        hw1Var.a("CZ", 0, 0, 0, 0, 1, 2);
        hw1Var.a("DE", 0, 0, 2, 2, 1, 2);
        hw1Var.a("DJ", 4, 1, 4, 4, 2, 2);
        hw1Var.a("DK", 0, 0, 1, 0, 0, 2);
        hw1Var.a("DM", 1, 2, 2, 2, 2, 2);
        hw1Var.a("DO", 3, 4, 4, 4, 2, 2);
        hw1Var.a("DZ", 4, 3, 4, 4, 2, 2);
        hw1Var.a("EC", 2, 4, 2, 1, 2, 2);
        hw1Var.a("EE", 0, 0, 0, 0, 2, 2);
        hw1Var.a("EG", 3, 4, 2, 3, 2, 2);
        hw1Var.a("EH", 2, 2, 2, 2, 2, 2);
        hw1Var.a("ER", 4, 2, 2, 2, 2, 2);
        hw1Var.a("ES", 0, 1, 1, 1, 2, 2);
        hw1Var.a("ET", 4, 4, 3, 1, 2, 2);
        hw1Var.a("FI", 0, 0, 0, 1, 0, 2);
        hw1Var.a("FJ", 3, 1, 3, 3, 2, 2);
        hw1Var.a("FK", 3, 2, 2, 2, 2, 2);
        hw1Var.a("FM", 3, 2, 4, 2, 2, 2);
        hw1Var.a("FO", 0, 2, 0, 0, 2, 2);
        hw1Var.a("FR", 1, 1, 2, 1, 1, 1);
        hw1Var.a("GA", 2, 3, 1, 1, 2, 2);
        hw1Var.a("GB", 0, 0, 1, 1, 2, 3);
        hw1Var.a("GD", 1, 2, 2, 2, 2, 2);
        hw1Var.a("GE", 1, 1, 1, 3, 2, 2);
        hw1Var.a("GF", 2, 1, 2, 3, 2, 2);
        hw1Var.a("GG", 0, 2, 0, 0, 2, 2);
        hw1Var.a("GH", 3, 2, 3, 2, 2, 2);
        hw1Var.a("GI", 0, 2, 2, 2, 2, 2);
        hw1Var.a("GL", 1, 2, 0, 0, 2, 2);
        hw1Var.a("GM", 4, 2, 2, 4, 2, 2);
        hw1Var.a("GN", 4, 3, 4, 2, 2, 2);
        hw1Var.a("GP", 2, 1, 2, 3, 2, 2);
        hw1Var.a("GQ", 4, 2, 3, 4, 2, 2);
        hw1Var.a("GR", 1, 0, 0, 0, 2, 2);
        hw1Var.a("GT", 2, 3, 2, 1, 2, 2);
        hw1Var.a("GU", 1, 2, 4, 4, 2, 2);
        hw1Var.a("GW", 3, 4, 3, 3, 2, 2);
        hw1Var.a("GY", 3, 4, 1, 0, 2, 2);
        hw1Var.a("HK", 0, 1, 2, 3, 2, 0);
        hw1Var.a("HN", 3, 2, 3, 3, 2, 2);
        hw1Var.a("HR", 1, 0, 0, 0, 2, 2);
        hw1Var.a("HT", 4, 4, 4, 4, 2, 2);
        hw1Var.a("HU", 0, 0, 0, 1, 3, 2);
        hw1Var.a("ID", 3, 2, 3, 3, 3, 2);
        hw1Var.a("IE", 0, 1, 1, 1, 2, 2);
        hw1Var.a("IL", 1, 1, 2, 3, 4, 2);
        hw1Var.a("IM", 0, 2, 0, 1, 2, 2);
        hw1Var.a("IN", 1, 1, 3, 2, 4, 3);
        hw1Var.a("IO", 4, 2, 2, 2, 2, 2);
        hw1Var.a("IQ", 3, 3, 3, 3, 2, 2);
        hw1Var.a("IR", 3, 0, 1, 1, 3, 0);
        hw1Var.a("IS", 0, 0, 0, 0, 0, 2);
        hw1Var.a("IT", 0, 1, 0, 1, 1, 2);
        hw1Var.a("JE", 3, 2, 1, 2, 2, 2);
        hw1Var.a("JM", 3, 4, 4, 4, 2, 2);
        hw1Var.a("JO", 1, 0, 0, 1, 2, 2);
        hw1Var.a("JP", 0, 1, 0, 1, 1, 1);
        hw1Var.a("KE", 3, 3, 2, 2, 2, 2);
        hw1Var.a("KG", 2, 1, 1, 1, 2, 2);
        hw1Var.a("KH", 1, 1, 4, 2, 2, 2);
        hw1Var.a("KI", 4, 2, 4, 3, 2, 2);
        hw1Var.a("KM", 4, 2, 4, 3, 2, 2);
        hw1Var.a("KN", 2, 2, 2, 2, 2, 2);
        hw1Var.a("KP", 3, 2, 2, 2, 2, 2);
        hw1Var.a("KR", 0, 0, 1, 3, 4, 4);
        hw1Var.a("KW", 1, 1, 0, 0, 0, 2);
        hw1Var.a("KY", 1, 2, 0, 1, 2, 2);
        hw1Var.a("KZ", 1, 1, 2, 2, 2, 2);
        hw1Var.a("LA", 2, 2, 1, 2, 2, 2);
        hw1Var.a("LB", 3, 2, 1, 4, 2, 2);
        hw1Var.a("LC", 1, 2, 0, 0, 2, 2);
        hw1Var.a("LI", 0, 2, 2, 2, 2, 2);
        hw1Var.a("LK", 3, 1, 3, 4, 4, 2);
        hw1Var.a("LR", 3, 4, 4, 3, 2, 2);
        hw1Var.a("LS", 3, 3, 4, 3, 2, 2);
        hw1Var.a("LT", 0, 0, 0, 0, 2, 2);
        hw1Var.a("LU", 1, 0, 2, 2, 2, 2);
        hw1Var.a("LV", 0, 0, 0, 0, 2, 2);
        hw1Var.a("LY", 4, 2, 4, 3, 2, 2);
        hw1Var.a("MA", 3, 2, 2, 2, 2, 2);
        hw1Var.a("MC", 0, 2, 2, 0, 2, 2);
        hw1Var.a("MD", 1, 0, 0, 0, 2, 2);
        hw1Var.a("ME", 1, 0, 0, 1, 2, 2);
        hw1Var.a("MF", 1, 2, 1, 0, 2, 2);
        hw1Var.a("MG", 3, 4, 2, 2, 2, 2);
        hw1Var.a("MH", 3, 2, 2, 4, 2, 2);
        hw1Var.a("MK", 1, 0, 0, 0, 2, 2);
        hw1Var.a("ML", 4, 3, 3, 1, 2, 2);
        hw1Var.a("MM", 2, 4, 3, 3, 2, 2);
        hw1Var.a("MN", 2, 0, 1, 2, 2, 2);
        hw1Var.a("MO", 0, 2, 4, 4, 2, 2);
        hw1Var.a("MP", 0, 2, 2, 2, 2, 2);
        hw1Var.a("MQ", 2, 1, 2, 3, 2, 2);
        hw1Var.a("MR", 4, 1, 3, 4, 2, 2);
        hw1Var.a("MS", 1, 2, 2, 2, 2, 2);
        hw1Var.a("MT", 0, 0, 0, 0, 2, 2);
        hw1Var.a("MU", 3, 1, 1, 2, 2, 2);
        hw1Var.a("MV", 3, 4, 1, 4, 2, 2);
        hw1Var.a("MW", 4, 2, 1, 0, 2, 2);
        hw1Var.a("MX", 2, 4, 3, 4, 2, 2);
        hw1Var.a("MY", 2, 1, 3, 3, 2, 2);
        hw1Var.a("MZ", 3, 2, 2, 2, 2, 2);
        hw1Var.a("NA", 4, 3, 2, 2, 2, 2);
        hw1Var.a("NC", 3, 2, 4, 4, 2, 2);
        hw1Var.a("NE", 4, 4, 4, 4, 2, 2);
        hw1Var.a("NF", 2, 2, 2, 2, 2, 2);
        hw1Var.a("NG", 3, 4, 1, 1, 2, 2);
        hw1Var.a("NI", 2, 3, 4, 3, 2, 2);
        hw1Var.a("NL", 0, 0, 3, 2, 0, 4);
        hw1Var.a("NO", 0, 0, 2, 0, 0, 2);
        hw1Var.a("NP", 2, 1, 4, 3, 2, 2);
        hw1Var.a("NR", 3, 2, 2, 0, 2, 2);
        hw1Var.a("NU", 4, 2, 2, 2, 2, 2);
        hw1Var.a("NZ", 1, 0, 1, 2, 4, 2);
        hw1Var.a("OM", 2, 3, 1, 3, 4, 2);
        hw1Var.a("PA", 1, 3, 3, 3, 2, 2);
        hw1Var.a("PE", 2, 3, 4, 4, 4, 2);
        hw1Var.a("PF", 2, 3, 3, 1, 2, 2);
        hw1Var.a("PG", 4, 4, 3, 2, 2, 2);
        hw1Var.a("PH", 2, 2, 3, 3, 3, 2);
        hw1Var.a("PK", 3, 2, 3, 3, 2, 2);
        hw1Var.a("PL", 1, 1, 2, 2, 3, 2);
        hw1Var.a("PM", 0, 2, 2, 2, 2, 2);
        hw1Var.a("PR", 2, 3, 2, 2, 3, 3);
        hw1Var.a("PS", 3, 4, 1, 2, 2, 2);
        hw1Var.a("PT", 0, 1, 0, 0, 2, 2);
        hw1Var.a("PW", 2, 2, 4, 1, 2, 2);
        hw1Var.a("PY", 2, 2, 3, 2, 2, 2);
        hw1Var.a("QA", 2, 4, 2, 4, 4, 2);
        hw1Var.a("RE", 1, 1, 1, 2, 2, 2);
        hw1Var.a("RO", 0, 0, 1, 1, 1, 2);
        hw1Var.a("RS", 1, 0, 0, 0, 2, 2);
        hw1Var.a("RU", 0, 0, 0, 1, 2, 2);
        hw1Var.a("RW", 3, 4, 3, 0, 2, 2);
        hw1Var.a("SA", 2, 2, 1, 1, 2, 2);
        hw1Var.a("SB", 4, 2, 4, 3, 2, 2);
        hw1Var.a("SC", 4, 3, 0, 2, 2, 2);
        hw1Var.a("SD", 4, 4, 4, 4, 2, 2);
        hw1Var.a("SE", 0, 0, 0, 0, 0, 2);
        hw1Var.a("SG", 1, 1, 2, 3, 1, 4);
        hw1Var.a("SH", 4, 2, 2, 2, 2, 2);
        hw1Var.a("SI", 0, 0, 0, 0, 1, 2);
        hw1Var.a("SJ", 0, 2, 2, 2, 2, 2);
        hw1Var.a("SK", 0, 0, 0, 0, 0, 2);
        hw1Var.a("SL", 4, 3, 4, 1, 2, 2);
        hw1Var.a("SM", 0, 2, 2, 2, 2, 2);
        hw1Var.a("SN", 4, 4, 4, 4, 2, 2);
        hw1Var.a("SO", 3, 2, 3, 3, 2, 2);
        hw1Var.a("SR", 2, 3, 2, 2, 2, 2);
        hw1Var.a("SS", 4, 2, 2, 2, 2, 2);
        hw1Var.a("ST", 3, 2, 2, 2, 2, 2);
        hw1Var.a("SV", 2, 2, 3, 3, 2, 2);
        hw1Var.a("SX", 2, 2, 1, 0, 2, 2);
        hw1Var.a("SY", 4, 3, 4, 4, 2, 2);
        hw1Var.a("SZ", 4, 3, 2, 4, 2, 2);
        hw1Var.a("TC", 2, 2, 1, 0, 2, 2);
        hw1Var.a("TD", 4, 4, 4, 4, 2, 2);
        hw1Var.a("TG", 3, 3, 2, 0, 2, 2);
        hw1Var.a("TH", 0, 3, 2, 3, 3, 0);
        hw1Var.a("TJ", 4, 2, 4, 4, 2, 2);
        hw1Var.a("TL", 4, 3, 4, 4, 2, 2);
        hw1Var.a("TM", 4, 2, 4, 2, 2, 2);
        hw1Var.a("TN", 2, 2, 1, 1, 2, 2);
        hw1Var.a("TO", 4, 2, 3, 3, 2, 2);
        hw1Var.a("TR", 1, 1, 0, 1, 2, 2);
        hw1Var.a("TT", 1, 4, 1, 1, 2, 2);
        hw1Var.a("TV", 4, 2, 2, 2, 2, 2);
        hw1Var.a("TW", 0, 0, 0, 0, 0, 0);
        hw1Var.a("TZ", 3, 4, 3, 3, 2, 2);
        hw1Var.a("UA", 0, 3, 1, 1, 2, 2);
        hw1Var.a("UG", 3, 3, 3, 3, 2, 2);
        hw1Var.a("US", 1, 1, 2, 2, 3, 2);
        hw1Var.a("UY", 2, 2, 1, 2, 2, 2);
        hw1Var.a("UZ", 2, 2, 3, 4, 2, 2);
        hw1Var.a("VC", 1, 2, 2, 2, 2, 2);
        hw1Var.a("VE", 4, 4, 4, 4, 2, 2);
        hw1Var.a("VG", 2, 2, 1, 1, 2, 2);
        hw1Var.a("VI", 1, 2, 1, 3, 2, 2);
        hw1Var.a("VN", 0, 3, 3, 4, 2, 2);
        hw1Var.a("VU", 4, 2, 2, 1, 2, 2);
        hw1Var.a("WF", 4, 2, 2, 4, 2, 2);
        hw1Var.a("WS", 3, 1, 2, 1, 2, 2);
        hw1Var.a("XK", 1, 1, 1, 1, 2, 2);
        hw1Var.a("YE", 4, 4, 4, 4, 2, 2);
        hw1Var.a("YT", 4, 1, 1, 1, 2, 2);
        hw1Var.a("ZA", 3, 3, 1, 1, 1, 2);
        hw1Var.a("ZM", 3, 3, 4, 2, 2, 2);
        hw1Var.a("ZW", 3, 2, 4, 3, 2, 2);
        E = hw1Var.b();
    }

    public rm2(Context context, Map map) {
        al1 al1Var;
        int i10;
        this.f13395s = (lx1) kw1.c(map);
        if (context != null) {
            synchronized (al1.class) {
                if (al1.f6185e == null) {
                    al1.f6185e = new al1(context);
                }
                al1Var = al1.f6185e;
            }
            synchronized (al1Var.f6188c) {
                i10 = al1Var.f6189d;
            }
            this.f13401z = i10;
            this.C = b(i10);
            qm2 qm2Var = new qm2(this);
            Iterator<WeakReference<qm2>> it = al1Var.f6187b.iterator();
            while (it.hasNext()) {
                WeakReference<qm2> next = it.next();
                if (next.get() == null) {
                    al1Var.f6187b.remove(next);
                }
            }
            al1Var.f6187b.add(new WeakReference<>(qm2Var));
            al1Var.f6186a.post(new l(al1Var, qm2Var));
            return;
        }
        this.f13401z = 0;
        this.C = b(0);
    }

    public static void a(rm2 rm2Var, int i10) {
        synchronized (rm2Var) {
            int i11 = rm2Var.f13401z;
            if ((i11 == 0 || rm2Var.f13398v) && i11 != i10) {
                rm2Var.f13401z = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    rm2Var.C = rm2Var.b(i10);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    rm2Var.d(rm2Var.f13399w > 0 ? (int) (elapsedRealtime - rm2Var.f13400x) : 0, rm2Var.y, rm2Var.C);
                    rm2Var.f13400x = elapsedRealtime;
                    rm2Var.y = 0L;
                    rm2Var.B = 0L;
                    rm2Var.A = 0L;
                    in2 in2Var = rm2Var.f13397u;
                    in2Var.f9702a.clear();
                    in2Var.f9704c = -1;
                    in2Var.f9705d = 0;
                    in2Var.f9706e = 0;
                }
            }
        }
    }

    public static boolean e(gs0 gs0Var, boolean z10) {
        return z10 && !gs0Var.a(8);
    }

    public final long b(int i10) {
        Long l10 = this.f13395s.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f13395s.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    @Override // m4.i01
    public final void c() {
    }

    public final void d(int i10, final long j3, final long j10) {
        if (i10 == 0) {
            if (j3 == 0 && j10 == this.D) {
                return;
            }
            i10 = 0;
        }
        this.D = j10;
        Iterator<gm2> it = this.f13396t.f9380a.iterator();
        while (it.hasNext()) {
            final gm2 next = it.next();
            if (!next.f8972c) {
                final int i11 = i10;
                next.f8970a.post(new Runnable() { // from class: m4.fm2
                    @Override // java.lang.Runnable
                    public final void run() {
                        uj2 uj2Var;
                        Object obj;
                        Object next2;
                        eg2 eg2Var = (eg2) gm2.this.f8971b;
                        dg2 dg2Var = eg2Var.f7896u;
                        if (dg2Var.f7393b.isEmpty()) {
                            uj2Var = null;
                        } else {
                            gw1<uj2> gw1Var = dg2Var.f7393b;
                            if (!(gw1Var instanceof List)) {
                                pu1 listIterator = gw1Var.listIterator(0);
                                do {
                                    next2 = listIterator.next();
                                } while (listIterator.hasNext());
                                obj = next2;
                            } else if (gw1Var.isEmpty()) {
                                throw new NoSuchElementException();
                            } else {
                                obj = gw1Var.get(gw1Var.size() - 1);
                            }
                            uj2Var = (uj2) obj;
                        }
                        fg2 J2 = eg2Var.J(uj2Var);
                        eg2Var.I(J2, 1006, new r(J2));
                    }
                });
            }
        }
    }

    @Override // m4.i01
    public final synchronized void h(kq0 kq0Var, gs0 gs0Var, boolean z10) {
        if (!e(gs0Var, z10)) {
            return;
        }
        if (this.f13399w == 0) {
            this.f13400x = SystemClock.elapsedRealtime();
        }
        this.f13399w++;
    }

    @Override // m4.i01
    public final synchronized void k(gs0 gs0Var, boolean z10, int i10) {
        if (!e(gs0Var, z10)) {
            return;
        }
        this.y += i10;
    }

    @Override // m4.i01
    public final synchronized void m(gs0 gs0Var, boolean z10) {
        if (!e(gs0Var, z10)) {
            return;
        }
        r01.h(this.f13399w > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (int) (elapsedRealtime - this.f13400x);
        this.A += i10;
        long j3 = this.B;
        long j10 = this.y;
        this.B = j3 + j10;
        if (i10 > 0) {
            this.f13397u.b((int) Math.sqrt(j10), (((float) j10) * 8000.0f) / i10);
            if (this.A >= 2000 || this.B >= 524288) {
                this.C = this.f13397u.a();
            }
            d(i10, this.y, this.C);
            this.f13400x = elapsedRealtime;
            this.y = 0L;
        }
        this.f13399w--;
    }
}
