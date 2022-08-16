package m4;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class yr<T> {

    /* renamed from: a */
    public final int f15891a;

    /* renamed from: b */
    public final String f15892b;

    /* renamed from: c */
    public final T f15893c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection<m4.yr<?>>, java.util.ArrayList] */
    public yr(int i10, String str, Object obj) {
        this.f15891a = i10;
        this.f15892b = str;
        this.f15893c = obj;
        jo.f10145d.f10146a.f16313a.add(this);
    }

    public static yr e(String str, float f10) {
        return new vr(str, Float.valueOf(f10));
    }

    public static yr f(String str, int i10) {
        return new tr(str, Integer.valueOf(i10));
    }

    public static yr g(String str, long j3) {
        return new ur(str, Long.valueOf(j3));
    }

    public static yr<Boolean> h(int i10, String str, Boolean bool) {
        return new sr(i10, str, bool);
    }

    public static yr i(String str, String str2) {
        return new wr(str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection<m4.yr<java.lang.String>>, java.util.ArrayList] */
    public static yr j() {
        wr wrVar = new wr("gads:sdk_core_constants:experiment_id", null);
        jo.f10145d.f10146a.f16314b.add(wrVar);
        return wrVar;
    }

    public abstract T a(JSONObject jSONObject);

    public abstract T b(Bundle bundle);

    public abstract T c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, T t10);
}
