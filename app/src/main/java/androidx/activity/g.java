package androidx.activity;

import android.content.SharedPreferences;
import java.util.Iterator;
import u7.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f420s;

    /* renamed from: t */
    public final /* synthetic */ Object f421t;

    public /* synthetic */ g(Object obj, int i10) {
        this.f420s = i10;
        this.f421t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f420s) {
            case 0:
                h.d((h) this.f421t);
                return;
            default:
                i0 i0Var = (i0) this.f421t;
                synchronized (i0Var.f19513d) {
                    SharedPreferences.Editor edit = i0Var.f19510a.edit();
                    String str = i0Var.f19511b;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = i0Var.f19513d.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(i0Var.f19512c);
                    }
                    edit.putString(str, sb.toString()).commit();
                }
                return;
        }
    }
}
