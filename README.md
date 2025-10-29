Sistema de Integração de Mídias Sociais (Padrão Adapter)
Este projeto é uma implementação do Padrão de Design (Design Pattern) Adapter, como parte do exercício prático de integração de APIs.

1. Objetivo do Projeto
O objetivo principal é criar um sistema unificado para postar conteúdo em múltiplas redes sociais. O sistema foi projetado para uma agência de marketing que precisa gerenciar diferentes plataformas (como Twitter, Instagram, LinkedIn e TikTok) através de uma única interface, mesmo que cada plataforma tenha sua própria API com métodos e assinaturas distintas.

2. O Padrão Adapter
O Padrão Adapter foi utilizado para "traduzir" a interface unificada do nosso sistema (o "Alvo") para as interfaces específicas de cada API (os "Adaptados").

Isso permite que o código cliente (a classe Main) trate todas as publicações da mesma forma, chamando um único método postar(), sem precisar saber os detalhes de como cada API funciona.

Componentes da Estrutura
Alvo (Target): A interface ConectorMidiaSocial. Ela define o método unificado postar(Postagem postagem) que o cliente usa.

Modelo de Dados: A classe Postagem. Ela unifica os dados (texto e URL de mídia) que serão enviados para as diferentes plataformas.

Adaptados (Adaptees): As APIs reais (simuladas) de cada plataforma:

TwitterAPI (com o método tweetar(String texto))

InstagramAPI (com o método publicarFoto(String url, String desc))

LinkedInAPI (com o método submeterPost(String titulo, String corpo))

TikTokAPI (com o método postarVideo(String urlVideo))

Adaptadores (Adapters): As classes que implementam a interface ConectorMidiaSocial e encapsulam uma API específica:

TwitterAdapter

InstagramAdapter

LinkedInAdapter

TiktokAdapter

Cliente (Client): A classe Main, que utiliza os adaptadores através da interface unificada para realizar as postagens.

3. Como Executar
O projeto pode ser compilado e executado diretamente pela classe Main.java.

Compile todos os arquivos .java:

Bash

javac *.java
Execute a classe Main:

Bash

java Main 
O console exibirá a saída de cada API simulada, demonstrando que as postagens foram "enviadas" para cada plataforma.
<img width="911" height="403" alt="{2937951D-9C23-4DC0-9514-774312842ACC}" src="https://github.com/user-attachments/assets/2dd7a623-07e2-4b1f-a4f7-65f51b113190" />
# Adapter
