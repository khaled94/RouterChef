package x9;

import ca.f;
import ca.i;
import ca.o;
import ca.t;
import ca.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import x9.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final x9.b[] f20114a;

    /* renamed from: b */
    public static final Map<i, Integer> f20115b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b */
        public final t f20117b;

        /* renamed from: a */
        public final List<x9.b> f20116a = new ArrayList();

        /* renamed from: e */
        public x9.b[] f20120e = new x9.b[8];

        /* renamed from: f */
        public int f20121f = 7;

        /* renamed from: g */
        public int f20122g = 0;

        /* renamed from: h */
        public int f20123h = 0;

        /* renamed from: c */
        public final int f20118c = 4096;

        /* renamed from: d */
        public int f20119d = 4096;

        public a(y yVar) {
            Logger logger = o.f2862a;
            this.f20117b = new t(yVar);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f20120e.length;
                while (true) {
                    length--;
                    i11 = this.f20121f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    x9.b[] bVarArr = this.f20120e;
                    i10 -= bVarArr[length].f20113c;
                    this.f20123h -= bVarArr[length].f20113c;
                    this.f20122g--;
                    i12++;
                }
                x9.b[] bVarArr2 = this.f20120e;
                System.arraycopy(bVarArr2, i11 + 1, bVarArr2, i11 + 1 + i12, this.f20122g);
                this.f20121f += i12;
            }
            return i12;
        }

        public final i b(int i10) {
            x9.b bVar;
            if (i10 >= 0 && i10 <= c.f20114a.length - 1) {
                bVar = c.f20114a[i10];
            } else {
                int length = this.f20121f + 1 + (i10 - c.f20114a.length);
                if (length >= 0) {
                    x9.b[] bVarArr = this.f20120e;
                    if (length < bVarArr.length) {
                        bVar = bVarArr[length];
                    }
                }
                StringBuilder c10 = androidx.activity.result.a.c("Header index too large ");
                c10.append(i10 + 1);
                throw new IOException(c10.toString());
            }
            return bVar.f20111a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<x9.b>, java.util.ArrayList] */
        public final void c(x9.b bVar) {
            this.f20116a.add(bVar);
            int i10 = bVar.f20113c;
            int i11 = this.f20119d;
            if (i10 > i11) {
                Arrays.fill(this.f20120e, (Object) null);
                this.f20121f = this.f20120e.length - 1;
                this.f20122g = 0;
                this.f20123h = 0;
                return;
            }
            a((this.f20123h + i10) - i11);
            int i12 = this.f20122g + 1;
            x9.b[] bVarArr = this.f20120e;
            if (i12 > bVarArr.length) {
                x9.b[] bVarArr2 = new x9.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f20121f = this.f20120e.length - 1;
                this.f20120e = bVarArr2;
            }
            int i13 = this.f20121f;
            this.f20121f = i13 - 1;
            this.f20120e[i13] = bVar;
            this.f20122g++;
            this.f20123h += i10;
        }

        public final i d() {
            int readByte = this.f20117b.readByte() & 255;
            boolean z10 = (readByte & 128) == 128;
            int e10 = e(readByte, 127);
            if (z10) {
                s sVar = s.f20232d;
                t tVar = this.f20117b;
                long j3 = e10;
                tVar.c0(j3);
                byte[] m02 = tVar.f2874s.m0(j3);
                Objects.requireNonNull(sVar);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i10 = 0;
                s.a aVar = sVar.f20233a;
                int i11 = 0;
                for (byte b10 : m02) {
                    i11 = (i11 << 8) | (b10 & 255);
                    i10 += 8;
                    while (i10 >= 8) {
                        int i12 = i10 - 8;
                        aVar = aVar.f20234a[(i11 >>> i12) & 255];
                        if (aVar.f20234a == null) {
                            byteArrayOutputStream.write(aVar.f20235b);
                            i10 -= aVar.f20236c;
                            aVar = sVar.f20233a;
                        } else {
                            i10 = i12;
                        }
                    }
                }
                while (i10 > 0) {
                    s.a aVar2 = aVar.f20234a[(i11 << (8 - i10)) & 255];
                    if (aVar2.f20234a != null || aVar2.f20236c > i10) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar2.f20235b);
                    i10 -= aVar2.f20236c;
                    aVar = sVar.f20233a;
                }
                return i.k(byteArrayOutputStream.toByteArray());
            }
            return this.f20117b.m(e10);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int readByte = this.f20117b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i11 + (readByte << i13);
                }
                i11 += (readByte & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final f f20124a;

        /* renamed from: c */
        public boolean f20126c;

        /* renamed from: b */
        public int f20125b = Integer.MAX_VALUE;

        /* renamed from: e */
        public x9.b[] f20128e = new x9.b[8];

        /* renamed from: f */
        public int f20129f = 7;

        /* renamed from: g */
        public int f20130g = 0;

        /* renamed from: h */
        public int f20131h = 0;

        /* renamed from: d */
        public int f20127d = 4096;

        public b(f fVar) {
            this.f20124a = fVar;
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f20128e.length;
                while (true) {
                    length--;
                    i11 = this.f20129f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    x9.b[] bVarArr = this.f20128e;
                    i10 -= bVarArr[length].f20113c;
                    this.f20131h -= bVarArr[length].f20113c;
                    this.f20130g--;
                    i12++;
                }
                x9.b[] bVarArr2 = this.f20128e;
                System.arraycopy(bVarArr2, i11 + 1, bVarArr2, i11 + 1 + i12, this.f20130g);
                x9.b[] bVarArr3 = this.f20128e;
                int i13 = this.f20129f;
                Arrays.fill(bVarArr3, i13 + 1, i13 + 1 + i12, (Object) null);
                this.f20129f += i12;
            }
            return i12;
        }

        public final void b(x9.b bVar) {
            int i10 = bVar.f20113c;
            int i11 = this.f20127d;
            if (i10 > i11) {
                Arrays.fill(this.f20128e, (Object) null);
                this.f20129f = this.f20128e.length - 1;
                this.f20130g = 0;
                this.f20131h = 0;
                return;
            }
            a((this.f20131h + i10) - i11);
            int i12 = this.f20130g + 1;
            x9.b[] bVarArr = this.f20128e;
            if (i12 > bVarArr.length) {
                x9.b[] bVarArr2 = new x9.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f20129f = this.f20128e.length - 1;
                this.f20128e = bVarArr2;
            }
            int i13 = this.f20129f;
            this.f20129f = i13 - 1;
            this.f20128e[i13] = bVar;
            this.f20130g++;
            this.f20131h += i10;
        }

        public final void c(int i10) {
            int min = Math.min(i10, 16384);
            int i11 = this.f20127d;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f20125b = Math.min(this.f20125b, min);
            }
            this.f20126c = true;
            this.f20127d = min;
            int i12 = this.f20131h;
            if (min >= i12) {
                return;
            }
            if (min == 0) {
                Arrays.fill(this.f20128e, (Object) null);
                this.f20129f = this.f20128e.length - 1;
                this.f20130g = 0;
                this.f20131h = 0;
                return;
            }
            a(i12 - min);
        }

        public final void d(i iVar) {
            Objects.requireNonNull(s.f20232d);
            long j3 = 0;
            int i10 = 0;
            long j10 = 0;
            for (int i11 = 0; i11 < iVar.n(); i11++) {
                j10 += s.f20231c[iVar.i(i11) & 255];
            }
            if (((int) ((j10 + 7) >> 3)) < iVar.n()) {
                f fVar = new f();
                Objects.requireNonNull(s.f20232d);
                byte b10 = 0;
                while (i10 < iVar.n()) {
                    int i12 = iVar.i(i10) & 255;
                    int i13 = s.f20230b[i12];
                    byte b11 = s.f20231c[i12];
                    j3 = (j3 << b11) | i13;
                    int i14 = b10 + b11;
                    while (i14 >= 8) {
                        i14 = (i14 == 1 ? 1 : 0) - 8;
                        fVar.z((int) (j3 >> i14));
                    }
                    i10++;
                    b10 = i14;
                }
                if (b10 > 0) {
                    fVar.z((int) ((j3 << (8 - b10)) | (255 >>> b10)));
                }
                iVar = fVar.n0();
                f(iVar.f2847s.length, 127, 128);
            } else {
                f(iVar.n(), 127, 0);
            }
            this.f20124a.x0(iVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(java.util.List<x9.b> r13) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x9.c.b.e(java.util.List):void");
        }

        public final void f(int i10, int i11, int i12) {
            int i13;
            f fVar;
            if (i10 < i11) {
                fVar = this.f20124a;
                i13 = i10 | i12;
            } else {
                this.f20124a.B0(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f20124a.B0(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                fVar = this.f20124a;
            }
            fVar.B0(i13);
        }
    }

    static {
        x9.b bVar = new x9.b(x9.b.f20110i, "");
        int i10 = 0;
        i iVar = x9.b.f20107f;
        i iVar2 = x9.b.f20108g;
        i iVar3 = x9.b.f20109h;
        i iVar4 = x9.b.f20106e;
        x9.b[] bVarArr = {bVar, new x9.b(iVar, "GET"), new x9.b(iVar, "POST"), new x9.b(iVar2, "/"), new x9.b(iVar2, "/index.html"), new x9.b(iVar3, "http"), new x9.b(iVar3, "https"), new x9.b(iVar4, "200"), new x9.b(iVar4, "204"), new x9.b(iVar4, "206"), new x9.b(iVar4, "304"), new x9.b(iVar4, "400"), new x9.b(iVar4, "404"), new x9.b(iVar4, "500"), new x9.b("accept-charset", ""), new x9.b("accept-encoding", "gzip, deflate"), new x9.b("accept-language", ""), new x9.b("accept-ranges", ""), new x9.b("accept", ""), new x9.b("access-control-allow-origin", ""), new x9.b("age", ""), new x9.b("allow", ""), new x9.b("authorization", ""), new x9.b("cache-control", ""), new x9.b("content-disposition", ""), new x9.b("content-encoding", ""), new x9.b("content-language", ""), new x9.b("content-length", ""), new x9.b("content-location", ""), new x9.b("content-range", ""), new x9.b("content-type", ""), new x9.b("cookie", ""), new x9.b("date", ""), new x9.b("etag", ""), new x9.b("expect", ""), new x9.b("expires", ""), new x9.b("from", ""), new x9.b("host", ""), new x9.b("if-match", ""), new x9.b("if-modified-since", ""), new x9.b("if-none-match", ""), new x9.b("if-range", ""), new x9.b("if-unmodified-since", ""), new x9.b("last-modified", ""), new x9.b("link", ""), new x9.b("location", ""), new x9.b("max-forwards", ""), new x9.b("proxy-authenticate", ""), new x9.b("proxy-authorization", ""), new x9.b("range", ""), new x9.b("referer", ""), new x9.b("refresh", ""), new x9.b("retry-after", ""), new x9.b("server", ""), new x9.b("set-cookie", ""), new x9.b("strict-transport-security", ""), new x9.b("transfer-encoding", ""), new x9.b("user-agent", ""), new x9.b("vary", ""), new x9.b("via", ""), new x9.b("www-authenticate", "")};
        f20114a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        while (true) {
            x9.b[] bVarArr2 = f20114a;
            if (i10 >= bVarArr2.length) {
                f20115b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
            if (!linkedHashMap.containsKey(bVarArr2[i10].f20111a)) {
                linkedHashMap.put(bVarArr2[i10].f20111a, Integer.valueOf(i10));
            }
            i10++;
        }
    }

    public static i a(i iVar) {
        int n10 = iVar.n();
        for (int i10 = 0; i10 < n10; i10++) {
            byte i11 = iVar.i(i10);
            if (i11 >= 65 && i11 <= 90) {
                StringBuilder c10 = androidx.activity.result.a.c("PROTOCOL_ERROR response malformed: mixed case name: ");
                c10.append(iVar.q());
                throw new IOException(c10.toString());
            }
        }
        return iVar;
    }
}
