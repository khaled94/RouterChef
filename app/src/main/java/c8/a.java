package c8;

import e8.c;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import x7.h;
import x7.s;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class a extends w<Date> {

    /* renamed from: b */
    public static final C0040a f2817b = new C0040a();

    /* renamed from: a */
    public final SimpleDateFormat f2818a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: c8.a$a */
    /* loaded from: classes.dex */
    public class C0040a implements x {
        @Override // x7.x
        public final <T> w<T> a(h hVar, d8.a<T> aVar) {
            if (aVar.f3994a == Date.class) {
                return new a();
            }
            return null;
        }
    }

    @Override // x7.w
    public final Date a(e8.a aVar) {
        java.util.Date parse;
        if (aVar.x0() == 9) {
            aVar.t0();
            return null;
        }
        String v02 = aVar.v0();
        try {
            synchronized (this) {
                parse = this.f2818a.parse(v02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            throw new s("Failed parsing '" + v02 + "' as SQL Date; at path " + aVar.Z(), e10);
        }
    }

    @Override // x7.w
    public final void b(c cVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            cVar.Z();
            return;
        }
        synchronized (this) {
            format = this.f2818a.format((java.util.Date) date2);
        }
        cVar.r0(format);
    }
}
