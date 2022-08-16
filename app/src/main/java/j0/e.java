package j0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {

    /* renamed from: s */
    public static final /* synthetic */ e f5391s = new e();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int i12 = f.f5392a;
        if (bArr.length == bArr2.length) {
            for (int i13 = 0; i13 < bArr.length; i13++) {
                if (bArr[i13] != bArr2[i13]) {
                    i11 = bArr[i13];
                    i10 = bArr2[i13];
                }
            }
            return 0;
        }
        i11 = bArr.length;
        i10 = bArr2.length;
        return i11 - i10;
    }
}
