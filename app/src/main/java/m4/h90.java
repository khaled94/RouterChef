package m4;

import android.util.Base64;
import android.util.JsonWriter;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class h90 implements j90 {

    /* renamed from: s */
    public final /* synthetic */ String f9144s;

    /* renamed from: t */
    public final /* synthetic */ String f9145t;

    /* renamed from: u */
    public final /* synthetic */ Map f9146u;

    /* renamed from: v */
    public final /* synthetic */ byte[] f9147v;

    public /* synthetic */ h90(String str, String str2, Map map, byte[] bArr) {
        this.f9144s = str;
        this.f9145t = str2;
        this.f9146u = map;
        this.f9147v = bArr;
    }

    @Override // m4.j90
    public final void a(JsonWriter jsonWriter) {
        String str = this.f9144s;
        String str2 = this.f9145t;
        Map map = this.f9146u;
        byte[] bArr = this.f9147v;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        k90.f(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}
