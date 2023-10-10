package com.example.tugaskotlin1tiya

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

@VersionedParcelize
abstract class User (
    val username:String,
    val password:String
):Parcelable

