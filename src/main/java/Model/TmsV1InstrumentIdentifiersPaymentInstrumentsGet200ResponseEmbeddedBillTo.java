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
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer’s first name. For a credit card transaction, this name must match the name on the card.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return firstName
  **/
  @ApiModelProperty(example = "John", value = "Customer’s first name. For a credit card transaction, this name must match the name on the card.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer’s last name. For a credit card transaction, this name must match the name on the card.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", value = "Customer’s last name. For a credit card transaction, this name must match the name on the card.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Name of the customer’s company.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return company
  **/
  @ApiModelProperty(example = "CyberSource", value = "Name of the customer’s company.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the billing street address.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return address1
  **/
  @ApiModelProperty(example = "12 Main Street", value = "First line of the billing street address.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Additional address information.
   * @return address2
  **/
  @ApiModelProperty(example = "20 My Street", value = "Additional address information.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the billing address.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return locality
  **/
  @ApiModelProperty(example = "Foster City", value = "City of the billing address.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the billing address. For an address in the U.S. or Canada, use the State, Province, and Territory Codes for the United States and Canada.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return administrativeArea
  **/
  @ApiModelProperty(example = "CA", value = "State or province of the billing address. For an address in the U.S. or Canada, use the State, Province, and Territory Codes for the United States and Canada.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits] **Example** 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space] [numeric][alpha][numeric] Example A1B 2C3  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return postalCode
  **/
  @ApiModelProperty(example = "90200", value = "Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits] **Example** 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space] [numeric][alpha][numeric] Example A1B 2C3  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important**: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the billing address. Accepts input in the ISO 3166-1 standard, stores as ISO 3166-1-Alpha-2.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "Country of the billing address. Accepts input in the ISO 3166-1 standard, stores as ISO 3166-1-Alpha-2.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer’s email address.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return email
  **/
  @ApiModelProperty(example = "john.smith@example.com", value = "Customer’s email address.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See the TMS REST Developer Guide for more information about relaxed address requirements.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Customer phone number. When you create a customer profile, the requirements depend on the payment method:   * Credit cards — optional.   * Electronic checks — contact your payment processor representative to find out if this field is required or optional.   * PINless debits — optional. 
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "555123456", value = "Customer phone number. When you create a customer profile, the requirements depend on the payment method:   * Credit cards — optional.   * Electronic checks — contact your payment processor representative to find out if this field is required or optional.   * PINless debits — optional. ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo) o;
    return Objects.equals(this.firstName, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.firstName) &&
        Objects.equals(this.lastName, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.lastName) &&
        Objects.equals(this.company, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.company) &&
        Objects.equals(this.address1, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.address1) &&
        Objects.equals(this.address2, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.address2) &&
        Objects.equals(this.locality, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.locality) &&
        Objects.equals(this.administrativeArea, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.administrativeArea) &&
        Objects.equals(this.postalCode, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.postalCode) &&
        Objects.equals(this.country, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.country) &&
        Objects.equals(this.email, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.email) &&
        Objects.equals(this.phoneNumber, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, company, address1, address2, locality, administrativeArea, postalCode, country, email, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBillTo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

