package m4;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import k4.b;
import l3.s;
import n3.g1;
import n3.r0;
import n3.s1;
import s4.c5;
import s4.s4;
import s4.t4;
import s4.z4;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class ps implements yp0, ko1, v91, z4 {

    /* renamed from: s */
    public final Object f12616s;

    /* renamed from: t */
    public final Object f12617t;

    public /* synthetic */ ps(int i10, int i11) {
        this.f12616s = i10 == 0 ? Collections.emptyList() : new ArrayList(i10);
        this.f12617t = i11 == 0 ? Collections.emptyList() : new ArrayList(i11);
    }

    public /* synthetic */ ps(qs qsVar) {
        this.f12617t = qsVar;
        this.f12616s = new HashMap();
    }

    public ps a(vd2 vd2Var) {
        ((List) this.f12617t).add(vd2Var);
        return this;
    }

    public ps b(vd2 vd2Var) {
        ((List) this.f12616s).add(vd2Var);
        return this;
    }

    public void c(String str, os osVar) {
        ((Map) this.f12616s).put(str, osVar);
    }

    public td2 d() {
        return new td2((List) this.f12616s, (List) this.f12617t);
    }

    @Override // m4.ko1
    /* renamed from: h */
    public Object mo30h(Object obj) {
        v61 v61Var = (v61) this.f12616s;
        w61 w61Var = (w61) this.f12617t;
        Objects.requireNonNull(v61Var);
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(w61Var.f14869a));
        contentValues.put("gws_query_id", w61Var.f14870b);
        contentValues.put("url", w61Var.f14871c);
        contentValues.put("event_state", Integer.valueOf(w61Var.f14872d - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        s1 s1Var = s.B.f5789c;
        r0 d5 = s1.d(v61Var.f14590s);
        if (d5 != null) {
            try {
                d5.zze(new b(v61Var.f14590s));
            } catch (RemoteException e10) {
                g1.b("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    @Override // m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }

    @Override // m4.yp0
    /* renamed from: zza */
    public Object mo28zza() {
        String str;
        String str2 = (String) this.f12617t;
        ContentResolver contentResolver = ((c5) this.f12616s).f17753a.getContentResolver();
        Uri uri = t4.f18103a;
        synchronized (t4.class) {
            str = null;
            if (t4.f18107e == null) {
                t4.f18106d.set(false);
                t4.f18107e = new HashMap<>();
                t4.f18112j = new Object();
                contentResolver.registerContentObserver(t4.f18103a, true, new s4());
            } else if (t4.f18106d.getAndSet(false)) {
                t4.f18107e.clear();
                t4.f18108f.clear();
                t4.f18109g.clear();
                t4.f18110h.clear();
                t4.f18111i.clear();
                t4.f18112j = new Object();
            }
            Object obj = t4.f18112j;
            if (t4.f18107e.containsKey(str2)) {
                String str3 = t4.f18107e.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                int length = t4.f18113k.length;
                Cursor query = contentResolver.query(t4.f18103a, null, null, new String[]{str2}, null);
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            synchronized (t4.class) {
                                if (obj == t4.f18112j) {
                                    t4.f18107e.put(str2, null);
                                }
                            }
                        } else {
                            String string = query.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (t4.class) {
                                if (obj == t4.f18112j) {
                                    t4.f18107e.put(str2, string);
                                }
                            }
                            if (string != null) {
                                str = string;
                            }
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return str;
    }

    @Override // m4.yp0
    /* renamed from: zza */
    public kq0 mo28zza() {
        byte[] bArr = (byte[]) this.f12617t;
        int i10 = ld0.N;
        return new gd0(new km2(bArr), bArr.length, ((yp0) this.f12616s).mo28zza());
    }

    public /* synthetic */ ps(Object obj, Object obj2) {
        this.f12616s = obj;
        this.f12617t = obj2;
    }
}
