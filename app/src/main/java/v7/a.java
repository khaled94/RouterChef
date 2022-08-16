package v7;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final long f19795a;

    /* renamed from: b */
    public final String f19796b;

    /* renamed from: c */
    public final String f19797c;

    /* renamed from: d */
    public final b f19798d;

    /* renamed from: e */
    public final c f19799e;

    /* renamed from: f */
    public final String f19800f;

    /* renamed from: g */
    public final String f19801g;

    /* renamed from: i */
    public final int f19803i;

    /* renamed from: j */
    public final String f19804j;

    /* renamed from: l */
    public final EnumC0143a f19806l;

    /* renamed from: m */
    public final String f19807m;

    /* renamed from: o */
    public final String f19809o;

    /* renamed from: h */
    public final int f19802h = 0;

    /* renamed from: k */
    public final long f19805k = 0;

    /* renamed from: n */
    public final long f19808n = 0;

    /* renamed from: v7.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0143a implements k7.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);
        

        /* renamed from: s */
        public final int f19813s;

        EnumC0143a(int i10) {
            this.f19813s = i10;
        }

        @Override // k7.c
        public final int b() {
            return this.f19813s;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements k7.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: s */
        public final int f19818s;

        b(int i10) {
            this.f19818s = i10;
        }

        @Override // k7.c
        public final int b() {
            return this.f19818s;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements k7.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);
        

        /* renamed from: s */
        public final int f19822s;

        c(int i10) {
            this.f19822s = i10;
        }

        @Override // k7.c
        public final int b() {
            return this.f19822s;
        }
    }

    public a(long j3, String str, String str2, b bVar, c cVar, String str3, String str4, int i10, String str5, EnumC0143a enumC0143a, String str6, String str7) {
        this.f19795a = j3;
        this.f19796b = str;
        this.f19797c = str2;
        this.f19798d = bVar;
        this.f19799e = cVar;
        this.f19800f = str3;
        this.f19801g = str4;
        this.f19803i = i10;
        this.f19804j = str5;
        this.f19806l = enumC0143a;
        this.f19807m = str6;
        this.f19809o = str7;
    }
}
