package p9;

import android.content.Context;
import g1.x;
import g1.z;
import lineDetailsDb.LineDetailsDb;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public a f17000a;

    public c(Context context) {
        if (LineDetailsDb.f5829l == null) {
            z.a a10 = x.a(context.getApplicationContext(), LineDetailsDb.class, "line_details.db");
            a10.f4880h = true;
            a10.c();
            LineDetailsDb.f5829l = (LineDetailsDb) a10.b();
        }
        this.f17000a = LineDetailsDb.f5829l.q();
    }
}
