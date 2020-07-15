package ml.raketeufo.thirestbridge.api.api;

import ml.raketeufo.thirestbridge.api.ApiClient;
import ml.raketeufo.thirestbridge.api.model.AuthResponse;
import ml.raketeufo.thirestbridge.api.model.BaseResponse;
import ml.raketeufo.thirestbridge.api.model.GradesResponse;
import ml.raketeufo.thirestbridge.api.model.LoginBody;
import ml.raketeufo.thirestbridge.api.model.PersDataResponse;
import ml.raketeufo.thirestbridge.api.model.RoomsResponse;
import ml.raketeufo.thirestbridge.api.model.TimetableResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient("http://localhost:8080").createService(DefaultApi.class);
    }


    /**
     * Beendet die Session im Backend
     *
     * Beendet die Session im Backend
     */
    @Test
    public void authClosePostTest() {
        // BaseResponse response = api.authClosePost();

        // TODO: test validations
    }

    /**
     * Starten einer neuen Session
     *
     * Erstellt eine Neue Session im Backend, und bettet diese in einen JWT Token
     */
    @Test
    public void authPostTest() {
        LoginBody body = null;
        // AuthResponse response = api.authPost(body);

        // TODO: test validations
    }

    /**
     * Testet SessionID am Backend
     *
     * Testet am Backend ob die Session noch Gültig ist
     */
    @Test
    public void authTestGetTest() {
        // BaseResponse response = api.authTestGet();

        // TODO: test validations
    }

    /**
     * Simple Ping to Application
     *
     * Sends Ping to Application, eg for Monitoring
     */
    @Test
    public void pingGetTest() {
        // BaseResponse response = api.pingGet();

        // TODO: test validations
    }

    /**
     * Fetch unocupied Rooms
     *
     * Fetches all free rooms grouped by date
     */
    @Test
    public void roomsFreeGetTest() {
        // RoomsResponse response = api.roomsFreeGet();

        // TODO: test validations
    }

    /**
     * User Information
     *
     * Fetches Informations belonging to User
     */
    @Test
    public void userGetTest() {
        // PersDataResponse response = api.userGet();

        // TODO: test validations
    }

    /**
     * Fetch Exams and Grades
     *
     * Fetches Exams and Grades for User
     */
    @Test
    public void userGradesGetTest() {
        // GradesResponse response = api.userGradesGet();

        // TODO: test validations
    }

    /**
     * User Timetable
     *
     * Fetches the Timetable for the User
     */
    @Test
    public void userTimetableGetTest() {
        String details = null;
        // TimetableResponse response = api.userTimetableGet(details);

        // TODO: test validations
    }
}
