package com.heisy.kotlildelegates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class TrimDelegate : ReadWriteProperty<Any?, String> {

            private var trimmedValue: String = ""

            override fun getValue(
                thisRef: Any?,
                property: KProperty<*>
            ): String {
                return trimmedValue
            }

            override fun setValue(
                thisRef: Any?,
                property: KProperty<*>, value: String
            ) {
                trimmedValue = value.trim()
            }
        }
    }
}