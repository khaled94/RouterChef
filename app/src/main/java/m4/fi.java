package m4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;
import t3.t;

@ParametersAreNonnullByDefault
@TargetApi(14)
/* loaded from: classes.dex */
public final class fi extends Thread {
    public final int B;
    public final int C;
    public final int D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final boolean H;

    /* renamed from: v */
    public final yh f8561v;

    /* renamed from: s */
    public boolean f8558s = false;

    /* renamed from: t */
    public boolean f8559t = false;

    /* renamed from: u */
    public final Object f8560u = new Object();

    /* renamed from: x */
    public final int f8563x = ft.f8636d.e().intValue();
    public final int y = ft.f8633a.e().intValue();

    /* renamed from: z */
    public final int f8564z = ft.f8637e.e().intValue();
    public final int A = ft.f8635c.e().intValue();

    /* renamed from: w */
    public final int f8562w = ft.f8638f.e().intValue();

    public fi() {
        yh yhVar = new yh();
        this.f8561v = yhVar;
        yr<Integer> yrVar = es.K;
        jo joVar = jo.f10145d;
        this.B = ((Integer) joVar.f10148c.a(yrVar)).intValue();
        this.C = ((Integer) joVar.f10148c.a(es.L)).intValue();
        this.D = ((Integer) joVar.f10148c.a(es.M)).intValue();
        this.E = (String) joVar.f10148c.a(es.O);
        this.F = ((Boolean) joVar.f10148c.a(es.P)).booleanValue();
        this.G = ((Boolean) joVar.f10148c.a(es.Q)).booleanValue();
        this.H = ((Boolean) joVar.f10148c.a(es.R)).booleanValue();
        setName("ContentFetchTask");
    }

    public final ei a(View view, xh xhVar) {
        if (view == null) {
            return new ei(0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new ei(0, 0);
            }
            xhVar.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new ei(1, 0);
        } else if ((view instanceof WebView) && !(view instanceof vd0)) {
            WebView webView = (WebView) view;
            synchronized (xhVar.f15350g) {
                xhVar.f15356m++;
            }
            webView.post(new di(this, xhVar, webView, globalVisibleRect));
            return new ei(0, 1);
        } else if (!(view instanceof ViewGroup)) {
            return new ei(0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                ei a10 = a(viewGroup.getChildAt(i12), xhVar);
                i10 += a10.f7969a;
                i11 += a10.f7970b;
            }
            return new ei(i10, i11);
        }
    }

    public final void b() {
        synchronized (this.f8560u) {
            this.f8559t = true;
            g1.e("ContentFetchThread: paused, mPause = true");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        View view;
        Application application;
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            bi biVar = s.B.f5792f;
            synchronized (biVar.f6539a) {
                zh zhVar = biVar.f6540b;
                view = null;
                application = zhVar != null ? zhVar.f16229t : null;
            }
            if (application != null) {
                ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                KeyguardManager keyguardManager = (KeyguardManager) application.getSystemService("keyguard");
                if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (Process.myPid() == next.pid) {
                            if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) application.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                try {
                                    Activity a10 = s.B.f5792f.a();
                                    if (a10 == null) {
                                        str = "ContentFetchThread: no activity. Sleeping.";
                                    } else {
                                        try {
                                            if (a10.getWindow() != null && a10.getWindow().getDecorView() != null) {
                                                view = a10.getWindow().getDecorView().findViewById(16908290);
                                            }
                                        } catch (Exception e10) {
                                            s.B.f5793g.g(e10, "ContentFetchTask.extractContent");
                                            g1.e("Failed getting root view of activity. Content not extracted.");
                                        }
                                        if (view != null) {
                                            view.post(new t(this, view));
                                        }
                                    }
                                } catch (InterruptedException e11) {
                                    g1.h("Error in ContentFetchTask", e11);
                                } catch (Exception e12) {
                                    g1.h("Error in ContentFetchTask", e12);
                                    s.B.f5793g.g(e12, "ContentFetchTask.run");
                                }
                            }
                        }
                    }
                }
            }
            str = "ContentFetchTask: sleeping";
            g1.e(str);
            b();
            Thread.sleep(this.f8562w * 1000);
            synchronized (this.f8560u) {
                while (this.f8559t) {
                    try {
                        g1.e("ContentFetchTask: waiting");
                        this.f8560u.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
