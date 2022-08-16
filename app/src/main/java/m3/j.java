package m3;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import n3.v;

/* loaded from: classes.dex */
public final class j extends RelativeLayout {

    /* renamed from: s */
    public final v f5962s;

    /* renamed from: t */
    public boolean f5963t;

    public j(Context context, String str, String str2, String str3) {
        super(context);
        v vVar = new v(context);
        vVar.f16579c = str;
        this.f5962s = vVar;
        vVar.f16581e = str2;
        vVar.f16580d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5963t) {
            this.f5962s.a(motionEvent);
            return false;
        }
        return false;
    }
}
