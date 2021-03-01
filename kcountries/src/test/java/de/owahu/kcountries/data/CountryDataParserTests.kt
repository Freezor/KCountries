package de.owahu.kcountries.data

import android.content.Context
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations


class CountryDataParserTests
{
    @Mock
    private val contextMock: Context? = null

    @Before fun init()
    {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun ReadJsonFile()
    {
        `when`(contextMock!!.applicationContext).thenReturn()

        CountryDataParser(contextMock.applicationContext).LoadCountries()
    }
}