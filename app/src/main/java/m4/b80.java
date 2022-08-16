package m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b80 {

    /* renamed from: a */
    public final Map<String, a80> f6415a = new HashMap();

    /* renamed from: b */
    public final List<z70> f6416b = new ArrayList();

    /* renamed from: c */
    public final Context f6417c;

    /* renamed from: d */
    public final l70 f6418d;

    public b80(Context context, l70 l70Var) {
        this.f6417c = context;
        this.f6418d = l70Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, m4.a80>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, m4.a80>, java.util.HashMap] */
    public final synchronized void a(String str) {
        if (this.f6415a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.f6417c) : this.f6417c.getSharedPreferences(str, 0);
        a80 a80Var = new a80(this, str);
        this.f6415a.put(str, a80Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(a80Var);
    }
}
