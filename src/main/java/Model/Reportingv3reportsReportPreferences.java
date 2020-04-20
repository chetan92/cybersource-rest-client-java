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
 * Report Preferences
 */
@ApiModel(description = "Report Preferences")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class Reportingv3reportsReportPreferences {
  @SerializedName("signedAmounts")
  private Boolean signedAmounts = null;

  @SerializedName("fieldNameConvention")
  private String fieldNameConvention = null;

  public Reportingv3reportsReportPreferences signedAmounts(Boolean signedAmounts) {
    this.signedAmounts = signedAmounts;
    return this;
  }

   /**
   * Indicator to determine whether negative sign infront of amount for all refunded transaction
   * @return signedAmounts
  **/
  @ApiModelProperty(value = "Indicator to determine whether negative sign infront of amount for all refunded transaction")
  public Boolean getSignedAmounts() {
    return signedAmounts;
  }

  public void setSignedAmounts(Boolean signedAmounts) {
    this.signedAmounts = signedAmounts;
  }

  public Reportingv3reportsReportPreferences fieldNameConvention(String fieldNameConvention) {
    this.fieldNameConvention = fieldNameConvention;
    return this;
  }

   /**
   * Specify the field naming convention to be followed in reports (applicable to only csv report formats)  Valid values: - SOAPI - SCMP 
   * @return fieldNameConvention
  **/
  @ApiModelProperty(value = "Specify the field naming convention to be followed in reports (applicable to only csv report formats)  Valid values: - SOAPI - SCMP ")
  public String getFieldNameConvention() {
    return fieldNameConvention;
  }

  public void setFieldNameConvention(String fieldNameConvention) {
    this.fieldNameConvention = fieldNameConvention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportingv3reportsReportPreferences reportingv3reportsReportPreferences = (Reportingv3reportsReportPreferences) o;
    return Objects.equals(this.signedAmounts, reportingv3reportsReportPreferences.signedAmounts) &&
        Objects.equals(this.fieldNameConvention, reportingv3reportsReportPreferences.fieldNameConvention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedAmounts, fieldNameConvention);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportingv3reportsReportPreferences {\n");
    
    sb.append("    signedAmounts: ").append(toIndentedString(signedAmounts)).append("\n");
    sb.append("    fieldNameConvention: ").append(toIndentedString(fieldNameConvention)).append("\n");
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

