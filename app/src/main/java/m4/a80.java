package m4;

import android.content.SharedPreferences;
import h4.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class a80 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final String f6067a;

    /* renamed from: b */
    public final /* synthetic */ b80 f6068b;

    public a80(b80 b80Var, String str) {
        this.f6068b = b80Var;
        this.f6067a = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<m4.z70>, java.util.ArrayList] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f6068b) {
            Iterator it = this.f6068b.f6416b.iterator();
            while (it.hasNext()) {
                z70 z70Var = (z70) it.next();
                String str2 = this.f6067a;
                b80 b80Var = z70Var.f16024a;
                Map map = z70Var.f16025b;
                Objects.requireNonNull(b80Var);
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    l70 l70Var = b80Var.f6418d;
                    ((j70) l70Var.f10667t).b(-1, ((a) l70Var.f10666s).a());
                }
            }
        }
    }
}
