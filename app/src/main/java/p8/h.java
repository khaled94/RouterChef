package p8;

import l0.d;
import s.b;

/* loaded from: classes.dex */
public final class h extends g {
    public h() {
        this.f16791d = "HG633";
        this.f16792e = "/html/advance.html#wlan";
        this.f16794g = "/html/wizard/network.html";
        this.f16795h = "/html/advance.html#device_info";
        this.f16796i = "/html/advance.html#wlan";
        this.f16798k = "/html/advance.html#internet";
        this.f16799l = "/html/advance.html#device_mngt";
        this.f16800m = "/html/advance.html#lan";
        this.C = 4;
        this.f16806t = true;
    }

    @Override // p8.g, o8.a
    public final String c(boolean z10, String str) {
        return "let limited = " + z10 + ";\nlet power = \"" + str + "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_window')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            if (!document.getElementById(\"wlan_ss_view_data_edit_wlan_ss_transpwr_ctrl\")) {\n                (new Array(...document.getElementsByClassName(\"pull-left third_menu_font paddingtop_5 marginleft_3\"))).filter(item => item.innerText.includes(\"Advanced\"))[0].click()\n            } else {\n                Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n                Atp.WlanSendSettingsController.content[0].WlanStandard = (limited) ? \"b\" : \"b/g/n\";\n                Atp.WlanSendSettingsController.content[0].TransmitPower = Number(power);\n                document.getElementById(\"SendSettings_submitbutton\").click();\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // p8.g, o8.a
    public final String f(String str, String str2, String str3, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        sb.append("let ssid = \"");
        sb.append(str);
        sb.append("\";\nlet hidden = ");
        sb.append(z10);
        sb.append(";\nlet password = \"");
        sb.append(str2);
        sb.append("\";\nlet open = ");
        sb.append(z11);
        sb.append(";\nlet maxClients = \"");
        return b.b(sb, str3, "\";\n\nlet applied = false;\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_window')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n\n            if (!document.getElementById(\"wlan_wifi_mi_ssid2_4GHz1_ctrl\")) {\n                (new Array(...document.getElementsByClassName(\"pull-left third_menu_font paddingtop_5 marginleft_3\"))).filter(item => item.innerText.includes(\"WLAN\"))[0].click()\n            } else if (document.getElementById(\"wlan_enc_view_data_submitstatusview_failview\")) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"complex_wlan_password_needed\" }));\n            }\n            else if (applied) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n            else {\n                Atp.WlanSendSettingsController.content[0].WifiSsid = ssid;\n                Atp.WlanSendSettingsController.content[0].X_AssociateDeviceNum = maxClients\n                Atp.WlanSendSettingsController.content[0].WifiHideBroadcast = hidden;\n\n                if (!open) {\n                    Atp.WlanSendSettingsController.content[0].BeaconType = \"WPAand11i\"\n                    password && (Atp.WlanSendSettingsController.content[0].WpaPreSharedKey = password);\n                } else {\n                    Atp.WlanSendSettingsController.content[0].BeaconType = \"None\";\n                }\n                if (document.getElementById(\"AllSsidSettings_submitbutton\")) {\n                    document.getElementById(\"AllSsidSettings_submitbutton\").click();\n                    applied=true;    \n                }\n            }\n        }\n    } catch (err){ }\n}, 1000);");
    }

    @Override // p8.g, o8.a
    public final String j(String str, String str2) {
        return d.b("let username = \"", str, "\";\nlet password = \"", str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 25000);\nlet temp = setInterval(() => {\n    if (document.getElementById('login_window')) {\n        let errMsg = document.getElementById('errorCategory').innerText;\n        if (errMsg.includes(\"minute\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"retry_after\", time: 60 }));\n        }\n        else if (errMsg.includes(\"You are already logged in.\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"already_login\" }));\n        }\n        else {\n\n            if (document.getElementById(\"setfirstbutton\")) {\n                Android.callbackHandle(JSON.stringify({ result: \"enforce_login\" }));\n                document.getElementById(\"setfirstbutton\").click();\n            } else {\n                if (errMsg.includes(\"Incorrect\")) {\n                    Android.callbackHandle(JSON.stringify({ result: \"invalid_login\" }));\n                }\n                if (document.getElementById('index_username')) {\n                    Android.callbackHandle(JSON.stringify({ result: \"logging_in\" }));\n                    document.getElementById('index_username').value = username;\n                    document.getElementById('password').value = password;\n                    document.getElementById(\"loginbtn\").click();\n                }\n            }\n        }\n    } else if (document.getElementById('wizard_wifi_title')) {\n        clearInterval(temp);\n        clearTimeout(exit);\n        Android.callbackHandle(JSON.stringify({ result: \"login_success\" }));\n    }\n}, 1000);");
    }

    @Override // p8.g, o8.a
    public final String q() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_window')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            let limit = Atp.WlanObj.content.WlanStandard;\n            let power = Atp.WlanObj.content.TransmitPower;\n\n            Android.callbackHandle(JSON.stringify({\n                result: \"limit_wifi_info\",\n                speed: limit,\n                power: power + \"%\"\n            }));\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify(info));\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // p8.g, o8.a
    public final String v() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit)\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_window')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            Atp.WlanObj.isShow24Password = true;\n            Atp.WlanObj.loadPassword();\n            if (Atp.WlanObj.content.WpaPreSharedKey != \"********\") {\n                let wlanInfo = Atp.WlanObj.content;\n                Android.callbackHandle(JSON.stringify({\n                    result: \"basic_wifi_info\",\n                    ssidName: wlanInfo.WifiSsid,\n                    password: wlanInfo.WpaPreSharedKey,\n                    hidden: wlanInfo.WifiHideBroadcast,\n                    safe: wlanInfo.BeaconType,\n                    maxClients: wlanInfo.X_AssociateDeviceNum\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }
}
