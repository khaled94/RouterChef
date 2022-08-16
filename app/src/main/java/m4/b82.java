package m4;

import androidx.fragment.app.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import m4.a82;
import m4.b82;

/* loaded from: classes.dex */
public abstract class b82<MessageType extends b82<MessageType, BuilderType>, BuilderType extends a82<MessageType, BuilderType>> implements qa2 {
    public int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void h(Iterable<T> iterable, List<? super T> list) {
        Charset charset = v92.f14624a;
        Objects.requireNonNull(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size = list.size();
        for (T t10 : iterable) {
            if (t10 == 0) {
                int size2 = list.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2 - size);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(sb2);
            }
            list.add(t10);
        }
    }

    @Override // m4.qa2
    public final byte[] b() {
        try {
            m92 m92Var = (m92) this;
            int e10 = m92Var.e();
            byte[] bArr = new byte[e10];
            Logger logger = v82.y;
            t82 t82Var = new t82(bArr, e10);
            m92Var.o(t82Var);
            if (e10 - t82Var.C == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e11) {
            String name = getClass().getName();
            throw new RuntimeException(a.b(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e11);
        }
    }

    @Override // m4.qa2
    public final n82 d() {
        try {
            m92 m92Var = (m92) this;
            int e10 = m92Var.e();
            l82 l82Var = n82.f11571t;
            byte[] bArr = new byte[e10];
            Logger logger = v82.y;
            t82 t82Var = new t82(bArr, e10);
            m92Var.o(t82Var);
            if (e10 - t82Var.C == 0) {
                return new l82(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e11) {
            String name = getClass().getName();
            throw new RuntimeException(a.b(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e11);
        }
    }

    public int g() {
        throw null;
    }

    public void i(int i10) {
        throw null;
    }
}
