package m4;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l3.s;

/* loaded from: classes.dex */
public final class ki0 implements th0 {

    /* renamed from: a */
    public final CookieManager f10437a;

    public ki0(Context context) {
        this.f10437a = s.B.f5791e.f(context);
    }

    @Override // m4.th0
    public final void a(Map<String, String> map) {
        if (this.f10437a == null) {
            return;
        }
        HashMap hashMap = (HashMap) map;
        if (((String) hashMap.get("clear")) == null) {
            String str = (String) hashMap.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f10437a.setCookie((String) jo.f10145d.f10148c.a(es.f8221w0), str);
            return;
        }
        String str2 = (String) jo.f10145d.f10148c.a(es.f8221w0);
        String cookie = this.f10437a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        aa0 a10 = aa0.a(new yt1(';'));
        Iterator<String> l10 = ((mu1) a10.f6088t).l(a10, cookie);
        ArrayList arrayList = new ArrayList();
        while (l10.hasNext()) {
            arrayList.add(l10.next());
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        for (int i10 = 0; i10 < unmodifiableList.size(); i10++) {
            CookieManager cookieManager = this.f10437a;
            Iterator<String> it = ((ku1) aa0.a(new yt1('=')).b((String) unmodifiableList.get(i10))).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            String valueOf = String.valueOf(it.next());
            String valueOf2 = String.valueOf((String) jo.f10145d.f10148c.a(es.f8150n0));
            cookieManager.setCookie(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }
}
