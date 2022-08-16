package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import androidx.fragment.app.a;
import e1.h;
import e1.i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l3.s;
import n3.g1;
import n3.s1;

@TargetApi(14)
/* loaded from: classes.dex */
public final class na0 extends pa0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final Map<Integer, String> K;
    public Uri A;
    public int B;
    public int C;
    public int D;
    public db0 E;
    public final boolean F;
    public int G;
    public oa0 H;

    /* renamed from: u */
    public final fb0 f11601u;

    /* renamed from: v */
    public final gb0 f11602v;

    /* renamed from: w */
    public final boolean f11603w;

    /* renamed from: z */
    public MediaPlayer f11605z;

    /* renamed from: x */
    public int f11604x = 0;
    public int y = 0;
    public boolean I = false;
    public Integer J = null;

    static {
        HashMap hashMap = new HashMap();
        K = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public na0(Context context, fb0 fb0Var, boolean z10, boolean z11, gb0 gb0Var) {
        super(context);
        setSurfaceTextureListener(this);
        this.f11601u = fb0Var;
        this.f11602v = gb0Var;
        this.F = z10;
        this.f11603w = z11;
        gb0Var.a(this);
    }

    public final void D() {
        SurfaceTexture surfaceTexture;
        g1.a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.A == null || surfaceTexture2 == null) {
            return;
        }
        F(false);
        try {
            h hVar = s.B.f5803r;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11605z = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f11605z.setOnCompletionListener(this);
            this.f11605z.setOnErrorListener(this);
            this.f11605z.setOnInfoListener(this);
            this.f11605z.setOnPreparedListener(this);
            this.f11605z.setOnVideoSizeChangedListener(this);
            this.D = 0;
            if (this.F) {
                db0 db0Var = new db0(getContext());
                this.E = db0Var;
                int width = getWidth();
                int height = getHeight();
                db0Var.E = width;
                db0Var.D = height;
                db0Var.G = surfaceTexture2;
                this.E.start();
                db0 db0Var2 = this.E;
                if (db0Var2.G == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        db0Var2.L.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = db0Var2.F;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.E.b();
                    this.E = null;
                }
            }
            this.f11605z.setDataSource(getContext(), this.A);
            i iVar = s.B.f5804s;
            this.f11605z.setSurface(new Surface(surfaceTexture2));
            this.f11605z.setAudioStreamType(3);
            this.f11605z.setScreenOnWhilePlaying(true);
            this.f11605z.prepareAsync();
            G(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e10) {
            g1.k("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.A)), e10);
            onError(this.f11605z, 1, 0);
        }
    }

    public final void E() {
        if (this.f11603w && H() && this.f11605z.getCurrentPosition() > 0 && this.y != 3) {
            g1.a("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer = this.f11605z;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                g1.j("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f11605z.start();
            int currentPosition = this.f11605z.getCurrentPosition();
            Objects.requireNonNull(s.B.f5796j);
            long currentTimeMillis = System.currentTimeMillis();
            while (H() && this.f11605z.getCurrentPosition() == currentPosition) {
                Objects.requireNonNull(s.B.f5796j);
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.f11605z.pause();
            j();
        }
    }

    public final void F(boolean z10) {
        g1.a("AdMediaPlayerView release");
        db0 db0Var = this.E;
        if (db0Var != null) {
            db0Var.b();
            this.E = null;
        }
        MediaPlayer mediaPlayer = this.f11605z;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f11605z.release();
            this.f11605z = null;
            G(0);
            if (!z10) {
                return;
            }
            this.y = 0;
        }
    }

    public final void G(int i10) {
        if (i10 == 3) {
            this.f11602v.c();
            jb0 jb0Var = this.f12456t;
            jb0Var.f9894d = true;
            jb0Var.b();
        } else if (this.f11604x == 3) {
            this.f11602v.f8810m = false;
            this.f12456t.a();
        }
        this.f11604x = i10;
    }

    public final boolean H() {
        int i10;
        return (this.f11605z == null || (i10 = this.f11604x) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    @Override // m4.pa0
    public final int h() {
        if (H()) {
            return this.f11605z.getCurrentPosition();
        }
        return 0;
    }

    @Override // m4.pa0
    public final int i() {
        if (Build.VERSION.SDK_INT < 26 || !H()) {
            return -1;
        }
        return this.f11605z.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // m4.pa0, m4.ib0
    public final void j() {
        jb0 jb0Var = this.f12456t;
        float f10 = 0.0f;
        float f11 = jb0Var.f9895e ? 0.0f : jb0Var.f9896f;
        if (jb0Var.f9893c) {
            f10 = f11;
        }
        MediaPlayer mediaPlayer = this.f11605z;
        if (mediaPlayer == null) {
            g1.j("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
        try {
            mediaPlayer.setVolume(f10, f10);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // m4.pa0
    public final int k() {
        if (H()) {
            return this.f11605z.getDuration();
        }
        return -1;
    }

    @Override // m4.pa0
    public final int l() {
        MediaPlayer mediaPlayer = this.f11605z;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // m4.pa0
    public final int m() {
        MediaPlayer mediaPlayer = this.f11605z;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // m4.pa0
    public final long n() {
        return 0L;
    }

    @Override // m4.pa0
    public final long o() {
        if (this.J != null) {
            return (p() * this.D) / 100;
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.D = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        g1.a("AdMediaPlayerView completion");
        G(5);
        this.y = 5;
        s1.f16555i.post(new cj(this, 2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        ?? r32 = K;
        String str = (String) r32.get(Integer.valueOf(i10));
        String str2 = (String) r32.get(Integer.valueOf(i11));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        g1.j(sb.toString());
        G(-1);
        this.y = -1;
        s1.f16555i.post(new ia0(this, str, str2));
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        ?? r32 = K;
        String str = (String) r32.get(Integer.valueOf(i10));
        String str2 = (String) r32.get(Integer.valueOf(i11));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        g1.a(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        if (r1 > r6) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.B
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.C
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.B
            if (r2 <= 0) goto L7a
            int r2 = r5.C
            if (r2 <= 0) goto L7a
            m4.db0 r2 = r5.E
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L42
            if (r1 != r2) goto L41
            int r0 = r5.B
            int r1 = r0 * r7
            int r2 = r5.C
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
            goto L52
        L41:
            r0 = r2
        L42:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.C
            int r0 = r0 * r6
            int r2 = r5.B
            int r0 = r0 / r2
            if (r1 != r3) goto L51
            if (r0 <= r7) goto L51
            goto L60
        L51:
            r1 = r0
        L52:
            r0 = r6
            goto L7a
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.B
            int r1 = r1 * r7
            int r2 = r5.C
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.B
            int r4 = r5.C
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L52
        L7a:
            r5.setMeasuredDimension(r0, r1)
            m4.db0 r6 = r5.E
            if (r6 == 0) goto L84
            r6.a(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.na0.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        g1.a("AdMediaPlayerView prepared");
        G(2);
        this.f11602v.b();
        s1.f16555i.post(new ha0(this, mediaPlayer, 0));
        this.B = mediaPlayer.getVideoWidth();
        this.C = mediaPlayer.getVideoHeight();
        int i10 = this.G;
        if (i10 != 0) {
            u(i10);
        }
        E();
        int i11 = this.B;
        int i12 = this.C;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i11);
        sb.append(" x ");
        sb.append(i12);
        g1.i(sb.toString());
        if (this.y == 3) {
            t();
        }
        j();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        g1.a("AdMediaPlayerView surface created");
        D();
        s1.f16555i.post(new gr(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        g1.a("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f11605z;
        if (mediaPlayer != null && this.G == 0) {
            this.G = mediaPlayer.getCurrentPosition();
        }
        db0 db0Var = this.E;
        if (db0Var != null) {
            db0Var.b();
        }
        s1.f16555i.post(new ka0(this, 0));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        g1.a("AdMediaPlayerView surface changed");
        int i12 = this.y;
        boolean z10 = this.B == i10 && this.C == i11;
        if (this.f11605z != null && i12 == 3 && z10) {
            int i13 = this.G;
            if (i13 != 0) {
                u(i13);
            }
            t();
        }
        db0 db0Var = this.E;
        if (db0Var != null) {
            db0Var.a(i10, i11);
        }
        s1.f16555i.post(new ja0(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f11602v.e(this);
        this.f12455s.a(surfaceTexture, this.H);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i10);
        sb.append(" x ");
        sb.append(i11);
        g1.a(sb.toString());
        this.B = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.C = videoHeight;
        if (this.B == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i10);
        g1.a(sb.toString());
        s1.f16555i.post(new Runnable() { // from class: m4.ga0
            @Override // java.lang.Runnable
            public final void run() {
                na0 na0Var = na0.this;
                int i11 = i10;
                oa0 oa0Var = na0Var.H;
                if (oa0Var != null) {
                    ((ta0) oa0Var).onWindowVisibilityChanged(i11);
                }
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // m4.pa0
    public final long p() {
        if (this.J != null) {
            return (H() ? this.f11605z.getDuration() : -1) * this.J.intValue();
        }
        return -1L;
    }

    @Override // m4.pa0
    public final String r() {
        String str = true != this.F ? "" : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // m4.pa0
    public final void s() {
        g1.a("AdMediaPlayerView pause");
        if (H() && this.f11605z.isPlaying()) {
            this.f11605z.pause();
            G(4);
            s1.f16555i.post(new ma0(this, 0));
        }
        this.y = 4;
    }

    @Override // m4.pa0
    public final void t() {
        g1.a("AdMediaPlayerView play");
        if (H()) {
            this.f11605z.start();
            G(3);
            this.f12455s.f16067c = true;
            s1.f16555i.post(new la0(this, 0));
        }
        this.y = 3;
    }

    @Override // android.view.View
    public final String toString() {
        String name = na0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return a.b(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // m4.pa0
    public final void u(int i10) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i10);
        g1.a(sb.toString());
        if (!H()) {
            this.G = i10;
            return;
        }
        this.f11605z.seekTo(i10);
        this.G = 0;
    }

    @Override // m4.pa0
    public final void v(oa0 oa0Var) {
        this.H = oa0Var;
    }

    @Override // m4.pa0
    public final void w(String str) {
        Uri parse = Uri.parse(str);
        kj s10 = kj.s(parse);
        if (s10 == null || s10.f10442s != null) {
            if (s10 != null) {
                parse = Uri.parse(s10.f10442s);
            }
            this.A = parse;
            this.G = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // m4.pa0
    public final void x() {
        g1.a("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f11605z;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f11605z.release();
            this.f11605z = null;
            G(0);
            this.y = 0;
        }
        this.f11602v.d();
    }

    @Override // m4.pa0
    public final void y(float f10, float f11) {
        db0 db0Var = this.E;
        if (db0Var != null) {
            db0Var.c(f10, f11);
        }
    }
}
