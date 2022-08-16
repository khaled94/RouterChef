package m4;

import android.content.Context;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class kj2 implements gk2 {

    /* renamed from: a */
    public final SparseArray<gk2> f10457a;

    /* renamed from: b */
    public final int[] f10458b;

    public kj2(Context context, yo2 yo2Var) {
        vf2 vf2Var = new vf2(context);
        SparseArray<gk2> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (gk2) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(gk2.class).getConstructor(yp0.class).newInstance(vf2Var));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (gk2) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(gk2.class).getConstructor(yp0.class).newInstance(vf2Var));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (gk2) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(gk2.class).getConstructor(yp0.class).newInstance(vf2Var));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (gk2) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(gk2.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new sk2(vf2Var, yo2Var));
        this.f10457a = sparseArray;
        this.f10458b = new int[sparseArray.size()];
        for (int i10 = 0; i10 < this.f10457a.size(); i10++) {
            this.f10458b[i10] = this.f10457a.keyAt(i10);
        }
    }
}
