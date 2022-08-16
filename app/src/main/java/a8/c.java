package a8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x7.h;
import x7.s;
import x7.w;
import x7.x;
import z7.j;

/* loaded from: classes.dex */
public final class c extends w<Date> {

    /* renamed from: b */
    public static final a f304b = new a();

    /* renamed from: a */
    public final List<DateFormat> f305a;

    /* loaded from: classes.dex */
    public class a implements x {
        @Override // x7.x
        public final <T> w<T> a(h hVar, d8.a<T> aVar) {
            if (aVar.f3994a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f305a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (j.f21030a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<java.text.DateFormat>, java.util.ArrayList] */
    @Override // x7.w
    public final Date a(e8.a aVar) {
        Date b10;
        if (aVar.x0() == 9) {
            aVar.t0();
            return null;
        }
        String v02 = aVar.v0();
        synchronized (this.f305a) {
            Iterator it = this.f305a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    try {
                        b10 = b8.a.b(v02, new ParsePosition(0));
                        break;
                    } catch (ParseException e10) {
                        throw new s("Failed parsing '" + v02 + "' as Date; at path " + aVar.Z(), e10);
                    }
                }
                try {
                    b10 = ((DateFormat) it.next()).parse(v02);
                    break;
                } catch (ParseException unused) {
                }
            }
        }
        return b10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.text.DateFormat>, java.util.ArrayList] */
    @Override // x7.w
    public final void b(e8.c cVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            cVar.Z();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f305a.get(0);
        synchronized (this.f305a) {
            format = dateFormat.format(date2);
        }
        cVar.r0(format);
    }
}
