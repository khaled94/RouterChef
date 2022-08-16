package p8;

/* loaded from: classes.dex */
public final class b extends c {
    public b() {
        this.y = false;
        this.A = false;
    }

    @Override // p8.a, p8.g, o8.a
    public final String v() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit)\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_window')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            Atp.WlanObj.isShow24Password = true;\n                let wlanInfo = Atp.WlanObj.content;\n                Android.callbackHandle(JSON.stringify({\n                    result: \"basic_wifi_info\",\n                    ssidName: wlanInfo.WifiSsid,\n                    password: null,\n                    hidden: wlanInfo.WifiHideBroadcast,\n                    safe: wlanInfo.BeaconType,\n                    maxClients: wlanInfo.X_AssociateDeviceNum\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n        }\n    } catch (err){ }\n}, 500);";
    }
}
