@Composable
fun SkillSwapScreen() {
    // Simulate a list of users
    val users = listOf("User A", "User B", "User C")

    LazyColumn {
        items(users) { user ->
            Text(text = user, modifier = Modifier.padding(16.dp))
        }
    }
}