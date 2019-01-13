package com.example.raku.rakudemoapp.models.home;

import com.google.gson.annotations.SerializedName;

public class ListRowData{

    @SerializedName("type")
    private String type;

    @SerializedName("id")
    private String id;

    @SerializedName("numerical_id")
    private Integer numericalId;

    @SerializedName("category")
    private Object category;

    @SerializedName("short_name")
    private String shortName;

    @SerializedName("content_type")
    private String contentType;

    @SerializedName("is_b2b")
    private Boolean isB2b;

    @SerializedName("wktv_code")
    private Object wktvCode;

    @SerializedName("only_coupon")
    private Boolean onlyCoupon;

    @SerializedName("is_recommendation")
    private Boolean isRecommendation;

    @SerializedName("name")
    private String name;

//        @SerializedName("additional_images")
//        private AdditionalImages additionalImages;

    @SerializedName("contents")
    private Contents contents;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNumericalId() {
        return numericalId;
    }

    public void setNumericalId(Integer numericalId) {
        this.numericalId = numericalId;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Boolean getB2b() {
        return isB2b;
    }

    public void setB2b(Boolean b2b) {
        isB2b = b2b;
    }

    public Object getWktvCode() {
        return wktvCode;
    }

    public void setWktvCode(Object wktvCode) {
        this.wktvCode = wktvCode;
    }

    public Boolean getOnlyCoupon() {
        return onlyCoupon;
    }

    public void setOnlyCoupon(Boolean onlyCoupon) {
        this.onlyCoupon = onlyCoupon;
    }

    public Boolean getRecommendation() {
        return isRecommendation;
    }

    public void setRecommendation(Boolean recommendation) {
        isRecommendation = recommendation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contents getContents() {
        return contents;
    }

    public void setContents(Contents contents) {
        this.contents = contents;
    }
}
