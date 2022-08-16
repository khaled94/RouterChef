package d0;

import com.raouf.routerchef.R;
import e0.a;
import k9.d0;
import n9.r;
import s4.bb;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class b implements d1 {

    /* renamed from: s */
    public static final float[][] f3680s = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: t */
    public static final float[][] f3681t = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: u */
    public static final float[] f3682u = {95.047f, 100.0f, 108.883f};

    /* renamed from: v */
    public static final float[][] f3683v = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: w */
    public static final int[] f3684w = {R.attr.sv_accelerate, R.attr.sv_decelerate, R.attr.sv_maxSpeed, R.attr.sv_minSpeed, R.attr.sv_speedTextColor, R.attr.sv_speedTextFormat, R.attr.sv_speedTextPadding, R.attr.sv_speedTextPosition, R.attr.sv_speedTextSize, R.attr.sv_speedTextTypeface, R.attr.sv_speedometerWidth, R.attr.sv_textColor, R.attr.sv_textRightToLeft, R.attr.sv_textSize, R.attr.sv_textTypeface, R.attr.sv_trembleDegree, R.attr.sv_trembleDuration, R.attr.sv_unit, R.attr.sv_unitSpeedInterval, R.attr.sv_unitTextColor, R.attr.sv_unitTextSize, R.attr.sv_unitUnderSpeedText, R.attr.sv_withTremble};

    /* renamed from: x */
    public static final int[] f3685x = {R.attr.sv_centerCircleColor, R.attr.sv_centerCircleRadius, R.attr.sv_sectionStyle};
    public static final int[] y = {R.attr.sv_backgroundCircleColor, R.attr.sv_cutPadding, R.attr.sv_endDegree, R.attr.sv_indicator, R.attr.sv_indicatorColor, R.attr.sv_indicatorLightColor, R.attr.sv_indicatorWidth, R.attr.sv_markColor, R.attr.sv_markHeight, R.attr.sv_markStyle, R.attr.sv_markWidth, R.attr.sv_marksNumber, R.attr.sv_marksPadding, R.attr.sv_speedometerMode, R.attr.sv_startDegree, R.attr.sv_tickNumber, R.attr.sv_tickPadding, R.attr.sv_tickRotation, R.attr.sv_tickTextFormat, R.attr.sv_withIndicatorLight};

    /* renamed from: z */
    public static final r f3686z = new r("COMPLETING_ALREADY");
    public static final r A = new r("COMPLETING_WAITING_CHILDREN");
    public static final r B = new r("COMPLETING_RETRY");
    public static final r C = new r("TOO_LATE_TO_CANCEL");
    public static final r D = new r("SEALED");
    public static final d0 E = new d0(false);
    public static final d0 F = new d0(true);
    public static final /* synthetic */ b G = new b();
    public static final String[] H = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] I = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] J = {"items"};
    public static final String[] K = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static int a(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) > 0 ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f3682u;
        return a.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static float b(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float c() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Boolean.valueOf(bb.f17745t.f17746s.zza().zza());
    }
}
