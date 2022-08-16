package l4;

import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.activity.k;
import androidx.lifecycle.j0;
import com.raouf.routerchef.R;
import e9.f;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import m4.jn;
import m4.km1;
import m4.ls1;
import m4.om1;
import q6.a;
import s4.aa;
import w8.g;
import y4.d1;
import y4.e1;
import y4.f1;
import z7.m;

/* loaded from: classes.dex */
public class b implements a, d1, m {

    /* renamed from: s */
    public static volatile ClassLoader f5811s;

    /* renamed from: t */
    public static volatile Thread f5812t;

    /* renamed from: u */
    public static final int[] f5813u = new int[0];

    /* renamed from: v */
    public static final Object[] f5814v = new Object[0];

    /* renamed from: w */
    public static final /* synthetic */ b f5815w = new b();

    public static int b(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int d(long[] jArr, int i10, long j3) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j3 ? 1 : (jArr[i13] == j3 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int f(int i10) {
        int i11 = i10 * 4;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        return i11 / 4;
    }

    public static int g(int i10) {
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        return i11 / 8;
    }

    public static final List h(Object obj) {
        List singletonList = Collections.singletonList(obj);
        f.d(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final List i(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : h(list.get(0)) : g.f19940s;
    }

    public static void j(View view, j0 j0Var) {
        view.setTag(R.id.view_tree_view_model_store_owner, j0Var);
    }

    public static final void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static synchronized ClassLoader l() {
        ClassLoader classLoader;
        synchronized (b.class) {
            if (f5811s == null) {
                f5811s = p();
            }
            classLoader = f5811s;
        }
        return classLoader;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        if (r4.equals("requester_type_1") != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m(m4.km1 r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            java.lang.String r3 = "unspecified"
            if (r2 != 0) goto Lc
            return r3
        Lc:
            m4.f7 r4 = r4.f10488a
            java.lang.Object r4 = r4.f8363t
            m4.om1 r4 = (m4.om1) r4
            m4.jn r4 = r4.f12203d
            android.os.Bundle r4 = r4.f10130u
            if (r4 != 0) goto L1a
            r4 = r3
            goto L20
        L1a:
            java.lang.String r2 = "query_info_type"
            java.lang.String r4 = r4.getString(r2)
        L20:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L28
            goto L90
        L28:
            int r2 = r4.hashCode()
            switch(r2) {
                case 1743582862: goto L6b;
                case 1743582863: goto L62;
                case 1743582864: goto L58;
                case 1743582865: goto L4e;
                case 1743582866: goto L44;
                case 1743582867: goto L3a;
                case 1743582868: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L75
        L30:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L75
            r0 = 6
            goto L76
        L3a:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L75
            r0 = 5
            goto L76
        L44:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L75
            r0 = 4
            goto L76
        L4e:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L75
            r0 = 3
            goto L76
        L58:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L75
            r0 = 2
            goto L76
        L62:
            java.lang.String r1 = "requester_type_1"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L75
            goto L76
        L6b:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L75
            r0 = r1
            goto L76
        L75:
            r0 = -1
        L76:
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L8a;
                case 2: goto L87;
                case 3: goto L84;
                case 4: goto L81;
                case 5: goto L7e;
                case 6: goto L7b;
                default: goto L79;
            }
        L79:
            r3 = r4
            goto L90
        L7b:
            java.lang.String r4 = "6"
            return r4
        L7e:
            java.lang.String r4 = "5"
            return r4
        L81:
            java.lang.String r4 = "4"
            return r4
        L84:
            java.lang.String r4 = "3"
            return r4
        L87:
            java.lang.String r4 = "2"
            return r4
        L8a:
            java.lang.String r4 = "1"
            return r4
        L8d:
            java.lang.String r4 = "0"
            return r4
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.b.m(m4.km1):java.lang.String");
    }

    public static void n(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void o(String str) {
        if (ls1.f10971a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static synchronized ClassLoader p() {
        synchronized (b.class) {
            ClassLoader classLoader = null;
            if (f5812t == null) {
                f5812t = t();
                if (f5812t == null) {
                    return null;
                }
            }
            synchronized (f5812t) {
                try {
                    classLoader = f5812t.getContextClassLoader();
                } catch (SecurityException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    public static String q(km1 km1Var) {
        return !(km1Var != null) ? "" : ((om1) km1Var.f10488a.f8363t).f12203d.H;
    }

    public static void r() {
        if (ls1.f10971a >= 18) {
            Trace.endSection();
        }
    }

    public static void s(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(k.a(15, "csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static synchronized Thread t() {
        a aVar;
        a aVar2;
        SecurityException e10;
        ThreadGroup threadGroup;
        synchronized (b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i11];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i11++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 >= activeCount) {
                            aVar = null;
                            break;
                        }
                        aVar = threadArr[i10];
                        if ("GmsDynamite".equals(aVar.getName())) {
                            break;
                        }
                        i10++;
                    }
                } catch (SecurityException e11) {
                    e10 = e11;
                    aVar2 = null;
                }
                if (aVar == null) {
                    try {
                        aVar2 = new a(threadGroup);
                        try {
                            aVar2.setContextClassLoader(null);
                            aVar2.start();
                        } catch (SecurityException e12) {
                            e10 = e12;
                            String valueOf = String.valueOf(e10.getMessage());
                            Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                            aVar = aVar2;
                            return aVar;
                        }
                    } catch (SecurityException e13) {
                        e10 = e13;
                        aVar2 = aVar;
                    }
                    aVar = aVar2;
                }
            }
            return aVar;
        }
    }

    public static boolean u(km1 km1Var) {
        if (!(km1Var != null)) {
            return false;
        }
        jn jnVar = ((om1) km1Var.f10488a.f8363t).f12203d;
        return (jnVar.K == null && jnVar.P == null) ? false : true;
    }

    @Override // q6.a
    public void a(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // z7.m
    public Object c() {
        return new TreeMap();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().x());
    }
}
