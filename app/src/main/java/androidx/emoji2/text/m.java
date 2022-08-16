package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import u0.b;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final ByteBuffer f1345a;

        public a(ByteBuffer byteBuffer) {
            this.f1345a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() {
            return this.f1345a.getInt() & 4294967295L;
        }

        public final void b(int i10) {
            ByteBuffer byteBuffer = this.f1345a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    public static b a(ByteBuffer byteBuffer) {
        long j3;
        ByteBuffer duplicate = byteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.b(4);
        int i10 = duplicate.getShort() & 65535;
        if (i10 <= 100) {
            aVar.b(6);
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    j3 = -1;
                    break;
                }
                int i12 = aVar.f1345a.getInt();
                aVar.b(4);
                j3 = aVar.a();
                aVar.b(4);
                if (1835365473 == i12) {
                    break;
                }
                i11++;
            }
            if (j3 != -1) {
                aVar.b((int) (j3 - aVar.f1345a.position()));
                aVar.b(12);
                long a10 = aVar.a();
                for (int i13 = 0; i13 < a10; i13++) {
                    int i14 = aVar.f1345a.getInt();
                    long a11 = aVar.a();
                    aVar.a();
                    if (1164798569 == i14 || 1701669481 == i14) {
                        duplicate.position((int) (a11 + j3));
                        b bVar = new b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
