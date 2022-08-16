package m4;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.security.Provider;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;
import javax.crypto.Mac;
import l3.s;

@Deprecated
/* loaded from: classes.dex */
public final class js implements y90, ar0, qt0, o72, aj2 {

    /* renamed from: s */
    public static final String[] f10177s = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: t */
    public static final /* synthetic */ js f10178t = new js();

    /* renamed from: u */
    public static final /* synthetic */ js f10179u = new js();

    /* renamed from: v */
    public static final /* synthetic */ js f10180v = new js();

    /* renamed from: w */
    public static final /* synthetic */ js f10181w = new js();

    public static boolean a(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean b(qs qsVar, os osVar, String... strArr) {
        if (osVar == null) {
            return false;
        }
        Objects.requireNonNull(s.B.f5796j);
        qsVar.c(osVar, SystemClock.elapsedRealtime(), strArr);
        return true;
    }

    public static int d(dd ddVar) {
        ddVar.i(4);
        if (ddVar.l() == 1684108385) {
            ddVar.i(8);
            return ddVar.q();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static er2 f(int i10, String str, dd ddVar, boolean z10, boolean z11) {
        int d5 = d(ddVar);
        if (z11) {
            d5 = Math.min(1, d5);
        }
        if (d5 >= 0) {
            return z10 ? new c(str, null, Integer.toString(d5)) : new yq2("und", str, Integer.toString(d5));
        }
        String b10 = f0.b(i10);
        Log.w("MetadataUtil", b10.length() != 0 ? "Failed to parse uint8 attribute: ".concat(b10) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static c g(int i10, String str, dd ddVar) {
        int l10 = ddVar.l();
        if (ddVar.l() == 1684108385 && l10 >= 22) {
            ddVar.i(10);
            int t10 = ddVar.t();
            if (t10 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(t10);
                String sb2 = sb.toString();
                int t11 = ddVar.t();
                if (t11 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(t11);
                    sb2 = sb3.toString();
                }
                return new c(str, null, sb2);
            }
        }
        String b10 = f0.b(i10);
        Log.w("MetadataUtil", b10.length() != 0 ? "Failed to parse index/count attribute: ".concat(b10) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static c i(int i10, String str, dd ddVar) {
        int l10 = ddVar.l();
        if (ddVar.l() == 1684108385) {
            ddVar.i(8);
            return new c(str, null, ddVar.A(l10 - 16));
        }
        String b10 = f0.b(i10);
        Log.w("MetadataUtil", b10.length() != 0 ? "Failed to parse text attribute: ".concat(b10) : new String("Failed to parse text attribute: "));
        return null;
    }

    @Override // m4.qt0
    public void c(boolean z10, Context context, zo0 zo0Var) {
    }

    @Override // m4.o72
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public int mo30h(Object obj) {
        Pattern pattern = bj2.f6548a;
        return ((qi2) obj).f12883a.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((to0) obj).e();
    }

    @Override // m4.y90
    /* renamed from: zza */
    public void mo20zza() {
    }
}
