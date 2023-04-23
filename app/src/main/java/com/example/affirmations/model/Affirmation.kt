package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.affirmations.R

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)