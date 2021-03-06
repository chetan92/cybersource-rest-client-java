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
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinks {
  @SerializedName("self")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinksSelf self = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinks self(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinksSelf getSelf() {
    return self;
  }

  public void setSelf(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinksSelf self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinks tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinks = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinks) o;
    return Objects.equals(this.self, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

