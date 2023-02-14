package com.example.foodrunner

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Menue( @StringRes
                        val stringResourceId1: Int,
                        val stringResourceId2: Int,
                        val stringResourceId3: Int,
                        @DrawableRes
                        val imageResourceId: Int){

}

