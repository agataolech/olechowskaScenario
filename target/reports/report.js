$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("betting.feature");
formatter.feature({
  "line": 1,
  "name": "Place a  bet",
  "description": "",
  "id": "place-a--bet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4089597730,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Check the return value",
  "description": "",
  "id": "place-a--bet;check-the-return-value",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on betting page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user navigate to football event",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user select a \u003cevent\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "place a \u003cstake\u003e for the home team to ‘Win’",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the \u003creturn\u003e is equals to \u003codds\u003e multiplied by \u003cstake\u003e",
  "keyword": "Then "
});
formatter.match({
  "location": "Betting.user_is_on_betting_page()"
});
formatter.result({
  "duration": 8096305244,
  "status": "passed"
});
formatter.match({
  "location": "Betting.user_is_on_betting_football_page()"
});
formatter.result({
  "duration": 30119647701,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//ul[@id\u003d\u0027desktop-quick-links\u0027]//a[@href\u003d\u0027/betting/en-gb/football\u0027]\"}\n  (Session info: chrome\u003d59.0.3071.109)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.10 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027AGATA-PC\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dtrue, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\Agata\\AppData\\Local\\Temp\\scoped_dir7096_6535}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dtrue, version\u003d59.0.3071.109, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e89a39af5cafd205083173799efe4bbb\n*** Element info: {Using\u003dxpath, value\u003d//ul[@id\u003d\u0027desktop-quick-links\u0027]//a[@href\u003d\u0027/betting/en-gb/football\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat com.olechowska.pages.BettingFootballPage.goToFootballBetPage(BettingFootballPage.java:26)\r\n\tat com.olechowska.steps.Betting.user_is_on_betting_football_page(Betting.java:37)\r\n\tat ✽.When user navigate to football event(betting.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Betting.user_is_on_event_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Betting.user_place_the_bet()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Betting.assert_stake_odds_and_returned_calculation()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1035729476,
  "status": "passed"
});
});