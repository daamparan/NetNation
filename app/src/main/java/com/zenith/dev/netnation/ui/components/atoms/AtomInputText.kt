package com.zenith.dev.netnation.ui.components.atoms

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun AtomInputText(
    modifier: Modifier = Modifier,
    infoText: String = "Search",
    onTextChanged: (String) -> Unit,
    leadingIcon: @Composable (() -> Unit)? = null
    ) {
    TextField(
        value = infoText,
        onValueChange = onTextChanged,
        leadingIcon = leadingIcon,
        modifier = modifier
    )
}

@Preview
@Composable
fun AtomInputTextPreview() {
    NetNationTheme {
        AtomInputText(
            onTextChanged = { },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Icon"
                )
            }
        )
    }
}