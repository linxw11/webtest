FROM java
MAINTAINER linxw linxw@corp.21cn.com
#copy files to new images
ADD resin-4.0.55.tar.gz /opt/
COPY target/webtest.war /opt/resin-4.0.55/webapps/
EXPOSE 8080
ENTRYPOINT sh /opt/resin-4.0.55/bin/resin.sh start