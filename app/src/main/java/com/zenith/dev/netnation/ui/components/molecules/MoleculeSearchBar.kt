package com.zenith.dev.netnation.ui.components.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.components.atoms.AtomButton
import com.zenith.dev.netnation.ui.components.atoms.AtomInputText
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun MoleculeSearchBar(
    modifier: Modifier = Modifier,
    inputBoxText: String = "Enter text here",
    onValueChange: (String) -> Unit,
    icon: ImageVector? = null,
    label: String? = null,
    onButtonClick: () -> Unit
    ) {
    Row(
       modifier = Modifier
           .height(dimensionResource(id = R.dimen.height_small))
    ) {
        AtomInputText(
            onTextChanged = onValueChange,
            infoText = inputBoxText,
            leadingIcon = {
                icon?.let {
                    Icon(
                        imageVector = it,
                        contentDescription = label ?: "Icon"
                    )
                }
            },
            modifier = Modifier.fillMaxHeight()
        )
        AtomButton(
            text = "Search",
            onClick = onButtonClick,
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.margin_small))
                .fillMaxHeight()
                .fillMaxWidth()

        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MoleculeSearchBarPreview() {
    NetNationTheme {
        MoleculeSearchBar(
            onValueChange = { },
            icon = Icons.Default.Search,
            onButtonClick = { }
        )
    }
}