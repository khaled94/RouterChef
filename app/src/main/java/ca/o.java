package ca;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public static final Logger f2862a = Logger.getLogger(o.class.getName());

    /* loaded from: classes.dex */
    public class a implements x {

        /* renamed from: s */
        public final /* synthetic */ z f2863s;

        /* renamed from: t */
        public final /* synthetic */ OutputStream f2864t;

        public a(z zVar, OutputStream outputStream) {
            this.f2863s = zVar;
            this.f2864t = outputStream;
        }

        @Override // ca.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f2864t.close();
        }

        @Override // ca.x
        public final z d() {
            return this.f2863s;
        }

        @Override // ca.x, java.io.Flushable
        public final void flush() {
            this.f2864t.flush();
        }

        @Override // ca.x
        public final void q(f fVar, long j3) {
            a0.a(fVar.f2843t, 0L, j3);
            while (j3 > 0) {
                this.f2863s.f();
                u uVar = fVar.f2842s;
                int min = (int) Math.min(j3, uVar.f2880c - uVar.f2879b);
                this.f2864t.write(uVar.f2878a, uVar.f2879b, min);
                int i10 = uVar.f2879b + min;
                uVar.f2879b = i10;
                long j10 = min;
                j3 -= j10;
                fVar.f2843t -= j10;
                if (i10 == uVar.f2880c) {
                    fVar.f2842s = uVar.a();
                    v.a(uVar);
                }
            }
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("sink(");
            c10.append(this.f2864t);
            c10.append(")");
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b implements y {

        /* renamed from: s */
        public final /* synthetic */ z f2865s;

        /* renamed from: t */
        public final /* synthetic */ InputStream f2866t;

        public b(z zVar, InputStream inputStream) {
            this.f2865s = zVar;
            this.f2866t = inputStream;
        }

        @Override // ca.y
        public final long D(f fVar, long j3) {
            try {
                this.f2865s.f();
                u w02 = fVar.w0(1);
                int read = this.f2866t.read(w02.f2878a, w02.f2880c, (int) Math.min(8192L, 8192 - w02.f2880c));
                if (read == -1) {
                    return -1L;
                }
                w02.f2880c += read;
                long j10 = read;
                fVar.f2843t += j10;
                return j10;
            } catch (AssertionError e10) {
                if (!o.b(e10)) {
                    throw e10;
                }
                throw new IOException(e10);
            }
        }

        @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f2866t.close();
        }

        @Override // ca.y
        public final z d() {
            return this.f2865s;
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("source(");
            c10.append(this.f2866t);
            c10.append(")");
            return c10.toString();
        }
    }

    public static x a(File file) {
        if (file != null) {
            return d(new FileOutputStream(file, true), new z());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static boolean b(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static x c(File file) {
        if (file != null) {
            return d(new FileOutputStream(file), new z());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static x d(OutputStream outputStream, z zVar) {
        if (outputStream != null) {
            return new a(zVar, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static x e(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                q qVar = new q(socket);
                return new ca.a(qVar, d(socket.getOutputStream(), qVar));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static y f(InputStream inputStream) {
        return g(inputStream, new z());
    }

    public static y g(InputStream inputStream, z zVar) {
        if (inputStream != null) {
            return new b(zVar, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static y h(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                q qVar = new q(socket);
                return new ca.b(qVar, g(socket.getInputStream(), qVar));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }
}
