package a6;

import com.raouf.routerchef.R;
import java.security.Provider;
import java.security.Signature;
import l3.s;
import m3.p;
import m4.ai2;
import m4.ar0;
import m4.c31;
import m4.cn;
import m4.es;
import m4.h1;
import m4.i71;
import m4.ic;
import m4.ip2;
import m4.j51;
import m4.j71;
import m4.jc;
import m4.jo;
import m4.jp2;
import m4.k00;
import m4.kz1;
import m4.o72;
import m4.oo0;
import m4.q40;
import m4.tt;
import m4.uc;
import m4.uo2;
import n3.c0;
import n3.f0;
import n3.g1;
import n9.r;
import org.json.JSONObject;
import s4.ub;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public class f implements h1, jc, k00, o72, f0, kz1, ai2, ar0, d1 {

    /* renamed from: s */
    public static final int[] f184s = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* renamed from: t */
    public static final int[] f185t = {16842931};

    /* renamed from: u */
    public static final int[] f186u = {16843071};

    /* renamed from: v */
    public static final int[] f187v = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* renamed from: w */
    public static final int[] f188w = {16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};

    /* renamed from: x */
    public static final int[] f189x = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};
    public static final int[] y = {16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};

    /* renamed from: z */
    public static final int[] f190z = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};
    public static final int[] A = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] B = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};
    public static final int[] C = {R.attr.allowStacking};
    public static final int[] D = {16843016, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};
    public static final int[] E = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
    public static final int[] F = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};
    public static final int[] G = {16843436, 16843437};
    public static final int[] H = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
    public static final int[] I = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] J = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
    public static final int[] K = {16843126, 16843465, R.attr.overlapAnchor};
    public static final int[] L = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
    public static final int[] M = {16842970, 16843039, 16843296, 16843364, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};
    public static final int[] N = {16842930, 16843126, 16843131, 16843362, R.attr.popupTheme};
    public static final int[] O = {16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode};
    public static final int[] P = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] Q = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] R = {16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
    public static final int[] S = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};
    public static final int[] T = {16842960, 16842994, 16842995};
    public static final /* synthetic */ f U = new f();
    public static final r V = new r("NO_DECISION");
    public static final /* synthetic */ f W = new f();

    public /* synthetic */ f() {
    }

    public static cn i(Throwable th) {
        if (th instanceof i71) {
            i71 i71Var = (i71) th;
            return m(i71Var.f6719s, i71Var.f9551t);
        } else if (th instanceof c31) {
            if (th.getMessage() == null) {
                return n(((c31) th).f6719s, null, null);
            }
            return n(((c31) th).f6719s, th.getMessage(), null);
        } else if (!(th instanceof c0)) {
            return n(1, null, null);
        } else {
            c0 c0Var = (c0) th;
            return new cn(c0Var.f16450s, q40.i(c0Var.getMessage()), "com.google.android.gms.ads", null, null);
        }
    }

    public static void k(String str) {
        if (tt.f14163a.e().booleanValue()) {
            g1.e(str);
        }
    }

    public static cn l(Throwable th, j71 j71Var) {
        cn cnVar;
        cn i10 = i(th);
        int i11 = i10.f7067s;
        if ((i11 == 3 || i11 == 0) && (cnVar = i10.f7070v) != null && !cnVar.f7069u.equals("com.google.android.gms.ads")) {
            i10.f7070v = null;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8226w5)).booleanValue() && j71Var != null) {
            i10.f7071w = new oo0(j71Var.f9866d, "", j71Var, j71Var.f9865c);
        }
        return i10;
    }

    public static cn m(int i10, cn cnVar) {
        if (i10 != 0) {
            if (i10 == 8) {
                if (((Integer) jo.f10145d.f10148c.a(es.f8202t5)).intValue() > 0) {
                    return cnVar;
                }
                i10 = 8;
            }
            return n(i10, null, cnVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static cn n(int i10, String str, cn cnVar) {
        int i11;
        String str2;
        if (str == null) {
            int i12 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            switch (i12) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    str = "No fill.";
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) jo.f10145d.f10148c.a(es.f8233x5)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    str = "No fill.";
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        int i13 = i10 - 1;
        if (i10 != 0) {
            int i14 = 0;
            switch (i13) {
                case 0:
                case 11:
                case 15:
                    break;
                case 1:
                case 5:
                case 6:
                case 9:
                case 16:
                    i14 = 1;
                    break;
                case 2:
                case 10:
                case 18:
                    i14 = 3;
                    break;
                case 3:
                    i11 = 8;
                    i14 = i11;
                    break;
                case 4:
                case 8:
                case 17:
                    i14 = 2;
                    break;
                case 7:
                    i11 = 4;
                    i14 = i11;
                    break;
                case 12:
                    if (((Integer) jo.f10145d.f10148c.a(es.f8233x5)).intValue() <= 0) {
                        i11 = 9;
                        i14 = i11;
                        break;
                    }
                    i14 = 3;
                    break;
                case 13:
                    i11 = 10;
                    i14 = i11;
                    break;
                case 14:
                    i11 = 11;
                    i14 = i11;
                    break;
                default:
                    switch (i10) {
                        case 1:
                            str2 = "INTERNAL_ERROR";
                            break;
                        case 2:
                            str2 = "INVALID_REQUEST";
                            break;
                        case 3:
                            str2 = "NO_FILL";
                            break;
                        case 4:
                            str2 = "APP_ID_MISSING";
                            break;
                        case 5:
                            str2 = "NETWORK_ERROR";
                            break;
                        case 6:
                            str2 = "INVALID_AD_UNIT_ID";
                            break;
                        case 7:
                            str2 = "INVALID_AD_SIZE";
                            break;
                        case 8:
                            str2 = "MEDIATION_SHOW_ERROR";
                            break;
                        case 9:
                            str2 = "NOT_READY";
                            break;
                        case 10:
                            str2 = "AD_REUSED";
                            break;
                        case 11:
                            str2 = "APP_NOT_FOREGROUND";
                            break;
                        case 12:
                            str2 = "INTERNAL_SHOW_ERROR";
                            break;
                        case 13:
                            str2 = "MEDIATION_NO_FILL";
                            break;
                        case 14:
                            str2 = "REQUEST_ID_MISMATCH";
                            break;
                        case 15:
                            str2 = "INVALID_AD_STRING";
                            break;
                        case 16:
                            str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                            break;
                        case 17:
                            str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                            break;
                        case 18:
                            str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                            break;
                        default:
                            str2 = "AD_INSPECTOR_ALREADY_OPEN";
                            break;
                    }
                    throw new AssertionError("Unknown SdkError: ".concat(str2));
            }
            return new cn(i14, str3, "com.google.android.gms.ads", cnVar, null);
        }
        throw null;
    }

    @Override // m4.k00, m4.kz1
    public JSONObject a(Object obj) {
        j51 j51Var = (j51) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", j51Var.f9853c.f12699b);
        jSONObject2.put("signals", j51Var.f9852b);
        jSONObject3.put("body", j51Var.f9851a.f11425c);
        jSONObject3.put("headers", s.B.f5789c.F(j51Var.f9851a.f11424b));
        jSONObject3.put("response_code", j51Var.f9851a.f11423a);
        jSONObject3.put("latency", j51Var.f9851a.f11426d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", j51Var.f9853c.f12705h);
        return jSONObject;
    }

    @Override // m4.h1
    public jp2 b() {
        return new ip2(-9223372036854775807L, 0L);
    }

    @Override // m4.h1
    public long c(uo2 uo2Var) {
        return -1L;
    }

    @Override // m4.h1
    public void d(long j3) {
    }

    @Override // m4.o72
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // m4.kz1
    public void f(Throwable th) {
    }

    public void g(float f10, float f11, float f12, l lVar) {
        lVar.e(f10, 0.0f);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((p) obj).b();
    }

    @Override // m4.jc, y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Boolean.valueOf(ub.f18143t.f18144s.zza().zza());
    }

    @Override // m4.jc, y4.d1
    /* renamed from: zza */
    public ic[] mo14zza() {
        return new ic[]{new uc()};
    }

    public /* synthetic */ f(Object obj) {
    }
}
