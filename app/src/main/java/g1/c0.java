package g1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import k1.b;
import k1.c;
import m1.a;

/* loaded from: classes.dex */
public final class c0 implements c, g {

    /* renamed from: s */
    public final Context f4785s;

    /* renamed from: t */
    public final String f4786t;

    /* renamed from: u */
    public final File f4787u;

    /* renamed from: v */
    public final Callable<InputStream> f4788v;

    /* renamed from: w */
    public final int f4789w;

    /* renamed from: x */
    public final c f4790x;
    public f y;

    /* renamed from: z */
    public boolean f4791z;

    public c0(Context context, String str, File file, Callable<InputStream> callable, int i10, c cVar) {
        this.f4785s = context;
        this.f4786t = str;
        this.f4787u = file;
        this.f4788v = callable;
        this.f4789w = i10;
        this.f4790x = cVar;
    }

    @Override // g1.g
    public final c b() {
        return this.f4790x;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:13:0x0049, B:15:0x0050, B:16:0x005d, B:17:0x0069, B:19:0x006f, B:20:0x0073), top: B:44:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x00d5, TryCatch #1 {all -> 0x00d5, blocks: (B:13:0x0049, B:15:0x0050, B:16:0x005d, B:17:0x0069, B:19:0x006f, B:20:0x0073), top: B:44:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.io.File r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.f4786t
            if (r0 == 0) goto L11
            android.content.Context r0 = r10.f4785s
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = r10.f4786t
            java.io.InputStream r0 = r0.open(r1)
            goto L2b
        L11:
            java.io.File r0 = r10.f4787u
            if (r0 == 0) goto L21
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r10.f4787u
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            goto L2f
        L21:
            java.util.concurrent.Callable<java.io.InputStream> r0 = r10.f4788v
            if (r0 == 0) goto Le6
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> Ldd
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Exception -> Ldd
        L2b:
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
        L2f:
            android.content.Context r1 = r10.f4785s
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "room-copy-helper"
            java.lang.String r3 = ".tmp"
            java.io.File r7 = java.io.File.createTempFile(r2, r3, r1)
            r7.deleteOnExit()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r7)
            java.nio.channels.FileChannel r8 = r1.getChannel()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ld5
            r2 = 23
            r9 = 0
            if (r1 <= r2) goto L5d
            r3 = 0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = r8
            r2 = r0
            r1.transferFrom(r2, r3, r5)     // Catch: java.lang.Throwable -> Ld5
            goto L73
        L5d:
            java.io.InputStream r1 = java.nio.channels.Channels.newInputStream(r0)     // Catch: java.lang.Throwable -> Ld5
            java.io.OutputStream r2 = java.nio.channels.Channels.newOutputStream(r8)     // Catch: java.lang.Throwable -> Ld5
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Ld5
        L69:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> Ld5
            if (r4 <= 0) goto L73
            r2.write(r3, r9, r4)     // Catch: java.lang.Throwable -> Ld5
            goto L69
        L73:
            r8.force(r9)     // Catch: java.lang.Throwable -> Ld5
            r0.close()
            r8.close()
            java.io.File r0 = r11.getParentFile()
            if (r0 == 0) goto La6
            boolean r1 = r0.exists()
            if (r1 != 0) goto La6
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L8f
            goto La6
        L8f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to create directories for "
            java.lang.StringBuilder r1 = androidx.activity.result.a.c(r1)
            java.lang.String r11 = r11.getAbsolutePath()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        La6:
            boolean r0 = r7.renameTo(r11)
            if (r0 == 0) goto Lad
            return
        Lad:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to move intermediate file ("
            java.lang.StringBuilder r1 = androidx.activity.result.a.c(r1)
            java.lang.String r2 = r7.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = ") to destination ("
            r1.append(r2)
            java.lang.String r11 = r11.getAbsolutePath()
            r1.append(r11)
            java.lang.String r11 = ")."
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        Ld5:
            r11 = move-exception
            r0.close()
            r8.close()
            throw r11
        Ldd:
            r11 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "inputStreamCallable exception on call"
            r0.<init>(r1, r11)
            throw r0
        Le6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.c0.c(java.io.File):void");
    }

    @Override // k1.c, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f4790x.close();
        this.f4791z = false;
    }

    @Override // k1.c
    public final String getDatabaseName() {
        return this.f4790x.getDatabaseName();
    }

    @Override // k1.c
    public final synchronized b h0() {
        if (!this.f4791z) {
            j(true);
            this.f4791z = true;
        }
        return this.f4790x.h0();
    }

    public final void j(boolean z10) {
        String databaseName = getDatabaseName();
        File databasePath = this.f4785s.getDatabasePath(databaseName);
        f fVar = this.y;
        a aVar = new a(databaseName, this.f4785s.getFilesDir(), fVar == null || fVar.f4813l);
        try {
            aVar.a(aVar.f5943c);
            if (!databasePath.exists()) {
                try {
                    c(databasePath);
                    aVar.b();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            } else if (this.y == null) {
                aVar.b();
                return;
            } else {
                try {
                    int b10 = i1.b.b(databasePath);
                    int i10 = this.f4789w;
                    if (b10 == i10) {
                        aVar.b();
                        return;
                    } else if (this.y.a(b10, i10)) {
                        aVar.b();
                        return;
                    } else {
                        if (this.f4785s.deleteDatabase(databaseName)) {
                            try {
                                c(databasePath);
                            } catch (IOException e11) {
                                Log.w("ROOM", "Unable to copy database file.", e11);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.b();
                        return;
                    }
                } catch (IOException e12) {
                    Log.w("ROOM", "Unable to read database version.", e12);
                    aVar.b();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
        aVar.b();
        throw th;
    }

    @Override // k1.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4790x.setWriteAheadLoggingEnabled(z10);
    }
}
