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
import Model.Riskv1decisionsProcessorInformationAvs;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains information related to the payment processor.
 */
@ApiModel(description = "Contains information related to the payment processor.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class Riskv1decisionsProcessorInformation {
  @SerializedName("avs")
  private Riskv1decisionsProcessorInformationAvs avs = null;

  public Riskv1decisionsProcessorInformation avs(Riskv1decisionsProcessorInformationAvs avs) {
    this.avs = avs;
    return this;
  }

   /**
   * Get avs
   * @return avs
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsProcessorInformationAvs getAvs() {
    return avs;
  }

  public void setAvs(Riskv1decisionsProcessorInformationAvs avs) {
    this.avs = avs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsProcessorInformation riskv1decisionsProcessorInformation = (Riskv1decisionsProcessorInformation) o;
    return Objects.equals(this.avs, riskv1decisionsProcessorInformation.avs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsProcessorInformation {\n");
    
    sb.append("    avs: ").append(toIndentedString(avs)).append("\n");
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

