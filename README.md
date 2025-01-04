# Padrão Adapter - Exemplo Simples

Este projeto demonstra como implementar o **Padrão Adapter** em um cenário simples para integrar uma biblioteca externa com a estrutura da aplicação. O exemplo consiste em calcular a área de um retângulo usando uma classe da biblioteca externa que não segue o padrão da aplicação.

## Objetivo

Permitir que a aplicação utilize uma interface genérica (`Shape`) para trabalhar com diferentes formas geométricas, encapsulando a implementação de uma biblioteca externa que calcula a área de retângulos de forma distinta.

## Estrutura do Código

1. **Biblioteca Externa Simulada**:
   - Classe `ExternalRectangle` para calcular a área de um retângulo com o método `computeArea()`.

2. **Interface Genérica**:
   - Interface `Shape` define o método `getArea()` para todas as formas geométricas.

3. **Adaptador**:
   - Classe `RectangleAdapter` que implementa a interface `Shape` e adapta a classe `ExternalRectangle`.

4. **Exemplo de Uso**:
   - A classe principal `Main` demonstra como usar o adaptador para calcular a área de um retângulo.

## Como Executar

1. Clone o repositório ou copie os arquivos.
   ```bash
   git clone https://github.com/luizhenrique3651/Adapter-Patern-Example.git
   ```

2. Compile o código:
   ```bash
   javac Main.java RectangleAdapter.java ExternalRectangle.java Shape.java
   ```

3. Execute a aplicação:
   ```bash
   java Main
   ```

## Exemplo de Saída

Ao executar o programa, você verá o seguinte resultado:

```text
Área do retângulo: 50.0
```

## Vantagens do Padrão Adapter

- **Desacoplamento**: Encapsula a implementação da biblioteca externa, permitindo que você troque de biblioteca no futuro sem alterar o código principal.
- **Consistência**: Garante que a aplicação trabalhe com uma interface unificada, simplificando a manutenção.
- **Flexibilidade**: Facilita a integração com bibliotecas ou APIs externas que possuem implementações diferentes.

## Limitações

- Pode aumentar a complexidade do código caso seja usado de forma excessiva ou desnecessária.
- A implementação de adaptadores exige um conhecimento claro da interface e da biblioteca externa.

## Estrutura dos Arquivos

- `ExternalRectangle.java`: Implementa a classe simulada da biblioteca externa.
- `Shape.java`: Define a interface genérica para formas geométricas.
- `RectangleAdapter.java`: Implementa o adaptador que conecta `ExternalRectangle` à interface `Shape`.
- `Main.java`: Contém o ponto de entrada da aplicação e um exemplo de uso.



