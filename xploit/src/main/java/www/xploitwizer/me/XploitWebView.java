package www.xploitwizer.me;



class XploitWebView {

	/* -- PERMISSION VARIABLES -- */

	// enable JavaScript for webview
	static boolean XPLOIT_JSCRIPT     = true;

	// upload file from webview
	static boolean XPLOIT_FUPLOAD     = true;

	// enable upload from camera for photos
	static boolean XPLOIT_CAMUPLOAD   = true;

	// incase you want only camera files to upload
	static boolean XPLOIT_ONLYCAM	     = false;

	// upload multiple files in webview
 	static boolean XPLOIT_MULFILE     = true;

	// track GPS locations
	static boolean XPLOIT_LOCATION    = true;

	// show ratings dialog; auto configured
	// edit method get_rating() for customizations
	static boolean XPLOIT_RATINGS     = true;

	// pull refresh current url
	static boolean XPLOIT_PULLFRESH	 = true;

	// show progress bar in app
	static boolean XPLOIT_PBAR        = true;

	// zoom control for webpages view
	static boolean XPLOIT_ZOOM        = true;

	// save form cache and auto-fill information
	static boolean XPLOIT_SFORM       = true;

	// whether the loading webpages are offline or online
	static boolean XPLOIT_OFFLINE     = false;

	// open external url with default browser instead of app webview
	static boolean XPLOIT_EXTURL      = true;


	/* -- SECURITY VARIABLES -- */

	// verify whether HTTPS port needs certificate verification
	static boolean XPLOIT_CERT_VERIFICATION = true;


	/* -- CONFIG VARIABLES -- */

	//complete URL of your website or offline webpage
	static String WEB_URL          = "https://xploitwizer.me";

	//to upload any file type using "*/*"; check file type references for more
	static String WEB_F_TYPE       = "*/*";


	/* -- RATING SYSTEM VARIABLES -- */

	static int RATING_DAYS            = 1;	// after how many days of usage would you like to show the dialoge
	static int RATING_TIMES           = 10;  // overall request launch times being ignored
	static int RATING_INTERVAL        = 1;   // reminding users to rate after days interval
}
