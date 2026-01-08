package com.tomildev.compose_samples.views.counters.likeCounter

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class BasicCounterScreenViewModel : ViewModel() {

    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count.asStateFlow()

    fun increment(){
        _count.value++
    }
}