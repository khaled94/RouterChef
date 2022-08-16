package f8;

import android.content.DialogInterface;
import android.os.Process;
import com.raouf.routerchef.Landing;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public static final /* synthetic */ j0 f4624s = new j0();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = Landing.S;
        dialogInterface.dismiss();
        Process.killProcess(Process.myPid());
    }
}
