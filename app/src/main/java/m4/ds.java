package m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ds implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g */
    public Context f7622g;

    /* renamed from: a */
    public final Object f7616a = new Object();

    /* renamed from: b */
    public final ConditionVariable f7617b = new ConditionVariable();

    /* renamed from: c */
    public volatile boolean f7618c = false;

    /* renamed from: d */
    public volatile boolean f7619d = false;

    /* renamed from: e */
    public SharedPreferences f7620e = null;

    /* renamed from: f */
    public Bundle f7621f = new Bundle();

    /* renamed from: h */
    public JSONObject f7623h = new JSONObject();

    public final <T> T a(yr<T> yrVar) {
        if (!this.f7617b.block(5000L)) {
            synchronized (this.f7616a) {
                if (!this.f7619d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f7618c || this.f7620e == null) {
            synchronized (this.f7616a) {
                if (this.f7618c && this.f7620e != null) {
                }
                return yrVar.f15893c;
            }
        }
        int i10 = yrVar.f15891a;
        if (i10 == 2) {
            Bundle bundle = this.f7621f;
            if (bundle == null) {
                return yrVar.f15893c;
            }
            return yrVar.b(bundle);
        } else if (i10 == 1 && this.f7623h.has(yrVar.f15892b)) {
            return yrVar.a(this.f7623h);
        } else {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return yrVar.c(this.f7620e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
    }

    public final void b() {
        if (this.f7620e == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            String string = this.f7620e.getString("flag_configuration", "{}");
            StrictMode.setThreadPolicy(threadPolicy);
            this.f7623h = new JSONObject(string);
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            b();
        }
    }
}
