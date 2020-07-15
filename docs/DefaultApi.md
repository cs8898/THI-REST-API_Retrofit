# DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authClosePost**](DefaultApi.md#authClosePost) | **POST** auth/close | Beendet die Session im Backend
[**authPost**](DefaultApi.md#authPost) | **POST** auth | Starten einer neuen Session
[**authTestGet**](DefaultApi.md#authTestGet) | **GET** auth/test | Testet SessionID am Backend
[**oauthTokenPost**](DefaultApi.md#oauthTokenPost) | **POST** oauth/token | Grant with OAuth
[**pingGet**](DefaultApi.md#pingGet) | **GET** ping | Simple Ping to Application
[**roomsFreeGet**](DefaultApi.md#roomsFreeGet) | **GET** rooms/free | Fetch unocupied Rooms
[**userExamsGet**](DefaultApi.md#userExamsGet) | **GET** user/exams | Fetch Exams
[**userGet**](DefaultApi.md#userGet) | **GET** user | User Information
[**userGradesGet**](DefaultApi.md#userGradesGet) | **GET** user/grades | Fetch Grades
[**userTimetableGet**](DefaultApi.md#userTimetableGet) | **GET** user/timetable | User Timetable

<a name="authClosePost"></a>
# **authClosePost**
> BaseResponse authClosePost()

Beendet die Session im Backend

Beendet die Session im Backend

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiClient;
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.Configuration;
//import ml.raketeufo.thirestbridge.api.auth.*;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    BaseResponse result = apiInstance.authClosePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authClosePost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[JWT AuthToken](../README.md#JWT AuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="authPost"></a>
# **authPost**
> AuthResponse authPost(body)

Starten einer neuen Session

Erstellt eine Neue Session im Backend, und bettet diese in einen JWT Token

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
LoginBody body = new LoginBody(); // LoginBody | 
try {
    AuthResponse result = apiInstance.authPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginBody**](LoginBody.md)|  |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authTestGet"></a>
# **authTestGet**
> BaseResponse authTestGet()

Testet SessionID am Backend

Testet am Backend ob die Session noch Gültig ist

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiClient;
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.Configuration;
//import ml.raketeufo.thirestbridge.api.auth.*;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    BaseResponse result = apiInstance.authTestGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authTestGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[JWT AuthToken](../README.md#JWT AuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauthTokenPost"></a>
# **oauthTokenPost**
> Void oauthTokenPost(clientId, clientSecret, grantType, password, username)

Grant with OAuth

Password Flow im Oauth Stil, äquivalent zu /auth

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
String grantType = "grantType_example"; // String | 
String password = "password_example"; // String | 
String username = "username_example"; // String | 
try {
    Void result = apiInstance.oauthTokenPost(clientId, clientSecret, grantType, password, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#oauthTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**|  |
 **clientSecret** | **String**|  |
 **grantType** | **String**|  |
 **password** | **String**|  |
 **username** | **String**|  |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="pingGet"></a>
# **pingGet**
> BaseResponse pingGet()

Simple Ping to Application

Sends Ping to Application, eg for Monitoring

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    BaseResponse result = apiInstance.pingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="roomsFreeGet"></a>
# **roomsFreeGet**
> RoomsResponse roomsFreeGet()

Fetch unocupied Rooms

Fetches all free rooms grouped by date

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiClient;
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.Configuration;
//import ml.raketeufo.thirestbridge.api.auth.*;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    RoomsResponse result = apiInstance.roomsFreeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#roomsFreeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoomsResponse**](RoomsResponse.md)

### Authorization

[JWT AuthToken](../README.md#JWT AuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userExamsGet"></a>
# **userExamsGet**
> ExamsResponse userExamsGet()

Fetch Exams

Fetches Exam Registration for User

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiClient;
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.Configuration;
//import ml.raketeufo.thirestbridge.api.auth.*;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    ExamsResponse result = apiInstance.userExamsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userExamsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExamsResponse**](ExamsResponse.md)

### Authorization

[JWT AuthToken](../README.md#JWT AuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userGet"></a>
# **userGet**
> PersDataResponse userGet()

User Information

Fetches Informations belonging to User

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiClient;
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.Configuration;
//import ml.raketeufo.thirestbridge.api.auth.*;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    PersDataResponse result = apiInstance.userGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PersDataResponse**](PersDataResponse.md)

### Authorization

[JWT AuthToken](../README.md#JWT AuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userGradesGet"></a>
# **userGradesGet**
> GradesResponse userGradesGet()

Fetch Grades

Fetches Grades for User

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiClient;
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.Configuration;
//import ml.raketeufo.thirestbridge.api.auth.*;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    GradesResponse result = apiInstance.userGradesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userGradesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GradesResponse**](GradesResponse.md)

### Authorization

[JWT AuthToken](../README.md#JWT AuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userTimetableGet"></a>
# **userTimetableGet**
> TimetableResponse userTimetableGet(details)

User Timetable

Fetches the Timetable for the User

### Example
```java
// Import classes:
//import ml.raketeufo.thirestbridge.api.ApiClient;
//import ml.raketeufo.thirestbridge.api.ApiException;
//import ml.raketeufo.thirestbridge.api.Configuration;
//import ml.raketeufo.thirestbridge.api.auth.*;
//import ml.raketeufo.thirestbridge.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String details = "0"; // String | fetch datails for timetable (pruefung, ziel, inhalt, literatur)
try {
    TimetableResponse result = apiInstance.userTimetableGet(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userTimetableGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| fetch datails for timetable (pruefung, ziel, inhalt, literatur) | [optional] [default to 0]

### Return type

[**TimetableResponse**](TimetableResponse.md)

### Authorization

[JWT AuthToken](../README.md#JWT AuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

