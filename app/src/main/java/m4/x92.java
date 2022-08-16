package m4;

import java.io.IOException;

/* loaded from: classes.dex */
public class x92 extends IOException {

    /* renamed from: t */
    public static final /* synthetic */ int f15256t = 0;

    /* renamed from: s */
    public boolean f15257s;

    public x92(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public x92(String str) {
        super(str);
    }

    public static w92 a() {
        return new w92();
    }

    public static x92 b() {
        return new x92("Protocol message end-group tag did not match expected tag.");
    }

    public static x92 c() {
        return new x92("Protocol message contained an invalid tag (zero).");
    }

    public static x92 d() {
        return new x92("Protocol message had invalid UTF-8.");
    }

    public static x92 e() {
        return new x92("CodedInputStream encountered a malformed varint.");
    }

    public static x92 f() {
        return new x92("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static x92 g() {
        return new x92("Failed to parse the message.");
    }

    public static x92 h() {
        return new x92("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
