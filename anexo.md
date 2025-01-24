# Orientação Objetos
O paradigma de orientação a objetos é um modelo de programação que organiza o software em torno de "objetos", que são instâncias de classes

# Classes
Modelo que define a estrutura e o comportamento de objetos

# Objeto
É uma instância da classe. Representa uma unidade concreta com atributos (dados)e métodos (comportamentos) definidos pela classe

### Podem ser organizados em várias categorias, por exemplo:
- Objetos físicos: Representações digitais de entidades físicas, como impressoras, veículos ou sensores.
- Objetos conceituais: Entidades que representam conceitos abstratos, como contas bancárias, usuários ou pedidos.
- Objetos digitais: Dados e estruturas digitais, como arquivos, documentos ou imagens, que existem apenas no ambiente digital.
- Objetos software: Componentes de um programa, como classes e instâncias, que encapsulam dados e comportamentos específicos.

# Métodos
- De Instância: Associados a objetos. Eles operam sobre os dados (atributos) específicos de uma instância.(da qual está sendo chamado).
- De Classe (métodos Estáticos): São associados à classe em si. Não dependem de dados de instâncias específicas.
- Parâmetros: São as variáveis definidas na assinatura do método.
- Argumentos: São os valores que você passa para essas variáveis quando chama o método

### Sobrecarga
Permite definir múltiplos métodos com o mesmo nome numa classe, desde que tenham assinaturas diferentes.

### Sobrescrita
Permite criar uma versão de um método herdado de uma superclasse com o mesmo nome, tipo de retorno e assinatura do método original

### Construtor
Métodos especiais de uma classe usados para inicializar novos objetos

### Palavra reservada 'super'
Usado numa subclasse para acessar métodos e atributos da sua classe pai.

### Palavra reservada 'this'
É usado numa classe para referir-se ao objeto atual.

# Modificadores de acesso
Definem a visibilidade/acesso de classes, métodos e atributos. Ao sobrescrever um método a visibilidade NÃO PODE SER MAIS RESTRITIVA.
Por exemplo, um método protected na classe pai não pode ser sobrescrito como private na classe filha
- public: Acessível de qualquer lugar.
- protected: Acessível dentro do mesmo pacote e por subclasses em pacotes diferentes.
- default: (sem modificador): Acessível apenas dentro do mesmo pacote.
- private: Acessível apenas dentro da própria classe.

# Interfaces
# Classes Abstratas

# Interfaces X Classes Abstratas
Algumas diferenças...
### Herança
- Interfaces - Uma classe pode implementar várias interfaces ("herança múltipla")
- Classes Abstrata - Uma classe só pode herdar de uma única classe abstrata ("herança simples")

### Métodos
- Interfaces - Pode ter métodos abstratos, métodos 'default' e 'static' (a partir do java 8)
- Pode ter métodos abstratos e métodos concretos. Uma classe que contém pelo menos um método abstrato é considerada classe abstrata

### Atributos
- Interfaces - Podem ter constantes (public static final)
- Classe Abstrata - Podem ter variáveis de instância e constantes

# Boas práticas
Promova a alta coesão e o baixo acoplamento
## Coesão
Refere-se ao grau que os elementos de uma classe (ou modulo) estão relacionados entre si
- Uma classe com alta coesão tem uma responsabilidade única e bem definida

## Acomplamento
É o grau de dependência entre diferentes módulos ou classes de um sistema
- Com baixo acoplamento um componente consegue operar de forma praticamente independente do outro