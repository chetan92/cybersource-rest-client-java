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
 * Report Search Result Bean
 */
@ApiModel(description = "Report Search Result Bean")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class ReportingV3ReportsGet200ResponseReports {
  @SerializedName("reportDefinitionId")
  private String reportDefinitionId = null;

  @SerializedName("reportName")
  private String reportName = null;

  /**
   * Format of the report to get generated
   */
  @JsonAdapter(ReportMimeTypeEnum.Adapter.class)
  public enum ReportMimeTypeEnum {
    APPLICATION_XML("application/xml"),
    
    TEXT_CSV("text/csv");

    private String value;

    ReportMimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportMimeTypeEnum fromValue(String text) {
      for (ReportMimeTypeEnum b : ReportMimeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportMimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportMimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportMimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportMimeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reportMimeType")
  private ReportMimeTypeEnum reportMimeType = null;

  /**
   * Frequency of the report to get generated
   */
  @JsonAdapter(ReportFrequencyEnum.Adapter.class)
  public enum ReportFrequencyEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    ADHOC("ADHOC");

    private String value;

    ReportFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportFrequencyEnum fromValue(String text) {
      for (ReportFrequencyEnum b : ReportFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reportFrequency")
  private ReportFrequencyEnum reportFrequency = null;

  /**
   * Status of the report
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    PENDING("PENDING"),
    
    QUEUED("QUEUED"),
    
    RUNNING("RUNNING"),
    
    ERROR("ERROR"),
    
    NO_DATA("NO_DATA");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("reportStartTime")
  private DateTime reportStartTime = null;

  @SerializedName("reportEndTime")
  private DateTime reportEndTime = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("reportId")
  private String reportId = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("queuedTime")
  private DateTime queuedTime = null;

  @SerializedName("reportGeneratingTime")
  private DateTime reportGeneratingTime = null;

  @SerializedName("reportCompletedTime")
  private DateTime reportCompletedTime = null;

  @SerializedName("selectedMerchantGroupName")
  private String selectedMerchantGroupName = null;

  public ReportingV3ReportsGet200ResponseReports reportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * Unique Report Identifier of each report type
   * @return reportDefinitionId
  **/
  @ApiModelProperty(example = "210", value = "Unique Report Identifier of each report type")
  public String getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public ReportingV3ReportsGet200ResponseReports reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Name of the report specified by merchant while creating the report
   * @return reportName
  **/
  @ApiModelProperty(example = "My Transaction Request Detail Report", value = "Name of the report specified by merchant while creating the report")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ReportingV3ReportsGet200ResponseReports reportMimeType(ReportMimeTypeEnum reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Format of the report to get generated
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "Format of the report to get generated")
  public ReportMimeTypeEnum getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(ReportMimeTypeEnum reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public ReportingV3ReportsGet200ResponseReports reportFrequency(ReportFrequencyEnum reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * Frequency of the report to get generated
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", value = "Frequency of the report to get generated")
  public ReportFrequencyEnum getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(ReportFrequencyEnum reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public ReportingV3ReportsGet200ResponseReports status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the report
   * @return status
  **/
  @ApiModelProperty(value = "Status of the report")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ReportingV3ReportsGet200ResponseReports reportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
    return this;
  }

   /**
   * Specifies the report start time in ISO 8601 format
   * @return reportStartTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Specifies the report start time in ISO 8601 format")
  public DateTime getReportStartTime() {
    return reportStartTime;
  }

  public void setReportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
  }

  public ReportingV3ReportsGet200ResponseReports reportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
    return this;
  }

   /**
   * Specifies the report end time in ISO 8601 format
   * @return reportEndTime
  **/
  @ApiModelProperty(example = "2017-10-02T10:10:10+05:00", value = "Specifies the report end time in ISO 8601 format")
  public DateTime getReportEndTime() {
    return reportEndTime;
  }

  public void setReportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
  }

  public ReportingV3ReportsGet200ResponseReports timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Time Zone
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", value = "Time Zone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ReportingV3ReportsGet200ResponseReports reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Unique identifier generated for every reports
   * @return reportId
  **/
  @ApiModelProperty(example = "6d9cb5b6-0e97-2d03-e053-7cb8d30af52e", value = "Unique identifier generated for every reports")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public ReportingV3ReportsGet200ResponseReports organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * CyberSource Merchant Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "Test_MerchantId", value = "CyberSource Merchant Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ReportingV3ReportsGet200ResponseReports queuedTime(DateTime queuedTime) {
    this.queuedTime = queuedTime;
    return this;
  }

   /**
   * Specifies the time of the report in queued  in ISO 8601 format
   * @return queuedTime
  **/
  @ApiModelProperty(example = "2017-10-03T10:10:10+05:00", value = "Specifies the time of the report in queued  in ISO 8601 format")
  public DateTime getQueuedTime() {
    return queuedTime;
  }

  public void setQueuedTime(DateTime queuedTime) {
    this.queuedTime = queuedTime;
  }

  public ReportingV3ReportsGet200ResponseReports reportGeneratingTime(DateTime reportGeneratingTime) {
    this.reportGeneratingTime = reportGeneratingTime;
    return this;
  }

   /**
   * Specifies the time of the report started to generate  in ISO 8601 format
   * @return reportGeneratingTime
  **/
  @ApiModelProperty(example = "2017-10-03T10:10:10+05:00", value = "Specifies the time of the report started to generate  in ISO 8601 format")
  public DateTime getReportGeneratingTime() {
    return reportGeneratingTime;
  }

  public void setReportGeneratingTime(DateTime reportGeneratingTime) {
    this.reportGeneratingTime = reportGeneratingTime;
  }

  public ReportingV3ReportsGet200ResponseReports reportCompletedTime(DateTime reportCompletedTime) {
    this.reportCompletedTime = reportCompletedTime;
    return this;
  }

   /**
   * Specifies the time of the report completed the generation  in ISO 8601 format
   * @return reportCompletedTime
  **/
  @ApiModelProperty(example = "2017-10-03T10:10:10+05:00", value = "Specifies the time of the report completed the generation  in ISO 8601 format")
  public DateTime getReportCompletedTime() {
    return reportCompletedTime;
  }

  public void setReportCompletedTime(DateTime reportCompletedTime) {
    this.reportCompletedTime = reportCompletedTime;
  }

  public ReportingV3ReportsGet200ResponseReports selectedMerchantGroupName(String selectedMerchantGroupName) {
    this.selectedMerchantGroupName = selectedMerchantGroupName;
    return this;
  }

   /**
   * Selected name of the group
   * @return selectedMerchantGroupName
  **/
  @ApiModelProperty(example = "myGroup", value = "Selected name of the group")
  public String getSelectedMerchantGroupName() {
    return selectedMerchantGroupName;
  }

  public void setSelectedMerchantGroupName(String selectedMerchantGroupName) {
    this.selectedMerchantGroupName = selectedMerchantGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportsGet200ResponseReports reportingV3ReportsGet200ResponseReports = (ReportingV3ReportsGet200ResponseReports) o;
    return Objects.equals(this.reportDefinitionId, reportingV3ReportsGet200ResponseReports.reportDefinitionId) &&
        Objects.equals(this.reportName, reportingV3ReportsGet200ResponseReports.reportName) &&
        Objects.equals(this.reportMimeType, reportingV3ReportsGet200ResponseReports.reportMimeType) &&
        Objects.equals(this.reportFrequency, reportingV3ReportsGet200ResponseReports.reportFrequency) &&
        Objects.equals(this.status, reportingV3ReportsGet200ResponseReports.status) &&
        Objects.equals(this.reportStartTime, reportingV3ReportsGet200ResponseReports.reportStartTime) &&
        Objects.equals(this.reportEndTime, reportingV3ReportsGet200ResponseReports.reportEndTime) &&
        Objects.equals(this.timezone, reportingV3ReportsGet200ResponseReports.timezone) &&
        Objects.equals(this.reportId, reportingV3ReportsGet200ResponseReports.reportId) &&
        Objects.equals(this.organizationId, reportingV3ReportsGet200ResponseReports.organizationId) &&
        Objects.equals(this.queuedTime, reportingV3ReportsGet200ResponseReports.queuedTime) &&
        Objects.equals(this.reportGeneratingTime, reportingV3ReportsGet200ResponseReports.reportGeneratingTime) &&
        Objects.equals(this.reportCompletedTime, reportingV3ReportsGet200ResponseReports.reportCompletedTime) &&
        Objects.equals(this.selectedMerchantGroupName, reportingV3ReportsGet200ResponseReports.selectedMerchantGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDefinitionId, reportName, reportMimeType, reportFrequency, status, reportStartTime, reportEndTime, timezone, reportId, organizationId, queuedTime, reportGeneratingTime, reportCompletedTime, selectedMerchantGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportsGet200ResponseReports {\n");
    
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reportStartTime: ").append(toIndentedString(reportStartTime)).append("\n");
    sb.append("    reportEndTime: ").append(toIndentedString(reportEndTime)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    queuedTime: ").append(toIndentedString(queuedTime)).append("\n");
    sb.append("    reportGeneratingTime: ").append(toIndentedString(reportGeneratingTime)).append("\n");
    sb.append("    reportCompletedTime: ").append(toIndentedString(reportCompletedTime)).append("\n");
    sb.append("    selectedMerchantGroupName: ").append(toIndentedString(selectedMerchantGroupName)).append("\n");
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
