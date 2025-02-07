@Composable
fun InterviewTrainerScreen() {
    // Simulate a voice-based interview
    val question = "Tell me about yourself."
    var answer by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(question)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = answer,
            onValueChange = { answer = it },
            label = { Text("Your Answer") }
        )
    }
}