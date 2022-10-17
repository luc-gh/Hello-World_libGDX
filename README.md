<h1>Hello-World_libGDX</h1>
<p>Este repositório possui os arquivos para criar um jogo muito básico em Java, para apresentar conceitos, classes e funções usadas pelo framework libGDX.</p>
<p>Os códigos presentes aqui e em outros repositórios <a href="https://github.com/stars/luc-gh/lists/estudo-sobre-o-framework-libgdx"><i>desta lista</i></a>, foram produzidos com base no tutorial da Happy Coding, que você pode acessar <a href="https://happycoding.io/tutorials/libgdx/hello-world"><b>aqui</b></a>.</p>
<h2></h2>
<h3 align="center">Tabela de commits</h3>
<div>
  <table align="center">
    <thead align="center"><th colspan="2">Modificações no arquivo <code>Hello_World_Game.java</code> por commit</th></thead>
    <tr><td><a href="https://github.com/luc-gh/Hello-World_libGDX/blob/685c3ec07d2a894679eb26405e1878d954c1f1dc/core/src/com/libgdx/hello/Hello_World_Game.java">
    <b>Mensagem de texto</b></a></td>
    <td>Upload inicial e do executável 
    (<a href="https://github.com/luc-gh/Hello-World_libGDX/blob/main/desktop/src/com/libgdx/hello/DesktopLauncher.java">DesktopLauncher.java</a>) 
    onde apenas um texto é escrito na tela</td></tr><tr><td>
    <a href="https://github.com/luc-gh/Hello-World_libGDX/blob/71a12616cdf192969795e573a80ee946d175899a/core/src/com/libgdx/hello/Hello_World_Game.java">
    <b>Desenho de um círculo</b></a></td>
    <td>Atualização do arquivo principal para que seja desenhado um círculo na tela</td></tr>
    <tr><td><a href="https://github.com/luc-gh/Hello-World_libGDX/blob/1239bb3790c5b2cb0410cb405694ad3e35d19b44/core/src/com/libgdx/hello/Hello_World_Game.java">
    <b>Animação de um círculo</b></a></td>
    <td>Atualização do arquivo principal para que o círculo desenhado se movimente repetidamente</td></tr>
    <tr><td><a href="https://github.com/luc-gh/Hello-World_libGDX/blob/main/core/src/com/libgdx/hello/Hello_World_Game.java">
    <b>Delta Time</b></a></td>
    <td>Atualização do arquivo principal para que o movimento do círculo esteja compatível com o FPS</td></tr>
  </table>  
</div>

<div>
  <h3>Lógica do projeto</h3>
  <p>LibGDX é um framework de desenvolvimento de jogos que oferece vários recursos úteis (um loop de renderização de 60 fps, animação,
  entrada, física e iluminação, por exemplo) e permite que você implante como um executável em desktops, uma página HTML/JavaScript ou 
  um Aplicativo para Android ou iOS.</p>
  <p>Um projeto libGDX é, na verdade, vários projetos: um projeto principal que contém toda a lógica do seu jogo e, em seguida, 
  projetos específicos de plataforma que apontam para seu projeto principal e podem ser implantados em uma plataforma específica.</p>
  <p>A configuração do espaço de trabalho para desenvolver com libGDX depende da IDE utilizada para programar em Java, da versão do Gerador 
  de projetos libGDX e das configurações do ambiente computacional utilizado, mas as etapas de criação do projetos em si, são:</p>
  <ul>
    <li> Abrir o Gerador;</li>
    <li> Definir o nome do projeto, da classe principal e do pacote;</li>
    <li> Definir o local do projeo no arquivos;</li>
    <li> Definir os projetos secundários (específicos para cada plataforma);</li>
    <li> Escolher as extensões que serão utilizadas;</li>
    <li> Gerar e abrir o projeto no ambiente preferível.</li>
  </ul>
  <p>Tendo o ambiente configurado, é preciso entender que libGDX utiliza funções cíclicas (Lifecycle functions) que são acionadas quando um evento 
  ocorre na execução.</p>
  <p>Para vincular tais funções, a classe principal deve extender <code>[extends]</code> a classe ApplicationAdapter ou implementar 
  <code>[implements]</code> a classe ApplicationListener para sobrescrever (@Override):</p>
  <ul>
    <li><code> create() </code></li>
    <li><code> resize(int width, int height) </code></li>
    <li><code> render() </code></li>
    <li><code> pause() </code></li>
    <li><code> resume() </code></li>
    <li><code> dispose() </code></li>
  </ul>
  <p>Diante disso, a estrutura do projeto é a seguinte:</p>
  <ul>
    <li>
      O projeto principal contém a classe que estende ApplicationAdapter e os projetos específicos da 
      plataforma instanciam essa classe para criar um aplicativo.<br>
      A primeira versão da classe <code>Hello_World_Game.java</code> (Commit 1) utiliza as funções create(), render()e dispose() para
      desenhar uma mensagem de texto simples no meio da tela.<br>
    </li>
    <li>
      LibGDX usa OpenGL para desenhar coisas na tela. Isso permite escrever um código de desenho eficiente.<br>
      Para desenhar figuras simples na tela foram usadas funções da classe <i>ShapeRenderer</i> na segunda versão da classe principal.<br>
      Algo que vale a pena notar é que com OpenGL (e, portanto, em libGDX), o ponto de coordenadas (0,0) está no canto inferior esquerdo da tela.<br>
      Em outras palavras, a parte inferior da tela tem a posição 0 de Y, e a posição Y aumenta à medida que você se aproxima da parte superior da tela.<br>
    </li>
    <li>
      A criação de animações requer três etapas básicas (normalmente):<br>
      <ul>
        <li>
          Armazenar o estado da "tela" em um conjunto de variáveis;
        </li>
        <li>
          Use essas variáveis para desenhar a animação a cada quadro;
        </li>
        <li>
          Atualizar essas variáveis ao longo do tempo para que a animação ocorra.
        </li>
      </ul>
      O commit 3 da classe principal traz um código que mostra um círculo que se move na tela.<br>
      As variáveis <code>circleX</code> e <code>circleY</code> mantém a posição do círculo, e as variáveis <code>xVel</code> e <code>yVel</code> 
      mantêm a velocidade horizontal e 
      vertical do círculo. Na função <code>render()</code>, move-se o círculo de acordo com a velocidade e, em seguida, verificamos se ele está saindo 
      dos limites da tela. Nesse caso, invertemos a velocidade do círculo, o que o faz saltar das bordas da tela.
    </li>
    <li>
      E a quarta versão do código principal consiste numa alteração no código para impedir que o jogo seja executado de forma inconsistente 
      dependendo da taxa de fps do dispositivo em que o jogo está sendo executado.<br>
      Para controlar a velocidade da exucução, libGDX possui a função <code>Gdx.graphics.getDeltaTime()</code>, que retorna quanto tempo se passou desde 
      o último frame (fps) executado.<br>
      Desse modo, ao armazenarmos as velocidades com valores em frames por segundo em vez de valores por frame, podemos multiplicar nossas taxas pelo 
      Delta Time para obter a distância que devemos mover cada frame. 
      Com isso, círculo se moverá na mesma velocidade, não importa qual seja a taxa de fps do dispositivo.
    </li>
  </ul>
</div>
