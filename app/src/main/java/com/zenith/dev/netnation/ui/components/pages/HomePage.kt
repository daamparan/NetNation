package com.zenith.dev.netnation.ui.components.pages

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.components.molecules.MoleculeTopAppBar
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun HomePage(
    modifier: Modifier = Modifier,
) {
    Surface {
        MoleculeTopAppBar(
            titleResource = R.string.app_name,
            navigationIcon = Icons.Filled.Menu,
            navigationIconContentDescription = "Search",
            actionIcon = Icons.Filled.Search,
            actionIconContentDescription = "Search"
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomePagePreview() {
    NetNationTheme {
        HomePage()
    }
}