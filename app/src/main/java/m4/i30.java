package m4;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import java.util.Objects;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class i30 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ k30 f9526s;

    public i30(k30 k30Var) {
        this.f9526s = k30Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        k30 k30Var = this.f9526s;
        Objects.requireNonNull(k30Var);
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", k30Var.f10263w);
        data.putExtra("eventLocation", k30Var.A);
        data.putExtra("description", k30Var.f10265z);
        long j3 = k30Var.f10264x;
        if (j3 > -1) {
            data.putExtra("beginTime", j3);
        }
        long j10 = k30Var.y;
        if (j10 > -1) {
            data.putExtra("endTime", j10);
        }
        data.setFlags(268435456);
        s1 s1Var = s.B.f5789c;
        s1.n(this.f9526s.f10262v, data);
    }
}
