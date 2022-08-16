package m4;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class p70 implements w70, ku {

    /* renamed from: s */
    public final Object f12419s;

    /* renamed from: t */
    public final Object f12420t;

    public /* synthetic */ p70() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f12419s = byteArrayOutputStream;
        this.f12420t = new DataOutputStream(byteArrayOutputStream);
    }

    public /* synthetic */ p70(Object obj, Object obj2) {
        this.f12419s = obj;
        this.f12420t = obj2;
    }

    @Override // m4.ku
    public final JSONObject a() {
        return ((lw0) this.f12419s).m();
    }

    @Override // m4.w70
    public final void b(ef0 ef0Var) {
        ef0Var.L3((String) this.f12419s, (Bundle) this.f12420t);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m4.gw1<java.lang.String>, m4.gx1] */
    @Override // m4.ku
    public final void c() {
        ?? r12 = qv0.F;
        Map<String, WeakReference<View>> o10 = ((lw0) this.f12419s).o();
        if (o10 == null) {
            return;
        }
        int i10 = r12.f9062v;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            if (o10.get((String) r12.get(i11)) != null) {
                ((lw0) this.f12419s).onClick((ViewGroup) this.f12420t);
                return;
            }
            i11 = i12;
        }
    }

    @Override // m4.ku
    public final void d(MotionEvent motionEvent) {
        ((lw0) this.f12419s).onTouch(null, motionEvent);
    }

    @Override // m4.ku
    public final JSONObject zza() {
        return ((lw0) this.f12419s).k();
    }
}
