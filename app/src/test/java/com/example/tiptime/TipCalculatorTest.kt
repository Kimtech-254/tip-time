
package com.example.tiptime
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}





//import org.junit.Test
//import org.junit.Assert.assertEquals
//import java.text.NumberFormat
//
//class TipCalculatorTest {
//
//    @Test
//    fun calculateTip_withoutRounding_returnsCorrectTip() {
//        val actual = calculateTip(
//            amount = 100.0,
//            tipPercent = 15.0,
//            roundUp = false
//        )
//
//        val expected = NumberFormat
//            .getCurrencyInstance()
//            .format(15.0)
//
//        assertEquals(expected, actual)
//    }
//
//    @Test
//    fun calculateTip_withRounding_roundsUpTip() {
//        val actual = calculateTip(
//            amount = 101.0,
//            tipPercent = 15.0,
//            roundUp = true
//        )
//
//        val expected = NumberFormat
//            .getCurrencyInstance()
//            .format(16.0)
//
//        assertEquals(expected, actual)
//    }
//
//    @Test
//    fun calculateTip_withoutTipPercent_usesDefault15Percent() {
//        val actual = calculateTip(
//            amount = 200.0,
//            roundUp = false
//        )
//
//        val expected = NumberFormat
//            .getCurrencyInstance()
//            .format(30.0)
//
//        assertEquals(expected, actual)
//    }
//}