package x7;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import z7.k;

/* loaded from: classes.dex */
public final class q extends l {

    /* renamed from: a */
    public final Serializable f20089a;

    public q(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f20089a = bool;
    }

    public static boolean i(q qVar) {
        Serializable serializable = qVar.f20089a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        Serializable serializable = this.f20089a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f20089a == null) {
            return qVar.f20089a == null;
        } else if (i(this) && i(qVar)) {
            return g().longValue() == qVar.g().longValue();
        } else {
            Serializable serializable = this.f20089a;
            if (!(serializable instanceof Number) || !(qVar.f20089a instanceof Number)) {
                return serializable.equals(qVar.f20089a);
            }
            double doubleValue = g().doubleValue();
            double doubleValue2 = qVar.g().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
    }

    public final Number g() {
        Serializable serializable = this.f20089a;
        return serializable instanceof String ? new k((String) serializable) : (Number) serializable;
    }

    public final String h() {
        Serializable serializable = this.f20089a;
        if (serializable instanceof Number) {
            return g().toString();
        }
        return serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final int hashCode() {
        long j3;
        if (this.f20089a == null) {
            return 31;
        }
        if (i(this)) {
            j3 = g().longValue();
        } else {
            Serializable serializable = this.f20089a;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            j3 = Double.doubleToLongBits(g().doubleValue());
        }
        return (int) ((j3 >>> 32) ^ j3);
    }

    public q(Number number) {
        Objects.requireNonNull(number);
        this.f20089a = number;
    }

    public q(String str) {
        Objects.requireNonNull(str);
        this.f20089a = str;
    }
}
