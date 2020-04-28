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
import org.joda.time.LocalDate;

/**
 * Contains all of the invoice-specific fields, such as the invoice number and due date.
 */
@ApiModel(description = "Contains all of the invoice-specific fields, such as the invoice number and due date.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class InvoicingV2InvoicesPost201ResponseInvoiceInformation {
  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dueDate")
  private LocalDate dueDate = null;

  @SerializedName("allowPartialPayments")
  private Boolean allowPartialPayments = null;

  @SerializedName("paymentLink")
  private String paymentLink = null;

  @SerializedName("deliveryMode")
  private String deliveryMode = null;

  public InvoicingV2InvoicesPost201ResponseInvoiceInformation invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice Number.
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "Invoice Number.")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public InvoicingV2InvoicesPost201ResponseInvoiceInformation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description included in the invoice.
   * @return description
  **/
  @ApiModelProperty(value = "The description included in the invoice.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InvoicingV2InvoicesPost201ResponseInvoiceInformation dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * The invoice due date. This field is required for creating an invoice. Format: &#x60;YYYY-MM-DD&#x60;, where &#x60;YYYY&#x60; &#x3D; year, &#x60;MM&#x60; &#x3D; month, and &#x60;DD&#x60; &#x3D; day 
   * @return dueDate
  **/
  @ApiModelProperty(value = "The invoice due date. This field is required for creating an invoice. Format: `YYYY-MM-DD`, where `YYYY` = year, `MM` = month, and `DD` = day ")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public InvoicingV2InvoicesPost201ResponseInvoiceInformation allowPartialPayments(Boolean allowPartialPayments) {
    this.allowPartialPayments = allowPartialPayments;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, the payer can make a partial invoice payment.
   * @return allowPartialPayments
  **/
  @ApiModelProperty(value = "If set to `true`, the payer can make a partial invoice payment.")
  public Boolean getAllowPartialPayments() {
    return allowPartialPayments;
  }

  public void setAllowPartialPayments(Boolean allowPartialPayments) {
    this.allowPartialPayments = allowPartialPayments;
  }

  public InvoicingV2InvoicesPost201ResponseInvoiceInformation paymentLink(String paymentLink) {
    this.paymentLink = paymentLink;
    return this;
  }

   /**
   * Returns the payment link to an invoice when the invoice status is &#x60;SENT&#x60;, &#x60;CREATED&#x60;, &#x60;PARTIAL&#x60;, or &#x60;PAID&#x60;.
   * @return paymentLink
  **/
  @ApiModelProperty(value = "Returns the payment link to an invoice when the invoice status is `SENT`, `CREATED`, `PARTIAL`, or `PAID`.")
  public String getPaymentLink() {
    return paymentLink;
  }

  public void setPaymentLink(String paymentLink) {
    this.paymentLink = paymentLink;
  }

  public InvoicingV2InvoicesPost201ResponseInvoiceInformation deliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * If set to &#x60;None&#x60;, the invoice is created, and its status is set to &#39;CREATED&#39;, but no email is sent.    Possible values:        - &#x60;None&#x60;   - &#x60;Email&#x60;  
   * @return deliveryMode
  **/
  @ApiModelProperty(value = "If set to `None`, the invoice is created, and its status is set to 'CREATED', but no email is sent.    Possible values:        - `None`   - `Email`  ")
  public String getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesPost201ResponseInvoiceInformation invoicingV2InvoicesPost201ResponseInvoiceInformation = (InvoicingV2InvoicesPost201ResponseInvoiceInformation) o;
    return Objects.equals(this.invoiceNumber, invoicingV2InvoicesPost201ResponseInvoiceInformation.invoiceNumber) &&
        Objects.equals(this.description, invoicingV2InvoicesPost201ResponseInvoiceInformation.description) &&
        Objects.equals(this.dueDate, invoicingV2InvoicesPost201ResponseInvoiceInformation.dueDate) &&
        Objects.equals(this.allowPartialPayments, invoicingV2InvoicesPost201ResponseInvoiceInformation.allowPartialPayments) &&
        Objects.equals(this.paymentLink, invoicingV2InvoicesPost201ResponseInvoiceInformation.paymentLink) &&
        Objects.equals(this.deliveryMode, invoicingV2InvoicesPost201ResponseInvoiceInformation.deliveryMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, description, dueDate, allowPartialPayments, paymentLink, deliveryMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesPost201ResponseInvoiceInformation {\n");
    
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    allowPartialPayments: ").append(toIndentedString(allowPartialPayments)).append("\n");
    sb.append("    paymentLink: ").append(toIndentedString(paymentLink)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
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

