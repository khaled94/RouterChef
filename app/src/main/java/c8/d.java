package c8;

import c8.a;
import c8.b;
import c8.c;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final boolean f2823a;

    /* renamed from: b */
    public static final a.C0040a f2824b;

    /* renamed from: c */
    public static final b.a f2825c;

    /* renamed from: d */
    public static final c.a f2826d;

    /* loaded from: classes.dex */
    public class a extends a8.d<Date> {
    }

    /* loaded from: classes.dex */
    public class b extends a8.d<Timestamp> {
    }

    static {
        boolean z10;
        c.a aVar;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f2823a = z10;
        if (z10) {
            f2824b = c8.a.f2817b;
            f2825c = c8.b.f2819b;
            aVar = c.f2821b;
        } else {
            aVar = null;
            f2824b = null;
            f2825c = null;
        }
        f2826d = aVar;
    }
}
