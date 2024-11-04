package blog.tsalikis.marketplace.crypto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import blog.tsalikis.marketplace.crypto.design.theme.CryptoMarketplaceTheme
import blog.tsalikis.marketplace.marketplace.ui.marketplace
import blog.tsalikis.marketplace.marketplace.ui.marketplaceDestination
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoMarketplaceTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = marketplaceDestination) {
                    marketplace()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CryptoMarketplaceTheme {
        Greeting("Android")
    }
}