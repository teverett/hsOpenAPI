# Documentation for HomeSeer API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://homeseer.khubla.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*HomeseerApi* | [**controlDeviceByLabel**](Apis/HomeseerApi.md#controldevicebylabel) | **POST** /homeseer/controlDeviceByLabel/{ref}/{label} | Control device by label
*HomeseerApi* | [**controlDeviceByValue**](Apis/HomeseerApi.md#controldevicebyvalue) | **POST** /homeseer/controlDeviceByValue/{ref}/{value} | Control device by label
*HomeseerApi* | [**getChangedDevices**](Apis/HomeseerApi.md#getchangeddevices) | **GET** /homeseer/changeddevices | Get id's of all changed devices
*HomeseerApi* | [**getCounter**](Apis/HomeseerApi.md#getcounter) | **GET** /homeseer/counter/{name} | Get counter value
*HomeseerApi* | [**getDevice**](Apis/HomeseerApi.md#getdevice) | **GET** /homeseer/device/{ref} | Get device
*HomeseerApi* | [**getDevices**](Apis/HomeseerApi.md#getdevices) | **GET** /homeseer/devices | Get all devices
*HomeseerApi* | [**getEvents**](Apis/HomeseerApi.md#getevents) | **GET** /homeseer/events | Get all events
*HomeseerApi* | [**getLocations1**](Apis/HomeseerApi.md#getlocations1) | **GET** /homeseer/locations1 | Get all locations 1
*HomeseerApi* | [**getLocations2**](Apis/HomeseerApi.md#getlocations2) | **GET** /homeseer/locations2 | Get all locations 2
*HomeseerApi* | [**getSessionConfig**](Apis/HomeseerApi.md#getsessionconfig) | **GET** /homeseer/sessionconfig | Get HomeSeer Session Config
*HomeseerApi* | [**getSetting**](Apis/HomeseerApi.md#getsetting) | **GET** /homeseer/setting/{name} | Get setting value
*HomeseerApi* | [**getSystems**](Apis/HomeseerApi.md#getsystems) | **GET** /homeseer/systems | Get all systems
*HomeseerApi* | [**getVersion**](Apis/HomeseerApi.md#getversion) | **GET** /homeseer/version | Get HomeSeer API version
*HomeseerApi* | [**runEvent**](Apis/HomeseerApi.md#runevent) | **POST** /homeseer/event/{id} | Run Event


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Counter](.//Models/Counter.md)
 - [Device](.//Models/Device.md)
 - [Event](.//Models/Event.md)
 - [SessionConfig](.//Models/SessionConfig.md)
 - [System](.//Models/System.md)
 - [UserPermissions](.//Models/UserPermissions.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basicAuth"></a>
### basicAuth

- **Type**: HTTP basic authentication

