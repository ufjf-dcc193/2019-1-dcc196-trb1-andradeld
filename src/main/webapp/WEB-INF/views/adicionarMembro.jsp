<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>ONG</title>
    </head>
    <body>
        <h1>ONG SpringBoot - Adicionar Membro</h1>
        <form action="listarMembros.html" method="post">
            <label>Nome: <input type="text" name="nome"/></label><br>
            <label>Função: <input type="text" name="funcao"/></label><br>
            <label>E-mail: <input type="text" name="email"/></label><br>
            <label>Data de entrada: <input type="text" name="dataEntrada"/></label><br>
            <label>Data de saída: <input type="text" name="dataSaida"/></label><br>
            <button type="submit">Criar uma Sede</button>
        </form>
    </body>
</html>