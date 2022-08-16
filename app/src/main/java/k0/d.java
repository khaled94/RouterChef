package k0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final C0082d f5558a = new C0082d(null, false);

    /* renamed from: b */
    public static final C0082d f5559b = new C0082d(null, true);

    /* renamed from: c */
    public static final C0082d f5560c;

    /* renamed from: d */
    public static final C0082d f5561d;

    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a */
        public static final a f5562a = new a();

        @Override // k0.d.b
        public final int a(CharSequence charSequence, int i10) {
            int i11 = i10 + 0;
            int i12 = 2;
            for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i13));
                C0082d c0082d = d.f5558a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i12 = 2;
                                break;
                        }
                    }
                    i12 = 0;
                }
                i12 = 1;
            }
            return i12;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i10);
    }

    /* loaded from: classes.dex */
    public static abstract class c implements k0.c {

        /* renamed from: a */
        public final b f5563a;

        public c(b bVar) {
            this.f5563a = bVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10) {
            if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f5563a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(charSequence, i10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                return false;
            }
            return a();
        }
    }

    /* renamed from: k0.d$d */
    /* loaded from: classes.dex */
    public static class C0082d extends c {

        /* renamed from: b */
        public final boolean f5564b;

        public C0082d(b bVar, boolean z10) {
            super(bVar);
            this.f5564b = z10;
        }

        @Override // k0.d.c
        public final boolean a() {
            return this.f5564b;
        }
    }

    static {
        a aVar = a.f5562a;
        f5560c = new C0082d(aVar, false);
        f5561d = new C0082d(aVar, true);
    }
}
