package k9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import d.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import l3.s;
import m4.dq1;
import m4.es;
import m4.jo;
import m4.nu1;
import m4.po;
import m4.rk1;
import m4.sl;
import m4.x92;
import n3.g1;
import n9.c;
import org.json.JSONArray;
import org.json.JSONObject;
import v8.e;
import x8.d;

/* loaded from: classes.dex */
public final class u implements rk1, nu1 {

    /* renamed from: s */
    public static final /* synthetic */ u f5691s = new u();

    /* renamed from: t */
    public static final dq1 f5692t = new dq1();

    /* renamed from: u */
    public static final /* synthetic */ u f5693u = new u();

    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d dVar) {
        String str;
        if (dVar instanceof c) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            str = b.a(th);
        }
        Throwable a10 = e.a(str);
        String str2 = str;
        if (a10 != null) {
            str2 = ((Object) dVar.getClass().getName()) + '@' + b(dVar);
        }
        return (String) str2;
    }

    public static int d(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11;
        Cursor k10 = k(sQLiteDatabase, i10);
        if (k10.getCount() > 0) {
            k10.moveToNext();
            i11 = k10.getInt(k10.getColumnIndexOrThrow("value"));
        } else {
            i11 = 0;
        }
        k10.close();
        return i11;
    }

    public static String e(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (i(optJSONArray2, str) && !i(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static Date f(long j3) {
        return new Date((j3 - 2082844800) * 1000);
    }

    public static long g(SQLiteDatabase sQLiteDatabase) {
        long j3;
        Cursor k10 = k(sQLiteDatabase, 2);
        if (k10.getCount() > 0) {
            k10.moveToNext();
            j3 = k10.getLong(k10.getColumnIndexOrThrow("value"));
        } else {
            j3 = 0;
        }
        k10.close();
        return j3;
    }

    public static boolean i(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String optString = jSONArray.optString(i10);
                try {
                } catch (PatternSyntaxException e10) {
                    s.B.f5793g.g(e10, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if ((((Boolean) jo.f10145d.f10148c.a(es.G6)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList j(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(sl.E(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (x92 e10) {
                g1.g("Unable to deserialize proto from offline signals database:");
                g1.g(e10.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static Cursor k(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    @Override // m4.rk1
    public void h(Object obj) {
        ((po) obj).e();
    }

    @Override // m4.nu1
    /* renamed from: zza */
    public Object mo19zza() {
        return -1;
    }
}
