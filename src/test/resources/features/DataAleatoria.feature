Feature: Data aleatoria

  Background: Precondicion
    Given Genero un par de numeros enteros aleatorios positivos

  @regression @smoke
  Scenario: Suma positiva
    When Sumo los valores
    Then Verifico que la suma sea positiva

  @regression
  Scenario: Producto positivo
      When Multipico los valores
      Then Verifico que el producto sea positivo

  @regression
  Scenario: Raiz cuadrada positiva
    When Calculo la raiz cuadrada de ambos
    Then Verifico que el raiz sea positivo

