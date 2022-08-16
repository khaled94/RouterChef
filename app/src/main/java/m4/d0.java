package m4;

import androidx.fragment.app.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends f0 {

    /* renamed from: b */
    public final long f7160b;

    /* renamed from: c */
    public final List<e0> f7161c = new ArrayList();

    /* renamed from: d */
    public final List<d0> f7162d = new ArrayList();

    public d0(int i10, long j3) {
        super(i10);
        this.f7160b = j3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    public final d0 c(int i10) {
        int size = this.f7162d.size();
        for (int i11 = 0; i11 < size; i11++) {
            d0 d0Var = (d0) this.f7162d.get(i11);
            if (d0Var.f8307a == i10) {
                return d0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    public final e0 d(int i10) {
        int size = this.f7161c.size();
        for (int i11 = 0; i11 < size; i11++) {
            e0 e0Var = (e0) this.f7161c.get(i11);
            if (e0Var.f8307a == i10) {
                return e0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    @Override // m4.f0
    public final String toString() {
        String b10 = f0.b(this.f8307a);
        String arrays = Arrays.toString(this.f7161c.toArray());
        String arrays2 = Arrays.toString(this.f7162d.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(b10.length() + 22 + length + String.valueOf(arrays2).length());
        b1.b(sb, b10, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
