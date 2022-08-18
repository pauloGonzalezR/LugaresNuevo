package com.lugares_v.repository

import androidx.lifecycle.MutableLiveData
import com.lugares_v.data.LugarDao
import com.lugares_v.model.Lugar

class LugarRepository(private val lugarDao: LugarDao) {

    fun saveLugar(lugar: Lugar) {
        lugarDao.saveLugar(lugar)
    }

    fun deleteLugar(lugar: Lugar) {
        lugarDao.deleteLugar(lugar)
    }

    val getAllData : MutableLiveData<List<Lugar>> = lugarDao.getAllData()
}