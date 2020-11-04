<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <!--Definicion del contexto, variables que visualiza el navegador-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--LLamando a bootstrap-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!--Invoicacion a ajax para acciones-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <!--JavaScript de control-->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Cliente Inventario</title>
        <?php
        require_once './logic/servicio.php';
        ?>
    </head>
    <body>
        <div class="container">
            <h2 align="center">Prueba de Servicios Web SOAP</h2><br>
            <div class="row">
                <form class="form-online" method="post" name="formcontrol" id="formcontrol">
                    <div class="form-group">
                        <label for="personDoc">Documento Consulta</label>
                        <input type="number" class="form-control" name="personDoc" id="personDoc" placeholder="Ingrese el documento a buscar" required />
                    </div>
                    <div align="center">
                        <?php
                            //! Llamado del método de la clase
                            $classService = new Servicio();
                            $classService->conectedSoap();
                        ?>
                        <button type="submit" name="search" id="search" class="btn btn-primary">Buscar</button>
                    </div>
                </form>
            <br/>
            <h2 align="center">Datos de Cliente buscado</h2>
            <table class="table">
                  <thead>
                      <tr>
                          <th>Nombre y Apellidos</th>
                          <th>Num Documento</th>
                          <th>G&eacute;nero</th>
                          <th>Fecha Nacimiento</th>
                          <th>Tel&eacute;fono</th>
                          <th>Email</th>
                      </tr>
                  </thead>
                  <tbody>
                      <?php if($respuesta){ ?>
                        <tr>
                            <td><?php $respuesta->name; ?></td>
                            <td><?php $respuesta->document; ?></td>
                            <td><?php $respuesta->gender; ?></td>
                            <td><?php $respuesta->birthdate; ?></td>
                            <td><?php $respuesta->contactNumber; ?></td>
                            <td><?php $respuesta->contactEmail; ?></td>
                        </tr>
                      <?php }
                          ?>
                  </tbody>
              </table>
            </div>
        </div>
    </body>
</html>
