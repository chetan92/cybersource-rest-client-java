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
import Model.Invoicingv2invoicesOrderInformationAmountDetailsFreight;
import Model.Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Contains all of the amount-related fields in the invoice.
 */
@ApiModel(description = "Contains all of the amount-related fields in the invoice.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class Invoicingv2invoicesOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("discountAmount")
  private String discountAmount = null;

  @SerializedName("discountPercent")
  private BigDecimal discountPercent = null;

  @SerializedName("subAmount")
  private BigDecimal subAmount = null;

  @SerializedName("minimumPartialAmount")
  private BigDecimal minimumPartialAmount = null;

  @SerializedName("taxDetails")
  private Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails taxDetails = null;

  @SerializedName("freight")
  private Invoicingv2invoicesOrderInformationAmountDetailsFreight freight = null;

  public Invoicingv2invoicesOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. For details, see: - \&quot;Authorization Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \&quot;Capture Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \&quot;Credit Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. For details, see \&quot;Zero Amount Authorizations,\&quot; \&quot;Credit Information for Specific Processors\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either this field or the 1st line item in the order and the specific line-order amount in your request. For details, see &#x60;grand_total_amount&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in \&quot;Authorization Information for Specific Processors\&quot; of the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### DCC for First Data Not used.  #### Invoicing Grand total for the order, this is required for creating a new invoice. 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. For details, see: - \"Authorization Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \"Capture Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \"Credit Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. For details, see \"Zero Amount Authorizations,\" \"Credit Information for Specific Processors\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either this field or the 1st line item in the order and the specific line-order amount in your request. For details, see `grand_total_amount` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in \"Authorization Information for Specific Processors\" of the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### DCC for First Data Not used.  #### Invoicing Grand total for the order, this is required for creating a new invoice. ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Invoicingv2invoicesOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character I[ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  For details about currency as used in partial authorizations, see \&quot;Features for Debit Cards and Prepaid Cards\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your payment authorization request.  #### DCC for First Data Your local currency. For details, see the &#x60;currency&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf). 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character I[ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  For details about currency as used in partial authorizations, see \"Features for Debit Cards and Prepaid Cards\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your payment authorization request.  #### DCC for First Data Your local currency. For details, see the `currency` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf). ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Invoicingv2invoicesOrderInformationAmountDetails discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Total discount amount applied to the order.  For processor-specific information, see the order_discount_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return discountAmount
  **/
  @ApiModelProperty(value = "Total discount amount applied to the order.  For processor-specific information, see the order_discount_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Invoicingv2invoicesOrderInformationAmountDetails discountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * The total discount percentage applied to the invoice.
   * @return discountPercent
  **/
  @ApiModelProperty(value = "The total discount percentage applied to the invoice.")
  public BigDecimal getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public Invoicingv2invoicesOrderInformationAmountDetails subAmount(BigDecimal subAmount) {
    this.subAmount = subAmount;
    return this;
  }

   /**
   * Sub-amount of the invoice.
   * @return subAmount
  **/
  @ApiModelProperty(value = "Sub-amount of the invoice.")
  public BigDecimal getSubAmount() {
    return subAmount;
  }

  public void setSubAmount(BigDecimal subAmount) {
    this.subAmount = subAmount;
  }

  public Invoicingv2invoicesOrderInformationAmountDetails minimumPartialAmount(BigDecimal minimumPartialAmount) {
    this.minimumPartialAmount = minimumPartialAmount;
    return this;
  }

   /**
   * The minimum partial amount required to pay the invoice.
   * @return minimumPartialAmount
  **/
  @ApiModelProperty(value = "The minimum partial amount required to pay the invoice.")
  public BigDecimal getMinimumPartialAmount() {
    return minimumPartialAmount;
  }

  public void setMinimumPartialAmount(BigDecimal minimumPartialAmount) {
    this.minimumPartialAmount = minimumPartialAmount;
  }

  public Invoicingv2invoicesOrderInformationAmountDetails taxDetails(Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(Invoicingv2invoicesOrderInformationAmountDetailsTaxDetails taxDetails) {
    this.taxDetails = taxDetails;
  }

  public Invoicingv2invoicesOrderInformationAmountDetails freight(Invoicingv2invoicesOrderInformationAmountDetailsFreight freight) {
    this.freight = freight;
    return this;
  }

   /**
   * Get freight
   * @return freight
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesOrderInformationAmountDetailsFreight getFreight() {
    return freight;
  }

  public void setFreight(Invoicingv2invoicesOrderInformationAmountDetailsFreight freight) {
    this.freight = freight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoicingv2invoicesOrderInformationAmountDetails invoicingv2invoicesOrderInformationAmountDetails = (Invoicingv2invoicesOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, invoicingv2invoicesOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, invoicingv2invoicesOrderInformationAmountDetails.currency) &&
        Objects.equals(this.discountAmount, invoicingv2invoicesOrderInformationAmountDetails.discountAmount) &&
        Objects.equals(this.discountPercent, invoicingv2invoicesOrderInformationAmountDetails.discountPercent) &&
        Objects.equals(this.subAmount, invoicingv2invoicesOrderInformationAmountDetails.subAmount) &&
        Objects.equals(this.minimumPartialAmount, invoicingv2invoicesOrderInformationAmountDetails.minimumPartialAmount) &&
        Objects.equals(this.taxDetails, invoicingv2invoicesOrderInformationAmountDetails.taxDetails) &&
        Objects.equals(this.freight, invoicingv2invoicesOrderInformationAmountDetails.freight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, discountAmount, discountPercent, subAmount, minimumPartialAmount, taxDetails, freight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoicingv2invoicesOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    subAmount: ").append(toIndentedString(subAmount)).append("\n");
    sb.append("    minimumPartialAmount: ").append(toIndentedString(minimumPartialAmount)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
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

