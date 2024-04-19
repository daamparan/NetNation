@file:OptIn(ExperimentalMaterial3Api::class)

package com.zenith.dev.netnation.ui.components.molecules

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.components.atoms.AtomText
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun MoleculeTopAppBar(
    title: String,
    onBackClick: () -> Unit,
    icon: ImageVector? = null,
    label: String? = "",
    buttonTitle: String = "",
    onButtonClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    AtomText(
                        text = title,
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.SemiBold,
                    )
                },
                navigationIcon = {
                    icon?.let {
                        Icon(
                            imageVector = it,
                            contentDescription = label ?: "Icon"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Modifier
            .padding(innerPadding)
    }
}

@Preview(showBackground = true)
@Composable
fun MoleculeTopAppBarPreview() {
    NetNationTheme {
        MoleculeTopAppBar(
            title = "Title",
            onBackClick = {},
            icon = Icons.Default.Search,
            buttonTitle = "Button",
            onButtonClick = {

            }
        )
    }
}