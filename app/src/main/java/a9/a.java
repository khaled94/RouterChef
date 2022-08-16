package a9;

import e9.f;
import f9.b;
import f9.c;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a9.a$a */
    /* loaded from: classes.dex */
    public static final class C0005a {

        /* renamed from: a */
        public static final Method f383a;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
            if (e9.f.a(r5, java.lang.Throwable.class) != false) goto L13;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                e9.f.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Le:
                r5 = 0
                if (r4 >= r2) goto L3d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = e9.f.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L35
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                e9.f.d(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L2e
                r5 = r7[r3]
            L2e:
                boolean r5 = e9.f.a(r5, r0)
                if (r5 == 0) goto L35
                goto L36
            L35:
                r8 = r3
            L36:
                if (r8 == 0) goto L3a
                r5 = r6
                goto L3d
            L3a:
                int r4 = r4 + 1
                goto Le
            L3d:
                a9.a.C0005a.f383a = r5
                int r0 = r1.length
            L40:
                if (r3 >= r0) goto L54
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = e9.f.a(r2, r4)
                if (r2 == 0) goto L51
                goto L54
            L51:
                int r3 = r3 + 1
                goto L40
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.a.C0005a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        f.e(th, "cause");
        f.e(th2, "exception");
        Method method = C0005a.f383a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public c b() {
        return new b();
    }
}
