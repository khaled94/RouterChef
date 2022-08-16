package m4;

import android.util.JsonWriter;
import java.util.Map;

/* loaded from: classes.dex */
public final class af implements xe, j90 {

    /* renamed from: s */
    public final /* synthetic */ int f6135s;

    /* renamed from: t */
    public final /* synthetic */ Object f6136t;

    public /* synthetic */ af(int i10, Map map) {
        this.f6135s = i10;
        this.f6136t = map;
    }

    public /* synthetic */ af(cf cfVar, int i10) {
        this.f6136t = cfVar;
        this.f6135s = i10;
    }

    @Override // m4.j90
    public final void a(JsonWriter jsonWriter) {
        int i10 = this.f6135s;
        Object obj = k90.f10300b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        k90.f(jsonWriter, (Map) this.f6136t);
        jsonWriter.endObject();
    }

    @Override // m4.xe
    public final void c(db dbVar) {
        bf bfVar;
        cf cfVar = (cf) this.f6136t;
        int i10 = this.f6135s;
        if (cfVar.y == null) {
            for (int i11 = 0; i11 <= 0; i11++) {
                dbVar.e(i11, cfVar.f6810u);
            }
            int i12 = cfVar.f6813x;
            if (i12 == -1) {
                cfVar.f6813x = 1;
            } else if (i12 != 1) {
                bfVar = new bf();
                cfVar.y = bfVar;
            }
            bfVar = null;
            cfVar.y = bfVar;
        }
        if (cfVar.y != null) {
            return;
        }
        cfVar.f6809t.remove(cfVar.f6808s[i10]);
        if (i10 == 0) {
            cfVar.f6812w = dbVar;
        }
        if (!cfVar.f6809t.isEmpty()) {
            return;
        }
        cfVar.f6811v.c(cfVar.f6812w);
    }
}
