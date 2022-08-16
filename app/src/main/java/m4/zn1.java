package m4;

import java.util.Objects;
import l3.s;

/* loaded from: classes.dex */
public final class zn1 {

    /* renamed from: a */
    public final long f16289a;

    /* renamed from: c */
    public long f16291c;

    /* renamed from: b */
    public final yn1 f16290b = new yn1();

    /* renamed from: d */
    public int f16292d = 0;

    /* renamed from: e */
    public int f16293e = 0;

    /* renamed from: f */
    public int f16294f = 0;

    public zn1() {
        Objects.requireNonNull(s.B.f5796j);
        long currentTimeMillis = System.currentTimeMillis();
        this.f16289a = currentTimeMillis;
        this.f16291c = currentTimeMillis;
    }

    public final void a() {
        Objects.requireNonNull(s.B.f5796j);
        this.f16291c = System.currentTimeMillis();
        this.f16292d++;
    }
}
