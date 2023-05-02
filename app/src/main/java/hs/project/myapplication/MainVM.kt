package hs.project.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainVM : ViewModel() {

    private val _input = MutableStateFlow("")
    val input = _input.asStateFlow()

    fun updateInput(s: String) {
        Log.e("tag", s)
        _input.value = s
    }

}