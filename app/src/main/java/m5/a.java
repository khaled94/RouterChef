package m5;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Chip f16373a;

    public a(Chip chip) {
        this.f16373a = chip;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1.f19076a.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r1.f19076a.a(r0) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r2.e(r0, r2.f19081e) != false) goto L10;
     */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
        /*
            r4 = this;
            com.google.android.material.chip.Chip r0 = r4.f16373a
            u5.i$a<com.google.android.material.chip.Chip> r1 = r0.B
            if (r1 == 0) goto L25
            u5.a r1 = (u5.a) r1
            java.util.Objects.requireNonNull(r1)
            if (r6 == 0) goto L16
            u5.b r2 = r1.f19076a
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L25
            goto L20
        L16:
            u5.b r2 = r1.f19076a
            boolean r3 = r2.f19081e
            boolean r0 = r2.e(r0, r3)
            if (r0 == 0) goto L25
        L20:
            u5.b r0 = r1.f19076a
            r0.d()
        L25:
            com.google.android.material.chip.Chip r0 = r4.f16373a
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.A
            if (r0 == 0) goto L2e
            r0.onCheckedChanged(r5, r6)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.a.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
