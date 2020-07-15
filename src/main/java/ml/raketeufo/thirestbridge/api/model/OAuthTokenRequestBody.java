/*
 * Generated API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ml.raketeufo.thirestbridge.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OAauth Request Body for Password Grant https://www.oauth.com/oauth2-servers/access-tokens/password-grant/
 */
@Schema(description = "OAauth Request Body for Password Grant https://www.oauth.com/oauth2-servers/access-tokens/password-grant/")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-05T00:54:42.271211+02:00[Europe/Berlin]")
public class OAuthTokenRequestBody {
  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("grant_type")
  private String grantType = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("username")
  private String username = null;

  public OAuthTokenRequestBody clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(example = "xxxxxxxxx", description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuthTokenRequestBody clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @Schema(example = "xxxxxxxxx", description = "")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OAuthTokenRequestBody grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Get grantType
   * @return grantType
  **/
  @Schema(example = "password", required = true, description = "")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public OAuthTokenRequestBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(example = "1234luggage", required = true, description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public OAuthTokenRequestBody username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(example = "userXYZ", required = true, description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthTokenRequestBody oauthTokenRequestBody = (OAuthTokenRequestBody) o;
    return Objects.equals(this.clientId, oauthTokenRequestBody.clientId) &&
        Objects.equals(this.clientSecret, oauthTokenRequestBody.clientSecret) &&
        Objects.equals(this.grantType, oauthTokenRequestBody.grantType) &&
        Objects.equals(this.password, oauthTokenRequestBody.password) &&
        Objects.equals(this.username, oauthTokenRequestBody.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, grantType, password, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthTokenRequestBody {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
