package m4;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class ji implements Comparator<pi> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(pi piVar, pi piVar2) {
        pi piVar3 = piVar;
        pi piVar4 = piVar2;
        int i10 = piVar3.f12517c - piVar4.f12517c;
        return i10 != 0 ? i10 : (int) (piVar3.f12515a - piVar4.f12515a);
    }
}
