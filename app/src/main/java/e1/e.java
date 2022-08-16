package e1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e */
    public static final Class<?>[] f4342e = {Context.class, AttributeSet.class};

    /* renamed from: f */
    public static final HashMap<String, Constructor<?>> f4343f = new HashMap<>();

    /* renamed from: a */
    public final Context f4344a;

    /* renamed from: c */
    public androidx.preference.e f4346c;

    /* renamed from: b */
    public final Object[] f4345b = new Object[2];

    /* renamed from: d */
    public String[] f4347d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public e(Context context, androidx.preference.e eVar) {
        this.f4344a = context;
        this.f4346c = eVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        Constructor<?> constructor = f4343f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f4344a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                        constructor = cls.getConstructor(f4342e);
                        constructor.setAccessible(true);
                        f4343f.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(f4342e);
                    constructor.setAccessible(true);
                    f4343f.put(str, constructor);
                } catch (ClassNotFoundException e12) {
                    throw e12;
                }
            } catch (Exception e13) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e13);
                throw inflateException;
            }
        }
        Object[] objArr = this.f4345b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return a(str, this.f4347d, attributeSet);
            }
            return a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    public final Preference c(XmlPullParser xmlPullParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.f4345b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f4345b[0] = this.f4344a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e10) {
                    throw e10;
                } catch (IOException e11) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e11.getMessage());
                    inflateException.initCause(e11);
                    throw inflateException;
                } catch (XmlPullParserException e12) {
                    InflateException inflateException2 = new InflateException(e12.getMessage());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) b(xmlPullParser.getName(), asAttributeSet);
            preferenceGroup.r(this.f4346c);
            d(xmlPullParser, preferenceGroup, asAttributeSet);
        }
        return preferenceGroup;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        long j3;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.E = Intent.parseIntent(this.f4344a.getResources(), xmlPullParser, attributeSet);
                        } catch (IOException e10) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e10);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        Resources resources = this.f4344a.getResources();
                        if (preference.G == null) {
                            preference.G = new Bundle();
                        }
                        resources.parseBundleExtra("extra", attributeSet, preference.G);
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                                }
                            }
                        } catch (IOException e11) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e11);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference b10 = b(name, attributeSet);
                        PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                        if (!preferenceGroup.f1778g0.contains(b10)) {
                            if (b10.D != null) {
                                PreferenceGroup preferenceGroup2 = preferenceGroup;
                                while (true) {
                                    PreferenceGroup preferenceGroup3 = preferenceGroup2.f1763a0;
                                    if (preferenceGroup3 == null) {
                                        break;
                                    }
                                    preferenceGroup2 = preferenceGroup3;
                                }
                                String str = b10.D;
                                if (preferenceGroup2.G(str) != null) {
                                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                                }
                            }
                            int i10 = b10.y;
                            if (i10 == Integer.MAX_VALUE) {
                                if (preferenceGroup.f1779h0) {
                                    int i11 = preferenceGroup.f1780i0;
                                    preferenceGroup.f1780i0 = i11 + 1;
                                    if (i11 != i10) {
                                        b10.y = i11;
                                        b10.p();
                                    }
                                }
                                if (b10 instanceof PreferenceGroup) {
                                    ((PreferenceGroup) b10).f1779h0 = preferenceGroup.f1779h0;
                                }
                            }
                            int binarySearch = Collections.binarySearch(preferenceGroup.f1778g0, b10);
                            if (binarySearch < 0) {
                                binarySearch = (binarySearch * (-1)) - 1;
                            }
                            boolean D = preferenceGroup.D();
                            if (b10.N == D) {
                                b10.N = !D;
                                b10.o(b10.D());
                                b10.n();
                            }
                            synchronized (preferenceGroup) {
                                preferenceGroup.f1778g0.add(binarySearch, b10);
                            }
                            androidx.preference.e eVar = preferenceGroup.f1769t;
                            String str2 = b10.D;
                            if (str2 != null && preferenceGroup.f1777f0.containsKey(str2)) {
                                j3 = preferenceGroup.f1777f0.getOrDefault(str2, null).longValue();
                                preferenceGroup.f1777f0.remove(str2);
                            } else {
                                synchronized (eVar) {
                                    j3 = eVar.f1843b;
                                    eVar.f1843b = 1 + j3;
                                }
                            }
                            b10.f1770u = j3;
                            b10.f1771v = true;
                            try {
                                b10.r(eVar);
                                b10.f1771v = false;
                                if (b10.f1763a0 == null) {
                                    b10.f1763a0 = preferenceGroup;
                                    if (preferenceGroup.f1781j0) {
                                        b10.q();
                                    }
                                    preferenceGroup.p();
                                } else {
                                    throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                                }
                            } catch (Throwable th) {
                                b10.f1771v = false;
                                throw th;
                            }
                        }
                        d(xmlPullParser, b10, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }
}
