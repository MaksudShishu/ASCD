$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/ASCD/src/test/resource/FetureFiles/Shettyiframe.feature");
formatter.feature({
  "line": 2,
  "name": "Rahul shetty iframe practice",
  "description": "",
  "id": "rahul-shetty-iframe-practice",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@SKY-20"
    },
    {
      "line": 1,
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "duration": 17048441000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Iframe Practice",
  "description": "",
  "id": "rahul-shetty-iframe-practice;iframe-practice",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open Shetty Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on iframe Home",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "It should reload iframe homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "IframeHomeSteps.open_Shetty_Homepage()"
});
formatter.result({
  "duration": 67086727500,
  "status": "passed"
});
formatter.match({
  "location": "IframeHomeSteps.click_on_iframe_Home()"
});
formatter.result({
  "duration": 211234100,
  "status": "passed"
});
formatter.match({
  "location": "IframeHomeSteps.it_should_reload_iframe_homepage()"
});
formatter.result({
  "duration": 2041895300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//a[text()\u003d\u0027Home\u0027])[1]\"}\n  (Session info: chrome\u003d114.0.5735.110)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-BAHRCS7\u0027, ip: \u0027192.168.0.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.110, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:59719}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: aaa6dac66deee1e6ec492fb3c73cb862\n*** Element info: {Using\u003dxpath, value\u003d(//a[text()\u003d\u0027Home\u0027])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat upskill.ebay.pageAction.IframeActions.verifyHomepage(IframeActions.java:59)\r\n\tat upskill.ebay.stepDef.IframeHomeSteps.it_should_reload_iframe_homepage(IframeHomeSteps.java:25)\r\n\tat ✽.Then It should reload iframe homepage(F:/ASCD/src/test/resource/FetureFiles/Shettyiframe.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 687143200,
  "status": "passed"
});
});