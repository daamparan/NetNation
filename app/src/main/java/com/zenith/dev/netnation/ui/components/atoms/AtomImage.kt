package com.zenith.dev.netnation.ui.components.atoms

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import com.zenith.dev.netnation.R

@Composable
fun AtomImage(
    modifier: Modifier = Modifier,
    refImageUrl: String?,
    contentDescription: String?,
    sizeDimenResId: Int,
    background: Color? = null,
    @DrawableRes placeholderResId: Int = 0,
    @DrawableRes errorResId: Int = 0
) {
    AsyncImage(
        model = refImageUrl,
        contentDescription = contentDescription,
//        placeholder = painterResource(placeholderResId),
//        error = painterResource(errorResId),
        modifier = modifier
            .size(dimensionResource(sizeDimenResId))
    )
}

@Preview
@Composable
fun AtomImagePreview() {
    AtomImage(
        refImageUrl = "https://a.espncdn.com/i/teamlogos/nba/500/min.png",
        contentDescription = "Minnesota Timberwolves Logo",
        sizeDimenResId = R.dimen.margin_medium,
    )
}