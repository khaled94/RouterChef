package k4;

import a4.i;
import android.content.Context;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c<T> {

    /* renamed from: a */
    public final String f5596a;

    /* renamed from: b */
    public T f5597b;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a() {
            super("Could not get remote context.");
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public c(String str) {
        this.f5596a = str;
    }

    public abstract T a(IBinder iBinder);

    public final T b(Context context) {
        if (this.f5597b == null) {
            Objects.requireNonNull(context, "null reference");
            Context a10 = i.a(context);
            if (a10 == null) {
                throw new a();
            }
            try {
                this.f5597b = a((IBinder) a10.getClassLoader().loadClass(this.f5596a).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new a("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new a("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new a("Could not instantiate creator.", e12);
            }
        }
        return this.f5597b;
    }
}
