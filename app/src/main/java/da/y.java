package da;

import ca.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import r9.c0;
import r9.f0;
import r9.s;
import r9.u;
import r9.v;
import r9.x;
import r9.y;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: l */
    public static final char[] f4127l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f4128m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f4129a;

    /* renamed from: b */
    public final v f4130b;
    @Nullable

    /* renamed from: c */
    public String f4131c;
    @Nullable

    /* renamed from: d */
    public v.a f4132d;

    /* renamed from: e */
    public final c0.a f4133e = new c0.a();

    /* renamed from: f */
    public final u.a f4134f;
    @Nullable

    /* renamed from: g */
    public x f4135g;

    /* renamed from: h */
    public final boolean f4136h;
    @Nullable

    /* renamed from: i */
    public y.a f4137i;
    @Nullable

    /* renamed from: j */
    public s.a f4138j;
    @Nullable

    /* renamed from: k */
    public f0 f4139k;

    /* loaded from: classes.dex */
    public static class a extends f0 {

        /* renamed from: a */
        public final f0 f4140a;

        /* renamed from: b */
        public final x f4141b;

        public a(f0 f0Var, x xVar) {
            this.f4140a = f0Var;
            this.f4141b = xVar;
        }

        @Override // r9.f0
        public final long a() {
            return this.f4140a.a();
        }

        @Override // r9.f0
        public final x b() {
            return this.f4141b;
        }

        @Override // r9.f0
        public final void c(g gVar) {
            this.f4140a.c(gVar);
        }
    }

    public y(String str, v vVar, @Nullable String str2, @Nullable u uVar, @Nullable x xVar, boolean z10, boolean z11, boolean z12) {
        this.f4129a = str;
        this.f4130b = vVar;
        this.f4131c = str2;
        this.f4135g = xVar;
        this.f4136h = z10;
        this.f4134f = uVar != null ? uVar.e() : new u.a();
        if (z11) {
            this.f4138j = new s.a();
        } else if (!z12) {
        } else {
            y.a aVar = new y.a();
            this.f4137i = aVar;
            x xVar2 = r9.y.f17498f;
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(xVar2, "type == null");
            if (xVar2.f17495b.equals("multipart")) {
                aVar.f17507b = xVar2;
                return;
            }
            throw new IllegalArgumentException("multipart != " + xVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void a(String str, String str2, boolean z10) {
        s.a aVar = this.f4138j;
        Objects.requireNonNull(aVar);
        if (z10) {
            Objects.requireNonNull(str, "name == null");
            aVar.f17466a.add(v.c(str, true));
            aVar.f17467b.add(v.c(str2, true));
            return;
        }
        Objects.requireNonNull(str, "name == null");
        aVar.f17466a.add(v.c(str, false));
        aVar.f17467b.add(v.c(str2, false));
    }

    public final void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f4134f.a(str, str2);
            return;
        }
        try {
            this.f4135g = x.a(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(d7.a.c("Malformed content type: ", str2), e10);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<r9.y$b>, java.util.ArrayList] */
    public final void c(u uVar, f0 f0Var) {
        y.a aVar = this.f4137i;
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(f0Var, "body == null");
        if (uVar == null || uVar.c("Content-Type") == null) {
            if (uVar != null && uVar.c("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            aVar.f17508c.add(new y.b(uVar, f0Var));
            return;
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type");
    }

    public final void d(String str, @Nullable String str2, boolean z10) {
        String str3 = this.f4131c;
        String str4 = null;
        if (str3 != null) {
            v.a k10 = this.f4130b.k(str3);
            this.f4132d = k10;
            if (k10 == null) {
                StringBuilder c10 = androidx.activity.result.a.c("Malformed URL. Base: ");
                c10.append(this.f4130b);
                c10.append(", Relative: ");
                c10.append(this.f4131c);
                throw new IllegalArgumentException(c10.toString());
            }
            this.f4131c = null;
        }
        if (z10) {
            v.a aVar = this.f4132d;
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(str, "encodedName == null");
            if (aVar.f17490g == null) {
                aVar.f17490g = new ArrayList();
            }
            aVar.f17490g.add(v.b(str, " \"'<>#&=", true, false, true, true));
            List<String> list = aVar.f17490g;
            if (str2 != null) {
                str4 = v.b(str2, " \"'<>#&=", true, false, true, true);
            }
            list.add(str4);
            return;
        }
        v.a aVar2 = this.f4132d;
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(str, "name == null");
        if (aVar2.f17490g == null) {
            aVar2.f17490g = new ArrayList();
        }
        aVar2.f17490g.add(v.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
        List<String> list2 = aVar2.f17490g;
        if (str2 != null) {
            str4 = v.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
        }
        list2.add(str4);
    }
}
