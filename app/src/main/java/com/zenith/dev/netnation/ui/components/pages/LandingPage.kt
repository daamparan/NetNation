package com.zenith.dev.netnation.ui.components.pages

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.components.atoms.AtomButton
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun LandingPage(
    @StringRes titleResource: Int,
    @StringRes subtitleResource: Int,
    @DrawableRes image: Int,
    @StringRes imageDescriptionResource: Int,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = stringResource(imageDescriptionResource),
                modifier = Modifier
                    .weight(3f)
                    .padding(
                        horizontal = 32.dp
                    )
                    .padding(top = 32.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            AtomButton(
                text = "Continue",
                enabled = true,
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(64.dp)
            )
            Spacer(modifier = Modifier.weight(.5f))
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
                image = com.zenith.dev.netnation.R.drawable.netnation_launch_icon_transparant,
                imageDescriptionResource = com.zenith.dev.netnation.R.string.landing_page_icon_desc
            )
        }
    }
}
