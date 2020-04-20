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
 * TssV2TransactionsGet200ResponsePaymentInformationInvoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationInvoice {
  @SerializedName("number")
  private String number = null;

  @SerializedName("barcodeNumber")
  private String barcodeNumber = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  public TssV2TransactionsGet200ResponsePaymentInformationInvoice number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Invoice Number.
   * @return number
  **/
  @ApiModelProperty(value = "Invoice Number.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationInvoice barcodeNumber(String barcodeNumber) {
    this.barcodeNumber = barcodeNumber;
    return this;
  }

   /**
   * Barcode Number.
   * @return barcodeNumber
  **/
  @ApiModelProperty(value = "Barcode Number.")
  public String getBarcodeNumber() {
    return barcodeNumber;
  }

  public void setBarcodeNumber(String barcodeNumber) {
    this.barcodeNumber = barcodeNumber;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationInvoice expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration Date.
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Expiration Date.")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationInvoice tssV2TransactionsGet200ResponsePaymentInformationInvoice = (TssV2TransactionsGet200ResponsePaymentInformationInvoice) o;
    return Objects.equals(this.number, tssV2TransactionsGet200ResponsePaymentInformationInvoice.number) &&
        Objects.equals(this.barcodeNumber, tssV2TransactionsGet200ResponsePaymentInformationInvoice.barcodeNumber) &&
        Objects.equals(this.expirationDate, tssV2TransactionsGet200ResponsePaymentInformationInvoice.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, barcodeNumber, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationInvoice {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    barcodeNumber: ").append(toIndentedString(barcodeNumber)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

