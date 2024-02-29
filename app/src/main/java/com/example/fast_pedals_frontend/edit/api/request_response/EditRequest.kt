package com.example.fast_pedals_frontend.edit.api.request_response

import com.example.fast_pedals_frontend.bike.enums.BikeBrand
import com.example.fast_pedals_frontend.bike.enums.BikeType

data class EditRequest(

    val id: Long,
    val title: String,
    val description: String,
    val price: Double?,
    val location: String,
    val date: String? = null,
    val images: List<String>,
    val type: BikeType,
    val brand: BikeBrand,
    val model: String,
    val size: String,
    val wheelSize: Int?,
    val frameMaterial: String,
    val bikeId: Long

)
