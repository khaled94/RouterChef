package m4;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import n3.f0;
import q3.f;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class e00 {

    /* renamed from: b */
    public final Context f7677b;

    /* renamed from: c */
    public final String f7678c;

    /* renamed from: d */
    public final o90 f7679d;

    /* renamed from: e */
    public final f0<lz> f7680e;

    /* renamed from: f */
    public d00 f7681f;

    /* renamed from: a */
    public final Object f7676a = new Object();

    /* renamed from: g */
    public int f7682g = 1;

    public e00(Context context, o90 o90Var, String str) {
        f0<lz> f0Var = m00.f11061c;
        this.f7678c = str;
        this.f7677b = context.getApplicationContext();
        this.f7679d = o90Var;
        this.f7680e = f0Var;
    }

    public final a00 a() {
        synchronized (this.f7676a) {
            synchronized (this.f7676a) {
                d00 d00Var = this.f7681f;
                if (d00Var != null && this.f7682g == 0) {
                    d00Var.f(new tz(this), js.f10178t);
                }
            }
            d00 d00Var2 = this.f7681f;
            if (d00Var2 != null && d00Var2.c() != -1) {
                int i10 = this.f7682g;
                if (i10 == 0) {
                    return this.f7681f.g();
                } else if (i10 != 1) {
                    return this.f7681f.g();
                } else {
                    this.f7682g = 2;
                    b();
                    return this.f7681f.g();
                }
            }
            this.f7682g = 2;
            d00 b10 = b();
            this.f7681f = b10;
            return b10.g();
        }
    }

    public final d00 b() {
        d00 d00Var = new d00();
        u90.f14298e.execute(new vz(this, d00Var));
        d00Var.f(new f(this, d00Var), new zz(this, d00Var));
        return d00Var;
    }
}
