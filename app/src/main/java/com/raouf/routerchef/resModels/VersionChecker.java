package com.raouf.routerchef.resModels;

import android.content.Context;
import r8.b;

/* loaded from: classes.dex */
public class VersionChecker {
    private ArabicData arabicData;
    private EnglishData englishData;
    private String free;

    /* loaded from: classes.dex */
    public static class Body {
        public boolean isEnglish;
        public VersionChecker versionChecker;

        public Body(Context context, VersionChecker versionChecker) {
            this.versionChecker = versionChecker;
            this.isEnglish = b.c(context).toString().contains("en");
        }
    }

    public final String b() {
        return this.arabicData.releaseNotes;
    }

    public final String c() {
        return this.arabicData.welcomeMsg;
    }

    public final String d() {
        return this.englishData.releaseNotes;
    }

    public final String e() {
        return this.englishData.welcomeMsg;
    }
}
