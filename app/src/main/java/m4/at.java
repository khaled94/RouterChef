package m4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class at<T> {

    /* renamed from: a */
    public final String f6250a;

    /* renamed from: b */
    public final T f6251b;

    /* renamed from: c */
    public final int f6252c;

    public at(String str, T t10, int i10) {
        this.f6250a = str;
        this.f6251b = t10;
        this.f6252c = i10;
    }

    public static at<Double> a(String str, double d5) {
        return new at<>(str, Double.valueOf(d5), 3);
    }

    public static at<Long> b(String str, long j3) {
        return new at<>(str, Long.valueOf(j3), 2);
    }

    public static at<String> c(String str, String str2) {
        return new at<>(str, str2, 4);
    }

    public static at<Boolean> d(String str, boolean z10) {
        return new at<>(str, Boolean.valueOf(z10), 1);
    }

    public final T e() {
        bu buVar = du.f7639a.get();
        if (buVar != null) {
            int i10 = this.f6252c - 1;
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? (T) buVar.b(this.f6250a, (String) this.f6251b) : (T) buVar.a(this.f6250a, ((Double) this.f6251b).doubleValue()) : (T) buVar.c(this.f6250a, ((Long) this.f6251b).longValue()) : (T) buVar.d(this.f6250a, ((Boolean) this.f6251b).booleanValue());
        }
        AtomicReference<cu> atomicReference = du.f7640b;
        if (atomicReference.get() != null) {
            atomicReference.get().zza();
        }
        return this.f6251b;
    }
}
