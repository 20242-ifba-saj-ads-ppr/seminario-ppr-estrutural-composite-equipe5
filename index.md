---
export_on_save:
  html: true
---

# Equipe Singleton

## Padrão de Projeto Estrutural Composite 
Intenção :

    permitir a composição de objetos em estruturas de árvores para tratamento de cada estrutura como se fossem objetos individuais.

Motivação:

    Permitir a criação de obejtos complexos a partir de componentes simples. 
    O cliente não precisa fazer a distinção entre objetos primitivos e recipientes pois a composição recursiva o faz.

Aplicabilidade:

    Deve-se utilizar o Composite quando os clientes queiram tratar dos objetos de forma uniforme na estrutura que é composta. Ou quando se queira representar hierarquias parte-todo;

[Markdown]

# Exemplo:
Com Lego Podemos pegar peças simples, como um bloco vermelho ou uma roda, e montá-las para formar algo maior, como um carro de Lego. Esse carro, por sua vez, pode fazer parte de uma estrutura maior, como uma garagem.
O Composite se aplica porque cada estrutura maior também "é um" Lego, assim como as peças individuais. O comportamento de montar e desmontar se propaga recursivamente, garantindo que a ação seja aplicada a toda a estrutura hierárquica."

Participantes:
Lego: Interface;
PecaLego: uma leaf;
EstruturaLego: composite;


[Mermaid Class Diagram](https://mermaid.js.org/syntax/classDiagram.html)


## Markdown Preview Enhanced

[Markdown Preview Enhanced](https://shd101wyy.github.io/markdown-preview-enhanced/#/)




### HTML Export

[html-export](https://shd101wyy.github.io/markdown-preview-enhanced/#/html?id=html-export)


Right click at the preview, click HTML tab.
Then choose:

HTML (offline) Choose this option if you are only going to use this html file locally.
HTML (cdn hosted) Choose this option if you want to deploy your html file remotely.

![screen shot 2017-07-14 at 1 14 28 am](https://user-images.githubusercontent.com/1908863/28200455-d5a12d60-6831-11e7-8572-91d3845ce8cf.png)