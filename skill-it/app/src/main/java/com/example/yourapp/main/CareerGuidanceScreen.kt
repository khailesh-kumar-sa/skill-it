@Composable
fun CareerGuidanceScreen() {
    // Simulate an AI-generated test
    val questions = listOf("What are your interests?", "What skills do you have?")
    var currentQuestion by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(questions[currentQuestion])
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { currentQuestion = (currentQuestion + 1) % questions.size }) {
            Text("Next Question")
        }
    }
}