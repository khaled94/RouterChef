package e;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import m4.a60;
import m4.fg2;
import m4.gg2;
import m4.h71;
import m4.pm1;
import m4.pt0;
import m4.qt0;
import m4.rk1;
import m4.s60;
import m4.v91;
import m4.y50;
import m4.ym1;
import m4.z60;
import m4.zo0;
import n3.g1;

/* loaded from: classes.dex */
public final class o implements qt0, rk1, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f4258s;

    /* renamed from: t */
    public final Object f4259t;

    public o() {
        this.f4258s = 1;
        this.f4259t = new HashMap();
    }

    public final File a() {
        File file = new File(((Context) this.f4259t).getFilesDir(), ".com.google.firebase.crashlytics");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        Log.w("FirebaseCrashlytics", "Couldn't create file", null);
        return null;
    }

    public final AtomicReference b(String str) {
        synchronized (this) {
            if (!((Map) this.f4259t).containsKey(str)) {
                ((Map) this.f4259t).put(str, new AtomicReference());
            }
        }
        return (AtomicReference) ((Map) this.f4259t).get(str);
    }

    @Override // m4.qt0
    public final void c(boolean z10, Context context, zo0 zo0Var) {
        h71 h71Var = (h71) this.f4259t;
        try {
            ((ym1) h71Var.f9129b).b(z10);
            ym1 ym1Var = (ym1) h71Var.f9129b;
            Objects.requireNonNull(ym1Var);
            ym1Var.f15839a.D();
        } catch (pm1 e10) {
            g1.k("Cannot show rewarded video.", e10);
            throw new pt0(e10.getCause());
        }
    }

    @Override // m4.rk1
    public final void h(Object obj) {
        switch (this.f4258s) {
            case 3:
                y50 y50Var = (y50) ((a60) this.f4259t);
                ((s60) obj).i3(new z60(y50Var.f15591s, y50Var.f15592t));
                return;
            default:
                gg2 gg2Var = (gg2) obj;
                return;
        }
    }

    public /* synthetic */ o(Object obj, int i10) {
        this.f4258s = i10;
        this.f4259t = obj;
    }

    public /* synthetic */ o(fg2 fg2Var) {
        this.f4258s = 4;
        this.f4259t = fg2Var;
    }
}
