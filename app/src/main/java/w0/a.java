package w0;

import android.util.Log;
import androidx.appcompat.widget.e0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {
    public static final Charset B;
    public static final byte[] C;

    /* renamed from: v */
    public static final c[][] f19887v;

    /* renamed from: a */
    public final String f19891a;

    /* renamed from: b */
    public int f19892b;

    /* renamed from: c */
    public final HashMap<String, b>[] f19893c;

    /* renamed from: d */
    public Set<Integer> f19894d;

    /* renamed from: e */
    public ByteOrder f19895e = ByteOrder.BIG_ENDIAN;

    /* renamed from: f */
    public int f19896f;

    /* renamed from: g */
    public int f19897g;

    /* renamed from: h */
    public int f19898h;

    /* renamed from: i */
    public int f19899i;

    /* renamed from: j */
    public int f19900j;

    /* renamed from: k */
    public static final List<Integer> f19877k = Arrays.asList(1, 6, 3, 8);

    /* renamed from: l */
    public static final List<Integer> f19878l = Arrays.asList(2, 7, 4, 5);

    /* renamed from: m */
    public static final int[] f19879m = {8, 8, 8};

    /* renamed from: n */
    public static final int[] f19880n = {8};

    /* renamed from: o */
    public static final byte[] f19881o = {-1, -40, -1};
    public static final byte[] p = {79, 76, 89, 77, 80, 0};

    /* renamed from: q */
    public static final byte[] f19882q = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: r */
    public static final String[] f19883r = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: s */
    public static final int[] f19884s = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: t */
    public static final byte[] f19885t = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: u */
    public static final c f19886u = new c("StripOffsets", 273, 3);

    /* renamed from: w */
    public static final c[] f19888w = {new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: x */
    public static final HashMap<Integer, c>[] f19889x = new HashMap[10];
    public static final HashMap<String, c>[] y = new HashMap[10];

    /* renamed from: z */
    public static final HashSet<String> f19890z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    public static final HashMap<Integer, Integer> A = new HashMap<>();

    /* renamed from: w0.a$a */
    /* loaded from: classes.dex */
    public static class C0145a extends InputStream implements DataInput {

        /* renamed from: w */
        public static final ByteOrder f19901w = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: x */
        public static final ByteOrder f19902x = ByteOrder.BIG_ENDIAN;

        /* renamed from: s */
        public DataInputStream f19903s;

        /* renamed from: t */
        public ByteOrder f19904t;

        /* renamed from: u */
        public final int f19905u;

        /* renamed from: v */
        public int f19906v;

        public C0145a(InputStream inputStream) {
            this.f19904t = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f19903s = dataInputStream;
            int available = dataInputStream.available();
            this.f19905u = available;
            this.f19906v = 0;
            this.f19903s.mark(available);
        }

        public C0145a(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f19903s.available();
        }

        public final long b() {
            return readInt() & 4294967295L;
        }

        public final void c(long j3) {
            int i10 = this.f19906v;
            if (i10 > j3) {
                this.f19906v = 0;
                this.f19903s.reset();
                this.f19903s.mark(this.f19905u);
            } else {
                j3 -= i10;
            }
            int i11 = (int) j3;
            if (skipBytes(i11) == i11) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f19906v++;
            return this.f19903s.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            int read = this.f19903s.read(bArr, i10, i11);
            this.f19906v += read;
            return read;
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f19906v++;
            return this.f19903s.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            int i10 = this.f19906v + 1;
            this.f19906v = i10;
            if (i10 <= this.f19905u) {
                int read = this.f19903s.read();
                if (read < 0) {
                    throw new EOFException();
                }
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f19906v += 2;
            return this.f19903s.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            int length = this.f19906v + bArr.length;
            this.f19906v = length;
            if (length <= this.f19905u) {
                if (this.f19903s.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i10, int i11) {
            int i12 = this.f19906v + i11;
            this.f19906v = i12;
            if (i12 <= this.f19905u) {
                if (this.f19903s.read(bArr, i10, i11) != i11) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final int readInt() {
            int i10 = this.f19906v + 4;
            this.f19906v = i10;
            if (i10 <= this.f19905u) {
                int read = this.f19903s.read();
                int read2 = this.f19903s.read();
                int read3 = this.f19903s.read();
                int read4 = this.f19903s.read();
                if ((read | read2 | read3 | read4) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.f19904t;
                if (byteOrder == f19901w) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f19902x) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                StringBuilder c10 = androidx.activity.result.a.c("Invalid byte order: ");
                c10.append(this.f19904t);
                throw new IOException(c10.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            int i10 = this.f19906v + 8;
            this.f19906v = i10;
            if (i10 <= this.f19905u) {
                int read = this.f19903s.read();
                int read2 = this.f19903s.read();
                int read3 = this.f19903s.read();
                int read4 = this.f19903s.read();
                int read5 = this.f19903s.read();
                int read6 = this.f19903s.read();
                int read7 = this.f19903s.read();
                int read8 = this.f19903s.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.f19904t;
                if (byteOrder == f19901w) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f19902x) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                StringBuilder c10 = androidx.activity.result.a.c("Invalid byte order: ");
                c10.append(this.f19904t);
                throw new IOException(c10.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() {
            int i10 = this.f19906v + 2;
            this.f19906v = i10;
            if (i10 <= this.f19905u) {
                int read = this.f19903s.read();
                int read2 = this.f19903s.read();
                if ((read | read2) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.f19904t;
                if (byteOrder == f19901w) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f19902x) {
                    return (short) ((read << 8) + read2);
                }
                StringBuilder c10 = androidx.activity.result.a.c("Invalid byte order: ");
                c10.append(this.f19904t);
                throw new IOException(c10.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f19906v += 2;
            return this.f19903s.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f19906v++;
            return this.f19903s.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            int i10 = this.f19906v + 2;
            this.f19906v = i10;
            if (i10 <= this.f19905u) {
                int read = this.f19903s.read();
                int read2 = this.f19903s.read();
                if ((read | read2) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.f19904t;
                if (byteOrder == f19901w) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f19902x) {
                    return (read << 8) + read2;
                }
                StringBuilder c10 = androidx.activity.result.a.c("Invalid byte order: ");
                c10.append(this.f19904t);
                throw new IOException(c10.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i10) {
            int min = Math.min(i10, this.f19905u - this.f19906v);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f19903s.skipBytes(min - i11);
            }
            this.f19906v += i11;
            return i11;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f19907a;

        /* renamed from: b */
        public final int f19908b;

        /* renamed from: c */
        public final byte[] f19909c;

        public b(int i10, int i11, byte[] bArr) {
            this.f19907a = i10;
            this.f19908b = i11;
            this.f19909c = bArr;
        }

        public static b a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.B);
            return new b(2, bytes.length, bytes);
        }

        public static b b(long j3, ByteOrder byteOrder) {
            long[] jArr = {j3};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f19884s[4] * 1]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                wrap.putInt((int) jArr[i10]);
            }
            return new b(4, 1, wrap.array());
        }

        public static b c(d dVar, ByteOrder byteOrder) {
            d[] dVarArr = {dVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f19884s[5] * 1]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                d dVar2 = dVarArr[i10];
                wrap.putInt((int) dVar2.f19914a);
                wrap.putInt((int) dVar2.f19915b);
            }
            return new b(5, 1, wrap.array());
        }

        public static b d(int i10, ByteOrder byteOrder) {
            int[] iArr = {i10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f19884s[3] * 1]);
            wrap.order(byteOrder);
            for (int i11 = 0; i11 < 1; i11++) {
                wrap.putShort((short) iArr[i11]);
            }
            return new b(3, 1, wrap.array());
        }

        public final double e(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 != null) {
                if (h10 instanceof String) {
                    return Double.parseDouble((String) h10);
                }
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return jArr[0];
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return iArr[0];
                } else if (h10 instanceof double[]) {
                    double[] dArr = (double[]) h10;
                    if (dArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return dArr[0];
                } else if (!(h10 instanceof d[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                } else {
                    d[] dVarArr = (d[]) h10;
                    if (dVarArr.length == 1) {
                        d dVar = dVarArr[0];
                        return dVar.f19914a / dVar.f19915b;
                    }
                    throw new NumberFormatException("There are more than one component");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public final int f(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 != null) {
                if (h10 instanceof String) {
                    return Integer.parseInt((String) h10);
                }
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return (int) jArr[0];
                } else if (!(h10 instanceof int[])) {
                    throw new NumberFormatException("Couldn't find a integer value");
                } else {
                    int[] iArr = (int[]) h10;
                    if (iArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return iArr[0];
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public final String g(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                return null;
            }
            if (h10 instanceof String) {
                return (String) h10;
            }
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            if (h10 instanceof long[]) {
                long[] jArr = (long[]) h10;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h10 instanceof int[]) {
                int[] iArr = (int[]) h10;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h10 instanceof double[]) {
                double[] dArr = (double[]) h10;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(h10 instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) h10;
                while (i10 < dVarArr.length) {
                    sb.append(dVarArr[i10].f19914a);
                    sb.append('/');
                    sb.append(dVarArr[i10].f19915b);
                    i10++;
                    if (i10 != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019b: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:137:0x019b */
        /* JADX WARN: Removed duplicated region for block: B:162:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object h(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w0.a.b.h(java.nio.ByteOrder):java.lang.Object");
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("(");
            c10.append(a.f19883r[this.f19907a]);
            c10.append(", data length:");
            c10.append(this.f19909c.length);
            c10.append(")");
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f19910a;

        /* renamed from: b */
        public final String f19911b;

        /* renamed from: c */
        public final int f19912c;

        /* renamed from: d */
        public final int f19913d;

        public c(String str, int i10) {
            this.f19911b = str;
            this.f19910a = i10;
            this.f19912c = 3;
            this.f19913d = 4;
        }

        public c(String str, int i10, int i11) {
            this.f19911b = str;
            this.f19910a = i10;
            this.f19912c = i11;
            this.f19913d = -1;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final long f19914a;

        /* renamed from: b */
        public final long f19915b;

        public d(long j3, long j10) {
            if (j10 == 0) {
                this.f19914a = 0L;
                this.f19915b = 1L;
                return;
            }
            this.f19914a = j3;
            this.f19915b = j10;
        }

        public final String toString() {
            return this.f19914a + "/" + this.f19915b;
        }
    }

    static {
        c[] cVarArr;
        c[] cVarArr2 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256), new c("ImageLength", 257), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278), new c("StripByteCounts", 279), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        f19887v = new c[][]{cVarArr2, new c[]{new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962), new c("PixelYDimension", 40963), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720)}, new c[]{new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)}, new c[]{new c("InteroperabilityIndex", 1, 2)}, new c[]{new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256), new c("ThumbnailImageLength", 257), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278), new c("StripByteCounts", 279), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720)}, cVarArr2, new c[]{new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)}, new c[]{new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)}, new c[]{new c("AspectFrame", 4371, 3)}, new c[]{new c("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        B = forName;
        C = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            c[][] cVarArr3 = f19887v;
            if (i10 >= cVarArr3.length) {
                HashMap<Integer, Integer> hashMap = A;
                c[] cVarArr4 = f19888w;
                hashMap.put(Integer.valueOf(cVarArr4[0].f19910a), 5);
                hashMap.put(Integer.valueOf(cVarArr4[1].f19910a), 1);
                hashMap.put(Integer.valueOf(cVarArr4[2].f19910a), 2);
                hashMap.put(Integer.valueOf(cVarArr4[3].f19910a), 3);
                hashMap.put(Integer.valueOf(cVarArr4[4].f19910a), 7);
                hashMap.put(Integer.valueOf(cVarArr4[5].f19910a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f19889x[i10] = new HashMap<>();
            y[i10] = new HashMap<>();
            for (c cVar : cVarArr3[i10]) {
                f19889x[i10].put(Integer.valueOf(cVar.f19910a), cVar);
                y[i10].put(cVar.f19911b, cVar);
            }
            i10++;
        }
    }

    public a(String str) {
        Throwable th;
        c[][] cVarArr = f19887v;
        this.f19893c = new HashMap[cVarArr.length];
        this.f19894d = new HashSet(cVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f19891a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    m(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (RuntimeException e11) {
                            throw e11;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    public static long[] b(Object obj) {
        if (!(obj instanceof int[])) {
            if (!(obj instanceof long[])) {
                return null;
            }
            return (long[]) obj;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public final void a() {
        String c10 = c("DateTimeOriginal");
        if (c10 != null && c("DateTime") == null) {
            this.f19893c[0].put("DateTime", b.a(c10));
        }
        if (c("ImageWidth") == null) {
            this.f19893c[0].put("ImageWidth", b.b(0L, this.f19895e));
        }
        if (c("ImageLength") == null) {
            this.f19893c[0].put("ImageLength", b.b(0L, this.f19895e));
        }
        if (c("Orientation") == null) {
            this.f19893c[0].put("Orientation", b.b(0L, this.f19895e));
        }
        if (c("LightSource") == null) {
            this.f19893c[1].put("LightSource", b.b(0L, this.f19895e));
        }
    }

    public final String c(String str) {
        String str2;
        b d5 = d(str);
        if (d5 != null) {
            if (!f19890z.contains(str)) {
                return d5.g(this.f19895e);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = d5.f19907a;
                if (i10 == 5 || i10 == 10) {
                    d[] dVarArr = (d[]) d5.h(this.f19895e);
                    if (dVarArr != null && dVarArr.length == 3) {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].f19914a) / ((float) dVarArr[0].f19915b))), Integer.valueOf((int) (((float) dVarArr[1].f19914a) / ((float) dVarArr[1].f19915b))), Integer.valueOf((int) (((float) dVarArr[2].f19914a) / ((float) dVarArr[2].f19915b))));
                    }
                    StringBuilder c10 = androidx.activity.result.a.c("Invalid GPS Timestamp array. array=");
                    c10.append(Arrays.toString(dVarArr));
                    str2 = c10.toString();
                } else {
                    StringBuilder c11 = androidx.activity.result.a.c("GPS Timestamp format is not rational. format=");
                    c11.append(d5.f19907a);
                    str2 = c11.toString();
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(d5.e(this.f19895e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f19887v.length; i10++) {
            b bVar = this.f19893c[i10].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
        r10.f19904t = r9.f19895e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011e, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(w0.a.C0145a r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.e(w0.a$a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) {
        boolean z10;
        boolean z11;
        boolean z12;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f19881o;
            z10 = true;
            if (i10 >= bArr2.length) {
                z11 = true;
                break;
            } else if (bArr[i10] != bArr2[i10]) {
                z11 = false;
                break;
            } else {
                i10++;
            }
        }
        if (z11) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i11 = 0;
        while (true) {
            if (i11 >= bytes.length) {
                z12 = true;
                break;
            } else if (bArr[i11] != bytes[i11]) {
                z12 = false;
                break;
            } else {
                i11++;
            }
        }
        if (z12) {
            return 9;
        }
        C0145a c0145a = new C0145a(bArr);
        ByteOrder o10 = o(c0145a);
        this.f19895e = o10;
        c0145a.f19904t = o10;
        short readShort = c0145a.readShort();
        c0145a.close();
        if (readShort == 20306 || readShort == 21330) {
            return 7;
        }
        C0145a c0145a2 = new C0145a(bArr);
        ByteOrder o11 = o(c0145a2);
        this.f19895e = o11;
        c0145a2.f19904t = o11;
        short readShort2 = c0145a2.readShort();
        c0145a2.close();
        if (readShort2 != 85) {
            z10 = false;
        }
        return z10 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(w0.a.C0145a r7) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.g(w0.a$a):void");
    }

    public final void h(C0145a c0145a) {
        c0145a.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c0145a.read(bArr);
        c0145a.skipBytes(4);
        c0145a.read(bArr2);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        e(c0145a, i10, 5);
        c0145a.c(i11);
        c0145a.f19904t = ByteOrder.BIG_ENDIAN;
        int readInt = c0145a.readInt();
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = c0145a.readUnsignedShort();
            int readUnsignedShort2 = c0145a.readUnsignedShort();
            if (readUnsignedShort == f19886u.f19910a) {
                short readShort = c0145a.readShort();
                short readShort2 = c0145a.readShort();
                b d5 = b.d(readShort, this.f19895e);
                b d10 = b.d(readShort2, this.f19895e);
                this.f19893c[0].put("ImageLength", d5);
                this.f19893c[0].put("ImageWidth", d10);
                return;
            }
            c0145a.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(C0145a c0145a) {
        b bVar;
        n(c0145a, c0145a.available());
        p(c0145a, 0);
        s(c0145a, 0);
        s(c0145a, 5);
        s(c0145a, 4);
        r(0, 5);
        r(0, 4);
        r(5, 4);
        b bVar2 = this.f19893c[1].get("PixelXDimension");
        b bVar3 = this.f19893c[1].get("PixelYDimension");
        if (bVar2 != null && bVar3 != null) {
            this.f19893c[0].put("ImageWidth", bVar2);
            this.f19893c[0].put("ImageLength", bVar3);
        }
        if (this.f19893c[4].isEmpty() && l(this.f19893c[5])) {
            HashMap<String, b>[] hashMapArr = this.f19893c;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!l(this.f19893c[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.f19892b != 8 || (bVar = this.f19893c[1].get("MakerNote")) == null) {
            return;
        }
        C0145a c0145a2 = new C0145a(bVar.f19909c);
        c0145a2.f19904t = this.f19895e;
        c0145a2.c(6L);
        p(c0145a2, 9);
        b bVar4 = this.f19893c[9].get("ColorSpace");
        if (bVar4 == null) {
            return;
        }
        this.f19893c[1].put("ColorSpace", bVar4);
    }

    public final void j(C0145a c0145a) {
        i(c0145a);
        if (this.f19893c[0].get("JpgFromRaw") != null) {
            e(c0145a, this.f19900j, 5);
        }
        b bVar = this.f19893c[0].get("ISO");
        b bVar2 = this.f19893c[1].get("PhotographicSensitivity");
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.f19893c[1].put("PhotographicSensitivity", bVar);
    }

    public final void k(C0145a c0145a, HashMap hashMap) {
        int i10;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int f10 = bVar.f(this.f19895e);
        int min = Math.min(bVar2.f(this.f19895e), c0145a.available() - f10);
        int i11 = this.f19892b;
        if (i11 != 4 && i11 != 9 && i11 != 10) {
            if (i11 == 7) {
                i10 = this.f19897g;
            }
            if (f10 <= 0 || min <= 0 || this.f19891a != null) {
                return;
            }
            c0145a.c(f10);
            c0145a.readFully(new byte[min]);
            return;
        }
        i10 = this.f19896f;
        f10 += i10;
        if (f10 <= 0) {
        }
    }

    public final boolean l(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.f(this.f19895e) <= 512 && bVar2.f(this.f19895e) <= 512;
    }

    public final void m(InputStream inputStream) {
        for (int i10 = 0; i10 < f19887v.length; i10++) {
            try {
                this.f19893c[i10] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f19892b = f(bufferedInputStream);
        C0145a c0145a = new C0145a(bufferedInputStream);
        switch (this.f19892b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                i(c0145a);
                break;
            case 4:
                e(c0145a, 0, 0);
                break;
            case 7:
                g(c0145a);
                break;
            case 9:
                h(c0145a);
                break;
            case 10:
                j(c0145a);
                break;
        }
        q(c0145a);
        a();
    }

    public final void n(C0145a c0145a, int i10) {
        ByteOrder o10 = o(c0145a);
        this.f19895e = o10;
        c0145a.f19904t = o10;
        int readUnsignedShort = c0145a.readUnsignedShort();
        int i11 = this.f19892b;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            StringBuilder c10 = androidx.activity.result.a.c("Invalid start code: ");
            c10.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(c10.toString());
        }
        int readInt = c0145a.readInt();
        if (readInt < 8 || readInt >= i10) {
            throw new IOException(e0.a("Invalid first Ifd offset: ", readInt));
        }
        int i12 = readInt - 8;
        if (i12 > 0 && c0145a.skipBytes(i12) != i12) {
            throw new IOException(e0.a("Couldn't jump to first Ifd: ", i12));
        }
    }

    public final ByteOrder o(C0145a c0145a) {
        short readShort = c0145a.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder c10 = androidx.activity.result.a.c("Invalid byte order: ");
            c10.append(Integer.toHexString(readShort));
            throw new IOException(c10.toString());
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(w0.a.C0145a r23, int r24) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.p(w0.a$a, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (java.util.Arrays.equals(r1, w0.a.f19880n) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (java.util.Arrays.equals(r1, r5) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(w0.a.C0145a r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.q(w0.a$a):void");
    }

    public final void r(int i10, int i11) {
        if (this.f19893c[i10].isEmpty() || this.f19893c[i11].isEmpty()) {
            return;
        }
        b bVar = this.f19893c[i10].get("ImageLength");
        b bVar2 = this.f19893c[i10].get("ImageWidth");
        b bVar3 = this.f19893c[i11].get("ImageLength");
        b bVar4 = this.f19893c[i11].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int f10 = bVar.f(this.f19895e);
        int f11 = bVar2.f(this.f19895e);
        int f12 = bVar3.f(this.f19895e);
        int f13 = bVar4.f(this.f19895e);
        if (f10 >= f12 || f11 >= f13) {
            return;
        }
        HashMap<String, b>[] hashMapArr = this.f19893c;
        HashMap<String, b> hashMap = hashMapArr[i10];
        hashMapArr[i10] = hashMapArr[i11];
        hashMapArr[i11] = hashMap;
    }

    public final void s(C0145a c0145a, int i10) {
        b bVar;
        StringBuilder sb;
        String str;
        b bVar2;
        b bVar3;
        b bVar4 = this.f19893c[i10].get("DefaultCropSize");
        b bVar5 = this.f19893c[i10].get("SensorTopBorder");
        b bVar6 = this.f19893c[i10].get("SensorLeftBorder");
        b bVar7 = this.f19893c[i10].get("SensorBottomBorder");
        b bVar8 = this.f19893c[i10].get("SensorRightBorder");
        if (bVar4 == null) {
            if (bVar5 == null || bVar6 == null || bVar7 == null || bVar8 == null) {
                b bVar9 = this.f19893c[i10].get("ImageLength");
                b bVar10 = this.f19893c[i10].get("ImageWidth");
                if ((bVar9 != null && bVar10 != null) || (bVar = this.f19893c[i10].get("JPEGInterchangeFormat")) == null) {
                    return;
                }
                e(c0145a, bVar.f(this.f19895e), i10);
                return;
            }
            int f10 = bVar5.f(this.f19895e);
            int f11 = bVar7.f(this.f19895e);
            int f12 = bVar8.f(this.f19895e);
            int f13 = bVar6.f(this.f19895e);
            if (f11 <= f10 || f12 <= f13) {
                return;
            }
            b d5 = b.d(f11 - f10, this.f19895e);
            b d10 = b.d(f12 - f13, this.f19895e);
            this.f19893c[i10].put("ImageLength", d5);
            this.f19893c[i10].put("ImageWidth", d10);
        } else if (bVar4.f19907a == 5) {
            d[] dVarArr = (d[]) bVar4.h(this.f19895e);
            if (dVarArr == null || dVarArr.length != 2) {
                sb = androidx.activity.result.a.c("Invalid crop size values. cropSize=");
                str = Arrays.toString(dVarArr);
                sb.append(str);
                Log.w("ExifInterface", sb.toString());
                return;
            }
            bVar3 = b.c(dVarArr[0], this.f19895e);
            bVar2 = b.c(dVarArr[1], this.f19895e);
            this.f19893c[i10].put("ImageWidth", bVar3);
            this.f19893c[i10].put("ImageLength", bVar2);
        } else {
            int[] iArr = (int[]) bVar4.h(this.f19895e);
            if (iArr == null || iArr.length != 2) {
                sb = androidx.activity.result.a.c("Invalid crop size values. cropSize=");
                str = Arrays.toString(iArr);
                sb.append(str);
                Log.w("ExifInterface", sb.toString());
                return;
            }
            bVar3 = b.d(iArr[0], this.f19895e);
            bVar2 = b.d(iArr[1], this.f19895e);
            this.f19893c[i10].put("ImageWidth", bVar3);
            this.f19893c[i10].put("ImageLength", bVar2);
        }
    }
}
