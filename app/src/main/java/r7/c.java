package r7;

import s.h;

/* loaded from: classes.dex */
public final /* synthetic */ class c {
    public static int[] a() {
        return h.c(11);
    }

    public static /* synthetic */ int b(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 7;
        }
        if (i10 == 6) {
            return 8;
        }
        if (i10 == 7) {
            return 9;
        }
        if (i10 == 8) {
            return 10;
        }
        if (i10 == 9) {
            return 11;
        }
        if (i10 == 10) {
            return 12;
        }
        if (i10 != 11) {
            throw null;
        }
        return 13;
    }

    public static /* synthetic */ String c(int i10) {
        return i10 == 1 ? "ATTEMPT_MIGRATION" : i10 == 2 ? "NOT_GENERATED" : i10 == 3 ? "UNREGISTERED" : i10 == 4 ? "REGISTERED" : i10 == 5 ? "REGISTER_ERROR" : "null";
    }

    public static /* synthetic */ String d(int i10) {
        return i10 == 1 ? "NO_ERROR" : i10 == 2 ? "PROTOCOL_ERROR" : i10 == 3 ? "INTERNAL_ERROR" : i10 == 4 ? "FLOW_CONTROL_ERROR" : i10 == 5 ? "REFUSED_STREAM" : i10 == 6 ? "CANCEL" : i10 == 7 ? "COMPRESSION_ERROR" : i10 == 8 ? "CONNECT_ERROR" : i10 == 9 ? "ENHANCE_YOUR_CALM" : i10 == 10 ? "INADEQUATE_SECURITY" : i10 == 11 ? "HTTP_1_1_REQUIRED" : "null";
    }
}
