package com.lugares_v.utiles

import java.text.SimpleDateFormat
import java.util.*

class OtrosUtiles {
    companion object {
        fun getTempFile(prefijo:String) : String {
            val nombre=SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
            return prefijo+nombre
        }
    }
}


