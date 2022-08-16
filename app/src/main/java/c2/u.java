package c2;

import android.database.Cursor;
import g1.b0;
import g1.i;
import g1.z;
import java.util.ArrayList;
import java.util.List;
import k1.f;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a */
    public final z f2665a;

    /* renamed from: b */
    public final i<s> f2666b;

    /* loaded from: classes.dex */
    public class a extends i<s> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // g1.i
        public final void e(f fVar, s sVar) {
            s sVar2 = sVar;
            String str = sVar2.f2663a;
            if (str == null) {
                fVar.v(1);
            } else {
                fVar.o(1, str);
            }
            String str2 = sVar2.f2664b;
            if (str2 == null) {
                fVar.v(2);
            } else {
                fVar.o(2, str2);
            }
        }
    }

    public u(z zVar) {
        this.f2665a = zVar;
        this.f2666b = new a(zVar);
    }

    public final List<String> a(String str) {
        b0 j3 = b0.j("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2665a.b();
        Cursor n10 = this.f2665a.n(j3);
        try {
            ArrayList arrayList = new ArrayList(n10.getCount());
            while (n10.moveToNext()) {
                arrayList.add(n10.getString(0));
            }
            return arrayList;
        } finally {
            n10.close();
            j3.G();
        }
    }
}
