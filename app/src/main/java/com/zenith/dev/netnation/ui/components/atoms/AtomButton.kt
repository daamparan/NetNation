package com.zenith.dev.netnation.ui.components.atoms

import android.content.res.Configuration
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
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
        modifier = modifier
    ) {
        Text(
            text = text,
        )
    }
}

@Preview
@Composable
fun AtomButtonPreview() {
    NetNationTheme(darkTheme = true) {
        Surface {
            AtomButton(
                onClick = { },
                enabled = true
            )
        }
    }
}