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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Identifies a risk profile.
 */
@ApiModel(description = "Identifies a risk profile.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class Riskv1decisionsRiskInformationProfile {
  @SerializedName("name")
  private String name = null;

  public Riskv1decisionsRiskInformationProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the active profile chosen by the profile selector. If no profile selector exists, the default active profile is chosen.  **Note** By default, your default profile is the active profile, or the Profile Selector chooses the active profile. Use this field only if you want to specify the name of a different profile. The passed-in profile will then become the active profile. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of the active profile chosen by the profile selector. If no profile selector exists, the default active profile is chosen.  **Note** By default, your default profile is the active profile, or the Profile Selector chooses the active profile. Use this field only if you want to specify the name of a different profile. The passed-in profile will then become the active profile. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsRiskInformationProfile riskv1decisionsRiskInformationProfile = (Riskv1decisionsRiskInformationProfile) o;
    return Objects.equals(this.name, riskv1decisionsRiskInformationProfile.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsRiskInformationProfile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

