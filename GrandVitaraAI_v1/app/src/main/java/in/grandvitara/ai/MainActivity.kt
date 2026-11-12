package in.grandvitara.ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Background = Color(0xFF07111D)
private val Panel = Color(0xFF122235)
private val Accent = Color(0xFF45C4D6)
private val Muted = Color(0xFF9EB0C3)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { GrandVitaraDashboard() }
    }
}

@Composable
fun GrandVitaraDashboard() {
    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize().background(Background).padding(18.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Column(
                modifier = Modifier.weight(1.25f).fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("GRAND VITARA AI", color = Color.White, fontSize = 25.sp,
                    fontWeight = FontWeight.Bold)
                Text("2024 · SIGMA · SMART HYBRID PETROL",
                    color = Muted, fontSize = 12.sp)
                CardBlock(Modifier.weight(1f)) {
                    Text("VEHICLE DASHBOARD", color = Accent, fontSize = 13.sp)
                    Spacer(Modifier.height(14.dp))
                    Text("-- km/h", color = Color.White, fontSize = 42.sp,
                        fontWeight = FontWeight.Bold)
                    Text("Speed unavailable · connect vehicle data",
                        color = Muted, fontSize = 12.sp)
                    Spacer(Modifier.height(18.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(22.dp)) {
                        Metric("ENGINE RPM", "—")
                        Metric("COOLANT", "—")
                        Metric("FUEL", "—")
                    }
                    Spacer(Modifier.height(14.dp))
                    Text("DEMO / NOT CONNECTED TO VEHICLE",
                        color = Color(0xFFFFC56B), fontSize = 11.sp)
                }
                CardBlock(Modifier.height(78.dp)) {
                    Text("AI ASSISTANT", color = Accent, fontSize = 13.sp)
                    Text("Voice assistant interface · Hindi / English (coming next)",
                        color = Color.White, fontSize = 13.sp)
                }
            }
            Column(
                modifier = Modifier.weight(1f).fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                CardBlock(Modifier.weight(1f)) {
                    Text("QUICK ACCESS", color = Accent, fontSize = 13.sp)
                    Spacer(Modifier.height(12.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Tile("Climate", "Interface only", Modifier.weight(1f))
                        Tile("Vehicle health", "Not connected", Modifier.weight(1f))
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Tile("360° camera", "Launch integration pending", Modifier.weight(1f))
                        Tile("Maps & music", "Android shortcuts pending", Modifier.weight(1f))
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Tile("Mirrors / windows", "Compatibility pending", Modifier.weight(1f))
                        Tile("Door status", "Compatibility pending", Modifier.weight(1f))
                    }
                }
                CardBlock(Modifier.height(94.dp)) {
                    Text("TRIP SUMMARY", color = Accent, fontSize = 13.sp)
                    Text("No trip data yet · OBD-II integration not configured",
                        color = Color.White, fontSize = 12.sp)
                }
            }
        }
    }
}

@Composable
private fun CardBlock(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Surface(modifier = modifier.fillMaxWidth(), color = Panel,
        shape = RoundedCornerShape(18.dp)) {
        Column(Modifier.padding(16.dp), content = content)
    }
}

@Composable
private fun Metric(label: String, value: String) {
    Column {
        Text(label, color = Muted, fontSize = 10.sp)
        Text(value, color = Color.White, fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold)
    }
}

@Composable
private fun Tile(title: String, subtitle: String, modifier: Modifier = Modifier) {
    Surface(modifier = modifier.padding(bottom = 8.dp),
        color = Color(0xFF1A3048), shape = RoundedCornerShape(12.dp)) {
        Column(Modifier.padding(11.dp)) {
            Text(title, color = Color.White, fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp)
            Spacer(Modifier.height(4.dp))
            Text(subtitle, color = Muted, fontSize = 10.sp)
        }
    }
}
