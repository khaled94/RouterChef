package p8;

import l0.d;
import o8.a;
import s.b;

/* loaded from: classes.dex */
public final class m extends a {
    public m() {
        this.f16791d = "TotoLink_ND300";
        this.f16792e = "/wlbasic.htm";
        this.f16794g = "/dhcptbl.htm";
        this.f16795h = "/adslconfig.htm";
        this.f16797j = "/ipqostc.htm";
        this.f16798k = "/wan.htm";
        this.f16799l = "/reboot.htm";
        this.f16800m = "/dhcpd.htm";
        this.f16801n = "/wlactrl.htm";
        this.f16802o = "/wlactrl.htm";
        this.f16806t = true;
        this.f16805s = true;
        this.f16807u = true;
        this.f16811z = false;
        this.f16810x = false;
        this.y = false;
        this.f16804r = true;
        this.f16803q = false;
    }

    @Override // o8.a
    public final String b(boolean z10, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("let ispDns = ");
        sb.append(z10);
        sb.append(";\nlet dns1 = \"");
        sb.append(str);
        sb.append("\";\nlet dns2 = \"");
        return b.b(sb, str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (document.getElementsByName(\"dns1\").length > 0) {\n                if (ispDns) {\n                    document.getElementsByName(\"dns1\")[0].value = document.getElementsByName(\"dfgw\")[0].value;\n                } else {\n                    document.getElementsByName(\"dns1\")[0].value = dns1;\n                    document.getElementsByName(\"dns2\")[0].value = dns2\n                }\n                document.querySelectorAll('input[type=submit]')[0].click();\n                clearInterval(temp);\n                clearTimeout(exit);\n                setTimeout(() => {\n                    Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                }, 1000)\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public final String d(String str, String str2) {
        return d.b("let pppUsername = \"", str, "\";\nlet pppPassword = \"", str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if(!window.location.pathname.includes(\"wizzion_fast_config.htm\")){\n                clearInterval(temp);\n                clearTimeout(exit);\n                window.location.pathname = \"wizzion_fast_config.htm\";\n            }\n            else  {\n                if(document.getElementById(\"country\")){\n                    document.getElementById('country').value = 12;\n                    onChangeCountry();\n                    document.getElementById('isplist').value = 170;\n                    onChangeISP();\n                    document.getElementsByName('pppUserName')[0].value = pppUsername;\n                    document.getElementsByName('pppPassword')[0].value = pppPassword;\n                    document.querySelectorAll('input[type=submit]')[0].click();\n                    Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                }\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public final String e(boolean z10, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("let limited = ");
        sb.append(z10);
        sb.append(";\nlet upload = ");
        sb.append(str);
        sb.append(";\nlet download = ");
        return b.b(sb, str2, ";\n\nupload *= 1024;\ndownload *= 1024;\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else {\n            if (document.qostc) {\n                Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n                document.qostc.total.value = !limited ? '0' : upload;\n                document.qostc.downtotal.value = !limited ? '0' : download;\n                document.qostc.applyItflimit.click();\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n        }\n    } catch (err){ }\n}, 500);\n");
    }

    @Override // o8.a
    public final String g(boolean z10, String str, String str2, String str3, boolean z11, boolean z12) {
        return "let ssid = \"" + str + "\";\nlet hidden = " + z11 + ";\nlet password = \"" + str2 + "\";\nlet open = " + z12 + ";\nlet maxClients = \"" + str3 + "\";\nlet security = " + z10 + ";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_body')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else {\n            let path = window.location.pathname;\n            if (!path.includes(\"wlbasic.htm\") && !path.includes(\"wladvanced.htm\") && !path.includes(\"wlwpa.htm\")) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                window.location.pathname = \"/wlbasic.htm\";\n            } else {\n                if (path.includes(\"wlbasic.htm\")) {\n                    if (document.getElementsByName(\"ssid\").length > 0) {\n                        if (document.getElementsByName(\"ssid\")[0].value == ssid) {\n                            clearInterval(temp);\n                            clearTimeout(exit);\n                            window.location.pathname = !security ? \"wladvanced.htm\" : 'wlwpa.htm';\n                        } else {\n                            document.getElementsByName(\"ssid\")[0].value = ssid;\n                            document.wlanSetup.save.click();\n                            clearInterval(temp);\n                            clearTimeout(exit);\n                            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                        }\n                    }\n                }\n                else if (path.includes(\"wladvanced.htm\")) {\n                    if (document.querySelectorAll(`input[type=radio][value=\"1\"][name='hiddenSSID'`).length > 0) {\n                        if (hidden) {\n                            document.querySelectorAll(`input[type=radio][value=\"1\"][name='hiddenSSID'`)[0].checked = true;\n                        } else {\n                            document.querySelectorAll(`input[type=radio][value=\"0\"][name='hiddenSSID'`)[0].checked = true;\n                        }\n                        document.advanceSetup.submit();\n                        clearInterval(temp);\n                        clearTimeout(exit);\n                        Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                    }\n                }\n                else if (path.includes(\"wlwpa.htm\")) {\n                    if (document.formEncrypt) {\n                        document.formEncrypt.method.value = open ? '0' : '6';\n                        if (password) document.formEncrypt.pskValue.value = password;\n                        document.formEncrypt.save.click();\n                        clearInterval(temp);\n                        clearTimeout(exit);\n                        Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                    }\n                }\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String h(String str, String str2) {
        return i(str, str2);
    }

    @Override // o8.a
    public final String i(String str, String str2) {
        return e0.d.a("let mac = \"", str2, "\";\nmac = mac.toLowerCase().replace(/:/ig, '');\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else if (document.formWlAcAdd.mac) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            document.formWlAcAdd.mac.value = mac\n            document.formWlAcAdd.addFilterMac.click();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public final String j(String str, String str2) {
        return d.b("let username = \"", str, "\";\nlet password = \"", str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 20000);\nlet temp = setInterval(() => {\n    if (window.location.href.includes('login.cgi')) {\n        clearInterval(temp);\n        clearTimeout(exit);\n        Android.callbackHandle(JSON.stringify({ result: \"retry_after\", time: parseInt(1) }));\n    } else {\n        if (document.getElementById('login_body')) {\n            Android.callbackHandle(JSON.stringify({ result: \"logging_in\" }));\n            document.getElementById('username').value = username;\n            document.getElementById('password').value = password;\n            document.getElementById('loginBtn').click();\n        }\n        else if (document.querySelector(\"#nav\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"login_success\" }));\n        }\n    }\n}, 500);");
    }

    @Override // o8.a
    public final String k() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            [...document.getElementsByTagName('input')].filter(e => e.defaultValue == 'Reboot')[0].click();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);\n";
    }

    @Override // o8.a
    public final String l() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            [...document.getElementsByTagName('input')].filter(e => e.defaultValue == 'Restore to Default Setting')[0].click();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String n() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n\n            blockedDevices = [...document.getElementsByTagName('font')].map(dev => {\n                let mac = dev.innerText.replace(/.{2}/g, '$&:').slice(0, -1);;\n                return {\n                    mac: mac,\n                    hostname: \"Unknown\"\n                }\n            });\n            clearInterval(temp);\n            clearTimeout(exit);\n            if (blockedDevices.length) {\n                Android.callbackHandle(JSON.stringify({\n                    result: \"blacklist_devices_info\",\n                    devices: blockedDevices\n                }));\n            } else {\n                Android.callbackHandle(JSON.stringify({ result: \"no_devices_found\" }));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String o() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_body')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            let lanDevices = [...document.getElementsByTagName('tr')].slice(1).map(dev => {\n                return {\n                    mac: dev.children[2].innerText,\n                    ip: dev.children[1].innerText,\n                    hostname: dev.children[0].innerText,\n                }\n            })\n\n            if (lanDevices.length) {\n                info = {\n                    result: \"connected_devices_info\",\n                    devices: lanDevices\n                }\n                Android.callbackHandle(JSON.stringify(info));\n            } else {\n                Android.callbackHandle(JSON.stringify({ result: \"no_devices_found\" }));\n            }\n            clearInterval(temp);\n            clearTimeout(exit);\n        }\n    } catch (err){ }\n}, 500);\n";
    }

    @Override // o8.a
    public final String p() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (document.getElementsByName(\"dns1\").length > 0) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                let isIspDns = document.getElementsByName(\"dfgw\")[0].value == document.getElementsByName(\"dns1\")[0].value;\n                Android.callbackHandle(JSON.stringify({\n                    result: \"dns_info\",\n                    ispDns: isIspDns,\n                    dns1: !isIspDns ? document.getElementsByName(\"dns1\")[0].value : null,\n                    dns2: !isIspDns ? document.getElementsByName(\"dns2\")[0].value : null\n                }));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String r() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_body')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            let uploadValue = document.getElementsByTagName(\"td\")[2].innerText.split(' kbps')[0]\n            let downloadValue = document.getElementsByTagName(\"td\")[3].innerText.split(' kbps')[0]\n            let upload = (Number(uploadValue) / 1024).toFixed(1);\n            let download = (Number(downloadValue) / 1024).toFixed(1);\n            let lineRateMb = upload + \"/\" + download + \" Mbps\";\n\n            if (document.getElementsByTagName(\"td\")[0].innerText != 'SHOWTIME.L0') {\n                Android.callbackHandle(JSON.stringify({ result: \"null_dsl_info\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            } else {\n                let info = {\n                    result: \"dsl_info\",\n                    modType: document.getElementsByTagName(\"td\")[1].innerText,\n                    upload: upload,\n                    download: download,\n                    lineRate: lineRateMb,\n                    maxUpload: null,\n                    maxDownload: null,\n                    maxRate: null,\n                    noise: document.getElementsByTagName(\"td\")[7].innerText + \"/\" + document.getElementsByTagName(\"td\")[6].innerText + \" dB\",\n                    chanType: null,\n                    depth: null,\n                    delay: null,\n                    crc: document.getElementsByTagName(\"td\")[10].innerText,\n                    fec: document.getElementsByTagName(\"td\")[16].innerText + \"/\" + document.getElementsByTagName(\"td\")[15].innerText,\n                    upTime: null\n                }\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify(info));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String s() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (document.formWlAcAdd) {\n                let enabled = document.formWlAcAdd.wlanAcEnabled.value == '2';\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({\n                    result: \"filter_status_info\",\n                    blockerEnabled: enabled\n                }));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String t() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (document.getElementsByName('pppoeusername')[0]) {\n                Android.callbackHandle(JSON.stringify({\n                    result: \"ppp_info\",\n                    pppUsername: document.getElementsByName('pppoeusername')[0].innerText,\n                    pppPassword: null\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            } else {\n                Android.callbackHandle(JSON.stringify({\n                    result: \"ppp_info\",\n                    pppUsername: 'Not Set',\n                    pppPassword: null\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String u() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else {\n            if (document.qostc) {\n                let uploadValue = document.qostc.total.value;\n                let downloadValue = document.qostc.downtotal.value;\n                if (uploadValue != '0' || downloadValue != '0') {\n                    curUpload = (Number(uploadValue) / 1024).toFixed(1);\n                    curDownload = (Number(downloadValue) / 1024).toFixed(1);\n                    Android.callbackHandle(JSON.stringify({\n                        result: \"personalized_limit_info\",\n                        upload: curUpload,\n                        download: curDownload,\n                        maxUpload: null,\n                        maxDownload: null,\n                        limited: true,\n                    }));\n                } else {\n                    Android.callbackHandle(JSON.stringify({\n                        result: \"personalized_limit_info\",\n                        upload: null,\n                        download: null,\n                        maxUpload: null,\n                        maxDownload: null,\n                        limited: false,\n                    }));\n                }\n            }\n            clearInterval(temp);\n            clearTimeout(exit);\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String v() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 20000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('login_body')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (window.location.href.includes(\"wlbasic.htm\") && document.getElementsByName(\"ssid\").length > 0) {\n                localStorage.setItem('ssid', document.getElementsByName(\"ssid\")[0].value);\n                clearInterval(temp);\n                window.location.pathname = \"wladvanced.htm\";\n            } else if (window.location.href.includes(\"wladvanced.htm\") && document.querySelectorAll(`input[type=radio][value=\"1\"][name='hiddenSSID'`).length > 0) {\n                Android.callbackHandle(JSON.stringify({\n                    result: \"basic_wifi_info_1\",\n                    ssidName: localStorage.getItem('ssid'),\n                    password: null,\n                    hidden: document.querySelectorAll(`input[type=radio][value=\"1\"][name='hiddenSSID'`)[0].checked,\n                    safe: null,\n                    maxClients: null\n                }));\n                clearInterval(temp);\n                window.location.pathname = \"wlwpa.htm\";\n            } else if (window.location.href.includes(\"wlwpa.htm\") && document.formEncrypt) {\n                Android.callbackHandle(JSON.stringify({\n                    result: \"basic_wifi_info_2\",\n                    ssidName: null,\n                    password: null,\n                    hidden: null,\n                    safe: document.formEncrypt.method.value != '0',\n                    maxClients: null\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String w(boolean z10) {
        return "let blockerEnabled = " + z10 + ";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else {\n            if (document.formWlAcAdd) {\n                Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n                document.formWlAcAdd.wlanAcEnabled.value = blockerEnabled ? '2' : '0';\n                saveChanges()\n                document.formWlAcAdd.setFilterMode.click()\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String x(String str, String str2) {
        return e0.d.a("let mac = \"", str2, "\";\n\nmac = mac.toLowerCase().replace(/:/ig, '');\n\nfunction delEntryCheck() { return true }\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (document.querySelectorAll(`input[type=radio][value=\"${mac}\"]`)[0]) {\n                document.querySelectorAll(`input[type=radio][value=\"${mac}\"]`)[0].checked = true;\n                document.getElementsByName('deleteSelFilterMac')[0].click();\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }
}
