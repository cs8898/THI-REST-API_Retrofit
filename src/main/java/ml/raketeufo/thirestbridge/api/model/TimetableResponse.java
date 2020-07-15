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
import ml.raketeufo.thirestbridge.api.model.Timetable;
import org.threeten.bp.LocalDateTime;
/**
 * TimetableResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-05T00:54:42.271211+02:00[Europe/Berlin]")
public class TimetableResponse {
  @SerializedName("error")
  private String error = null;

  @SerializedName("timestamp")
  private LocalDateTime timestamp = null;

  @SerializedName("ok")
  private Boolean ok = null;

  @SerializedName("details")
  private Boolean details = null;

  @SerializedName("timetable")
  private Timetable timetable = null;

  public TimetableResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public TimetableResponse timestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public TimetableResponse ok(Boolean ok) {
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @Schema(description = "")
  public Boolean isOk() {
    return ok;
  }

  public void setOk(Boolean ok) {
    this.ok = ok;
  }

  public TimetableResponse details(Boolean details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(description = "")
  public Boolean isDetails() {
    return details;
  }

  public void setDetails(Boolean details) {
    this.details = details;
  }

  public TimetableResponse timetable(Timetable timetable) {
    this.timetable = timetable;
    return this;
  }

   /**
   * Get timetable
   * @return timetable
  **/
  @Schema(description = "")
  public Timetable getTimetable() {
    return timetable;
  }

  public void setTimetable(Timetable timetable) {
    this.timetable = timetable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimetableResponse timetableResponse = (TimetableResponse) o;
    return Objects.equals(this.error, timetableResponse.error) &&
        Objects.equals(this.timestamp, timetableResponse.timestamp) &&
        Objects.equals(this.ok, timetableResponse.ok) &&
        Objects.equals(this.details, timetableResponse.details) &&
        Objects.equals(this.timetable, timetableResponse.timetable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, timestamp, ok, details, timetable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimetableResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    timetable: ").append(toIndentedString(timetable)).append("\n");
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
