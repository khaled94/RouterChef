package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class w0 extends Writer {

    /* renamed from: t */
    public StringBuilder f1599t = new StringBuilder(128);

    /* renamed from: s */
    public final String f1598s = "FragmentManager";

    public final void b() {
        if (this.f1599t.length() > 0) {
            Log.d(this.f1598s, this.f1599t.toString());
            StringBuilder sb = this.f1599t;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                b();
            } else {
                this.f1599t.append(c10);
            }
        }
    }
}
