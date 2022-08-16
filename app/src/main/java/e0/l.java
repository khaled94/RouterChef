package e0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import d0.e;
import j0.n;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class l {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public ConcurrentHashMap<Long, e.c> f4337a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public class a implements b<n> {
        @Override // e0.l.b
        public final int a(n nVar) {
            return nVar.f5418c;
        }

        @Override // e0.l.b
        public final boolean b(n nVar) {
            return nVar.f5419d;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public static <T> T e(T[] tArr, int i10, b<T> bVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        T t10 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(bVar.a(t11) - i11) * 2) + (bVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i12 > abs) {
                t10 = t11;
                i12 = abs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, n[] nVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d5 = m.d(context);
        if (d5 == null) {
            return null;
        }
        try {
            if (m.c(d5, inputStream)) {
                return Typeface.createFromFile(d5.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d5.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d5 = m.d(context);
        if (d5 == null) {
            return null;
        }
        try {
            if (m.b(d5, resources, i10)) {
                return Typeface.createFromFile(d5.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d5.delete();
        }
    }

    public n f(n[] nVarArr, int i10) {
        return (n) e(nVarArr, i10, new a());
    }
}
