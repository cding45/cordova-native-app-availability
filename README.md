# cordova-native-app-availability
You can show helpful articles, videos, and web resources inside of your app. Users can view web pages without leaving your app.

To get a few ideas, check out the sample at the bottom of this page or go straight to the reference content.

This plugin provides a web browser view that displays when calling cordova.InAppBrowser.open().

var ref = cordova.InAppBrowser.open('http://apache.org', '_blank', 'location=yes');
The cordova.InAppBrowser.open() function is defined to be a drop-in replacement for the window.open() function. Existing window.open() calls can use the InAppBrowser window, by replacing window.open:

window.open = cordova.InAppBrowser.open;
The InAppBrowser window behaves like a standard web browser, and can't access Cordova APIs. For this reason, the InAppBrowser is recommended if you need to load third-party (untrusted) content, instead of loading that into the main Cordova webview. The InAppBrowser is not subject to the whitelist, nor is opening links in the system browser.
