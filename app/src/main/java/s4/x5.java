package s4;

import androidx.fragment.app.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import s4.w5;
import s4.x5;

/* loaded from: classes.dex */
public abstract class x5<MessageType extends x5<MessageType, BuilderType>, BuilderType extends w5<MessageType, BuilderType>> implements d8 {
    public int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void g(Iterable<T> iterable, List<? super T> list) {
        Charset charset = i7.f17920a;
        Objects.requireNonNull(iterable);
        if (iterable instanceof o7) {
            List<?> f10 = ((o7) iterable).f();
            o7 o7Var = (o7) list;
            int size = list.size();
            for (Object obj : f10) {
                if (obj == null) {
                    int size2 = o7Var.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = o7Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        o7Var.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof g6) {
                    o7Var.r((g6) obj);
                } else {
                    o7Var.add((String) obj);
                }
            }
        } else if (iterable instanceof k8) {
            list.addAll(iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
            }
            int size4 = list.size();
            for (T t10 : iterable) {
                if (t10 == 0) {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t10);
            }
        }
    }

    @Override // s4.d8
    public final g6 a() {
        try {
            b7 b7Var = (b7) this;
            int b10 = b7Var.b();
            f6 f6Var = g6.f17877t;
            byte[] bArr = new byte[b10];
            Logger logger = k6.y;
            i6 i6Var = new i6(bArr, b10);
            b7Var.m(i6Var);
            if (b10 - i6Var.C == 0) {
                return new f6(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(a.b(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public int f() {
        throw null;
    }

    public void h(int i10) {
        throw null;
    }

    public final byte[] i() {
        try {
            b7 b7Var = (b7) this;
            int b10 = b7Var.b();
            byte[] bArr = new byte[b10];
            Logger logger = k6.y;
            i6 i6Var = new i6(bArr, b10);
            b7Var.m(i6Var);
            if (b10 - i6Var.C == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(a.b(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
