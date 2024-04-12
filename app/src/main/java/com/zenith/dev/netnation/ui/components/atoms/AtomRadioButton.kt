package com.zenith.dev.netnation.ui.components.atoms

import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun AtomRadioButton(
    modifier: Modifier = Modifier,
    onToggle: () -> Unit,
    enabled: Boolean = true,
    selected: Boolean = true
    ) {
    RadioButton(
        selected = selected,
        onClick = onToggle,
        enabled = enabled,
        modifier = modifier
    )
}

@Preview
@Composable
fun AtomRadioButtonPreview() {
    NetNationTheme {
        AtomRadioButton(
            onToggle = { },
            enabled = true,
            selected = true
        )
    }
}