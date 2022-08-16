package m4;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.Window;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import j4.c;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import l3.s;
import n3.e;
import n3.s1;

/* loaded from: classes.dex */
public final /* synthetic */ class w80 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f14877a;

    /* renamed from: b */
    public final /* synthetic */ Object f14878b;

    public /* synthetic */ w80(Object obj, int i10) {
        this.f14877a = i10;
        this.f14878b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = 0;
        boolean z10 = false;
        switch (this.f14877a) {
            case 0:
                Context a10 = z50.a(((z80) this.f14878b).f16039e);
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo d5 = c.a(a10).d(a10.getApplicationInfo().packageName, 4096);
                    if (d5.requestedPermissions != null && d5.requestedPermissionsFlags != null) {
                        while (true) {
                            String[] strArr = d5.requestedPermissions;
                            if (i10 < strArr.length) {
                                if ((d5.requestedPermissionsFlags[i10] & 2) != 0) {
                                    arrayList.add(strArr[i10]);
                                }
                                i10++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return arrayList;
            case 1:
                df1 df1Var = (df1) this.f14878b;
                Objects.requireNonNull(df1Var);
                yr<Boolean> yrVar = es.L3;
                jo joVar = jo.f10145d;
                if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && df1Var.f7352b != null && df1Var.f7354d.contains("banner")) {
                    return new ef1(Boolean.valueOf(df1Var.f7352b.isHardwareAccelerated()));
                }
                boolean booleanValue = ((Boolean) joVar.f10148c.a(es.M3)).booleanValue();
                Boolean bool = null;
                if (booleanValue && df1Var.f7354d.contains("native")) {
                    Context context = df1Var.f7353c;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                            try {
                                if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                                    z10 = true;
                                }
                                bool = Boolean.valueOf(z10);
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        } else {
                            bool = Boolean.TRUE;
                        }
                        return new ef1(bool);
                    }
                }
                return new ef1(null);
            default:
                wg1 wg1Var = (wg1) this.f14878b;
                boolean e10 = c.a(wg1Var.f15014b).e();
                s1 s1Var = s.B.f5789c;
                boolean g10 = s1.g(wg1Var.f15014b);
                String str = wg1Var.f15015c.f12051s;
                boolean d10 = e.d();
                ApplicationInfo applicationInfo = wg1Var.f15014b.getApplicationInfo();
                return new xg1(e10, g10, str, d10, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.d(wg1Var.f15014b, ModuleDescriptor.MODULE_ID, false), DynamiteModule.a(wg1Var.f15014b, ModuleDescriptor.MODULE_ID));
        }
    }
}
