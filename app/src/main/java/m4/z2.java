package m4;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a */
    public final List<y2> f15978a;

    /* renamed from: b */
    public final byte[] f15979b;

    public z2(int i10, String str, List<y2> list, byte[] bArr) {
        this.f15978a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f15979b = bArr;
    }
}
