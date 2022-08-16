package p9;

import androidx.activity.result.a;
import com.raouf.routerchef.resModels.LineInfo;
import r8.b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public int f17001a;

    /* renamed from: b */
    public String f17002b;

    /* renamed from: c */
    public long f17003c;

    /* renamed from: d */
    public String f17004d;

    /* renamed from: e */
    public String f17005e;

    /* renamed from: f */
    public String f17006f;

    /* renamed from: g */
    public String f17007g;

    /* renamed from: h */
    public String f17008h;

    /* renamed from: i */
    public String f17009i;

    /* renamed from: j */
    public String f17010j;

    /* renamed from: k */
    public String f17011k;

    /* renamed from: l */
    public String f17012l;

    /* renamed from: m */
    public String f17013m;

    public d() {
    }

    public d(String str, long j3, LineInfo lineInfo) {
        this.f17002b = str;
        this.f17003c = j3;
        this.f17004d = lineInfo.modType;
        this.f17005e = lineInfo.lineRate;
        this.f17006f = lineInfo.maxRate;
        this.f17007g = lineInfo.noise;
        this.f17008h = lineInfo.chanType;
        this.f17009i = lineInfo.depth;
        this.f17010j = lineInfo.delay;
        this.f17011k = lineInfo.crc;
        this.f17012l = lineInfo.fec;
        this.f17013m = lineInfo.upTime;
    }

    public final String toString() {
        StringBuilder c10 = a.c("ID : ");
        c10.append(this.f17001a);
        c10.append(" , Time : ");
        c10.append(b.n(this.f17003c));
        c10.append(", ModType : ");
        c10.append(this.f17004d);
        c10.append(", Line Rate : ");
        c10.append(this.f17005e);
        return c10.toString();
    }
}
