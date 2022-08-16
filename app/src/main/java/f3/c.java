package f3;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import d4.m;
import java.util.Objects;
import m4.c10;
import m4.eo;
import m4.go;
import m4.io;
import m4.nn;
import m4.wo;
import m4.zo;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final nn f4485a;

    /* renamed from: b */
    public final Context f4486b;

    /* renamed from: c */
    public final wo f4487c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Context f4488a;

        /* renamed from: b */
        public final zo f4489b;

        public a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
            m.i(context, "context cannot be null");
            go goVar = io.f9708f.f9710b;
            c10 c10Var = new c10();
            Objects.requireNonNull(goVar);
            this.f4488a = context;
            this.f4489b = new eo(goVar, context, str, c10Var).d(context, false);
        }
    }

    public c(Context context, wo woVar) {
        nn nnVar = nn.f11862a;
        this.f4486b = context;
        this.f4487c = woVar;
        this.f4485a = nnVar;
    }
}
