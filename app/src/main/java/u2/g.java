package u2;

import android.util.JsonReader;
import java.util.Objects;
import u6.q;
import v6.a;
import v6.d;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements d.a {

    /* renamed from: s */
    public static final /* synthetic */ g f19061s = new g();

    public static /* synthetic */ String a(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "TRANSIENT_ERROR" : i10 == 3 ? "FATAL_ERROR" : i10 == 4 ? "INVALID_PAYLOAD" : "null";
    }

    @Override // v6.d.a
    public Object b(JsonReader jsonReader) {
        j7.d dVar = d.f19794a;
        q.b bVar = new q.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    bVar.f19412c = d.c(jsonReader, a.f19791s);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null name");
                    bVar.f19410a = nextString;
                    break;
                case 2:
                    bVar.f19411b = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }
}
