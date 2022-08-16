package u1;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import t1.h;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public static final String f19018a = h.e("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f19019b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        File databasePath;
        File file;
        String[] strArr;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            h.c().a(f19018a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            hashMap.put(context.getDatabasePath("androidx.work.workdb"), new File(context.getNoBackupFilesDir(), "androidx.work.workdb"));
            for (String str : f19019b) {
                hashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        h.c().f(f19018a, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    h.c().a(f19018a, file2.renameTo(file3) ? String.format("Migrated %s to %s", file2, file3) : String.format("Renaming %s to %s failed", file2, file3), new Throwable[0]);
                }
            }
        }
    }
}
