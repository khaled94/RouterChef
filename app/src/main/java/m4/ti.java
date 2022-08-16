package m4;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import n3.g1;

/* loaded from: classes.dex */
public final class ti {

    /* renamed from: a */
    public final ri f14064a;

    /* renamed from: b */
    public final int f14065b;

    /* renamed from: c */
    public final int f14066c;

    public ti(int i10, int i11, int i12) {
        this.f14065b = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.f14066c = 1;
        } else {
            this.f14066c = i12;
        }
        this.f14064a = new ri(i11);
    }

    public final String a(ArrayList<String> arrayList, ArrayList<hi> arrayList2) {
        Collections.sort(arrayList2, new si());
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] split = Normalizer.normalize(arrayList.get(arrayList2.get(i10).f9344e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i11 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i12 = i11 + 2;
                            if (i12 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i11) == '\'') {
                                if (sb.charAt(i11 - 1) != ' ') {
                                    int i13 = i11 + 1;
                                    if ((sb.charAt(i13) == 's' || sb.charAt(i13) == 'S') && (i12 == sb.length() || sb.charAt(i12) == ' ')) {
                                        sb.insert(i11, ' ');
                                        i11 = i12;
                                        z10 = true;
                                    }
                                }
                                sb.setCharAt(i11, ' ');
                                z10 = true;
                            }
                            i11++;
                        }
                        String sb2 = z10 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    }
                    String[] b10 = mi.b(str, true);
                    if (b10.length >= this.f14066c) {
                        for (int i14 = 0; i14 < b10.length; i14++) {
                            String str2 = "";
                            for (int i15 = 0; i15 < this.f14066c; i15++) {
                                int i16 = i14 + i15;
                                if (i16 >= b10.length) {
                                    break;
                                }
                                if (i15 > 0) {
                                    str2 = String.valueOf(str2).concat(" ");
                                }
                                String valueOf = String.valueOf(str2);
                                String valueOf2 = String.valueOf(b10[i16]);
                                str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.f14065b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f14065b) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        ki kiVar = new ki();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                ((Base64OutputStream) kiVar.f10436u).write(this.f14064a.b((String) it.next()));
            } catch (IOException e10) {
                g1.h("Error while writing hash to byteStream", e10);
            }
        }
        return kiVar.toString();
    }
}
