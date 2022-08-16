package m4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import n3.g1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class qi implements m02 {

    /* renamed from: s */
    public static final eu0 f12878s = new eu0();

    /* renamed from: t */
    public static final cz0 f12879t = new cz0(0);

    /* renamed from: u */
    public static final xf0 f12880u = new xf0(2);

    public static long a(long j3, int i10) {
        return i10 == 1 ? j3 : (i10 & 1) == 0 ? a((j3 * j3) % 1073807359, i10 >> 1) % 1073807359 : ((a((j3 * j3) % 1073807359, i10 >> 1) % 1073807359) * j3) % 1073807359;
    }

    public static String b(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            g1.g("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 >= i13) {
                sb.append(strArr[i13]);
                return sb.toString();
            }
            sb.append(strArr[i10]);
            sb.append(' ');
            i10++;
        }
    }

    public static void c(int i10, long j3, String str, int i11, PriorityQueue priorityQueue) {
        pi piVar = new pi(j3, str, i11);
        if ((priorityQueue.size() != i10 || (((pi) priorityQueue.peek()).f12517c <= i11 && ((pi) priorityQueue.peek()).f12515a <= j3)) && !priorityQueue.contains(piVar)) {
            priorityQueue.add(piVar);
            if (priorityQueue.size() <= i10) {
                return;
            }
            priorityQueue.poll();
        }
    }

    public static long d(String[] strArr, int i10) {
        long a10 = (mi.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            a10 = (((mi.a(strArr[i11]) + 2147483647L) % 1073807359) + ((a10 * 16785407) % 1073807359)) % 1073807359;
        }
        return a10;
    }

    public static final Set e(Object obj, Executor executor) {
        return ot.f12288a.e().booleanValue() ? Collections.singleton(new es0(obj, executor)) : Collections.emptySet();
    }
}
