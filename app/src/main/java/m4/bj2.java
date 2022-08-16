package m4;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class bj2 {

    /* renamed from: a */
    public static final Pattern f6548a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap<vi2, List<qi2>> f6549b = new HashMap<>();

    /* renamed from: c */
    public static int f6550c = -1;

    public static int a() {
        int i10;
        if (f6550c == -1) {
            int i11 = 0;
            List<qi2> d5 = d("video/avc", false, false);
            qi2 qi2Var = d5.isEmpty() ? null : d5.get(0);
            if (qi2Var != null) {
                MediaCodecInfo.CodecProfileLevel[] f10 = qi2Var.f();
                int length = f10.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = f10[i11].level;
                    if (i13 == 1 || i13 == 2) {
                        i10 = 25344;
                    } else {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                continue;
                            case 64:
                                i10 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i10 = 414720;
                                continue;
                            case 512:
                                i10 = 921600;
                                continue;
                            case 1024:
                                i10 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                continue;
                            case 8192:
                                i10 = 2228224;
                                continue;
                            case 16384:
                                i10 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                continue;
                            default:
                                i10 = -1;
                                continue;
                        }
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                i11 = Math.max(i12, ls1.f10971a >= 21 ? 345600 : 172800);
            }
            f6550c = i11;
        }
        return f6550c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x04fc, code lost:
        if (r1.equals("H150") != false) goto L345;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02e0 A[Catch: NumberFormatException -> 0x02ef, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x02ef, blocks: (B:154:0x028b, B:156:0x029d, B:167:0x02b9, B:182:0x02e0), top: B:521:0x028b }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> b(m4.t r17) {
        /*
            Method dump skipped, instructions count: 2458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.bj2.b(m4.t):android.util.Pair");
    }

    public static qi2 c() {
        List<qi2> d5 = d("audio/raw", false, false);
        if (d5.isEmpty()) {
            return null;
        }
        return d5.get(0);
    }

    public static synchronized List<qi2> d(String str, boolean z10, boolean z11) {
        synchronized (bj2.class) {
            vi2 vi2Var = new vi2(str, z10, z11);
            HashMap<vi2, List<qi2>> hashMap = f6549b;
            List<qi2> list = hashMap.get(vi2Var);
            if (list != null) {
                return list;
            }
            int i10 = ls1.f10971a;
            ArrayList<qi2> e10 = e(vi2Var, i10 >= 21 ? new zi2(z10, z11) : new yi2());
            if (z10 && e10.isEmpty() && i10 >= 21 && i10 <= 23) {
                e10 = e(vi2Var, new yi2());
                if (!e10.isEmpty()) {
                    String str2 = e10.get(0).f12883a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (i10 < 26 && ls1.f10972b.equals("R9") && e10.size() == 1 && e10.get(0).f12883a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    e10.add(qi2.b("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
                }
                f(e10, is.f9739t);
            }
            if (i10 < 21 && e10.size() > 1) {
                String str3 = e10.get(0).f12883a;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    f(e10, js.f10181w);
                }
            }
            if (i10 < 32 && e10.size() > 1 && "OMX.qti.audio.decoder.flac".equals(e10.get(0).f12883a)) {
                e10.add(e10.remove(0));
            }
            List<qi2> unmodifiableList = Collections.unmodifiableList(e10);
            hashMap.put(vi2Var, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0199, code lost:
        if ("SCV31".equals(r9) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d7, code lost:
        if (r7.startsWith("t0") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r10.startsWith("HM") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010d, code lost:
        if ("SO-02E".equals(r11) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0139, code lost:
        if ("C1605".equals(r10) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0293 A[Catch: Exception -> 0x031b, TryCatch #0 {Exception -> 0x031b, blocks: (B:157:0x0261, B:163:0x0278, B:169:0x028d, B:171:0x0293, B:172:0x0298, B:176:0x02a3, B:178:0x02ab, B:179:0x02b0, B:181:0x02c0, B:183:0x02c8, B:188:0x02d7, B:191:0x02dd), top: B:216:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0298 A[Catch: Exception -> 0x031b, TryCatch #0 {Exception -> 0x031b, blocks: (B:157:0x0261, B:163:0x0278, B:169:0x028d, B:171:0x0293, B:172:0x0298, B:176:0x02a3, B:178:0x02ab, B:179:0x02b0, B:181:0x02c0, B:183:0x02c8, B:188:0x02d7, B:191:0x02dd), top: B:216:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ab A[Catch: Exception -> 0x031b, TryCatch #0 {Exception -> 0x031b, blocks: (B:157:0x0261, B:163:0x0278, B:169:0x028d, B:171:0x0293, B:172:0x0298, B:176:0x02a3, B:178:0x02ab, B:179:0x02b0, B:181:0x02c0, B:183:0x02c8, B:188:0x02d7, B:191:0x02dd), top: B:216:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b0 A[Catch: Exception -> 0x031b, TryCatch #0 {Exception -> 0x031b, blocks: (B:157:0x0261, B:163:0x0278, B:169:0x028d, B:171:0x0293, B:172:0x0298, B:176:0x02a3, B:178:0x02ab, B:179:0x02b0, B:181:0x02c0, B:183:0x02c8, B:188:0x02d7, B:191:0x02dd), top: B:216:0x0261 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<m4.qi2> e(m4.vi2 r22, m4.xi2 r23) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.bj2.e(m4.vi2, m4.xi2):java.util.ArrayList");
    }

    public static <T> void f(List<T> list, final aj2<T> aj2Var) {
        Collections.sort(list, new Comparator() { // from class: m4.ui2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                aj2 aj2Var2 = aj2.this;
                Pattern pattern = bj2.f6548a;
                return aj2Var2.h(obj2) - aj2Var2.h(obj);
            }
        });
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (ls1.f10971a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String b10 = x90.b(mediaCodecInfo.getName());
        if (b10.startsWith("arc.")) {
            return false;
        }
        return b10.startsWith("omx.google.") || b10.startsWith("omx.ffmpeg.") || (b10.startsWith("omx.sec.") && b10.contains(".sw.")) || b10.equals("omx.qcom.video.decoder.hevcswvdec") || b10.startsWith("c2.android.") || b10.startsWith("c2.google.") || (!b10.startsWith("omx.") && !b10.startsWith("c2."));
    }
}
