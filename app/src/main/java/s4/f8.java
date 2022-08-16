package s4;

import c1.f;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class f8 {
    public static final void a(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i10, str, entry);
            }
        } else {
            sb.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                f6 f6Var = g6.f17877t;
                sb.append(f.d(new f6(((String) obj).getBytes(i7.f17920a))));
                sb.append('\"');
            } else if (obj instanceof g6) {
                sb.append(": \"");
                sb.append(f.d((g6) obj));
                sb.append('\"');
            } else if (obj instanceof b7) {
                sb.append(" {");
                c((b7) obj, sb, i10 + 2);
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj.toString());
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i10 + 2;
                a(sb, i13, "key", entry2.getKey());
                a(sb, i13, "value", entry2.getValue());
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            }
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void c(d8 d8Var, StringBuilder sb, int i10) {
        Method[] declaredMethods;
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : d8Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i10, b(concat), b7.k(method2, d8Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i10, b(concat2), b7.k(method3, d8Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object k10 = b7.k(method4, d8Var, new Object[0]);
                    if (method5 == null) {
                        if (k10 instanceof Boolean) {
                            if (((Boolean) k10).booleanValue()) {
                                a(sb, i10, b(concat3), k10);
                            }
                        } else if (k10 instanceof Integer) {
                            if (((Integer) k10).intValue() != 0) {
                                a(sb, i10, b(concat3), k10);
                            }
                        } else if (k10 instanceof Float) {
                            if (((Float) k10).floatValue() != 0.0f) {
                                a(sb, i10, b(concat3), k10);
                            }
                        } else if (!(k10 instanceof Double)) {
                            if (k10 instanceof String) {
                                obj = "";
                            } else if (k10 instanceof g6) {
                                obj = g6.f17877t;
                            } else if (!(k10 instanceof d8)) {
                                if ((k10 instanceof Enum) && ((Enum) k10).ordinal() == 0) {
                                }
                                a(sb, i10, b(concat3), k10);
                            } else if (k10 != ((d8) k10).c()) {
                                a(sb, i10, b(concat3), k10);
                            }
                            if (!k10.equals(obj)) {
                                a(sb, i10, b(concat3), k10);
                            }
                        } else if (((Double) k10).doubleValue() != 0.0d) {
                            a(sb, i10, b(concat3), k10);
                        }
                    } else if (((Boolean) b7.k(method5, d8Var, new Object[0])).booleanValue()) {
                        a(sb, i10, b(concat3), k10);
                    }
                }
            }
        }
        if (d8Var instanceof z6) {
            z6 z6Var = (z6) d8Var;
            throw null;
        }
        a9 a9Var = ((b7) d8Var).zzc;
        if (a9Var == null) {
            return;
        }
        for (int i11 = 0; i11 < a9Var.f17721a; i11++) {
            a(sb, i10, String.valueOf(a9Var.f17722b[i11] >>> 3), a9Var.f17723c[i11]);
        }
    }
}
