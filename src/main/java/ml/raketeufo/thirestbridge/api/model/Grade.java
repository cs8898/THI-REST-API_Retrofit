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
import ml.raketeufo.thirestbridge.api.model.ListGrade;
/**
 * Grade
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-05T00:54:42.271211+02:00[Europe/Berlin]")
public class Grade {
  @SerializedName("angerechnet")
  private Boolean angerechnet = null;

  @SerializedName("ects")
  private Double ects = null;

  @SerializedName("fehlversuche")
  private Integer fehlversuche = null;

  @SerializedName("fristSemester")
  private String fristSemester = null;

  @SerializedName("group")
  private Boolean group = null;

  @SerializedName("kztn")
  private String kztn = null;

  @SerializedName("modulNummer")
  private String modulNummer = null;

  @SerializedName("note")
  private Double note = null;

  @SerializedName("studiengang")
  private String studiengang = null;

  @SerializedName("titel")
  private String titel = null;

  @SerializedName("unterPruefungen")
  private ListGrade unterPruefungen = null;

  @SerializedName("wahlPflichtFach")
  private Boolean wahlPflichtFach = null;

  public Grade angerechnet(Boolean angerechnet) {
    this.angerechnet = angerechnet;
    return this;
  }

   /**
   * Get angerechnet
   * @return angerechnet
  **/
  @Schema(description = "")
  public Boolean isAngerechnet() {
    return angerechnet;
  }

  public void setAngerechnet(Boolean angerechnet) {
    this.angerechnet = angerechnet;
  }

  public Grade ects(Double ects) {
    this.ects = ects;
    return this;
  }

   /**
   * Get ects
   * @return ects
  **/
  @Schema(description = "")
  public Double getEcts() {
    return ects;
  }

  public void setEcts(Double ects) {
    this.ects = ects;
  }

  public Grade fehlversuche(Integer fehlversuche) {
    this.fehlversuche = fehlversuche;
    return this;
  }

   /**
   * Get fehlversuche
   * @return fehlversuche
  **/
  @Schema(description = "")
  public Integer getFehlversuche() {
    return fehlversuche;
  }

  public void setFehlversuche(Integer fehlversuche) {
    this.fehlversuche = fehlversuche;
  }

  public Grade fristSemester(String fristSemester) {
    this.fristSemester = fristSemester;
    return this;
  }

   /**
   * Get fristSemester
   * @return fristSemester
  **/
  @Schema(description = "")
  public String getFristSemester() {
    return fristSemester;
  }

  public void setFristSemester(String fristSemester) {
    this.fristSemester = fristSemester;
  }

  public Grade group(Boolean group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Schema(description = "")
  public Boolean isGroup() {
    return group;
  }

  public void setGroup(Boolean group) {
    this.group = group;
  }

  public Grade kztn(String kztn) {
    this.kztn = kztn;
    return this;
  }

   /**
   * Get kztn
   * @return kztn
  **/
  @Schema(description = "")
  public String getKztn() {
    return kztn;
  }

  public void setKztn(String kztn) {
    this.kztn = kztn;
  }

  public Grade modulNummer(String modulNummer) {
    this.modulNummer = modulNummer;
    return this;
  }

   /**
   * Get modulNummer
   * @return modulNummer
  **/
  @Schema(description = "")
  public String getModulNummer() {
    return modulNummer;
  }

  public void setModulNummer(String modulNummer) {
    this.modulNummer = modulNummer;
  }

  public Grade note(Double note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @Schema(description = "")
  public Double getNote() {
    return note;
  }

  public void setNote(Double note) {
    this.note = note;
  }

  public Grade studiengang(String studiengang) {
    this.studiengang = studiengang;
    return this;
  }

   /**
   * Get studiengang
   * @return studiengang
  **/
  @Schema(description = "")
  public String getStudiengang() {
    return studiengang;
  }

  public void setStudiengang(String studiengang) {
    this.studiengang = studiengang;
  }

  public Grade titel(String titel) {
    this.titel = titel;
    return this;
  }

   /**
   * Get titel
   * @return titel
  **/
  @Schema(description = "")
  public String getTitel() {
    return titel;
  }

  public void setTitel(String titel) {
    this.titel = titel;
  }

  public Grade unterPruefungen(ListGrade unterPruefungen) {
    this.unterPruefungen = unterPruefungen;
    return this;
  }

   /**
   * Get unterPruefungen
   * @return unterPruefungen
  **/
  @Schema(description = "")
  public ListGrade getUnterPruefungen() {
    return unterPruefungen;
  }

  public void setUnterPruefungen(ListGrade unterPruefungen) {
    this.unterPruefungen = unterPruefungen;
  }

  public Grade wahlPflichtFach(Boolean wahlPflichtFach) {
    this.wahlPflichtFach = wahlPflichtFach;
    return this;
  }

   /**
   * Get wahlPflichtFach
   * @return wahlPflichtFach
  **/
  @Schema(description = "")
  public Boolean isWahlPflichtFach() {
    return wahlPflichtFach;
  }

  public void setWahlPflichtFach(Boolean wahlPflichtFach) {
    this.wahlPflichtFach = wahlPflichtFach;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grade grade = (Grade) o;
    return Objects.equals(this.angerechnet, grade.angerechnet) &&
        Objects.equals(this.ects, grade.ects) &&
        Objects.equals(this.fehlversuche, grade.fehlversuche) &&
        Objects.equals(this.fristSemester, grade.fristSemester) &&
        Objects.equals(this.group, grade.group) &&
        Objects.equals(this.kztn, grade.kztn) &&
        Objects.equals(this.modulNummer, grade.modulNummer) &&
        Objects.equals(this.note, grade.note) &&
        Objects.equals(this.studiengang, grade.studiengang) &&
        Objects.equals(this.titel, grade.titel) &&
        Objects.equals(this.unterPruefungen, grade.unterPruefungen) &&
        Objects.equals(this.wahlPflichtFach, grade.wahlPflichtFach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(angerechnet, ects, fehlversuche, fristSemester, group, kztn, modulNummer, note, studiengang, titel, unterPruefungen, wahlPflichtFach);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grade {\n");
    
    sb.append("    angerechnet: ").append(toIndentedString(angerechnet)).append("\n");
    sb.append("    ects: ").append(toIndentedString(ects)).append("\n");
    sb.append("    fehlversuche: ").append(toIndentedString(fehlversuche)).append("\n");
    sb.append("    fristSemester: ").append(toIndentedString(fristSemester)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kztn: ").append(toIndentedString(kztn)).append("\n");
    sb.append("    modulNummer: ").append(toIndentedString(modulNummer)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    studiengang: ").append(toIndentedString(studiengang)).append("\n");
    sb.append("    titel: ").append(toIndentedString(titel)).append("\n");
    sb.append("    unterPruefungen: ").append(toIndentedString(unterPruefungen)).append("\n");
    sb.append("    wahlPflichtFach: ").append(toIndentedString(wahlPflichtFach)).append("\n");
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