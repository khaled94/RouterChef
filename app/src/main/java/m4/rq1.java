package m4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class rq1 {

    /* renamed from: c */
    public static final rq1 f13418c = new rq1();

    /* renamed from: a */
    public final ArrayList<jq1> f13419a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<jq1> f13420b = new ArrayList<>();

    public final Collection<jq1> a() {
        return Collections.unmodifiableCollection(this.f13420b);
    }

    public final Collection<jq1> b() {
        return Collections.unmodifiableCollection(this.f13419a);
    }

    public final boolean c() {
        return this.f13420b.size() > 0;
    }
}
