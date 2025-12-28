package com.zenith.dev.netnation.ui.components.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.zenith.dev.netnation.R

@Composable
fun NetNationApp(
    //appState = NetNationAppState,
    modifier: Modifier = Modifier,
) {
    // TODO implement the app remember values that we are using and other DI items

    LandingPage(
        titleResource = R.string.landing_page_title,
        subtitleResource = R.string.landing_page_subtitle,
        image = com.zenith.dev.netnation.R.drawable.netnation_app_icon_translucent,
        imageDescriptionResource = com.zenith.dev.netnation.R.string.landing_page_icon_desc
    )
}

@Composable
internal fun NetNationApp(
    //appState = NetNationAppState,
    showSettingsDialog: Boolean,
    onSettingsDismissed: () -> Unit,
    onTopAppBarActionClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    //  TODO implement navigation and routing

    //  TODO implement settings dialog handling
}