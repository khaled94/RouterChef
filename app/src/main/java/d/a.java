package d;

import android.os.Bundle;
import android.util.Log;
import i0.b;
import j0.d;
import java.util.Objects;
import k9.r;
import k9.s;
import m4.dd;
import m4.g3;
import m4.h3;
import m4.kz;
import m4.ls1;
import m4.qo2;
import m4.r01;
import m4.uo2;
import n3.g1;
import org.json.JSONObject;
import s4.aa;
import x8.f;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class a implements d1 {

    /* renamed from: s */
    public static final int[] f3658s = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};

    /* renamed from: t */
    public static final int[] f3659t = {16842960, 16843161};

    /* renamed from: u */
    public static final int[] f3660u = {16843161, 16843849, 16843850, 16843851};

    /* renamed from: v */
    public static final /* synthetic */ a f3661v = new a();

    public static final void a(f fVar, Throwable th) {
        try {
            r rVar = (r) fVar.get(r.a.f5681s);
            if (rVar == null) {
                s.a(fVar, th);
            } else {
                rVar.handleException(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                d.a(runtimeException, th);
                th = runtimeException;
            }
            s.a(fVar, th);
        }
    }

    public static Object b(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (!cls.isAssignableFrom(obj2.getClass())) {
            throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
        }
        return obj2;
    }

    public static g3 c(uo2 uo2Var) {
        h3 a10;
        byte[] bArr;
        dd ddVar = new dd(16);
        if (h3.a(uo2Var, ddVar).f9090a != 1380533830) {
            return null;
        }
        qo2 qo2Var = (qo2) uo2Var;
        qo2Var.o((byte[]) ddVar.f7311d, 0, 4, false);
        ddVar.h(0);
        int l10 = ddVar.l();
        if (l10 != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(l10);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        while (true) {
            a10 = h3.a(uo2Var, ddVar);
            if (a10.f9090a == 1718449184) {
                break;
            }
            qo2Var.p((int) a10.f9091b, false);
        }
        r01.h(a10.f9091b >= 16);
        qo2Var.o((byte[]) ddVar.f7311d, 0, 16, false);
        ddVar.h(0);
        int o10 = ddVar.o();
        int o11 = ddVar.o();
        int n10 = ddVar.n();
        ddVar.n();
        int o12 = ddVar.o();
        int o13 = ddVar.o();
        int i10 = ((int) a10.f9091b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            qo2Var.o(bArr2, 0, i10, false);
            bArr = bArr2;
        } else {
            bArr = ls1.f10976f;
        }
        return new g3(o10, o11, n10, o12, o13, bArr);
    }

    public static Object d(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }

    public static void e(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static void f(kz kzVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        g1.e(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        kzVar.b(sb.toString());
    }

    public static void g(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    public static void h(kz kzVar, String str, String str2) {
        kzVar.b(b.a(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");"));
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Integer.valueOf((int) aa.f17726t.zza().Q());
    }
}
