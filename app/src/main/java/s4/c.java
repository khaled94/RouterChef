package s4;

import androidx.activity.k;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator<n> {

    /* renamed from: s */
    public int f17748s = 0;

    /* renamed from: t */
    public final /* synthetic */ d f17749t;

    public c(d dVar) {
        this.f17749t = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17748s < this.f17749t.m();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ n next() {
        if (this.f17748s < this.f17749t.m()) {
            d dVar = this.f17749t;
            int i10 = this.f17748s;
            this.f17748s = i10 + 1;
            return dVar.o(i10);
        }
        throw new NoSuchElementException(k.a(32, "Out of bounds index: ", this.f17748s));
    }
}
