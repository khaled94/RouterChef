package androidx.lifecycle;

/* loaded from: classes.dex */
public class r<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void h(T t10) {
        LiveData.a("setValue");
        this.f1638g++;
        this.f1636e = t10;
        c(null);
    }
}
