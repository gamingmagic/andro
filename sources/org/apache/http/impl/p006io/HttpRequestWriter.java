package org.apache.http.impl.p006io;

import org.apache.http.HttpRequest;
import org.apache.http.message.LineFormatter;
import org.apache.http.p007io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

@Deprecated
/* renamed from: org.apache.http.impl.io.HttpRequestWriter */
public class HttpRequestWriter extends AbstractMessageWriter<HttpRequest> {
    public HttpRequestWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        super(sessionOutputBuffer, lineFormatter, httpParams);
    }

    /* access modifiers changed from: protected */
    public void writeHeadLine(HttpRequest httpRequest) {
        this.lineFormatter.formatRequestLine(this.lineBuf, httpRequest.getRequestLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
