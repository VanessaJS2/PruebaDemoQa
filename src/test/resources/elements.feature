#language: es

Característica: : yo como usuario de DemoQA
  yo quiero interactuar con los elementos de la página

  @textBox
  Escenario: : Completar campos del formulario
    Dado el usuario entra a la pagina de DemoQA
    Cuando el usuario llena todo el formulario
    Entonces el usuario valida la informacion diligenciada

  @checkBox
  Escenario: : Seleccionar los apartados Note WorkSpace Office Word File
    Dado el usuario entra a la pagina de DemoQA
    Cuando el usuario selecciona las cuatro correspondientes
    Entonces el usuario valida la informacion elegida

  @RadioButtom
  Escenario: : Seleccionar cualquier opcion disponible
    Dado el usuario entra a la pagina de DemoQA
    Cuando el usuario selecciona el primer elemento
    Entonces el usuario valida el elemento seleccionado

  @WebTables
  Escenario: : crear un nuevo registro y validar cada uno de sus campos
    Dado el usuario entra a la pagina de DemoQA
    Cuando  el usuario adiciona un nuevo registro con data correcta
    Entonces el usuario verifica que los detalles del registro sean correctos
    Cuando el usuario hace una modificacion en el nombre
    Entonces el usuario verifica la modificacion realizada
    Cuando el usuario decide eliminar el usuario
    Entonces el usuario verifica que no exista el usuario

  @Buttoms
  Escenario: : Seguir las instrucciones de los botones
    Dado el usuario entra a la pagina de DemoQA
    Cuando el usuario realiza las instrucciones correcta de los botones
    Entonces el usuario valida que las instrucciones se hayan aplicado correctamente

  @links
  Escenario: : Seguir las instrucciones de los botones
    Dado el usuario entra a la pagina de DemoQA
    Cuando el usuario valida los diferentes links
    Entonces el usuario valida las respuestas de los siguientes links

  @form
  Escenario: : Seguir las instrucciones de los botones
    Dado el usuario entra a la pagina de DemoQA
    Cuando el usuario llena el formulario correspondiente
    Entonces el usuario valida el formulario

  @Alerts
  Escenario: : Seguir las instrucciones de los botones
    Dado el usuario entra a la pagina de DemoQA
    Cuando el usuario hace click en los diferentes modales
    Entonces el usuario valida la alerta