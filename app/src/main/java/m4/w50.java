package m4;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Iterator;
import java.util.Objects;
import l3.s;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w50 extends x50 {

    /* renamed from: a */
    public final Object f14864a = new Object();

    /* renamed from: b */
    public final Context f14865b;

    /* renamed from: c */
    public SharedPreferences f14866c;

    /* renamed from: d */
    public final o00 f14867d;

    public w50(Context context, o00 o00Var) {
        this.f14865b = context.getApplicationContext();
        this.f14867d = o00Var;
    }

    public static JSONObject n(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", o90.s().f12051s);
            jSONObject.put("mf", mt.f11294a.e());
            jSONObject.put("cl", "428884702");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // m4.x50
    public final tz1<Void> b() {
        synchronized (this.f14864a) {
            if (this.f14866c == null) {
                this.f14866c = this.f14865b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        long j3 = this.f14866c.getLong("js_last_update", 0L);
        Objects.requireNonNull(s.B.f5796j);
        if (System.currentTimeMillis() - j3 < mt.f11295b.e().longValue()) {
            return mz1.m(null);
        }
        return mz1.o(this.f14867d.a(n(this.f14865b)), new cu1() { // from class: m4.v50
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection<m4.yr<?>>, java.util.ArrayList] */
            @Override // m4.cu1
            public final Object a(Object obj) {
                w50 w50Var = w50.this;
                JSONObject jSONObject = (JSONObject) obj;
                Context context = w50Var.f14865b;
                yr<String> yrVar = es.f8049a;
                jo joVar = jo.f10145d;
                as asVar = joVar.f10147b;
                SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
                zr zrVar = joVar.f10146a;
                at<Boolean> atVar = et.f8259a;
                Iterator it = zrVar.f16313a.iterator();
                while (it.hasNext()) {
                    yr yrVar2 = (yr) it.next();
                    if (yrVar2.f15891a == 1) {
                        yrVar2.d(edit, yrVar2.a(jSONObject));
                    }
                }
                if (jSONObject != null) {
                    edit.putString("flag_configuration", jSONObject.toString());
                } else {
                    g1.g("Flag Json is null.");
                }
                as asVar2 = jo.f10145d.f10147b;
                edit.commit();
                SharedPreferences.Editor edit2 = w50Var.f14866c.edit();
                Objects.requireNonNull(s.B.f5796j);
                edit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                return null;
            }
        }, u90.f14299f);
    }
}
