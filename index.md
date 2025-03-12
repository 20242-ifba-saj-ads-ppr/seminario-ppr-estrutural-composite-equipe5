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

    Classificar biologicamente os seres vivos em uma estrutura hierárquica. Para isso cada nível da hierarquia representa um elemnto individual, espécie por exemplo, ou um grupo que contenha varias espécies, uma filo.
    As classes, Animalia, Chordata, Mamalia... representam, cada uma delas, as folhas (elas são elementos individuais que não contêm outros seres vivos). 
    Já a classe ClassificaçãoSerVivo pode conter tanto indivíduos quanto grupos já estabelecidos, formando um conjunto.

### Diagramas do contexto 
### Plantuml

```plantuml {align="center"}
@startuml
title: Classificação dos Seres Vivos
interface SerVivo {
    +mostrar(): void
}

class ClassificaçãoSerVivo {
    +adicionar(SerVivo): void
    +remover(SerVivo): void
    +mostrar(): void
}

class Reino extends ClassificaçãoSerVivo {
    +mostrar(): void
}
class Filo extends ClassificaçãoSerVivo {
    +mostrar(): void
}
class Classe extends ClassificaçãoSerVivo {
    +mostrar(): void
}
class Ordem extends ClassificaçãoSerVivo {
    +mostrar(): void
}
class Familia extends ClassificaçãoSerVivo {
    +mostrar(): void
}
class Genero extends ClassificaçãoSerVivo {
    +mostrar(): void
}
class Especie extends ClassificaçãoSerVivo {
    +mostrar(): void
}

ClassificaçãoSerVivo <|-- Reino
Reino <|-- Filo
Filo <|-- Classe
Classe <|-- Ordem
Ordem <|-- Familia
Familia <|-- Genero
Genero <|-- Especie
ClassificaçãoSerVivo ..|> SerVivo
@enduml
```

### Mermaid

```mermaid {align="center"}
---
title: Classificação dos Seres Vivos
---
classDiagram
    ClassificaçãoSerVivo <|-- Reino
    Reino <|-- Filo
    Filo <|-- Classe
    Classe <|-- Ordem
    Ordem <|-- Familia
    Familia <|-- Genero
    Genero <|-- Especie
    ClassificaçãoSerVivo ..|> SerVivo

    class SerVivo {
        +mostrar(): void
    }
    class ClassificaçãoSerVivo {
        +adicionar(SerVivo): void
        +remover(SerVivo): void
        +mostrar(): void
    }
    class Reino {
        +mostrar(): void
    }
    class Filo {
        +mostrar(): void
    }
    class Classe {
        +mostrar(): void
    }
    class Ordem {
        +mostrar(): void
    }
    class Familia {
        +mostrar(): void
    }
    class Genero {
        +mostrar(): void
    }
    class Especie {
        +mostrar(): void
    }
```

[Markdown]
### Outro exemplo
### Plantuml

```plantuml {align="center"}
@startuml
title: Animal example
note "From Duck till Zebra" as n1
class Animal{
    +int age
    +String gender
    + boolean isMammal()
    + void mate()
}
'para a heranca ficar para baixo
class Duck extends Animal{
    +String beakColor
    +swim()
    +quack()
}
class Fish{
    -int sizeInFeet
    -canEat()
}
class Zebra{    
    +bool is_wild
    +run()
}

class Duck
note left: can fly\ncan swim\ncan dive\ncan help in debugging

'para a heranca ficar para o lado
Animal <|- Zebra 

'para a heranca ficar para baixo
Animal <|-- Fish 

@enduml
```

### Mermaid

```mermaid {align="center"}
---
title: Animal example
---
classDiagram
    note "From Duck till Zebra"
    Animal <|-- Duck
    note for Duck "can fly\ncan swim\ncan dive\ncan help in debugging"
    Animal <|-- Fish
    Animal <|-- Zebra
    Animal : +int age
    Animal : +String gender
    Animal: +isMammal()
    Animal: +mate()
    class Duck{
        +String beakColor
        +swim()
        +quack()
    }
    class Fish{
        -int sizeInFeet
        -canEat()
    }
    class Zebra{
        +bool is_wild
        +run()
    }

```

[Mermaid Class Diagram](https://mermaid.js.org/syntax/classDiagram.html)


## Markdown Preview Enhanced

[Markdown Preview Enhanced](https://shd101wyy.github.io/markdown-preview-enhanced/#/)


@import "src/Classe.java"

### HTML Export

[html-export](https://shd101wyy.github.io/markdown-preview-enhanced/#/html?id=html-export)


Right click at the preview, click HTML tab.
Then choose:

HTML (offline) Choose this option if you are only going to use this html file locally.
HTML (cdn hosted) Choose this option if you want to deploy your html file remotely.

![screen shot 2017-07-14 at 1 14 28 am](https://user-images.githubusercontent.com/1908863/28200455-d5a12d60-6831-11e7-8572-91d3845ce8cf.png)