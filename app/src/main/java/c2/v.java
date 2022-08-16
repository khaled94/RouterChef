package c2;

import android.os.Build;
import t1.i;
import t1.n;

/* loaded from: classes.dex */
public final class v {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:28:0x005b */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet, java.util.Set<t1.c$a>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t1.c a(byte[] r7) {
        /*
            t1.c r0 = new t1.c
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            t1.c$a r5 = new t1.c$a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.util.Set<t1.c$a> r3 = r0.f18462a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.add(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L52
        L36:
            r7 = move-exception
            r7.printStackTrace()
            goto L52
        L3b:
            r7 = move-exception
            goto L5b
        L3d:
            r7 = move-exception
            goto L45
        L3f:
            r0 = move-exception
            goto L5d
        L41:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L45:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r7 = move-exception
            r7.printStackTrace()
        L52:
            r1.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r7 = move-exception
            r7.printStackTrace()
        L5a:
            return r0
        L5b:
            r0 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L67
            r7.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r7 = move-exception
            r7.printStackTrace()
        L67:
            r1.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r7 = move-exception
            r7.printStackTrace()
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.v.a(byte[]):t1.c");
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
        }
        return 1;
    }

    public static i c(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return i.CONNECTED;
            }
            if (i10 == 2) {
                return i.UNMETERED;
            }
            if (i10 == 3) {
                return i.NOT_ROAMING;
            }
            if (i10 == 4) {
                return i.METERED;
            }
            if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
                return i.TEMPORARILY_UNMETERED;
            }
            throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
        }
        return i.NOT_REQUIRED;
    }

    public static int d(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
        }
        return 1;
    }

    public static n e(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return n.RUNNING;
            }
            if (i10 == 2) {
                return n.SUCCEEDED;
            }
            if (i10 == 3) {
                return n.FAILED;
            }
            if (i10 == 4) {
                return n.BLOCKED;
            }
            if (i10 == 5) {
                return n.CANCELLED;
            }
            throw new IllegalArgumentException("Could not convert " + i10 + " to State");
        }
        return n.ENQUEUED;
    }

    public static int f(n nVar) {
        int ordinal = nVar.ordinal();
        if (ordinal != 0) {
            int i10 = 1;
            if (ordinal != 1) {
                i10 = 2;
                if (ordinal != 2) {
                    i10 = 3;
                    if (ordinal != 3) {
                        i10 = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + nVar + " to int");
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }
}
