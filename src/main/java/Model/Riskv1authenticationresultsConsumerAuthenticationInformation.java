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
 * Riskv1authenticationresultsConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T16:51:14.356+05:30")
public class Riskv1authenticationresultsConsumerAuthenticationInformation {
  @SerializedName("authenticationTransactionId")
  private String authenticationTransactionId = null;

  @SerializedName("signedPares")
  private String signedPares = null;

  public Riskv1authenticationresultsConsumerAuthenticationInformation authenticationTransactionId(String authenticationTransactionId) {
    this.authenticationTransactionId = authenticationTransactionId;
    return this;
  }

   /**
   * Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages. **Note**: Required for Standard integration for enroll service. Required for Hybrid integration for validate service. 
   * @return authenticationTransactionId
  **/
  @ApiModelProperty(value = "Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages. **Note**: Required for Standard integration for enroll service. Required for Hybrid integration for validate service. ")
  public String getAuthenticationTransactionId() {
    return authenticationTransactionId;
  }

  public void setAuthenticationTransactionId(String authenticationTransactionId) {
    this.authenticationTransactionId = authenticationTransactionId;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation signedPares(String signedPares) {
    this.signedPares = signedPares;
    return this;
  }

   /**
   * Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \&quot;Storing Payer Authentication Data,\&quot; page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request. 
   * @return signedPares
  **/
  @ApiModelProperty(required = true, value = "Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \"Storing Payer Authentication Data,\" page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request. ")
  public String getSignedPares() {
    return signedPares;
  }

  public void setSignedPares(String signedPares) {
    this.signedPares = signedPares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationresultsConsumerAuthenticationInformation riskv1authenticationresultsConsumerAuthenticationInformation = (Riskv1authenticationresultsConsumerAuthenticationInformation) o;
    return Objects.equals(this.authenticationTransactionId, riskv1authenticationresultsConsumerAuthenticationInformation.authenticationTransactionId) &&
        Objects.equals(this.signedPares, riskv1authenticationresultsConsumerAuthenticationInformation.signedPares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationTransactionId, signedPares);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationresultsConsumerAuthenticationInformation {\n");
    
    sb.append("    authenticationTransactionId: ").append(toIndentedString(authenticationTransactionId)).append("\n");
    sb.append("    signedPares: ").append(toIndentedString(signedPares)).append("\n");
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
