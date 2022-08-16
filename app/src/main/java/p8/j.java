package p8;

import l0.d;

/* loaded from: classes.dex */
public class j extends d {
    public j() {
        this.f16791d = "HG8145V5";
        this.f16794g = "/CustomApp/mainpage.asp#Contectdevmngt";
        this.f16795h = "/html/ssmp/deviceinfo/dslinfo.asp";
        this.f16796i = "/html/amp/wlanadv/WlanAdvance.asp?2G";
        this.f16798k = "/html/bbsp/wan/wan_dtedata.asp";
        this.f16799l = "/html/ssmp/fireware/firmware.asp";
        this.f16800m = "/html/bbsp/dhcpservercfg/dhcp2.asp";
        this.f16801n = "/html/bbsp/userdevinfo/userdevinfosmart.asp";
        this.f16802o = "/html/bbsp/userdevinfo/userdevinfosmart.asp";
        this.f16808v = true;
    }

    @Override // p8.d, o8.a
    public final String c(boolean z10, String str) {
        return "let limited = " + z10 + ";\nlet power = \"" + str + "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (document.getElementById(\"applyButton\")) {\n                document.getElementById(\"X_HW_Standard\").value = limited ? \"11b\" : \"11bgn\";\n                X_HW_StandardChange(this);\n                document.getElementById(\"TransmitPower\").value = power;\n                setTransmitPowerSug();\n                Submit();\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // p8.d, o8.a
    public final String d(String str, String str2) {
        return d.b("let username=\"", str, "\";\nlet password=\"", str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (document.getElementById(\"ConfigForm\").style.display != \"none\" && document.getElementById(\"UserName\")) {\n                document.getElementById(\"UserName\").value = username;\n                document.getElementById(\"Password\").value = password;\n                document.getElementById(\"ButtonApply\").click();\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            } else {\n                selectLine(\"wanInstTable_record_0\");\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // p8.d, o8.a
    public final String h(String str, String str2) {
        return i(str, str2);
    }

    @Override // p8.d, o8.a
    public final String i(String str, String str2) {
        return e0.d.a("let mac = \"", str2, "\";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 12000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (typeof setMacFilterList !== \"undefined\") {\n                if (true == setMacFilterList(0, [{\n                    \"MacAddr\": mac,\n                    \"Port\": \"SSID1\",\n                    \"PortID\": \"SSID1\",\n                    \"PortType\": \"WIFI\",\n                    \"DeviceType\": \"0\",\n                }])) {\n                    setTimeout(() => Android.callbackHandle(JSON.stringify({ result: \"executed\" })), 2000);\n                    clearInterval(temp);\n                    clearTimeout(exit);\n                }else{\n                    Android.callbackHandle(JSON.stringify({ result: \"block_device_failed\" }));\n                }\n            }\n        }\n    } catch (err){ }\n}, 1000);");
    }

    @Override // p8.d, o8.a
    public final String k() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            var Form = new webSubmitForm();\n            Form.setAction('set.cgi?x=InternetGatewayDevice.X_HW_DEBUG.SMP.DM.ResetBoard'\n                + '&RequestFile=html/ssmp/fireware/firmware.asp');\n            Form.addParameter('x.X_HW_Token', getValue('onttoken'));\n            Form.submit();\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // p8.d, o8.a
    public final String l() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            var Form = new webSubmitForm();\n            Form.setAction('restoredefaultcfg.cgi?RequestFile=html/ssmp/fireware/firmware.asp');\n            Form.addParameter('x.X_HW_Token', getValue('onttoken'));\n            Form.submit();\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // p8.d, o8.a
    public final String n() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 12000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (typeof WlanMacFilter !== \"undefined\" && typeof WifiDev !== \"undefined\") {\n                let blockedMacs = [... new Set(WlanMacFilter.filter(ele => ele).reduce((acc, ele) => [...acc, ele.MACAddress], []))];\n                if(blockedMacs.length){\n                    let blockedDevices = blockedMacs.map(mac => {\n                        let devInfo = WifiDev.filter(dev => dev.MacAddr == mac)[0];\n                        return {\n                            hostname: devInfo ? devInfo.HostName : \"Unknown\",\n                            mac: mac\n                        }\n                    });\n                    Android.callbackHandle(JSON.stringify({\n                        result: \"blacklist_devices_info\",\n                        devices: blockedDevices\n                    }));\n                }else{\n                    Android.callbackHandle(JSON.stringify({ result: \"no_devices_found\" }));\n\n                }\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n        }\n    } catch (err){ }\n}, 1000);";
    }

    @Override // p8.d, o8.a
    public final String o() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000);\n\nlet temp = setInterval(() => {\n    if (document.getElementById('DivErrPromt')) {\n        clearInterval(temp);\n        clearTimeout(exit);\n        Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n    } else {\n        Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n        let devices = UserDevInfo.filter(device => device && device.DevStatus == \"Online\" && device.PortType == \"WIFI\")\n            .map(device => { return { ip: device.IpAddr, mac: device.MacAddr, hostname: device.HostName } });\n\n            if (devices.length) {\n                info = {\n                    result: \"connected_devices_info\",\n                    devices: devices\n                }\n                Android.callbackHandle(JSON.stringify(info));\n            } else {\n                Android.callbackHandle(JSON.stringify({ result: \"no_devices_found\" }));\n            }\n            clearInterval(temp);\n            clearTimeout(exit);\n    }\n}, 500);";
    }

    @Override // p8.d, o8.a
    public final String q() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            let limit = document.getElementById(\"X_HW_Standard\").value;\n            Android.callbackHandle(JSON.stringify({\n                result: \"limit_wifi_info\",\n                speed: limit==\"11b\" ? \"b\" : limit,\n                power: document.getElementById(\"TransmitPower\").value + \"%\"\n            }));\n\n            clearInterval(temp);\n            clearTimeout(exit);\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // p8.d, o8.a
    public final String s() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 12000);\n\n\nfunction isFilterEnabled() {\n    if (typeof enableWlanMacFilter !== \"undefined\")\n        return enableWlanMacFilter == \"1\";\n\n    if (typeof enableFilter !== \"undefined\")\n        return enableFilter == \"1\";\n    return null;\n}\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (isFilterEnabled()!=null) {\n                Android.callbackHandle(JSON.stringify({\n                    result: \"filter_status_info\",\n                    blockerEnabled: isFilterEnabled()\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n        }\n    } catch (err){ }\n}, 1000);";
    }

    @Override // p8.d, o8.a
    public final String t() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (Wan[0]) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({\n                    result: \"ppp_info\",\n                    pppUsername: Wan[0].Username.split(\"@\")[0],\n                    pppPassword: null\n                }));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // p8.d, o8.a
    public final String w(boolean z10) {
        return "let blockerEnabled = " + z10 + ";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 12000);\n\nfunction toggleMacFilter(Enable) {\n    var WMacfilterRightSpecCfgParaList = new Array();\n\n    if (Enable == true) {\n        WMacfilterRightSpecCfgParaList.push(new stSpecParaArray(\"x.WlanMacFilterRight\", 1, 1));\n    }\n    else {\n        WMacfilterRightSpecCfgParaList.push(new stSpecParaArray(\"x.WlanMacFilterRight\", 0, 1));\n    }\n    var Parameter = {};\n    Parameter.asynflag = null;\n    Parameter.FormLiList = ['EnableMacFilter', 'FilterMode'];\n    Parameter.SpecParaPair = WMacfilterRightSpecCfgParaList;\n    var tokenvalue = getValue('onttoken');\n    var url = 'set.cgi?x=InternetGatewayDevice.X_HW_Security'\n        + '&RequestFile=html/bbsp/wlanmacfilter/wlanmacfilter.asp';\n\n    HWSetAction(null, url, Parameter, tokenvalue);\n}\n\nfunction isFilterEnabled() {\n    if (typeof enableWlanMacFilter !== \"undefined\")\n        return enableWlanMacFilter == \"1\";\n\n    if (typeof enableFilter !== \"undefined\")\n        return enableFilter == \"1\";\n    return null;\n}\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (isFilterEnabled() == blockerEnabled) {\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            } else {\n                toggleMacFilter(blockerEnabled);\n            }\n        }\n    } catch (err){ }\n}, 1000);";
    }

    @Override // p8.d, o8.a
    public final String x(String str, String str2) {
        return e0.d.a("let mac = \"", str2, "\";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 12000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('DivErrPromt')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (typeof setMacFilterList !== \"undefined\") {\n                if (true == setMacFilterList(0, [{\n                    \"MacAddr\": mac,\n                    \"Port\": \"SSID1\",\n                    \"PortID\": \"SSID1\",\n                    \"PortType\": \"WIFI\",\n                    \"DeviceType\": \"0\",\n                }])) {\n                    setTimeout(() => Android.callbackHandle(JSON.stringify({ result: \"executed\" })), 2000);\n                    clearInterval(temp);\n                    clearTimeout(exit);\n                }else{\n                    Android.callbackHandle(JSON.stringify({ result: \"unblock_device_failed\" }));\n                }\n            }\n        }\n    } catch (err){ }\n}, 1000);");
    }
}
