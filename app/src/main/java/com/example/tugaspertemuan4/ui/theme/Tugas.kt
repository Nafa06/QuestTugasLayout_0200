package com.example.tugaspertemuan4.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
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

@Composable
fun MahasiswaCard(
    namaResource: Int,
    alamatResource: Int,
    nimResource: Int?,
    bgColorResource: Int,
    alamatColorResource: Int,
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Bold
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp)
            ) {
                Text(
                    text = stringResource(id = namaResource),
                    fontSize = 20.sp,
                    fontFamily = fontFamily,
                    fontWeight = fontWeight,
                    color = colorResource(id = R.color.white)
                )
                Text(
                    text = stringResource(id = alamatResource),
                    fontSize = 13.sp,
                    color = colorResource(id = alamatColorResource)
                )
                Image(
                    painter = painterResource(id = R.drawable.logo_umy),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp)
                )
            }
        }
    }
}