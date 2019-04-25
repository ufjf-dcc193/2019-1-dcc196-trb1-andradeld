<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>ONG</title>
    </head>
    <body>
        <h1>ONG SpringBoot - Adicionar Atividade</h1>
        <form action="listarAtividades.html" method="post">
            <label>Titulo: <input type="text" name="titulo"/></label><br>
            <label>Descrição: <input type="text" name="descricao"/></label><br>
            <label>Data do início: <input type="text" name="dataInicio"/></label><br>
            <label>Data do fim: <input type="text" name="dataFim"/></label><br>
            <label>Categoria:
                <select type="text" name="categoria">
                    <option value="">Selecione a categoria</option>
                    <option value="assistencial">Assistencial</option>
                    <option value="juridica">Jurídica</option>
                    <option value="financeira ">Financeira </option>
                    <option value="executiva">Executiva</option>
                </select>
            </label><br>
            <label>Horas: <input type="number" name="horas"/></label><br>
            <button type="submit">Criar uma Sede</button>
        </form>
    </body>
</html>