package d4;

import android.accounts.Account;
import android.os.IInterface;
import b4.a;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f<T extends IInterface> extends b<T> implements a.e {
    public final Set<Scope> y;

    /* renamed from: z */
    public final Account f3871z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r10, android.os.Looper r11, int r12, d4.c r13, c4.d r14, c4.j r15) {
        /*
            r9 = this;
            d4.g r3 = d4.g.a(r10)
            java.lang.Object r0 = a4.e.f129c
            a4.e r4 = a4.e.f130d
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r14, r0)
            java.util.Objects.requireNonNull(r15, r0)
            d4.y r6 = new d4.y
            r6.<init>(r14)
            d4.z r7 = new d4.z
            r7.<init>(r15)
            java.lang.String r8 = r13.f3839f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r10 = r13.f3834a
            r9.f3871z = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.f3836c
            java.util.Iterator r11 = r10.iterator()
        L2d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L48
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L40
            goto L2d
        L40:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L48:
            r9.y = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.f.<init>(android.content.Context, android.os.Looper, int, d4.c, c4.d, c4.j):void");
    }

    @Override // b4.a.e
    public final Set<Scope> b() {
        return l() ? this.y : Collections.emptySet();
    }

    @Override // d4.b
    public final Account q() {
        return this.f3871z;
    }

    @Override // d4.b
    public final void s() {
    }

    @Override // d4.b
    public final Set<Scope> u() {
        return this.y;
    }
}
