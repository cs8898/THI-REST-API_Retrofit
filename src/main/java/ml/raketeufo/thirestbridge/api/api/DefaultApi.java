package ml.raketeufo.thirestbridge.api.api;

import ml.raketeufo.thirestbridge.api.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import ml.raketeufo.thirestbridge.api.model.AuthResponse;
import ml.raketeufo.thirestbridge.api.model.BaseResponse;
import ml.raketeufo.thirestbridge.api.model.ExamsResponse;
import ml.raketeufo.thirestbridge.api.model.GradesResponse;
import ml.raketeufo.thirestbridge.api.model.LoginBody;
import ml.raketeufo.thirestbridge.api.model.PersDataResponse;
import ml.raketeufo.thirestbridge.api.model.RoomsResponse;
import ml.raketeufo.thirestbridge.api.model.TimetableResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DefaultApi {
  /**
   * Beendet die Session im Backend
   * Beendet die Session im Backend
   * @return Call&lt;BaseResponse&gt;
   */
  @POST("auth/close")
  Call<BaseResponse> authClosePost();
    

  /**
   * Starten einer neuen Session
   * Erstellt eine Neue Session im Backend, und bettet diese in einen JWT Token
   * @param body  (required)
   * @return Call&lt;AuthResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("auth")
  Call<AuthResponse> authPost(
                    @retrofit2.http.Body LoginBody body    
  );

  /**
   * Testet SessionID am Backend
   * Testet am Backend ob die Session noch Gültig ist
   * @return Call&lt;BaseResponse&gt;
   */
  @GET("auth/test")
  Call<BaseResponse> authTestGet();
    

  /**
   * Grant with OAuth
   * Password Flow im Oauth Stil, äquivalent zu /auth
   * @param clientId  (required)
   * @param clientSecret  (required)
   * @param grantType  (required)
   * @param password  (required)
   * @param username  (required)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("oauth/token")
  Call<Void> oauthTokenPost(
                        @retrofit2.http.Field("client_id") String clientId,                     @retrofit2.http.Field("client_secret") String clientSecret,                     @retrofit2.http.Field("grant_type") String grantType,                     @retrofit2.http.Field("password") String password,                     @retrofit2.http.Field("username") String username
  );

  /**
   * Simple Ping to Application
   * Sends Ping to Application, eg for Monitoring
   * @return Call&lt;BaseResponse&gt;
   */
  @GET("ping")
  Call<BaseResponse> pingGet();
    

  /**
   * Fetch unocupied Rooms
   * Fetches all free rooms grouped by date
   * @return Call&lt;RoomsResponse&gt;
   */
  @GET("rooms/free")
  Call<RoomsResponse> roomsFreeGet();
    

  /**
   * Fetch Exams
   * Fetches Exam Registration for User
   * @return Call&lt;ExamsResponse&gt;
   */
  @GET("user/exams")
  Call<ExamsResponse> userExamsGet();
    

  /**
   * User Information
   * Fetches Informations belonging to User
   * @return Call&lt;PersDataResponse&gt;
   */
  @GET("user")
  Call<PersDataResponse> userGet();
    

  /**
   * Fetch Grades
   * Fetches Grades for User
   * @return Call&lt;GradesResponse&gt;
   */
  @GET("user/grades")
  Call<GradesResponse> userGradesGet();
    

  /**
   * User Timetable
   * Fetches the Timetable for the User
   * @param details fetch datails for timetable (pruefung, ziel, inhalt, literatur) (optional, default to 0)
   * @return Call&lt;TimetableResponse&gt;
   */
  @GET("user/timetable")
  Call<TimetableResponse> userTimetableGet(
        @retrofit2.http.Query("details") String details                
  );

}
