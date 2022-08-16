package x7;

import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b extends Enum<b> implements x7.c {

    /* renamed from: s */
    public static final a f20067s;

    /* renamed from: t */
    public static final C0151b f20068t;

    /* renamed from: u */
    public static final c f20069u;

    /* renamed from: v */
    public static final d f20070v;

    /* renamed from: w */
    public static final e f20071w;

    /* renamed from: x */
    public static final f f20072x;
    public static final g y;

    /* renamed from: z */
    public static final /* synthetic */ b[] f20073z;

    /* loaded from: classes.dex */
    public final class a extends b {
        public a() {
            super("IDENTITY", 0, null);
        }

        @Override // x7.c
        public final String b(Field field) {
            return field.getName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [x7.b$g] */
    /* JADX WARN: Type inference failed for: r1v0, types: [x7.b$b] */
    /* JADX WARN: Type inference failed for: r3v0, types: [x7.b$c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [x7.b$d] */
    /* JADX WARN: Type inference failed for: r7v0, types: [x7.b$e] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x7.b$f] */
    static {
        a aVar = new a();
        f20067s = aVar;
        ?? r12 = new b() { // from class: x7.b.b
            @Override // x7.c
            public final String b(Field field) {
                return b.e(field.getName());
            }
        };
        f20068t = r12;
        ?? r32 = new b() { // from class: x7.b.c
            @Override // x7.c
            public final String b(Field field) {
                return b.e(b.d(field.getName(), ' '));
            }
        };
        f20069u = r32;
        ?? r52 = new b() { // from class: x7.b.d
            @Override // x7.c
            public final String b(Field field) {
                return b.d(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f20070v = r52;
        ?? r72 = new b() { // from class: x7.b.e
            @Override // x7.c
            public final String b(Field field) {
                return b.d(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f20071w = r72;
        ?? r92 = new b() { // from class: x7.b.f
            @Override // x7.c
            public final String b(Field field) {
                return b.d(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f20072x = r92;
        ?? r11 = new b() { // from class: x7.b.g
            @Override // x7.c
            public final String b(Field field) {
                return b.d(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        y = r11;
        f20073z = new b[]{aVar, r12, r32, r52, r72, r92, r11};
    }

    public b(String str, int i10, a aVar) {
        super(str, i10);
    }

    public static String d(String str, char c10) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c10);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String e(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20073z.clone();
    }
}
