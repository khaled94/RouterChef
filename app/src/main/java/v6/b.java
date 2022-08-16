package v6;

import android.util.Base64;
import android.util.JsonReader;
import java.util.Objects;
import u6.f;
import v6.d;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements d.a {

    /* renamed from: s */
    public static final /* synthetic */ b f19792s = new b();

    @Override // v6.d.a
    public final Object b(JsonReader jsonReader) {
        j7.d dVar = d.f19794a;
        f.a aVar = new f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            if (nextName.equals("filename")) {
                aVar.c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                aVar.b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }
}
