package f8;

import com.raouf.routerchef.Blacklist;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Blacklist f4587s;

    /* renamed from: t */
    public final /* synthetic */ ArrayList f4588t;

    public /* synthetic */ e0(Blacklist blacklist, ArrayList arrayList) {
        this.f4587s = blacklist;
        this.f4588t = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Blacklist blacklist = this.f4587s;
        blacklist.f3526d0.i(this.f4588t);
    }
}
