package e9;

import a7.a;
import a7.e;
import android.util.Log;
import h9.b;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import k9.a0;
import k9.b1;
import n9.c;
import n9.t;
import org.json.JSONObject;
import s4.hb;
import t3.l;
import x8.f;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class d implements d1, z6.d {

    /* renamed from: s */
    public static final Object[] f4457s = new Object[0];

    /* renamed from: t */
    public static final char[] f4458t = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: u */
    public static final char[] f4459u = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: v */
    public static final d f4460v = new d();

    /* renamed from: w */
    public static final l f4461w = new l(0);

    /* renamed from: x */
    public static final /* synthetic */ d f4462x = new d();

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & 255;
            int i12 = i10 + 1;
            char[] cArr2 = f4459u;
            cArr[i10] = cArr2[i11 >>> 4];
            i10 = i12 + 1;
            cArr[i12] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static long f(j0.d dVar, long j3, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        Objects.requireNonNull(dVar);
        return (j3 * 1000) + System.currentTimeMillis();
    }

    public static final Class g(b bVar) {
        f.e(bVar, "<this>");
        Class<?> a10 = ((b) bVar).a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a10 : Double.class;
            case 104431:
                return !name.equals("int") ? a10 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a10 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a10 : Character.class;
            case 3327612:
                return !name.equals("long") ? a10 : Long.class;
            case 3625364:
                return !name.equals("void") ? a10 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a10 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a10 : Float.class;
            case 109413500:
                return !name.equals("short") ? a10 : Short.class;
            default:
                return a10;
        }
    }

    public static final boolean h(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final void i(a0 a0Var, x8.d dVar, boolean z10) {
        Object h10 = a0Var.h();
        Throwable e10 = a0Var.e(h10);
        Object a10 = e10 != null ? d.b.a(e10) : a0Var.f(h10);
        if (!z10) {
            dVar.d(a10);
            return;
        }
        c cVar = (c) dVar;
        x8.d<T> dVar2 = cVar.f16683w;
        Object obj = cVar.y;
        f context = dVar2.getContext();
        Object b10 = t.b(context, obj);
        b1 a11 = b10 != t.f16720a ? c1.f.a(dVar2, context) : null;
        try {
            cVar.f16683w.d(a10);
            if (a11 != null) {
                throw null;
            }
            t.a(context, b10);
        } catch (Throwable th) {
            if (a11 != null) {
                throw null;
            }
            t.a(context, b10);
            throw th;
        }
    }

    public static byte[] j(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 2;
                bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
                i10 = i11;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }

    public static final Object[] k(Collection collection) {
        f.e(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i12 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        f.d(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        f.d(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f4457s;
    }

    public static final Object[] l(Collection collection, Object[] objArr) {
        Object[] objArr2;
        f.e(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i12 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                f.d(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                f.d(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    @Override // z6.d
    public e a(j0.d dVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("app");
        a aVar = new a(jSONObject2.getString("status"), jSONObject2.getString("url"), jSONObject2.getString("reports_url"), jSONObject2.getString("ndk_reports_url"), jSONObject2.optBoolean("update_required", false));
        a7.c cVar = new a7.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        JSONObject jSONObject3 = jSONObject.getJSONObject("features");
        return new e(f(dVar, optInt, jSONObject), aVar, cVar, new a7.b(jSONObject3.optBoolean("collect_reports", true), jSONObject3.optBoolean("collect_anrs", false)));
    }

    public boolean c(int i10) {
        return 4 <= i10 || Log.isLoggable("FirebaseCrashlytics", i10);
    }

    public void d(String str) {
        if (c(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void e(String str, Throwable th) {
        if (c(6)) {
            Log.e("FirebaseCrashlytics", str, th);
        }
    }

    public void m(String str) {
        if (c(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void n(String str, Throwable th) {
        if (c(5)) {
            Log.w("FirebaseCrashlytics", str, th);
        }
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Boolean.valueOf(hb.f17912t.zza().a());
    }
}
