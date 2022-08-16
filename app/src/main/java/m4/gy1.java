package m4;

import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class gy1 extends ay1 {
    @Override // m4.ay1
    public final void a(ly1 ly1Var, @CheckForNull ly1 ly1Var2) {
        ly1Var.f11048b = ly1Var2;
    }

    @Override // m4.ay1
    public final void b(ly1 ly1Var, Thread thread) {
        ly1Var.f11047a = thread;
    }

    @Override // m4.ay1
    public final boolean c(my1<?> my1Var, @CheckForNull dy1 dy1Var, dy1 dy1Var2) {
        synchronized (my1Var) {
            if (my1Var.f11359t == dy1Var) {
                my1Var.f11359t = dy1Var2;
                return true;
            }
            return false;
        }
    }

    @Override // m4.ay1
    public final boolean d(my1<?> my1Var, @CheckForNull Object obj, Object obj2) {
        synchronized (my1Var) {
            try {
                if (my1Var.f11358s != obj) {
                    return false;
                }
                my1Var.f11358s = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m4.ay1
    public final boolean e(my1<?> my1Var, @CheckForNull ly1 ly1Var, @CheckForNull ly1 ly1Var2) {
        synchronized (my1Var) {
            try {
                if (my1Var.f11360u != ly1Var) {
                    return false;
                }
                my1Var.f11360u = ly1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
