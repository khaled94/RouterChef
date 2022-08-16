package b4;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import b4.a.c;
import b4.d;
import c4.j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import d4.b;
import e1.h;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends c> {

    /* renamed from: a */
    public final AbstractC0032a<?, O> f2557a;

    /* renamed from: b */
    public final String f2558b;

    /* renamed from: b4.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0032a<T extends e, O> extends d<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, d4.c cVar, O o10, d.a aVar, d.b bVar) {
            return b(context, looper, cVar, o10, aVar, bVar);
        }

        public T b(Context context, Looper looper, d4.c cVar, O o10, c4.d dVar, j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public static class b<C> {
    }

    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: a */
        public static final C0034c f2559a = new C0034c(null);

        /* renamed from: b4.a$c$a */
        /* loaded from: classes.dex */
        public interface AbstractC0033a extends c {
            Account a();
        }

        /* loaded from: classes.dex */
        public interface b extends c {
            GoogleSignInAccount b();
        }

        /* renamed from: b4.a$c$c */
        /* loaded from: classes.dex */
        public static final class C0034c implements c {
            public C0034c() {
            }

            public /* synthetic */ C0034c(h hVar) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<T, O> {
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a();

        Set<Scope> b();

        void c(d4.h hVar, Set<Scope> set);

        void d(String str);

        boolean e();

        int f();

        boolean g();

        a4.d[] h();

        String i();

        String j();

        void k(b.e eVar);

        boolean l();

        void m(b.c cVar);
    }

    /* loaded from: classes.dex */
    public static final class f<C extends e> extends b<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends e> a(String str, AbstractC0032a<C, O> abstractC0032a, f<C> fVar) {
        this.f2558b = str;
        this.f2557a = abstractC0032a;
    }
}
