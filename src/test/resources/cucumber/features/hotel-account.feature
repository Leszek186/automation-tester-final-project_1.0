#Feature: Hotel Registration Test
#
#  Scenario: użytkownik może zarejestrować się na nowe konto
#
#    Given otworzenie strony hotelu
#    When użytkownik się rejestruje selenium
#    Then Utworzenie konta użytkownika
#     And zamkniecie hotelu
#
#  Scenario Outline: użytkownik może zarejestrować się na nowe konto
#    Given otworzenie strony hotelu
#   When użytkownik się rejestruje <imie> <nazwisko> <email>
#   Then Utworzenie konta użytkownika
#   And zamkniecie hotelu
#
#    Examples:
#     | imie       | nazwisko    | email            |
#     | Ola        | Szczepanska | ola123@wp.pl     |
#     | Leszek     | Leszek      | leszek123@wp.pl  |
#     | Bartek     | Gromadka    | bartek123@wp.pl  |
#     | Michal     | Markiewicz  | michal123@wp.pl  |