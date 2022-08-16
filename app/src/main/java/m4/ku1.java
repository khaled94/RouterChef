package m4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ku1 implements Iterable<String> {

    /* renamed from: s */
    public final /* synthetic */ CharSequence f10579s;

    /* renamed from: t */
    public final /* synthetic */ aa0 f10580t;

    public ku1(aa0 aa0Var, CharSequence charSequence) {
        this.f10580t = aa0Var;
        this.f10579s = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        aa0 aa0Var = this.f10580t;
        return ((mu1) aa0Var.f6088t).l(aa0Var, this.f10579s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        r0.append((java.lang.CharSequence) ", ");
        r3 = r1.next();
        java.util.Objects.requireNonNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if ((r3 instanceof java.lang.CharSequence) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        r3 = r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        if ((r3 instanceof java.lang.CharSequence) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        r0.append((java.lang.CharSequence) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r1.hasNext() == false) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:7:0x0021). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003b -> B:8:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.util.Iterator r1 = r5.iterator()
            java.lang.String r2 = ", "
            boolean r3 = r1.hasNext()     // Catch: java.io.IOException -> L4a
            if (r3 == 0) goto L40
            java.lang.Object r3 = r1.next()     // Catch: java.io.IOException -> L4a
            java.util.Objects.requireNonNull(r3)     // Catch: java.io.IOException -> L4a
            boolean r4 = r3 instanceof java.lang.CharSequence     // Catch: java.io.IOException -> L4a
            if (r4 == 0) goto L3b
        L21:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.io.IOException -> L4a
        L23:
            r0.append(r3)     // Catch: java.io.IOException -> L4a
            boolean r3 = r1.hasNext()     // Catch: java.io.IOException -> L4a
            if (r3 == 0) goto L40
            r0.append(r2)     // Catch: java.io.IOException -> L4a
            java.lang.Object r3 = r1.next()     // Catch: java.io.IOException -> L4a
            java.util.Objects.requireNonNull(r3)     // Catch: java.io.IOException -> L4a
            boolean r4 = r3 instanceof java.lang.CharSequence     // Catch: java.io.IOException -> L4a
            if (r4 == 0) goto L3b
            goto L21
        L3b:
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L4a
            goto L23
        L40:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4a:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ku1.toString():java.lang.String");
    }
}
