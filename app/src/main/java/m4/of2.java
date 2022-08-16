package m4;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class of2 {

    /* renamed from: a */
    public final Context f12145a;

    /* renamed from: b */
    public final Handler f12146b;

    /* renamed from: c */
    public final mf2 f12147c;

    /* renamed from: d */
    public final AudioManager f12148d;

    /* renamed from: e */
    public nf2 f12149e;

    /* renamed from: f */
    public int f12150f = 3;

    /* renamed from: g */
    public int f12151g;

    /* renamed from: h */
    public boolean f12152h;

    public of2(Context context, Handler handler, mf2 mf2Var) {
        Context applicationContext = context.getApplicationContext();
        this.f12145a = applicationContext;
        this.f12146b = handler;
        this.f12147c = mf2Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        r01.d(audioManager);
        this.f12148d = audioManager;
        this.f12151g = c(audioManager, 3);
        this.f12152h = e(audioManager, this.f12150f);
        nf2 nf2Var = new nf2(this);
        try {
            applicationContext.registerReceiver(nf2Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f12149e = nf2Var;
        } catch (RuntimeException e10) {
            x90.k("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int c(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i10);
            x90.k("StreamVolumeManager", sb.toString(), e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean e(AudioManager audioManager, int i10) {
        return ls1.f10971a >= 23 ? audioManager.isStreamMute(i10) : c(audioManager, i10) == 0;
    }

    public final int a() {
        if (ls1.f10971a >= 28) {
            return this.f12148d.getStreamMinVolume(this.f12150f);
        }
        return 0;
    }

    public final void b() {
        if (this.f12150f == 3) {
            return;
        }
        this.f12150f = 3;
        d();
        jf2 jf2Var = (jf2) this.f12147c;
        of2 of2Var = jf2Var.f9956s.f10759j;
        li2 li2Var = new li2(of2Var.a(), of2Var.f12148d.getStreamMaxVolume(of2Var.f12150f));
        if (li2Var.equals(jf2Var.f9956s.f10772x)) {
            return;
        }
        lf2 lf2Var = jf2Var.f9956s;
        lf2Var.f10772x = li2Var;
        Iterator<fy> it = lf2Var.f10756g.iterator();
        while (it.hasNext()) {
            it.next().s();
        }
    }

    public final void d() {
        int c10 = c(this.f12148d, this.f12150f);
        boolean e10 = e(this.f12148d, this.f12150f);
        if (this.f12151g == c10 && this.f12152h == e10) {
            return;
        }
        this.f12151g = c10;
        this.f12152h = e10;
        Iterator<fy> it = ((jf2) this.f12147c).f9956s.f10756g.iterator();
        while (it.hasNext()) {
            it.next().l();
        }
    }
}
