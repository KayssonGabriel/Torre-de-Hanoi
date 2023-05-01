# Torre de Hanói

Exercício de recursão em Java. Para uma quantidade positiva de discos, [TowerOfHanoi.java](TorreDeHanoiRecursiva/src/util/TowerOfHanoi.java) conta os movimentos necessários para transferir os discos entre três torres. [Program.java](TorreDeHanoiRecursiva/src/application/Program.java) lê a entrada e informa a contagem e o tempo.

## Como executar

Use JDK 17 ou superior. Na raiz, execute no PowerShell:

~~~powershell
$fontes = (Get-ChildItem -LiteralPath TorreDeHanoiRecursiva/src -Recurse -Filter '*.java').FullName
javac -encoding UTF-8 -d out $fontes
java -cp out application.Program
~~~

Digite `3` para obter `7` movimentos. A entrada `0` retorna zero movimentos. Prefira quantidades pequenas, pois o tempo de execução cresce com o número de movimentos de uma solução completa.

[Demonstração em vídeo](https://youtu.be/WrWZXIDYvW4)
