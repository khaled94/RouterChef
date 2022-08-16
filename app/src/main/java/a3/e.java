package a3;

import android.app.job.JobParameters;
import android.content.ContextWrapper;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.raouf.routerchef.R;
import com.raouf.routerchef.SeparatedWifiSettings;
import com.raouf.routerchef.resModels.BasicWifiInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f48s;

    /* renamed from: t */
    public final /* synthetic */ ContextWrapper f49t;

    /* renamed from: u */
    public final /* synthetic */ Object f50u;

    public /* synthetic */ e(ContextWrapper contextWrapper, Object obj, int i10) {
        this.f48s = i10;
        this.f49t = contextWrapper;
        this.f50u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48s) {
            case 0:
                int i10 = JobInfoSchedulerService.f2903s;
                ((JobInfoSchedulerService) this.f49t).jobFinished((JobParameters) this.f50u, false);
                return;
            default:
                SeparatedWifiSettings separatedWifiSettings = (SeparatedWifiSettings) this.f49t;
                BasicWifiInfo basicWifiInfo = (BasicWifiInfo) this.f50u;
                int i11 = SeparatedWifiSettings.f3626n0;
                Objects.requireNonNull(separatedWifiSettings);
                String str = basicWifiInfo.ssidName;
                if (str != null) {
                    separatedWifiSettings.X.setText(str);
                }
                if (basicWifiInfo.hidden != null) {
                    separatedWifiSettings.f3628b0.setChecked(!basicWifiInfo.a());
                    separatedWifiSettings.f3627a0.setChecked(basicWifiInfo.a());
                }
                String str2 = basicWifiInfo.maxClients;
                if (str2 != null) {
                    separatedWifiSettings.Z.setText(str2);
                    return;
                }
                separatedWifiSettings.Z.setEnabled(false);
                separatedWifiSettings.Z.setText(separatedWifiSettings.getString(R.string.notSupported));
                return;
        }
    }
}
