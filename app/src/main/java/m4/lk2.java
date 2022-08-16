package m4;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class lk2 {

    /* renamed from: b */
    public final Uri f10892b;

    /* renamed from: c */
    public final jn2 f10893c;

    /* renamed from: d */
    public final q72 f10894d;

    /* renamed from: e */
    public final vo2 f10895e;

    /* renamed from: f */
    public final h21 f10896f;

    /* renamed from: h */
    public volatile boolean f10898h;

    /* renamed from: j */
    public long f10900j;

    /* renamed from: m */
    public mp2 f10903m;

    /* renamed from: n */
    public boolean f10904n;

    /* renamed from: o */
    public final /* synthetic */ pk2 f10905o;

    /* renamed from: g */
    public final gp2 f10897g = new gp2();

    /* renamed from: i */
    public boolean f10899i = true;

    /* renamed from: l */
    public long f10902l = -1;

    /* renamed from: a */
    public final long f10891a = nj2.f11812a.getAndIncrement();

    /* renamed from: k */
    public gs0 f10901k = b(0);

    public lk2(pk2 pk2Var, Uri uri, kq0 kq0Var, q72 q72Var, vo2 vo2Var, h21 h21Var) {
        this.f10905o = pk2Var;
        this.f10892b = uri;
        this.f10893c = new jn2(kq0Var);
        this.f10894d = q72Var;
        this.f10895e = vo2Var;
        this.f10896f = h21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0209 A[EDGE_INSN: B:149:0x0209->B:106:0x0209 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x0172, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9 A[Catch: all -> 0x0172, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[Catch: all -> 0x0172, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5 A[Catch: all -> 0x0172, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140 A[Catch: all -> 0x0172, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151 A[Catch: all -> 0x0172, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0190 A[Catch: all -> 0x0172, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #3 {all -> 0x0172, blocks: (B:6:0x000a, B:8:0x0020, B:9:0x0023, B:11:0x0036, B:12:0x003c, B:16:0x0046, B:18:0x0054, B:19:0x0059, B:20:0x005f, B:23:0x0066, B:25:0x0074, B:26:0x0079, B:27:0x007e, B:30:0x0088, B:32:0x0093, B:34:0x009f, B:36:0x00a9, B:38:0x00b5, B:40:0x00bf, B:42:0x00cb, B:44:0x00d5, B:46:0x00e7, B:48:0x00f1, B:49:0x00f7, B:52:0x00ff, B:54:0x010d, B:55:0x0112, B:56:0x0118, B:59:0x011e, B:61:0x012c, B:62:0x0131, B:63:0x0136, B:67:0x0140, B:68:0x0147, B:70:0x0151, B:72:0x0155, B:76:0x0176, B:78:0x0190, B:80:0x019a, B:81:0x019e, B:83:0x01a2), top: B:132:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.lk2.a():void");
    }

    public final gs0 b(long j3) {
        Collections.emptyMap();
        Uri uri = this.f10892b;
        Map<String, String> map = pk2.f12543c0;
        if (uri != null) {
            return new gs0(uri, 0L, map, j3, -1L, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
