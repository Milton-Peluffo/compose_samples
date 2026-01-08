package com.tomildev.compose_samples.views.counters.likeCounter

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BasicCounterScreenViewModel : ViewModel() {

    private val _state = MutableStateFlow(LikeData())
    val state: StateFlow<LikeData> = _state.asStateFlow()

    fun doLike() {

        if (_state.value.count == 0) {
            _state.update {
                it.copy(count = countIncrement(_state.value.count))
            }
        } else {
            _state.update {
                it.copy(count = countDecrement(_state.value.count))
            }
        }
        _state.update {
            it.copy(isLiked = iconChange(_state.value.isLiked))
        }
    }

    private fun countIncrement(count: Int): Int = count + 1
    private fun countDecrement(count: Int): Int = count - 1
    private fun iconChange(isLiked: Boolean): Boolean = !isLiked

}

data class LikeData(
    val count: Int = 0,
    val isLiked: Boolean = false
)