package com.zenith.dev.netnation.ui.components.atoms

import androidx.compose.foundation.layout.Column
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
    text: String = "Hello Android!",
    style: TextStyle = MaterialTheme.typography.headlineMedium,
    fontWeight: FontWeight = FontWeight.Normal,
    customSizeResId: Int? = null
) {
    val customSize: TextUnit = customSizeResId?.toTextUnit() ?: style.fontSize

    Text(
        text = text,
        color = MaterialTheme.colorScheme.primary,
        style = style,
        fontWeight = fontWeight,
        fontSize = customSize,
        modifier = modifier
    )
}

// extension function to convert a dimension resource to a TextUnit
@Composable
fun Int.toTextUnit(): TextUnit {
    return with(LocalDensity.current) {
        dimensionResource(id = this@toTextUnit).value.sp
    }
}

@Preview(showBackground = true)
@Composable
fun AtomTextPreview() {
    NetNationTheme(
        darkTheme = true
    ) {
        Column {
            AtomText(
                text = "This is a headline",
                style = MaterialTheme.typography.headlineLarge,
            )

            // with a custom size
            AtomText(
                text = "This is regular text",
                customSizeResId = R.dimen.text_size_medium
            )
        }
    }
}