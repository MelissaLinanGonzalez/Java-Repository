### Juego 2048
El juego 2048 consiste en un tablero de 4x4 celdas. Inicialmente aparecen en él dos fichas con el número 2 en posiciones aleatorias.

<table>
    <tr>
        <td></td>
        <td></td>
        <td>2</td>
        <td></td>
    </tr>
    <tr>
        <td>2</td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td>2</td>
    </tr>
    <tr>
        <td></td>
        <td>2</td>
        <td></td>
        <td></td>
    </tr>
</table>

El jugador puede elegir entre 4 movimientos (arriba, abajo, derecha e izquierda). Al mover hacia uno de esos lados, todas las fichas del tablero se desplazarán hacia ese lado, teniendo en cuenta que cuando dos fichas con el mismo número colisionan, ambas se fusionan generando una ficha con la suma de los números de las fichas que han colisionado.

<table>
    <tr>
        <td>
            <table>
    <tr>
        <td>4</td>
        <td>4</td>
        <td>8</td>
        <td>8</td>
    </tr>
    <tr>
        <td></td>
        <td>2</td>
        <td>4</td>
        <td></td>
    </tr>
    <tr>
        <td>2</td>
        <td></td>
        <td>2</td>
        <td>8</td>
    </tr>
    <tr>
        <td></td>
        <td>4</td>
        <td></td>
        <td></td>
    </tr>
</table>
        </td>
        <td>---------></td>
        <td>
            <table>
    <tr>
        <td></td>
        <td></td>
        <td>8</td>
        <td>16</td>
    </tr>
    <tr>
        <td>&nbsp;&nbsp;&nbsp;</td>
        <td>&nbsp;&nbsp;&nbsp;</td>
        <td>2</td>
        <td>&nbsp;4</td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td>4 </td>
        <td>&nbsp;8</td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td>&nbsp;&nbsp;&nbsp;</td>
        <td>&nbsp;4</td>
    </tr>
</table>
        </td>
    </tr>
</table>

Cada vez que se realiza un movimiento se genera en el tablero una nueva ficha en una posición aleatoria que esté libre.

El juego termina cuando no quedan celdas libres y no pueda realizarse ningún movimiento más, o bien cuando el jugador consiga una ficha con el número 2048 (en este casa gana el juego).

---