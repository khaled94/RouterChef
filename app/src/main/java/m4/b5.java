package m4;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public final class b5 implements kz1, v91 {

    /* renamed from: s */
    public final Object f6362s;

    /* renamed from: t */
    public final Object f6363t;

    public /* synthetic */ b5(String str, lx lxVar) {
        this.f6362s = str;
        this.f6363t = lxVar;
    }

    public /* synthetic */ b5(String str, m4 m4Var) {
        this.f6362s = str;
        this.f6363t = m4Var;
    }

    public /* synthetic */ b5(String str, String[] strArr) {
        this.f6362s = str;
        this.f6363t = strArr;
    }

    public /* synthetic */ b5(FileChannel fileChannel, FileLock fileLock) {
        this.f6362s = fileChannel;
        this.f6363t = fileLock;
    }

    public /* synthetic */ b5(fg2 fg2Var, String str) {
        this.f6363t = fg2Var;
        this.f6362s = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m4.b5 b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L27 java.lang.Error -> L29 java.io.IOException -> L2b
            m4.b5 r2 = new m4.b5     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            return r2
        L21:
            r2 = move-exception
            goto L37
        L23:
            r2 = move-exception
            goto L37
        L25:
            r2 = move-exception
            goto L37
        L27:
            r0 = move-exception
            goto L2c
        L29:
            r0 = move-exception
            goto L2c
        L2b:
            r0 = move-exception
        L2c:
            r2 = r0
            r0 = r1
            goto L37
        L2f:
            r5 = move-exception
            goto L34
        L31:
            r5 = move-exception
            goto L34
        L33:
            r5 = move-exception
        L34:
            r2 = r5
            r5 = r1
            r0 = r5
        L37:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L43
            r0.release()     // Catch: java.io.IOException -> L43
        L43:
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.io.IOException -> L48
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b5.b(android.content.Context):m4.b5");
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((vd0) obj).D0((String) this.f6362s, (lx) this.f6363t);
    }

    public final void c() {
        try {
            ((FileLock) this.f6363t).release();
            ((FileChannel) this.f6362s).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }
}
