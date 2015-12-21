# distribuicaoprocessos
Porjeto Arquiteto Java

Primeiramente gostaria de me desculpar pelo projeto não estar concluído, mas se quiserem observar como estava sendo feito o mesmo está disponível.


1 - Para executar o projeto:
1.1 - Eclipse Neon + Jboss Tools 4.3.0 Final
1.2 - Wildfly versão 9.x
1.3 - Base Postgresql 9.5 instalado
1.4 - apache maven.

2 - Configurações 
- Criar um banco:
- /* CREATE DATABASE distribuicaoprocesso
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1; */ 
- Usuário postgres Senha: postgres
- O hibernate se encarrega de criar as tabelas quando o war for carregado.
3 - Configurando wildfly 9:
- No endereço : $WILDFLY_HOME/modules/system/layers/base/org
- Crie as pastas "postgresql"/"main" e colocque os arquivos module.xml e postgresqljdbc4.jar disponibilizados
- No endereço : $WILDFLY_HOME/standalone/configuration
- Substitua o arquivo standalone.xml pelo disponibilizado.
- 

4 - Importando o projeto para o eclipse:
  - File - Import - Exsting Maven Project
  - Selecione o diretorio do projeto e Finish
  - Adicionem o Wildfly a Servers para executar caso quera.
  
5 -  Endereços :
- Wildfly : http://wildfly.org/downloads/
- Maven : https://maven.apache.org/download.cgi?Preferred=ftp://mirror.reverse.net/pub/apache/
- Jboss Tools : Tools: http://tools.jboss.org/downloads/jbosstools/mars/4.3.0.Final.html#zips
- Eclipse: http://www.eclipse.org/downloads/index-developer.php
 
6 - Configurar o maven nas variáveis de ambiente do windows.

7 - Executando o .war no wildfly.
7.1 - Va pelo prompt de comando ate o endereço aonde você baixou o projeto e execute o comando mvn clean package
7.2 - o war será gerado na pasta ../target do projeto

8 - iniciando o Wildfly
8.1 - coloque o .war dentro da pasta $WILDFLY_HOME/standalone/deployments
8.1 -pelo prompt de comando $WILDFLY_HOME/bin/standalone.bat





