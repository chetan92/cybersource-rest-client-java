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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvoicingV2InvoicesAllGet200ResponseLinks1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class InvoicingV2InvoicesAllGet200ResponseLinks1 {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("update")
  private PtsV2PaymentsPost201ResponseLinksSelf update = null;

  @SerializedName("deliver")
  private PtsV2PaymentsPost201ResponseLinksSelf deliver = null;

  @SerializedName("cancel")
  private PtsV2PaymentsPost201ResponseLinksSelf cancel = null;

  public InvoicingV2InvoicesAllGet200ResponseLinks1 self(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
  }

  public InvoicingV2InvoicesAllGet200ResponseLinks1 update(PtsV2PaymentsPost201ResponseLinksSelf update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getUpdate() {
    return update;
  }

  public void setUpdate(PtsV2PaymentsPost201ResponseLinksSelf update) {
    this.update = update;
  }

  public InvoicingV2InvoicesAllGet200ResponseLinks1 deliver(PtsV2PaymentsPost201ResponseLinksSelf deliver) {
    this.deliver = deliver;
    return this;
  }

   /**
   * Get deliver
   * @return deliver
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getDeliver() {
    return deliver;
  }

  public void setDeliver(PtsV2PaymentsPost201ResponseLinksSelf deliver) {
    this.deliver = deliver;
  }

  public InvoicingV2InvoicesAllGet200ResponseLinks1 cancel(PtsV2PaymentsPost201ResponseLinksSelf cancel) {
    this.cancel = cancel;
    return this;
  }

   /**
   * Get cancel
   * @return cancel
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getCancel() {
    return cancel;
  }

  public void setCancel(PtsV2PaymentsPost201ResponseLinksSelf cancel) {
    this.cancel = cancel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesAllGet200ResponseLinks1 invoicingV2InvoicesAllGet200ResponseLinks1 = (InvoicingV2InvoicesAllGet200ResponseLinks1) o;
    return Objects.equals(this.self, invoicingV2InvoicesAllGet200ResponseLinks1.self) &&
        Objects.equals(this.update, invoicingV2InvoicesAllGet200ResponseLinks1.update) &&
        Objects.equals(this.deliver, invoicingV2InvoicesAllGet200ResponseLinks1.deliver) &&
        Objects.equals(this.cancel, invoicingV2InvoicesAllGet200ResponseLinks1.cancel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, update, deliver, cancel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesAllGet200ResponseLinks1 {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    deliver: ").append(toIndentedString(deliver)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
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

