
package com.moringaschool.myrestaurants;

import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class YelpBusinessesSearchResponse implements Parcelable
{

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("businesses")
    @Expose
    private List<Business> businesses = null;
    @SerializedName("region")
    @Expose
    private Region region;
    public final static Creator<YelpBusinessesSearchResponse> CREATOR = new Creator<YelpBusinessesSearchResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public YelpBusinessesSearchResponse createFromParcel(android.os.Parcel in) {
            return new YelpBusinessesSearchResponse(in);
        }

        public YelpBusinessesSearchResponse[] newArray(int size) {
            return (new YelpBusinessesSearchResponse[size]);
        }

    }
    ;

    protected YelpBusinessesSearchResponse(android.os.Parcel in) {
        this.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.businesses, ( com.moringaschool.myrestaurants.Business.class.getClassLoader()));
        this.region = ((Region) in.readValue((Region.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public YelpBusinessesSearchResponse() {
    }

    /**
     * 
     * @param total
     * @param region
     * @param businesses
     */
    public YelpBusinessesSearchResponse(Integer total, List<Business> businesses, Region region) {
        super();
        this.total = total;
        this.businesses = businesses;
        this.region = region;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(total);
        dest.writeList(businesses);
        dest.writeValue(region);
    }

    public int describeContents() {
        return  0;
    }

}
