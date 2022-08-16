package com.raouf.routerchef.resModels;

import java.util.List;

/* loaded from: classes.dex */
public class DevicesInfo {
    public List<Device> devices;
    public String result;

    /* loaded from: classes.dex */
    public static class Device {
        public String hostname;
        public String ip;
        public String mac;
    }
}
