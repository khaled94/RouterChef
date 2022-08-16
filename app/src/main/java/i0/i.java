package i0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a */
    public final LocaleList f5170a;

    public i(Object obj) {
        this.f5170a = (LocaleList) obj;
    }

    @Override // i0.h
    public final Object a() {
        return this.f5170a;
    }

    public final boolean equals(Object obj) {
        return this.f5170a.equals(((h) obj).a());
    }

    @Override // i0.h
    public final Locale get() {
        return this.f5170a.get(0);
    }

    public final int hashCode() {
        return this.f5170a.hashCode();
    }

    public final String toString() {
        return this.f5170a.toString();
    }
}
