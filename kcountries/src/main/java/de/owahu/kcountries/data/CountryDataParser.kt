package de.owahu.kcountries.data

import android.content.Context
import de.owahu.kcountries.R
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.BufferedReader
import java.io.InputStreamReader

class CountryDataParser(private val context: Context)
{
    fun LoadCountries() : List<Country>
    {
        val countriesString = ReadRawJson()
        val countries = Json.decodeFromString<Countries>(countriesString)
        return countries.countries
    }

    private fun ReadRawJson(): String
    {
        val inputStream = context.resources.openRawResource(R.raw.countries)
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val stringBuilder = StringBuilder()
        var stringLine: String
        try
        {
            while (bufferedReader.readLine().also { stringLine = it } != null)
            {
                stringBuilder.append(stringLine)
                stringBuilder.append("\n")
            }
        } catch (exception: NullPointerException)
        {
            print("END OF FILE.")
        }
        return stringBuilder.toString()
    }
}