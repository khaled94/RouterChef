package f8;

import android.content.DialogInterface;
import android.os.Process;
import com.raouf.routerchef.Landing;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements DialogInterface.OnDismissListener {

    /* renamed from: s */
    public static final /* synthetic */ k0 f4628s = new k0();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = Landing.S;
        Process.killProcess(Process.myPid());
    }
}
