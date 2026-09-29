<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>ECOGUARD - Resultado</title>
</head>

<body>

    <h1>ECOGUARD</h1>
    <h2>Medición ambiental registrada</h2>

    <p>
        <strong>Temperatura:</strong>
        <%= request.getAttribute("temperatura") %>
    </p>

    <p>
        <strong>Humedad del aire:</strong>
        <%= request.getAttribute("humedadAire") %>
    </p>

    <p>
        <strong>Humedad del suelo:</strong>
        <%= request.getAttribute("humedadSuelo") %>
    </p>

    <p>
        <strong>Nivel de luz:</strong>
        <%= request.getAttribute("nivelLuz") %>
    </p>

    <br>

    <p>
        Los datos fueron recibidos correctamente por el
        <strong>MedicionServlet</strong>.
    </p>

    <br>

    <a href="index_1.html">Registrar otra medición</a>

</body>
</html>
