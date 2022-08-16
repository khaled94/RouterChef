package z9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import r9.a0;
import s9.e;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: c */
    public final Method f21079c;

    /* renamed from: d */
    public final Method f21080d;

    /* renamed from: e */
    public final Method f21081e;

    /* renamed from: f */
    public final Class<?> f21082f;

    /* renamed from: g */
    public final Class<?> f21083g;

    /* loaded from: classes.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a */
        public final List<String> f21084a;

        /* renamed from: b */
        public boolean f21085b;

        /* renamed from: c */
        public String f21086c;

        public a(List<String> list) {
            this.f21084a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.f18397b;
            }
            if (!name.equals("supports") || Boolean.TYPE != returnType) {
                if (name.equals("unsupported") && Void.TYPE == returnType) {
                    this.f21085b = true;
                    return null;
                } else if (name.equals("protocols") && objArr.length == 0) {
                    return this.f21084a;
                } else {
                    if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                            return method.invoke(this, objArr);
                        }
                        this.f21086c = (String) objArr[0];
                        return null;
                    }
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str = (String) list.get(i10);
                        if (this.f21084a.contains(str)) {
                            this.f21086c = str;
                            return str;
                        }
                    }
                    String str2 = this.f21084a.get(0);
                    this.f21086c = str2;
                    return str2;
                }
            }
            return Boolean.TRUE;
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f21079c = method;
        this.f21080d = method2;
        this.f21081e = method3;
        this.f21082f = cls;
        this.f21083g = cls2;
    }

    @Override // z9.f
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f21081e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // z9.f
    public final void g(SSLSocket sSLSocket, String str, List<a0> list) {
        try {
            this.f21079c.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f21082f, this.f21083g}, new a(f.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // z9.f
    @Nullable
    public final String j(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f21080d.invoke(null, sSLSocket));
            boolean z10 = aVar.f21085b;
            if (!z10 && aVar.f21086c == null) {
                f.f21089a.n(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (!z10) {
                return aVar.f21086c;
            } else {
                return null;
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
