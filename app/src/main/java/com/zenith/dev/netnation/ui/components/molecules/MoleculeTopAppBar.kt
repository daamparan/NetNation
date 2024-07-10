@file:OptIn(ExperimentalMaterial3Api::class)

package com.zenith.dev.netnation.ui.components.molecules

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.components.atoms.AtomText
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoleculeTopAppBar(
    modifier: Modifier = Modifier,
    @StringRes titleResource: Int,
    navigationIcon: ImageVector,
    navigationIconContentDescription: String,
    actionIcon: ImageVector,
    actionIconContentDescription: String,
    onNavigationIconClicked: () -> Unit = {},
    onActionIconClicked: () -> Unit = {},
    testTagIdentifier: String = "MoleculeTopAppBar"
) {
    CenterAlignedTopAppBar(
        title = { Text(text = stringResource(id = titleResource)) },
        navigationIcon = {
            IconButton(onClick = { onNavigationIconClicked() }) {
                Icon(
                    imageVector = navigationIcon,
                    contentDescription = navigationIconContentDescription,
                    modifier = Modifier
                        .padding(horizontal = dimensionResource(id = R.dimen.margin_small))
                )
            }
        },
        actions = {
            IconButton(onClick = { onActionIconClicked() }) {
                Icon(
                    imageVector = actionIcon,
                    contentDescription = actionIconContentDescription,
                    modifier = Modifier
                        .padding(horizontal = dimensionResource(id = R.dimen.margin_small))
                )
            }
        },
        modifier = modifier
            .testTag(tag = testTagIdentifier)
    )
}

@Preview(showBackground = true)
@Composable
fun MoleculeTopAppBarPreview() {
    NetNationTheme {
        MoleculeTopAppBar(
            titleResource = R.string.app_name,
            navigationIcon = Icons.Filled.Menu,
            navigationIconContentDescription = "Search",
            actionIcon = Icons.Filled.Search,
            actionIconContentDescription = "Search"
        )
    }
}