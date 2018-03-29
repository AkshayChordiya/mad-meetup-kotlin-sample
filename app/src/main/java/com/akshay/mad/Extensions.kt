package com.akshay.mad

import android.content.Context

// TODO: 12. Reified type
inline fun <reified T> Context.getSystemService() = getSystemService(T::class.java)

fun sum(a: Int, b: Int) = a + b





























 // TODO: 20. @JvmName