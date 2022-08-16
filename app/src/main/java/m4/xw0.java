package m4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import h4.a;
import java.util.concurrent.Executor;
import n3.g1;
import n3.o0;
import z3.p;

/* loaded from: classes.dex */
public final class xw0 {

    /* renamed from: a */
    public final o0 f15483a;

    /* renamed from: b */
    public final a f15484b;

    /* renamed from: c */
    public final Executor f15485c;

    public xw0(o0 o0Var, a aVar, Executor executor) {
        this.f15483a = o0Var;
        this.f15484b = aVar;
        this.f15485c = executor;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        long b10 = this.f15484b.b();
        boolean z10 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b11 = this.f15484b.b();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j3 = b11 - b10;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            }
            StringBuilder a10 = p.a(108, "Decoded image w: ", width, " h:", height);
            a10.append(" bytes: ");
            a10.append(allocationByteCount);
            a10.append(" time: ");
            a10.append(j3);
            a10.append(" on ui thread: ");
            a10.append(z10);
            g1.a(a10.toString());
        }
        return decodeByteArray;
    }
}
