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
 * TssV2TransactionsGet200ResponsePaymentInformationPaymentType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationPaymentType {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("method")
  private String method = null;

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. Possible values: - &#x60;CARD&#x60; (use this for a PIN debit transaction) - &#x60;CHECK&#x60; (use this for eCheck payment and this is equivalent to invoke ics_ecp_debit or ics_ecp_credit service) 
   * @return name
  **/
  @ApiModelProperty(value = "A Payment Type is an agreed means for a payee to receive legal tender from a payer. The way one pays for a commercial financial transaction. Examples: Card, Bank Transfer, Digital, Direct Debit. Possible values: - `CARD` (use this for a PIN debit transaction) - `CHECK` (use this for eCheck payment and this is equivalent to invoke ics_ecp_debit or ics_ecp_credit service) ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the payment type used in this payment transaction. Example: credit card, check
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the payment type used in this payment transaction. Example: credit card, check")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Indicates the payment method used in this payment transaction.
   * @return method
  **/
  @ApiModelProperty(value = "Indicates the payment method used in this payment transaction.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationPaymentType tssV2TransactionsGet200ResponsePaymentInformationPaymentType = (TssV2TransactionsGet200ResponsePaymentInformationPaymentType) o;
    return Objects.equals(this.name, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.name) &&
        Objects.equals(this.type, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.type) &&
        Objects.equals(this.method, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationPaymentType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

