package m4;

import d.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jw1<K, V> {

    /* renamed from: a */
    public Object[] f10210a;

    /* renamed from: b */
    public int f10211b = 0;

    public jw1(int i10) {
        this.f10210a = new Object[i10 + i10];
    }

    public final jw1<K, V> a(K k10, V v10) {
        c(this.f10211b + 1);
        b.l(k10, v10);
        Object[] objArr = this.f10210a;
        int i10 = this.f10211b;
        int i11 = i10 + i10;
        objArr[i11] = k10;
        objArr[i11 + 1] = v10;
        this.f10211b = i10 + 1;
        return this;
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v3 ??, r4v5 ??, r4v4 ??, r4v6 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.tryInsertCasts(TypeInferenceVisitor.java:594)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:109)
        */
    public final m4.kw1<K, V> b() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.jw1.b():m4.kw1");
    }

    public final void c(int i10) {
        int i11 = i10 + i10;
        Object[] objArr = this.f10210a;
        int length = objArr.length;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f10210a = Arrays.copyOf(objArr, i12);
        }
    }
}
