package p8;

import l0.d;
import o8.a;
import s.b;

/* loaded from: classes.dex */
public final class t extends a {
    public t() {
        this.f16791d = "ZTEH108N";
        this.f16792e = "/getpage.gch?pid=1002&nextpage=net_wlan_essid_t.gch";
        this.f16794g = "/template.gch?pid=1002&nextpage=net_wlan_assoc_t.gch";
        this.f16795h = "/template.gch?pid=1002&nextpage=status_dsl_info_t.gch";
        this.f16796i = "/template.gch?pid=1002&nextpage=net_11n_conf_t.gch";
        this.f16798k = "/getpage.gch?pid=1002&nextpage=IPv46_net_wan_conf_t.gch";
        this.f16799l = "/getpage.gch?pid=1002&nextpage=manager_dev_conf_t.gch";
        this.f16800m = "/getpage.gch?pid=1002&nextpage=net_dhcp_dynamic_t.gch";
        this.f16801n = "/template.gch?pid=1002&nextpage=net_wlan_MacFilter_t.gch";
        this.f16802o = "/template.gch?pid=1002&nextpage=net_wlan_MacFilter_t.gch";
        this.f16806t = true;
        this.f16805s = true;
        this.f16807u = true;
        this.f16811z = false;
        this.f16789b = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
        this.f16790c = false;
    }

    @Override // o8.a
    public final String b(boolean z10, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("let ispDns = ");
        sb.append(z10);
        sb.append(";\nlet dns1 = \"");
        sb.append(str);
        sb.append("\";\nlet dns2 = \"");
        return b.b(sb, str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            document.getElementById(\"Frm_DnsServerSource\").checked = ispDns;\n            change_DNS();\n            if (!ispDns) {\n                document.getElementById(\"Frm_DNSServer1\").value = dns1;\n                document.getElementById(\"Frm_DNSServer2\").value = dns2;\n            }\n            document.getElementById(\"Btn_Submit\").dispatchEvent(new Event(\"click\"));\n            clearInterval(temp);\n            clearTimeout(exit);\n            setTimeout(() => {\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }, 1000)\n\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public final String c(boolean z10, String str) {
        return "let limited = " + z10 + ";\nlet power = \"" + str + "\";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else if (document.getElementById(\"Frm_DataRates\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            document.getElementById(\"Frm_DataRates\").value = (limited) ? \"b\" : \"b,g,n\";\n            document.getElementById(\"Frm_TxPower\").value = power + \"%\";\n            document.getElementById(\"Btn_Submit\").click();\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            clearInterval(temp);\n            clearTimeout(exit);\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String d(String str, String str2) {
        return d.b("let username = \"", str, "\";\nlet password = \"", str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else if (document.getElementById(\"Frm_WANCName0\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (document.getElementById(\"Frm_WANCName0\").value != document.querySelectorAll(\"#Frm_WANCName0 option\")[1].value) {\n                document.getElementById(\"Frm_WANCName0\").value = document.querySelectorAll(\"#Frm_WANCName0 option\")[1].value\n                clearInterval(temp);\n                clearTimeout(exit);\n                Change_Link();\n            } else {\n                document.getElementById(\"Frm_UserName\").value = username;\n                document.getElementById(\"Frm_Password\").value = password;\n                pageEdit();\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public final String g(boolean z10, String str, String str2, String str3, boolean z11, boolean z12) {
        String str4;
        StringBuilder sb;
        StringBuilder c10 = androidx.activity.result.a.c(" exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({result:\"timeout\"}));\n}, 15000);\n\n temp = setInterval(() => {\n        if (document.getElementById('LoginId')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n\n    ");
        if (z10) {
            sb = androidx.activity.result.a.c("if (!window.location.pathname.includes( \"net_wlan_secrity_t.gch\")) {\n                history.replaceState({}, document.title, \".\");\n                window.location.pathname = \"/getpage.gch?pid=1002&nextpage=net_wlan_secrity_t.gch\";\n                clearInterval(temp);\n                clearTimeout(exit);\n            } else {\n                if (document.getElementById(\"Frm_KeyPassphrase\")) {\n                    ");
            sb.append(z12 ? "document.getElementById(\"Frm_Authentication\").value = \"Open System\";\n" : "document.getElementById(\"Frm_Authentication\").value = \"WPA/WPA2-PSK\";\n");
            sb.append("                    Authentication();\n                    document.getElementById(\"Frm_KeyPassphrase\").value = \"");
            sb.append(str2);
            str4 = "\";\n                    pageSubmit();\n                    clearInterval(temp);\n                    clearTimeout(exit);\n                    Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n                }\n else{history.replaceState({}, document.title, \".\");window.location.pathname = \"/getpage.gch?pid=1002&nextpage=net_wlan_secrity_t.gch\";\n}";
        } else {
            sb = new StringBuilder();
            sb.append("            if (!window.location.pathname.includes(\"net_wlan_essid_t.gch\")) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                history.replaceState({}, document.title, \".\");\n                window.location.pathname = \"/getpage.gch?pid=1002&nextpage=net_wlan_essid_t.gch\";          }else{            if (document.getElementById(\"Frm_ESSID\")) {\n                document.getElementById(\"Frm_ESSID\").value = \"");
            sb.append(str);
            sb.append("\";\n            ");
            sb.append(z11 ? "document.getElementById(\"Frm_ESSIDHideEnable\").checked=true;\n" : "document.getElementById(\"Frm_ESSIDHideEnable\").checked=false;\n");
            sb.append("                document.getElementById(\"Frm_MaxUserNum\").value = \"");
            sb.append(str3);
            str4 = "\";\n                document.getElementById(\"Btn_Submit\").click();\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n";
        }
        sb.append(str4);
        c10.append(sb.toString());
        c10.append("        }\n        }\n}, 500);");
        return c10.toString();
    }

    @Override // o8.a
    public final String h(String str, String str2) {
        return i(str, str2);
    }

    @Override // o8.a
    public final String i(String str, String str2) {
        return e0.d.a("let mac = \"", str2, "\";\nmac = mac.toLowerCase();\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000);\n\nfunction fillMac(mac) {\n    let macValues = mac.split(\":\");\n    for (let i = 1; i < 7; i++) {\n        document.getElementById(\"mac\" + i).value = macValues[i - 1];\n    }\n}\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else if (document.getElementById(\"mac1\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            fillMac(mac)\n            Add()\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public final String j(String str, String str2) {
        return d.b("let username = \"", str, "\";\nlet password = \"", str2, "\";\n\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 20000);\nlet temp = setInterval(() => {\n    try {\n        let source = document.getElementsByTagName('html')[0].innerHTML;\n        if(source.includes(\"Another user has logged in to the system,\")){\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"already_login\" }));\n        }\n        else if (document.getElementById(\"time\") && document.getElementById(\"time\").innerText && document.getElementById(\"time\").innerText != '0 secs') {\n            let seconds = document.getElementById(\"time\").innerText.split(\" \")[0];\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"retry_after\", time: parseInt(seconds) }));\n        }\n        else {\n            if (document.getElementById('Frm_Username')) {\n                Android.callbackHandle(JSON.stringify({ result: \"logging_in\" }));\n                document.getElementById('Frm_Username').value = username;\n                document.getElementById('Frm_Password').value = password;\n                document.getElementById('LoginId').click();\n            } else if (document.querySelector(\"#mainFrame\") && document.querySelector(\"#mainFrame\").contentWindow.document.querySelector(\"#flogout\")) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"login_success\" }));\n            } else if (document.getElementById(\"Btn_Finish\")) {\n                Android.callbackHandle(JSON.stringify({ result: \"enforce_login\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n                pageFinish();\n            } else if (document.getElementById(\"Btn_Next\")) {\n                Android.callbackHandle(JSON.stringify({ result: \"enforce_login\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n                pageNext();\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }

    @Override // o8.a
    public final String k() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            msgCallback();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);;\n";
    }

    @Override // o8.a
    public final String l() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            msgCallback2();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n        }\n    } catch (err){ }\n}, 500);\n";
    }

    @Override // o8.a
    public final String n() {
        return "let exit = setTimeout(() => {\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000)\n\nfunction allDevicesInfo(cb) {\n    const xhr = new XMLHttpRequest();\n    xhr.onload = () => {\n        var doc = document.implementation.createHTMLDocument();\n        doc.documentElement.innerHTML = xhr.responseText;\n        let macs = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('MACAddr\")).filter(e => !e.innerText.includes(\"('MACAddr'\")).map(e => e.innerText.replace(/\\\\x3a/g, \"\").split(\",'\")[1].split(\"')\")[0].match(/.{1,2}/g).join(\":\"))\n                let hostnames = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('HostName\")).filter(e => !e.innerText.includes(\"('HostName'\")).map(e => e.innerText.split(\",\")[1].split(\")\")[0].replace(/\\W/g, '').replace(/x2d/g, '-'));\n        let ips = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('IPAddr\")).filter(e => !e.innerText.includes(\"('IPAddr'\")).map(e => e.innerText.replace(/\\\\x2e/g, \".\").split(\",'\")[1].split(\"')\")[0]);\n        let len = macs.length;\n        devices = []\n        if (len) {\n            for (let i = 0; i < len; i++) {\n                devices.push({\n                    mac: macs[i],\n                    ip: ips[i],\n                    hostname: hostnames[i]\n                })\n            }\n        }\n        cb(devices);\n        clearTimeout(exit);\n    }\n    xhr.open('GET', window.location.origin + '/getpage.gch?pid=1002&nextpage=net_dhcp_dynamic_t.gch');\n    xhr.setRequestHeader('Content-Type', 'application/xhtml+xml ');\n    xhr.send();\n}\n\nfunction blacklist(cb) {\n    const xhr = new XMLHttpRequest();\n    xhr.onload = () => {\n        if (xhr.readyState == xhr.DONE) {\n            var doc = document.implementation.createHTMLDocument();\n            doc.documentElement.innerHTML = xhr.responseText;\n            let macs = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('MACAddress\")).filter(e => !e.innerText.includes(\"('MACAddress'\")).map(e => e.innerText.replace(/\\\\x3a/g, \"\").split(\",'\")[1].split(\"')\")[0].match(/.{1,2}/g).join(\":\"))\n            cb(macs)\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"request_failed\" }));\n        }\n\n    }\n    xhr.open('GET', window.location.origin + '/getpage.gch?pid=1002&nextpage=net_wlan_MacFilter_t.gch');\n    xhr.setRequestHeader('Content-Type', 'application/xhtml+xml ');\n    xhr.send();\n}\nblacklist(macs => {\n    allDevicesInfo(devs => {\n\n        blockedDevices = macs.map(mac => {\n            let blockedDevInfo = devs.filter(dev => dev.mac == mac)[0];\n            return {\n                mac: mac,\n                hostname: blockedDevInfo && blockedDevInfo.hostname ? blockedDevInfo.hostname : \"Unknown\"\n            }\n        })\n        if (blockedDevices.length) {\n            Android.callbackHandle(JSON.stringify({\n                result: \"blacklist_devices_info\",\n                devices: blockedDevices\n            }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"no_devices_found\" }));\n        }\n    })\n})";
    }

    @Override // o8.a
    public final String o() {
        return "let exit = setTimeout(() => {\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000)\n\nfunction allDevicesInfo(cb) {\n    const xhr = new XMLHttpRequest();\n    xhr.onload = () => {\n        var doc = document.implementation.createHTMLDocument();\n        doc.documentElement.innerHTML = xhr.responseText;\n        let macs = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('MACAddr\")).filter(e => !e.innerText.includes(\"('MACAddr'\")).map(e => e.innerText.replace(/\\\\x3a/g, \"\").split(\",'\")[1].split(\"')\")[0].match(/.{1,2}/g).join(\":\"))\n        let hostnames = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('HostName\")).filter(e => !e.innerText.includes(\"('HostName'\")).map(e => e.innerText.split(\",\")[1].split(\")\")[0].replace(/\\W/g, '').replace(/x2d/g, '-'));\n        let ips = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('IPAddr\")).filter(e => !e.innerText.includes(\"('IPAddr'\")).map(e => e.innerText.replace(/\\\\x2e/g, \".\").split(\",'\")[1].split(\"')\")[0]);\n        let len = macs.length;\n        devices = []\n        if (len) {\n            for (let i = 0; i < len; i++) {\n                devices.push({\n                    mac: macs[i],\n                    ip: ips[i],\n                    hostname: hostnames[i]\n                })\n            }\n        }\n        clearTimeout(exit)\n        cb(devices);\n    }\n    xhr.open('GET', window.location.origin + '/getpage.gch?pid=1002&nextpage=net_dhcp_dynamic_t.gch');\n    xhr.setRequestHeader('Content-Type', 'application/xhtml+xml ');\n    xhr.send();\n}\n\nfunction wifiDevices(cb) {\n    const xhr = new XMLHttpRequest();\n    xhr.onload = () => {\n        var doc = document.implementation.createHTMLDocument();\n        doc.documentElement.innerHTML = xhr.responseText;\n        let macs = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('ADMACAddress\")).filter(e => !e.innerText.includes(\"('ADMACAddress'\")).map(e => e.innerText.replace(/\\\\x3a/g, \"\").split(\",'\")[1].split(\"')\")[0].match(/.{1,2}/g).join(\":\"))\n        let ips = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"('ADIPAddress\")).filter(e => !e.innerText.includes(\"('ADIPAddress'\")).map(e => e.innerText.replace(/\\\\x2e/g, \".\").split(\",'\")[1].split(\"')\")[0]);\n\n        let len = macs.length;\n        let devices = []\n        if (len) {\n            for (let i = 0; i < len; i++) {\n                devices.push({\n                    mac: macs[i],\n                    ip: ips[i],\n                })\n            }\n        }\n        cb(devices);\n    }\n    xhr.open('GET', window.location.origin + '/getpage.gch?pid=1002&nextpage=net_wlan_assoc_t.gch');\n    xhr.setRequestHeader('Content-Type', 'application/xhtml+xml ');\n    xhr.send();\n}\n\nwifiDevices(wifiDevs => {\n    if (wifiDevs.length) {\n\n        allDevicesInfo((allDevs) => {\n            let devices = wifiDevs.map(dev => {\n                let devInfo = allDevs.filter(d => d.mac == dev.mac)[0];\n                dev.hostname = devInfo ? devInfo.hostname : \"Unknwon\"\n                return dev;\n            })\n            info = {\n                result: \"connected_devices_info\",\n                devices: devices\n            }\n            Android.callbackHandle(JSON.stringify(info));\n        })\n\n    } else {\n        Android.callbackHandle(JSON.stringify({ result: \"no_devices_found\" }));\n    }\n})";
    }

    @Override // o8.a
    public final String p() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            clearInterval(temp);\n            clearTimeout(exit);\n            let isIspDns = document.getElementById(\"Frm_DnsServerSource\").checked;\n            Android.callbackHandle(JSON.stringify({\n                result: \"dns_info\",\n                ispDns: isIspDns,\n                dns1: !isIspDns ? document.getElementById(\"Frm_DNSServer1\").value : null,\n                dns2: !isIspDns ? document.getElementById(\"Frm_DNSServer2\").value : null\n            }));\n\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String q() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else {\n            Android.callbackHandle(JSON.stringify({\n                result: \"limit_wifi_info\",\n                speed: document.getElementById(\"Frm_DataRates\").value,\n                power:  document.getElementById(\"Frm_TxPower\").value\n            }));\n            clearInterval(temp);\n            clearTimeout(exit);\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String r() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({result:\"timeout\"}));    \n}, 15000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            let lineRate = document.getElementsByClassName(\"tdright\")[2].innerText;\n            let upload = (Number(lineRate.split('/')[0]) / 1024).toFixed(1);\n            let download = (Number(lineRate.split('/')[1].split(\"k\")[0]) / 1024).toFixed(1);\n            let lineRateMb = upload + \"/\" + download + \" Mbps\";\n\n            let maxRate = document.getElementsByClassName(\"tdright\")[3].innerText;\n            let maxUpload = (Number(maxRate.split('/')[0]) / 1024).toFixed(1);\n            let maxDownload = (Number(maxRate.split('/')[1].split(\"k\")[0]) / 1024).toFixed(1);\n            let maxRateMb = maxUpload + \"/\" + maxDownload + \" Mbps\";\n\n            if (document.getElementById(\"Frm_Module_type\").innerText == 'N/A') {\n                Android.callbackHandle(JSON.stringify({ result: \"null_dsl_info\" }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            } else {\n\n                let info = {\n                    result: \"dsl_info\",\n                    modType:  document.getElementById(\"Frm_Module_type\").innerText,\n                    upload: upload,\n                    download: download,\n                    lineRate: lineRateMb,\n                    maxUpload: maxUpload,\n                    maxDownload: maxDownload,\n                    maxRate: maxRateMb,\n                    noise: document.getElementById(\"Fnt_Upstream_noise_margin\").innerText + \"/\" + document.getElementById(\"Fnt_Downstream_noise_margin\").innerText,\n                    chanType: document.getElementById('Fnt_Data_path').innerText,\n                    depth: document.getElementsByClassName(\"tdright\")[8].innerText,\n                    delay: document.getElementsByClassName(\"tdright\")[9].innerText,\n                    crc:document.getElementsByClassName(\"tdright\")[12].innerText,\n                    fec: null,\n                    upTime: null\n                }\n\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify(info));\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String s() {
        return "let exit = setTimeout(() => {\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000)\n\nconst xhr = new XMLHttpRequest();\nxhr.onload = () => {\n    if (xhr.readyState == xhr.DONE) {\n        var doc = document.implementation.createHTMLDocument();\n        doc.documentElement.innerHTML = xhr.responseText;\n\n        if (doc.getElementsByTagName(\"script\")[0].innerText == \"logout_redirect();\") {\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            let filterStatus = [...doc.getElementsByTagName(\"script\")].filter(e => e.innerText.includes(\"ACLPolicy\"))[1].innerText.split(\",'\")[1].split(\"')\")[0] || null;\n            if (filterStatus) {\n                Android.callbackHandle(JSON.stringify({\n                    result: \"filter_status_info\",\n                    blockerEnabled: filterStatus == 'Ban'\n                }));\n                clearTimeout(exit);\n            }\n        }\n    } else {\n        Android.callbackHandle(JSON.stringify({ result: \"request_failed\" }));\n        clearTimeout(exit);\n    }\n}\nxhr.open('GET', window.location.origin + '/getpage.gch?pid=1002&nextpage=net_wlan_MacFilter_t.gch');\nxhr.setRequestHeader('Content-Type', 'application/xhtml+xml ');\nxhr.send();";
    }

    @Override // o8.a
    public final String t() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        } else if (document.getElementById(\"Frm_WANCName0\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (document.getElementById(\"Frm_WANCName0\").value != document.querySelectorAll(\"#Frm_WANCName0 option\")[1].value) {\n                document.getElementById(\"Frm_WANCName0\").value = document.querySelectorAll(\"#Frm_WANCName0 option\")[1].value\n                clearInterval(temp);\n                clearTimeout(exit);\n                Change_Link();\n            } else {\n\n                Android.callbackHandle(JSON.stringify({\n                    result: \"ppp_info\",\n                    pppUsername: document.getElementById(\"Frm_UserName\").value,\n                    pppPassword: null\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String v() {
        return "let exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 20000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('LoginId')) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }));\n        } else {\n            Android.callbackHandle(JSON.stringify({ result: \"showing_info\" }));\n            if (!window.location.search.includes(\"net_wlan_essid_t.gch\") && !window.location.search.includes(\"net_wlan_secrity_t.gch\") &&\n                !window.location.pathname.includes(\"net_wlan_essid_t.gch\") && !window.location.pathname.includes(\"net_wlan_secrity_t.gch\")) {\n                clearInterval(temp);\n                clearTimeout(exit);\n                history.replaceState({}, document.title, \".\");\n                window.location.pathname = \"/getpage.gch?pid=1002&nextpage=net_wlan_essid_t.gch\";\n\n            } else {\n                if ((window.location.search.includes(\"net_wlan_essid_t.gch\") || window.location.pathname.includes(\"net_wlan_essid_t.gch\")) && document.getElementById(\"Frm_ESSID\")) {\n\n                    Android.callbackHandle(JSON.stringify({\n                        result: \"basic_wifi_info_1\",\n                        ssidName: document.getElementById(\"Frm_ESSID\").value,\n                        password: null,\n                        hidden: document.getElementById(\"Frm_ESSIDHideEnable\").checked,\n                        safe:null,\n                        maxClients: document.getElementById(\"Frm_MaxUserNum\").value\n                    }));\n                    clearInterval(temp);\n                    history.replaceState({}, document.title, \".\");\n                    window.location.pathname = \"/getpage.gch?pid=1002&nextpage=net_wlan_secrity_t.gch\";\n\n                } else if ((window.location.search.includes(\"net_wlan_secrity_t.gch\") || window.location.pathname.includes(\"net_wlan_secrity_t.gch\")) && document.getElementById(\"Frm_Authentication\")) {\n\n                    Android.callbackHandle(JSON.stringify({\n                        result: \"basic_wifi_info_2\",\n                        ssidName: null,\n                        password: document.getElementById(\"Frm_KeyPassphrase\").value,\n                        hidden: null,\n                        safe:document.getElementById(\"Frm_Authentication\").value,\n                        maxClients: null\n                    }));\n                    clearInterval(temp);\n                    clearTimeout(exit);\n                }\n            }\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String w(boolean z10) {
        return "let blockerEnabled = " + z10 + ";\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 10000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else if (document.getElementById(\"Frm_Mode\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            if (blockerEnabled) {\n                document.getElementById(\"Frm_Mode\").value = 'Ban';\n            } else {\n                document.getElementById(\"Frm_Mode\").value = 'Disabled';\n            }\n            Slect_Mode();\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n\n        }\n    } catch (err){ }\n}, 500);";
    }

    @Override // o8.a
    public final String x(String str, String str2) {
        return e0.d.a("let mac = \"", str2, "\";\n\nmac = mac.toLowerCase();\nlet exit = setTimeout(() => {\n    clearInterval(temp);\n    clearTimeout(exit);\n    Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n}, 15000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById(\"LoginId\")) {\n            clearInterval(temp);\n            clearTimeout(exit);\n            Android.callbackHandle(JSON.stringify({ result: \"need_login\" }))\n        }\n        else if (document.getElementById(\"mac1\")) {\n            Android.callbackHandle(JSON.stringify({ result: \"applying_settings\" }));\n            let blockedRows = [...document.getElementsByClassName(\"white\")].filter(e => e.children.length > 1);\n            if (blockedRows.length) {\n                let index = blockedRows.findIndex((row) => row.children[1].children[0].value == mac)\n                if (index > -1) {\n                    Delete(index)\n                }\n                clearInterval(temp);\n                clearTimeout(exit);\n                Android.callbackHandle(JSON.stringify({ result: \"executed\" }));\n            }\n        }\n    } catch (err){ }\n}, 500);");
    }
}
