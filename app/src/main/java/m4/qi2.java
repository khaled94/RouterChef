package m4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.activity.k;
import androidx.fragment.app.b1;
import i0.b;
import java.util.ArrayList;
import java.util.Objects;
import l0.d;
import z3.p;

/* loaded from: classes.dex */
public final class qi2 {

    /* renamed from: a */
    public final String f12883a;

    /* renamed from: b */
    public final String f12884b;

    /* renamed from: c */
    public final String f12885c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f12886d;

    /* renamed from: e */
    public final boolean f12887e;

    /* renamed from: f */
    public final boolean f12888f;

    /* renamed from: g */
    public final boolean f12889g;

    public qi2(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        Objects.requireNonNull(str);
        this.f12883a = str;
        this.f12884b = str2;
        this.f12885c = str3;
        this.f12886d = codecCapabilities;
        this.f12887e = z10;
        this.f12888f = z11;
        this.f12889g = rp.f(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ("Nexus 10".equals(r0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r7) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m4.qi2 b(java.lang.String r7, java.lang.String r8, java.lang.String r9, android.media.MediaCodecInfo.CodecCapabilities r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            m4.qi2 r11 = new m4.qi2
            r12 = 1
            r13 = 0
            if (r10 == 0) goto L3d
            int r0 = m4.ls1.f10971a
            r1 = 19
            if (r0 < r1) goto L3d
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L3d
            r1 = 22
            if (r0 > r1) goto L3b
            java.lang.String r0 = m4.ls1.f10974d
            java.lang.String r1 = "ODROID-XU3"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2a
            java.lang.String r1 = "Nexus 10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3b
        L2a:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L3b
            goto L3d
        L3b:
            r5 = r12
            goto L3e
        L3d:
            r5 = r13
        L3e:
            r0 = 21
            if (r10 == 0) goto L4c
            int r1 = m4.ls1.f10971a
            if (r1 < r0) goto L4c
            java.lang.String r1 = "tunneled-playback"
            boolean r1 = r10.isFeatureSupported(r1)
        L4c:
            if (r14 != 0) goto L5f
            if (r10 == 0) goto L5d
            int r14 = m4.ls1.f10971a
            if (r14 < r0) goto L5d
            java.lang.String r14 = "secure-playback"
            boolean r14 = r10.isFeatureSupported(r14)
            if (r14 == 0) goto L5d
            goto L5f
        L5d:
            r6 = r13
            goto L60
        L5f:
            r6 = r12
        L60:
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.qi2.b(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):m4.qi2");
    }

    public static Point g(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = ls1.f10971a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d5) {
        Point g10 = g(videoCapabilities, i10, i11);
        int i12 = g10.x;
        int i13 = g10.y;
        return (d5 == -1.0d || d5 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d5));
    }

    public final h12 a(t tVar, t tVar2) {
        int i10 = true != ls1.f(tVar.f13871k, tVar2.f13871k) ? 8 : 0;
        if (this.f12889g) {
            if (tVar.f13878s != tVar2.f13878s) {
                i10 |= 1024;
            }
            if (!this.f12887e && (tVar.p != tVar2.p || tVar.f13876q != tVar2.f13876q)) {
                i10 |= 512;
            }
            if (!ls1.f(tVar.f13882w, tVar2.f13882w)) {
                i10 |= 2048;
            }
            String str = this.f12883a;
            if (ls1.f10974d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !tVar.a(tVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new h12(this.f12883a, tVar, tVar2, true != tVar.a(tVar2) ? 2 : 3, 0);
            }
        } else {
            if (tVar.f13883x != tVar2.f13883x) {
                i10 |= 4096;
            }
            if (tVar.y != tVar2.y) {
                i10 |= 8192;
            }
            if (tVar.f13884z != tVar2.f13884z) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f12884b)) {
                Pair<Integer, Integer> b10 = bj2.b(tVar);
                Pair<Integer, Integer> b11 = bj2.b(tVar2);
                if (b10 != null && b11 != null) {
                    int intValue = ((Integer) b10.first).intValue();
                    int intValue2 = ((Integer) b11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new h12(this.f12883a, tVar, tVar2, 3, 0);
                    }
                }
            }
            if (!tVar.a(tVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f12884b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new h12(this.f12883a, tVar, tVar2, 1, 0);
            }
        }
        return new h12(this.f12883a, tVar, tVar2, 0, i10);
    }

    public final boolean c(t tVar) {
        String str;
        String str2;
        int i10;
        String str3;
        String str4;
        StringBuilder sb;
        String str5;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        so b10;
        String str6 = tVar.f13868h;
        if (str6 != null) {
            ArrayList<bo> arrayList = rp.f13412a;
            String b11 = x90.b(str6.trim());
            if (b11.startsWith("avc1") || b11.startsWith("avc3")) {
                str3 = "video/avc";
            } else if (b11.startsWith("hev1") || b11.startsWith("hvc1")) {
                str3 = "video/hevc";
            } else if (b11.startsWith("dvav") || b11.startsWith("dva1") || b11.startsWith("dvhe") || b11.startsWith("dvh1")) {
                str3 = "video/dolby-vision";
            } else if (b11.startsWith("av01")) {
                str3 = "video/av01";
            } else if (b11.startsWith("vp9") || b11.startsWith("vp09")) {
                str3 = "video/x-vnd.on2.vp9";
            } else if (b11.startsWith("vp8") || b11.startsWith("vp08")) {
                str3 = "video/x-vnd.on2.vp8";
            } else if (b11.startsWith("mp4a")) {
                str3 = (!b11.startsWith("mp4a.") || (b10 = rp.b(b11)) == null) ? null : rp.c(b10.f13794a);
                if (str3 == null) {
                    str3 = "audio/mp4a-latm";
                }
            } else if (b11.startsWith("mha1")) {
                str3 = "audio/mha1";
            } else if (b11.startsWith("mhm1")) {
                str3 = "audio/mhm1";
            } else if (b11.startsWith("ac-3") || b11.startsWith("dac3")) {
                str3 = "audio/ac3";
            } else if (b11.startsWith("ec-3") || b11.startsWith("dec3")) {
                str3 = "audio/eac3";
            } else if (b11.startsWith("ec+3")) {
                str3 = "audio/eac3-joc";
            } else if (b11.startsWith("ac-4") || b11.startsWith("dac4")) {
                str3 = "audio/ac4";
            } else if (b11.startsWith("dtsc")) {
                str3 = "audio/vnd.dts";
            } else if (b11.startsWith("dtse")) {
                str3 = "audio/vnd.dts.hd;profile=lbr";
            } else if (b11.startsWith("dtsh") || b11.startsWith("dtsl")) {
                str3 = "audio/vnd.dts.hd";
            } else if (b11.startsWith("dtsx")) {
                str3 = "audio/vnd.dts.uhd;profile=p2";
            } else if (b11.startsWith("opus")) {
                str3 = "audio/opus";
            } else if (b11.startsWith("vorbis")) {
                str3 = "audio/vorbis";
            } else if (b11.startsWith("flac")) {
                str3 = "audio/flac";
            } else if (b11.startsWith("stpp")) {
                str3 = "application/ttml+xml";
            } else if (b11.startsWith("wvtt")) {
                str3 = "text/vtt";
            } else if (b11.contains("cea708")) {
                str3 = "application/cea-708";
            } else if (b11.contains("eia608") || b11.contains("cea608")) {
                str3 = "application/cea-608";
            } else {
                int size = rp.f13412a.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Objects.requireNonNull(rp.f13412a.get(i11));
                    if (b11.startsWith(null)) {
                        break;
                    }
                }
                str3 = null;
            }
            if (str3 != null) {
                if (!this.f12884b.equals(str3)) {
                    str4 = tVar.f13868h;
                    sb = new StringBuilder(str3.length() + String.valueOf(str4).length() + 13);
                    str5 = "codec.mime ";
                } else {
                    Pair<Integer, Integer> b12 = bj2.b(tVar);
                    if (b12 != null) {
                        int intValue = ((Integer) b12.first).intValue();
                        int intValue2 = ((Integer) b12.second).intValue();
                        if (!this.f12889g) {
                            if (intValue == 42) {
                                intValue = 42;
                            }
                        }
                        MediaCodecInfo.CodecProfileLevel[] f10 = f();
                        if (ls1.f10971a <= 23 && "video/x-vnd.on2.vp9".equals(this.f12884b) && f10.length == 0) {
                            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12886d;
                            int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                            int i12 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel.profile = 1;
                            codecProfileLevel.level = i12;
                            f10 = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                        }
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : f10) {
                            if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                            }
                        }
                        str4 = tVar.f13868h;
                        sb = new StringBuilder(str3.length() + String.valueOf(str4).length() + 22);
                        str5 = "codec.profileLevel, ";
                    }
                }
                h(b.a(sb, str5, str4, ", ", str3));
                return false;
            }
        }
        if (this.f12889g) {
            int i13 = tVar.p;
            if (i13 <= 0 || (i10 = tVar.f13876q) <= 0) {
                return true;
            }
            if (ls1.f10971a >= 21) {
                return e(i13, i10, tVar.f13877r);
            }
            boolean z10 = i13 * i10 <= bj2.a();
            if (!z10) {
                h(d.a(40, "legacyFrameSize, ", tVar.p, "x", tVar.f13876q));
            }
            return z10;
        }
        int i14 = ls1.f10971a;
        if (i14 >= 21) {
            int i15 = tVar.y;
            if (i15 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f12886d;
                if (codecCapabilities2 == null) {
                    str2 = "sampleRate.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        str2 = "sampleRate.aCaps";
                    } else if (!audioCapabilities.isSampleRateSupported(i15)) {
                        str2 = k.a(31, "sampleRate.support, ", i15);
                    }
                }
                h(str2);
                return false;
            }
            int i16 = tVar.f13883x;
            if (i16 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f12886d;
                if (codecCapabilities3 == null) {
                    str = "channelCount.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        str = "channelCount.aCaps";
                    } else {
                        String str7 = this.f12883a;
                        String str8 = this.f12884b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i14 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str8) && !"audio/3gpp".equals(str8) && !"audio/amr-wb".equals(str8) && !"audio/mp4a-latm".equals(str8) && !"audio/vorbis".equals(str8) && !"audio/opus".equals(str8) && !"audio/raw".equals(str8) && !"audio/flac".equals(str8) && !"audio/g711-alaw".equals(str8) && !"audio/g711-mlaw".equals(str8) && !"audio/gsm".equals(str8))) {
                            int i17 = "audio/ac3".equals(str8) ? 6 : "audio/eac3".equals(str8) ? 16 : 30;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 59);
                            sb2.append("AssumedMaxChannelAdjustment: ");
                            sb2.append(str7);
                            sb2.append(", [");
                            sb2.append(maxInputChannelCount);
                            sb2.append(" to ");
                            sb2.append(i17);
                            sb2.append("]");
                            Log.w("MediaCodecInfo", sb2.toString());
                            maxInputChannelCount = i17;
                        }
                        if (maxInputChannelCount >= i16) {
                            return true;
                        }
                        str = k.a(33, "channelCount.support, ", i16);
                    }
                }
                h(str);
                return false;
            }
        }
        return true;
    }

    public final boolean d(t tVar) {
        if (this.f12889g) {
            return this.f12887e;
        }
        Pair<Integer, Integer> b10 = bj2.b(tVar);
        return b10 != null && ((Integer) b10.first).intValue() == 42;
    }

    public final boolean e(int i10, int i11, double d5) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12886d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (i(videoCapabilities, i10, i11, d5)) {
                return true;
            } else {
                if (i10 < i11 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f12883a) || !"mcv5a".equals(ls1.f10972b)) && i(videoCapabilities, i11, i10, d5))) {
                    StringBuilder a10 = p.a(69, "sizeAndRate.rotated, ", i10, "x", i11);
                    a10.append("x");
                    a10.append(d5);
                    String sb = a10.toString();
                    String str2 = this.f12883a;
                    String str3 = this.f12884b;
                    String str4 = ls1.f10975e;
                    int length = String.valueOf(str2).length();
                    StringBuilder sb2 = new StringBuilder(str3.length() + sb.length() + 25 + length + String.valueOf(str4).length());
                    b1.b(sb2, "AssumedSupport [", sb, "] [", str2);
                    b1.b(sb2, ", ", str3, "] [", str4);
                    sb2.append("]");
                    Log.d("MediaCodecInfo", sb2.toString());
                    return true;
                }
                StringBuilder a11 = p.a(69, "sizeAndRate.support, ", i10, "x", i11);
                a11.append("x");
                a11.append(d5);
                str = a11.toString();
            }
        }
        h(str);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12886d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final void h(String str) {
        String str2 = this.f12883a;
        String str3 = this.f12884b;
        String str4 = ls1.f10975e;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str3.length() + str.length() + 20 + length + String.valueOf(str4).length());
        b1.b(sb, "NoSupport [", str, "] [", str2);
        b1.b(sb, ", ", str3, "] [", str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    public final String toString() {
        return this.f12883a;
    }
}
