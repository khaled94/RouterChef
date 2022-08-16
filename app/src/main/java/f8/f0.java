package f8;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.raouf.routerchef.Blacklist;
import com.raouf.routerchef.R;
import g8.e;
import i8.m;
import j8.c;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f0 extends e {

    /* renamed from: f */
    public final /* synthetic */ Blacklist f4598f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Blacklist blacklist, Context context, ArrayList arrayList) {
        super(context, arrayList);
        this.f4598f = blacklist;
    }

    @Override // g8.e
    public final void h(c cVar, int i10) {
        final String str = cVar.f5503d;
        final String str2 = cVar.f5501b;
        if (str2.length() <= 0 || str.length() <= 0) {
            return;
        }
        final Blacklist blacklist = this.f4598f;
        Objects.requireNonNull(blacklist);
        Dialog dialog = new Dialog(blacklist);
        blacklist.f3529g0 = dialog;
        dialog.setContentView(R.layout.confirm_unblock_dialog);
        blacklist.f3529g0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        blacklist.f3529g0.findViewById(R.id.cancelBtn).setOnClickListener(new x(blacklist, 0));
        blacklist.f3529g0.findViewById(R.id.confirmBlockBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Blacklist blacklist2 = Blacklist.this;
                String str3 = str;
                String str4 = str2;
                int i11 = Blacklist.f3522h0;
                blacklist2.O.post(new a0(blacklist2, 0));
                m.e(blacklist2.P);
                m mVar = new m(blacklist2, blacklist2.S.x(str3, str4));
                blacklist2.P = mVar;
                mVar.c(blacklist2.U + blacklist2.S.f16801n);
                blacklist2.f3529g0.dismiss();
            }
        });
        blacklist.f3529g0.show();
    }
}
