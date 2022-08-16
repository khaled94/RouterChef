package s4;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public String f17702a;

    /* renamed from: b */
    public final long f17703b;

    /* renamed from: c */
    public final Map<String, Object> f17704c;

    public a(String str, long j3, Map<String, Object> map) {
        this.f17702a = str;
        this.f17703b = j3;
        HashMap hashMap = new HashMap();
        this.f17704c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final a clone() {
        return new a(this.f17702a, this.f17703b, new HashMap(this.f17704c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f17703b != aVar.f17703b || !this.f17702a.equals(aVar.f17702a)) {
            return false;
        }
        return this.f17704c.equals(aVar.f17704c);
    }

    public final int hashCode() {
        int hashCode = this.f17702a.hashCode();
        long j3 = this.f17703b;
        return this.f17704c.hashCode() + (((hashCode * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f17702a;
        long j3 = this.f17703b;
        String valueOf = String.valueOf(this.f17704c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + valueOf.length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j3);
        sb.append(", params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
