package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import l0.g;
import u0.b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final b f1346a;

    /* renamed from: b */
    public final char[] f1347b;

    /* renamed from: c */
    public final a f1348c = new a(1024);

    /* renamed from: d */
    public final Typeface f1349d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final SparseArray<a> f1350a = new SparseArray<>(1);

        /* renamed from: b */
        public g f1351b;

        public a() {
        }

        public a(int i10) {
        }

        public final void a(g gVar, int i10, int i11) {
            int a10 = gVar.a(i10);
            SparseArray<a> sparseArray = this.f1350a;
            a aVar = sparseArray == null ? null : sparseArray.get(a10);
            if (aVar == null) {
                aVar = new a();
                this.f1350a.put(gVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(gVar, i10 + 1, i11);
            } else {
                aVar.f1351b = gVar;
            }
        }
    }

    public n(Typeface typeface, b bVar) {
        this.f1349d = typeface;
        this.f1346a = bVar;
        this.f1347b = new char[bVar.c() * 2];
        int c10 = bVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            g gVar = new g(this, i10);
            Character.toChars(gVar.d(), this.f1347b, i10 * 2);
            g.b(gVar.b() > 0, "invalid metadata codepoint length");
            this.f1348c.a(gVar, 0, gVar.b() - 1);
        }
    }
}
