package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1682a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1683b;

        static {
            int[] iArr = new int[b.values().length];
            f1683b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1683b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1683b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1683b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1683b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1683b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1683b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f1682a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1682a[3] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1682a[4] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1682a[0] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1682a[1] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static b d(c cVar) {
            int ordinal = cVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return ON_START;
                }
                if (ordinal == 3) {
                    return ON_RESUME;
                }
                return null;
            }
            return ON_CREATE;
        }

        public final c b() {
            switch (a.f1683b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean b(c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    public g() {
        new AtomicReference();
    }

    public abstract void a(k kVar);

    public abstract c b();

    public abstract void c(k kVar);
}
