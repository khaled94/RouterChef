package m4;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l3.s;
import n3.k1;

/* loaded from: classes.dex */
public final class m11 {

    /* renamed from: e */
    public final String f11075e;

    /* renamed from: f */
    public final j11 f11076f;

    /* renamed from: b */
    public final List<Map<String, String>> f11072b = new ArrayList();

    /* renamed from: c */
    public boolean f11073c = false;

    /* renamed from: d */
    public boolean f11074d = false;

    /* renamed from: a */
    public final k1 f11071a = (k1) s.B.f5793g.c();

    public m11(String str, j11 j11Var) {
        this.f11075e = str;
        this.f11076f = j11Var;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List<java.util.Map<java.lang.String, java.lang.String>>, java.util.ArrayList] */
    public final synchronized void a(String str, String str2) {
        yr<Boolean> yrVar = es.f8166p1;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            if (!((Boolean) joVar.f10148c.a(es.I5)).booleanValue()) {
                Map<String, String> e10 = e();
                HashMap hashMap = (HashMap) e10;
                hashMap.put("action", "adapter_init_finished");
                hashMap.put("ancn", str);
                hashMap.put("rqe", str2);
                this.f11072b.add(e10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<java.util.Map<java.lang.String, java.lang.String>>, java.util.ArrayList] */
    public final synchronized void b(String str) {
        yr<Boolean> yrVar = es.f8166p1;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            if (!((Boolean) joVar.f10148c.a(es.I5)).booleanValue()) {
                Map<String, String> e10 = e();
                HashMap hashMap = (HashMap) e10;
                hashMap.put("action", "adapter_init_started");
                hashMap.put("ancn", str);
                this.f11072b.add(e10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<java.util.Map<java.lang.String, java.lang.String>>, java.util.ArrayList] */
    public final synchronized void c(String str) {
        yr<Boolean> yrVar = es.f8166p1;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            if (!((Boolean) joVar.f10148c.a(es.I5)).booleanValue()) {
                Map<String, String> e10 = e();
                HashMap hashMap = (HashMap) e10;
                hashMap.put("action", "adapter_init_finished");
                hashMap.put("ancn", str);
                this.f11072b.add(e10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<java.util.Map<java.lang.String, java.lang.String>>, java.util.ArrayList] */
    public final synchronized void d() {
        yr<Boolean> yrVar = es.f8166p1;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            if (!((Boolean) joVar.f10148c.a(es.I5)).booleanValue()) {
                if (this.f11073c) {
                    return;
                }
                Map<String, String> e10 = e();
                ((HashMap) e10).put("action", "init_started");
                this.f11072b.add(e10);
                this.f11073c = true;
            }
        }
    }

    public final Map<String, String> e() {
        j11 j11Var = this.f11076f;
        Objects.requireNonNull(j11Var);
        HashMap hashMap = new HashMap(j11Var.f10236a);
        Objects.requireNonNull(s.B.f5796j);
        hashMap.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        hashMap.put("tid", this.f11071a.J() ? "" : this.f11075e);
        return hashMap;
    }
}
