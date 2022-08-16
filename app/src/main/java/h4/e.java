package h4;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import r.c;

@Deprecated
/* loaded from: classes.dex */
public final class e {
    public static void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream, boolean z10) {
        byte[] bArr = new byte[1024];
        long j3 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                j3 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z10) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z10) {
            a(inputStream);
            a(outputStream);
        }
        return j3;
    }

    public static Set c(int i10) {
        return i10 <= 256 ? new c(i10) : new HashSet(i10, 1.0f);
    }
}
