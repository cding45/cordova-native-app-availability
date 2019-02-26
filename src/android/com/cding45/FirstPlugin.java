package com.cding45;

import org.apache.cordova.CordovaPlugin; 
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.apache.cordova.PluginResult;

public class FirstPlugin extends CordovaPlugin {
	private static final String TAG = "FirstPlugin";
	
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		LOG.d(TAG, "Initializing FirstPlugin");
	}
	
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		if(action.equals("echo")) {
			String phrase = args.getString(0);
			LOG.d(TAG, phrase);
		} else if (action.equals("getDate")) {
			final PluginResult result = new PluginResult(PluginResult.Status.OK, (new Date()).toString());
		}
		
		return true;
	}
}