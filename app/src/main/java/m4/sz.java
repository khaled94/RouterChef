package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sz {

    /* renamed from: a */
    public final Object f13844a;

    /* renamed from: b */
    public final int f13845b;

    /* renamed from: c */
    public final gi f13846c;

    /* renamed from: d */
    public final Object f13847d;

    /* renamed from: e */
    public final int f13848e;

    /* renamed from: f */
    public final long f13849f;

    /* renamed from: g */
    public final long f13850g;

    /* renamed from: h */
    public final int f13851h;

    /* renamed from: i */
    public final int f13852i;

    public sz(Object obj, int i10, gi giVar, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f13844a = obj;
        this.f13845b = i10;
        this.f13846c = giVar;
        this.f13847d = obj2;
        this.f13848e = i11;
        this.f13849f = j3;
        this.f13850g = j10;
        this.f13851h = i12;
        this.f13852i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sz.class == obj.getClass()) {
            sz szVar = (sz) obj;
            if (this.f13845b == szVar.f13845b && this.f13848e == szVar.f13848e && this.f13849f == szVar.f13849f && this.f13850g == szVar.f13850g && this.f13851h == szVar.f13851h && this.f13852i == szVar.f13852i && js.a(this.f13844a, szVar.f13844a) && js.a(this.f13847d, szVar.f13847d) && js.a(this.f13846c, szVar.f13846c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13844a, Integer.valueOf(this.f13845b), this.f13846c, this.f13847d, Integer.valueOf(this.f13848e), Integer.valueOf(this.f13845b), Long.valueOf(this.f13849f), Long.valueOf(this.f13850g), Integer.valueOf(this.f13851h), Integer.valueOf(this.f13852i)});
    }
}
