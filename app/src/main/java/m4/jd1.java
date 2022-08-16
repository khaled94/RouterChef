package m4;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import n3.k1;

/* loaded from: classes.dex */
public final class jd1 implements eh1<kd1> {

    /* renamed from: a */
    public final eh1<jh1> f9929a;

    /* renamed from: b */
    public final om1 f9930b;

    /* renamed from: c */
    public final Context f9931c;

    /* renamed from: d */
    public final z80 f9932d;

    public jd1(me1<jh1> me1Var, om1 om1Var, Context context, z80 z80Var) {
        this.f9929a = me1Var;
        this.f9930b = om1Var;
        this.f9931c = context;
        this.f9932d = z80Var;
    }

    @Override // m4.eh1
    public final tz1<kd1> a() {
        return mz1.o(this.f9929a.a(), new cu1() { // from class: m4.id1
            @Override // m4.cu1
            public final Object a(Object obj) {
                boolean z10;
                String str;
                int i10;
                int i11;
                float f10;
                String str2;
                int i12;
                DisplayMetrics displayMetrics;
                jd1 jd1Var = jd1.this;
                jh1 jh1Var = (jh1) obj;
                on onVar = jd1Var.f9930b.f12204e;
                on[] onVarArr = onVar.y;
                if (onVarArr != null) {
                    str = null;
                    boolean z11 = false;
                    boolean z12 = false;
                    z10 = false;
                    for (on onVar2 : onVarArr) {
                        boolean z13 = onVar2.A;
                        if (!z13 && !z11) {
                            str = onVar2.f12220s;
                            z11 = true;
                        }
                        if (z13) {
                            if (!z12) {
                                z12 = true;
                                z10 = true;
                            } else {
                                z12 = true;
                            }
                        }
                        if (z11 && z12) {
                            break;
                        }
                    }
                } else {
                    str = onVar.f12220s;
                    z10 = onVar.A;
                }
                Resources resources = jd1Var.f9931c.getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    str2 = null;
                    f10 = 0.0f;
                    i11 = 0;
                    i10 = 0;
                } else {
                    float f11 = displayMetrics.density;
                    int i13 = displayMetrics.widthPixels;
                    i10 = displayMetrics.heightPixels;
                    str2 = ((k1) jd1Var.f9932d.c()).y();
                    i11 = i13;
                    f10 = f11;
                }
                StringBuilder sb = new StringBuilder();
                on[] onVarArr2 = onVar.y;
                if (onVarArr2 != null) {
                    boolean z14 = false;
                    for (on onVar3 : onVarArr2) {
                        if (onVar3.A) {
                            z14 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i14 = onVar3.f12224w;
                            if (i14 == -1) {
                                i14 = f10 != 0.0f ? (int) (onVar3.f12225x / f10) : -1;
                            }
                            sb.append(i14);
                            sb.append("x");
                            int i15 = onVar3.f12221t;
                            if (i15 == -2) {
                                i15 = f10 != 0.0f ? (int) (onVar3.f12222u / f10) : -2;
                            }
                            sb.append(i15);
                        }
                    }
                    if (z14) {
                        if (sb.length() != 0) {
                            i12 = 0;
                            sb.insert(0, "|");
                        } else {
                            i12 = 0;
                        }
                        sb.insert(i12, "320x50");
                    }
                }
                return new kd1(onVar, str, z10, sb.toString(), f10, i11, i10, str2, jd1Var.f9930b.p);
            }
        }, u90.f14299f);
    }
}
