package c8;

import e8.c;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import x7.h;
import x7.s;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class b extends w<Time> {

    /* renamed from: b */
    public static final a f2819b = new a();

    /* renamed from: a */
    public final SimpleDateFormat f2820a = new SimpleDateFormat("hh:mm:ss a");

    /* loaded from: classes.dex */
    public class a implements x {
        @Override // x7.x
        public final <T> w<T> a(h hVar, d8.a<T> aVar) {
            if (aVar.f3994a == Time.class) {
                return new b();
            }
            return null;
        }
    }

    @Override // x7.w
    public final Time a(e8.a aVar) {
        Time time;
        if (aVar.x0() == 9) {
            aVar.t0();
            return null;
        }
        String v02 = aVar.v0();
        try {
            synchronized (this) {
                time = new Time(this.f2820a.parse(v02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            throw new s("Failed parsing '" + v02 + "' as SQL Time; at path " + aVar.Z(), e10);
        }
    }

    @Override // x7.w
    public final void b(c cVar, Time time) {
        String format;
        Time time2 = time;
        if (time2 == null) {
            cVar.Z();
            return;
        }
        synchronized (this) {
            format = this.f2820a.format((Date) time2);
        }
        cVar.r0(format);
    }
}
