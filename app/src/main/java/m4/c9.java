package m4;

import i3.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class c9 extends v9 {
    public c9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", v5Var, i10, 24);
    }

    @Override // m4.v9
    public final void a() {
        if (this.f14616a.f11562m) {
            c();
            return;
        }
        synchronized (this.f14619d) {
            this.f14619d.p((String) this.f14620e.invoke(null, this.f14616a.f11550a));
        }
    }

    @Override // m4.v9
    public final void b() {
        n8 n8Var = this.f14616a;
        if (n8Var.p) {
            super.b();
        } else if (!n8Var.f11562m) {
        } else {
            c();
        }
    }

    public final void c() {
        Future future;
        n8 n8Var = this.f14616a;
        a aVar = null;
        if (n8Var.f11556g) {
            if (n8Var.f11555f == null && (future = n8Var.f11557h) != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    n8Var.f11557h = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    n8Var.f11557h.cancel(true);
                }
            }
            aVar = n8Var.f11555f;
        }
        if (aVar == null) {
            return;
        }
        try {
            a.C0075a c10 = aVar.c();
            String str = c10.f5258a;
            char[] cArr = p8.f12428a;
            if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID fromString = UUID.fromString(str);
                byte[] bArr = new byte[16];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.putLong(fromString.getMostSignificantBits());
                wrap.putLong(fromString.getLeastSignificantBits());
                str = n.a.d(bArr, true);
            }
            if (str == null) {
                return;
            }
            synchronized (this.f14619d) {
                this.f14619d.p(str);
                v5 v5Var = this.f14619d;
                boolean z10 = c10.f5259b;
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.X((k6) v5Var.f9883t, z10);
                v5 v5Var2 = this.f14619d;
                if (v5Var2.f9884u) {
                    v5Var2.m();
                    v5Var2.f9884u = false;
                }
                k6.i0((k6) v5Var2.f9883t);
            }
        } catch (IOException unused3) {
        }
    }

    @Override // m4.v9, java.util.concurrent.Callable
    public final Object call() {
        n8 n8Var = this.f14616a;
        if (n8Var.p) {
            super.b();
            return null;
        } else if (!n8Var.f11562m) {
            return null;
        } else {
            c();
            return null;
        }
    }
}
