package d4;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import androidx.activity.result.a;
import com.raouf.routerchef.R;
import com.raouf.routerchef.resModels.LineInfo;
import e.o;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import s8.b;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public Serializable f3903a;

    /* renamed from: b */
    public Object f3904b;

    public p(Context context) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        this.f3904b = resources;
        this.f3903a = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ p(String str, o oVar) {
        this.f3903a = str;
        this.f3904b = oVar;
    }

    public final float a(String str) {
        try {
            float parseFloat = Float.parseFloat(str.toLowerCase().split("mbps")[0].split("/")[1]);
            if (parseFloat > 1.0f && parseFloat < 5.0f) {
                return 1.0f;
            }
            if (parseFloat >= 5.0f && parseFloat < 10.0f) {
                return 2.0f;
            }
            if (parseFloat >= 10.0f && parseFloat < 15.0f) {
                return 2.5f;
            }
            if (parseFloat >= 15.0f && parseFloat < 20.0f) {
                return 3.0f;
            }
            if (parseFloat >= 20.0f && parseFloat < 25.0f) {
                return 3.5f;
            }
            if (parseFloat >= 25.0f && parseFloat < 30.0f) {
                return 4.0f;
            }
            if (parseFloat >= 30.0f && parseFloat < 40.0f) {
                return 4.5f;
            }
            return parseFloat >= 40.0f ? 5.0f : 0.5f;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    public final boolean b() {
        try {
            return d().createNewFile();
        } catch (IOException e10) {
            StringBuilder c10 = a.c("Error creating marker: ");
            c10.append((String) this.f3903a);
            Log.e("FirebaseCrashlytics", c10.toString(), e10);
            return false;
        }
    }

    public final int c(float f10) {
        return f10 <= 1.0f ? R.drawable.ic_level_bad : (f10 <= 1.0f || f10 > 3.0f) ? R.drawable.ic_level_good : R.drawable.ic_level_normal;
    }

    public final File d() {
        return new File(((o) this.f3904b).a(), (String) this.f3903a);
    }

    public final float e(float f10) {
        if (f10 < 6.0f) {
            return 1.0f;
        }
        if (f10 >= 6.0f && f10 < 10.0f) {
            return 2.5f;
        }
        if (f10 >= 10.0f && f10 < 15.0f) {
            return 3.5f;
        }
        if (f10 >= 15.0f && f10 < 25.0f) {
            return 4.5f;
        }
        if (f10 >= 25.0f && f10 < 30.0f) {
            return 4.0f;
        }
        return (f10 < 30.0f || f10 >= 40.0f) ? 5.0f : 4.5f;
    }

    public final String f(String str) {
        int identifier = ((Resources) this.f3904b).getIdentifier(str, "string", (String) this.f3903a);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f3904b).getString(identifier);
    }

    public final boolean g(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("vdsl") || lowerCase.contains("993") || lowerCase.contains("9700");
    }

    public p(Context context, LineInfo lineInfo, String str) {
        float f10;
        float f11;
        float f12;
        float parseFloat;
        int i10;
        float f13;
        this.f3903a = new ArrayList();
        this.f3904b = lineInfo;
        if (lineInfo.modType != null) {
            ((ArrayList) this.f3903a).add(new b(3, context.getString(R.string.modulationType), lineInfo.modType, context.getString(R.string.modTypeDesc), str, g(lineInfo.modType) ? 5.0f : 2.5f, g(lineInfo.modType) ? R.drawable.ic_level_good : R.drawable.ic_level_normal));
        }
        if (lineInfo.lineRate != null) {
            String string = context.getString(R.string.lineSpeed);
            String str2 = lineInfo.lineRate;
            String string2 = context.getString(R.string.curSpeedDesc);
            float a10 = a(str2);
            ((ArrayList) this.f3903a).add(new b(4, string, str2, string2, str, a10, c(a10)));
        }
        if (lineInfo.maxRate != null) {
            String string3 = context.getString(R.string.maxSpeed);
            String str3 = lineInfo.maxRate;
            String string4 = context.getString(R.string.maxSpeedDesc);
            float a11 = a(str3);
            ((ArrayList) this.f3903a).add(new b(5, string3, str3, string4, str, a11, c(a11)));
        }
        if (lineInfo.noise != null) {
            String string5 = context.getString(R.string.noise);
            String str4 = lineInfo.noise;
            String string6 = context.getString(R.string.noiseDesc);
            try {
                String lowerCase = str4.toLowerCase();
                f13 = (e(Float.parseFloat(lowerCase.split(" ")[0].split("/")[1])) + e(Float.parseFloat(lowerCase.split(" ")[0].split("/")[0]))) / 2.0f;
            } catch (Exception unused) {
                f13 = 1.0f;
            }
            ((ArrayList) this.f3903a).add(new b(6, string5, str4, string6, str, f13, c(f13)));
        }
        if (lineInfo.chanType != null) {
            String string7 = context.getString(R.string.dataPath);
            String str5 = lineInfo.chanType;
            String string8 = context.getString(R.string.chanTypeDesc);
            float f14 = str5.toLowerCase().contains("fast") ? 5.0f : 3.0f;
            ((ArrayList) this.f3903a).add(new b(7, string7, str5, string8, str, f14, c(f14)));
        }
        float f15 = 0.0f;
        if (lineInfo.depth != null) {
            String string9 = context.getString(R.string.interleavedDepth);
            String str6 = lineInfo.depth;
            String string10 = context.getString(R.string.depthDesc);
            try {
                String lowerCase2 = str6.toLowerCase();
                parseFloat = Float.parseFloat(lowerCase2.contains("/") ? lowerCase2.split("/")[1] : lowerCase2);
            } catch (Exception unused2) {
            }
            if (parseFloat == 0.0f || parseFloat == 1.0f) {
                f12 = 5.0f;
            } else if (i10 > 0 && parseFloat <= 10.0f) {
                f12 = 4.5f;
            } else if (parseFloat > 10.0f && parseFloat <= 20.0f) {
                f12 = 4.0f;
            } else if (parseFloat > 20.0f && parseFloat <= 50.0f) {
                f12 = 3.5f;
            } else if (parseFloat <= 50.0f || parseFloat > 100.0f) {
                if (parseFloat > 100.0f && parseFloat <= 500.0f) {
                    f12 = 2.0f;
                }
                f12 = 1.0f;
            } else {
                f12 = 3.0f;
            }
            ((ArrayList) this.f3903a).add(new b(8, string9, str6, string10, str, f12, c(f12)));
        }
        if (lineInfo.delay != null) {
            String string11 = context.getString(R.string.interleaveDelay);
            String str7 = lineInfo.delay;
            String string12 = context.getString(R.string.delayDesc);
            try {
                String lowerCase3 = str7.toLowerCase();
                lowerCase3 = lowerCase3.contains("ms") ? lowerCase3.split(" ")[0] : lowerCase3;
                float parseFloat2 = Float.parseFloat(lowerCase3.contains("/") ? lowerCase3.split("/")[1] : lowerCase3);
                int i11 = (parseFloat2 > 0.0f ? 1 : (parseFloat2 == 0.0f ? 0 : -1));
                f11 = i11 == 0 ? 5.0f : (i11 <= 0 || parseFloat2 > 10.0f) ? (parseFloat2 <= 10.0f || parseFloat2 > 20.0f) ? (parseFloat2 <= 20.0f || parseFloat2 > 50.0f) ? 1.0f : 2.0f : 3.0f : 4.0f;
            } catch (Exception unused3) {
                f11 = 0.0f;
            }
            ((ArrayList) this.f3903a).add(new b(9, string11, str7, string12, str, f11, c(f11)));
        }
        if (lineInfo.crc != null) {
            String string13 = context.getString(R.string.crcErrors);
            String str8 = lineInfo.crc;
            String string14 = context.getString(R.string.crcDesc);
            try {
                String lowerCase4 = str8.toLowerCase();
                float parseFloat3 = Float.parseFloat(lowerCase4.contains("/") ? lowerCase4.split("/")[1] : lowerCase4);
                int i12 = (parseFloat3 > 0.0f ? 1 : (parseFloat3 == 0.0f ? 0 : -1));
                f10 = i12 == 0 ? 5.0f : (i12 <= 0 || parseFloat3 > 100.0f) ? (parseFloat3 <= 100.0f || parseFloat3 > 1000.0f) ? (parseFloat3 <= 1000.0f || parseFloat3 > 5000.0f) ? 1.0f : 2.0f : 3.0f : 4.0f;
            } catch (Exception unused4) {
                f10 = 0.0f;
            }
            ((ArrayList) this.f3903a).add(new b(10, string13, str8, string14, str, f10, c(f10)));
        }
        if (lineInfo.fec != null) {
            String string15 = context.getString(R.string.fecErrors);
            String str9 = lineInfo.fec;
            String string16 = context.getString(R.string.fecDesc);
            try {
                String lowerCase5 = str9.toLowerCase();
                float parseFloat4 = Float.parseFloat(lowerCase5.contains("/") ? lowerCase5.split("/")[1] : lowerCase5);
                int i13 = (parseFloat4 > 0.0f ? 1 : (parseFloat4 == 0.0f ? 0 : -1));
                f15 = i13 == 0 ? 5.0f : (i13 <= 0 || parseFloat4 > 1000.0f) ? (parseFloat4 <= 1000.0f || parseFloat4 > 10000.0f) ? (parseFloat4 <= 10000.0f || parseFloat4 > 100000.0f) ? 1.0f : 2.0f : 3.0f : 4.0f;
            } catch (Exception unused5) {
            }
            ((ArrayList) this.f3903a).add(new b(11, string15, str9, string16, str, f15, c(f15)));
        }
        if (lineInfo.upTime != null) {
            b bVar = new b(12, context.getString(R.string.upTime), lineInfo.upTime, context.getString(R.string.upTimeDesc), str, 5.0f, R.drawable.ic_level_good);
            bVar.f18377z = false;
            ((ArrayList) this.f3903a).add(bVar);
        }
    }
}
