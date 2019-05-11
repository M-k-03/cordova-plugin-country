package com.cloakedninjas.cordova.plugins;

import java.util.Locale;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

public class Country extends CordovaPlugin {

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("get")) {
            String result = Locale.getDefault().getCountry();
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, result));
            return true;
        }
        else if(action.equals("upgradeFirmware")){
            String deviceId = args.getString(0);
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, deviceId));
            return true;
        }
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR));
        return false;
    }
}
