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
import ml.raketeufo.thirestbridge.api.model.ListTimeSlot;
/**
 * Room
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-05T00:54:42.271211+02:00[Europe/Berlin]")
public class Room {
  @SerializedName("freeSlots")
  private ListTimeSlot freeSlots = null;

  @SerializedName("room")
  private String room = null;

  @SerializedName("type")
  private String type = null;

  public Room freeSlots(ListTimeSlot freeSlots) {
    this.freeSlots = freeSlots;
    return this;
  }

   /**
   * Get freeSlots
   * @return freeSlots
  **/
  @Schema(description = "")
  public ListTimeSlot getFreeSlots() {
    return freeSlots;
  }

  public void setFreeSlots(ListTimeSlot freeSlots) {
    this.freeSlots = freeSlots;
  }

  public Room room(String room) {
    this.room = room;
    return this;
  }

   /**
   * Get room
   * @return room
  **/
  @Schema(description = "")
  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }

  public Room type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(this.freeSlots, room.freeSlots) &&
        Objects.equals(this.room, room.room) &&
        Objects.equals(this.type, room.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeSlots, room, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    
    sb.append("    freeSlots: ").append(toIndentedString(freeSlots)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
