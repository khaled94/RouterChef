package i1;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import e0.d;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {
    public static int a(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String c10 = d7.a.c(".", str);
                    String a10 = d.a(".", str, "`");
                    for (int i10 = 0; i10 < columnNames.length; i10++) {
                        String str3 = columnNames[i10];
                        if (str3.length() >= str.length() + 2 && (str3.endsWith(c10) || (str3.charAt(0) == '`' && str3.endsWith(a10)))) {
                            columnIndex = i10;
                            break;
                        }
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
