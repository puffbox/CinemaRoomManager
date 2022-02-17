fun parseCardNumber(cardNumber: String): Long {
    return if (cardNumber.matches("\\d{4} \\d{4} \\d{4} \\d{4}".toRegex()))
        cardNumber.replace("\\s".toRegex(), "").toLong()
    else
        throw Exception("Please, write correct number of card!")
}