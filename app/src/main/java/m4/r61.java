package m4;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import l3.s;
import n3.k1;

/* loaded from: classes.dex */
public final class r61 {

    /* renamed from: a */
    public final wj f13174a;

    /* renamed from: b */
    public final Context f13175b;

    /* renamed from: c */
    public final o90 f13176c;

    /* renamed from: d */
    public final String f13177d;

    /* renamed from: e */
    public final ep1 f13178e;

    /* renamed from: f */
    public final k1 f13179f = (k1) s.B.f5793g.c();

    public r61(Context context, o90 o90Var, wj wjVar, f61 f61Var, String str, ep1 ep1Var) {
        this.f13175b = context;
        this.f13176c = o90Var;
        this.f13174a = wjVar;
        this.f13177d = str;
        this.f13178e = ep1Var;
    }

    public static final void a(SQLiteDatabase sQLiteDatabase, ArrayList<sl> arrayList) {
        int size = arrayList.size();
        long j3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            sl slVar = arrayList.get(i10);
            if (slVar.R() == 2 && slVar.A() > j3) {
                j3 = slVar.A();
            }
        }
        if (j3 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j3));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }
}
