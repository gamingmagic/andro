package org.apache.http;

public interface HttpRequestFactory {
    HttpRequest newHttpRequest(String str, String str2);

    HttpRequest newHttpRequest(RequestLine requestLine);
}
