package androidx.lifecycle;

import androidx.lifecycle.g;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements j {

    /* renamed from: a */
    public final c f1626a;

    /* renamed from: b */
    public final j f1627b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1628a;

        static {
            int[] iArr = new int[g.b.values().length];
            f1628a = iArr;
            try {
                iArr[g.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1628a[g.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1628a[g.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1628a[g.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1628a[g.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1628a[g.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1628a[g.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(c cVar, j jVar) {
        this.f1626a = cVar;
        this.f1627b = jVar;
    }

    @Override // androidx.lifecycle.j
    public final void a(l lVar, g.b bVar) {
        switch (a.f1628a[bVar.ordinal()]) {
            case 1:
                this.f1626a.c();
                break;
            case 2:
                this.f1626a.d();
                break;
            case 3:
                this.f1626a.onResume();
                break;
            case 4:
                this.f1626a.onPause();
                break;
            case 5:
                this.f1626a.b();
                break;
            case 6:
                this.f1626a.onDestroy();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        j jVar = this.f1627b;
        if (jVar != null) {
            jVar.a(lVar, bVar);
        }
    }
}
