package androidx.work;

import androidx.work.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t1.f;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends f {
    @Override // t1.f
    public final b a(List<b> list) {
        Object newInstance;
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((b) it.next()).f2306a).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            value = newInstance2;
                        } else {
                            newInstance = Array.newInstance(obj.getClass(), 2);
                            Array.set(newInstance, 0, obj);
                            Array.set(newInstance, 1, value);
                            value = newInstance;
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = b(obj, value);
                    } else if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                        throw new IllegalArgumentException();
                    } else {
                        value = b(value, obj);
                    }
                    hashMap.put(str, value);
                } else if (cls.isArray()) {
                    hashMap.put(str, value);
                } else {
                    newInstance = Array.newInstance(value.getClass(), 1);
                    Array.set(newInstance, 0, value);
                    value = newInstance;
                    hashMap.put(str, value);
                }
            }
        }
        aVar.b(hashMap);
        return aVar.a();
    }

    public final Object b(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }
}
