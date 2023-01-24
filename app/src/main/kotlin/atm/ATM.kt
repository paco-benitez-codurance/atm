package atm

class ATM {
    fun withdraw(quantity: Int): List<Money> =
        when (quantity) {
            1 -> listOf(Money.ONE_COIN)
            2 -> listOf(Money.TWO_COIN)
            else -> emptyList()
        }

}
