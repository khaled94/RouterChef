package g1;

import android.content.Context;
import g1.z;

/* loaded from: classes.dex */
public final class x {
    public static <T extends z> z.a<T> a(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new z.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
