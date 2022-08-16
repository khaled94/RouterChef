package x2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final long f20006a;

    /* renamed from: b */
    public final a f20007b;

    /* loaded from: classes.dex */
    public enum a implements k7.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: s */
        public final int f20014s;

        a(int i10) {
            this.f20014s = i10;
        }

        @Override // k7.c
        public final int b() {
            return this.f20014s;
        }
    }

    public c(long j3, a aVar) {
        this.f20006a = j3;
        this.f20007b = aVar;
    }
}
