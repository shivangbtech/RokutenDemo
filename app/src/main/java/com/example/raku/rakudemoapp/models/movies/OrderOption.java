
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderOption {

    @SerializedName("external_tiers")
    private List<ExternalTier> mExternalTiers;
    @SerializedName("id")
    private String mId;
    @SerializedName("legacy_instance_id")
    private Object mLegacyInstanceId;
    @SerializedName("legacy_instance_type")
    private Object mLegacyInstanceType;
    @SerializedName("numerical_id")
    private Long mNumericalId;
    @SerializedName("order_option_display_info")
    private OrderOptionDisplayInfo mOrderOptionDisplayInfo;
    @SerializedName("periodic_points_reward_amount")
    private Long mPeriodicPointsRewardAmount;
    @SerializedName("points")
    private Points mPoints;
    @SerializedName("price")
    private String mPrice;
    @SerializedName("purchase_type")
    private PurchaseType mPurchaseType;
    @SerializedName("type")
    private String mType;
    @SerializedName("video_quality")
    private VideoQuality mVideoQuality;
    @SerializedName("warnings")
    private List<Object> mWarnings;

    public List<ExternalTier> getExternalTiers() {
        return mExternalTiers;
    }

    public void setExternalTiers(List<ExternalTier> externalTiers) {
        mExternalTiers = externalTiers;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Object getLegacyInstanceId() {
        return mLegacyInstanceId;
    }

    public void setLegacyInstanceId(Object legacyInstanceId) {
        mLegacyInstanceId = legacyInstanceId;
    }

    public Object getLegacyInstanceType() {
        return mLegacyInstanceType;
    }

    public void setLegacyInstanceType(Object legacyInstanceType) {
        mLegacyInstanceType = legacyInstanceType;
    }

    public Long getNumericalId() {
        return mNumericalId;
    }

    public void setNumericalId(Long numericalId) {
        mNumericalId = numericalId;
    }

    public OrderOptionDisplayInfo getOrderOptionDisplayInfo() {
        return mOrderOptionDisplayInfo;
    }

    public void setOrderOptionDisplayInfo(OrderOptionDisplayInfo orderOptionDisplayInfo) {
        mOrderOptionDisplayInfo = orderOptionDisplayInfo;
    }

    public Long getPeriodicPointsRewardAmount() {
        return mPeriodicPointsRewardAmount;
    }

    public void setPeriodicPointsRewardAmount(Long periodicPointsRewardAmount) {
        mPeriodicPointsRewardAmount = periodicPointsRewardAmount;
    }

    public Points getPoints() {
        return mPoints;
    }

    public void setPoints(Points points) {
        mPoints = points;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public PurchaseType getPurchaseType() {
        return mPurchaseType;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        mPurchaseType = purchaseType;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public VideoQuality getVideoQuality() {
        return mVideoQuality;
    }

    public void setVideoQuality(VideoQuality videoQuality) {
        mVideoQuality = videoQuality;
    }

    public List<Object> getWarnings() {
        return mWarnings;
    }

    public void setWarnings(List<Object> warnings) {
        mWarnings = warnings;
    }

}
