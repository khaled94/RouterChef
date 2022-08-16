package d2;

import androidx.work.impl.WorkDatabase;
import c2.d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final WorkDatabase f3745a;

    public f(WorkDatabase workDatabase) {
        this.f3745a = workDatabase;
    }

    public final int a(String str) {
        this.f3745a.c();
        try {
            Long a10 = ((c2.f) this.f3745a.r()).a(str);
            int i10 = 0;
            int intValue = a10 != null ? a10.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i10 = intValue + 1;
            }
            ((c2.f) this.f3745a.r()).b(new d(str, i10));
            this.f3745a.o();
            return intValue;
        } finally {
            this.f3745a.k();
        }
    }

    public final int b(int i10) {
        int a10;
        synchronized (f.class) {
            a10 = a("next_job_scheduler_id");
            if (a10 < 0 || a10 > i10) {
                ((c2.f) this.f3745a.r()).b(new d("next_job_scheduler_id", 1));
                a10 = 0;
            }
        }
        return a10;
    }
}
