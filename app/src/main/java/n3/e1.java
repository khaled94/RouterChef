package n3;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: b */
    public static List<MediaCodecInfo> f16460b;

    /* renamed from: a */
    public static final Map<String, List<Map<String, Object>>> f16459a = new HashMap();

    /* renamed from: c */
    public static final Object f16461c = new Object();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>>] */
    @TargetApi(16)
    public static List<Map<String, Object>> a(String str) {
        ArrayList arrayList;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Object obj = f16461c;
        synchronized (obj) {
            ?? r12 = f16459a;
            if (r12.containsKey(str)) {
                return (List) r12.get(str);
            }
            try {
                synchronized (obj) {
                    if (f16460b == null) {
                        f16460b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f16460b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap.put("profileLevels", arrayList2);
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", b(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", b(videoCapabilities.getSupportedHeights()));
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            arrayList.add(hashMap);
                        }
                    }
                    f16459a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e10) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e10.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f16459a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    public static Integer[] b(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
