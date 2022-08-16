package y4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.a;
import d4.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import s4.hb;
import s4.n3;
import s4.o3;
import s4.x3;
import s4.y3;

/* loaded from: classes.dex */
public final class i extends v5 {

    /* renamed from: x */
    public static final String[] f20498x = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] y = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: z */
    public static final String[] f20499z = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    public static final String[] A = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] B = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] C = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] D = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] E = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: w */
    public final r5 f20501w = new r5(((w2) this.f20505s).F);

    /* renamed from: v */
    public final h f20500v = new h(this, ((w2) this.f20505s).f20786s);

    public i(a6 a6Var) {
        super(a6Var);
        Objects.requireNonNull((w2) this.f20505s);
    }

    public static final void v(ContentValues contentValues, Object obj) {
        m.e("value");
        Objects.requireNonNull(obj, "null reference");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put("value", (Double) obj);
        }
    }

    public final long A(String str) {
        m.e(str);
        return y("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase D() {
        g();
        try {
            return this.f20500v.getWritableDatabase();
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().A.b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:41:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle E(java.lang.String r8) {
        /*
            r7 = this;
            r7.g()
            r7.h()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.D()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            y4.k3 r8 = r7.f20505s     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            y4.w2 r8 = (y4.w2) r8     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            y4.s1 r8 = r8.C()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            y4.q1 r8 = r8.F     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            s4.n3 r3 = s4.o3.w()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            s4.w5 r2 = y4.c6.D(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            s4.n3 r2 = (s4.n3) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            s4.b7 r2 = r2.f()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            s4.o3 r2 = (s4.o3) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            y4.a6 r8 = r7.f20760t     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.P()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.A()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            s4.s3 r3 = (s4.s3) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.y()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.L()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.s()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.M()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.t()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.P()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.z()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.N()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.v()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            y4.k3 r3 = r7.f20505s     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            y4.w2 r3 = (y4.w2) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            y4.s1 r3 = r3.C()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            y4.q1 r3 = r3.f20710x     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = y4.s1.s(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            y4.k3 r2 = r7.f20505s     // Catch: java.lang.Throwable -> Ld5
            y4.w2 r2 = (y4.w2) r2     // Catch: java.lang.Throwable -> Ld5
            y4.s1 r2 = r2.C()     // Catch: java.lang.Throwable -> Ld5
            y4.q1 r2 = r2.f20710x     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.E(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0292: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:80:0x0292 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0171 A[Catch: SQLiteException -> 0x0272, all -> 0x0291, TryCatch #0 {all -> 0x0291, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00ca, B:15:0x00d4, B:19:0x00f1, B:23:0x0110, B:27:0x012f, B:31:0x014e, B:34:0x0171, B:35:0x0176, B:39:0x019c, B:43:0x01bb, B:45:0x01d9, B:48:0x01e3, B:49:0x01e7, B:50:0x01ea, B:52:0x01f2, B:56:0x01fa, B:59:0x020f, B:60:0x0213, B:62:0x021e, B:63:0x0230, B:65:0x0241, B:66:0x024a, B:68:0x025b, B:75:0x0278), top: B:84:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d9 A[Catch: SQLiteException -> 0x0272, all -> 0x0291, TryCatch #0 {all -> 0x0291, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00ca, B:15:0x00d4, B:19:0x00f1, B:23:0x0110, B:27:0x012f, B:31:0x014e, B:34:0x0171, B:35:0x0176, B:39:0x019c, B:43:0x01bb, B:45:0x01d9, B:48:0x01e3, B:49:0x01e7, B:50:0x01ea, B:52:0x01f2, B:56:0x01fa, B:59:0x020f, B:60:0x0213, B:62:0x021e, B:63:0x0230, B:65:0x0241, B:66:0x024a, B:68:0x025b, B:75:0x0278), top: B:84:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020f A[Catch: SQLiteException -> 0x0272, all -> 0x0291, TryCatch #0 {all -> 0x0291, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00ca, B:15:0x00d4, B:19:0x00f1, B:23:0x0110, B:27:0x012f, B:31:0x014e, B:34:0x0171, B:35:0x0176, B:39:0x019c, B:43:0x01bb, B:45:0x01d9, B:48:0x01e3, B:49:0x01e7, B:50:0x01ea, B:52:0x01f2, B:56:0x01fa, B:59:0x020f, B:60:0x0213, B:62:0x021e, B:63:0x0230, B:65:0x0241, B:66:0x024a, B:68:0x025b, B:75:0x0278), top: B:84:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021e A[Catch: SQLiteException -> 0x0272, all -> 0x0291, TryCatch #0 {all -> 0x0291, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00ca, B:15:0x00d4, B:19:0x00f1, B:23:0x0110, B:27:0x012f, B:31:0x014e, B:34:0x0171, B:35:0x0176, B:39:0x019c, B:43:0x01bb, B:45:0x01d9, B:48:0x01e3, B:49:0x01e7, B:50:0x01ea, B:52:0x01f2, B:56:0x01fa, B:59:0x020f, B:60:0x0213, B:62:0x021e, B:63:0x0230, B:65:0x0241, B:66:0x024a, B:68:0x025b, B:75:0x0278), top: B:84:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0241 A[Catch: SQLiteException -> 0x0272, all -> 0x0291, TryCatch #0 {all -> 0x0291, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00ca, B:15:0x00d4, B:19:0x00f1, B:23:0x0110, B:27:0x012f, B:31:0x014e, B:34:0x0171, B:35:0x0176, B:39:0x019c, B:43:0x01bb, B:45:0x01d9, B:48:0x01e3, B:49:0x01e7, B:50:0x01ea, B:52:0x01f2, B:56:0x01fa, B:59:0x020f, B:60:0x0213, B:62:0x021e, B:63:0x0230, B:65:0x0241, B:66:0x024a, B:68:0x025b, B:75:0x0278), top: B:84:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025b A[Catch: SQLiteException -> 0x0272, all -> 0x0291, TRY_LEAVE, TryCatch #0 {all -> 0x0291, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00ca, B:15:0x00d4, B:19:0x00f1, B:23:0x0110, B:27:0x012f, B:31:0x014e, B:34:0x0171, B:35:0x0176, B:39:0x019c, B:43:0x01bb, B:45:0x01d9, B:48:0x01e3, B:49:0x01e7, B:50:0x01ea, B:52:0x01f2, B:56:0x01fa, B:59:0x020f, B:60:0x0213, B:62:0x021e, B:63:0x0230, B:65:0x0241, B:66:0x024a, B:68:0x025b, B:75:0x0278), top: B:84:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y4.z2 F(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.F(java.lang.String):y4.z2");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y4.b G(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.G(java.lang.String, java.lang.String):y4.b");
    }

    public final g H(long j3, String str, boolean z10, boolean z11) {
        return I(j3, str, 1L, false, false, z10, false, z11);
    }

    public final g I(long j3, String str, long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        m.e(str);
        g();
        h();
        String[] strArr = {str};
        g gVar = new g();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase D2 = D();
                Cursor query = D2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    ((w2) this.f20505s).C().A.b("Not updating daily counts, app is not known. appId", s1.s(str));
                    query.close();
                    return gVar;
                }
                if (query.getLong(0) == j3) {
                    gVar.f20462b = query.getLong(1);
                    gVar.f20461a = query.getLong(2);
                    gVar.f20463c = query.getLong(3);
                    gVar.f20464d = query.getLong(4);
                    gVar.f20465e = query.getLong(5);
                }
                if (z10) {
                    gVar.f20462b += j10;
                }
                if (z11) {
                    gVar.f20461a += j10;
                }
                if (z12) {
                    gVar.f20463c += j10;
                }
                if (z13) {
                    gVar.f20464d += j10;
                }
                if (z14) {
                    gVar.f20465e += j10;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j3));
                contentValues.put("daily_public_events_count", Long.valueOf(gVar.f20461a));
                contentValues.put("daily_events_count", Long.valueOf(gVar.f20462b));
                contentValues.put("daily_conversions_count", Long.valueOf(gVar.f20463c));
                contentValues.put("daily_error_events_count", Long.valueOf(gVar.f20464d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.f20465e));
                D2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return gVar;
            } catch (SQLiteException e10) {
                ((w2) this.f20505s).C().f20710x.c("Error updating daily counts. appId", s1.s(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return gVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y4.m J(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.J(java.lang.String, java.lang.String):y4.m");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:26:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y4.f6 K(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            d4.m.e(r20)
            d4.m.e(r21)
            r19.g()
            r19.h()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.D()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.L(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            y4.f6 r0 = new y4.f6     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            y4.k3 r2 = r1.f20505s     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            y4.w2 r2 = (y4.w2) r2     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            y4.s1 r2 = r2.C()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            y4.q1 r2 = r2.f20710x     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = y4.s1.s(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.b(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            y4.k3 r2 = r1.f20505s     // Catch: java.lang.Throwable -> La2
            y4.w2 r2 = (y4.w2) r2     // Catch: java.lang.Throwable -> La2
            y4.s1 r2 = r2.C()     // Catch: java.lang.Throwable -> La2
            y4.q1 r2 = r2.f20710x     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = y4.s1.s(r20)     // Catch: java.lang.Throwable -> La2
            y4.k3 r5 = r1.f20505s     // Catch: java.lang.Throwable -> La2
            y4.w2 r5 = (y4.w2) r5     // Catch: java.lang.Throwable -> La2
            y4.n1 r5 = r5.E     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.f(r9)     // Catch: java.lang.Throwable -> La2
            r2.d(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.K(java.lang.String, java.lang.String):y4.f6");
    }

    public final Object L(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            ((w2) this.f20505s).C().f20710x.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                ((w2) this.f20505s).C().f20710x.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            ((w2) this.f20505s).C().f20710x.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String M() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.D()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r1 = move-exception
            goto L3c
        L20:
            r2 = move-exception
            goto L27
        L22:
            r0 = move-exception
            goto L3f
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            y4.k3 r3 = r6.f20505s     // Catch: java.lang.Throwable -> L1e
            y4.w2 r3 = (y4.w2) r3     // Catch: java.lang.Throwable -> L1e
            y4.s1 r3 = r3.C()     // Catch: java.lang.Throwable -> L1e
            y4.q1 r3 = r3.f20710x     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            r5 = r1
            r1 = r0
            r0 = r5
        L3f:
            if (r1 == 0) goto L44
            r1.close()
        L44:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.M():java.lang.String");
    }

    public final List<b> N(String str, String str2, String str3) {
        m.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return O(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
        r2 = ((y4.w2) r27.f20505s).C().f20710x;
        java.util.Objects.requireNonNull((y4.w2) r27.f20505s);
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<y4.b> O(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.O(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List<f6> P(String str) {
        m.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                Objects.requireNonNull((w2) this.f20505s);
                cursor = D().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j3 = cursor.getLong(2);
                    Object L = L(cursor, 3);
                    if (L == null) {
                        ((w2) this.f20505s).C().f20710x.b("Read invalid user property value, ignoring it. appId", s1.s(str));
                    } else {
                        arrayList.add(new f6(str, str2, string, j3, L));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                ((w2) this.f20505s).C().f20710x.c("Error querying user properties. appId", s1.s(str), e10);
                List<f6> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
        r2 = ((y4.w2) r16.f20505s).C().f20710x;
        java.util.Objects.requireNonNull((y4.w2) r16.f20505s);
        r2.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<y4.f6> Q(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.Q(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void R() {
        h();
        D().beginTransaction();
    }

    public final void S(List<Long> list) {
        Objects.requireNonNull(list, "null reference");
        g();
        h();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 != 0) {
                sb.append(",");
            }
            sb.append(list.get(i10).longValue());
        }
        sb.append(")");
        int delete = D().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            ((w2) this.f20505s).C().f20710x.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final void T() {
        h();
        D().endTransaction();
    }

    public final void U(List<Long> list) {
        g();
        h();
        if (list.size() != 0) {
            if (!q()) {
                return;
            }
            String join = TextUtils.join(",", list);
            String b10 = a.b(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (x(a.b(new StringBuilder(String.valueOf(b10).length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", b10, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                ((w2) this.f20505s).C().A.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase D2 = D();
                StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(b10);
                sb.append(" AND (retry_count IS NULL OR retry_count < ");
                sb.append(Integer.MAX_VALUE);
                sb.append(")");
                D2.execSQL(sb.toString());
                return;
            } catch (SQLiteException e10) {
                ((w2) this.f20505s).C().f20710x.b("Error incrementing retry count. error", e10);
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @Override // y4.v5
    public final void j() {
    }

    public final void k() {
        g();
        h();
        if (q()) {
            long a10 = this.f20760t.A.y.a();
            Objects.requireNonNull(((w2) this.f20505s).F);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a10);
            Objects.requireNonNull((w2) this.f20505s);
            if (abs <= f1.y.a(null).longValue()) {
                return;
            }
            this.f20760t.A.y.b(elapsedRealtime);
            g();
            h();
            if (!q()) {
                return;
            }
            SQLiteDatabase D2 = D();
            Objects.requireNonNull(((w2) this.f20505s).F);
            Objects.requireNonNull((w2) this.f20505s);
            int delete = D2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(e.h())});
            if (delete <= 0) {
                return;
            }
            ((w2) this.f20505s).C().F.b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
        }
    }

    public final void l(String str, String str2) {
        m.e(str);
        m.e(str2);
        g();
        h();
        try {
            D().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.d("Error deleting user property. appId", s1.s(str), ((w2) this.f20505s).E.f(str2), e10);
        }
    }

    public final void m() {
        h();
        D().setTransactionSuccessful();
    }

    public final void n(z2 z2Var) {
        g();
        h();
        String M = z2Var.M();
        m.h(M);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", M);
        contentValues.put("app_instance_id", z2Var.N());
        contentValues.put("gmp_app_id", z2Var.S());
        z2Var.f20834a.B().g();
        contentValues.put("resettable_device_id_hash", z2Var.f20838e);
        contentValues.put("last_bundle_index", Long.valueOf(z2Var.I()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(z2Var.J()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(z2Var.H()));
        contentValues.put("app_version", z2Var.P());
        contentValues.put("app_store", z2Var.O());
        contentValues.put("gmp_version", Long.valueOf(z2Var.G()));
        contentValues.put("dev_cert_hash", Long.valueOf(z2Var.D()));
        contentValues.put("measurement_enabled", Boolean.valueOf(z2Var.A()));
        z2Var.f20834a.B().g();
        contentValues.put("day", Long.valueOf(z2Var.f20855w));
        z2Var.f20834a.B().g();
        contentValues.put("daily_public_events_count", Long.valueOf(z2Var.f20856x));
        z2Var.f20834a.B().g();
        contentValues.put("daily_events_count", Long.valueOf(z2Var.y));
        z2Var.f20834a.B().g();
        contentValues.put("daily_conversions_count", Long.valueOf(z2Var.f20857z));
        z2Var.f20834a.B().g();
        contentValues.put("config_fetched_time", Long.valueOf(z2Var.E));
        z2Var.f20834a.B().g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(z2Var.F));
        contentValues.put("app_version_int", Long.valueOf(z2Var.B()));
        contentValues.put("firebase_instance_id", z2Var.Q());
        z2Var.f20834a.B().g();
        contentValues.put("daily_error_events_count", Long.valueOf(z2Var.A));
        z2Var.f20834a.B().g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(z2Var.B));
        z2Var.f20834a.B().g();
        contentValues.put("health_monitor_sample", z2Var.C);
        contentValues.put("android_id", Long.valueOf(z2Var.r()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(z2Var.z()));
        contentValues.put("admob_app_id", z2Var.K());
        contentValues.put("dynamite_version", Long.valueOf(z2Var.E()));
        List<String> a10 = z2Var.a();
        if (a10 != null) {
            if (a10.size() == 0) {
                ((w2) this.f20505s).C().A.b("Safelisted events should not be an empty list. appId", M);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", a10));
            }
        }
        hb.b();
        if (((w2) this.f20505s).y.s(M, f1.f20404d0)) {
            contentValues.put("ga_app_id", z2Var.R());
        }
        try {
            SQLiteDatabase D2 = D();
            if (D2.update("apps", contentValues, "app_id = ?", new String[]{M}) != 0 || D2.insertWithOnConflict("apps", null, contentValues, 5) != -1) {
                return;
            }
            ((w2) this.f20505s).C().f20710x.b("Failed to insert/update app (got -1). appId", s1.s(M));
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.c("Error storing app. appId", s1.s(M), e10);
        }
    }

    public final void o(m mVar) {
        Objects.requireNonNull(mVar, "null reference");
        g();
        h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", mVar.f20559a);
        contentValues.put("name", mVar.f20560b);
        contentValues.put("lifetime_count", Long.valueOf(mVar.f20561c));
        contentValues.put("current_bundle_count", Long.valueOf(mVar.f20562d));
        contentValues.put("last_fire_timestamp", Long.valueOf(mVar.f20564f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(mVar.f20565g));
        contentValues.put("last_bundled_day", mVar.f20566h);
        contentValues.put("last_sampled_complex_event_id", mVar.f20567i);
        contentValues.put("last_sampling_rate", mVar.f20568j);
        contentValues.put("current_session_count", Long.valueOf(mVar.f20563e));
        Boolean bool = mVar.f20569k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (D().insertWithOnConflict("events", null, contentValues, 5) != -1) {
                return;
            }
            ((w2) this.f20505s).C().f20710x.b("Failed to insert/update event aggregates (got -1). appId", s1.s(mVar.f20559a));
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.c("Error storing event aggregates. appId", s1.s(mVar.f20559a), e10);
        }
    }

    public final void p(String str, byte[] bArr, String str2) {
        m.e(str);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (D().update("apps", contentValues, "app_id = ?", new String[]{str}) != 0) {
                return;
            }
            ((w2) this.f20505s).C().f20710x.b("Failed to update remote config (got 0). appId", s1.s(str));
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.c("Error storing remote config. appId", s1.s(str), e10);
        }
    }

    public final boolean q() {
        w2 w2Var = (w2) this.f20505s;
        Context context = w2Var.f20786s;
        Objects.requireNonNull(w2Var);
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean r(String str, Long l10, long j3, o3 o3Var) {
        g();
        h();
        Objects.requireNonNull(o3Var, "null reference");
        m.e(str);
        byte[] i10 = o3Var.i();
        ((w2) this.f20505s).C().F.c("Saving complex main event, appId, data size", ((w2) this.f20505s).E.d(str), Integer.valueOf(i10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j3));
        contentValues.put("main_event", i10);
        try {
            if (D().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            ((w2) this.f20505s).C().f20710x.b("Failed to insert complex main event (got -1). appId", s1.s(str));
            return false;
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.c("Error storing complex main event. appId", s1.s(str), e10);
            return false;
        }
    }

    public final boolean s(b bVar) {
        g();
        h();
        String str = bVar.f20299s;
        m.h(str);
        if (K(str, bVar.f20301u.f20363t) == null) {
            long x10 = x("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            Objects.requireNonNull((w2) this.f20505s);
            if (x10 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", bVar.f20300t);
        contentValues.put("name", bVar.f20301u.f20363t);
        Object s10 = bVar.f20301u.s();
        Objects.requireNonNull(s10, "null reference");
        v(contentValues, s10);
        contentValues.put("active", Boolean.valueOf(bVar.f20303w));
        contentValues.put("trigger_event_name", bVar.f20304x);
        contentValues.put("trigger_timeout", Long.valueOf(bVar.f20305z));
        contentValues.put("timed_out_event", ((w2) this.f20505s).z().b0(bVar.y));
        contentValues.put("creation_timestamp", Long.valueOf(bVar.f20302v));
        contentValues.put("triggered_event", ((w2) this.f20505s).z().b0(bVar.A));
        contentValues.put("triggered_timestamp", Long.valueOf(bVar.f20301u.f20364u));
        contentValues.put("time_to_live", Long.valueOf(bVar.B));
        contentValues.put("expired_event", ((w2) this.f20505s).z().b0(bVar.C));
        try {
            if (D().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                ((w2) this.f20505s).C().f20710x.b("Failed to insert/update conditional user property (got -1)", s1.s(str));
            }
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.c("Error storing conditional user property", s1.s(str), e10);
        }
        return true;
    }

    public final boolean t(f6 f6Var) {
        g();
        h();
        if (K(f6Var.f20456a, f6Var.f20458c) == null) {
            if (h6.W(f6Var.f20458c)) {
                if (x("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{f6Var.f20456a}) >= ((w2) this.f20505s).y.n(f6Var.f20456a, f1.G, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(f6Var.f20458c)) {
                long x10 = x("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{f6Var.f20456a, f6Var.f20457b});
                Objects.requireNonNull((w2) this.f20505s);
                if (x10 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f6Var.f20456a);
        contentValues.put("origin", f6Var.f20457b);
        contentValues.put("name", f6Var.f20458c);
        contentValues.put("set_timestamp", Long.valueOf(f6Var.f20459d));
        v(contentValues, f6Var.f20460e);
        try {
            if (D().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                ((w2) this.f20505s).C().f20710x.b("Failed to insert/update user property (got -1). appId", s1.s(f6Var.f20456a));
            }
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.c("Error storing user property. appId", s1.s(f6Var.f20456a), e10);
        }
        return true;
    }

    public final void u(long j3, long j10, z5 z5Var) {
        Cursor cursor;
        SQLiteException e10;
        String str;
        int i10;
        String[] strArr;
        String str2;
        g();
        h();
        String str3 = null;
        str3 = null;
        str3 = null;
        Cursor cursor2 = null;
        try {
            try {
                try {
                    SQLiteDatabase D2 = D();
                    String str4 = "";
                    try {
                        if (TextUtils.isEmpty(null)) {
                            int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                            String[] strArr2 = i11 != 0 ? new String[]{String.valueOf(j10), String.valueOf(j3)} : new String[]{String.valueOf(j3)};
                            if (i11 != 0) {
                                str4 = "rowid <= ? and ";
                            }
                            StringBuilder sb = new StringBuilder(str4.length() + 148);
                            sb.append("select app_id, metadata_fingerprint from raw_events where ");
                            sb.append(str4);
                            sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                            cursor = D2.rawQuery(sb.toString(), strArr2);
                            if (!cursor.moveToFirst()) {
                                cursor.close();
                                return;
                            } else {
                                str3 = cursor.getString(0);
                                str = cursor.getString(1);
                            }
                        } else {
                            int i12 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                            String[] strArr3 = i12 != 0 ? new String[]{null, String.valueOf(j10)} : new String[]{null};
                            if (i12 != 0) {
                                str4 = " and rowid <= ?";
                            }
                            StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                            sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb2.append(str4);
                            sb2.append(" order by rowid limit 1;");
                            cursor = D2.rawQuery(sb2.toString(), strArr3);
                            if (!cursor.moveToFirst()) {
                                cursor.close();
                                return;
                            }
                            str = cursor.getString(0);
                        }
                        cursor.close();
                        String str5 = str3;
                        String str6 = str;
                        try {
                            Cursor query = D2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str5, str6}, null, null, "rowid", "2");
                            if (!query.moveToFirst()) {
                                ((w2) this.f20505s).C().f20710x.b("Raw event metadata record is missing. appId", s1.s(str5));
                                query.close();
                                return;
                            }
                            try {
                                y3 f10 = ((x3) c6.D(y3.z1(), query.getBlob(0))).f();
                                if (query.moveToNext()) {
                                    ((w2) this.f20505s).C().A.b("Get multiple raw event metadata records, expected one. appId", s1.s(str5));
                                }
                                query.close();
                                z5Var.f20868a = f10;
                                if (j10 != -1) {
                                    str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    i10 = 1;
                                    strArr = new String[]{str5, str6, String.valueOf(j10)};
                                } else {
                                    i10 = 1;
                                    str2 = "app_id = ? and metadata_fingerprint = ?";
                                    strArr = new String[]{str5, str6};
                                }
                                Cursor query2 = D2.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                if (!query2.moveToFirst()) {
                                    ((w2) this.f20505s).C().A.b("Raw event data disappeared while in transaction. appId", s1.s(str5));
                                    query2.close();
                                    return;
                                }
                                do {
                                    long j11 = query2.getLong(0);
                                    try {
                                        n3 n3Var = (n3) c6.D(o3.w(), query2.getBlob(3));
                                        n3Var.r(query2.getString(i10));
                                        long j12 = query2.getLong(2);
                                        if (n3Var.f18206u) {
                                            n3Var.h();
                                            n3Var.f18206u = false;
                                        }
                                        o3.H((o3) n3Var.f18205t, j12);
                                        if (!z5Var.a(j11, n3Var.f())) {
                                            query2.close();
                                            return;
                                        }
                                    } catch (IOException e11) {
                                        ((w2) this.f20505s).C().f20710x.c("Data loss. Failed to merge raw event. appId", s1.s(str5), e11);
                                    }
                                } while (query2.moveToNext());
                                query2.close();
                            } catch (IOException e12) {
                                ((w2) this.f20505s).C().f20710x.c("Data loss. Failed to merge raw event metadata. appId", s1.s(str5), e12);
                                query.close();
                            }
                        } catch (SQLiteException e13) {
                            e10 = e13;
                            cursor = cursor;
                            str3 = str5;
                            ((w2) this.f20505s).C().f20710x.c("Data loss. Error selecting raw event. appId", s1.s(str3), e10);
                            if (cursor == null) {
                                return;
                            }
                            cursor.close();
                        }
                    } catch (SQLiteException e14) {
                        e10 = e14;
                    }
                } catch (SQLiteException e15) {
                    e10 = e15;
                    cursor = null;
                }
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
        }
    }

    public final int w(String str, String str2) {
        m.e(str);
        m.e(str2);
        g();
        h();
        try {
            return D().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.d("Error deleting conditional property", s1.s(str), ((w2) this.f20505s).E.f(str2), e10);
            return 0;
        }
    }

    public final long x(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = D().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            } catch (SQLiteException e10) {
                ((w2) this.f20505s).C().f20710x.c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long y(String str, String[] strArr, long j3) {
        Cursor cursor = null;
        try {
            try {
                cursor = D().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j3;
                }
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                ((w2) this.f20505s).C().f20710x.c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long z(String str) {
        long j3;
        SQLiteException e10;
        ContentValues contentValues;
        m.e(str);
        m.e("first_open_count");
        g();
        h();
        SQLiteDatabase D2 = D();
        D2.beginTransaction();
        try {
            try {
                j3 = y("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j3 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (D2.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        ((w2) this.f20505s).C().f20710x.c("Failed to insert column (got -1). appId", s1.s(str), "first_open_count");
                        return -1L;
                    }
                    j3 = 0;
                }
            } finally {
                D2.endTransaction();
            }
        } catch (SQLiteException e11) {
            j3 = 0;
            e10 = e11;
        }
        try {
            contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", Long.valueOf(1 + j3));
        } catch (SQLiteException e12) {
            e10 = e12;
            ((w2) this.f20505s).C().f20710x.d("Error inserting column. appId", s1.s(str), "first_open_count", e10);
            return j3;
        }
        if (D2.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
            ((w2) this.f20505s).C().f20710x.c("Failed to update column (got 0). appId", s1.s(str), "first_open_count");
            return -1L;
        }
        D2.setTransactionSuccessful();
        return j3;
    }
}
