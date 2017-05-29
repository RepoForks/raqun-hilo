package com.raqun.hilo.util

import com.raqun.hilo.data.Color
import java.util.*

/**
 * Created by tyln on 29/05/2017.
 */
class CardUtil private constructor() {

    companion object {
        private fun generateRandomNumber(min: Int, max: Int): Int = Random().nextInt(max - min) + min

        fun generateRandomCardNumber(): Int = generateRandomNumber(13, 1)

        fun generateRandomCardColor(): Color = Color.values()[generateRandomNumber(0, 3)]
    }
}