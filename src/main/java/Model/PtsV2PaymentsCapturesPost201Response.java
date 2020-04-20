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
import Model.PtsV2PaymentsCapturesPost201ResponseLinks;
import Model.PtsV2PaymentsCapturesPost201ResponseOrderInformation;
import Model.PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation;
import Model.PtsV2PaymentsCapturesPost201ResponseProcessingInformation;
import Model.PtsV2PaymentsCapturesPost201ResponseProcessorInformation;
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsCapturesPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class PtsV2PaymentsCapturesPost201Response {
  @SerializedName("_links")
  private PtsV2PaymentsCapturesPost201ResponseLinks links = null;

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

  @SerializedName("processorInformation")
  private PtsV2PaymentsCapturesPost201ResponseProcessorInformation processorInformation = null;

  @SerializedName("orderInformation")
  private PtsV2PaymentsCapturesPost201ResponseOrderInformation orderInformation = null;

  @SerializedName("processingInformation")
  private PtsV2PaymentsCapturesPost201ResponseProcessingInformation processingInformation = null;

  @SerializedName("pointOfSaleInformation")
  private PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation pointOfSaleInformation = null;

  public PtsV2PaymentsCapturesPost201Response links(PtsV2PaymentsCapturesPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsCapturesPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2PaymentsCapturesPost201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2PaymentsCapturesPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.  On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.  On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2PaymentsCapturesPost201Response submitTimeUtc(String submitTimeUtc) {
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

  public PtsV2PaymentsCapturesPost201Response status(String status) {
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

  public PtsV2PaymentsCapturesPost201Response reconciliationId(String reconciliationId) {
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

  public PtsV2PaymentsCapturesPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
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

  public PtsV2PaymentsCapturesPost201Response processorInformation(PtsV2PaymentsCapturesPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsCapturesPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PaymentsCapturesPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2PaymentsCapturesPost201Response orderInformation(PtsV2PaymentsCapturesPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsCapturesPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PtsV2PaymentsCapturesPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PtsV2PaymentsCapturesPost201Response processingInformation(PtsV2PaymentsCapturesPost201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsCapturesPost201ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(PtsV2PaymentsCapturesPost201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PtsV2PaymentsCapturesPost201Response pointOfSaleInformation(PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(PtsV2PaymentsCapturesPost201ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsCapturesPost201Response ptsV2PaymentsCapturesPost201Response = (PtsV2PaymentsCapturesPost201Response) o;
    return Objects.equals(this.links, ptsV2PaymentsCapturesPost201Response.links) &&
        Objects.equals(this.id, ptsV2PaymentsCapturesPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2PaymentsCapturesPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2PaymentsCapturesPost201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2PaymentsCapturesPost201Response.reconciliationId) &&
        Objects.equals(this.clientReferenceInformation, ptsV2PaymentsCapturesPost201Response.clientReferenceInformation) &&
        Objects.equals(this.processorInformation, ptsV2PaymentsCapturesPost201Response.processorInformation) &&
        Objects.equals(this.orderInformation, ptsV2PaymentsCapturesPost201Response.orderInformation) &&
        Objects.equals(this.processingInformation, ptsV2PaymentsCapturesPost201Response.processingInformation) &&
        Objects.equals(this.pointOfSaleInformation, ptsV2PaymentsCapturesPost201Response.pointOfSaleInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, reconciliationId, clientReferenceInformation, processorInformation, orderInformation, processingInformation, pointOfSaleInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsCapturesPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
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

