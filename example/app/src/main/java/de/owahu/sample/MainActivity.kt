package de.owahu.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import de.owahu.kcountries.ExampleClass
import de.owahu.kcountries.data.CountryDataParser

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloText.text = ExampleClass.hello
        var countries = CountryDataParser(applicationContext).LoadCountries()
    }
}
