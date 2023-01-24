/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package atm

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ATMShould: StringSpec( {
    "give me now coins when ask for nothing" {
        val atm = ATM()

        atm.withdraw(0) shouldBe emptyList()
    }
})
