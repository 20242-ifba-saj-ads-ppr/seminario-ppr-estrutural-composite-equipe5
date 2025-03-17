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

Contexto:

    Podemos exemplificar a utilização deste padrão estrutural quando o nosso cenário é um computador. Nisso, cada parte microscopica (componentes, subcomponentes) faz parte do todo - a estrutura macro que é o proprio computador. 
    O composite fica explicito quando por exemplo, nós temos um cabinete, que é composto por um HD e uma Placa - Mãe, dentro dela, nos temos a RAM e a CPU. Logo, os objetos folhas são as estruturas micrioscopicas que são finais na estrutura hierarquica do computador.

[Markdown]

### Diagramas do contexto 
## Plantuml

```plantuml {align="center"}
@startuml
title: Exemplo Computador
interface Componente {
    +exibir(): void
}

class Computador {
    +adicionar(Componente): void
    +remover(Componente): void
    +exibir(): void
}

class Gabinete implements Componente {
    +exibir(): void
}
class Hd implements Componente {
    +exibir(): void
}
class PlacaMae implements Componente {
    +exibir(): void
}
class Ram implements Componente {
    +exibir(): void
}
class Cpu implements Componente {
    +exibir(): void
}
class Monitor implements Componente {
    +exibir(): void
}
class Mouse implements Componente {
    +exibir(): void
}
class Teclado implements Componente {
    +exibir(): void
}
class Perifericos implements Componente {
    +exibir(): void
}

Computador o-- Gabinete
Computador o-- Perifericos
Gabinete o-- Hd
Gabinete o-- PlacaMae
PlacaMae o-- Ram
PlacaMae o-- Cpu
Perifericos o-- Monitor
Perifericos o-- Mouse
Perifericos o-- Teclado
@enduml
```

## Mermaid

```mermaid {align="center"}
---
title: Exemplo Computador
---
classDiagram
    Computador o-- Gabinete
    Computador o-- Perifericos
    Gabinete o-- Hd
    Gabinete o-- PlacaMae
    PlacaMae o-- Ram
    PlacaMae o-- Cpu
    Perifericos o-- Monitor
    Perifericos o-- Mouse
    Perifericos o-- Teclado

    class Componente {
        +exibir(): void
    }
    class Computador {
        +adicionar(Componente): void
        +remover(Componente): void
        +exibir(): void
    }
    class Gabinete {
        +exibir(): void
    }
    class Hd {
        +exibir(): void
    }
    class PlacaMae {
        +exibir(): void
    }
    class Ram {
        +exibir(): void
    }
    class Cpu {
        +exibir(): void
    }
    class Monitor {
        +exibir(): void
    }
    class Mouse {
        +exibir(): void
    }
    class Teclado {
        +exibir(): void
    }
    class Perifericos {
        +exibir(): void
    }
```

## Códigos do Contexto

### Interface

@import "./src/ExemploComputador/model/Computador.java"

## Composite Computador

@import "src/ExemploComputador/model/CompositeComputador.java"

### Composites

@import "src/ExemploComputador/model/Gabinete.java"

@import "src/ExemploComputador/model/PlacaMae.java"

@import "src/ExemploComputador/model/Perifericos.java"

### Folhas 

@import "src/ExemploComputador/model/Cpu.java"

@import "src/ExemploComputador/model/Hd.java"

@import "src/ExemploComputador/model/Monitor.java"

@import "src/ExemploComputador/model/Mouse.java"

@import "src/ExemploComputador/model/Ram.java"

@import "src/ExemploComputador/model/Teclado.java"

### Main


@import "src/ExemploComputador/model/Main.java"


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