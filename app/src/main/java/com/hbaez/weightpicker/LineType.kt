package com.hbaez.weightpicker

sealed class LineType {
    object Normal : LineType()
    object FiveStep: LineType()
    object TenStep: LineType()
}
