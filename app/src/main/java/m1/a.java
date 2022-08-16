package m1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e */
    public static final Map<String, Lock> f5940e = new HashMap();

    /* renamed from: a */
    public final File f5941a;

    /* renamed from: b */
    public final Lock f5942b;

    /* renamed from: c */
    public final boolean f5943c;

    /* renamed from: d */
    public FileChannel f5944d;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.concurrent.locks.Lock>] */
    public a(String str, File file, boolean z10) {
        Lock lock;
        File file2 = new File(file, d7.a.c(str, ".lck"));
        this.f5941a = file2;
        String absolutePath = file2.getAbsolutePath();
        ?? r42 = f5940e;
        synchronized (r42) {
            lock = (Lock) r42.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                r42.put(absolutePath, lock);
            }
        }
        this.f5942b = lock;
        this.f5943c = z10;
    }

    public final void a(boolean z10) {
        this.f5942b.lock();
        if (z10) {
            try {
                File parentFile = this.f5941a.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f5941a).getChannel();
                this.f5944d = channel;
                channel.lock();
            } catch (IOException e10) {
                this.f5944d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        FileChannel fileChannel = this.f5944d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f5942b.unlock();
    }
}
