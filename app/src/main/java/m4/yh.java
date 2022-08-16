package m4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;
import n3.k1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class yh {

    /* renamed from: b */
    public int f15782b;

    /* renamed from: a */
    public final Object f15781a = new Object();

    /* renamed from: c */
    public final List<xh> f15783c = new LinkedList();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    public final void a(xh xhVar) {
        synchronized (this.f15781a) {
            if (this.f15783c.size() >= 10) {
                int size = this.f15783c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                g1.e(sb.toString());
                this.f15783c.remove(0);
            }
            int i10 = this.f15782b;
            this.f15782b = i10 + 1;
            xhVar.f15355l = i10;
            synchronized (xhVar.f15350g) {
                int i11 = xhVar.f15347d ? xhVar.f15345b : (xhVar.f15354k * xhVar.f15344a) + (xhVar.f15355l * xhVar.f15345b);
                if (i11 > xhVar.f15357n) {
                    xhVar.f15357n = i11;
                }
            }
            this.f15783c.add(xhVar);
        }
    }

    public final boolean b(xh xhVar) {
        synchronized (this.f15781a) {
            Iterator<xh> it = this.f15783c.iterator();
            while (it.hasNext()) {
                xh next = it.next();
                s sVar = s.B;
                if (!((k1) sVar.f5793g.c()).r()) {
                    if (xhVar != next && next.f15358o.equals(xhVar.f15358o)) {
                        it.remove();
                        return true;
                    }
                } else if (!((k1) sVar.f5793g.c()).t() && xhVar != next && next.f15359q.equals(xhVar.f15359q)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }
}
