package ml.raketeufo.thirestbridge.api.api;

import ml.raketeufo.thirestbridge.api.ApiClient;
import ml.raketeufo.thirestbridge.api.model.BaseResponse;
import ml.raketeufo.thirestbridge.api.model.PersDataResponse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class OAuthTest {
    private DefaultApi api;
    private String baseURL;
    private String username;

    @Before
    public void setup() {
        baseURL = System.getenv("BASE_URL");
        username = System.getenv("API_USER");
        String password = System.getenv("API_PASSWORD");
        api = new ApiClient(baseURL, ApiClient.AuthNames.JWT_AuthToken, username, password).createService(DefaultApi.class);
    }

    @After
    public void cleanup() {
        try {
            api.authClosePost().execute();
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    /**
     * Testet SessionID am Backend
     * <p>
     * Testet am Backend ob die Session noch Gültig ist
     */
    @Test
    public void authTestGetTest() {
        try {
            BaseResponse response = api.authTestGet().execute().body();
            Assert.assertTrue(response.isOk());
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    /**
     * User Information
     * <p>
     * Fetches Informations belonging to User
     */
    @Test
    public void userGetTest() {
        try {
            PersDataResponse response = api.userGet().execute().body();
            Assert.assertTrue(response.isOk());
            Assert.assertEquals(this.username, response.getInfo().getUser());
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
