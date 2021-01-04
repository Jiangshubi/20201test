FROM cpenjdk:8-jre
MAINTAINER Ayuancool <627218109@qq.com>
COPY target/springboot-plugin-1.0.0.jar /app/app.jar

#默认执行
ADD demo-1.0-SNAPSHOT.jar app.jar

#EXPOSE
EXPOSE 8083

# set Time zone
ENV TZ=Asia/Shanghai
RUN set -eux; \
	ln -snf /usr/share/zoneinfo/$TZ /etc/localtime; \
	echo $TZ > /etc/timezone

ENTRYPOINT ["java", "-jar", "/app.jar"]