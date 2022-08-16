package m4;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;
import n3.g1;
import o2.b;
import o2.f;
import q3.a;
import q3.c;

/* loaded from: classes.dex */
public final class c10 extends e10 {

    /* renamed from: s */
    public Map<Class<Object>, Object> f6680s;

    @Override // m4.f10
    public final boolean O(String str) {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, c10.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            g1.j(sb.toString());
            return false;
        }
    }

    @Override // m4.f10
    public final boolean P(String str) {
        try {
            return p3.a.class.isAssignableFrom(Class.forName(str, false, c10.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            g1.j(sb.toString());
            return false;
        }
    }

    @Override // m4.f10
    public final u20 X(String str) {
        return new b30((RtbAdapter) Class.forName(str, false, ql.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // m4.f10
    public final i10 z(String str) {
        i10 i10Var;
        try {
            try {
                Class<?> cls = Class.forName(str, false, c10.class.getClassLoader());
                if (b.class.isAssignableFrom(cls)) {
                    b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    return new e20(bVar, (f) this.f6680s.get(bVar.getAdditionalParametersType()));
                } else if (p3.f.class.isAssignableFrom(cls)) {
                    return new a20((p3.f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    if (p3.a.class.isAssignableFrom(cls)) {
                        return new a20((p3.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                    sb.append("Could not instantiate mediation adapter: ");
                    sb.append(str);
                    sb.append(" (not a valid adapter).");
                    g1.j(sb.toString());
                    throw new RemoteException();
                }
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                g1.k(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            g1.e("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                i10Var = new a20(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                i10Var = new a20(new AdUrlAdapter());
            } else if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    CustomEventAdapter customEventAdapter = new CustomEventAdapter();
                    i10Var = new e20(customEventAdapter, (c) this.f6680s.get(customEventAdapter.getAdditionalParametersType()));
                }
                throw new RemoteException();
            } else {
                i10Var = new a20(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
            }
            return i10Var;
        }
    }
}
