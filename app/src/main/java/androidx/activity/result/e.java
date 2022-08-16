package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a */
    public Random f429a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f430b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f431c = new HashMap();

    /* renamed from: d */
    public final Map<String, c> f432d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f433e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, b<?>> f434f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f435g = new HashMap();

    /* renamed from: h */
    public final Bundle f436h = new Bundle();

    /* loaded from: classes.dex */
    public class a extends d {

        /* renamed from: b */
        public final /* synthetic */ String f437b;

        /* renamed from: c */
        public final /* synthetic */ c.a f438c;

        public a(String str, c.a aVar) {
            e.this = r1;
            this.f437b = str;
            this.f438c = aVar;
        }

        public final void h() {
            e.this.d(this.f437b);
        }
    }

    /* loaded from: classes.dex */
    public static class b<O> {

        /* renamed from: a */
        public final androidx.activity.result.c<O> f440a;

        /* renamed from: b */
        public final c.a<?, O> f441b;

        public b(androidx.activity.result.c<O> cVar, c.a<?, O> aVar) {
            this.f440a = cVar;
            this.f441b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public final void a(int i10, String str) {
        this.f430b.put(Integer.valueOf(i10), str);
        this.f431c.put(str, Integer.valueOf(i10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, androidx.activity.result.e$b<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final boolean b(int i10, int i11, Intent intent) {
        String str = (String) this.f430b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        b bVar = (b) this.f434f.get(str);
        if (bVar == null || bVar.f440a == null || !this.f433e.contains(str)) {
            this.f435g.remove(str);
            this.f436h.putParcelable(str, new androidx.activity.result.b(i11, intent));
            return true;
        }
        bVar.f440a.a(bVar.f441b.c(i11, intent));
        this.f433e.remove(str);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.String, androidx.activity.result.e$b<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    public final <I, O> d c(String str, c.a<I, O> aVar, androidx.activity.result.c<O> cVar) {
        int i10;
        if (((Integer) this.f431c.get(str)) == null) {
            int nextInt = this.f429a.nextInt(2147418112);
            while (true) {
                i10 = nextInt + 65536;
                if (!this.f430b.containsKey(Integer.valueOf(i10))) {
                    break;
                }
                nextInt = this.f429a.nextInt(2147418112);
            }
            a(i10, str);
        }
        this.f434f.put(str, new b(cVar, aVar));
        if (this.f435g.containsKey(str)) {
            Object obj = this.f435g.get(str);
            this.f435g.remove(str);
            cVar.a(obj);
        }
        androidx.activity.result.b bVar = (androidx.activity.result.b) this.f436h.getParcelable(str);
        if (bVar != null) {
            this.f436h.remove(str);
            cVar.a(aVar.c(bVar.f426s, bVar.f427t));
        }
        return new a(str, aVar);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, androidx.activity.result.e$b<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map<java.lang.String, androidx.activity.result.e$c>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void d(String str) {
        Integer num;
        if (!this.f433e.contains(str) && (num = (Integer) this.f431c.remove(str)) != null) {
            this.f430b.remove(num);
        }
        this.f434f.remove(str);
        if (this.f435g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f435g.get(str));
            this.f435g.remove(str);
        }
        if (this.f436h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f436h.getParcelable(str));
            this.f436h.remove(str);
        }
        if (((c) this.f432d.get(str)) == null) {
            return;
        }
        throw null;
    }
}
