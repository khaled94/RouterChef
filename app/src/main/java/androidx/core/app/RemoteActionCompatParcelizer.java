package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import r1.a;
import r1.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1260a;
        if (aVar.i(1)) {
            cVar = aVar.o();
        }
        remoteActionCompat.f1260a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1261b;
        if (aVar.i(2)) {
            charSequence = aVar.h();
        }
        remoteActionCompat.f1261b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1262c;
        if (aVar.i(3)) {
            charSequence2 = aVar.h();
        }
        remoteActionCompat.f1262c = charSequence2;
        remoteActionCompat.f1263d = (PendingIntent) aVar.m(remoteActionCompat.f1263d, 4);
        boolean z10 = remoteActionCompat.f1264e;
        if (aVar.i(5)) {
            z10 = aVar.f();
        }
        remoteActionCompat.f1264e = z10;
        boolean z11 = remoteActionCompat.f1265f;
        if (aVar.i(6)) {
            z11 = aVar.f();
        }
        remoteActionCompat.f1265f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f1260a;
        aVar.p(1);
        aVar.y(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1261b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1262c;
        aVar.p(3);
        aVar.s(charSequence2);
        aVar.w(remoteActionCompat.f1263d, 4);
        boolean z10 = remoteActionCompat.f1264e;
        aVar.p(5);
        aVar.q(z10);
        boolean z11 = remoteActionCompat.f1265f;
        aVar.p(6);
        aVar.q(z11);
    }
}
