package log.devdotlog.bookstoreapi.domain;

public enum Status {
    PENDING, FAILED, PROCESSING, CANCELLED,
}
// PENDING      -
// NO PAYMENT
/**
 * Awaiting Payment: (For ATM/iBanking payment options only.) Purchase was made, however the customer has not made the payment and/or submitted their payment details.
 * Unpaid payment status includes orders that are in Authorized, Pending, Expired, and Partially paid payment status
 */
// FAILED       -
// PROCESSING   -
// CANCELLED    -
// REFUNDED     -
// DELIVERED    -

 // TODO: Figure out the order_history along with the order_status