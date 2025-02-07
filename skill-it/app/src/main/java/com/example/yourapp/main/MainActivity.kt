class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen { navController.navigate("home") } }
        composable("signup") { SignUpScreen { navController.navigate("home") } }
        composable("home") { HomeScreen(navController) }
    }
}