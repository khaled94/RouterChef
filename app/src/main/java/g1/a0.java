package g1;

import android.database.Cursor;
import androidx.fragment.app.b1;
import e9.f;
import k1.c;

/* loaded from: classes.dex */
public final class a0 extends c.a {

    /* renamed from: b */
    public f f4766b;

    /* renamed from: c */
    public final a f4767c;

    /* renamed from: d */
    public final String f4768d;

    /* renamed from: e */
    public final String f4769e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f4770a;

        public a(int i10) {
            this.f4770a = i10;
        }

        public abstract void a(k1.b bVar);

        public abstract void b(k1.b bVar);

        public abstract void c();

        public abstract void d(k1.b bVar);

        public abstract void e();

        public abstract void f(k1.b bVar);

        public abstract b g(k1.b bVar);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final boolean f4771a;

        /* renamed from: b */
        public final String f4772b;

        public b(boolean z10, String str) {
            this.f4771a = z10;
            this.f4772b = str;
        }
    }

    public a0(f fVar, a aVar, String str, String str2) {
        super(aVar.f4770a);
        this.f4766b = fVar;
        this.f4767c = aVar;
        this.f4768d = str;
        this.f4769e = str2;
    }

    @Override // k1.c.a
    public final void b() {
    }

    /* JADX WARN: Finally extract failed */
    @Override // k1.c.a
    public final void c(k1.b bVar) {
        l1.a aVar = (l1.a) bVar;
        Cursor j02 = aVar.j0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (j02.moveToFirst()) {
                if (j02.getInt(0) == 0) {
                    z10 = true;
                }
            }
            j02.close();
            this.f4767c.a(aVar);
            if (!z10) {
                b g10 = this.f4767c.g(aVar);
                if (!g10.f4771a) {
                    StringBuilder c10 = androidx.activity.result.a.c("Pre-packaged database has an invalid schema: ");
                    c10.append(g10.f4772b);
                    throw new IllegalStateException(c10.toString());
                }
            }
            g(aVar);
            this.f4767c.c();
        } catch (Throwable th) {
            j02.close();
            throw th;
        }
    }

    @Override // k1.c.a
    public final void d(k1.b bVar, int i10, int i11) {
        f(bVar, i10, i11);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Override // k1.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(k1.b r5) {
        /*
            r4 = this;
            l1.a r5 = (l1.a) r5
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r5.j0(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L9e
            r2 = 0
            if (r1 == 0) goto L17
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = r2
        L18:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L6f
            k1.a r1 = new k1.a
            java.lang.String r3 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r3, r0)
            android.database.Cursor r1 = r5.f(r1)
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L34
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L6a
            goto L35
        L34:
            r2 = r0
        L35:
            r1.close()
            java.lang.String r1 = r4.f4768d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L81
            java.lang.String r1 = r4.f4769e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            goto L81
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", found: "
            r0.append(r1)
            java.lang.String r1 = r4.f4768d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L6a:
            r5 = move-exception
            r1.close()
            throw r5
        L6f:
            g1.a0$a r1 = r4.f4767c
            g1.a0$b r1 = r1.g(r5)
            boolean r2 = r1.f4771a
            if (r2 == 0) goto L89
            g1.a0$a r1 = r4.f4767c
            r1.e()
            r4.g(r5)
        L81:
            g1.a0$a r1 = r4.f4767c
            r1.d(r5)
            r4.f4766b = r0
            return
        L89:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r0 = androidx.activity.result.a.c(r0)
            java.lang.String r1 = r1.f4772b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L9e:
            r5 = move-exception
            r0.close()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.a0.e(k1.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0077 A[EDGE_INSN: B:58:0x0077->B:34:0x0077 ?: BREAK  , SYNTHETIC] */
    @Override // k1.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(k1.b r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.a0.f(k1.b, int, int):void");
    }

    public final void g(k1.b bVar) {
        l1.a aVar = (l1.a) bVar;
        aVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f4768d;
        f.e(str, "hash");
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR REPLACE INTO ");
        sb.append("room_master_table");
        sb.append(" (");
        sb.append("id");
        sb.append(',');
        b1.b(sb, "identity_hash", ") VALUES(", "42", ", '");
        sb.append(str);
        sb.append("')");
        aVar.n(sb.toString());
    }
}
