package m4;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import n3.g1;

/* loaded from: classes.dex */
public final class li {

    /* renamed from: a */
    public final int f10866a;

    /* renamed from: b */
    public final ni f10867b = new ni();

    public li(int i10) {
        this.f10866a = i10;
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append(arrayList.get(i10).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ki kiVar = new ki();
        PriorityQueue priorityQueue = new PriorityQueue(this.f10866a, new ji());
        for (String str : split) {
            String[] b10 = mi.b(str, false);
            if (b10.length != 0) {
                int i11 = this.f10866a;
                int length = b10.length;
                if (length < 6) {
                    qi.c(i11, qi.d(b10, length), qi.b(b10, 0, length), length, priorityQueue);
                } else {
                    long d5 = qi.d(b10, 6);
                    qi.c(i11, d5, qi.b(b10, 0, 6), 6, priorityQueue);
                    long j3 = 16785407;
                    long a10 = qi.a(16785407L, 5);
                    int i12 = 1;
                    long j10 = d5;
                    while (true) {
                        int length2 = b10.length;
                        if (i12 < length2 - 5) {
                            int i13 = i12;
                            long a11 = (((mi.a(b10[i13 + 5]) + 2147483647L) % 1073807359) + (((((j10 + 1073807359) - ((((mi.a(b10[i12 - 1]) + 2147483647L) % 1073807359) * a10) % 1073807359)) % 1073807359) * j3) % 1073807359)) % 1073807359;
                            qi.c(i11, a11, qi.b(b10, i13, 6), length2, priorityQueue);
                            j3 = j3;
                            i12 = i13 + 1;
                            j10 = a11;
                        }
                    }
                }
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ((Base64OutputStream) kiVar.f10436u).write(this.f10867b.b(((pi) it.next()).f12516b));
            } catch (IOException e10) {
                g1.h("Error while writing hash to byteStream", e10);
            }
        }
        return kiVar.toString();
    }
}
