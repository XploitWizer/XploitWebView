# XploitWebView

*XploitWebView is a advaced webview android application source code to turn your website into a stunning android app*

**Features :** 
* pull down to refresh
* splash screen
* support offline and online javascript
* app rating
* external links will open in brower
* light weight apk 
* caching for smooth experience
* files and pictures download and upload support
* progress bar and more...


**How to Configure to create apk :**

> gitclone https://github.com/XploitWizer/XploitWebView
> open with android studio
> to change package name make a search of www.xploitwizer.me and replace it with your package name in all files
> in xploit/src/main/AndroidManifest.xml (android:host="xploitwizer.me") replace xploitwizer.me with your website don't put http or https
> in xploit/src/main/res/mipmap-hdpi chane your app logo and in /raw change your splash screen image and in /values/strings.xml (<string name="app_name">XploitWizer</>) change your app name
>in xploit/src/main/java/www/xploitwizer/me/XploitWebView.java (here turn true or flase permission variabel as per your need) and (static String WEB_URL = "https://xploitwizer.me") change it with your url or use files:/// to load files offline.
> change name of directories www/xploitwizer/me as per your package name
> now build a singed apk and its ready to publish on playstore
  
  **#Team XploitWizer**
