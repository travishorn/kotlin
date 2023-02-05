import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(startDateTime: LocalDateTime) {
    constructor(startDateTime: LocalDate): this(startDateTime.atStartOfDay())
    val date: LocalDateTime = startDateTime.plusSeconds(1000000000)
}
