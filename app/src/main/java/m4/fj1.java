package m4;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;
import n3.e1;

/* loaded from: classes.dex */
public final /* synthetic */ class fj1 implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ fj1 f8579a = new fj1();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String[] split;
        HashMap hashMap = new HashMap();
        yr<String> yrVar = es.C;
        jo joVar = jo.f10145d;
        String str = (String) joVar.f10148c.a(yrVar);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) joVar.f10148c.a(es.D)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, e1.a(str2));
                }
            }
        }
        return new pd1(hashMap);
    }
}
