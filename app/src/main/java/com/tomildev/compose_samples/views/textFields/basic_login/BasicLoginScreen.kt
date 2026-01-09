package com.tomildev.compose_samples.views.textFields.basic_login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tomildev.compose_samples.views.textFields.basic_login.components.TextFieldPrimary


@Composable
fun BasicLoginScreen(modifier: Modifier = Modifier, basicLoginViewModel: BasicLoginViewModel = viewModel()) {

    val uiState by basicLoginViewModel.uiState.collectAsStateWithLifecycle()

    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "WELCOME BACK!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(50.dp))
        TextFieldPrimary(
            modifier = Modifier,
            value = uiState.email,
            onValueChange = { basicLoginViewModel.onEmailChanged(it) },
            label = "Email"
        )
        Spacer(Modifier.height(10.dp))
        TextFieldPrimary(
            modifier = Modifier,
            value = uiState.password,
            onValueChange = { basicLoginViewModel.onPasswordChanged(it) },
            label = "Password"
        )
        Spacer(Modifier.height(20.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            )
        ) {
            Text("Login", fontSize = 17.sp, fontWeight = FontWeight.Bold)
        }
    }
}