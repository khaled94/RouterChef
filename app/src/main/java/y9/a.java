package y9;

import ca.o;
import ca.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: a */
    public static final C0154a f20884a = new C0154a();

    /* renamed from: y9.a$a */
    /* loaded from: classes.dex */
    public class C0154a implements a {
        public final void a(File file) {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        public final void b(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }

        public final void c(File file, File file2) {
            a(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        public final y d(File file) {
            Logger logger = o.f2862a;
            if (file != null) {
                return o.f(new FileInputStream(file));
            }
            throw new IllegalArgumentException("file == null");
        }
    }
}
