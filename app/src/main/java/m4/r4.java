package m4;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class r4 implements Comparator<byte[]> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        return bArr.length - bArr2.length;
    }
}
