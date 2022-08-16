package y4;

import a0.a;
import a6.d;
import android.content.Context;
import androidx.appcompat.widget.p;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import b7.c;
import e1.h;
import e1.j;
import e5.i;
import e9.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l0.g;
import l4.b;
import m4.b10;
import m4.cg2;
import m4.g7;
import m4.k2;
import m4.ns0;
import m4.os0;
import m4.qr0;
import m4.rl1;
import m4.ss0;
import s4.f5;
import s4.x4;

/* loaded from: classes.dex */
public final class f1 {
    public static final e1<Boolean> K;
    public static final e1<Double> O;
    public static final e1<Boolean> S;
    public static final e1<Boolean> T;
    public static final e1<Boolean> U;
    public static final e1<Boolean> V;
    public static final e1<Boolean> W;
    public static final e1<Boolean> X;
    public static final e1<Boolean> Y;
    public static final e1<Boolean> Z;

    /* renamed from: a0 */
    public static final e1<Boolean> f20398a0;

    /* renamed from: b0 */
    public static final e1<Boolean> f20400b0;

    /* renamed from: c0 */
    public static final e1<Boolean> f20402c0;

    /* renamed from: d0 */
    public static final e1<Boolean> f20404d0;

    /* renamed from: e0 */
    public static final e1<Boolean> f20406e0;

    /* renamed from: f0 */
    public static final e1<Boolean> f20408f0;

    /* renamed from: g0 */
    public static final e1<Boolean> f20410g0;

    /* renamed from: h0 */
    public static final e1<Boolean> f20412h0;

    /* renamed from: i0 */
    public static final e1<Boolean> f20414i0;

    /* renamed from: j0 */
    public static final e1<Boolean> f20416j0;

    /* renamed from: k0 */
    public static final e1<Boolean> f20418k0;

    /* renamed from: l0 */
    public static final e1<Boolean> f20420l0;

    /* renamed from: m0 */
    public static final e1<Boolean> f20422m0;

    /* renamed from: o0 */
    public static final e1<Boolean> f20426o0;

    /* renamed from: p0 */
    public static final e1<Boolean> f20427p0;

    /* renamed from: q0 */
    public static final e1<Boolean> f20429q0;

    /* renamed from: r0 */
    public static final e1<Boolean> f20431r0;

    /* renamed from: s0 */
    public static final e1<Boolean> f20433s0;

    /* renamed from: t0 */
    public static final e1<Boolean> f20435t0;

    /* renamed from: u0 */
    public static final e1<Boolean> f20437u0;

    /* renamed from: v0 */
    public static final e1<Boolean> f20439v0;

    /* renamed from: w0 */
    public static final e1<Boolean> f20441w0;

    /* renamed from: a */
    public static final List<e1<?>> f20397a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static final e1<Long> f20399b = a("measurement.ad_id_cache_time", 10000L, 10000L, a.A);

    /* renamed from: c */
    public static final e1<Long> f20401c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, c.f2596t);

    /* renamed from: d */
    public static final e1<Long> f20403d = a("measurement.config.cache_time", 86400000L, 3600000L, g7.f8759v);

    /* renamed from: e */
    public static final e1<String> f20405e = a("measurement.config.url_scheme", "https", "https", s.f20705s);

    /* renamed from: f */
    public static final e1<String> f20407f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", d.f183w);

    /* renamed from: g */
    public static final e1<Integer> f20409g = a("measurement.upload.max_bundles", 100, 100, y.f20813s);

    /* renamed from: h */
    public static final e1<Integer> f20411h = a("measurement.upload.max_batch_size", 65536, 65536, h0.f20480s);

    /* renamed from: i */
    public static final e1<Integer> f20413i = a("measurement.upload.max_bundle_size", 65536, 65536, r0.f20686s);

    /* renamed from: j */
    public static final e1<Integer> f20415j = a("measurement.upload.max_events_per_bundle", 1000, 1000, y0.f20814s);

    /* renamed from: k */
    public static final e1<Integer> f20417k = a("measurement.upload.max_events_per_day", 100000, 100000, z0.f20830s);

    /* renamed from: l */
    public static final e1<Integer> f20419l = a("measurement.upload.max_error_events_per_day", 1000, 1000, d.a.f3661v);

    /* renamed from: m */
    public static final e1<Integer> f20421m = a("measurement.upload.max_public_events_per_day", 50000, 50000, j.J);

    /* renamed from: n */
    public static final e1<Integer> f20423n = a("measurement.upload.max_conversions_per_day", 10000, 10000, c0.f20327s);

    /* renamed from: o */
    public static final e1<Integer> f20425o = a("measurement.upload.max_realtime_events_per_day", 10, 10, l0.f20548s);
    public static final e1<Integer> p = a("measurement.store.max_stored_events_per_app", 100000, 100000, t0.f20730s);

    /* renamed from: q */
    public static final e1<String> f20428q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", a1.f20272s);

    /* renamed from: r */
    public static final e1<Long> f20430r = a("measurement.upload.backoff_period", 43200000L, 43200000L, b1.f20307s);

    /* renamed from: s */
    public static final e1<Long> f20432s = a("measurement.upload.window_interval", 3600000L, 3600000L, c1.f20328s);

    /* renamed from: t */
    public static final e1<Long> f20434t = a("measurement.upload.interval", 3600000L, 3600000L, b10.f6323u);

    /* renamed from: u */
    public static final e1<Long> f20436u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, i.f4428t);

    /* renamed from: v */
    public static final e1<Long> f20438v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, n.a.f16395s);

    /* renamed from: w */
    public static final e1<Long> f20440w = a("measurement.upload.minimum_delay", 500L, 500L, f.f4467w);

    /* renamed from: x */
    public static final e1<Long> f20442x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, ca.d.f2839t);
    public static final e1<Long> y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, f0.f1681x);

    /* renamed from: z */
    public static final e1<Long> f20443z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, h0.y);
    public static final e1<Long> A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, b.f5815w);
    public static final e1<Long> B = a("measurement.upload.retry_time", 1800000L, 1800000L, h6.a.Z);
    public static final e1<Integer> C = a("measurement.upload.retry_count", 6, 6, r2.d.f17249t);
    public static final e1<Long> D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, k2.B);
    public static final e1<Integer> E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, p.f975s);
    public static final e1<Integer> F = a("measurement.audience.filter_result_max_count", 200, 200, m0.h0.f5876s);
    public static final e1<Integer> G = a("measurement.upload.max_public_user_properties", 25, 25, null);
    public static final e1<Integer> H = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
    public static final e1<Integer> I = a("measurement.upload.max_public_event_params", 25, 25, null);
    public static final e1<Long> J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, j0.d.B);
    public static final e1<String> L = a("measurement.test.string_flag", "---", "---", m3.a.f5951v);
    public static final e1<Long> M = a("measurement.test.long_flag", -1L, -1L, c1.f.f2609t);
    public static final e1<Integer> N = a("measurement.test.int_flag", -2, -2, c4.a.f2668t);
    public static final e1<Integer> P = a("measurement.experiment.max_ids", 50, 50, d.b.f3664u);
    public static final e1<Integer> Q = a("measurement.max_bundles_per_iteration", 100, 100, d.c.f3670x);
    public static final e1<Long> R = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, d.d.f3673u);

    /* renamed from: n0 */
    public static final e1<Integer> f20424n0 = a("measurement.service.storage_consent_support_version", 203600, 203600, k0.f20527s);

    static {
        Collections.synchronizedSet(new HashSet());
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, m2.a.f5947u);
        Double valueOf = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf, valueOf, t.f20729s);
        S = a("measurement.validation.internal_limits_internal_event_params", bool, bool, a6.f.W);
        Boolean bool2 = Boolean.TRUE;
        T = a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, n9.d.f16688v);
        U = a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, d0.b.G);
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, h.f4363z);
        V = a("measurement.quality.checksum", bool, bool, null);
        W = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, e1.i.B);
        X = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, x.d.f19988s);
        Y = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, g.E);
        Z = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, v.f20761s);
        f20398a0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, w.f20778s);
        f20400b0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, x.f20803s);
        f20402c0 = a("measurement.upload.file_lock_state_check", bool2, bool2, z.f20829s);
        f20404d0 = a("measurement.ga.ga_app_id", bool, bool, e9.d.f4462x);
        f20406e0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, a0.f20271s);
        f20408f0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, b0.f20306s);
        f20410g0 = a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, d0.f20349s);
        f20412h0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, e0.f20371s);
        f20414i0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, rl1.f13390t);
        f20416j0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, f0.f20396s);
        f20418k0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, g0.f20466s);
        f20420l0 = a("measurement.upload.file_truncate_fix", bool, bool, qr0.f12982t);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, i0.f20502s);
        f20422m0 = a("measurement.androidId.delete_feature", bool2, bool2, j0.f20517s);
        f20426o0 = a("measurement.client.properties.non_null_origin", bool2, bool2, cg2.f6929s);
        a("measurement.client.click_identifier_control.dev", bool, bool, n0.f20588s);
        a("measurement.service.click_identifier_control", bool, bool, o0.f20619s);
        f20427p0 = a("measurement.config.persist_last_modified", bool2, bool2, p0.f20638s);
        f20429q0 = a("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, q0.f20659s);
        f20431r0 = a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, ns0.f11913t);
        f20433s0 = a("measurement.module.pixie.ees", bool2, bool2, os0.f12287t);
        a("measurement.euid.client.dev", bool, bool, ss0.f13816t);
        a("measurement.euid.service", bool, bool, s0.f20706s);
        f20435t0 = a("measurement.adid_zero.service", bool, bool, n9.g.f16698t);
        f20437u0 = a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, u0.f20749s);
        a("measurement.adid_zero.adid_uid", bool, bool, v0.f20762s);
        f20439v0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, w0.f20779s);
        f20441w0 = a("measurement.config.fix_feature_flags_from_config", bool2, bool2, x0.f20804s);
    }

    public static <V> e1<V> a(String str, V v10, V v11, d1<V> d1Var) {
        e1<V> e1Var = new e1<>(str, v10, v11, d1Var);
        f20397a.add(e1Var);
        return e1Var;
    }

    public static Map<String, String> b(Context context) {
        x4 a10 = x4.a(context.getContentResolver(), f5.a());
        return a10 == null ? Collections.emptyMap() : a10.b();
    }
}
