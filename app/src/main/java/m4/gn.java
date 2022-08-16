package m4;

/* loaded from: classes.dex */
public class gn {

    /* renamed from: a */
    public final Object f8973a;

    /* renamed from: b */
    public final int f8974b;

    /* renamed from: c */
    public final int f8975c;

    /* renamed from: d */
    public final long f8976d;

    /* renamed from: e */
    public final int f8977e;

    public gn(Object obj, int i10, int i11, long j3, int i12) {
        this.f8973a = obj;
        this.f8974b = i10;
        this.f8975c = i11;
        this.f8976d = j3;
        this.f8977e = i12;
    }

    public gn(gn gnVar) {
        this.f8973a = gnVar.f8973a;
        this.f8974b = gnVar.f8974b;
        this.f8975c = gnVar.f8975c;
        this.f8976d = gnVar.f8976d;
        this.f8977e = gnVar.f8977e;
    }

    public final boolean a() {
        return this.f8974b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn)) {
            return false;
        }
        gn gnVar = (gn) obj;
        return this.f8973a.equals(gnVar.f8973a) && this.f8974b == gnVar.f8974b && this.f8975c == gnVar.f8975c && this.f8976d == gnVar.f8976d && this.f8977e == gnVar.f8977e;
    }

    public final int hashCode() {
        return ((((((((this.f8973a.hashCode() + 527) * 31) + this.f8974b) * 31) + this.f8975c) * 31) + ((int) this.f8976d)) * 31) + this.f8977e;
    }
}
