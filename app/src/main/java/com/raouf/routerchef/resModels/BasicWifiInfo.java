package com.raouf.routerchef.resModels;

/* loaded from: classes.dex */
public class BasicWifiInfo {
    public String enabled_5G;
    public String hidden;
    public String maxClients;
    public String password;
    public String result;
    public String safe;
    public String ssidName;

    public final boolean a() {
        return Boolean.parseBoolean(this.hidden);
    }

    public final boolean b() {
        return this.safe.contains("WPA") || this.safe.contains("11i") || this.safe.equals("true");
    }
}
