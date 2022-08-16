package m4;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3.n;

/* loaded from: classes.dex */
public final class d20 implements n {

    /* renamed from: a */
    public final Date f7187a;

    /* renamed from: b */
    public final int f7188b;

    /* renamed from: c */
    public final Set<String> f7189c;

    /* renamed from: d */
    public final boolean f7190d;

    /* renamed from: e */
    public final Location f7191e;

    /* renamed from: f */
    public final int f7192f;

    /* renamed from: g */
    public final lu f7193g;

    /* renamed from: i */
    public final boolean f7195i;

    /* renamed from: h */
    public final List<String> f7194h = new ArrayList();

    /* renamed from: j */
    public final Map<String, Boolean> f7196j = new HashMap();

    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public d20(Date date, int i10, Set set, Location location, boolean z10, int i11, lu luVar, List list, boolean z11) {
        Map<String, Boolean> map;
        String str;
        Boolean bool;
        this.f7187a = date;
        this.f7188b = i10;
        this.f7189c = set;
        this.f7191e = location;
        this.f7190d = z10;
        this.f7192f = i11;
        this.f7193g = luVar;
        this.f7195i = z11;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.f7196j;
                            str = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            map = this.f7196j;
                            str = split[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str, bool);
                    }
                } else {
                    this.f7194h.add(str2);
                }
            }
        }
    }

    @Override // p3.e
    @Deprecated
    public final boolean a() {
        return this.f7195i;
    }

    @Override // p3.e
    @Deprecated
    public final Date b() {
        return this.f7187a;
    }

    @Override // p3.e
    public final boolean c() {
        return this.f7190d;
    }

    @Override // p3.e
    public final Set<String> d() {
        return this.f7189c;
    }

    @Override // p3.e
    public final int e() {
        return this.f7192f;
    }

    @Override // p3.e
    public final Location f() {
        return this.f7191e;
    }

    @Override // p3.e
    @Deprecated
    public final int g() {
        return this.f7188b;
    }
}
