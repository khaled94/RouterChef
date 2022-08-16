package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: d */
    public static final Comparator<byte[]> f13511d = new r4();

    /* renamed from: a */
    public final List<byte[]> f13512a = new ArrayList();

    /* renamed from: b */
    public final List<byte[]> f13513b = new ArrayList(64);

    /* renamed from: c */
    public int f13514c = 0;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<byte[]>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<byte[]>, java.util.ArrayList] */
    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f13512a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f13513b, bArr, f13511d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f13513b.add(binarySearch, bArr);
                this.f13514c += length;
                c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<byte[]>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<byte[]>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List<byte[]>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List<byte[]>, java.util.ArrayList] */
    public final synchronized byte[] b(int i10) {
        for (int i11 = 0; i11 < this.f13513b.size(); i11++) {
            byte[] bArr = (byte[]) this.f13513b.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f13514c -= length;
                this.f13513b.remove(i11);
                this.f13512a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<byte[]>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<byte[]>, java.util.ArrayList] */
    public final synchronized void c() {
        while (this.f13514c > 4096) {
            byte[] bArr = (byte[]) this.f13512a.remove(0);
            this.f13513b.remove(bArr);
            this.f13514c -= bArr.length;
        }
    }
}
