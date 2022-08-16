package m4;

import androidx.fragment.app.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class xc extends zc {
    public final long P0;
    public final List<yc> Q0 = new ArrayList();
    public final List<xc> R0 = new ArrayList();

    public xc(int i10, long j3) {
        super(i10);
        this.P0 = j3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    public final xc b(int i10) {
        int size = this.R0.size();
        for (int i11 = 0; i11 < size; i11++) {
            xc xcVar = (xc) this.R0.get(i11);
            if (xcVar.f16143a == i10) {
                return xcVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    public final yc c(int i10) {
        int size = this.Q0.size();
        for (int i11 = 0; i11 < size; i11++) {
            yc ycVar = (yc) this.Q0.get(i11);
            if (ycVar.f16143a == i10) {
                return ycVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    @Override // m4.zc
    public final String toString() {
        String a10 = zc.a(this.f16143a);
        String arrays = Arrays.toString(this.Q0.toArray());
        String arrays2 = Arrays.toString(this.R0.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(a10.length() + 22 + length + String.valueOf(arrays2).length());
        b1.b(sb, a10, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
