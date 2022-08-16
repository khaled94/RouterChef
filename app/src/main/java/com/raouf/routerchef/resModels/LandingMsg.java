package com.raouf.routerchef.resModels;

import android.content.Context;
import r8.b;

/* loaded from: classes.dex */
public class LandingMsg {
    private ArLandingData ar;
    private EnLandingData en;
    private String id;
    private String imageUrl;
    private boolean show;

    /* loaded from: classes.dex */
    public static class Body {
        public boolean isEnglish;
        public LandingMsg landingMsg;

        public Body(Context context, LandingMsg landingMsg) {
            this.landingMsg = landingMsg;
            this.isEnglish = b.c(context).toString().contains("en");
        }
    }

    public static String a(LandingMsg landingMsg) {
        return landingMsg.id;
    }

    public static String b(LandingMsg landingMsg) {
        return landingMsg.imageUrl;
    }

    public final String c() {
        return this.ar.btnLink;
    }

    public final String d() {
        return this.ar.btnText;
    }

    public final String e() {
        return this.ar.content;
    }

    public final String f() {
        return this.ar.title;
    }

    public final String g() {
        return this.en.btnLink;
    }

    public final String h() {
        return this.en.btnText;
    }

    public final String i() {
        return this.en.content;
    }

    public final String j() {
        return this.en.title;
    }

    public final boolean k() {
        return this.show;
    }
}
