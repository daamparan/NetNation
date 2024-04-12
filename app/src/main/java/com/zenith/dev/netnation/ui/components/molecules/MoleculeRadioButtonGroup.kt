package com.zenith.dev.netnation.ui.components.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.zenith.dev.netnation.R
import com.zenith.dev.netnation.ui.components.atoms.AtomRadioButton
import com.zenith.dev.netnation.ui.components.atoms.AtomText

@Composable
fun MoleculeRadioButtonGroup(
    modifier: Modifier = Modifier,
    options: List<String>,
    selectedOption: MutableState<String>,
    onToggle: (String) -> Unit

) {
    Column(
        modifier = modifier
    ) {
        options.forEach { text ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (text == selectedOption.value),
                        onClick = { onToggle(text) }
                    )
            ) {
                AtomRadioButton(
                    onToggle = { onToggle(text) },
                    enabled = true,
                    selected = (text == selectedOption.value),
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                )
                AtomText(
                    text = text,
                    size = R.dimen.text_size_xxlarge,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = dimensionResource(id = R.dimen.margin_medium))
                        .align(Alignment.CenterVertically)
                        .fillMaxWidth()
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MoleculeRadioButtonGroupPreview() {
    val options = listOf("Option 1", "Option 2", "Option 3")
    val selectedOption = remember { mutableStateOf(options.first()) }

    MoleculeRadioButtonGroup(
        options = options,
        selectedOption = selectedOption,
        onToggle = { selectedOption.value = it }
    )
}