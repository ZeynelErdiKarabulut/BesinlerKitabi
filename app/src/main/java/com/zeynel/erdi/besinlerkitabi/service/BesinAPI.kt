package com.zeynel.erdi.besinlerkitabi.servis


import com.zeynel.erdi.besinlerkitabi.model.Besin
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface BesinAPI {

    //GET, POST

    //https://raw.githubusercontent.com/ZeynelErdiKarabulut/BesinlerKitabiJsonSet/main/besinler.json
    // BASE_URL -> https://raw.githubusercontent.com/
    // ZeynelErdiKarabulut/BesinlerKitabiJsonSet/main/besinler.json


    @GET("ZeynelErdiKarabulut/BesinlerKitabiJsonSet/main/besinler.json")
    fun getBesin() : Single<List<Besin>>



}