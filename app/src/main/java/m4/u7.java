package m4;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class u7 extends t7 {
    public static final Object P = new Object();
    public static boolean Q = false;
    public static long R;
    public static z7 S;
    public final boolean M;
    public final String N;
    public t8 O;

    public u7(Context context, String str, boolean z10) {
        super(context);
        this.N = str;
        this.M = z10;
    }

    public static n8 l(Context context, boolean z10) {
        if (t7.L == null) {
            synchronized (P) {
                if (t7.L == null) {
                    n8 b10 = n8.b(context, z10);
                    if (b10.p) {
                        try {
                            if (((Boolean) jo.f10145d.f10148c.a(es.K1)).booleanValue()) {
                                b10.e("PDJGtr7hH5z8kziZtOwKBHfUklGaxsnuMOcaf4/XJNQXH5uqgOnO+ZxxlrN1G5R2", "8jFByxLLStK1ZA6Q/SQPKITUmXlRJfaQf0bJ+6rt27M=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        b10.e("pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", Context.class);
                        b10.e("t7YLiNn9wSLVfNzBPSP796qGY15c9YWt19X86sjfqa1MN8DTMOAxKskDGE2b7plQ", "lEEnhl5euaIfSg9vXz1JH43pBH/xGM9fvSrfPaUZwEI=", Context.class);
                        b10.e("Zsy6wzxKzkvuI5Zg91hlK7lftgUdlMXbkLzI72tnQVNXNUFbyYhuDjwGRJi5QzOf", "/h10yfi8gz82TQ6rp82eUm/z42AeNO79/O3Nlfr8yws=", Context.class);
                        b10.e("glZYRiAaVgXhfq7gmv5KdTlxK1u1W7CDU+wEOCdR48SsabliUSLxOyNuMGeUOQq8", "BXtZidg/K24z5N/YUAEC4oPRR4OaYUycAQjBgFG9Ir4=", Context.class);
                        b10.e("/739lR4kemkoeiIxGTB69dfyotmKoGTnr6wtM0ugYOMXQexqwGvsBs8l5HrCnFT4", "LBvMjmMBC2btK8Ghl34ZYYMmZM0GDlWreJMsAap/ceE=", Context.class);
                        Class<?> cls = Boolean.TYPE;
                        b10.e("xNZCZdqL8o1jZKUOIQXHHGKMYJmFGBT5z1mMXWF7VHR3erPGPRFl7DocpCFVg9bF", "1GRZIGWaJCWi5hYVyOzM0ARje4NaXoHaW7HEe5QbRxs=", Context.class, cls);
                        b10.e("uUtXgghNropSfe2KUSoP0Efn1EgB4X6maOF+tPLLzG1rSS0RqDSE3s9EWbbdwRaZ", "iu0TCa9uEtKUas610luihENZAQIiF7MRaL5XfmToU24=", Context.class);
                        b10.e("SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", Context.class);
                        b10.e("8ik9NLkf2/tOyUWOONqxKfb9fxC2GinfkSDGvq3LdfAIyGrwvLIO/sr/FhjBRdwL", "E5fWzXFb8RAG+0QVT91wIl5kQfApis+Ago2PTXmCPgE=", MotionEvent.class, DisplayMetrics.class);
                        b10.e("fI0N3kbZw/umjLZrsorw2Wh0+0tg4xypZfrKau+VpPGw8hjO0IIZVyJi5hB0Wcbt", "YnDH+tthutt98if0TMBwjusoYiZkXUV9qrwRfqxnS3g=", MotionEvent.class, DisplayMetrics.class);
                        b10.e("llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", new Class[0]);
                        b10.e("M8X9pjLXmkUmNpxAUiXCS0VzRrfgsx47JCdWPtF77o1zbxjaTxGH9o3y3XsfapA3", "IGAB4+J/PDJStxsBeRODYeAaV8Ap48L0bK2MK3UJNBs=", new Class[0]);
                        b10.e("uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", new Class[0]);
                        b10.e("9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", new Class[0]);
                        b10.e("hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", new Class[0]);
                        b10.e("n2Au6L29UBBc2fEdbhtyAmTKpQRV7jQpdKVw+7Bcq8RzfUQmGwjEOtWTLTfPZXlx", "dCN8M8R2yrrpg52x17w1rrrZtT0eIXPeEX6Ibp28VuQ=", new Class[0]);
                        b10.e("iH08ecr5p8p5eQT3/BFJ6jAaJm3eLNoIe2oA7hLZl5P0jAtinrUdPK16lrJGpxBz", "Gvy6wet11FtrNaAWhnvYSI1hOQnkPBTAgqoI9PXuwaM=", Context.class, cls, String.class);
                        b10.e("xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=", StackTraceElement[].class);
                        b10.e("hQ5xuCRMiz6eJqaT4+9Wf/Kj854Yma0NmQLTM8SLOoEkyUHQjbgUSxF3PTxTz3Bq", "CIY4BMAyy7Fe28Pq7/h8od2SEEojcWEgmd3J7ORxssU=", View.class, DisplayMetrics.class, cls);
                        b10.e("yRC8yDQzUDrmroLbdHZh1cdlZfd8ub/FsIslAHpddfKGkTWa/jUYdNJ0tT+5diCM", "HM4qeDzacgZSWStWAwQJTi2Amm6uvEB2WlZumyUY0B8=", Context.class, cls);
                        b10.e("VJibBREzYucPjNukhWG65jB60OIZQrcDVR3W2JV3G5ynshQ4Nd74pHrZYUgRiYK0", "TiANcug5zndviERrHpzUihvZthrd+vHCK5ngnbrocVE=", View.class, Activity.class, cls);
                        b10.e("e3op4R4hYomHt8fD4e46pNuu/60OumzY4fWht1zvNw/PVRGde3uP5Y0px+X+3p+E", "jLlOehpoNgAQzvuHrTyBcudcfwOhFguv/E47mcpJrto=", Long.TYPE);
                        try {
                            if (((Boolean) jo.f10145d.f10148c.a(es.P1)).booleanValue()) {
                                b10.e("nKg4HNqb3w+l+hWBt0181NzZuRHIlhptjDdMcQ5dE3JWGvySjoPYfybKeplgFTfD", "XexrqxQZ83Dsows1I9oUUMC34QJd/x5AyWUFr5Va7Yc=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        b10.e("CaNDUMCWCaGbEGmM1Yj39BxpZ8FPbNtvFQfeZOrEB+NgN6NGnTaiZA/U29rLN/tj", "INyd2w/uRsAGkjbqPl7ialNH5emmi1OBLIEI6gUyIzM=", Context.class);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (((Boolean) jo.f10145d.f10148c.a(es.Q1)).booleanValue()) {
                                    b10.e("pJoEelkZiKPOxk90a9HaLYHjU9iyGURNQtyjZ4Eem1yb/gFTG2yLqZLPefEosnhY", "oU8dxPYnryKlPd91mK89Z7Qor1PaeT+LMYSHnhThZ+4=", NetworkCapabilities.class);
                                }
                            }
                        } catch (IllegalStateException unused3) {
                        }
                    }
                    t7.L = b10;
                }
            }
        }
        return t7.L;
    }

    public static o8 m(n8 n8Var, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method c10 = n8Var.c("8ik9NLkf2/tOyUWOONqxKfb9fxC2GinfkSDGvq3LdfAIyGrwvLIO/sr/FhjBRdwL", "E5fWzXFb8RAG+0QVT91wIl5kQfApis+Ago2PTXmCPgE=");
        if (c10 == null || motionEvent == null) {
            throw new e8();
        }
        try {
            return new o8((String) c10.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new e8(e10);
        }
    }

    public static synchronized void p(Context context, boolean z10) {
        synchronized (u7.class) {
            if (!Q) {
                R = System.currentTimeMillis() / 1000;
                t7.L = l(context, z10);
                if (((Boolean) jo.f10145d.f10148c.a(es.Q1)).booleanValue()) {
                    S = context != null ? new z7((ConnectivityManager) context.getSystemService("connectivity")) : null;
                }
                Q = true;
            }
        }
    }

    public static final void q(List<Callable<Void>> list) {
        ExecutorService executorService;
        if (t7.L == null || (executorService = t7.L.f11551b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) jo.f10145d.f10148c.a(es.D1)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            char[] cArr = p8.f12428a;
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            Log.d("u7", String.format("class methods got exception: %s", stringWriter.toString()));
        }
    }

    @Override // m4.s7
    public final void b(View view) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.G1)).booleanValue()) {
            return;
        }
        if (this.O == null) {
            n8 n8Var = t7.L;
            this.O = new t8(n8Var.f11550a, n8Var.f11565q);
        }
        this.O.c(view);
    }

    @Override // m4.t7
    public final long h(StackTraceElement[] stackTraceElementArr) {
        Method c10 = t7.L.c("xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=");
        if (c10 == null || stackTraceElementArr == null) {
            throw new e8();
        }
        try {
            return new f8((String) c10.invoke(null, stackTraceElementArr)).f8366a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new e8(e10);
        }
    }

    @Override // m4.t7
    public final o8 i(MotionEvent motionEvent) {
        Method c10 = t7.L.c("fI0N3kbZw/umjLZrsorw2Wh0+0tg4xypZfrKau+VpPGw8hjO0IIZVyJi5hB0Wcbt", "YnDH+tthutt98if0TMBwjusoYiZkXUV9qrwRfqxnS3g=");
        if (c10 == null || motionEvent == null) {
            throw new e8();
        }
        try {
            return new o8((String) c10.invoke(null, motionEvent, this.K));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new e8(e10);
        }
    }

    public List n(n8 n8Var, Context context, v5 v5Var) {
        int a10 = n8Var.a();
        ArrayList arrayList = new ArrayList();
        if (!n8Var.p) {
            v5Var.q(16384L);
            return arrayList;
        }
        arrayList.add(new y8(n8Var, v5Var, a10, context));
        arrayList.add(new b9(n8Var, v5Var, R, a10));
        arrayList.add(new i9(n8Var, v5Var, a10));
        arrayList.add(new l9(n8Var, v5Var, a10));
        arrayList.add(new q9(n8Var, v5Var, a10));
        arrayList.add(new x8(n8Var, v5Var, a10, context));
        arrayList.add(new z8(n8Var, v5Var, a10));
        arrayList.add(new h9(n8Var, v5Var, a10));
        arrayList.add(new j9(n8Var, v5Var, a10));
        arrayList.add(new a9(n8Var, v5Var, a10));
        arrayList.add(new e9(n8Var, v5Var, a10));
        arrayList.add(new r9(n8Var, v5Var, a10));
        arrayList.add(new w8(n8Var, v5Var, a10));
        arrayList.add(new o9(n8Var, v5Var, a10));
        arrayList.add(new m9(n8Var, v5Var, a10));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) jo.f10145d.f10148c.a(es.Q1)).booleanValue()) {
                arrayList.add(new g9(n8Var, v5Var, a10, S));
            }
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.P1)).booleanValue()) {
            arrayList.add(new k9(n8Var, v5Var, a10));
        }
        arrayList.add(new f9(n8Var, v5Var, a10));
        return arrayList;
    }

    public final void o(n8 n8Var, v5 v5Var, View view, Activity activity, boolean z10) {
        List list;
        if (!n8Var.p) {
            v5Var.q(16384L);
            list = Arrays.asList(new d9(n8Var, v5Var));
        } else {
            r(n8Var, v5Var);
            ArrayList arrayList = new ArrayList();
            if (n8Var.f11551b != null) {
                int a10 = n8Var.a();
                arrayList.add(new d9(n8Var, v5Var));
                arrayList.add(new i9(n8Var, v5Var, a10));
                arrayList.add(new b9(n8Var, v5Var, R, a10));
                arrayList.add(new a9(n8Var, v5Var, a10));
                arrayList.add(new h9(n8Var, v5Var, a10));
                arrayList.add(new j9(n8Var, v5Var, a10));
                arrayList.add(new e9(n8Var, v5Var, a10));
                arrayList.add(new z8(n8Var, v5Var, a10));
                arrayList.add(new r9(n8Var, v5Var, a10));
                arrayList.add(new w8(n8Var, v5Var, a10));
                arrayList.add(new o9(n8Var, v5Var, a10));
                arrayList.add(new n9(n8Var, v5Var, a10, new Throwable().getStackTrace()));
                arrayList.add(new s9(n8Var, v5Var, a10, view));
                arrayList.add(new m9(n8Var, v5Var, a10));
                yr<Boolean> yrVar = es.E1;
                jo joVar = jo.f10145d;
                if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                    arrayList.add(new v8(n8Var, v5Var, a10, view, activity));
                }
                if (z10 && ((Boolean) joVar.f10148c.a(es.G1)).booleanValue()) {
                    arrayList.add(new p9(n8Var, v5Var, a10, this.O));
                }
            }
            list = arrayList;
        }
        q(list);
    }

    public final synchronized void r(n8 n8Var, v5 v5Var) {
        MotionEvent motionEvent;
        try {
            o8 m10 = m(n8Var, this.f13934s, this.K);
            Long l10 = m10.f12027a;
            if (l10 != null) {
                long longValue = l10.longValue();
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.w0((k6) v5Var.f9883t, longValue);
            }
            Long l11 = m10.f12028b;
            if (l11 != null) {
                long longValue2 = l11.longValue();
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.x0((k6) v5Var.f9883t, longValue2);
            }
            Long l12 = m10.f12029c;
            if (l12 != null) {
                long longValue3 = l12.longValue();
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.y0((k6) v5Var.f9883t, longValue3);
            }
            if (this.J) {
                Long l13 = m10.f12030d;
                if (l13 != null) {
                    long longValue4 = l13.longValue();
                    if (v5Var.f9884u) {
                        v5Var.m();
                        v5Var.f9884u = false;
                    }
                    k6.y((k6) v5Var.f9883t, longValue4);
                }
                Long l14 = m10.f12031e;
                if (l14 != null) {
                    long longValue5 = l14.longValue();
                    if (v5Var.f9884u) {
                        v5Var.m();
                        v5Var.f9884u = false;
                    }
                    k6.z((k6) v5Var.f9883t, longValue5);
                }
            }
        } catch (e8 unused) {
        }
        g6 v10 = h6.v();
        int i10 = 1;
        if (this.f13936u > 0) {
            DisplayMetrics displayMetrics = this.K;
            char[] cArr = p8.f12428a;
            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                long a10 = p8.a(this.B, displayMetrics);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                h6.I((h6) v10.f9883t, a10);
                long a11 = p8.a(this.G - this.E, this.K);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                h6.J((h6) v10.f9883t, a11);
                long a12 = p8.a(this.H - this.F, this.K);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                h6.K((h6) v10.f9883t, a12);
                long a13 = p8.a(this.E, this.K);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                h6.N((h6) v10.f9883t, a13);
                long a14 = p8.a(this.F, this.K);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                h6.O((h6) v10.f9883t, a14);
                if (this.J && (motionEvent = this.f13934s) != null) {
                    long a15 = p8.a(((this.E - this.G) + motionEvent.getRawX()) - this.f13934s.getX(), this.K);
                    if (a15 != 0) {
                        if (v10.f9884u) {
                            v10.m();
                            v10.f9884u = false;
                        }
                        h6.L((h6) v10.f9883t, a15);
                    }
                    long a16 = p8.a(((this.F - this.H) + this.f13934s.getRawY()) - this.f13934s.getY(), this.K);
                    if (a16 != 0) {
                        if (v10.f9884u) {
                            v10.m();
                            v10.f9884u = false;
                        }
                        h6.M((h6) v10.f9883t, a16);
                    }
                }
            }
        }
        try {
            o8 i11 = i(this.f13934s);
            Long l15 = i11.f12027a;
            if (l15 != null) {
                long longValue6 = l15.longValue();
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                h6.x((h6) v10.f9883t, longValue6);
            }
            Long l16 = i11.f12028b;
            if (l16 != null) {
                long longValue7 = l16.longValue();
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                h6.y((h6) v10.f9883t, longValue7);
            }
            long longValue8 = i11.f12029c.longValue();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            h6.E((h6) v10.f9883t, longValue8);
            if (this.J) {
                Long l17 = i11.f12031e;
                if (l17 != null) {
                    long longValue9 = l17.longValue();
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    h6.z((h6) v10.f9883t, longValue9);
                }
                Long l18 = i11.f12030d;
                if (l18 != null) {
                    long longValue10 = l18.longValue();
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    h6.C((h6) v10.f9883t, longValue10);
                }
                Long l19 = i11.f12032f;
                if (l19 != null) {
                    int i12 = l19.longValue() != 0 ? 2 : 1;
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    h6.P((h6) v10.f9883t, i12);
                }
                long j3 = this.f13937v;
                if (j3 > 0) {
                    DisplayMetrics displayMetrics2 = this.K;
                    char[] cArr2 = p8.f12428a;
                    Long valueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.A / j3)) : null;
                    if (valueOf != null) {
                        long longValue11 = valueOf.longValue();
                        if (v10.f9884u) {
                            v10.m();
                            v10.f9884u = false;
                        }
                        h6.A((h6) v10.f9883t, longValue11);
                    } else {
                        if (v10.f9884u) {
                            v10.m();
                            v10.f9884u = false;
                        }
                        h6.B((h6) v10.f9883t);
                    }
                    long round = Math.round(this.f13940z / this.f13937v);
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    h6.D((h6) v10.f9883t, round);
                }
                Long l20 = i11.f12035i;
                if (l20 != null) {
                    long longValue12 = l20.longValue();
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    h6.G((h6) v10.f9883t, longValue12);
                }
                Long l21 = i11.f12036j;
                if (l21 != null) {
                    long longValue13 = l21.longValue();
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    h6.F((h6) v10.f9883t, longValue13);
                }
                Long l22 = i11.f12037k;
                if (l22 != null) {
                    if (l22.longValue() != 0) {
                        i10 = 2;
                    }
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    h6.Q((h6) v10.f9883t, i10);
                }
            }
        } catch (e8 unused2) {
        }
        long j10 = this.y;
        if (j10 > 0) {
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            h6.H((h6) v10.f9883t, j10);
        }
        h6 k10 = v10.k();
        if (v5Var.f9884u) {
            v5Var.m();
            v5Var.f9884u = false;
        }
        k6.L((k6) v5Var.f9883t, k10);
        long j11 = this.f13936u;
        if (j11 > 0) {
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.C((k6) v5Var.f9883t, j11);
        }
        long j12 = this.f13937v;
        if (j12 > 0) {
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.B((k6) v5Var.f9883t, j12);
        }
        long j13 = this.f13938w;
        if (j13 > 0) {
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.A((k6) v5Var.f9883t, j13);
        }
        long j14 = this.f13939x;
        if (j14 > 0) {
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.D((k6) v5Var.f9883t, j14);
        }
        try {
            int size = this.f13935t.size() - 1;
            if (size > 0) {
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.N((k6) v5Var.f9883t);
                for (int i13 = 0; i13 < size; i13++) {
                    o8 m11 = m(t7.L, this.f13935t.get(i13), this.K);
                    g6 v11 = h6.v();
                    long longValue14 = m11.f12027a.longValue();
                    if (v11.f9884u) {
                        v11.m();
                        v11.f9884u = false;
                    }
                    h6.x((h6) v11.f9883t, longValue14);
                    long longValue15 = m11.f12028b.longValue();
                    if (v11.f9884u) {
                        v11.m();
                        v11.f9884u = false;
                    }
                    h6.y((h6) v11.f9883t, longValue15);
                    h6 k11 = v11.k();
                    if (v5Var.f9884u) {
                        v5Var.m();
                        v5Var.f9884u = false;
                    }
                    k6.M((k6) v5Var.f9883t, k11);
                }
            }
        } catch (e8 unused3) {
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.N((k6) v5Var.f9883t);
        }
    }
}
