package h6;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import c5.i;
import com.raouf.routerchef.R;
import java.util.LinkedHashMap;
import m4.ar0;
import m4.ep0;
import m4.px;
import m4.yf0;
import s4.aa;
import x5.b;
import y4.d1;
import y4.e1;
import y4.f1;
import z7.m;

/* loaded from: classes.dex */
public final class a implements ar0, c5.a, d1, m {

    /* renamed from: s */
    public static final int[] f5099s = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};

    /* renamed from: t */
    public static final int[] f5100t = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: u */
    public static final int[] f5101u = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};

    /* renamed from: v */
    public static final int[] f5102v = {R.attr.checkedChip, R.attr.chipSpacing, R.attr.chipSpacingHorizontal, R.attr.chipSpacingVertical, R.attr.selectionRequired, R.attr.singleLine, R.attr.singleSelection};

    /* renamed from: w */
    public static final int[] f5103w = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};

    /* renamed from: x */
    public static final int[] f5104x = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] y = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};

    /* renamed from: z */
    public static final int[] f5105z = {R.attr.behavior_autoHide};
    public static final int[] A = {R.attr.itemSpacing, R.attr.lineSpacing};
    public static final int[] B = {16843017, 16843264, R.attr.foregroundInsidePadding};
    public static final int[] C = {16843296, R.attr.simpleItemLayout, R.attr.simpleItems};
    public static final int[] D = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] E = {R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};
    public static final int[] F = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};
    public static final int[] G = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};
    public static final int[] H = {R.attr.buttonTint, R.attr.centerIfNoTextEnabled, R.attr.useMaterialThemeColors};
    public static final int[] I = {R.attr.buttonTint, R.attr.useMaterialThemeColors};
    public static final int[] J = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] K = {16843958, 16844159, R.attr.lineHeight};
    public static final int[] L = {16842804, 16844159, R.attr.lineHeight};
    public static final int[] M = {R.attr.logoAdjustViewBounds, R.attr.logoScaleType, R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};
    public static final int[] N = {R.attr.materialCircleRadius};
    public static final int[] O = {R.attr.behavior_overlapTop};
    public static final int[] P = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};
    public static final int[] Q = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};
    public static final int[] R = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] S = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] T = {16842766, 16842906, 16843039, 16843071, 16843088, 16843095, 16843098, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] U = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};
    public static final int[] V = {R.attr.adSize, R.attr.adSizes, R.attr.adUnitId};
    public static final px W = new px(1);
    public static final /* synthetic */ a X = new a();
    public static final yf0 Y = new yf0(2);
    public static final /* synthetic */ a Z = new a();

    public static int a(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        return a10 != null ? a10.data : i11;
    }

    public static int b(View view, int i10) {
        return b.b(view.getContext(), i10, view.getClass().getCanonicalName());
    }

    public static boolean e(int i10) {
        boolean z10;
        if (i10 != 0) {
            ThreadLocal<double[]> threadLocal = e0.a.f4309a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d5 = red / 255.0d;
                double pow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
                double d10 = green / 255.0d;
                double pow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                double d11 = blue / 255.0d;
                double pow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                z10 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (dArr[1] / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    public static int f(int i10, int i11, float f10) {
        return e0.a.b(e0.a.e(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static int g(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 3;
            }
            if (i10 == 3) {
                return 4;
            }
            return i10 != 4 ? 0 : 5;
        }
        return 1;
    }

    public static long i(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    public static void j(byte[] bArr, long j3, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j3);
            i11++;
            j3 >>= 8;
        }
    }

    @Override // z7.m
    public Object c() {
        return new LinkedHashMap();
    }

    @Override // c5.a
    public Object d(i iVar) {
        if (!iVar.n()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", iVar.i());
            return null;
        }
        return null;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((ep0) obj).l();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().B());
    }
}
