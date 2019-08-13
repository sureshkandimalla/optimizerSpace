FROM gigaspaces/xap-enterprise:14.5

ARG XAP_LICENSE=tryme

ARG JAR_FILE_NAME=Casper_rtpnr-gigaspace-pu-*.jar

ARG JAR_FILE_PATH=target/${JAR_FILE_NAME}

COPY ${JAR_FILE_PATH} /opt/gigaspaces/

RUN  chmod 775 /opt/gigaspaces/${JAR_FILE_NAME} 


EXPOSE 4000

#CMD ["-Dspring.profiles.active=test"]

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/"${JAR_FILE_NAME}]
