package g1;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.fragment.app.b1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k1.f;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: l */
    public static final String[] f4822l = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b */
    public final String[] f4824b;

    /* renamed from: c */
    public Map<String, Set<String>> f4825c;

    /* renamed from: d */
    public final z f4826d;

    /* renamed from: g */
    public volatile f f4829g;

    /* renamed from: h */
    public final b f4830h;

    /* renamed from: e */
    public AtomicBoolean f4827e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f4828f = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: i */
    public final m.b<c, d> f4831i = new m.b<>();

    /* renamed from: j */
    public final Object f4832j = new Object();

    /* renamed from: k */
    public a f4833k = new a();

    /* renamed from: a */
    public final HashMap<String, Integer> f4823a = new HashMap<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            n.this = r1;
        }

        /* JADX WARN: Finally extract failed */
        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor n10 = n.this.f4826d.n(new k1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", (Object) null));
            while (n10.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(n10.getInt(0)));
                } catch (Throwable th) {
                    n10.close();
                    throw th;
                }
            }
            n10.close();
            if (!hashSet.isEmpty()) {
                n.this.f4829g.s();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00e4 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.n.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final long[] f4835a;

        /* renamed from: b */
        public final boolean[] f4836b;

        /* renamed from: c */
        public final int[] f4837c;

        /* renamed from: d */
        public boolean f4838d;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f4835a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f4836b = zArr;
            this.f4837c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public final int[] a() {
            synchronized (this) {
                if (!this.f4838d) {
                    return null;
                }
                int length = this.f4835a.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = 1;
                    boolean z10 = this.f4835a[i10] > 0;
                    boolean[] zArr = this.f4836b;
                    if (z10 != zArr[i10]) {
                        int[] iArr = this.f4837c;
                        if (!z10) {
                            i11 = 2;
                        }
                        iArr[i10] = i11;
                    } else {
                        this.f4837c[i10] = 0;
                    }
                    zArr[i10] = z10;
                }
                this.f4838d = false;
                return (int[]) this.f4837c.clone();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int[] f4839a;

        /* renamed from: b */
        public final String[] f4840b;

        /* renamed from: c */
        public final c f4841c;

        /* renamed from: d */
        public final Set<String> f4842d;
    }

    public n(z zVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4826d = zVar;
        this.f4830h = new b(strArr.length);
        this.f4825c = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f4824b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4823a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f4824b[i10] = str2.toLowerCase(locale);
            } else {
                this.f4824b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f4823a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4823a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public static void a(StringBuilder sb, String str, String str2) {
        b1.b(sb, "`", "room_table_modification_trigger_", str, "_");
        sb.append(str2);
        sb.append("`");
    }

    public final boolean b() {
        if (!this.f4826d.m()) {
            return false;
        }
        if (!this.f4828f) {
            this.f4826d.f4864c.h0();
        }
        if (this.f4828f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(k1.b bVar, int i10) {
        bVar.n("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f4824b[i10];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f4822l;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            b1.b(sb, str, "` BEGIN UPDATE ", "room_table_modification_log", " SET ");
            b1.b(sb, "invalidated", " = 1", " WHERE ", "table_id");
            sb.append(" = ");
            sb.append(i10);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.n(sb.toString());
        }
    }

    public final void d(k1.b bVar) {
        if (bVar.C()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f4826d.f4869h.readLock();
            readLock.lock();
            try {
                synchronized (this.f4832j) {
                    int[] a10 = this.f4830h.a();
                    if (a10 == null) {
                        return;
                    }
                    int length = a10.length;
                    if (bVar.M()) {
                        bVar.W();
                    } else {
                        bVar.h();
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = a10[i10];
                        if (i11 == 1) {
                            c(bVar, i10);
                        } else if (i11 == 2) {
                            String str = this.f4824b[i10];
                            StringBuilder sb = new StringBuilder();
                            String[] strArr = f4822l;
                            for (int i12 = 0; i12 < 3; i12++) {
                                String str2 = strArr[i12];
                                sb.setLength(0);
                                sb.append("DROP TRIGGER IF EXISTS ");
                                a(sb, str, str2);
                                bVar.n(sb.toString());
                            }
                        }
                    }
                    bVar.Q();
                    bVar.g();
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
