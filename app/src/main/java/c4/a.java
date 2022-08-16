package c4;

import d.b;
import d9.l;
import k9.m;
import k9.n;
import s4.ac;
import v8.e;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public class a implements d1 {

    /* renamed from: s */
    public static m3.a f2667s;

    /* renamed from: t */
    public static final /* synthetic */ a f2668t = new a();

    public static void a(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static int b(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static final Object c(Object obj) {
        return obj instanceof m ? b.a(((m) obj).f5670a) : obj;
    }

    public static final Object d(Object obj, l lVar) {
        Throwable a10 = e.a(obj);
        return a10 == null ? lVar != null ? new n(obj, lVar) : obj : new m(a10);
    }

    public static boolean e(byte b10) {
        return b10 > -65;
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Integer.valueOf((int) ac.f17729t.zza().a());
    }
}
