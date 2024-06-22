Feature:  Lectura de Excel

  Background: Precondicion
    Given Leo la lista de productos de Excel

  @regression @smoke
  Scenario: Verificar el elemento 3
    When Obtengo el elemento con index 2
    Then Verifico que el nombre sea "HUEVO" y su precio sea 43.9
  @regression
  Scenario: Verificar el ultimo elemento
    When Obtengo el ultimo elemento
    Then Verifico que el precio sea 6.56 y que NO sea perecible
  @regression
  Scenario: Verificar la longitud de la lista
    When Obtengo la longitud de la lista
    Then Verifico que la longitud de la lista sea 22
  @regression
  Scenario Outline: Verificar varios elementos de la lista
    When Obtengo el elemento con index <index>
    Then Verifico que tenga <nombre>,<precio>,<stock>
    Examples:
      | index | nombre   | precio | stock |
      |   0   |"SALMON"  | 36.06  |   73  |
      |   1   |"JITOMATE"| 35.9   |   97  |
      |   2   |"HUEVO"   | 43.9   |   20  |
      |   3   |"LECHE"   | 30.9   |   96  |


