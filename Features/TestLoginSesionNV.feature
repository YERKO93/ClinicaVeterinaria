Feature: Test ingresando nombre de usuario y contraseña vacios
Scenario: Verificacion de inicio de sesion sin credenciales
Given Abrir Chrome Login Data Required
When Ingresar usr "" y psw "" vacios
Then Inicio sesion no valido