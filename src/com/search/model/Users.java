package com.search.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Users {
  
  @JsonProperty("_id")
  private String id;
  
  @JsonProperty("url")
  private String url;
  
  @JsonProperty("external_id")
  private String externalId;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("alias")
  private String alias;
  
  @JsonProperty("created_at")
  private String createdAt;
  
  @JsonProperty("active")
  private boolean active;
  
  @JsonProperty("verified")
  private boolean verified;
  
  @JsonProperty("shared")
  private boolean shared;
  
  @JsonProperty("locale")
  private String locale;
  
  @JsonProperty("timezone")
  private String timezone;
  
  @JsonProperty("last_login_at")
  private String lastLoginAt;
  
  @JsonProperty("email")
  private String email;
  
  @JsonProperty("phone")
  private String phone;
  
  @JsonProperty("signature")
  private String signature;
  
  @JsonProperty("organization_id")
  private Integer organization_id;
  
  @JsonProperty("tags")
  private List<String> tags;
  
  @JsonProperty("suspended")
  private boolean suspended;
  
  @JsonProperty("role")
  private String role;
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public String getExternalId() {
    return externalId;
  }
  
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAlias() {
    return alias;
  }
  
  public void setAlias(String alias) {
    this.alias = alias;
  }
  
  public String getCreatedAt() {
    return createdAt;
  }
  
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  
  public boolean isActive() {
    return active;
  }
  
  public void setActive(boolean active) {
    this.active = active;
  }
  
  public boolean isVerified() {
    return verified;
  }
  
  public void setVerified(boolean verified) {
    this.verified = verified;
  }
  
  public boolean isShared() {
    return shared;
  }
  
  public void setShared(boolean shared) {
    this.shared = shared;
  }
  
  public String isLocale() {
    return locale;
  }
  
  public void setLocale(String locale) {
    this.locale = locale;
  }
  
  public String isTimezone() {
    return timezone;
  }
  
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }
  
  public String isLastLoginAt() {
    return lastLoginAt;
  }
  
  public void setLastLoginAt(String lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }
  
  public String isEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String isPhone() {
    return phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  public String isSignature() {
    return signature;
  }
  
  public void setSignature(String signature) {
    this.signature = signature;
  }
  
  public Integer getOrganization_id() {
    return organization_id;
  }
  
  public void setOrganization_id(Integer organization_id) {
    this.organization_id = organization_id;
  }
  
  public List<String> getTags() {
    return tags;
  }
  
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  
  public boolean isSuspended() {
    return suspended;
  }
  
  public void setSuspended(boolean suspended) {
    this.suspended = suspended;
  }
  
  public String getRole() {
    return role;
  }
  
  public void setRole(String role) {
    this.role = role;
  }
}
