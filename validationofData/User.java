package validationofData;

import java.lang.*;

public class User {
      private int id;
      private static int count = 0;
      private String email;
      private String password;

      private User(String email, String password) {
            this.email = email;
            this.password = password;
            this.id = count++;
      }

      public static User create(String email, String password) {
            CheckEmail(email);
            checkPassword(password);
            return new User(email, password);
      }

      private static void CheckEmail(String email) {
            if (email == null || !email.contains("@")) {
                  throw new NonvalidEmailException("email non valide!");
            }
      }

      private static void checkPassword(String password) {
            if (password == null || password.length() < 8) {
                  throw new NonValidePasswordException("password most be at the least 8 characters");
            }
      }
}