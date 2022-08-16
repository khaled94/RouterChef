package c2;

import android.database.Cursor;
import g1.b0;
import g1.i;
import g1.z;
import java.util.ArrayList;
import java.util.List;
import k1.f;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a */
    public final z f2614a;

    /* renamed from: b */
    public final i<c2.a> f2615b;

    /* loaded from: classes.dex */
    public class a extends i<c2.a> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // g1.i
        public final void e(f fVar, c2.a aVar) {
            c2.a aVar2 = aVar;
            String str = aVar2.f2612a;
            if (str == null) {
                fVar.v(1);
            } else {
                fVar.o(1, str);
            }
            String str2 = aVar2.f2613b;
            if (str2 == null) {
                fVar.v(2);
            } else {
                fVar.o(2, str2);
            }
        }
    }

    public c(z zVar) {
        this.f2614a = zVar;
        this.f2615b = new a(zVar);
    }

    public final List<String> a(String str) {
        b0 j3 = b0.j("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2614a.b();
        Cursor n10 = this.f2614a.n(j3);
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

    public final boolean b(String str) {
        boolean z10 = true;
        b0 j3 = b0.j("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2614a.b();
        boolean z11 = false;
        Cursor n10 = this.f2614a.n(j3);
        try {
            if (n10.moveToFirst()) {
                if (n10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            n10.close();
            j3.G();
        }
    }
}
