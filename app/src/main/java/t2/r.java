package t2;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import q2.d;
import t2.j;

@AutoValue
/* loaded from: classes.dex */
public abstract class r {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a a(String str);
    }

    public static a a() {
        j.a aVar = new j.a();
        aVar.f18532c = d.DEFAULT;
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
