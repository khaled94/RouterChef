package r9;

import ca.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import s9.e;

/* loaded from: classes.dex */
public abstract class i0 implements Closeable {
    @Nullable

    /* renamed from: s */
    public a f17400s;

    /* loaded from: classes.dex */
    public static final class a extends Reader {

        /* renamed from: s */
        public final h f17401s;

        /* renamed from: t */
        public final Charset f17402t;

        /* renamed from: u */
        public boolean f17403u;
        @Nullable

        /* renamed from: v */
        public InputStreamReader f17404v;

        public a(h hVar, Charset charset) {
            this.f17401s = hVar;
            this.f17402t = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f17403u = true;
            InputStreamReader inputStreamReader = this.f17404v;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f17401s.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) {
            if (!this.f17403u) {
                InputStreamReader inputStreamReader = this.f17404v;
                if (inputStreamReader == null) {
                    h hVar = this.f17401s;
                    Charset charset = this.f17402t;
                    int R = hVar.R(e.f18400e);
                    if (R != -1) {
                        if (R == 0) {
                            charset = StandardCharsets.UTF_8;
                        } else if (R == 1) {
                            charset = StandardCharsets.UTF_16BE;
                        } else if (R == 2) {
                            charset = StandardCharsets.UTF_16LE;
                        } else if (R == 3) {
                            charset = e.f18401f;
                        } else if (R != 4) {
                            throw new AssertionError();
                        } else {
                            charset = e.f18402g;
                        }
                    }
                    inputStreamReader = new InputStreamReader(this.f17401s.l0(), charset);
                    this.f17404v = inputStreamReader;
                }
                return inputStreamReader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    public abstract long b();

    @Nullable
    public abstract x c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e.c(j());
    }

    public abstract h j();
}
