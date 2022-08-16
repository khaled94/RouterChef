package t6;

import java.io.InputStream;
import t6.c;

/* loaded from: classes.dex */
public final class d implements c.AbstractC0118c {

    /* renamed from: a */
    public final /* synthetic */ byte[] f18688a;

    /* renamed from: b */
    public final /* synthetic */ int[] f18689b;

    public d(byte[] bArr, int[] iArr) {
        this.f18688a = bArr;
        this.f18689b = iArr;
    }

    public final void a(InputStream inputStream, int i10) {
        try {
            inputStream.read(this.f18688a, this.f18689b[0], i10);
            int[] iArr = this.f18689b;
            iArr[0] = iArr[0] + i10;
        } finally {
            inputStream.close();
        }
    }
}
