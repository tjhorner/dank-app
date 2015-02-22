package org.studentrnd.clear.api;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;

import org.studentrnd.clear.api.callbacks.BatchCallback;
import org.studentrnd.clear.api.callbacks.RegionCallback;
import org.studentrnd.clear.api.handlers.ClearResponseHandler;

/**
 * Created by tj on 2/21/15.
 */
public class Clear {
    public static String CLEAR_BASE = "https://clear.codeday.org";
    public static String API_BASE = CLEAR_BASE + "/api/";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private static void get(String endpoint, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request req = new Request.Builder()
                .url(API_BASE + endpoint)
                .build();
        client.newCall(req).enqueue(callback);
    }

    public static void getUserById(int id, ClearResponseHandler handler){

    }

    public static void getUserByUsername(String username, ClearResponseHandler handler){

    }

    public static void getCurrentBatch(ClearResponseHandler handler){
        get("batches/current", new BatchCallback(handler));
    }

    public static void getEventById(String id, ClearResponseHandler handler) {

    }

    public static void getRegionByWebname(String webname, ClearResponseHandler handler){

    }

    public static void getAllRegions(ClearResponseHandler handler){
        get("regions", new RegionCallback(handler));
    }
}
