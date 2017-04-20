package sj.prabha.com.wekancode;

import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONObject;

/**
 * Created by prabha on 20/4/17.
 */

public class JsonUtil {


    public static <T> T getObjectFromJson(JSONObject jsonObject, Class<T> tClass)
    {
        return getObjectFromJson(jsonObject.toString(), tClass);
    }

    public static <T> T getObjectFromJson(String jsonStr, Class<T> tClass)
    {
        return getObjectFromJson(jsonStr, tClass, false);
    }
    public static <T> T getObjectFromJson1(String jsonStr, Class<T> tClass, boolean isDisableDebug)
    {
        try
        {
            return new Gson().fromJson(jsonStr, tClass);
        }
        catch (Exception e)
        {
            if(!isDisableDebug) {
                //Log.d("error",e.toString());
            }
        }

        return null;
    }

    public static <T> T getObjectFromJson(String jsonStr, Class<T> tClass, boolean isDisableDebug)
    {
        try
        {
            return new Gson().fromJson(jsonStr, tClass);
        }
        catch (Exception e)
        {
            if(!isDisableDebug) {
                //ConsoleLog.e(e);
            }
        }
        return null;
    }

}
