package com.zeynel.erdi.besinlerkitabi.servis

import com.zeynel.erdi.besinlerkitabi.servis.BesinAPI
import com.zeynel.erdi.besinlerkitabi.model.Besin
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class BesinAPIServis {

       //https://raw.githubusercontent.com/ZeynelErdiKarabulut/BesinlerKitabiJsonSet/main/besinler.json
    // BASE_URL -> https://raw.githubusercontent.com/
    // ZeynelErdiKarabulut/BesinlerKitabiJsonSet/main/besinler.json


    private val BASE_URL = "https://raw.githubusercontent.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(BesinAPI::class.java)

    fun getData() : Single<List<Besin>> {
        return api.getBesin()
    }

}