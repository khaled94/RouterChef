package m3;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import m4.es;
import m4.jo;

/* loaded from: classes.dex */
public final class s extends FrameLayout implements View.OnClickListener {

    /* renamed from: s */
    public final ImageButton f5983s;

    /* renamed from: t */
    public final b f5984t;

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(android.content.Context r7, m3.r r8, m3.b r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.<init>(android.content.Context, m3.r, m3.b):void");
    }

    public final void a(boolean z10) {
        if (!z10) {
            this.f5983s.setVisibility(0);
            return;
        }
        this.f5983s.setVisibility(8);
        if (((Long) jo.f10145d.f10148c.a(es.J0)).longValue() <= 0) {
            return;
        }
        this.f5983s.animate().cancel();
        this.f5983s.clearAnimation();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f5984t;
        if (bVar != null) {
            bVar.e0();
        }
    }
}
