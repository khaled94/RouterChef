package m4;

import android.os.AsyncTask;
import t3.w;

/* loaded from: classes.dex */
public abstract class pr1 extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    public qr1 f12614a;

    /* renamed from: b */
    public final w f12615b;

    public pr1(w wVar) {
        this.f12615b = wVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        qr1 qr1Var = this.f12614a;
        if (qr1Var != null) {
            qr1Var.f12986d = null;
            qr1Var.b();
        }
    }
}
