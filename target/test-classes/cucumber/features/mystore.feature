Feature: zalogowanie uzytkownika i dodanie adresu

  Scenario Outline: tworzenie i weryfikacja adresu uzytkownika
    Given jestem na stronie mystore
    When logowanie uzytkownika
    And wejdzie klikając w kafelek Addresses po zalogowaniu
    And wypelnienie formularza New address <alias> <address> <city> <zip/postal code> <country> <phone>
    Then sprawdzenie poprawnosci danych w adresie
    Examples:
      | alias    | address      |city   | zip/postal code |country  | phone     |
      | Leszek   | mainstreet   |Warsaw | 21-311          |Poland   | 731834556 |

