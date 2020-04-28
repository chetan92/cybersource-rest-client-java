/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.PtsV2PaymentsPost201ResponseRiskInformationTravelActualFinalDestination;
import Model.PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDeparture;
import Model.PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDestination;
import Model.PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponseRiskInformationTravel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class PtsV2PaymentsPost201ResponseRiskInformationTravel {
  @SerializedName("actualFinalDestination")
  private PtsV2PaymentsPost201ResponseRiskInformationTravelActualFinalDestination actualFinalDestination = null;

  @SerializedName("firstDeparture")
  private PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDeparture firstDeparture = null;

  @SerializedName("firstDestination")
  private PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDestination firstDestination = null;

  @SerializedName("lastDestination")
  private PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination lastDestination = null;

  public PtsV2PaymentsPost201ResponseRiskInformationTravel actualFinalDestination(PtsV2PaymentsPost201ResponseRiskInformationTravelActualFinalDestination actualFinalDestination) {
    this.actualFinalDestination = actualFinalDestination;
    return this;
  }

   /**
   * Get actualFinalDestination
   * @return actualFinalDestination
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationTravelActualFinalDestination getActualFinalDestination() {
    return actualFinalDestination;
  }

  public void setActualFinalDestination(PtsV2PaymentsPost201ResponseRiskInformationTravelActualFinalDestination actualFinalDestination) {
    this.actualFinalDestination = actualFinalDestination;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationTravel firstDeparture(PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDeparture firstDeparture) {
    this.firstDeparture = firstDeparture;
    return this;
  }

   /**
   * Get firstDeparture
   * @return firstDeparture
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDeparture getFirstDeparture() {
    return firstDeparture;
  }

  public void setFirstDeparture(PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDeparture firstDeparture) {
    this.firstDeparture = firstDeparture;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationTravel firstDestination(PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDestination firstDestination) {
    this.firstDestination = firstDestination;
    return this;
  }

   /**
   * Get firstDestination
   * @return firstDestination
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDestination getFirstDestination() {
    return firstDestination;
  }

  public void setFirstDestination(PtsV2PaymentsPost201ResponseRiskInformationTravelFirstDestination firstDestination) {
    this.firstDestination = firstDestination;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationTravel lastDestination(PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination lastDestination) {
    this.lastDestination = lastDestination;
    return this;
  }

   /**
   * Get lastDestination
   * @return lastDestination
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination getLastDestination() {
    return lastDestination;
  }

  public void setLastDestination(PtsV2PaymentsPost201ResponseRiskInformationTravelLastDestination lastDestination) {
    this.lastDestination = lastDestination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationTravel ptsV2PaymentsPost201ResponseRiskInformationTravel = (PtsV2PaymentsPost201ResponseRiskInformationTravel) o;
    return Objects.equals(this.actualFinalDestination, ptsV2PaymentsPost201ResponseRiskInformationTravel.actualFinalDestination) &&
        Objects.equals(this.firstDeparture, ptsV2PaymentsPost201ResponseRiskInformationTravel.firstDeparture) &&
        Objects.equals(this.firstDestination, ptsV2PaymentsPost201ResponseRiskInformationTravel.firstDestination) &&
        Objects.equals(this.lastDestination, ptsV2PaymentsPost201ResponseRiskInformationTravel.lastDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualFinalDestination, firstDeparture, firstDestination, lastDestination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationTravel {\n");
    
    sb.append("    actualFinalDestination: ").append(toIndentedString(actualFinalDestination)).append("\n");
    sb.append("    firstDeparture: ").append(toIndentedString(firstDeparture)).append("\n");
    sb.append("    firstDestination: ").append(toIndentedString(firstDestination)).append("\n");
    sb.append("    lastDestination: ").append(toIndentedString(lastDestination)).append("\n");
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

