# Robo-em-Java
Projeto de Aula de programação orientada a objetos em Java

1. Classe robô (Robot):
* Implementar a classe RobotXY. O par XY é um número que identifica o aluno que fez a classe.
 Considere um robô que encontra-se em uma sala vazia de dimensões l × c tais que l e c s ̃ao números positivos  ́ımpares.

* Essa classe deve ter o método MOVE, o qual, ao ser chamado, deve retornar UP, DOWN, LEFT, RIGHT ou STOP. Esse retorno significa o movimento que o robô deseja fazer para uma posição vizinha a atual na matriz que representa a sala.

* O robô pode estar no estado STOP ou no estado GO CENTER.

  – No estado GO CENTER, ele realiza movimentos até alcançar o centro da sala. Assim, MOVE retorna um dos valores UP, DOWN, LEFT ou RIGHT. Ao alcançar o centro, ele muda para o estado STOP.

  – No estado STOP, MOVE retorna STOP.
 
* A localização atual do robô  ́e representada por um par (l', c') tal que 1 <= l' <= l e 1 <= c' <= c. O robô tem um GPS, para o qual ele pode perguntar qual a sua localização atual usando os métodos getL e getC. Esse métodos têm como parâmetro um inteiro que representa o id do robô. Assim, o construtor do robô deve receber um id e uma referência para o GPS.
 
* A classe deve ter dois atributos que não são visíveis fora da classe, um guardando o DRE e o outro o nome do aluno que implementou a classe. Também deve ter o método público print, o qual imprime na tela esses dois valores.
 
* Um objeto dessa classe deve ser criado no estado GO CENTER.
