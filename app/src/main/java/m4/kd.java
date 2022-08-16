package m4;

import android.util.Log;

/* loaded from: classes.dex */
public final class kd {

    /* renamed from: a */
    public static final int f10335a = wg.c("nam");

    /* renamed from: b */
    public static final int f10336b = wg.c("trk");

    /* renamed from: c */
    public static final int f10337c = wg.c("cmt");

    /* renamed from: d */
    public static final int f10338d = wg.c("day");

    /* renamed from: e */
    public static final int f10339e = wg.c("ART");

    /* renamed from: f */
    public static final int f10340f = wg.c("too");

    /* renamed from: g */
    public static final int f10341g = wg.c("alb");

    /* renamed from: h */
    public static final int f10342h = wg.c("com");

    /* renamed from: i */
    public static final int f10343i = wg.c("wrt");

    /* renamed from: j */
    public static final int f10344j = wg.c("lyr");

    /* renamed from: k */
    public static final int f10345k = wg.c("gen");

    /* renamed from: l */
    public static final int f10346l = wg.c("covr");

    /* renamed from: m */
    public static final int f10347m = wg.c("gnre");

    /* renamed from: n */
    public static final int f10348n = wg.c("grp");

    /* renamed from: o */
    public static final int f10349o = wg.c("disk");
    public static final int p = wg.c("trkn");

    /* renamed from: q */
    public static final int f10350q = wg.c("tmpo");

    /* renamed from: r */
    public static final int f10351r = wg.c("cpil");

    /* renamed from: s */
    public static final int f10352s = wg.c("aART");

    /* renamed from: t */
    public static final int f10353t = wg.c("sonm");

    /* renamed from: u */
    public static final int f10354u = wg.c("soal");

    /* renamed from: v */
    public static final int f10355v = wg.c("soar");

    /* renamed from: w */
    public static final int f10356w = wg.c("soaa");

    /* renamed from: x */
    public static final int f10357x = wg.c("soco");
    public static final int y = wg.c("rtng");

    /* renamed from: z */
    public static final int f10358z = wg.c("pgap");
    public static final int A = wg.c("sosn");
    public static final int B = wg.c("tvsh");
    public static final int C = wg.c("----");
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static int a(rg rgVar) {
        rgVar.o(4);
        if (rgVar.b() == zc.F0) {
            rgVar.o(8);
            return rgVar.c();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static je b(int i10, String str, rg rgVar, boolean z10, boolean z11) {
        int a10 = a(rgVar);
        if (z11) {
            a10 = Math.min(1, a10);
        }
        if (a10 >= 0) {
            return z10 ? new le(str, Integer.toString(a10)) : new ie(str, Integer.toString(a10));
        }
        String a11 = zc.a(i10);
        Log.w("MetadataUtil", a11.length() != 0 ? "Failed to parse uint8 attribute: ".concat(a11) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static le c(int i10, String str, rg rgVar) {
        int b10 = rgVar.b();
        if (rgVar.b() == zc.F0 && b10 >= 22) {
            rgVar.o(10);
            int e10 = rgVar.e();
            if (e10 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(e10);
                String sb2 = sb.toString();
                int e11 = rgVar.e();
                if (e11 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(e11);
                    sb2 = sb3.toString();
                }
                return new le(str, sb2);
            }
        }
        String a10 = zc.a(i10);
        Log.w("MetadataUtil", a10.length() != 0 ? "Failed to parse index/count attribute: ".concat(a10) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static le d(int i10, String str, rg rgVar) {
        int b10 = rgVar.b();
        if (rgVar.b() == zc.F0) {
            rgVar.o(8);
            return new le(str, rgVar.i(b10 - 16));
        }
        String a10 = zc.a(i10);
        Log.w("MetadataUtil", a10.length() != 0 ? "Failed to parse text attribute: ".concat(a10) : new String("Failed to parse text attribute: "));
        return null;
    }
}
