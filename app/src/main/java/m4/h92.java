package m4;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import m4.z82;

/* loaded from: classes.dex */
public abstract class h92<T extends z82> {

    /* renamed from: a */
    public static final Logger f9150a = Logger.getLogger(v82.class.getName());

    /* renamed from: b */
    public static final String f9151b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static z82 b() {
        String str;
        ClassLoader classLoader = h92.class.getClassLoader();
        if (z82.class.equals(z82.class)) {
            str = f9151b;
        } else if (!z82.class.getPackage().equals(h92.class.getPackage())) {
            throw new IllegalArgumentException(z82.class.getName());
        } else {
            str = String.format("%s.BlazeGenerated%sLoader", z82.class.getPackage().getName(), z82.class.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (z82) z82.class.cast(((h92) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                    } catch (IllegalAccessException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(h92.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(z82.class.cast(((h92) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    Logger logger = f9150a;
                    Level level = Level.SEVERE;
                    String simpleName = z82.class.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (z82) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (z82) z82.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract T a();
}
