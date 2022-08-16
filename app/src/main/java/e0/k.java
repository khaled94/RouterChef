package e0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import d0.e;
import j0.n;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends l {
    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // e0.l
    public final Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        e.d[] dVarArr;
        try {
            FontFamily.Builder builder = null;
            for (e.d dVar : cVar.f3691a) {
                try {
                    Font build = new Font.Builder(resources, dVar.f3697f).setWeight(dVar.f3693b).setSlant(dVar.f3694c ? 1 : 0).setTtcIndex(dVar.f3696e).setFontVariationSettings(dVar.f3695d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // e0.l
    public final Typeface b(Context context, n[] nVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (n nVar : nVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(nVar.f5416a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(nVar.f5418c).setSlant(nVar.f5419d ? 1 : 0).setTtcIndex(nVar.f5417b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // e0.l
    public final Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // e0.l
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // e0.l
    public final n f(n[] nVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font g(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int h10 = h(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int h11 = h(fontStyle, font2.getStyle());
            if (h11 < h10) {
                font = font2;
                h10 = h11;
            }
        }
        return font;
    }
}
