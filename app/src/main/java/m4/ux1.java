package m4;

import java.util.Queue;

/* loaded from: classes.dex */
public final class ux1 {

    /* renamed from: a */
    public static final /* synthetic */ int f14527a = 0;

    static {
        new tx1();
    }

    public static byte[] a(Queue<byte[]> queue, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i11, remove.length);
            System.arraycopy(remove, 0, bArr, i10 - i11, min);
            i11 -= min;
        }
        return bArr;
    }
}
