package c2;

import g1.i;
import g1.z;
import k1.f;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a */
    public final z f2627a;

    /* renamed from: b */
    public final i<j> f2628b;

    /* loaded from: classes.dex */
    public class a extends i<j> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // g1.i
        public final void e(f fVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.f2625a;
            if (str == null) {
                fVar.v(1);
            } else {
                fVar.o(1, str);
            }
            String str2 = jVar2.f2626b;
            if (str2 == null) {
                fVar.v(2);
            } else {
                fVar.o(2, str2);
            }
        }
    }

    public l(z zVar) {
        this.f2627a = zVar;
        this.f2628b = new a(zVar);
    }
}
