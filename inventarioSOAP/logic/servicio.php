<?php
// Invocacion de la libreria SOAP
require_once "./lib/nusoap.php";


/* Clase control de logica */
class Servicio{
    /* Método que llama al servicio SOAP */
    public function conectedSoap(){
        //! Validacion de que el dato no sea nulo o vacio
        if (isset($_POST["personDoc"])){
            $respuesta = array();
            //? Creamos variable e invocamos el servicio que tiene los métodos
            $client = new nusoap_client("http://localhost:8081/servicessoap/invetario?wsdl", true);
            //? Obtener el error en caso de no haber comunicacion entre front y servicio
            $errorService = $client->getError();
            if ($errorService){
                echo "Hay problemas con el servicio invocado:".$errorService;
                exit();
            }
            //? Bloque para capturar los errores al momento de traer los datos
            try {
                //? Creamos variable para capturar el dato que llega del formulario
                $documentoBuscado = $_POST["personDoc"];
                //? Arreglo de datos a enviar al servicio
                //* Valor etiqueta SOAPUI => Valor capturado en formulario
                $parametros = array("document" => $documentoBuscado);
                //? Creamos variable que recibe los datos que llegan del Servicio e invoca el método a consultar
                //* clientByDocument es el nombre del método que esta en el servicio
                $respuesta = $client->call("clientByDocument", $parametros);
                //! Validamos si trae datos
                if (!empty($respuesta)){
                    //? Codifica el resultdo en un ejemplo de llave - valor
                    $respuesta = json_decode($respuesta);
                    echo $respuesta;
                }
            } catch (Exception $e) {
                echo "Error al consultar", $e->getMessage();
            }
        }
    }
}

?>
