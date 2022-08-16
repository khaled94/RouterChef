package m4;

import android.util.Base64;
import android.util.JsonWriter;

/* loaded from: classes.dex */
public final /* synthetic */ class i90 implements j90, yp0 {

    /* renamed from: s */
    public final /* synthetic */ byte[] f9563s;

    public /* synthetic */ i90(byte[] bArr) {
        this.f9563s = bArr;
    }

    @Override // m4.j90
    public final void a(JsonWriter jsonWriter) {
        String str;
        byte[] bArr = this.f9563s;
        Object obj = k90.f10300b;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length >= 10000) {
            encodeToString = g90.b(encodeToString);
            if (encodeToString != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value(length);
            jsonWriter.endObject();
        }
        str = "body";
        jsonWriter.name(str).value(encodeToString);
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // m4.yp0
    /* renamed from: zza */
    public final kq0 mo28zza() {
        return new km2(this.f9563s);
    }
}
