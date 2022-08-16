package s4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements Iterable<n>, n {

    /* renamed from: s */
    public final String f18078s;

    public r(String str) {
        if (str != null) {
            this.f18078s = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // s4.n
    public final Boolean e() {
        return Boolean.valueOf(!this.f18078s.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f18078s.equals(((r) obj).f18078s);
        }
        return false;
    }

    @Override // s4.n
    public final Double f() {
        double d5;
        if (this.f18078s.isEmpty()) {
            d5 = 0.0d;
        } else {
            try {
                return Double.valueOf(this.f18078s);
            } catch (NumberFormatException unused) {
                d5 = Double.NaN;
            }
        }
        return Double.valueOf(d5);
    }

    @Override // s4.n
    public final n g() {
        return new r(this.f18078s);
    }

    @Override // s4.n
    public final String h() {
        return this.f18078s;
    }

    public final int hashCode() {
        return this.f18078s.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0307, code lost:
        if (r1[r5].equals(r0) == false) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158  */
    @Override // s4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s4.n i(java.lang.String r20, s4.a4 r21, java.util.List<s4.n> r22) {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.r.i(java.lang.String, s4.a4, java.util.List):s4.n");
    }

    @Override // java.lang.Iterable
    public final Iterator<n> iterator() {
        return new q(this);
    }

    @Override // s4.n
    public final Iterator<n> l() {
        return new p(this);
    }

    public final String toString() {
        String str = this.f18078s;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }
}
