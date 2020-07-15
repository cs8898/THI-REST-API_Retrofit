package ml.raketeufo.thirestbridge.api.auth;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static org.apache.oltu.oauth2.common.message.types.TokenType.BEARER;

public class HttpBearerAuth implements Interceptor {

    private String token;

    public HttpBearerAuth(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();

        // If the request already have an authorization (eg. Basic auth), do nothing
        if (request.header("Authorization") == null) {
            String credentials = BEARER.toString() + " " + this.token;
            request = request.newBuilder()
                    .addHeader("Authorization", credentials)
                    .build();
        }
        return chain.proceed(request);
    }

}
