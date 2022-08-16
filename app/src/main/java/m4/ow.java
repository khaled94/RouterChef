package m4;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class ow implements lx {

    /* renamed from: s */
    public final /* synthetic */ int f12297s;

    public /* synthetic */ ow(int i10) {
        this.f12297s = i10;
    }

    @Override // m4.lx
    public final void a(Object obj, Map map) {
        String str;
        String str2;
        qs qsVar;
        String str3;
        switch (this.f12297s) {
            case 0:
                vd0 vd0Var = (vd0) obj;
                String str4 = (String) map.get("action");
                if ("tick".equals(str4)) {
                    String str5 = (String) map.get("label");
                    String str6 = (String) map.get("start_label");
                    String str7 = (String) map.get("timestamp");
                    if (TextUtils.isEmpty(str5)) {
                        str = "No label given for CSI tick.";
                    } else if (!TextUtils.isEmpty(str7)) {
                        try {
                            long parseLong = Long.parseLong(str7);
                            s sVar = s.B;
                            Objects.requireNonNull(sVar.f5796j);
                            long currentTimeMillis = System.currentTimeMillis();
                            Objects.requireNonNull(sVar.f5796j);
                            long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
                            if (true == TextUtils.isEmpty(str6)) {
                                str6 = "native:view_load";
                            }
                            ps k10 = vd0Var.k();
                            qs qsVar2 = (qs) k10.f12617t;
                            os osVar = (os) ((Map) k10.f12616s).get(str6);
                            String[] strArr = {str5};
                            if (osVar != null) {
                                qsVar2.c(osVar, elapsedRealtime, strArr);
                            }
                            ((Map) k10.f12616s).put(str5, new os(elapsedRealtime, null, null));
                            return;
                        } catch (NumberFormatException e10) {
                            g1.k("Malformed timestamp for CSI tick.", e10);
                            return;
                        }
                    } else {
                        str = "No timestamp given for CSI tick.";
                    }
                } else if ("experiment".equals(str4)) {
                    str2 = (String) map.get("value");
                    if (!TextUtils.isEmpty(str2)) {
                        qsVar = (qs) vd0Var.k().f12617t;
                        str3 = "e";
                        qsVar.b(str3, str2);
                        return;
                    }
                    str = "No value given for CSI experiment.";
                } else if (!"extra".equals(str4)) {
                    return;
                } else {
                    str3 = (String) map.get("name");
                    str2 = (String) map.get("value");
                    if (TextUtils.isEmpty(str2)) {
                        str = "No value given for CSI extra.";
                    } else if (!TextUtils.isEmpty(str3)) {
                        qsVar = (qs) vd0Var.k().f12617t;
                        qsVar.b(str3, str2);
                        return;
                    } else {
                        str = "No name given for CSI extra.";
                    }
                }
                g1.j(str);
                return;
            default:
                fb0 fb0Var = (fb0) obj;
                me0 p = fb0Var.p();
                if (p == null) {
                    try {
                        me0 me0Var = new me0(fb0Var, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                        fb0Var.q(me0Var);
                        p = me0Var;
                    } catch (NullPointerException | NumberFormatException e11) {
                        g1.h("Unable to parse videoMeta message.", e11);
                        s.B.f5793g.g(e11, "VideoMetaGmsgHandler.onGmsg");
                        return;
                    }
                }
                float parseFloat = Float.parseFloat((String) map.get("duration"));
                boolean equals = "1".equals(map.get("muted"));
                float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
                int parseInt = Integer.parseInt((String) map.get("playbackState"));
                if (parseInt < 0 || parseInt > 3) {
                    parseInt = 0;
                }
                String str8 = (String) map.get("aspectRatio");
                float parseFloat3 = TextUtils.isEmpty(str8) ? 0.0f : Float.parseFloat(str8);
                if (g1.m(3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 140);
                    sb.append("Video Meta GMSG: currentTime : ");
                    sb.append(parseFloat2);
                    sb.append(" , duration : ");
                    sb.append(parseFloat);
                    sb.append(" , isMuted : ");
                    sb.append(equals);
                    sb.append(" , playbackState : ");
                    sb.append(parseInt);
                    sb.append(" , aspectRatio : ");
                    sb.append(str8);
                    g1.e(sb.toString());
                }
                p.O3(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
                return;
        }
    }
}
