package z6;

import a7.e;
import a7.f;
import android.content.SharedPreferences;
import android.util.Log;
import c5.h;
import c5.i;
import c5.j;
import c5.l;
import e9.d;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import m4.ql;
import m4.rz;
import org.json.JSONObject;
import p1.r;

/* loaded from: classes.dex */
public final class a implements h<Void, Void> {

    /* renamed from: s */
    public final /* synthetic */ b f20991s;

    public a(b bVar) {
        this.f20991s = bVar;
    }

    @Override // c5.h
    public final i<Void> a(Void r92) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Exception e10;
        b bVar = this.f20991s;
        rz rzVar = bVar.f20997f;
        f fVar = bVar.f20993b;
        Objects.requireNonNull(rzVar);
        FileWriter fileWriter2 = null;
        try {
            Map c10 = rzVar.c(fVar);
            Objects.requireNonNull((ql) rzVar.f13468t);
            w6.a aVar = new w6.a((String) rzVar.f13467s, c10);
            aVar.c("User-Agent", "Crashlytics Android SDK/18.2.3");
            aVar.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            rzVar.a(aVar, fVar);
            ((d) rzVar.f13469u).d("Requesting settings from " + ((String) rzVar.f13467s));
            ((d) rzVar.f13469u).m("Settings query params were: " + c10);
            jSONObject = rzVar.d(aVar.b());
        } catch (IOException e11) {
            ((d) rzVar.f13469u).e("Settings request failed.", e11);
            jSONObject = null;
        }
        if (jSONObject != null) {
            e a10 = this.f20991s.f20994c.a(jSONObject);
            r rVar = this.f20991s.f20996e;
            long j3 = a10.f288d;
            Objects.requireNonNull(rVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter(rVar.a());
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e12) {
                    e10 = e12;
                    try {
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e10);
                        s6.e.a(fileWriter, "Failed to close settings writer.");
                        this.f20991s.c(jSONObject, "Loaded settings: ");
                        b bVar2 = this.f20991s;
                        String str = bVar2.f20993b.f294f;
                        SharedPreferences.Editor edit = s6.e.h(bVar2.f20992a).edit();
                        edit.putString("existing_instance_identifier", str);
                        edit.apply();
                        this.f20991s.f20999h.set(a10);
                        this.f20991s.f21000i.get().d(a10.f285a);
                        j<a7.a> jVar = new j<>();
                        jVar.d(a10.f285a);
                        this.f20991s.f21000i.set(jVar);
                        return l.e(null);
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        fileWriter = fileWriter2;
                        s6.e.a(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    s6.e.a(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e13) {
                e10 = e13;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                s6.e.a(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            s6.e.a(fileWriter, "Failed to close settings writer.");
            this.f20991s.c(jSONObject, "Loaded settings: ");
            b bVar22 = this.f20991s;
            String str2 = bVar22.f20993b.f294f;
            SharedPreferences.Editor edit2 = s6.e.h(bVar22.f20992a).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            this.f20991s.f20999h.set(a10);
            this.f20991s.f21000i.get().d(a10.f285a);
            j<a7.a> jVar2 = new j<>();
            jVar2.d(a10.f285a);
            this.f20991s.f21000i.set(jVar2);
        }
        return l.e(null);
    }
}
