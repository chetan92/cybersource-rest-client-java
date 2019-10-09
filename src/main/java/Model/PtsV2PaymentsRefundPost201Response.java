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
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PaymentsRefundPost201ResponseLinks;
import Model.PtsV2PaymentsRefundPost201ResponseOrderInformation;
import Model.PtsV2PaymentsRefundPost201ResponseProcessorInformation;
import Model.PtsV2PaymentsRefundPost201ResponseRefundAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsRefundPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-01T12:15:30.989+05:30")
public class PtsV2PaymentsRefundPost201Response {
  @SerializedName("_links")
  private PtsV2PaymentsRefundPost201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("refundAmountDetails")
  private PtsV2PaymentsRefundPost201ResponseRefundAmountDetails refundAmountDetails = null;

  @SerializedName("processorInformation")
  private PtsV2PaymentsRefundPost201ResponseProcessorInformation processorInformation = null;

  @SerializedName("orderInformation")
  private PtsV2PaymentsRefundPost201ResponseOrderInformation orderInformation = null;

  public PtsV2PaymentsRefundPost201Response links(PtsV2PaymentsRefundPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsRefundPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2PaymentsRefundPost201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2PaymentsRefundPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2PaymentsRefundPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; Example &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` Example `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PtsV2PaymentsRefundPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - PENDING 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - PENDING ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2PaymentsRefundPost201Response reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * The reconciliation id for the submitted transaction. This value is not returned for all processors. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "The reconciliation id for the submitted transaction. This value is not returned for all processors. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PtsV2PaymentsRefundPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2PaymentsRefundPost201Response refundAmountDetails(PtsV2PaymentsRefundPost201ResponseRefundAmountDetails refundAmountDetails) {
    this.refundAmountDetails = refundAmountDetails;
    return this;
  }

   /**
   * Get refundAmountDetails
   * @return refundAmountDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsRefundPost201ResponseRefundAmountDetails getRefundAmountDetails() {
    return refundAmountDetails;
  }

  public void setRefundAmountDetails(PtsV2PaymentsRefundPost201ResponseRefundAmountDetails refundAmountDetails) {
    this.refundAmountDetails = refundAmountDetails;
  }

  public PtsV2PaymentsRefundPost201Response processorInformation(PtsV2PaymentsRefundPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsRefundPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PaymentsRefundPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2PaymentsRefundPost201Response orderInformation(PtsV2PaymentsRefundPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsRefundPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PtsV2PaymentsRefundPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsRefundPost201Response ptsV2PaymentsRefundPost201Response = (PtsV2PaymentsRefundPost201Response) o;
    return Objects.equals(this.links, ptsV2PaymentsRefundPost201Response.links) &&
        Objects.equals(this.id, ptsV2PaymentsRefundPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2PaymentsRefundPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2PaymentsRefundPost201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2PaymentsRefundPost201Response.reconciliationId) &&
        Objects.equals(this.clientReferenceInformation, ptsV2PaymentsRefundPost201Response.clientReferenceInformation) &&
        Objects.equals(this.refundAmountDetails, ptsV2PaymentsRefundPost201Response.refundAmountDetails) &&
        Objects.equals(this.processorInformation, ptsV2PaymentsRefundPost201Response.processorInformation) &&
        Objects.equals(this.orderInformation, ptsV2PaymentsRefundPost201Response.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, reconciliationId, clientReferenceInformation, refundAmountDetails, processorInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsRefundPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    refundAmountDetails: ").append(toIndentedString(refundAmountDetails)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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

