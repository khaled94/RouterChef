package c2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public String f2616a;

    /* renamed from: b */
    public Long f2617b;

    public d() {
        this.f2616a = "reschedule_needed";
        this.f2617b = 0L;
    }

    public d(String str, long j3) {
        this.f2616a = str;
        this.f2617b = Long.valueOf(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f2616a.equals(dVar.f2616a)) {
            return false;
        }
        Long l10 = this.f2617b;
        Long l11 = dVar.f2617b;
        return l10 != null ? l10.equals(l11) : l11 == null;
    }

    public final int hashCode() {
        int hashCode = this.f2616a.hashCode() * 31;
        Long l10 = this.f2617b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
