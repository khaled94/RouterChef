package d4;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class c {
    @Nullable

    /* renamed from: a */
    public final Account f3834a;

    /* renamed from: b */
    public final Set<Scope> f3835b;

    /* renamed from: c */
    public final Set<Scope> f3836c;
    @Nullable

    /* renamed from: d */
    public final View f3837d;

    /* renamed from: e */
    public final String f3838e;

    /* renamed from: f */
    public final String f3839f;

    /* renamed from: g */
    public final z4.a f3840g;

    /* renamed from: h */
    public Integer f3841h;

    /* loaded from: classes.dex */
    public static final class a {
        @Nullable

        /* renamed from: a */
        public Account f3842a;

        /* renamed from: b */
        public r.c<Scope> f3843b;

        /* renamed from: c */
        public String f3844c;

        /* renamed from: d */
        public String f3845d;

        public final c a() {
            return new c(this.f3842a, this.f3843b, this.f3844c, this.f3845d);
        }
    }

    public c(@Nullable Account account, Set set, String str, String str2) {
        z4.a aVar = z4.a.f20976b;
        this.f3834a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f3835b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f3837d = null;
        this.f3838e = str;
        this.f3839f = str2;
        this.f3840g = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (t tVar : emptyMap.values()) {
            Objects.requireNonNull(tVar);
            hashSet.addAll(null);
        }
        this.f3836c = Collections.unmodifiableSet(hashSet);
    }
}
