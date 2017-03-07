Script do Banco "dbagenda" para o projeto # Agenda

-- criando banco de dados dbagenda

create database dbagenda
default character set utf8 -- fotmatação de caracteres especiais, incluindo nossos caracteres latinos
default collate utf8_general_ci; -- collate tambem é para definição de caracteres

Use dbagenda;

CREATE TABLE IF NOT EXISTS `dbagenda`.`contato` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `data_nasc` VARCHAR(10) NOT NULL,
  `email` VARCHAR(30) NOT NULL,
  `telefone_fixo` VARCHAR(255) NOT NULL,
  `telefone_movel` VARCHAR(255) NOT NULL,
  `dt_cadastro` timestamp not null,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB  
DEFAULT CHARACTER SET = utf8; -- configuração de caracteres padrão na tabela
