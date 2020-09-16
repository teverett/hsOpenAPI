# HomeseerApi

All URIs are relative to *https://homeseer.khubla.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**controlDeviceByLabel**](HomeseerApi.md#controlDeviceByLabel) | **POST** /homeseer/controlDeviceByLabel/{ref}/{label} | Control device by label
[**controlDeviceByValue**](HomeseerApi.md#controlDeviceByValue) | **POST** /homeseer/controlDeviceByValue/{ref}/{value} | Control device by label
[**getChangedDevices**](HomeseerApi.md#getChangedDevices) | **GET** /homeseer/changeddevices | Get id&#39;s of all changed devices
[**getCounter**](HomeseerApi.md#getCounter) | **GET** /homeseer/counter/{name} | Get counter value
[**getDevice**](HomeseerApi.md#getDevice) | **GET** /homeseer/device/{ref} | Get device
[**getDevices**](HomeseerApi.md#getDevices) | **GET** /homeseer/devices | Get all devices
[**getEvents**](HomeseerApi.md#getEvents) | **GET** /homeseer/events | Get all events
[**getLocations1**](HomeseerApi.md#getLocations1) | **GET** /homeseer/locations1 | Get all locations 1
[**getLocations2**](HomeseerApi.md#getLocations2) | **GET** /homeseer/locations2 | Get all locations 2
[**getSessionConfig**](HomeseerApi.md#getSessionConfig) | **GET** /homeseer/sessionconfig | Get HomeSeer Session Config
[**getSetting**](HomeseerApi.md#getSetting) | **GET** /homeseer/setting/{name} | Get setting value
[**getSystems**](HomeseerApi.md#getSystems) | **GET** /homeseer/systems | Get all systems
[**getVersion**](HomeseerApi.md#getVersion) | **GET** /homeseer/version | Get HomeSeer API version
[**runEvent**](HomeseerApi.md#runEvent) | **POST** /homeseer/event/{id} | Run Event


<a name="controlDeviceByLabel"></a>
# **controlDeviceByLabel**
> controlDeviceByLabel(ref, label)

Control device by label

    This can only be done by the logged in user.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **Integer**| device ref id | [default to null]
 **label** | **String**| value | [default to null]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="controlDeviceByValue"></a>
# **controlDeviceByValue**
> controlDeviceByValue(ref, value)

Control device by label

    This can only be done by the logged in user.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **Integer**| device ref id | [default to null]
 **value** | **Double**| value | [default to null]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="getChangedDevices"></a>
# **getChangedDevices**
> List getChangedDevices()

Get id&#39;s of all changed devices

    This can only be done by the logged in user.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](..//Models/integer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getCounter"></a>
# **getCounter**
> Counter getCounter(name)

Get counter value

    This can only be done by the logged in user.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of counter | [default to null]

### Return type

[**Counter**](..//Models/Counter.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDevice"></a>
# **getDevice**
> Device getDevice(ref)

Get device

    This can only be done by the logged in user.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ref** | **Integer**| Reference ID of device | [default to null]

### Return type

[**Device**](..//Models/Device.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDevices"></a>
# **getDevices**
> List getDevices()

Get all devices

    This can only be done by the logged in user.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](..//Models/Device.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> List getEvents()

Get all events

    This can only be done by the logged in user.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](..//Models/Event.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getLocations1"></a>
# **getLocations1**
> List getLocations1()

Get all locations 1

    This can only be done by the logged in user.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](..//Models/string.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getLocations2"></a>
# **getLocations2**
> List getLocations2()

Get all locations 2

    This can only be done by the logged in user.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](..//Models/string.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSessionConfig"></a>
# **getSessionConfig**
> SessionConfig getSessionConfig()

Get HomeSeer Session Config

    This can only be done by the logged in user.

### Parameters
This endpoint does not need any parameter.

### Return type

[**SessionConfig**](..//Models/SessionConfig.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSetting"></a>
# **getSetting**
> String getSetting(name)

Get setting value

    This can only be done by the logged in user.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of setting | [default to null]

### Return type

[**String**](..//Models/string.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSystems"></a>
# **getSystems**
> List getSystems()

Get all systems

    This can only be done by the logged in user.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](..//Models/System.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getVersion"></a>
# **getVersion**
> String getVersion()

Get HomeSeer API version

    This can only be done by the logged in user.

### Parameters
This endpoint does not need any parameter.

### Return type

[**String**](..//Models/string.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="runEvent"></a>
# **runEvent**
> runEvent(id)

Run Event

    This can only be done by the logged in user.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| event id | [default to null]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

