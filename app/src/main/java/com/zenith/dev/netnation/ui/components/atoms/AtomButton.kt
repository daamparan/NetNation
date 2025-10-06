package com.zenith.dev.netnation.ui.components.atoms

import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun AtomButton(
    modifier: Modifier = Modifier,
    text: String = "Click Me!",
    onClick: () -> Unit,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = Modifier
    ) {
        Text(
            text = text,
        )
    }
}

@Preview
@Composable
fun AtomButtonPreview() {
    NetNationTheme(darkTheme = false) {
        Surface {
            AtomButton(
                onClick = { },
                enabled = true
            )
        }
    }
}