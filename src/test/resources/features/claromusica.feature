# Author: Alexandre Freitas
# language: pt
# coding: utf-8

Funcionalidade: Testes exploratórios na aplicação
  Eu como usuário
  Quero efetuar testes exploratórios
  garantir as funcionalidades da aplicação
  E melhorar o tempo de execução

  Cenario: Validar a tela de permissoes
    Dado que criei o arquivo "validar_textos_tela_de_permissoes"
    Quando valido a imagem "logo claro musica1" "Tela de permissões"
    E valido a imagem "logo claro musica2" "Tela de permissões"
    E valido o texto "Bem-vindo ao novo Claro música!" "Tela de permissões"
    E valido o texto "Para melhorar sua experiência, usamos as seguintes funções do seu celular:" "Tela de permissões"
    E valido a imagem "Ícone de telefone" "Tela de permissões"
    E valido o texto "Número de telefone:" "Tela de permissões"
    E valido o texto "Para fazer login, registrar-se de forma manual ou automaticamente, também para fazer compras usando seu número como meio de pagamento." "Tela de permissões"
    E valido a imagem "Ícone de email" "Tela de permissões"
    E valido o texto "E-mail:" "Tela de permissões"
    E valido o texto "Para fazer login ou registrar-se." "Tela de permissões"
    E valido a imagem "Ícone de informações" "Tela de permissões"
    E valido o texto "Informações do dispositivo:" "Tela de permissões"
    E valido o texto "Para melhorar sua experiência analisando dados de uso, erros etc." "Tela de permissões"
    E valido a imagem "Ícone dados demograficos" "Tela de permissões"
    E valido o texto "Dados Demográficos:" "Tela de permissões"
    E valido o texto "Para realizar compras e personalizar sua conta." "Tela de permissões"
    E valido o texto "Aceitar e continuar" "Tela de permissões"
    E valido o texto "Recusar permissões e sair" "Tela de permissões"
    E clico no botao "Aceitar e continuar" "Tela de permissões"
    Entao salvo o documento

#  Cenario: Efetuar login com email (Usuario gratis)
#    Dado que criei o arquivo  "login_email_usuario_gratis_cm_web"
#    Quando valido a url "https://www.claromusica.com/landing"
#    E valido a imagem "Ícone de idiomas"
#    E valido a imagem "logoClaroMusica"
#    E valido o texto "Ouça tudo o que você  ama, em um só lugar."
#    E valido o texto "Mais de 100 milhões de músicas, playlists e recomendações personalizadas."
#    E valido o componente "Botão escute grátis"
#    E valido o componente "Botão Entrar"
#    Entao clico no "Botão Entrar"

