package m4;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dm1 {

    /* renamed from: a */
    public final int f7549a;

    /* renamed from: b */
    public final int f7550b;

    /* renamed from: c */
    public final boolean f7551c;

    public dm1(int i10, int i11, boolean z10) {
        this.f7549a = i10;
        this.f7550b = i11;
        this.f7551c = z10;
    }

    public static List<dm1> a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i11 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z10 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new dm1(i10, i11, z10));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
