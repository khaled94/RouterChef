package t2;

import android.util.Base64;
import android.util.JsonReader;
import java.util.Objects;
import q2.h;
import u6.a0;
import u6.n;
import v6.d;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements h, d.a {

    /* renamed from: s */
    public static final /* synthetic */ t f18549s = new t();

    /* renamed from: t */
    public static final /* synthetic */ t f18550t = new t();

    @Override // q2.h
    public final void a(Exception exc) {
    }

    @Override // v6.d.a
    public final Object b(JsonReader jsonReader) {
        j7.d dVar = d.f19794a;
        n.a aVar = new n.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null name");
                    aVar.f19389c = nextString;
                    break;
                case 1:
                    aVar.f19388b = Long.valueOf(jsonReader.nextLong());
                    break;
                case 2:
                    aVar.f19390d = new String(Base64.decode(jsonReader.nextString(), 2), a0.f19269a);
                    break;
                case 3:
                    aVar.f19387a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }
}
