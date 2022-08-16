package m4;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class n30 implements DialogInterface.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ String f11415s;

    /* renamed from: t */
    public final /* synthetic */ String f11416t;

    /* renamed from: u */
    public final /* synthetic */ p30 f11417u;

    public n30(p30 p30Var, String str, String str2) {
        this.f11417u = p30Var;
        this.f11415s = str;
        this.f11416t = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        DownloadManager downloadManager = (DownloadManager) this.f11417u.f12401u.getSystemService("download");
        try {
            String str = this.f11415s;
            String str2 = this.f11416t;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            s1 s1Var = s.B.f5789c;
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f11417u.c("Could not store picture.");
        }
    }
}
