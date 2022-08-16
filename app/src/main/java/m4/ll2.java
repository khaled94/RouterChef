package m4;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class ll2 implements Comparator {

    /* renamed from: s */
    public static final /* synthetic */ ll2 f10917s = new ll2();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        fx1<Integer> fx1Var = ul2.f14450e;
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() != -1) {
            return num.intValue() - num2.intValue();
        } else {
            return 1;
        }
    }
}
