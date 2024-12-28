package com.example.pinterests.Data

import android.os.Parcel
import android.os.Parcelable

data class DataClass(var dataImage: Int,):Parcelable {

    constructor(parcel: Parcel):this(
        parcel.readInt()
    ){

    }
    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel,flags: Int) {
        parcel.writeInt(dataImage)
    }

    companion object CREATOR : Parcelable.Creator<DataClass> {
        override fun createFromParcel(parcel: Parcel): DataClass {
            return DataClass(parcel)
        }

        override fun newArray(size: Int): Array<DataClass?> {
            return arrayOfNulls(size)
        }
    }
}
