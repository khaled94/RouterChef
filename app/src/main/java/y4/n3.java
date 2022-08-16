package y4;

import android.content.Context;
import android.os.Bundle;
import d4.m;
import java.util.Objects;
import s4.b1;

/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a */
    public final Context f20595a;

    /* renamed from: b */
    public String f20596b;

    /* renamed from: c */
    public String f20597c;

    /* renamed from: d */
    public String f20598d;

    /* renamed from: e */
    public Boolean f20599e;

    /* renamed from: f */
    public long f20600f;

    /* renamed from: g */
    public b1 f20601g;

    /* renamed from: h */
    public boolean f20602h;

    /* renamed from: i */
    public final Long f20603i;

    /* renamed from: j */
    public String f20604j;

    public n3(Context context, b1 b1Var, Long l10) {
        this.f20602h = true;
        Objects.requireNonNull(context, "null reference");
        Context applicationContext = context.getApplicationContext();
        m.h(applicationContext);
        this.f20595a = applicationContext;
        this.f20603i = l10;
        if (b1Var != null) {
            this.f20601g = b1Var;
            this.f20596b = b1Var.f17738x;
            this.f20597c = b1Var.f17737w;
            this.f20598d = b1Var.f17736v;
            this.f20602h = b1Var.f17735u;
            this.f20600f = b1Var.f17734t;
            this.f20604j = b1Var.f17739z;
            Bundle bundle = b1Var.y;
            if (bundle == null) {
                return;
            }
            this.f20599e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
        }
    }
}
