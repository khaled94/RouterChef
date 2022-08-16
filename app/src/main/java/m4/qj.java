package m4;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
public final class qj extends PushbackInputStream {

    /* renamed from: s */
    public final /* synthetic */ rj f12890s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(rj rjVar, InputStream inputStream) {
        super(inputStream, 1);
        this.f12890s = rjVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        tj.a(this.f12890s.f13367c);
        super.close();
    }
}
