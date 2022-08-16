package s4;

import java.io.IOException;

/* loaded from: classes.dex */
public class k7 extends IOException {

    /* renamed from: s */
    public static final /* synthetic */ int f17959s = 0;

    public k7(String str) {
        super(str);
    }

    public static k7 a() {
        return new k7("Protocol message had invalid UTF-8.");
    }

    public static k7 b() {
        return new k7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static k7 c() {
        return new k7("Failed to parse the message.");
    }

    public static k7 d() {
        return new k7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
