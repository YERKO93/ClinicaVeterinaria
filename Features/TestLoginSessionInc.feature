Feature: Test ingresando nombre de usuario y contraseña invalidos
Scenario: Verificacion de inicio de sesion ingresando credenciales
Given Abrir Chrome Login Failed
When Ingresar usr "u" y psw "p" invalidos
Then Inicio sesion incorrecto