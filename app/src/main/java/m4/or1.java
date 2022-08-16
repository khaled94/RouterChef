package m4;

import java.util.HashSet;
import org.json.JSONObject;
import t3.w;

/* loaded from: classes.dex */
public abstract class or1 extends pr1 {

    /* renamed from: c */
    public final HashSet<String> f12280c;

    /* renamed from: d */
    public final JSONObject f12281d;

    /* renamed from: e */
    public final long f12282e;

    public or1(w wVar, HashSet<String> hashSet, JSONObject jSONObject, long j3) {
        super(wVar);
        this.f12280c = new HashSet<>(hashSet);
        this.f12281d = jSONObject;
        this.f12282e = j3;
    }

    @Override // m4.pr1, android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }
}
