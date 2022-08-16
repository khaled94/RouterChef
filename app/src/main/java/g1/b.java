package g1;

import android.database.Cursor;
import b3.b0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements b0.a {

    /* renamed from: t */
    public static final /* synthetic */ b f4773t = new b(0);

    /* renamed from: u */
    public static final /* synthetic */ b f4774u = new b(1);

    /* renamed from: s */
    public final /* synthetic */ int f4775s;

    public /* synthetic */ b(int i10) {
        this.f4775s = i10;
    }

    @Override // b3.b0.a
    public final Object a(Object obj) {
        switch (this.f4775s) {
            case 0:
                return ((k1.b) obj).A();
            default:
                Cursor cursor = (Cursor) obj;
                q2.b bVar = b0.f2495x;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return bArr;
        }
    }
}
