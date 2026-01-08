package com.tomildev.compose_samples.views.counters.likeCounter

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tomildev.compose_samples.R

@Composable
fun BasicCounterScreen(basicCounterScreenViewModel: BasicCounterScreenViewModel = viewModel()) {

    val count by basicCounterScreenViewModel.count.collectAsStateWithLifecycle()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                modifier = Modifier
                    .size(100.dp)
                    .clickable(onClick = { basicCounterScreenViewModel.increment() }),
                painter = painterResource(R.drawable.ic_heart_filled),
                contentDescription = "",
                tint = Color.Red
            )
            Spacer(Modifier.padding(horizontal = 5.dp))
            Text(count.count.toString(), fontSize = 80.sp)
        }
    }
}