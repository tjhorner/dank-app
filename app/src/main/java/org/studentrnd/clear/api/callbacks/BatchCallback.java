package org.studentrnd.clear.api.callbacks;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.studentrnd.clear.api.Batch;
import org.studentrnd.clear.api.handlers.ClearResponseHandler;

import java.io.IOException;

import flexjson.JSONDeserializer;

/**
 * Created by tj on 2/21/15.
 */
public class BatchCallback implements Callback {
    public ClearResponseHandler handler = null;

    public BatchCallback(ClearResponseHandler handler){
        this.handler = handler;
    }

    @Override
    public void onFailure(Request request, IOException e) {
        handler.run(new Batch());
    }

    @Override
    public void onResponse(Response response) throws IOException {
        String body = response.body().string();
        handler.run(new JSONDeserializer<Batch>().deserialize(body, Batch.class));
    }
}
