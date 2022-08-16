package s4;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: e */
    public static HashMap<String, String> f18107e;

    /* renamed from: j */
    public static Object f18112j;

    /* renamed from: a */
    public static final Uri f18103a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Pattern f18104b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c */
    public static final Pattern f18105c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d */
    public static final AtomicBoolean f18106d = new AtomicBoolean();

    /* renamed from: f */
    public static final HashMap<String, Boolean> f18108f = new HashMap<>();

    /* renamed from: g */
    public static final HashMap<String, Integer> f18109g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Long> f18110h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Float> f18111i = new HashMap<>();

    /* renamed from: k */
    public static final String[] f18113k = new String[0];

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
    }
}
