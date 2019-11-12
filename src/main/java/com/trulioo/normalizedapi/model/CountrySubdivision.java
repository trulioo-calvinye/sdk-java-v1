/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

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
 * ISO 3166-2 break down of the country
 */
@ApiModel(description = "ISO 3166-2 break down of the country")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-28T15:09:55.671-07:00")
public class CountrySubdivision {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("ParentCode")
  private String parentCode = null;

  public CountrySubdivision name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the area, in english or one of the languages of the country
   * @return name
  **/
  @ApiModelProperty(value = "Name of the area, in english or one of the languages of the country")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CountrySubdivision code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code for the area
   * @return code
  **/
  @ApiModelProperty(value = "Code for the area")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CountrySubdivision parentCode(String parentCode) {
    this.parentCode = parentCode;
    return this;
  }

   /**
   * Code of the parent entity
   * @return parentCode
  **/
  @ApiModelProperty(value = "Code of the parent entity")
  public String getParentCode() {
    return parentCode;
  }

  public void setParentCode(String parentCode) {
    this.parentCode = parentCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountrySubdivision countrySubdivision = (CountrySubdivision) o;
    return Objects.equals(this.name, countrySubdivision.name) &&
        Objects.equals(this.code, countrySubdivision.code) &&
        Objects.equals(this.parentCode, countrySubdivision.parentCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, parentCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountrySubdivision {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    parentCode: ").append(toIndentedString(parentCode)).append("\n");
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

