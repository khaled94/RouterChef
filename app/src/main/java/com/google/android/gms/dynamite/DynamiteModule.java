package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c4.u0;
import com.google.android.gms.common.util.DynamiteApi;
import d4.l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;
import l4.d;
import l4.e;
import l4.f;

/* loaded from: classes.dex */
public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e */
    public static Boolean f2947e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    public static String f2948f = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g */
    public static boolean f2949g = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h */
    public static int f2950h = -1;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: l */
    public static e f2954l;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: m */
    public static f f2955m;

    /* renamed from: a */
    public final Context f2956a;

    /* renamed from: i */
    public static final ThreadLocal<d> f2951i = new ThreadLocal<>();

    /* renamed from: j */
    public static final ThreadLocal<Long> f2952j = new u0(1);

    /* renamed from: k */
    public static final com.google.android.gms.dynamite.a f2953k = new com.google.android.gms.dynamite.a();

    /* renamed from: b */
    public static final com.google.android.gms.dynamite.b f2944b = new com.google.android.gms.dynamite.b();

    /* renamed from: c */
    public static final c f2945c = new c();

    /* renamed from: d */
    public static final d f2946d = new d();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public /* synthetic */ a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z10);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        /* loaded from: classes.dex */
        public static class C0041b {

            /* renamed from: a */
            public int f2957a = 0;

            /* renamed from: b */
            public int f2958b = 0;

            /* renamed from: c */
            public int f2959c = 0;
        }

        C0041b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.f2956a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (l.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + str.length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static DynamiteModule c(Context context, b bVar, String str) {
        Boolean bool;
        DynamiteModule dynamiteModule;
        k4.a aVar;
        f fVar;
        Boolean valueOf;
        k4.a aVar2;
        ThreadLocal<d> threadLocal = f2951i;
        d dVar = threadLocal.get();
        d dVar2 = new d(null);
        threadLocal.set(dVar2);
        ThreadLocal<Long> threadLocal2 = f2952j;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0041b a10 = bVar.a(context, str, f2953k);
            int i10 = a10.f2957a;
            int i11 = a10.f2958b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i10);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i11);
            Log.i("DynamiteModule", sb.toString());
            int i12 = a10.f2959c;
            if (i12 != 0) {
                if (i12 == -1) {
                    if (a10.f2957a != 0) {
                        i12 = -1;
                    }
                }
                if (i12 != 1 || a10.f2958b != 0) {
                    if (i12 == -1) {
                        DynamiteModule f10 = f(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = dVar2.f5816a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(dVar);
                        return f10;
                    } else if (i12 != 1) {
                        StringBuilder sb2 = new StringBuilder(47);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i12);
                        throw new a(sb2.toString());
                    } else {
                        try {
                            int i13 = a10.f2958b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    bool = f2947e;
                                }
                                if (bool == null) {
                                    throw new a("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 51);
                                    sb3.append("Selected remote version of ");
                                    sb3.append(str);
                                    sb3.append(", version >= ");
                                    sb3.append(i13);
                                    Log.i("DynamiteModule", sb3.toString());
                                    synchronized (DynamiteModule.class) {
                                        fVar = f2955m;
                                    }
                                    if (fVar == null) {
                                        throw new a("DynamiteLoaderV2 was not cached.");
                                    }
                                    d dVar3 = threadLocal.get();
                                    if (dVar3 == null || dVar3.f5816a == null) {
                                        throw new a("No result cursor");
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor2 = dVar3.f5816a;
                                    k4.b.E1(null);
                                    synchronized (DynamiteModule.class) {
                                        valueOf = Boolean.valueOf(f2950h >= 2);
                                    }
                                    if (valueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        aVar2 = fVar.E1(new k4.b(applicationContext), str, i13, new k4.b(cursor2));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        aVar2 = fVar.e0(new k4.b(applicationContext), str, i13, new k4.b(cursor2));
                                    }
                                    Context context2 = (Context) k4.b.e0(aVar2);
                                    if (context2 == null) {
                                        throw new a("Failed to get module context");
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    StringBuilder sb4 = new StringBuilder(str.length() + 51);
                                    sb4.append("Selected remote version of ");
                                    sb4.append(str);
                                    sb4.append(", version >= ");
                                    sb4.append(i13);
                                    Log.i("DynamiteModule", sb4.toString());
                                    e h10 = h(context);
                                    if (h10 == null) {
                                        throw new a("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel w10 = h10.w(6, h10.c0());
                                    int readInt = w10.readInt();
                                    w10.recycle();
                                    if (readInt >= 3) {
                                        d dVar4 = threadLocal.get();
                                        if (dVar4 == null) {
                                            throw new a("No cached result cursor holder");
                                        }
                                        aVar = h10.E1(new k4.b(context), str, i13, new k4.b(dVar4.f5816a));
                                    } else if (readInt == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        aVar = h10.Z1(new k4.b(context), str, i13);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        aVar = h10.e0(new k4.b(context), str, i13);
                                    }
                                    if (k4.b.e0(aVar) == null) {
                                        throw new a("Failed to load remote module.");
                                    }
                                    dynamiteModule = new DynamiteModule((Context) k4.b.e0(aVar));
                                }
                                if (longValue == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(Long.valueOf(longValue));
                                }
                                Cursor cursor3 = dVar2.f5816a;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                threadLocal.set(dVar);
                                return dynamiteModule;
                            } catch (RemoteException e10) {
                                throw new a("Failed to load remote module.", e10);
                            } catch (a e11) {
                                throw e11;
                            } catch (Throwable th) {
                                h4.b.a(context, th);
                                throw new a("Failed to load remote module.", th);
                            }
                        } catch (a e12) {
                            String valueOf2 = String.valueOf(e12.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                            int i14 = a10.f2957a;
                            if (i14 == 0 || bVar.a(context, str, new e(i14)).f2959c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e12);
                            }
                            DynamiteModule f11 = f(context, str);
                            if (longValue == 0) {
                                f2952j.remove();
                            } else {
                                f2952j.set(Long.valueOf(longValue));
                            }
                            Cursor cursor4 = dVar2.f5816a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            f2951i.set(dVar);
                            return f11;
                        }
                    }
                }
            }
            int i15 = a10.f2957a;
            int i16 = a10.f2958b;
            StringBuilder sb5 = new StringBuilder(str.length() + 92);
            sb5.append("No acceptable module ");
            sb5.append(str);
            sb5.append(" found. Local version is ");
            sb5.append(i15);
            sb5.append(" and remote version is ");
            sb5.append(i16);
            sb5.append(".");
            throw new a(sb5.toString());
        } catch (Throwable th2) {
            if (longValue == 0) {
                f2952j.remove();
            } else {
                f2952j.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = dVar2.f5816a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f2951i.set(dVar);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0163, code lost:
        if (r1 != false) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", str.length() != 0 ? "Selected local version of ".concat(str) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    public static void g(ClassLoader classLoader) {
        f fVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
            }
            f2955m = fVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10);
        }
    }

    public static e h(Context context) {
        e eVar;
        synchronized (DynamiteModule.class) {
            e eVar2 = f2954l;
            if (eVar2 != null) {
                return eVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    eVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder);
                }
                if (eVar != null) {
                    f2954l = eVar;
                    return eVar;
                }
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f2956a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e10);
        }
    }
}
