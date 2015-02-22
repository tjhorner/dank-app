package org.studentrnd.clear.api.callbacks;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.studentrnd.clear.api.Region;
import org.studentrnd.clear.api.handlers.ClearResponseHandler;

import java.io.IOException;

import flexjson.JSONDeserializer;

/**
 * Created by tj on 2/22/15.
 */
public class RegionCallback implements Callback {
    public ClearResponseHandler handler = null;

    public RegionCallback(ClearResponseHandler handler){
        this.handler = handler;
    }

    @Override
    public void onFailure(Request request, IOException e) {
        handler.run(new Region());
    }

    @Override
    public void onResponse(Response response) throws IOException {

        String body = response.body().string();
        handler.run(new JSONDeserializer<Region>().deserialize(body, Region.class));
    }
}
