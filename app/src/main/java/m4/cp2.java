package m4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class cp2 {

    /* renamed from: c */
    public static final Pattern f7103c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f7104a = -1;

    /* renamed from: b */
    public int f7105b = -1;

    public final boolean a(ln0 ln0Var) {
        int i10 = 0;
        while (true) {
            ym0[] ym0VarArr = ln0Var.f10943s;
            if (i10 < ym0VarArr.length) {
                ym0 ym0Var = ym0VarArr[i10];
                if (ym0Var instanceof yq2) {
                    yq2 yq2Var = (yq2) ym0Var;
                    if ("iTunSMPB".equals(yq2Var.f15889u) && b(yq2Var.f15890v)) {
                        return true;
                    }
                } else if (ym0Var instanceof gr2) {
                    gr2 gr2Var = (gr2) ym0Var;
                    if ("com.apple.iTunes".equals(gr2Var.f9010t) && "iTunSMPB".equals(gr2Var.f9011u) && b(gr2Var.f9012v)) {
                        return true;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                return false;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = f7103c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = ls1.f10971a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt <= 0 && parseInt2 <= 0) {
                    return false;
                }
                this.f7104a = parseInt;
                this.f7105b = parseInt2;
                return true;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
