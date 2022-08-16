package b3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b3.b0;
import c3.b;
import e3.a;
import g1.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import q2.b;
import t2.i;
import t2.m;
import t2.n;
import t2.r;
import x2.a;
import x2.c;

/* loaded from: classes.dex */
public final class b0 implements d, c3.b, b3.c {

    /* renamed from: x */
    public static final q2.b f2495x = new q2.b("proto");

    /* renamed from: s */
    public final i0 f2496s;

    /* renamed from: t */
    public final d3.a f2497t;

    /* renamed from: u */
    public final d3.a f2498u;

    /* renamed from: v */
    public final e f2499v;

    /* renamed from: w */
    public final v2.a<String> f2500w;

    /* loaded from: classes.dex */
    public interface a<T, U> {
        U a(T t10);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final String f2501a;

        /* renamed from: b */
        public final String f2502b;

        public b(String str, String str2) {
            this.f2501a = str;
            this.f2502b = str2;
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
    }

    public b0(d3.a aVar, d3.a aVar2, e eVar, i0 i0Var, v2.a<String> aVar3) {
        this.f2496s = i0Var;
        this.f2497t = aVar;
        this.f2498u = aVar2;
        this.f2499v = eVar;
        this.f2500w = aVar3;
    }

    public static String Z(Iterable<j> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<j> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T d0(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // b3.d
    public final Iterable<r> E() {
        SQLiteDatabase H = H();
        H.beginTransaction();
        try {
            List list = (List) d0(H.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), q.f2536s);
            H.setTransactionSuccessful();
            return list;
        } finally {
            H.endTransaction();
        }
    }

    @Override // b3.c
    public final void G(final long j3, final c.a aVar, final String str) {
        L(new a() { // from class: b3.a0
            @Override // b3.b0.a
            public final Object a(Object obj) {
                String str2 = str;
                c.a aVar2 = aVar;
                long j10 = j3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (!((Boolean) b0.d0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(aVar2.f20014s)}), m.f2530s)).booleanValue()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(aVar2.f20014s));
                    contentValues.put("events_dropped_count", Long.valueOf(j10));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                } else {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(aVar2.f20014s)});
                }
                return null;
            }
        });
    }

    public final SQLiteDatabase H() {
        i0 i0Var = this.f2496s;
        Objects.requireNonNull(i0Var);
        long a10 = this.f2498u.a();
        while (true) {
            try {
                return i0Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f2498u.a() >= this.f2499v.a() + a10) {
                    throw new c3.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Long I(SQLiteDatabase sQLiteDatabase, r rVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(rVar.b(), String.valueOf(e3.a.a(rVar.d()))));
        if (rVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(rVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public final <T> T L(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase H = H();
        H.beginTransaction();
        try {
            T a10 = aVar.a(H);
            H.setTransactionSuccessful();
            return a10;
        } finally {
            H.endTransaction();
        }
    }

    @Override // b3.d
    public final Iterable<j> O(final r rVar) {
        return (Iterable) L(new a() { // from class: b3.z
            @Override // b3.b0.a
            public final Object a(Object obj) {
                final b0 b0Var = b0.this;
                final r rVar2 = rVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Objects.requireNonNull(b0Var);
                final List arrayList = new ArrayList();
                Long I = b0Var.I(sQLiteDatabase, rVar2);
                if (I != null) {
                    b0.d0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{I.toString()}, null, null, null, String.valueOf(b0Var.f2499v.c())), new b0.a() { // from class: b3.v
                        @Override // b3.b0.a
                        public final Object a(Object obj2) {
                            b bVar;
                            b bVar2;
                            b0 b0Var2 = b0.this;
                            List list = arrayList;
                            r rVar3 = rVar2;
                            Cursor cursor = (Cursor) obj2;
                            Objects.requireNonNull(b0Var2);
                            while (cursor.moveToNext()) {
                                long j3 = cursor.getLong(0);
                                boolean z10 = cursor.getInt(7) != 0;
                                n.a a10 = n.a();
                                a10.f(cursor.getString(1));
                                a10.e(cursor.getLong(2));
                                a10.g(cursor.getLong(3));
                                if (z10) {
                                    String string = cursor.getString(4);
                                    if (string == null) {
                                        bVar2 = b0.f2495x;
                                    } else {
                                        bVar2 = new b(string);
                                    }
                                    ((i.b) a10).f18523c = new m(bVar2, cursor.getBlob(5));
                                } else {
                                    String string2 = cursor.getString(4);
                                    if (string2 == null) {
                                        bVar = b0.f2495x;
                                    } else {
                                        bVar = new b(string2);
                                    }
                                    ((i.b) a10).f18523c = new m(bVar, (byte[]) b0.d0(b0Var2.H().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num"), g1.b.f4774u));
                                }
                                if (!cursor.isNull(6)) {
                                    ((i.b) a10).f18522b = Integer.valueOf(cursor.getInt(6));
                                }
                                list.add(new b(j3, rVar3, a10.c()));
                            }
                            return null;
                        }
                    });
                }
                final Map hashMap = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    sb.append(((j) arrayList.get(i10)).b());
                    if (i10 < arrayList.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                b0.d0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b0.a() { // from class: b3.l
                    @Override // b3.b0.a
                    public final Object a(Object obj2) {
                        Map map = hashMap;
                        Cursor cursor = (Cursor) obj2;
                        while (cursor.moveToNext()) {
                            long j3 = cursor.getLong(0);
                            Set set = (Set) map.get(Long.valueOf(j3));
                            if (set == null) {
                                set = new HashSet();
                                map.put(Long.valueOf(j3), set);
                            }
                            set.add(new b0.b(cursor.getString(1), cursor.getString(2)));
                        }
                        return null;
                    }
                });
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    j jVar = (j) listIterator.next();
                    if (hashMap.containsKey(Long.valueOf(jVar.b()))) {
                        n.a j3 = jVar.a().j();
                        for (b0.b bVar : (Set) hashMap.get(Long.valueOf(jVar.b()))) {
                            j3.b(bVar.f2501a, bVar.f2502b);
                        }
                        listIterator.set(new b(jVar.b(), jVar.c(), j3.c()));
                    }
                }
                return arrayList;
            }
        });
    }

    @Override // b3.d
    public final j S(final r rVar, final n nVar) {
        y2.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", rVar.d(), nVar.h(), rVar.b());
        long longValue = ((Long) L(new a() { // from class: b3.x
            @Override // b3.b0.a
            public final Object a(Object obj) {
                long j3;
                b0 b0Var = b0.this;
                n nVar2 = nVar;
                r rVar2 = rVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (b0Var.H().compileStatement("PRAGMA page_size").simpleQueryForLong() * b0Var.H().compileStatement("PRAGMA page_count").simpleQueryForLong() >= b0Var.f2499v.e()) {
                    b0Var.G(1L, c.a.CACHE_FULL, nVar2.h());
                    return -1L;
                }
                Long I = b0Var.I(sQLiteDatabase, rVar2);
                if (I != null) {
                    j3 = I.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", rVar2.b());
                    contentValues.put("priority", Integer.valueOf(a.a(rVar2.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (rVar2.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(rVar2.c(), 0));
                    }
                    j3 = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int d5 = b0Var.f2499v.d();
                byte[] bArr = nVar2.e().f18541b;
                boolean z10 = bArr.length <= d5;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(j3));
                contentValues2.put("transport_name", nVar2.h());
                contentValues2.put("timestamp_ms", Long.valueOf(nVar2.f()));
                contentValues2.put("uptime_ms", Long.valueOf(nVar2.i()));
                contentValues2.put("payload_encoding", nVar2.e().f18540a.f17139a);
                contentValues2.put("code", nVar2.d());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr : new byte[0]);
                long insert = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(bArr.length / d5);
                    for (int i10 = 1; i10 <= ceil; i10++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i10 - 1) * d5, Math.min(i10 * d5, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(nVar2.c()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b3.b(longValue, rVar, nVar);
    }

    @Override // b3.d
    public final void U(final r rVar, final long j3) {
        L(new a() { // from class: b3.s
            @Override // b3.b0.a
            public final Object a(Object obj) {
                long j10 = j3;
                r rVar2 = rVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{rVar2.b(), String.valueOf(a.a(rVar2.d()))}) < 1) {
                    contentValues.put("backend_name", rVar2.b());
                    contentValues.put("priority", Integer.valueOf(a.a(rVar2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // b3.d
    public final boolean V(final r rVar) {
        return ((Boolean) L(new a() { // from class: b3.y
            @Override // b3.b0.a
            public final Object a(Object obj) {
                b0 b0Var = b0.this;
                Long I = b0Var.I((SQLiteDatabase) obj, rVar);
                return I == null ? Boolean.FALSE : (Boolean) b0.d0(b0Var.H().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{I.toString()}), o.f2532s);
            }
        })).booleanValue();
    }

    /* JADX WARN: Finally extract failed */
    @Override // b3.d
    public final long X(r rVar) {
        Cursor rawQuery = H().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rVar.b(), String.valueOf(e3.a.a(rVar.d()))});
        try {
            Long valueOf = Long.valueOf(rawQuery.moveToNext() ? rawQuery.getLong(0) : 0L);
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public final Object Y(c cVar) {
        r2.b bVar = r2.b.f17232s;
        long a10 = this.f2498u.a();
        while (true) {
            try {
                ((y) cVar).b();
                return null;
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f2498u.a() >= this.f2499v.a() + a10) {
                    bVar.a(e10);
                    throw null;
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // c3.b
    public final <T> T b(b.a<T> aVar) {
        SQLiteDatabase H = H();
        Y(new y(H));
        try {
            T a10 = aVar.a();
            H.setTransactionSuccessful();
            return a10;
        } finally {
            H.endTransaction();
        }
    }

    @Override // b3.d
    public final void b0(Iterable<j> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        c10.append(Z(iterable));
        String sb = c10.toString();
        SQLiteDatabase H = H();
        H.beginTransaction();
        try {
            H.compileStatement(sb).execute();
            Cursor rawQuery = H.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
            Objects.requireNonNull(this);
            while (rawQuery.moveToNext()) {
                int i10 = rawQuery.getInt(0);
                G(i10, c.a.MAX_RETRIES_REACHED, rawQuery.getString(1));
            }
            rawQuery.close();
            H.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
            H.setTransactionSuccessful();
        } finally {
            H.endTransaction();
        }
    }

    @Override // b3.c
    public final x2.a c() {
        int i10 = x2.a.f19996e;
        final a.C0148a c0148a = new a.C0148a();
        final HashMap hashMap = new HashMap();
        SQLiteDatabase H = H();
        H.beginTransaction();
        try {
            x2.a aVar = (x2.a) d0(H.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new a() { // from class: b3.w
                @Override // b3.b0.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r10) {
                    /*
                        Method dump skipped, instructions count: 284
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: b3.w.a(java.lang.Object):java.lang.Object");
                }
            });
            H.setTransactionSuccessful();
            return aVar;
        } finally {
            H.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2496s.close();
    }

    @Override // b3.d
    public final int i() {
        final long a10 = this.f2497t.a() - this.f2499v.b();
        return ((Integer) L(new a() { // from class: b3.u
            @Override // b3.b0.a
            public final Object a(Object obj) {
                final b0 b0Var = b0.this;
                long j3 = a10;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Objects.requireNonNull(b0Var);
                String[] strArr = {String.valueOf(j3)};
                b0.d0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b0.a() { // from class: b3.t
                    @Override // b3.b0.a
                    public final Object a(Object obj2) {
                        b0 b0Var2 = b0.this;
                        Cursor cursor = (Cursor) obj2;
                        Objects.requireNonNull(b0Var2);
                        while (cursor.moveToNext()) {
                            int i10 = cursor.getInt(0);
                            b0Var2.G(i10, c.a.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        return null;
                    }
                });
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // b3.c
    public final void j() {
        L(new n(this));
    }

    @Override // b3.d
    public final void k(Iterable<j> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("DELETE FROM events WHERE _id in ");
        c10.append(Z(iterable));
        H().compileStatement(c10.toString()).execute();
    }
}
