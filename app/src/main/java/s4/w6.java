package s4;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import s4.o6;

/* loaded from: classes.dex */
public abstract class w6<T extends o6> {

    /* renamed from: a */
    public static final Logger f18164a = Logger.getLogger(k6.class.getName());

    /* renamed from: b */
    public static final String f18165b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static o6 b() {
        String str;
        ClassLoader classLoader = w6.class.getClassLoader();
        if (o6.class.equals(o6.class)) {
            str = f18165b;
        } else if (!o6.class.getPackage().equals(w6.class.getPackage())) {
            throw new IllegalArgumentException(o6.class.getName());
        } else {
            str = String.format("%s.BlazeGenerated%sLoader", o6.class.getPackage().getName(), o6.class.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (o6) o6.class.cast(((w6) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
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
            Iterator it = ServiceLoader.load(w6.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(o6.class.cast(((w6) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    Logger logger = f18164a;
                    Level level = Level.SEVERE;
                    String simpleName = o6.class.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (o6) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (o6) o6.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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
