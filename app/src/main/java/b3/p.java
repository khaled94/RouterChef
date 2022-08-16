package b3;

import b3.b0;
import c3.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import k7.h;
import q2.b;
import q2.e;
import u7.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements b0.a, e {

    /* renamed from: t */
    public static final /* synthetic */ p f2534t = new p(1);

    /* renamed from: s */
    public final /* synthetic */ int f2535s;

    public /* synthetic */ p(int i10) {
        this.f2535s = i10;
    }

    @Override // b3.b0.a
    public final Object a(Object obj) {
        switch (this.f2535s) {
            case 0:
                b bVar = b0.f2495x;
                throw new a("Timed out while trying to open db.", (Throwable) obj);
            default:
                v7.b bVar2 = (v7.b) obj;
                Objects.requireNonNull(bVar2);
                h hVar = a0.f19481a;
                Objects.requireNonNull(hVar);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    hVar.a(bVar2, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }
}
