package b0;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    public CharSequence f2463a;

    /* renamed from: b */
    public IconCompat f2464b;

    /* renamed from: c */
    public String f2465c;

    /* renamed from: d */
    public String f2466d;

    /* renamed from: e */
    public boolean f2467e;

    /* renamed from: f */
    public boolean f2468f;

    /* loaded from: classes.dex */
    public static class a {
        public static x a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f2469a = person.getName();
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f1266k;
                Objects.requireNonNull(icon);
                int c10 = IconCompat.a.c(icon);
                if (c10 == 2) {
                    iconCompat = IconCompat.b(IconCompat.a.b(icon), IconCompat.a.a(icon));
                } else if (c10 == 4) {
                    Uri d5 = IconCompat.a.d(icon);
                    Objects.requireNonNull(d5);
                    String uri = d5.toString();
                    Objects.requireNonNull(uri);
                    iconCompat = new IconCompat(4);
                    iconCompat.f1268b = uri;
                } else if (c10 != 6) {
                    iconCompat = new IconCompat(-1);
                    iconCompat.f1268b = icon;
                } else {
                    Uri d10 = IconCompat.a.d(icon);
                    Objects.requireNonNull(d10);
                    String uri2 = d10.toString();
                    Objects.requireNonNull(uri2);
                    iconCompat = new IconCompat(6);
                    iconCompat.f1268b = uri2;
                }
            } else {
                iconCompat = null;
            }
            bVar.f2470b = iconCompat;
            bVar.f2471c = person.getUri();
            bVar.f2472d = person.getKey();
            bVar.f2473e = person.isBot();
            bVar.f2474f = person.isImportant();
            return new x(bVar);
        }

        public static Person b(x xVar) {
            Person.Builder name = new Person.Builder().setName(xVar.f2463a);
            IconCompat iconCompat = xVar.f2464b;
            Icon icon = null;
            if (iconCompat != null) {
                Objects.requireNonNull(iconCompat);
                icon = IconCompat.a.f(iconCompat, null);
            }
            return name.setIcon(icon).setUri(xVar.f2465c).setKey(xVar.f2466d).setBot(xVar.f2467e).setImportant(xVar.f2468f).build();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public CharSequence f2469a;

        /* renamed from: b */
        public IconCompat f2470b;

        /* renamed from: c */
        public String f2471c;

        /* renamed from: d */
        public String f2472d;

        /* renamed from: e */
        public boolean f2473e;

        /* renamed from: f */
        public boolean f2474f;
    }

    public x(b bVar) {
        this.f2463a = bVar.f2469a;
        this.f2464b = bVar.f2470b;
        this.f2465c = bVar.f2471c;
        this.f2466d = bVar.f2472d;
        this.f2467e = bVar.f2473e;
        this.f2468f = bVar.f2474f;
    }
}
