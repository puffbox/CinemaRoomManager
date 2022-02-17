package cinema

fun main() {
    // write your code here
    println("Enter the number of rows:")
    val locationCinemaNumberOfRows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val locationCinemaNumberOfSeats = readLine()!!.toInt()

    val cinemaList = MutableList(locationCinemaNumberOfRows) {
        MutableList(locationCinemaNumberOfSeats) { "S" }
    }

    do {
        println("\n1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
        val numberMenu = readLine()!!.toInt()
        when (numberMenu) {
            1 -> locationCinema(cinemaList, locationCinemaNumberOfSeats)
            2 -> calculateTotalIncome(cinemaList, locationCinemaNumberOfRows, locationCinemaNumberOfSeats)
            3 -> statistics(cinemaList, locationCinemaNumberOfRows, locationCinemaNumberOfSeats)
        }
    } while (numberMenu != 0)
}

fun locationCinema(list: MutableList<MutableList<String>>, locationCinemaNumberOfSeats: Int) {
    println("\nCinema:")
    print("  ")
    for (i in 1..locationCinemaNumberOfSeats) {
        print("$i ")
    }
    println()
    for (i in 0 until list.size) {
        println("${i + 1} ${list[i].joinToString(" ")}")
    }
}

fun calculateTotalIncome(list: MutableList<MutableList<String>>,
                         locationCinemaNumberOfRows: Int,
                         locationCinemaNumberOfSeats: Int,
) {
    println("\nEnter a row number:")
    val numberOfRows = readLine()!!.toInt()
    println("Enter a seat number in that row:")
    val numberOfSeats = readLine()!!.toInt()

    try {
        if (list[numberOfRows - 1][numberOfSeats - 1].contains("B")) {
            println("\nThat ticket has already been purchased!")
            return calculateTotalIncome(list, locationCinemaNumberOfRows, locationCinemaNumberOfSeats)
        } else {
            list[numberOfRows - 1].removeAt(numberOfSeats - 1)
            list[numberOfRows - 1].add(numberOfSeats - 1, "B")
            println(
                if (locationCinemaNumberOfRows * locationCinemaNumberOfSeats <= 60 ||
                    numberOfRows <= locationCinemaNumberOfRows / 2
                ) "Ticket price: $10" else "Ticket price: $8"
            )
        }
    } catch (e: Exception) {
        println("\nWrong input!")
        return calculateTotalIncome(list, locationCinemaNumberOfRows, locationCinemaNumberOfSeats)
    }
}

fun statistics(list: MutableList<MutableList<String>>,
               locationCinemaNumberOfRows: Int,
               locationCinemaNumberOfSeats: Int,
) {
    var check = 0

    for (el in list) {
        for (value in el) {
            if (value == "B") check++
        }
    }

    val sum = locationCinemaNumberOfRows * locationCinemaNumberOfSeats
    var current = 0

    if (sum <= 60) {
        for (mutList in list) {
            for (value in mutList) {
                if (value == "B") current += 10
            }
        }
    } else {
        for (mutList in list.subList(0, locationCinemaNumberOfRows / 2)) {
            for (value in mutList) {
                if (value == "B") current += 10
            }
        }
        for (mutList in list.subList(locationCinemaNumberOfRows / 2, locationCinemaNumberOfRows)) {
            for (value in mutList) {
                if (value == "B") current += 8
            }
        }
    }

    println("Number of purchased tickets: $check")
    println("Percentage: ${"%.2f".format(100f / sum * check)}%")
    println("Current income: $$current")
    println("Total income: $${if (sum <= 60) sum * 10 
    else locationCinemaNumberOfRows / 2 * locationCinemaNumberOfSeats * 10 +
            (locationCinemaNumberOfRows - locationCinemaNumberOfRows / 2) * 8 * locationCinemaNumberOfSeats}")
}