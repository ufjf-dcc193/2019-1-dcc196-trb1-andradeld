<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>ONG</title>
    </head>
    <body>
        <h1>ONG SpringBoot - Adicionar Sede</h1>
        <form action="adicionarSede" method="post">
            <label>Nome: <input type="text" name="nome"/></label><br>
            <label>Estado: <input type="text" name="estado"/></label><br>
            <label>Cidade: <input type="text" name="cidade"/></label><br>
            <label>Bairro: <input type="text" name="bairro"/></label><br>
            <label>Telefone: <input type="text" name="telefone"/></label><br>
            <label>Endereço WEB: <input type="text" name="endWEB"/></label><br>
            <button type="submit">Criar uma Sede</button>
        </form>
    </body>
</html>