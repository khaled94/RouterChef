package m4;

import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.RemoteException;
import d4.m;
import java.util.HashMap;
import y4.e5;
import y4.j1;
import y4.k6;
import y4.w2;

/* loaded from: classes.dex */
public final class ha0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f9160s;

    /* renamed from: t */
    public final /* synthetic */ Object f9161t;

    /* renamed from: u */
    public final /* synthetic */ Object f9162u;

    public /* synthetic */ ha0(Object obj, Object obj2, int i10) {
        this.f9160s = i10;
        this.f9162u = obj;
        this.f9161t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer.TrackInfo[] trackInfo;
        String str;
        String str2;
        MediaFormat format;
        switch (this.f9160s) {
            case 0:
                na0 na0Var = (na0) this.f9162u;
                MediaPlayer mediaPlayer = (MediaPlayer) this.f9161t;
                if (((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() && na0Var.f11601u != null && mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
                    HashMap hashMap = new HashMap();
                    for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                        if (trackInfo2 != null) {
                            int trackType = trackInfo2.getTrackType();
                            if (trackType == 1) {
                                MediaFormat format2 = trackInfo2.getFormat();
                                if (format2 != null) {
                                    if (format2.containsKey("frame-rate")) {
                                        try {
                                            hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                        } catch (ClassCastException unused) {
                                            hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                        }
                                    }
                                    if (format2.containsKey("bitrate")) {
                                        Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                        na0Var.J = valueOf;
                                        hashMap.put("bitRate", String.valueOf(valueOf));
                                    }
                                    if (format2.containsKey("width") && format2.containsKey("height")) {
                                        int integer = format2.getInteger("width");
                                        int integer2 = format2.getInteger("height");
                                        StringBuilder sb = new StringBuilder(23);
                                        sb.append(integer);
                                        sb.append("x");
                                        sb.append(integer2);
                                        hashMap.put("resolution", sb.toString());
                                    }
                                    if (format2.containsKey("mime")) {
                                        hashMap.put("videoMime", format2.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                        str2 = format2.getString("codecs-string");
                                        str = "videoCodec";
                                        hashMap.put(str, str2);
                                    }
                                }
                            } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                if (format.containsKey("mime")) {
                                    hashMap.put("audioMime", format.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                    str2 = format.getString("codecs-string");
                                    str = "audioCodec";
                                    hashMap.put(str, str2);
                                }
                            }
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        na0Var.f11601u.a("onMetadataEvent", hashMap);
                    }
                }
                oa0 oa0Var = ((na0) this.f9162u).H;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).g();
                return;
            default:
                e5 e5Var = (e5) this.f9162u;
                j1 j1Var = e5Var.f20389v;
                if (j1Var == null) {
                    ((w2) e5Var.f20505s).C().f20710x.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    m.h((k6) this.f9161t);
                    j1Var.I1((k6) this.f9161t);
                    ((e5) this.f9162u).r();
                    return;
                } catch (RemoteException e10) {
                    ((w2) ((e5) this.f9162u).f20505s).C().f20710x.b("Failed to send consent settings to the service", e10);
                    return;
                }
        }
    }
}
