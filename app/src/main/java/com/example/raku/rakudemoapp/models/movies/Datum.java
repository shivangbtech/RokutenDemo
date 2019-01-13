
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("body")
    private String mBody;
    @SerializedName("href")
    private String mHref;
    @SerializedName("id")
    private String mId;
    @SerializedName("numerical_id")
    private Long mNumericalId;
    @SerializedName("person")
    private Person mPerson;
    @SerializedName("score")
    private Double mScore;
    @SerializedName("source")
    private Source mSource;
    @SerializedName("type")
    private String mType;

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Long getNumericalId() {
        return mNumericalId;
    }

    public void setNumericalId(Long numericalId) {
        mNumericalId = numericalId;
    }

    public Person getPerson() {
        return mPerson;
    }

    public void setPerson(Person person) {
        mPerson = person;
    }

    public Double getScore() {
        return mScore;
    }

    public void setScore(Double score) {
        mScore = score;
    }

    public Source getSource() {
        return mSource;
    }

    public void setSource(Source source) {
        mSource = source;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
