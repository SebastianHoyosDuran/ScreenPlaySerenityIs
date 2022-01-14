Feature:  HU-01 Crear una nueva reunion
  Yo como usuario de la pagina Serenity
  Deseo crear una nueva Unidad de Negocio
  Y crear una nueva Reunion con esta Unidad de Negocio

  Background:  Loguearse en Serenity
    Given que me encuentro en la pagina de serenity
    When me loguee en la pagina

  @Scenario1
Scenario Outline:
    When cree una nueva Unidad de Negocio con un <nombreUnidad>
    And programe una nueva reunion con la unidad de negocio con informacion <nombreUnidad> <nombreDeReunion> <tipoDeReunion> <numeroDeReunion> <fechaDeInicio> <fechaDeFin> <horaDeInicio> <horaDeFin>
    Then podre validar que la reunion se creo satisfactoriamente <numeroDeReunion>

    Examples:
      | nombreUnidad      | nombreDeReunion | tipoDeReunion     | numeroDeReunion | fechaDeInicio | fechaDeFin | horaDeInicio | horaDeFin |
      | Unidad de Negocio | Propuesta       | Equipo de TI      | 112             | 20/01/2022    | 20/01/2022 | 10:00        | 12:00     |
      | Unidad de Negocio | Avances         | Equipo Desarrollo | 333             | 22/01/2022    | 22/01/2022 | 14:00        | 15:30     |