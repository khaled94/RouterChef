package m4;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n3.g1;

/* loaded from: classes.dex */
public final class wc0 extends uc0 {

    /* renamed from: x */
    public static final Set<String> f14933x = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat y = new DecimalFormat("#,###");

    /* renamed from: v */
    public File f14934v;

    /* renamed from: w */
    public boolean f14935w;

    public wc0(fb0 fb0Var) {
        super(fb0Var);
        File cacheDir = this.f14358s.getCacheDir();
        if (cacheDir == null) {
            g1.j("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f14934v = file;
        if (!file.isDirectory() && !this.f14934v.mkdirs()) {
            String valueOf = String.valueOf(this.f14934v.getAbsolutePath());
            g1.j(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f14934v = null;
        } else if (this.f14934v.setReadable(true, false) && this.f14934v.setExecutable(true, false)) {
        } else {
            String valueOf2 = String.valueOf(this.f14934v.getAbsolutePath());
            g1.j(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f14934v = null;
        }
    }

    @Override // m4.uc0
    public final void h() {
        this.f14935w = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c7, code lost:
        r9 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cf, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d2, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d3, code lost:
        r1 = r9;
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x035b, code lost:
        r28 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0366, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0368, code lost:
        r14 = "externalAbort";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x036b, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x036d, code lost:
        r28 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x036f, code lost:
        r14 = "downloadTimeout";
        r0 = java.lang.Long.toString(r21);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r9 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x039c, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x039d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03a0, code lost:
        r1 = r9;
        r9 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02aa, code lost:
        r14 = "sizeExceeded";
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ba, code lost:
        if (r1.length() == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02bc, code lost:
        r9 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v62, types: [int] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    @Override // m4.uc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.wc0.p(java.lang.String):boolean");
    }

    public final File t(File file) {
        return new File(this.f14934v, String.valueOf(file.getName()).concat(".done"));
    }
}
