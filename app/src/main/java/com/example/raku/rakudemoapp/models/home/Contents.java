package com.example.raku.rakudemoapp.models.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Contents {

    @SerializedName("data")
    private List<Data> data = null;
    @SerializedName("meta")
    private Meta meta;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public class Data {

        @SerializedName("type")
        private String type;

        @SerializedName("id")
        private String id;

        @SerializedName("numerical_id")
        private Integer numericalId;

        @SerializedName("title")
        private String title;

        @SerializedName("label")
        private String label;

        @SerializedName("rating")
        private Rating rating;

        @SerializedName("highlighted_score")
        private HighlightedScore highlightedScore;

        @SerializedName("images")
        private Images images;

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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Rating getRating() {
            return rating;
        }

        public void setRating(Rating rating) {
            this.rating = rating;
        }

        public HighlightedScore getHighlightedScore() {
            return highlightedScore;
        }

        public void setHighlightedScore(HighlightedScore highlightedScore) {
            this.highlightedScore = highlightedScore;
        }

        public Images getImages() {
            return images;
        }

        public void setImages(Images images) {
            this.images = images;
        }
    }

    public class HighlightedScore{

        @SerializedName("score")
        private Double score;

        @SerializedName("amount_of_votes")
        private Integer amountOfVotes;

        @SerializedName("formatted_amount_of_votes")
        private String formattedAmountOfVotes;

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }

        public Integer getAmountOfVotes() {
            return amountOfVotes;
        }

        public void setAmountOfVotes(Integer amountOfVotes) {
            this.amountOfVotes = amountOfVotes;
        }

        public String getFormattedAmountOfVotes() {
            return formattedAmountOfVotes;
        }

        public void setFormattedAmountOfVotes(String formattedAmountOfVotes) {
            this.formattedAmountOfVotes = formattedAmountOfVotes;
        }
    }

    public class Images{

        @SerializedName("artwork")
        private String artwork;

        @SerializedName("snapshot")
        private String snapshot;

        @SerializedName("ribbons")
        private List<Ribbon> ribbons = null;

        public String getArtwork() {
            return artwork;
        }

        public void setArtwork(String artwork) {
            this.artwork = artwork;
        }

        public String getSnapshot() {
            return snapshot;
        }

        public void setSnapshot(String snapshot) {
            this.snapshot = snapshot;
        }

        public List<Ribbon> getRibbons() {
            return ribbons;
        }

        public void setRibbons(List<Ribbon> ribbons) {
            this.ribbons = ribbons;
        }
    }


    public class Ribbon {

        @SerializedName("type")
        private String type;

        @SerializedName("id")
        private String id;

        @SerializedName("numerical_id")
        private Integer numericalId;

        @SerializedName("name")
        private String name;

        @SerializedName("color")
        private String color;

        @SerializedName("text_color")
        private String textColor;

        @SerializedName("position")
        private String position;

        @SerializedName("localized_name")
        private String localizedName;

        @SerializedName("image")
        private String image;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTextColor() {
            return textColor;
        }

        public void setTextColor(String textColor) {
            this.textColor = textColor;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getLocalizedName() {
            return localizedName;
        }

        public void setLocalizedName(String localizedName) {
            this.localizedName = localizedName;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
    
    public class Rating {

        @SerializedName("average")
        private Double average;

        @SerializedName("scale")
        private Integer scale;

        public Double getAverage() {
            return average;
        }

        public void setAverage(Double average) {
            this.average = average;
        }

        public Integer getScale() {
            return scale;
        }

        public void setScale(Integer scale) {
            this.scale = scale;
        }

    }
    public class Meta {

        @SerializedName("pagination")
        private Pagination pagination;

        public Pagination getPagination() {
            return pagination;
        }

        public void setPagination(Pagination pagination) {
            this.pagination = pagination;
        }

    }

    public class Pagination {

        @SerializedName("page")
        private Integer page;

        @SerializedName("count")
        private Integer count;

        @SerializedName("per_page")
        private Integer perPage;

        @SerializedName("offset")
        private Integer offset;

        @SerializedName("total_pages")
        private Integer totalPages;

        public Integer getPage() {
            return page;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getPerPage() {
            return perPage;
        }

        public void setPerPage(Integer perPage) {
            this.perPage = perPage;
        }

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        public Integer getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
        }
    }
}
