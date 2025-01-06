package com.app.domain;

public class RentalDTO {
//   CREATE TABLE TBL_RENTAL(
//            rental_number NUMBER,
//            user_number NUMBER,
//            book_number NUMBER,
//            rental_date DATE,
//            rental_day NUMBER,
//            CONSTRAINT pk_rental PRIMARY KEY(rental_number),
//            CONSTRAINT fk_user FOREIGN KEY(rental_number) REFERENCES TBL_USER(user_number),
//            CONSTRAINT fk_book FOREIGN KEY(book_number) REFERENCES TBL_BOOK(book_number)
//         );
   
   //필드
   private int rentalNumber;
   private int userNumber;
   private int bookNumber;
   private String rentalDate;
   private int rentalDay;
   
   //getset
   public int getRentalNumber() {
      return rentalNumber;
   }
   public void setRentalNumber(int rentalNumber) {
      this.rentalNumber = rentalNumber;
   }
   public int getUserNumber() {
      return userNumber;
   }
   public void setUserNumber(int userNumber) {
      this.userNumber = userNumber;
   }
   public int getBookNumber() {
      return bookNumber;
   }
   public void setBookNumber(int bookNumber) {
      this.bookNumber = bookNumber;
   }
   public String getRentalDate() {
      return rentalDate;
   }
   public void setRentalDate(String rentalDate) {
      this.rentalDate = rentalDate;
   }
   public int getRentalDay() {
      return rentalDay;
   }
   public void setRentalDay(int rentalDay) {
      this.rentalDay = rentalDay;
   }
   
   //toString
   @Override
   public String toString() {
      return "RentalDTO [rentalNumber=" + rentalNumber + ", userNumber=" + userNumber + ", bookNumber=" + bookNumber
            + ", rentalDate=" + rentalDate + ", rentalDay=" + rentalDay + "]";
   }
   
   
   
   
   
   
}