package b7;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: s */
    public final d[] f2592s;

    /* renamed from: t */
    public final b f2593t = new b();

    public a(d... dVarArr) {
        this.f2592s = dVarArr;
    }

    @Override // b7.d
    public final StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        d[] dVarArr;
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f2592s) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = dVar.b(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.f2593t.b(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
