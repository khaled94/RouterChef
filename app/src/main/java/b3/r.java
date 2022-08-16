package b3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import b3.b0;
import java.util.List;
import q2.b;
import w7.f;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements b0.a, f.a {

    /* renamed from: s */
    public static final /* synthetic */ r f2537s = new r();

    /* renamed from: t */
    public static final /* synthetic */ r f2538t = new r();

    @Override // b3.b0.a
    public final Object a(Object obj) {
        b bVar = b0.f2495x;
        return (List) b0.d0(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), q.f2536s);
    }

    @Override // w7.f.a
    public final String b(Object obj) {
        Context context = (Context) obj;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }
}
