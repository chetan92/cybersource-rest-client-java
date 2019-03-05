
# TssV2TransactionsGet200Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | An unique identification number assigned by CyberSource to identify the submitted request. |  [optional]
**rootId** | **String** | Payment Request Id |  [optional]
**reconciliationId** | **String** | The reconciliation id for the submitted transaction. This value is not returned for all processors.  |  [optional]
**merchantId** | **String** | The description for this field is not available. |  [optional]
**status** | **String** | The status of the submitted transaction. |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**applicationInformation** | [**TssV2TransactionsGet200ResponseApplicationInformation**](TssV2TransactionsGet200ResponseApplicationInformation.md) |  |  [optional]
**buyerInformation** | [**TssV2TransactionsGet200ResponseBuyerInformation**](TssV2TransactionsGet200ResponseBuyerInformation.md) |  |  [optional]
**clientReferenceInformation** | [**TssV2TransactionsGet200ResponseClientReferenceInformation**](TssV2TransactionsGet200ResponseClientReferenceInformation.md) |  |  [optional]
**consumerAuthenticationInformation** | [**TssV2TransactionsGet200ResponseConsumerAuthenticationInformation**](TssV2TransactionsGet200ResponseConsumerAuthenticationInformation.md) |  |  [optional]
**deviceInformation** | [**TssV2TransactionsGet200ResponseDeviceInformation**](TssV2TransactionsGet200ResponseDeviceInformation.md) |  |  [optional]
**errorInformation** | [**TssV2TransactionsGet200ResponseErrorInformation**](TssV2TransactionsGet200ResponseErrorInformation.md) |  |  [optional]
**installmentInformation** | [**TssV2TransactionsGet200ResponseInstallmentInformation**](TssV2TransactionsGet200ResponseInstallmentInformation.md) |  |  [optional]
**fraudMarkingInformation** | [**TssV2TransactionsGet200ResponseFraudMarkingInformation**](TssV2TransactionsGet200ResponseFraudMarkingInformation.md) |  |  [optional]
**merchantDefinedInformation** | [**List&lt;TssV2TransactionsGet200ResponseMerchantDefinedInformation&gt;**](TssV2TransactionsGet200ResponseMerchantDefinedInformation.md) | The description for this field is not available. |  [optional]
**merchantInformation** | [**TssV2TransactionsGet200ResponseMerchantInformation**](TssV2TransactionsGet200ResponseMerchantInformation.md) |  |  [optional]
**orderInformation** | [**TssV2TransactionsGet200ResponseOrderInformation**](TssV2TransactionsGet200ResponseOrderInformation.md) |  |  [optional]
**paymentInformation** | [**TssV2TransactionsGet200ResponsePaymentInformation**](TssV2TransactionsGet200ResponsePaymentInformation.md) |  |  [optional]
**processingInformation** | [**TssV2TransactionsGet200ResponseProcessingInformation**](TssV2TransactionsGet200ResponseProcessingInformation.md) |  |  [optional]
**processorInformation** | [**TssV2TransactionsGet200ResponseProcessorInformation**](TssV2TransactionsGet200ResponseProcessorInformation.md) |  |  [optional]
**pointOfSaleInformation** | [**TssV2TransactionsGet200ResponsePointOfSaleInformation**](TssV2TransactionsGet200ResponsePointOfSaleInformation.md) |  |  [optional]
**riskInformation** | [**TssV2TransactionsGet200ResponseRiskInformation**](TssV2TransactionsGet200ResponseRiskInformation.md) |  |  [optional]
**senderInformation** | [**TssV2TransactionsGet200ResponseSenderInformation**](TssV2TransactionsGet200ResponseSenderInformation.md) |  |  [optional]
**links** | [**PtsV2PaymentsReversalsPost201ResponseLinks**](PtsV2PaymentsReversalsPost201ResponseLinks.md) |  |  [optional]


