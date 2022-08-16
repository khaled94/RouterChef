package r7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import r7.a;
import s.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public File f17278a;

    /* renamed from: b */
    public final h6.d f17279b;

    public d(h6.d dVar) {
        this.f17279b = dVar;
    }

    public final File a() {
        if (this.f17278a == null) {
            synchronized (this) {
                if (this.f17278a == null) {
                    h6.d dVar = this.f17279b;
                    dVar.a();
                    File filesDir = dVar.f5112a.getFilesDir();
                    this.f17278a = new File(filesDir, "PersistedInstallation." + this.f17279b.d() + ".json");
                }
            }
        }
        return this.f17278a;
    }

    public final e b(e eVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", eVar.c());
            jSONObject.put("Status", h.b(eVar.f()));
            jSONObject.put("AuthToken", eVar.a());
            jSONObject.put("RefreshToken", eVar.e());
            jSONObject.put("TokenCreationEpochInSecs", eVar.g());
            jSONObject.put("ExpiresInSecs", eVar.b());
            jSONObject.put("FisError", eVar.d());
            h6.d dVar = this.f17279b;
            dVar.a();
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", dVar.f5112a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(a())) {
            return eVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public final e c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = e.f17280a;
        a.C0109a c0109a = new a.C0109a();
        c0109a.d(0L);
        c0109a.f17269b = 1;
        c0109a.b(0L);
        c0109a.f17268a = optString;
        c0109a.c(h.c(5)[optInt]);
        c0109a.f17270c = optString2;
        c0109a.f17271d = optString3;
        c0109a.d(optLong);
        c0109a.b(optLong2);
        c0109a.f17274g = optString4;
        return c0109a.a();
    }
}
