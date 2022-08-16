package b0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.a;
import androidx.core.graphics.drawable.IconCompat;
import b0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import r.c;

/* loaded from: classes.dex */
public final class s implements m {

    /* renamed from: a */
    public final Context f2455a;

    /* renamed from: b */
    public final Notification.Builder f2456b;

    /* renamed from: c */
    public final q f2457c;

    /* renamed from: d */
    public final List<Bundle> f2458d = new ArrayList();

    /* renamed from: e */
    public final Bundle f2459e = new Bundle();

    public s(q qVar) {
        this.f2457c = qVar;
        this.f2455a = qVar.f2435a;
        Notification.Builder builder = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(qVar.f2435a, qVar.f2450q) : new Notification.Builder(qVar.f2435a);
        this.f2456b = builder;
        Notification notification = qVar.f2452s;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qVar.f2439e).setContentText(qVar.f2440f).setContentInfo(null).setContentIntent(qVar.f2441g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) == 0 ? false : true).setLargeIcon(qVar.f2442h).setNumber(qVar.f2443i).setProgress(0, 0, false);
        builder.setSubText(null).setUsesChronometer(false).setPriority(qVar.f2444j);
        Iterator<n> it = qVar.f2436b.iterator();
        while (it.hasNext()) {
            n next = it.next();
            IconCompat a10 = next.a();
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a10 != null ? IconCompat.a.f(a10, null) : null, next.f2428j, next.f2429k);
            z[] zVarArr = next.f2421c;
            if (zVarArr != null) {
                int length = zVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (zVarArr.length > 0) {
                    z zVar = zVarArr[0];
                    throw null;
                }
                for (int i10 = 0; i10 < length; i10++) {
                    builder2.addRemoteInput(remoteInputArr[i10]);
                }
            }
            Bundle bundle = next.f2419a != null ? new Bundle(next.f2419a) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", next.f2423e);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                builder2.setAllowGeneratedReplies(next.f2423e);
            }
            bundle.putInt("android.support.action.semanticAction", next.f2425g);
            if (i11 >= 28) {
                builder2.setSemanticAction(next.f2425g);
            }
            if (i11 >= 29) {
                builder2.setContextual(next.f2426h);
            }
            if (i11 >= 31) {
                builder2.setAuthenticationRequired(next.f2430l);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", next.f2424f);
            builder2.addExtras(bundle);
            this.f2456b.addAction(builder2.build());
        }
        Bundle bundle2 = qVar.f2448n;
        if (bundle2 != null) {
            this.f2459e.putAll(bundle2);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f2456b.setShowWhen(qVar.f2445k);
        this.f2456b.setLocalOnly(qVar.f2447m).setGroup(null).setGroupSummary(false).setSortKey(null);
        this.f2456b.setCategory(null).setColor(qVar.f2449o).setVisibility(qVar.p).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        List<String> a11 = i12 < 28 ? a(b(qVar.f2437c), qVar.f2453t) : qVar.f2453t;
        if (a11 != null && !a11.isEmpty()) {
            for (String str : a11) {
                this.f2456b.addPerson(str);
            }
        }
        if (qVar.f2438d.size() > 0) {
            if (qVar.f2448n == null) {
                qVar.f2448n = new Bundle();
            }
            Bundle bundle3 = qVar.f2448n.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i13 = 0; i13 < qVar.f2438d.size(); i13++) {
                String num = Integer.toString(i13);
                n nVar = qVar.f2438d.get(i13);
                Object obj = t.f2460a;
                Bundle bundle6 = new Bundle();
                IconCompat a12 = nVar.a();
                bundle6.putInt("icon", a12 != null ? a12.c() : 0);
                bundle6.putCharSequence("title", nVar.f2428j);
                bundle6.putParcelable("actionIntent", nVar.f2429k);
                Bundle bundle7 = nVar.f2419a != null ? new Bundle(nVar.f2419a) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", nVar.f2423e);
                bundle6.putBundle("extras", bundle7);
                bundle6.putParcelableArray("remoteInputs", t.a(nVar.f2421c));
                bundle6.putBoolean("showsUserInterface", nVar.f2424f);
                bundle6.putInt("semanticAction", nVar.f2425g);
                bundle5.putBundle(num, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (qVar.f2448n == null) {
                qVar.f2448n = new Bundle();
            }
            qVar.f2448n.putBundle("android.car.EXTENSIONS", bundle3);
            this.f2459e.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 24) {
            this.f2456b.setExtras(qVar.f2448n).setRemoteInputHistory(null);
        }
        if (i14 >= 26) {
            this.f2456b.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(qVar.f2450q)) {
                this.f2456b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<x> it2 = qVar.f2437c.iterator();
            while (it2.hasNext()) {
                x next2 = it2.next();
                Notification.Builder builder3 = this.f2456b;
                Objects.requireNonNull(next2);
                builder3.addPerson(x.a.b(next2));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2456b.setAllowSystemGeneratedContextualActions(qVar.f2451r);
            this.f2456b.setBubbleMetadata(null);
        }
    }

    public static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        c cVar = new c(list2.size() + list.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    public static List<String> b(List<x> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (x xVar : list) {
            String str = xVar.f2465c;
            if (str == null) {
                if (xVar.f2463a != null) {
                    StringBuilder c10 = a.c("name:");
                    c10.append((Object) xVar.f2463a);
                    str = c10.toString();
                } else {
                    str = "";
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}
