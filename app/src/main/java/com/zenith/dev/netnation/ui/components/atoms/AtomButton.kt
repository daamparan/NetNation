package com.zenith.dev.netnation.ui.components.atoms

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zenith.dev.netnation.ui.theme.NetNationTheme

@Composable
fun AtomButton(
    modifier: Modifier = Modifier,
    text: String = "Click Me!",
    onClick: () -> Unit,
    shape: Shape = MaterialTheme.shapes.extraSmall,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        shape = shape,
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
    NetNationTheme {
        AtomButton(
            onClick = { },
            enabled = true
        )
    }
}