## NEM Blockchain Explorer (java)##
The project is a blockchian explorer project which is built on NEM (https://www.nem.io).
### Attention###
1. make sure the NIS is running and update latest height
2. modify the database setting in application.properties and config.properties, especially H2 databases setting
3. before running this application, you should run the poll_data_nodejs first(use nodejs)
4. this program packed with maven: **mvn -Dmaven.test.skip -U clean package**
5. find the explorer\_es\.jar and run: **java -jar explorer_es\.jar**

### include:
1. springboot + mybatis + maven + mysql + h2Database + websocket + logback
2. AngularJS(v1.5.9) + bootstrap + html
