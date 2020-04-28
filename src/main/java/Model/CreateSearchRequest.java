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
 * CreateSearchRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class CreateSearchRequest {
  @SerializedName("save")
  private Boolean save = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("sort")
  private String sort = null;

  public CreateSearchRequest save(Boolean save) {
    this.save = save;
    return this;
  }

   /**
   * save or not save.
   * @return save
  **/
  @ApiModelProperty(value = "save or not save.")
  public Boolean getSave() {
    return save;
  }

  public void setSave(Boolean save) {
    this.save = save;
  }

  public CreateSearchRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The description for this field is not available. 
   * @return name
  **/
  @ApiModelProperty(value = "The description for this field is not available. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateSearchRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Time Zone in ISO format.
   * @return timezone
  **/
  @ApiModelProperty(value = "Time Zone in ISO format.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CreateSearchRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * transaction search query string.
   * @return query
  **/
  @ApiModelProperty(value = "transaction search query string.")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public CreateSearchRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * offset.
   * @return offset
  **/
  @ApiModelProperty(value = "offset.")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public CreateSearchRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limit on number of results.
   * @return limit
  **/
  @ApiModelProperty(value = "Limit on number of results.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CreateSearchRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * A comma separated list of the following form - fieldName1 asc or desc, fieldName2 asc or desc, etc.
   * @return sort
  **/
  @ApiModelProperty(value = "A comma separated list of the following form - fieldName1 asc or desc, fieldName2 asc or desc, etc.")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSearchRequest createSearchRequest = (CreateSearchRequest) o;
    return Objects.equals(this.save, createSearchRequest.save) &&
        Objects.equals(this.name, createSearchRequest.name) &&
        Objects.equals(this.timezone, createSearchRequest.timezone) &&
        Objects.equals(this.query, createSearchRequest.query) &&
        Objects.equals(this.offset, createSearchRequest.offset) &&
        Objects.equals(this.limit, createSearchRequest.limit) &&
        Objects.equals(this.sort, createSearchRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(save, name, timezone, query, offset, limit, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSearchRequest {\n");
    
    sb.append("    save: ").append(toIndentedString(save)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

