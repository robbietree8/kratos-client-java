/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

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

/**
 * Identity identity
 */
@ApiModel(description = "Identity identity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-29T15:58:23.261955Z[GMT]")
public class Identity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_TRAITS_SCHEMA_ID = "traits_schema_id";
  @SerializedName(SERIALIZED_NAME_TRAITS_SCHEMA_ID)
  private String traitsSchemaId;

  public static final String SERIALIZED_NAME_TRAITS_SCHEMA_URL = "traits_schema_url";
  @SerializedName(SERIALIZED_NAME_TRAITS_SCHEMA_URL)
  private String traitsSchemaUrl;


  public Identity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Identity traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * Traits traits
   * @return traits
  **/
  @ApiModelProperty(required = true, value = "Traits traits")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public Identity traitsSchemaId(String traitsSchemaId) {
    
    this.traitsSchemaId = traitsSchemaId;
    return this;
  }

   /**
   * TraitsSchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits.
   * @return traitsSchemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TraitsSchemaID is the ID of the JSON Schema to be used for validating the identity's traits.")

  public String getTraitsSchemaId() {
    return traitsSchemaId;
  }


  public void setTraitsSchemaId(String traitsSchemaId) {
    this.traitsSchemaId = traitsSchemaId;
  }


  public Identity traitsSchemaUrl(String traitsSchemaUrl) {
    
    this.traitsSchemaUrl = traitsSchemaUrl;
    return this;
  }

   /**
   * TraitsSchemaURL is the URL of the endpoint where the identity&#39;s traits schema can be fetched from.  format: url
   * @return traitsSchemaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TraitsSchemaURL is the URL of the endpoint where the identity's traits schema can be fetched from.  format: url")

  public String getTraitsSchemaUrl() {
    return traitsSchemaUrl;
  }


  public void setTraitsSchemaUrl(String traitsSchemaUrl) {
    this.traitsSchemaUrl = traitsSchemaUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.id, identity.id) &&
        Objects.equals(this.traits, identity.traits) &&
        Objects.equals(this.traitsSchemaId, identity.traitsSchemaId) &&
        Objects.equals(this.traitsSchemaUrl, identity.traitsSchemaUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, traits, traitsSchemaId, traitsSchemaUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    traitsSchemaId: ").append(toIndentedString(traitsSchemaId)).append("\n");
    sb.append("    traitsSchemaUrl: ").append(toIndentedString(traitsSchemaUrl)).append("\n");
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

