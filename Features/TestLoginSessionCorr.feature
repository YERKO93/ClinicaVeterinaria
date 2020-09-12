Feature: Test ingresando nombre de usuario y contraseña validos
Scenario: Verificacion de inicio de sesion ingresando credenciales
Given Abrir Chrome Login Successful
When Ingresar usr "user" y psw "password" validos
Then Inicio sesion satisfactiriamente