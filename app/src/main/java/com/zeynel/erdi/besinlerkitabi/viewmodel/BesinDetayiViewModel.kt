package com.zeynel.erdi.besinlerkitabi.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zeynel.erdi.besinlerkitabi.model.Besin
import com.zeynel.erdi.besinlerkitabi.servis.BesinDatabase

import kotlinx.coroutines.launch

class BesinDetayiViewModel(application: Application) : BaseViewModel(application) {

    val besinLiveData = MutableLiveData<Besin>()

    fun roomVerisiniAl(uuid : Int){
        launch {

            val dao = BesinDatabase(getApplication()).besinDao()
            val besin = dao.getBesin(uuid)
            besinLiveData.value = besin
        }
    }
}