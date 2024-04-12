package com.zenith.dev.netnation.ui.components.atoms

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun AtomText(
    modifier: Modifier = Modifier,
    size: Int = R.dimen.text_size_medium,
    text: String = "Hello Android!",
    style: TextStyle = MaterialTheme.typography.headlineMedium,
    fontWeight: FontWeight = FontWeight.Normal
) {
    val fontSize: TextUnit = with(LocalDensity.current) {
        dimensionResource(id = size).value / density
    }.sp

    if(text.isNotEmpty()) {
        Text(
            text = text,
            color = MaterialTheme.colorScheme.primary,
            fontSize = fontSize,
            style = style,
            fontWeight = fontWeight,
            modifier = modifier
        )
    }
}

@Preview
@Composable
fun AtomTextPreview() {
    NetNationTheme(
        darkTheme = true
    ) {
        AtomText()
    }
}