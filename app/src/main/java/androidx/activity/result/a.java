package androidx.activity.result;

import android.os.RemoteException;
import androidx.recyclerview.widget.RecyclerView;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static RemoteException a(String str, Throwable th) {
        g1.h(str, th);
        return new RemoteException();
    }

    public static String b(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.A());
        return sb.toString();
    }

    public static StringBuilder c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}
