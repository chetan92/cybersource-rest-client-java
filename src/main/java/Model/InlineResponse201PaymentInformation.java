/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse201PaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse201PaymentInformation {
  @SerializedName("card")
  private InlineResponse201PaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private InlineResponse201PaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("accountFeatures")
  private InlineResponse201PaymentInformationAccountFeatures accountFeatures = null;

  public InlineResponse201PaymentInformation card(InlineResponse201PaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201PaymentInformationCard getCard() {
    return card;
  }

  public void setCard(InlineResponse201PaymentInformationCard card) {
    this.card = card;
  }

  public InlineResponse201PaymentInformation tokenizedCard(InlineResponse201PaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201PaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(InlineResponse201PaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public InlineResponse201PaymentInformation accountFeatures(InlineResponse201PaymentInformationAccountFeatures accountFeatures) {
    this.accountFeatures = accountFeatures;
    return this;
  }

   /**
   * Get accountFeatures
   * @return accountFeatures
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201PaymentInformationAccountFeatures getAccountFeatures() {
    return accountFeatures;
  }

  public void setAccountFeatures(InlineResponse201PaymentInformationAccountFeatures accountFeatures) {
    this.accountFeatures = accountFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201PaymentInformation inlineResponse201PaymentInformation = (InlineResponse201PaymentInformation) o;
    return Objects.equals(this.card, inlineResponse201PaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, inlineResponse201PaymentInformation.tokenizedCard) &&
        Objects.equals(this.accountFeatures, inlineResponse201PaymentInformation.accountFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, accountFeatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201PaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    accountFeatures: ").append(toIndentedString(accountFeatures)).append("\n");
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
