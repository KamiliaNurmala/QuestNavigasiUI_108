package com.example.praktikum6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.graphics.Color

@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold(modifier=Modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.home),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700))
            )
    }
    ){IsiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArragement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField()
        }
    }
}