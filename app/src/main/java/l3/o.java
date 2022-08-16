package l3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import m4.fi;
import m4.u7;
import m4.v7;
import m4.w7;
import m4.we1;
import m4.xh;
import m4.yh;
import n3.g1;
import n3.k1;
import n3.s1;

/* loaded from: classes.dex */
public final class o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f5771a;

    /* renamed from: b */
    public final /* synthetic */ Object f5772b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f5771a = i10;
        this.f5772b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        xh xhVar;
        String str;
        String str2;
        String str3;
        String str4;
        int i10 = 0;
        switch (this.f5771a) {
            case 0:
                r rVar = (r) this.f5772b;
                String str5 = rVar.f5780s.f12051s;
                Context context = rVar.f5783v;
                int i11 = v7.T;
                u7.p(context, false);
                return new w7(new v7(context, str5, false));
            default:
                s sVar = s.B;
                s1 s1Var = sVar.f5789c;
                fi w10 = ((k1) sVar.f5793g.c()).w();
                Bundle bundle = null;
                if (w10 != null && (!((k1) sVar.f5793g.c()).r() || !((k1) sVar.f5793g.c()).t())) {
                    if (w10.f8559t) {
                        synchronized (w10.f8560u) {
                            w10.f8559t = false;
                            w10.f8560u.notifyAll();
                            g1.e("ContentFetchThread: wakeup");
                        }
                    }
                    yh yhVar = w10.f8561v;
                    boolean z10 = w10.H;
                    synchronized (yhVar.f15781a) {
                        if (yhVar.f15783c.size() == 0) {
                            g1.e("Queue empty");
                            xhVar = null;
                        } else {
                            if (yhVar.f15783c.size() >= 2) {
                                xhVar = null;
                                int i12 = Integer.MIN_VALUE;
                                int i13 = 0;
                                for (xh xhVar2 : yhVar.f15783c) {
                                    int i14 = xhVar2.f15357n;
                                    if (i14 > i12) {
                                        i10 = i13;
                                    }
                                    int i15 = i14 > i12 ? i14 : i12;
                                    if (i14 > i12) {
                                        xhVar = xhVar2;
                                    }
                                    i13++;
                                    i12 = i15;
                                }
                            } else {
                                xhVar = (xh) yhVar.f15783c.get(0);
                                if (!z10) {
                                    synchronized (xhVar.f15350g) {
                                        xhVar.f15357n -= 100;
                                    }
                                }
                            }
                            yhVar.f15783c.remove(i10);
                        }
                    }
                    if (xhVar != null) {
                        str3 = xhVar.f15358o;
                        str2 = xhVar.p;
                        str = xhVar.f15359q;
                        if (str3 != null) {
                            ((k1) s.B.f5793g.c()).B(str3);
                        }
                        if (str != null) {
                            ((k1) s.B.f5793g.c()).C(str);
                        }
                    } else {
                        s sVar2 = s.B;
                        k1 k1Var = (k1) sVar2.f5793g.c();
                        k1Var.u();
                        synchronized (k1Var.f16496a) {
                            str4 = k1Var.f16504i;
                        }
                        str = ((k1) sVar2.f5793g.c()).x();
                        str3 = str4;
                        str2 = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    s sVar3 = s.B;
                    if (!((k1) sVar3.f5793g.c()).t()) {
                        if (str == null || TextUtils.isEmpty(str)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", str);
                        }
                    }
                    if (str3 != null && !((k1) sVar3.f5793g.c()).r()) {
                        bundle2.putString("fingerprint", str3);
                        if (!str3.equals(str2)) {
                            bundle2.putString("v_fp", str2);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new we1(bundle);
        }
    }
}
