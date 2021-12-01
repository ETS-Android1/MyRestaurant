
package com.moringaschool.myrestaurants;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Region implements Parcelable
{

    @SerializedName("center")
    @Expose
    private Center center;
    public final static Creator<Region> CREATOR = new Creator<Region>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Region createFromParcel(android.os.Parcel in) {
            return new Region(in);
        }

        public Region[] newArray(int size) {
            return (new Region[size]);
        }

    }
    ;

    protected Region(android.os.Parcel in) {
        this.center = ((Center) in.readValue((Center.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Region() {
    }

    /**
     * 
     * @param center
     */
    public Region(Center center) {
        super();
        this.center = center;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(center);
    }

    public int describeContents() {
        return  0;
    }

}
