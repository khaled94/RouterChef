package m4;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class ww implements cu1 {

    /* renamed from: a */
    public final /* synthetic */ int f15122a;

    /* renamed from: b */
    public final /* synthetic */ Object f15123b;

    public /* synthetic */ ww(Object obj, int i10) {
        this.f15122a = i10;
        this.f15123b = obj;
    }

    @Override // m4.cu1
    public final Object a(Object obj) {
        switch (this.f15122a) {
            case 0:
                String str = (String) this.f15123b;
                String str2 = (String) obj;
                lx<vd0> lxVar = kx.f10595a;
                if (str2 != null) {
                    if (lt.f10987f.e().booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str).getHost();
                        for (int i10 = 0; i10 < 3; i10++) {
                            if (!host.endsWith(strArr[i10])) {
                            }
                        }
                    }
                    String e10 = lt.f10982a.e();
                    String e11 = lt.f10983b.e();
                    if (!TextUtils.isEmpty(e10)) {
                        str = str.replace(e10, str2);
                    }
                    if (!TextUtils.isEmpty(e11)) {
                        Uri parse = Uri.parse(str);
                        if (TextUtils.isEmpty(parse.getQueryParameter(e11))) {
                            return parse.buildUpon().appendQueryParameter(e11, str2).toString();
                        }
                    }
                }
                return str;
            default:
                return ((oj0) this.f15123b).n();
        }
    }
}
