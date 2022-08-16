package v6;

import android.util.Base64;
import android.util.JsonReader;
import j7.e;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;
import t2.t;
import u2.g;
import u6.a0;
import u6.b;
import u6.b0;
import u6.c;
import u6.g;
import u6.h;
import u6.j;
import u6.k;
import u6.l;
import u6.m;
import u6.o;
import u6.p;
import u6.r;
import u6.s;
import u6.u;
import u6.v;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final j7.d f19794a;

    /* loaded from: classes.dex */
    public interface a<T> {
        T b(JsonReader jsonReader);
    }

    static {
        e eVar = new e();
        u6.a.f19150a.a(eVar);
        eVar.f5484d = true;
        f19794a = new j7.d(eVar);
    }

    public static a0.e.d.a.b.AbstractC0135d.AbstractC0137b a(JsonReader jsonReader) {
        r.a aVar = new r.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    aVar.f19421d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null symbol");
                    aVar.f19419b = nextString;
                    break;
                case 2:
                    aVar.f19418a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f19420c = jsonReader.nextString();
                    break;
                case 4:
                    aVar.f19422e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static a0.c b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null key");
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
                Objects.requireNonNull(str2, "Null value");
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : "";
        if (str2 == null) {
            str3 = d7.a.c(str3, " value");
        }
        if (str3.isEmpty()) {
            return new u6.d(str, str2);
        }
        throw new IllegalStateException(d7.a.c("Missing required properties:", str3));
    }

    public static <T> b0<T> c(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.b(jsonReader));
        }
        jsonReader.endArray();
        return new b0<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0.e.d d(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        k.a aVar = new k.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str = "";
            String str2 = null;
            if (c10 == 0) {
                s.a aVar2 = new s.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    Objects.requireNonNull(nextName2);
                    switch (nextName2.hashCode()) {
                        case -1708606089:
                            if (nextName2.equals("batteryLevel")) {
                                c15 = 0;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -1455558134:
                            if (nextName2.equals("batteryVelocity")) {
                                c15 = 1;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -1439500848:
                            if (nextName2.equals("orientation")) {
                                c15 = 2;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 279795450:
                            if (nextName2.equals("diskUsed")) {
                                c15 = 3;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 976541947:
                            if (nextName2.equals("ramUsed")) {
                                c15 = 4;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 1516795582:
                            if (nextName2.equals("proximityOn")) {
                                c15 = 5;
                                break;
                            }
                            c15 = 65535;
                            break;
                        default:
                            c15 = 65535;
                            break;
                    }
                    switch (c15) {
                        case 0:
                            aVar2.f19429a = Double.valueOf(jsonReader.nextDouble());
                            break;
                        case 1:
                            aVar2.f19430b = Integer.valueOf(jsonReader.nextInt());
                            break;
                        case 2:
                            aVar2.f19432d = Integer.valueOf(jsonReader.nextInt());
                            break;
                        case 3:
                            aVar2.f19434f = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 4:
                            aVar2.f19433e = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 5:
                            aVar2.f19431c = Boolean.valueOf(jsonReader.nextBoolean());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                aVar.f19366d = aVar2.a();
            } else if (c10 == 1) {
                l.b bVar = new l.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    Objects.requireNonNull(nextName3);
                    switch (nextName3.hashCode()) {
                        case -1332194002:
                            if (nextName3.equals("background")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1090974952:
                            if (nextName3.equals("execution")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -80231855:
                            if (nextName3.equals("internalKeys")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 555169704:
                            if (nextName3.equals("customAttributes")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 928737948:
                            if (nextName3.equals("uiOrientation")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            bVar.f19376d = Boolean.valueOf(jsonReader.nextBoolean());
                            break;
                        case 1:
                            jsonReader.beginObject();
                            b0 b0Var = null;
                            a0.e.d.a.b.AbstractC0132b abstractC0132b = null;
                            a0.a aVar3 = null;
                            a0.e.d.a.b.c cVar = null;
                            b0 b0Var2 = null;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                Objects.requireNonNull(nextName4);
                                switch (nextName4.hashCode()) {
                                    case -1375141843:
                                        if (nextName4.equals("appExitInfo")) {
                                            c12 = 0;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case -1337936983:
                                        if (nextName4.equals("threads")) {
                                            c12 = 1;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case -902467928:
                                        if (nextName4.equals("signal")) {
                                            c12 = 2;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 937615455:
                                        if (nextName4.equals("binaries")) {
                                            c12 = 3;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1481625679:
                                        if (nextName4.equals("exception")) {
                                            c12 = 4;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    default:
                                        c12 = 65535;
                                        break;
                                }
                                switch (c12) {
                                    case 0:
                                        c.a aVar4 = new c.a();
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            String nextName5 = jsonReader.nextName();
                                            Objects.requireNonNull(nextName5);
                                            switch (nextName5.hashCode()) {
                                                case 110987:
                                                    if (nextName5.equals("pid")) {
                                                        c13 = 0;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 111312:
                                                    if (nextName5.equals("pss")) {
                                                        c13 = 1;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 113234:
                                                    if (nextName5.equals("rss")) {
                                                        c13 = 2;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 55126294:
                                                    if (nextName5.equals("timestamp")) {
                                                        c13 = 3;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 202325402:
                                                    if (nextName5.equals("processName")) {
                                                        c13 = 4;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 722137681:
                                                    if (nextName5.equals("reasonCode")) {
                                                        c13 = 5;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 723857505:
                                                    if (nextName5.equals("traceFile")) {
                                                        c13 = 6;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 2125650548:
                                                    if (nextName5.equals("importance")) {
                                                        c13 = 7;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                default:
                                                    c13 = 65535;
                                                    break;
                                            }
                                            switch (c13) {
                                                case 0:
                                                    aVar4.f19295a = Integer.valueOf(jsonReader.nextInt());
                                                    break;
                                                case 1:
                                                    aVar4.f19299e = Long.valueOf(jsonReader.nextLong());
                                                    break;
                                                case 2:
                                                    aVar4.f19300f = Long.valueOf(jsonReader.nextLong());
                                                    break;
                                                case 3:
                                                    aVar4.f19301g = Long.valueOf(jsonReader.nextLong());
                                                    break;
                                                case 4:
                                                    String nextString = jsonReader.nextString();
                                                    Objects.requireNonNull(nextString, "Null processName");
                                                    aVar4.f19296b = nextString;
                                                    break;
                                                case 5:
                                                    aVar4.f19297c = Integer.valueOf(jsonReader.nextInt());
                                                    break;
                                                case 6:
                                                    aVar4.f19302h = jsonReader.nextString();
                                                    break;
                                                case 7:
                                                    aVar4.f19298d = Integer.valueOf(jsonReader.nextInt());
                                                    break;
                                                default:
                                                    jsonReader.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader.endObject();
                                        aVar3 = aVar4.a();
                                        break;
                                    case 1:
                                        b0Var = c(jsonReader, g.f19061s);
                                        break;
                                    case 2:
                                        p.a aVar5 = new p.a();
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            String nextName6 = jsonReader.nextName();
                                            Objects.requireNonNull(nextName6);
                                            switch (nextName6.hashCode()) {
                                                case -1147692044:
                                                    if (nextName6.equals("address")) {
                                                        c14 = 0;
                                                        break;
                                                    }
                                                    c14 = 65535;
                                                    break;
                                                case 3059181:
                                                    if (nextName6.equals("code")) {
                                                        c14 = 1;
                                                        break;
                                                    }
                                                    c14 = 65535;
                                                    break;
                                                case 3373707:
                                                    if (nextName6.equals("name")) {
                                                        c14 = 2;
                                                        break;
                                                    }
                                                    c14 = 65535;
                                                    break;
                                                default:
                                                    c14 = 65535;
                                                    break;
                                            }
                                            switch (c14) {
                                                case 0:
                                                    aVar5.f19406c = Long.valueOf(jsonReader.nextLong());
                                                    break;
                                                case 1:
                                                    String nextString2 = jsonReader.nextString();
                                                    Objects.requireNonNull(nextString2, "Null code");
                                                    aVar5.f19405b = nextString2;
                                                    break;
                                                case 2:
                                                    String nextString3 = jsonReader.nextString();
                                                    Objects.requireNonNull(nextString3, "Null name");
                                                    aVar5.f19404a = nextString3;
                                                    break;
                                                default:
                                                    jsonReader.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader.endObject();
                                        cVar = aVar5.a();
                                        break;
                                    case 3:
                                        b0Var2 = c(jsonReader, t.f18550t);
                                        break;
                                    case 4:
                                        abstractC0132b = e(jsonReader);
                                        break;
                                    default:
                                        jsonReader.skipValue();
                                        break;
                                }
                            }
                            jsonReader.endObject();
                            String str3 = cVar == null ? " signal" : str;
                            if (b0Var2 == null) {
                                str3 = d7.a.c(str3, " binaries");
                            }
                            if (str3.isEmpty()) {
                                bVar.f19373a = new m(b0Var, abstractC0132b, aVar3, cVar, b0Var2, null);
                                break;
                            } else {
                                throw new IllegalStateException(d7.a.c("Missing required properties:", str3));
                            }
                        case 2:
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(b(jsonReader));
                            }
                            jsonReader.endArray();
                            bVar.f19375c = new b0<>(arrayList);
                            break;
                        case 3:
                            ArrayList arrayList2 = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList2.add(b(jsonReader));
                            }
                            jsonReader.endArray();
                            bVar.f19374b = new b0<>(arrayList2);
                            break;
                        case 4:
                            bVar.b(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                aVar.f19365c = bVar.a();
            } else if (c10 == 2) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName7 = jsonReader.nextName();
                    Objects.requireNonNull(nextName7);
                    if (!nextName7.equals("content")) {
                        jsonReader.skipValue();
                    } else {
                        str2 = jsonReader.nextString();
                        Objects.requireNonNull(str2, "Null content");
                    }
                }
                jsonReader.endObject();
                if (str2 == null) {
                    str = " content";
                }
                if (str.isEmpty()) {
                    aVar.f19367e = new u6.t(str2);
                } else {
                    throw new IllegalStateException(d7.a.c("Missing required properties:", str));
                }
            } else if (c10 == 3) {
                aVar.c(jsonReader.nextString());
            } else if (c10 != 4) {
                jsonReader.skipValue();
            } else {
                aVar.b(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static a0.e.d.a.b.AbstractC0132b e(JsonReader jsonReader) {
        o.b bVar = new o.b();
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
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(a(jsonReader));
                    }
                    jsonReader.endArray();
                    bVar.f19398c = new b0<>(arrayList);
                    break;
                case 1:
                    bVar.f19397b = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null type");
                    bVar.f19396a = nextString;
                    break;
                case 3:
                    bVar.f19399d = e(jsonReader);
                    break;
                case 4:
                    bVar.f19400e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0 f(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        char c12;
        char c13;
        String str2;
        char c14;
        Charset charset = a0.f19269a;
        b.a aVar = new b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str3 = "";
            switch (c10) {
                case 0:
                    jsonReader.beginObject();
                    b0 b0Var = null;
                    String str4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        Objects.requireNonNull(nextName2);
                        if (nextName2.equals("files")) {
                            b0Var = c(jsonReader, b.f19792s);
                        } else if (!nextName2.equals("orgId")) {
                            jsonReader.skipValue();
                        } else {
                            str4 = jsonReader.nextString();
                        }
                    }
                    jsonReader.endObject();
                    String str5 = b0Var == null ? " files" : str3;
                    if (str5.isEmpty()) {
                        aVar.f19285h = new u6.e(b0Var, str4, null);
                        break;
                    } else {
                        throw new IllegalStateException(d7.a.c("Missing required properties:", str5));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null sdkVersion");
                    aVar.f19278a = nextString;
                    break;
                case 2:
                    String nextString2 = jsonReader.nextString();
                    Objects.requireNonNull(nextString2, "Null buildVersion");
                    aVar.f19282e = nextString2;
                    break;
                case 3:
                    String nextString3 = jsonReader.nextString();
                    Objects.requireNonNull(nextString3, "Null gmpAppId");
                    aVar.f19279b = nextString3;
                    break;
                case 4:
                    String nextString4 = jsonReader.nextString();
                    Objects.requireNonNull(nextString4, "Null installationUuid");
                    aVar.f19281d = nextString4;
                    break;
                case 5:
                    aVar.f19280c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 6:
                    String nextString5 = jsonReader.nextString();
                    Objects.requireNonNull(nextString5, "Null displayVersion");
                    aVar.f19283f = nextString5;
                    break;
                case 7:
                    g.b bVar = new g.b();
                    bVar.b(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        Objects.requireNonNull(nextName3);
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        String str6 = " identifier";
                        switch (c11) {
                            case 0:
                                str = str3;
                                bVar.f19324c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                str = str3;
                                bVar.f19323b = new String(Base64.decode(jsonReader.nextString(), 2), a0.f19269a);
                                break;
                            case 2:
                                str = str3;
                                bVar.f19325d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 3:
                                str = str3;
                                j.a aVar2 = new j.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName4);
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c12 = '\b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            aVar2.f19354f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString6, "Null manufacturer");
                                            aVar2.f19356h = nextString6;
                                            break;
                                        case 2:
                                            aVar2.f19352d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            aVar2.f19349a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            aVar2.f19353e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            aVar2.f19351c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString7, "Null model");
                                            aVar2.f19350b = nextString7;
                                            break;
                                        case 7:
                                            aVar2.f19355g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString8, "Null modelClass");
                                            aVar2.f19357i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar.f19330i = aVar2.a();
                                break;
                            case 4:
                                str = str3;
                                bVar.f19331j = c(jsonReader, r2.b.f17233t);
                                break;
                            case 5:
                                str = str3;
                                u.a aVar3 = new u.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName5);
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    if (c13 == 0) {
                                        String nextString9 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString9, "Null buildVersion");
                                        aVar3.f19442c = nextString9;
                                    } else if (c13 == 1) {
                                        aVar3.f19443d = Boolean.valueOf(jsonReader.nextBoolean());
                                    } else if (c13 == 2) {
                                        String nextString10 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString10, "Null version");
                                        aVar3.f19441b = nextString10;
                                    } else if (c13 != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        aVar3.f19440a = Integer.valueOf(jsonReader.nextInt());
                                    }
                                }
                                jsonReader.endObject();
                                bVar.f19329h = aVar3.a();
                                break;
                            case 6:
                                jsonReader.beginObject();
                                String str7 = null;
                                String str8 = null;
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                String str12 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName6);
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            str2 = str3;
                                            if (nextName6.equals("identifier")) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -519438642:
                                            str2 = str3;
                                            if (nextName6.equals("developmentPlatform")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 213652010:
                                            str2 = str3;
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c14 = 3;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c14 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c14 = 4;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c14 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c14 = 5;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c14 = 65535;
                                            break;
                                        default:
                                            str2 = str3;
                                            c14 = 65535;
                                            break;
                                    }
                                    if (c14 == 0) {
                                        String nextString11 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString11, "Null identifier");
                                        str7 = nextString11;
                                    } else if (c14 == 1) {
                                        str11 = jsonReader.nextString();
                                    } else if (c14 == 2) {
                                        str12 = jsonReader.nextString();
                                    } else if (c14 == 3) {
                                        String nextString12 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString12, "Null version");
                                        str8 = nextString12;
                                    } else if (c14 == 4) {
                                        str10 = jsonReader.nextString();
                                    } else if (c14 != 5) {
                                        jsonReader.skipValue();
                                    } else {
                                        str9 = jsonReader.nextString();
                                    }
                                    str3 = str2;
                                }
                                str = str3;
                                jsonReader.endObject();
                                if (str7 != null) {
                                    str6 = str;
                                }
                                if (str8 == null) {
                                    str6 = d7.a.c(str6, " version");
                                }
                                if (str6.isEmpty()) {
                                    bVar.f19327f = new h(str7, str8, str9, str10, str11, str12);
                                    break;
                                } else {
                                    throw new IllegalStateException(d7.a.c("Missing required properties:", str6));
                                }
                            case 7:
                                jsonReader.beginObject();
                                String str13 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName7 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName7);
                                    if (!nextName7.equals("identifier")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str13 = jsonReader.nextString();
                                        Objects.requireNonNull(str13, "Null identifier");
                                    }
                                }
                                jsonReader.endObject();
                                if (str13 != null) {
                                    str6 = str3;
                                }
                                if (str6.isEmpty()) {
                                    bVar.f19328g = new v(str13);
                                    str = str3;
                                    break;
                                } else {
                                    throw new IllegalStateException(d7.a.c("Missing required properties:", str6));
                                }
                            case '\b':
                                String nextString13 = jsonReader.nextString();
                                Objects.requireNonNull(nextString13, "Null generator");
                                bVar.f19322a = nextString13;
                                str = str3;
                                break;
                            case '\t':
                                bVar.b(jsonReader.nextBoolean());
                                str = str3;
                                break;
                            case '\n':
                                bVar.f19332k = Integer.valueOf(jsonReader.nextInt());
                                str = str3;
                                break;
                            default:
                                str = str3;
                                jsonReader.skipValue();
                                break;
                        }
                        str3 = str;
                    }
                    jsonReader.endObject();
                    aVar.f19284g = bVar.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public final a0 g(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0 f10 = f(jsonReader);
            jsonReader.close();
            return f10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public final String h(a0 a0Var) {
        j7.d dVar = f19794a;
        Objects.requireNonNull(dVar);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(a0Var, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
