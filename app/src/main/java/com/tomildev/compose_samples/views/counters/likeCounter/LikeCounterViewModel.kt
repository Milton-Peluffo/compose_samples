package com.tomildev.compose_samples.views.counters.likeCounter

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BasicCounterScreenViewModel : ViewModel() {

    private val _state = MutableStateFlow(LikeData())
    val count: StateFlow<LikeData> = _state.asStateFlow()

    fun increment(){
        _state.update {
            it.copy(count = _state.value.count + 1)
        }
        //countIncrement(_state.value.count)
    }

    //private fun countIncrement(count: Int): Int = count + 1

}

data class LikeData(
    val count: Int = 0,
    val isLiked: Boolean = false
)