package p8;

import l0.d;
import o8.a;
import s.b;

/* loaded from: classes.dex */
public class e extends a {
    public e() {
        this.f16791d = "HG531V1";
        this.f16792e = "/html/ntwkall/wlan.asp";
        this.f16794g = "/html/status/ethenet.asp";
        this.f16795h = "/html/status/dslinfo.asp";
        this.f16796i = "/html/ntwkall/wlan.asp";
        this.f16798k = "/html/content1.asp";
        this.f16799l = "/html/management/reset.asp";
        this.f16800m = "/html/content1.asp";
        this.f16801n = "/html/content1.asp";
        this.f16802o = "/html/content1.asp";
        this.f16806t = true;
        this.f16807u = true;
        this.f16811z = false;
    }

    @Override // o8.a
    public String b(boolean z10, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("let ispDns = ");
        sb.append(z10);
        sb.append(";\nlet dns1 = \"");
        sb.append(str);
        sb.append("\";\nlet dns2 = \"");
        return b.b(sb, str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 12000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#DnsSrvOne\")) {   \n                document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#DnsSrvOne\").value = ispDns ? document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#ethIpAddress\").value : dns1;\n                document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#DnsSrvTwo\").value = ispDns ? document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#ethIpAddress\").value : dns2;\n                document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#btnDHCPServerSubmit\").click();\n\n                clearInterval(temp);\n                clearTimeout(exit);\n                setTimeout(() => {\n                    Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                }, 1000)\n            }\n            else if (window.location.pathname == \"/html/content1.asp\") {\n                document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelector(\"#link_Admin_1_1\").click();\n            } else {\n                window.location.pathname = \"/html/content1.asp\"\n            }\n        }\n    } catch (err){ }\n}, 1000);");
    }

    @Override // o8.a
    public final String c(boolean z10, String str) {
        return "let limited = " + z10 + ";\nlet power = \"" + str + "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#trSSID\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            let newDoc = document.querySelector(\"frameset #contentfrm\").contentWindow.document;\n\n            newDoc.querySelector(\"select[name='wlgnMode']\").value = (limited) ? \"b\" : \"b/g/n\";\n            document.querySelector(\"frameset #contentfrm\").contentWindow.gModeChange();\n\n            newDoc.querySelector(\"input[name='wlTxPwr']\").value = Number(power) / 5;\n            newDoc.querySelector(\"button[name='btnApply']\").click();\n\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        } else {\n            if (window.location.pathname == \"/html/content1.asp\") {\n                document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelector(\"#link_Admin_1_2\").click();\n            } else {\n                window.location.pathname = \"/html/content1.asp\"\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public String d(String str, String str2) {
        return d.b("let username = \"", str, "\";\nlet password = \"", str2, "\";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#IdPppUserSuf\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#IdPppUser\").value = username;\n            document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#IdPppPasswd\").value = password;\n            document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"button[name='btnApply']\").click();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        } else {\n            if (window.location.pathname == \"/html/content1.asp\") {\n                document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelector(\"#link_Admin_1_0\").click();\n            } else {\n                window.location.pathname = \"/html/content1.asp\"\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public String f(String str, String str2, String str3, boolean z10, boolean z11) {
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
        return b.b(sb, str3, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#trSSID\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            let newDoc = document.querySelector(\"frameset #contentfrm\").contentWindow.document;\n            if (newDoc.querySelector(\"input[name='wlSsid']\") && newDoc.querySelector(\"input[name='wlSsid']\").value != \"\") {\n                newDoc.querySelector(\"input[name='wlSsid']\").value = ssid;\n                newDoc.querySelector(\"input[name='wlHide']\").checked = hidden;\n                newDoc.querySelector(\"select[name='wlnAuthMode']\").value = open ? \"Basic_None\" : \"WPAand11i\";\n                !open && password && (newDoc.querySelector(\"input[name='wlWpaPsk']\").value = password);\n                newDoc.querySelector(\"input[name='X_AssociateDeviceNum']\").value = maxClients;\n                document.querySelector(\"frameset #contentfrm\").contentWindow.hideBroadcast();\n                newDoc.querySelector(\"button[name='btnApply']\").click();\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n        } else {\n            if (window.location.pathname == \"/html/content1.asp\") {\n                document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelector(\"#link_Admin_1_2\").click();\n            } else {\n                window.location.pathname = \"/html/content1.asp\"\n            }\n        }\n    } catch (err){ }\n}, 1000);\n");
    }

    @Override // o8.a
    public final String h(String str, String str2) {
        return i(str, str2);
    }

    @Override // o8.a
    public final String i(String str, String str2) {
        return e0.d.a("let mac = \"", str2, "\";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#isFilter\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            let newWindow = document.querySelector(\"frameset #contentfrm\").contentWindow;\n            if (!newWindow.document.querySelector(\"#isFilter\").checked) {\n                Android.callbackHandle(JSON.stringify({ result: \"mac_filter_disabled\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            } else {\n                newWindow.clickAdd(\"WLAN Filtering\");\n                if (newWindow.document.getElementsByName(\"X_WlanSrcMacAddress\")[0].value == '') {\n                    newWindow.document.getElementsByName(\"X_WlanSrcMacAddress\")[0].value = mac;\n                    newWindow.Submit();\n                    Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                    clearInterval(temp);\n                    clearTimeout(exit);\n                } else {\n                    newWindow.clickAdd(\"WLAN Filtering\");\n                }\n            }\n        } else {\n            if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.title == \"WLAN\") {\n                document.querySelector(\"frameset #tabfrm\").contentWindow.document.querySelectorAll(\"#tdTableMenu table tbody tr td\")[7].click();\n            } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.title != \"WLAN\") {\n                let wlanItem = [...document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelectorAll(\".trMenuItem\")].filter((item) => item.children[0].innerHTML.includes(\"WLAN\"))[1]\n                wlanItem && wlanItem.children[0].children[0].children[0].children[0].children[2].children[0].click();\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public String j(String str, String str2) {
        return d.b("let username = \"", str, "\";\nlet password = \"", str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 25000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.querySelector(\"#erroinfoId font\") && document.querySelector(\"#erroinfoId font\").innerText.includes(\"one minute\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"retry_after\", time: 60 }));\n        }\n        else {\n            if (document.querySelector(\"#contentfrm\") && document.querySelector(\"#contentfrm\").contentWindow.document.getElementById(\"oldPassword\")) {\n                top.location.replace('/html/content.asp');\n            }\n            else if (document.getElementById(\"IdPppUserSuf\") || (document.getElementById(\"loginmid0\") && !document.getElementById(\"btnLogin\"))) {\n                Android.callbackHandle(JSON.stringify({ result: \"enforce_login\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n                advanced();\n            }\n            else if (document.getElementById('txt_Username')) {\n                Android.callbackHandle(JSON.stringify({ result: \"logging_in\" }));\n                document.getElementById('txt_Username').value = username;\n                document.getElementById('txt_Password').value = password;\n                document.getElementById('btnLogin').click();\n            } else if (document.querySelector(\"frameset #listfrm\")) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"login_success\" }));\n            }\n        }\n    } catch (err) { }\n}, 500);");
    }

    @Override // o8.a
    public String k() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"loginmid\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            var form = new webSubmitForm();\n            form.setAction('reboot.cgi?RequestFile=/html/management/reset.asp');\n            form.submit();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public String l() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"loginmid\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            var form = new webSubmitForm();\n            form.setAction('restoredefcfg.cgi?RequestFile=/html/management/reset.asp');\n            form.submit();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String n() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#isFilter\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            let newWindow = document.querySelector(\"frameset #contentfrm\").contentWindow;\n            if (!newWindow.document.querySelector(\"#isFilter\").checked) {\n                Android.callbackHandle(JSON.stringify({ result: \"mac_filter_disabled\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }else{\n                let blockedDevs = newWindow.WlanSrcMacAddress.filter(e => e[0] != null)[0];\n                if (blockedDevs) {\n                    blockedDevs = blockedDevs.filter(e => e)\n                    let blockedDevices = blockedDevs.map(d => {\n                        return {\n                            mac: d.MacAddresss,\n                            hostname: \"Unknown\"\n                        }\n                    })\n                    Android.callbackHandle(JSON.stringify({\n                        result: \"blacklist_devices_info\",\n                        devices: blockedDevices\n                    }));\n                    clearInterval(temp);\n                    clearTimeout(exit);\n    \n                } else {\n                    Android.callbackHandle(JSON.stringify({ result: \"no_devices_found\" }));\n                }\n            }\n        } else {\n            if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.title == \"WLAN\") {\n                document.querySelector(\"frameset #tabfrm\").contentWindow.document.querySelectorAll(\"#tdTableMenu table tbody tr td\")[7].click();\n            } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.title != \"WLAN\") {\n                let wlanItem = [...document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelectorAll(\".trMenuItem\")].filter((item) => item.children[0].innerHTML.includes(\"WLAN\"))[1]\n                wlanItem && wlanItem.children[0].children[0].children[0].children[0].children[2].children[0].click();\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public String o() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementsByClassName(\"loginmid\")[0]) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n\n            let hostNames = [];\n            let devicesMacs = [];\n            let devicesIps = [];\n\n            for (i = 0; i < DeviceInfo.length - 1; i++) {\n                if (1 == parseInt(DeviceInfo[i][5])) {\n                    hostNames.push(DeviceInfo[i][1]);\n                    devicesIps.push(DeviceInfo[i][2]);\n                    devicesMacs.push(DeviceInfo[i][3]);\n                }\n            }\n            let devices = [];\n            for (let i = 0; i < devicesMacs.length; i++) {\n                devices.push({\n                    hostname: hostNames[i],\n                    mac: devicesMacs[i],\n                    ip: devicesIps[i]\n                });\n            }\n            if (devices.length) {\n                info = {\n                    result: \"connected_devices_info\",\n                    devices: devices\n                }\n                Android.callbackHandle(JSON.stringify(info));\n            } else {\n                Android.callbackHandle(JSON.stringify({ result: \"no_devices_found\" }));\n            }\n            clearInterval(temp);\n            clearTimeout(exit);\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public String p() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({\n        result: \"dns_not_supported\",\n    }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#DnsSrvOne\")) {\n                let dns1 = document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#DnsSrvOne\").value;\n                let dns2 = document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#DnsSrvTwo\").value;\n                let isIspDns = (dns1 == document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#ethIpAddress\").value);\n\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({\n                    result: \"dns_info\",\n                    ispDns: isIspDns,\n                    dns1: dns1,\n                    dns2: dns2\n                }));\n            }\n\n            else if (window.location.pathname == \"/html/content1.asp\") {\n                document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelector(\"#link_Admin_1_1\").click();\n            } else {\n                window.location.pathname = \"/html/content1.asp\"\n            }\n\n        }\n    } catch (err){ }\n}, 1000);";
    }

    @Override // o8.a
    public final String q() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            let wlanInfo = Wlan[0];\n            Android.callbackHandle(JSON.stringify({\n                result: \"limit_wifi_info\",\n                speed: wlanInfo.mode,\n                power: Number(wlanInfo.power) * 5 + \"%\"\n            }));\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify(info));\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public String r() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000);\n\nfunction secondsToHms(d) {\n    d = Number(d);\n    var h = Math.floor(d / 3600);\n    var m = Math.floor(d % 3600 / 60);\n\n    var hDisplay = h > 0 ? h + (h == 1 ? \" hour \" : \" hours \") : \"\";\n    var mDisplay = m > 0 ? m + (m == 1 ? \" minute\" : \" minutes\") : \"\";\n    return hDisplay + mDisplay;\n}\n\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"loginmid\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            dslInfo = DslInfo;\n\n            if (dslInfo.status == \"NoSignal\") {\n                Android.callbackHandle(JSON.stringify({ result: \"null_dsl_info\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            } else {\n                let upload = (Number(dslInfo.UpCurrRate) / 1024).toFixed(1);\n                let download = (Number(dslInfo.DownCurrRate / 1024)).toFixed(1);\n                let lineRateMb = upload + \"/\" + download + \" Mbps\";\n                let maxUpload = (Number(dslInfo.UpstreamMaxRate) / 1024).toFixed(1);\n                let maxDownload = (Number(dslInfo.DownstreamMaxRate) / 1024).toFixed(1);\n                let maxRateMb = maxUpload + \"/\" + maxDownload + \" Mbps\";\n                let info = {\n                    result: \"dsl_info\",\n                    modType: dslInfo.Modulation,\n                    upload: upload,\n                    download: download,\n                    lineRate: lineRateMb,\n                    maxUpload: maxUpload,\n                    maxDownload: maxDownload,\n                    maxRate: maxRateMb,\n                    noise: (dslInfo.UpMargin/10.0) + \"/\" + (dslInfo.DownMargin/10.0) +\" dB\",\n                    chanType: dslInfo.DataPath,\n                    depth: dslInfo.UpDepth + \"/\" + dslInfo.DownDepth,\n                    delay: null,\n                    crc: null,\n                    fec: null,\n                    upTime: secondsToHms(DslUpTime)\n                }\n\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify(info));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String s() {
        return "let exit = setTimeout(() => {\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000)\n\nconst xhr = new XMLHttpRequest();\nxhr.onload = () => {\n    if (xhr.readyState == xhr.DONE) {\n        var doc = document.implementation.createHTMLDocument();\n        doc.documentElement.innerHTML = xhr.responseText;\n\n        let filterStatus = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText && e.innerText.includes(\"enableFilter\"))[0].innerText.split(\"enableFilter = '\")[1].split(\"';\")[0] || null;\n        let filterMode = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText && e.innerText.includes(\"Mode[0]\"))[0].innerText.split(\"Mode[0] = '\")[1].split(\"';\")[0] || null;\n\n        if (filterStatus) {\n            Android.callbackHandle(JSON.stringify({\n                result: \"filter_status_info\",\n                blockerEnabled: filterStatus == '1'&& filterMode == 0\n            }));\n            clearTimeout(exit);\n        }\n    } else {\n        Android.callbackHandle(JSON.stringify({ result: \"request_failed\" }));\n        clearTimeout(exit);\n    }\n}\nxhr.open('GET', window.location.origin + '/html/ntwkall/wlmacflt.asp');\nxhr.setRequestHeader('Content-Type', 'application/xhtml+xml ');\nxhr.send();\n";
    }

    @Override // o8.a
    public String t() {
        return "let clicked = false;\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#IdPppUserSuf\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#IdPppUser\").value != \"\") {\n                let usrName = document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#IdPppUser\").value;\n                Android.callbackHandle(JSON.stringify({\n                    result: \"ppp_info\",\n                    pppUsername: usrName.includes('@')? usrName.split('@')[0] : usrName,\n                    pppPassword: null\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n        } else {\n            if (window.location.pathname == \"/html/content1.asp\" && !clicked) {\n                document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelector(\"#link_Admin_1_0\").click();\n                clicked = true;\n            } else {\n                window.location.pathname = \"/html/content1.asp\"\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public String v() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            let wlanInfo = Wlan[0];\n            Android.callbackHandle(JSON.stringify({\n                result: \"basic_wifi_info\",\n                ssidName: wlanInfo.ssid,\n                password: null,\n                hidden: wlanInfo.wlHide == 1,\n                safe: wlanInfo.BeaconType,\n                maxClients: wlanInfo.DeviceNum\n            }));\n            clearInterval(temp);\n            clearTimeout(exit);\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String w(boolean z10) {
        return "let blockerEnabled = " + z10 + ";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#isFilter\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            let newWindow = document.querySelector(\"frameset #contentfrm\").contentWindow;\n            newWindow.document.querySelector(\"#isFilter\").checked = blockerEnabled;\n            newWindow.SubmitForm();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        } else {\n            if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.title == \"WLAN\") {\n                document.querySelector(\"frameset #tabfrm\").contentWindow.document.querySelectorAll(\"#tdTableMenu table tbody tr td\")[7].click();\n            } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.title != \"WLAN\") {\n                let wlanItem = [...document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelectorAll(\".trMenuItem\")].filter((item) => item.children[0].innerHTML.includes(\"WLAN\"))[1]\n                wlanItem && wlanItem.children[0].children[0].children[0].children[0].children[2].children[0].click();\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String x(String str, String str2) {
        return e0.d.a("let mac = \"", str2, "\";\nmac = mac.toUpperCase();\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"btnLogin\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.querySelector(\"#isFilter\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            let newWindow = document.querySelector(\"frameset #contentfrm\").contentWindow;\n\n            let rows = newWindow.document.getElementsByClassName(\"trTabContent\");\n            if (rows.length) {\n                selectedMac = [...rows].filter(row => row.children[0].innerText.trim() == mac)[0];\n                if (selectedMac) {\n                    selectedMac.children[1].children[0].checked = true;\n                    newWindow.clickRemove(\"WLAN Filtering\");\n                    Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                    clearInterval(temp);\n                    clearTimeout(exit);\n                }\n            }\n        } else {\n            if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.title == \"WLAN\") {\n                document.querySelector(\"frameset #tabfrm\").contentWindow.document.querySelectorAll(\"#tdTableMenu table tbody tr td\")[7].click();\n            } else if (document.querySelector(\"frameset #contentfrm\") && document.querySelector(\"frameset #contentfrm\").contentWindow.document.title != \"WLAN\") {\n                let wlanItem = [...document.querySelector(\"frameset #listfrm\").contentWindow.document.querySelectorAll(\".trMenuItem\")].filter((item) => item.children[0].innerHTML.includes(\"WLAN\"))[1]\n                wlanItem && wlanItem.children[0].children[0].children[0].children[0].children[2].children[0].click();\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }
}
