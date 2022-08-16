package x7;

import java.math.BigDecimal;
import z7.k;

/* loaded from: classes.dex */
public abstract class t extends Enum<t> implements u {

    /* renamed from: s */
    public static final a f20090s;

    /* renamed from: t */
    public static final b f20091t;

    /* renamed from: u */
    public static final c f20092u;

    /* renamed from: v */
    public static final d f20093v;

    /* renamed from: w */
    public static final /* synthetic */ t[] f20094w;

    /* loaded from: classes.dex */
    public final class a extends t {
        public a() {
            super("DOUBLE", 0, null);
        }

        @Override // x7.u
        public final Number b(e8.a aVar) {
            return Double.valueOf(aVar.o0());
        }
    }

    /* loaded from: classes.dex */
    public final class b extends t {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1, null);
        }

        @Override // x7.u
        public final Number b(e8.a aVar) {
            return new k(aVar.v0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [x7.t$c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [x7.t$d] */
    static {
        a aVar = new a();
        f20090s = aVar;
        b bVar = new b();
        f20091t = bVar;
        ?? r32 = new t() { // from class: x7.t.c
            @Override // x7.u
            public final Number b(e8.a aVar2) {
                String v02 = aVar2.v0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(v02));
                    } catch (NumberFormatException e10) {
                        throw new p("Cannot parse " + v02 + "; at path " + aVar2.Z(), e10);
                    }
                } catch (NumberFormatException unused) {
                    Double valueOf = Double.valueOf(v02);
                    if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar2.f4435t) {
                        return valueOf;
                    }
                    throw new e8.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.Z());
                }
            }
        };
        f20092u = r32;
        ?? r52 = new t() { // from class: x7.t.d
            @Override // x7.u
            public final Number b(e8.a aVar2) {
                String v02 = aVar2.v0();
                try {
                    return new BigDecimal(v02);
                } catch (NumberFormatException e10) {
                    throw new p("Cannot parse " + v02 + "; at path " + aVar2.Z(), e10);
                }
            }
        };
        f20093v = r52;
        f20094w = new t[]{aVar, bVar, r32, r52};
    }

    public t(String str, int i10, a aVar) {
        super(str, i10);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f20094w.clone();
    }
}
