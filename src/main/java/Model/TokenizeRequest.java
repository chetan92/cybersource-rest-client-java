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
import Model.Flexv1tokensCardInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TokenizeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class TokenizeRequest {
  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("cardInfo")
  private Flexv1tokensCardInfo cardInfo = null;

  public TokenizeRequest keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Unique identifier for the generated token. This is obtained from the Generate Key request. See the [Java Script and Java examples](http://apps.cybersource.com/library/documentation/dev_guides/Secure_Acceptance_Flex/Key/html) on how to import the key and encrypt using the imported key.
   * @return keyId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the generated token. This is obtained from the Generate Key request. See the [Java Script and Java examples](http://apps.cybersource.com/library/documentation/dev_guides/Secure_Acceptance_Flex/Key/html) on how to import the key and encrypt using the imported key.")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public TokenizeRequest cardInfo(Flexv1tokensCardInfo cardInfo) {
    this.cardInfo = cardInfo;
    return this;
  }

   /**
   * Get cardInfo
   * @return cardInfo
  **/
  @ApiModelProperty(value = "")
  public Flexv1tokensCardInfo getCardInfo() {
    return cardInfo;
  }

  public void setCardInfo(Flexv1tokensCardInfo cardInfo) {
    this.cardInfo = cardInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeRequest tokenizeRequest = (TokenizeRequest) o;
    return Objects.equals(this.keyId, tokenizeRequest.keyId) &&
        Objects.equals(this.cardInfo, tokenizeRequest.cardInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, cardInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeRequest {\n");
    
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    cardInfo: ").append(toIndentedString(cardInfo)).append("\n");
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

