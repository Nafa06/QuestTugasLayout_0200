package com.example.tugaspertemuan4.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugaspertemuan4.R

@Composable
fun TugasPertama() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.black)
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.black)
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
        
    }