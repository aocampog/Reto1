#Author: your.email@your.domain.com
# language:es

 Característica: Automatizacion
	Como paciente
	Quiero realizar la solicitud de una cita médica
	A través del sistema de Administración de Hospitales

@Escenario1
Escenario: Realizar el Registro de un Doctor
Dado que Carlos necesita registrar un nuevo doctor
Cuando el realiza el registro del mismo en el aplicativo de Administración de Hospitales
	| registro | nombreCompleto | apellidos | telefono | tipoDeDocumentoDeIdentidad | documentoDeIdentidad |
	| doctor | Sacarias | Casa | 3333333 |Cédula de ciudadanía | 1111113 |
Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente.

@Escenario2
Escenario: Realizar el Registro de un Paciente
Dado que Carlos necesita registrar un nuevo paciente
Cuando el realiza el registro del mismo en el aplicativo de Administración de Hospitales
	| registro | nombreCompleto | apellidos | telefono | tipoDeDocumentoDeIdentidad | documentoDeIdentidad |
	| paciente | Armando | Paredes | 6666666 |Cédula de ciudadanía | 2222224 |
Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente.

@Escenario3
Escenario: Realizar el Agendamiento de una Cita
Dado que Carlos necesita asistir al medico
Cuando el realiza el agendamiento de una Cita
  | diaCita | documentoPaciente | documentoDoctor | observaciones |
	| 12/31/2018 | 2222224 | 1111113 | Se agenda cita urgentemente |
Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente.



      
