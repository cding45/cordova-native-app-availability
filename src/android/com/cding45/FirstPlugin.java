public class FirstPlugin extends CordovaPlugin {
	private static final String TAG = "FirstPlugin";
	
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		Log.d(TAG, "Initializing FirstPlugin");
	}
	
	public boolean execute(String action, JSONArray args, final CallbackContect callbackContext) throws JSONException {
		if(actiong.equals("echo")) {
			String phrase = args.getString(0);
			Log.d(TAG, phrase);
		}
		
		return true;
	}
}