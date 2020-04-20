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
import org.joda.time.DateTime;

/**
 * ReportingV3ConversionDetailsGet200ResponseNotes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class ReportingV3ConversionDetailsGet200ResponseNotes {
  @SerializedName("time")
  private DateTime time = null;

  @SerializedName("addedBy")
  private String addedBy = null;

  @SerializedName("comments")
  private String comments = null;

  public ReportingV3ConversionDetailsGet200ResponseNotes time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Time of the note added by reviewer
   * @return time
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Time of the note added by reviewer")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public ReportingV3ConversionDetailsGet200ResponseNotes addedBy(String addedBy) {
    this.addedBy = addedBy;
    return this;
  }

   /**
   * Note added by reviewer
   * @return addedBy
  **/
  @ApiModelProperty(example = "testuserId", value = "Note added by reviewer")
  public String getAddedBy() {
    return addedBy;
  }

  public void setAddedBy(String addedBy) {
    this.addedBy = addedBy;
  }

  public ReportingV3ConversionDetailsGet200ResponseNotes comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments given by the reviewer
   * @return comments
  **/
  @ApiModelProperty(example = "Verified the order and accepted.", value = "Comments given by the reviewer")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ConversionDetailsGet200ResponseNotes reportingV3ConversionDetailsGet200ResponseNotes = (ReportingV3ConversionDetailsGet200ResponseNotes) o;
    return Objects.equals(this.time, reportingV3ConversionDetailsGet200ResponseNotes.time) &&
        Objects.equals(this.addedBy, reportingV3ConversionDetailsGet200ResponseNotes.addedBy) &&
        Objects.equals(this.comments, reportingV3ConversionDetailsGet200ResponseNotes.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, addedBy, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ConversionDetailsGet200ResponseNotes {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

