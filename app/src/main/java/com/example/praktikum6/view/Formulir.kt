package com.example.praktikum6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
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
        {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.home),
                        color = Color.White
                    )},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700))
            )
    }
    ){IsiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArragement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(20.dp),
                label = {Text(text = "Nama Lengkap",
                    onValueChange = {},
                )
                    HorizontalDivider(modifier = Modifier
                        .padding(20.dp)
                        .width(250.dp), thickness = Thickness, color = Color.Red)
                    Row{
                        jenisK.forEach {
                                item->
                            Row(verticalAlignment = Alignment.CenterVertically){
                                RadioButton(
                                    selected = false,
                                    onClick = {item}
                                )
                                Text(text = item)
                            }
                        }
                    }
                    HorizontalDivider(modifier = Modifier
                        .padding(20.dp)
                        .width(250.dp),
                        thickness = 1.dp,
                        color = Color.Red
                    )
                    OutlinedTextField(
                        value = "",
                        singleLine = true,
                        modifier = Modifier
                            .width(250.dp),
                        label = {Text(text="Alamat")},
                        onValueChange = {},
                    )
                    
                }
            )
        }
    }
}