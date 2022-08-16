package a4;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: d */
    public static final f0 f134d = new f0(true, null, null);

    /* renamed from: a */
    public final boolean f135a;
    @Nullable

    /* renamed from: b */
    public final String f136b;
    @Nullable

    /* renamed from: c */
    public final Throwable f137c;

    public f0(boolean z10, @Nullable String str, @Nullable Throwable th) {
        this.f135a = z10;
        this.f136b = str;
        this.f137c = th;
    }

    public static f0 b(String str) {
        return new f0(false, str, null);
    }

    public static f0 c(String str, Throwable th) {
        return new f0(false, str, th);
    }

    @Nullable
    public String a() {
        return this.f136b;
    }
}
