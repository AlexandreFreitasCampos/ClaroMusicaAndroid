# Author: Alexandre Freitas
# language: pt
# coding: utf-8

Funcionalidade: Testes exploratórios na aplicação
  Eu como usuário
  Quero efetuar testes exploratórios
  garantir as funcionalidades da aplicação
  E melhorar o tempo de execução

#  Cenario: Validar a tela de permissoes
#    Dado que criei o arquivo "tela_de_permissoes"
#    Quando valido a imagem "logo claro musica1" "Tela de permissões"
#    E valido a imagem "logo claro musica2" "Tela de permissões"
#    E valido o texto "Bem-vindo ao novo Claro música!" "Tela de permissões"
#    E valido o texto "Para melhorar sua experiência, usamos as seguintes funções do seu celular:" "Tela de permissões"
#    E valido a imagem "Ícone de telefone" "Tela de permissões"
#    E valido o texto "Número de telefone:" "Tela de permissões"
#    E valido o texto "Para fazer login, registrar-se de forma manual ou automaticamente, também para fazer compras usando seu número como meio de pagamento." "Tela de permissões"
#    E valido a imagem "Ícone de email" "Tela de permissões"
#    E valido o texto "E-mail:" "Tela de permissões"
#    E valido o texto "Para fazer login ou registrar-se." "Tela de permissões"
#    E valido a imagem "Ícone de informações" "Tela de permissões"
#    E valido o texto "Informações do dispositivo:" "Tela de permissões"
#    E valido o texto "Para melhorar sua experiência analisando dados de uso, erros etc." "Tela de permissões"
#    E valido a imagem "Ícone dados demograficos" "Tela de permissões"
#    E valido o texto "Dados Demográficos:" "Tela de permissões"
#    E valido o texto "Para realizar compras e personalizar sua conta." "Tela de permissões"
#    E valido o texto "Aceitar e continuar" "Tela de permissões"
#    E valido o texto "Recusar permissões e sair" "Tela de permissões"
#    E clico no botao "Aceitar e continuar" "Tela de permissões"
#    Entao salvo o documento
#
#  Cenario: Validar a landing page
#    Dado que criei o arquivo "landing_page"
#    Quando valido a imagem "Logo Claro Musica superior" "Landing Page"
#    E valido a imagem "Ícone de idiomas" "Landing Page"
#    E valido a imagem "Logo Claro Musica central" "Landing Page"
#    E valido o texto "Ouça tudo o que você ama, em um só lugar." "Landing Page"
#    E valido o texto "Mais de 100 milhões de músicas, playlists e recomendações personalizadas." "Landing Page"
#    E valido o texto "Escute grátis" "Landing Page"
#    E valido o texto "Entrar" "Landing Page"
#    E clico no botao "Entrar" "Landing Page"
#    Entao salvo o documento
#
#  Cenario: Efetuar cadastro com MSISDN
#    Dado que criei o arquivo "cadastro_msisdn"
#    Quando valido a imagem "Logo Claro Musica msisdn" "CadastroMSISDN"
#    E valido a imagem "Ícone de idiomas" "CadastroMSISDN"
#    E valido o texto "Entrar com seu número Claro" "CadastroMSISDN"
#    E valido o texto "Seu número Claro" "CadastroMSISDN"
#    E valido o texto "Ou entre com" "CadastroMSISDN"
#    E valido a imagem "Ícone Email" "CadastroMSISDN"
#    E valido a imagem "Ícone Facebook" "CadastroMSISDN"
#    E valido a imagem "Ícone Claro TV" "CadastroMSISDN"
#    E valido o texto "Ao utilizar nossos serviços, você aceita os Termos e Condições e Política de Privacidade" "CadastroMSISDN"
#    E valido a imagem "Botão seguinte" "CadastroMSISDN"
#    E insiro o texto "21966124127" "CadastroMSISDN"
#    E clico no botao "Seguinte" "CadastroMSISDN"
#    Entao salvo o documento

#  Cenario: Pular / Realizar o onboarding
#    Dado que criei o arquivo "onboarding"
#    Quando clico no botao "Pular" "Onboarding"
#    E valido o texto "Vamos começar!" "Onboarding"
#    E valido o texto "Aproveite essas músicas enquanto descobrimos mais sobre você" "Onboarding"
#    E valido a imagem "Botão Tocar agora" "Onboarding"
#    E valido a imagem "Botão Agora não" "Onboarding"
#    E clico no botao "Tocar agora" "Onboarding"
#    E clico no botao "Permitir" "Onboarding"
#    E valido o texto "Bem-vindo! Aproveite grátis" "Onboarding"
#    E clico no botao "Entendido" "Onboarding"
#    Quando valido o texto "Quais artistas você mais gosta?" "Onboarding"
#    E valido o texto "Cliente Claro, temos uma promoção pra você escutar música ilimitada!" "Onboarding"
#    E clico no botao "Fechar oferta grátis" "Onboarding"
#    E clico no botao "Pausar a música" "Onboarding"
#    E valido o carrossel "Últimas escutadas" "Home"
#    Entao clico no botao "Realizar Onboarding" "Onboarding"
#    Quando valido o texto "Escolha pelo menos 3 artistas que você goste" "Onboarding"
#    E valido a imagem "Campo de busca" "Onboarding"
#    E seleciono os 1 primeiros artistas "Onboarding"
#    E valido o texto "Escolha pelo menos mais 2 artistas que você goste" "Onboarding"
#    E seleciono os 2 primeiros artistas "Onboarding"
#    E valido o texto "Escolha pelo menos mais 1 artista" "Onboarding"
#    E seleciono os 3 primeiros artistas "Onboarding"
#    E valido o texto "Fique à vontade para escolher até 10 artistas" "Onboarding"
#    E seleciono os 4 primeiros artistas "Onboarding"
#    E valido o texto "Você pode continuar selecionando até 10 artistas" "Onboarding"
#    Entao seleciono os 10 primeiros artistas "Onboarding"
#    Quando valido o texto "Você já escolheu seus 10 artistas" "Onboarding"
#    E valido a imagem "Botão Pular" "Onboarding"
#    E valido a imagem "Botão Continuar" "Onboarding"
#    Entao clico no botao "Continuar" "Onboarding"
#    Quando valido a imagem "Artistas selecionados" "Onboarding"
#    E valido o texto "Boa escolha!" "Onboarding"
#    E valido o texto "Radio, DJ’s, shows exclusivos e muito mais" "Onboarding"
#    E valido a imagem "Botão Tocar agora" "Onboarding"
#    E valido a imagem "Botão Agora não" "Onboarding"
#    E clico no botao "Agora não" "Onboarding"
#    Entao  salvo o documento

  Cenario: Realizar contratação de plano mensal
    Dado que criei o arquivo "assinatura_mensal"
    Quando clico no botao "Icone de perfil" "Perfil"
    E clico no botao "Planos e assinaturas" "Plano mensal"
    E valido a imagem "Botão Voltar" "Plano mensal"
    E valido o texto "Nossos planos" "Plano mensal"
    E valido a imagem "Logo Claro Música Ilimitado Mensal" "Plano mensal"
    E valido o texto "• 1 mês gratis*" "Plano mensal"
    E valido o texto "• Sem consumo de dados para clientes Claro" "Plano mensal"
    E valido o texto "• Escute sem anúncios" "Plano mensal"
    E valido o texto "• Ouça sua música offline" "Plano mensal"
    E valido o texto "• Cliente Claro com Claro Música ilimitado navegam sem custo" "Plano mensal"
    E valido o texto "R$12,90/mes*" "Plano mensal"
    E valido o texto "Mais informações" "Plano mensal"
    E valido o texto "ESCOLHER ILIMITADO" "Plano mensal"
    E valido o texto "* Promoção disponível para primeira contratação de usuários com plano Claro Pós, Pré, Controle e Flex aplica 1 mês grátis." "Plano mensal"
    Entao clico no botao "ESCOLHER ILIMITADO" "Plano mensal"


    Quando valido a imagem "Botão Voltar" "Plano mensal"
    E valido o texto "Você está prestes a assinar" "Plano mensal"
    E valido a imagem "Logo Claro Música Mensal" "Plano mensal"
    E valido o texto "Preço: R$ 12,90" "Plano mensal"
    E valido o texto "Forma de pagamento: Claro" "Plano mensal"
    E valido o texto "Periodicidade: Mensal" "Plano mensal"
    E valido o texto "Pague com seu número" "Plano mensal"
    E valido a imagem "Claro" "Plano mensal"
    E valido o texto "21966124127" "Plano mensal"
    E valido o texto "Iniciar ilimitado" "Plano mensal"
    E valido o texto "ALTERAR FORMA DE PAGAMENTO" "Plano mensal"

    Entao salvo o documento
