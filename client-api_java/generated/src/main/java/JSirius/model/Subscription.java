/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * The version of the OpenAPI document: v0.9 on SIRIUS 5.6.4-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import JSirius.JSON;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-14T15:39:20.126029Z[Etc/UTC]")
public class Subscription {
  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_SUBSCRIBER_ID = "subscriberId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_ID)
  private String subscriberId;

  public static final String SERIALIZED_NAME_SUBSCRIBER_NAME = "subscriberName";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_NAME)
  private String subscriberName;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_COUNT_QUERIES = "countQueries";
  @SerializedName(SERIALIZED_NAME_COUNT_QUERIES)
  private Boolean countQueries;

  public static final String SERIALIZED_NAME_COMPOUND_LIMIT = "compoundLimit";
  @SerializedName(SERIALIZED_NAME_COMPOUND_LIMIT)
  private Integer compoundLimit;

  public static final String SERIALIZED_NAME_COMPOUND_HASH_RECORDING_TIME = "compoundHashRecordingTime";
  @SerializedName(SERIALIZED_NAME_COMPOUND_HASH_RECORDING_TIME)
  private Integer compoundHashRecordingTime;

  public static final String SERIALIZED_NAME_MAX_QUERIES_PER_COMPOUND = "maxQueriesPerCompound";
  @SerializedName(SERIALIZED_NAME_MAX_QUERIES_PER_COMPOUND)
  private Integer maxQueriesPerCompound;

  public static final String SERIALIZED_NAME_MAX_USER_ACCOUNTS = "maxUserAccounts";
  @SerializedName(SERIALIZED_NAME_MAX_USER_ACCOUNTS)
  private Integer maxUserAccounts;

  public static final String SERIALIZED_NAME_SERVICE_URL = "serviceUrl";
  @SerializedName(SERIALIZED_NAME_SERVICE_URL)
  private String serviceUrl;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TOS = "tos";
  @SerializedName(SERIALIZED_NAME_TOS)
  private String tos;

  public static final String SERIALIZED_NAME_PP = "pp";
  @SerializedName(SERIALIZED_NAME_PP)
  private String pp;

  public Subscription() {
  }

  public Subscription sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * Get sid
   * @return sid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }


  public Subscription subscriberId(String subscriberId) {
    
    this.subscriberId = subscriberId;
    return this;
  }

   /**
   * Get subscriberId
   * @return subscriberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriberId() {
    return subscriberId;
  }


  public void setSubscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
  }


  public Subscription subscriberName(String subscriberName) {
    
    this.subscriberName = subscriberName;
    return this;
  }

   /**
   * Get subscriberName
   * @return subscriberName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriberName() {
    return subscriberName;
  }


  public void setSubscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
  }


  public Subscription expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public Subscription startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Subscription countQueries(Boolean countQueries) {
    
    this.countQueries = countQueries;
    return this;
  }

   /**
   * Get countQueries
   * @return countQueries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCountQueries() {
    return countQueries;
  }


  public void setCountQueries(Boolean countQueries) {
    this.countQueries = countQueries;
  }


  public Subscription compoundLimit(Integer compoundLimit) {
    
    this.compoundLimit = compoundLimit;
    return this;
  }

   /**
   * Get compoundLimit
   * @return compoundLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompoundLimit() {
    return compoundLimit;
  }


  public void setCompoundLimit(Integer compoundLimit) {
    this.compoundLimit = compoundLimit;
  }


  public Subscription compoundHashRecordingTime(Integer compoundHashRecordingTime) {
    
    this.compoundHashRecordingTime = compoundHashRecordingTime;
    return this;
  }

   /**
   * Get compoundHashRecordingTime
   * @return compoundHashRecordingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompoundHashRecordingTime() {
    return compoundHashRecordingTime;
  }


  public void setCompoundHashRecordingTime(Integer compoundHashRecordingTime) {
    this.compoundHashRecordingTime = compoundHashRecordingTime;
  }


  public Subscription maxQueriesPerCompound(Integer maxQueriesPerCompound) {
    
    this.maxQueriesPerCompound = maxQueriesPerCompound;
    return this;
  }

   /**
   * Get maxQueriesPerCompound
   * @return maxQueriesPerCompound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxQueriesPerCompound() {
    return maxQueriesPerCompound;
  }


  public void setMaxQueriesPerCompound(Integer maxQueriesPerCompound) {
    this.maxQueriesPerCompound = maxQueriesPerCompound;
  }


  public Subscription maxUserAccounts(Integer maxUserAccounts) {
    
    this.maxUserAccounts = maxUserAccounts;
    return this;
  }

   /**
   * Get maxUserAccounts
   * @return maxUserAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxUserAccounts() {
    return maxUserAccounts;
  }


  public void setMaxUserAccounts(Integer maxUserAccounts) {
    this.maxUserAccounts = maxUserAccounts;
  }


  public Subscription serviceUrl(String serviceUrl) {
    
    this.serviceUrl = serviceUrl;
    return this;
  }

   /**
   * Get serviceUrl
   * @return serviceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceUrl() {
    return serviceUrl;
  }


  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }


  public Subscription description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Subscription name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Subscription tos(String tos) {
    
    this.tos = tos;
    return this;
  }

   /**
   * Get tos
   * @return tos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTos() {
    return tos;
  }


  public void setTos(String tos) {
    this.tos = tos;
  }


  public Subscription pp(String pp) {
    
    this.pp = pp;
    return this;
  }

   /**
   * Get pp
   * @return pp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPp() {
    return pp;
  }


  public void setPp(String pp) {
    this.pp = pp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.sid, subscription.sid) &&
        Objects.equals(this.subscriberId, subscription.subscriberId) &&
        Objects.equals(this.subscriberName, subscription.subscriberName) &&
        Objects.equals(this.expirationDate, subscription.expirationDate) &&
        Objects.equals(this.startDate, subscription.startDate) &&
        Objects.equals(this.countQueries, subscription.countQueries) &&
        Objects.equals(this.compoundLimit, subscription.compoundLimit) &&
        Objects.equals(this.compoundHashRecordingTime, subscription.compoundHashRecordingTime) &&
        Objects.equals(this.maxQueriesPerCompound, subscription.maxQueriesPerCompound) &&
        Objects.equals(this.maxUserAccounts, subscription.maxUserAccounts) &&
        Objects.equals(this.serviceUrl, subscription.serviceUrl) &&
        Objects.equals(this.description, subscription.description) &&
        Objects.equals(this.name, subscription.name) &&
        Objects.equals(this.tos, subscription.tos) &&
        Objects.equals(this.pp, subscription.pp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sid, subscriberId, subscriberName, expirationDate, startDate, countQueries, compoundLimit, compoundHashRecordingTime, maxQueriesPerCompound, maxUserAccounts, serviceUrl, description, name, tos, pp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
    sb.append("    subscriberName: ").append(toIndentedString(subscriberName)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    countQueries: ").append(toIndentedString(countQueries)).append("\n");
    sb.append("    compoundLimit: ").append(toIndentedString(compoundLimit)).append("\n");
    sb.append("    compoundHashRecordingTime: ").append(toIndentedString(compoundHashRecordingTime)).append("\n");
    sb.append("    maxQueriesPerCompound: ").append(toIndentedString(maxQueriesPerCompound)).append("\n");
    sb.append("    maxUserAccounts: ").append(toIndentedString(maxUserAccounts)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tos: ").append(toIndentedString(tos)).append("\n");
    sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("sid");
    openapiFields.add("subscriberId");
    openapiFields.add("subscriberName");
    openapiFields.add("expirationDate");
    openapiFields.add("startDate");
    openapiFields.add("countQueries");
    openapiFields.add("compoundLimit");
    openapiFields.add("compoundHashRecordingTime");
    openapiFields.add("maxQueriesPerCompound");
    openapiFields.add("maxUserAccounts");
    openapiFields.add("serviceUrl");
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("tos");
    openapiFields.add("pp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Subscription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Subscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Subscription is not found in the empty JSON string", Subscription.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Subscription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Subscription` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("subscriberId") != null && !jsonObj.get("subscriberId").isJsonNull()) && !jsonObj.get("subscriberId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriberId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriberId").toString()));
      }
      if ((jsonObj.get("subscriberName") != null && !jsonObj.get("subscriberName").isJsonNull()) && !jsonObj.get("subscriberName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriberName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriberName").toString()));
      }
      if ((jsonObj.get("serviceUrl") != null && !jsonObj.get("serviceUrl").isJsonNull()) && !jsonObj.get("serviceUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceUrl").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tos") != null && !jsonObj.get("tos").isJsonNull()) && !jsonObj.get("tos").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tos` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tos").toString()));
      }
      if ((jsonObj.get("pp") != null && !jsonObj.get("pp").isJsonNull()) && !jsonObj.get("pp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Subscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Subscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Subscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Subscription.class));

       return (TypeAdapter<T>) new TypeAdapter<Subscription>() {
           @Override
           public void write(JsonWriter out, Subscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Subscription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Subscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Subscription
  * @throws IOException if the JSON string is invalid with respect to Subscription
  */
  public static Subscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Subscription.class);
  }

 /**
  * Convert an instance of Subscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

