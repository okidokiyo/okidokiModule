package com.okidokiyo.okidokimodule

import android.content.Context
import android.widget.Toast

/**
 *
 * @author Ethan on 2020-11-10
 */
class okidokiTest() {
    fun showOkidokiToast(context: Context) {
        Toast.makeText(context, "Test Okidoki", Toast.LENGTH_SHORT).show()
    }
}