package m4;

import android.view.View;
import h4.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class wv0 implements View.OnClickListener {

    /* renamed from: s */
    public final ty0 f15115s;

    /* renamed from: t */
    public final a f15116t;

    /* renamed from: u */
    public bw f15117u;

    /* renamed from: v */
    public lx<Object> f15118v;

    /* renamed from: w */
    public String f15119w;

    /* renamed from: x */
    public Long f15120x;
    public WeakReference<View> y;

    public wv0(ty0 ty0Var, a aVar) {
        this.f15115s = ty0Var;
        this.f15116t = aVar;
    }

    public final void a() {
        View view;
        this.f15119w = null;
        this.f15120x = null;
        WeakReference<View> weakReference = this.y;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.y = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.y;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f15119w != null && this.f15120x != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f15119w);
            hashMap.put("time_interval", String.valueOf(this.f15116t.a() - this.f15120x.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f15115s.b(hashMap);
        }
        a();
    }
}
