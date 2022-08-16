package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import b4.e;
import b4.h;
import b4.i;
import c4.u0;
import c4.v0;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import d4.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p4.f;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends h> extends e<R> {

    /* renamed from: f */
    public R f2939f;

    /* renamed from: g */
    public Status f2940g;

    /* renamed from: h */
    public volatile boolean f2941h;

    /* renamed from: i */
    public boolean f2942i;
    @KeepName
    private v0 mResultGuardian;

    /* renamed from: a */
    public final Object f2934a = new Object();

    /* renamed from: c */
    public final CountDownLatch f2936c = new CountDownLatch(1);

    /* renamed from: d */
    public final ArrayList<e.a> f2937d = new ArrayList<>();

    /* renamed from: e */
    public final AtomicReference<Object> f2938e = new AtomicReference<>();

    /* renamed from: b */
    public final a<R> f2935b = new a<>(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static class a<R extends h> extends f {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                i iVar = (i) pair.first;
                h hVar = (h) pair.second;
                try {
                    iVar.a();
                } catch (RuntimeException e10) {
                    BasePendingResult.f(hVar);
                    throw e10;
                }
            } else if (i10 == 2) {
                ((BasePendingResult) message.obj).b(Status.y);
            } else {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i10);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            }
        }
    }

    static {
        new u0(0);
    }

    @Deprecated
    public BasePendingResult() {
        new WeakReference(null);
    }

    public static void f(h hVar) {
        if (hVar instanceof b4.f) {
            try {
                ((b4.f) hVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(hVar)), e10);
            }
        }
    }

    public abstract h a();

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void b(Status status) {
        synchronized (this.f2934a) {
            if (!c()) {
                d(a());
                this.f2942i = true;
            }
        }
    }

    public final boolean c() {
        return this.f2936c.getCount() == 0;
    }

    public final void d(R r10) {
        synchronized (this.f2934a) {
            if (this.f2942i) {
                f(r10);
                return;
            }
            c();
            m.k(!c(), "Results have already been set");
            m.k(!this.f2941h, "Result has already been consumed");
            e(r10);
        }
    }

    public final void e(R r10) {
        this.f2939f = r10;
        this.f2940g = r10.m();
        this.f2936c.countDown();
        if (this.f2939f instanceof b4.f) {
            this.mResultGuardian = new v0(this);
        }
        ArrayList<e.a> arrayList = this.f2937d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
        this.f2937d.clear();
    }
}
