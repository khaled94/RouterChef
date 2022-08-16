package t1;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import t1.p;

/* loaded from: classes.dex */
public final class j extends p {

    /* loaded from: classes.dex */
    public static final class a extends p.a<a, j> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f18491b.f2638d = OverwritingInputMerger.class.getName();
        }
    }

    public j(a aVar) {
        super(aVar.f18490a, aVar.f18491b, aVar.f18492c);
    }
}
