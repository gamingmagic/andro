package org.apache.http.impl.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.EntityUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class BasicResponseHandler extends AbstractResponseHandler<String> {
    public String handleEntity(HttpEntity httpEntity) {
        return EntityUtils.toString(httpEntity);
    }

    public String handleResponse(HttpResponse httpResponse) {
        return (String) super.handleResponse(httpResponse);
    }
}
