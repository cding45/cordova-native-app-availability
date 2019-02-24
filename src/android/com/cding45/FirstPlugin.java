package com.cding45

import org.apache.cordova.CordovaPlugin; 
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.apache.cordova.PluginResult;

public class FirstPlugin extends CordovaPlugin {
	private static final String TAG = "FirstPlugin";
	
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		Log.d(TAG, "Initializing FirstPlugin");
	}
	
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		if(actiong.equals("echo")) {
			String phrase = args.getString(0);
			Log.d(TAG, phrase);
		}
		
		return true;
	}
}