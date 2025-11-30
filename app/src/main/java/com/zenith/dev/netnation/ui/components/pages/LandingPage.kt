package com.zenith.dev.netnation.ui.components.pages

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zenith.dev.netnation.ui.components.atoms.AtomText
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun LandingPage(
    @StringRes titleResource: Int,
    @StringRes subtitleResource: Int,
    @DrawableRes image: Int,
    @StringRes imageDescriptionResource: Int,
    modifier: Modifier = Modifier
) {
    Box {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = stringResource(imageDescriptionResource),
                modifier = Modifier
                    .weight(2f)
            )

            AtomText(
                text = stringResource(id = subtitleResource),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .weight(1f)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LandingPagePreview() {
    NetNationTheme {
        Surface {
            LandingPage(
                titleResource = R.string.landing_page_title,
                subtitleResource = R.string.landing_page_subtitle,
                image = com.zenith.dev.netnation.R.drawable.netnation_icon_darktheme,
                imageDescriptionResource = com.zenith.dev.netnation.R.string.landing_page_icon_desc
            )
        }
    }
}
