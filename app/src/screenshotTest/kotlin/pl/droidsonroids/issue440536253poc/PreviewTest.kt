package pl.droidsonroids.issue440536253poc


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest

@PreviewTest
@Preview(showBackground = true)
@Composable
@Preview
fun MultipleCombiningDiacritics() {
    Text("a̷̧̩͔͕̻̟̙̬͓̹͕̜͓̫̥̽̈́̇̄͆̒̅̋́̈͋̊̍́̎͊̐̈͛̋͊̍̈̒͝͝ͅͅ")
}