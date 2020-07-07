package com.turquoisesilver.sampleapplication.model

import java.io.Serializable

class Product : Serializable{
    var id: Long? = 0
    var catId: Int? = 0
    var name: String? = ""
    var imageUrl: String? = ""
}