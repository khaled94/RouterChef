package s4;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class n5<T> {
    @Nullable

    /* renamed from: g */
    public static volatile v4 f18019g;

    /* renamed from: a */
    public final l5 f18021a;

    /* renamed from: b */
    public final String f18022b;

    /* renamed from: c */
    public final T f18023c;

    /* renamed from: d */
    public volatile int f18024d = -1;

    /* renamed from: e */
    public volatile T f18025e;

    /* renamed from: f */
    public static final Object f18018f = new Object();

    /* renamed from: h */
    public static final AtomicInteger f18020h = new AtomicInteger();

    static {
        new AtomicReference();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n5(l5 l5Var, String str, Object obj) {
        if (l5Var.f17964a != null) {
            this.f18021a = l5Var;
            this.f18022b = str;
            this.f18023c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public abstract T a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: all -> 0x0123, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x0029, B:13:0x0035, B:15:0x003e, B:17:0x0050, B:18:0x0055, B:19:0x005b, B:20:0x005f, B:22:0x0065, B:24:0x006d, B:26:0x0083, B:28:0x0089, B:30:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:40:0x00b2, B:42:0x00b8, B:45:0x00c0, B:46:0x00c2, B:48:0x00d0, B:50:0x00e1, B:53:0x00f0, B:55:0x00fc, B:56:0x0101, B:57:0x0106, B:59:0x010f, B:60:0x0112, B:61:0x0116, B:62:0x011b, B:63:0x0120, B:64:0x0121), top: B:71:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[Catch: all -> 0x0123, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x0029, B:13:0x0035, B:15:0x003e, B:17:0x0050, B:18:0x0055, B:19:0x005b, B:20:0x005f, B:22:0x0065, B:24:0x006d, B:26:0x0083, B:28:0x0089, B:30:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:40:0x00b2, B:42:0x00b8, B:45:0x00c0, B:46:0x00c2, B:48:0x00d0, B:50:0x00e1, B:53:0x00f0, B:55:0x00fc, B:56:0x0101, B:57:0x0106, B:59:0x010f, B:60:0x0112, B:61:0x0116, B:62:0x011b, B:63:0x0120, B:64:0x0121), top: B:71:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[Catch: all -> 0x0123, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x0029, B:13:0x0035, B:15:0x003e, B:17:0x0050, B:18:0x0055, B:19:0x005b, B:20:0x005f, B:22:0x0065, B:24:0x006d, B:26:0x0083, B:28:0x0089, B:30:0x0093, B:34:0x009c, B:36:0x00a2, B:39:0x00b0, B:40:0x00b2, B:42:0x00b8, B:45:0x00c0, B:46:0x00c2, B:48:0x00d0, B:50:0x00e1, B:53:0x00f0, B:55:0x00fc, B:56:0x0101, B:57:0x0106, B:59:0x010f, B:60:0x0112, B:61:0x0116, B:62:0x011b, B:63:0x0120, B:64:0x0121), top: B:71:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T b() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.n5.b():java.lang.Object");
    }

    public final String c() {
        Objects.requireNonNull(this.f18021a);
        return this.f18022b;
    }
}
