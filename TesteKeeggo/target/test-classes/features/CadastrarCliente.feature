#Author: israeljdavila@gmail.com


@Run
Feature: Cadastrar novo usuário
  Eu como usuario quero me cadastrar no site para fazer compras
  
  Background: Acessar o site
    Given que eu esteja no site "http://advantageonlineshopping.com/#/"

  
  Scenario: Cadastrar novo cliente
    And acessar formulario de abertura de conta
    When preencher todos os campos obrigatorios
    Then cliente cadastrado com sucesso
    
