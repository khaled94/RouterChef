package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.d;
import androidx.fragment.app.a;
import androidx.fragment.app.b1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends er2 {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: t */
    public final String f6668t;

    /* renamed from: u */
    public final String f6669u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = m4.ls1.f10971a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f6668t = r0
            java.lang.String r3 = r3.readString()
            r2.f6669u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.c.<init>(android.os.Parcel):void");
    }

    public c(String str, String str2, String str3) {
        super(str);
        this.f6668t = str2;
        this.f6669u = str3;
    }

    public static List<Integer> a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else if (str.length() < 7) {
                if (str.length() >= 4) {
                    parseInt = Integer.parseInt(str.substring(0, 4));
                }
                return arrayList;
            } else {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (ls1.f(this.f8048s, cVar.f8048s) && ls1.f(this.f6668t, cVar.f6668t) && ls1.f(this.f6669u, cVar.f6669u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a10 = a.a(this.f8048s, 527, 31);
        String str = this.f6668t;
        int i10 = 0;
        int hashCode = (a10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6669u;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m4.er2, m4.ym0
    public final void p(sk skVar) {
        char c10;
        String str = this.f8048s;
        Objects.requireNonNull(str);
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case '\n':
                skVar.f13705c = this.f6669u;
                return;
            case 1:
            case 11:
                skVar.f13718q = this.f6669u;
                return;
            case 2:
            case '\f':
                try {
                    int parseInt = Integer.parseInt(this.f6669u.substring(2, 4));
                    int parseInt2 = Integer.parseInt(this.f6669u.substring(0, 2));
                    skVar.f13713k = Integer.valueOf(parseInt);
                    skVar.f13714l = Integer.valueOf(parseInt2);
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
                    return;
                }
            case 3:
            case 17:
                skVar.f13704b = this.f6669u;
                return;
            case 4:
            case 18:
                skVar.f13706d = this.f6669u;
                return;
            case 5:
            case 19:
                skVar.f13719r = this.f6669u;
                return;
            case 6:
            case 20:
                String str2 = this.f6669u;
                int i10 = ls1.f10971a;
                String[] split = str2.split("/", -1);
                try {
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    skVar.f13710h = Integer.valueOf(parseInt3);
                    skVar.f13711i = valueOf;
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case 7:
            case 16:
                skVar.f13703a = this.f6669u;
                return;
            case '\b':
            case 15:
                skVar.p = this.f6669u;
                return;
            case '\t':
            case 21:
                try {
                    skVar.f13712j = Integer.valueOf(Integer.parseInt(this.f6669u));
                    return;
                } catch (NumberFormatException unused3) {
                    return;
                }
            case '\r':
                ArrayList arrayList = (ArrayList) a(this.f6669u);
                int size = arrayList.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        skVar.f13714l = (Integer) arrayList.get(2);
                    }
                    skVar.f13713k = (Integer) arrayList.get(1);
                }
                skVar.f13712j = (Integer) arrayList.get(0);
                return;
            case 14:
                ArrayList arrayList2 = (ArrayList) a(this.f6669u);
                int size2 = arrayList2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        skVar.f13717o = (Integer) arrayList2.get(2);
                    }
                    skVar.f13716n = (Integer) arrayList2.get(1);
                }
                skVar.f13715m = (Integer) arrayList2.get(0);
                return;
            default:
                return;
        }
    }

    @Override // m4.er2
    public final String toString() {
        String str = this.f8048s;
        String str2 = this.f6668t;
        String str3 = this.f6669u;
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 22, String.valueOf(str2).length(), String.valueOf(str3).length()));
        b1.b(sb, str, ": description=", str2, ": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8048s);
        parcel.writeString(this.f6668t);
        parcel.writeString(this.f6669u);
    }
}
