package com.example.praktikum6.view

import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold(modifier=Modifier,
        topBar = {
            TopAppBar(
            )
    })
}