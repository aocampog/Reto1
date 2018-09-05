#Author: your.email@your.domain.com
# language:es


@PrimeraHistoria
 Característica: Automatizacion
	Como usuario 
	Quiero ingresar a la pagina Web Automation Demo Site
	A verificar la carga pantalla con texto

Escenario: Verificar tabla de resultado
Dado que Juan necesita crear un empleado en el OrageHR
Cuando el realiza el ingreso del registro en la aplicacion
| primerNombre | segundoNombre | apellido | fechaNacimiento | licenciaConduccion | fechaVencimientoConduccion | usuario | servicioMilitar | hobbies |
| Armando | Elias | Navarro | 1990-09-08 | 18181818E | 2023-08-09 | User123 | SI | Musica |
Entonces el visualiza el nuevo empleado en el aplicativo
| primerNombre | segundoNombre | apellido |
| Armando | Elias | Navarro |

      
