//package log.devdotlog.bookstoreapi.domain.order;
//
//import jakarta.persistence.*;
//import log.devdotlog.bookstoreapi.domain.common.Person;
//import lombok.*;
//
//import java.util.Set;
//
//@NoArgsConstructor
//@Data
//@Entity
//@Table(name = "customer")
//public class Customer extends Person {
//
//    // customer has an account ( to be implemeted )
//
//    @Column(name = "email")
//    private String email;
//
//    @Column(name = "cellphone_number")
//    private String cellphoneNumber;
//
//    @OneToMany(mappedBy = "customer")
//    private Set<Purchase> purchases;
//
//    @OneToMany(mappedBy = "customer")
//    private Set<Address> addresses;
//
//    @Builder(builderMethodName = "customerBuilder")
//    public Customer(Long id, String name, String surname, String email, String cellphoneNumber, Set<Purchase> purchases, Set<Address> addresses) {
//        super(id, name, surname);
//        this.email = email;
//        this.cellphoneNumber = cellphoneNumber;
//        this.purchases = purchases;
//        this.addresses = addresses;
//    }
//}
//
//// TODO: Figure out the order_history along with the order_status
